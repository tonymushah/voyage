/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Kevin
 * Created: 12 déc. 2023
 */

CREATE DATABASE voyage;
\c voyage;

CREATE TABLE activite (
    id SERIAL PRIMARY KEY,
    nom VARCHAR(256)
);

CREATE TABLE bouquet (
    id SERIAL PRIMARY KEY,
    nom VARCHAR(256)
);

CREATE TABLE rel_act_bouquet (
    id SERIAL PRIMARY KEY,
    idActivite INT REFERENCES activite(id),
    idBouquet INT REFERENCES bouquet(id)
);

-- Generated by ChatGPT 
-- Insertion de données dans la table activite
INSERT INTO activite (nom) VALUES
    ('Activité 1'),
    ('Activité 2'),
    ('Activité 3');

-- Insertion de données dans la table bouquet
INSERT INTO bouquet (nom) VALUES
    ('Bouquet A'),
    ('Bouquet B'),
    ('Bouquet C');

-- Insertion de données dans la table rel_act_bouquet pour créer des relations entre activite et bouquet
INSERT INTO rel_act_bouquet (idActivite, idBouquet) VALUES
    (1, 1), -- Associe l'Activité 1 au Bouquet A
    (1, 2), -- Associe l'Activité 1 au Bouquet B
    (2, 2), -- Associe l'Activité 2 au Bouquet B
    (3, 3); -- Associe l'Activité 3 au Bouquet C

CREATE OR REPLACE VIEW v_act_rel_bouquet AS
SELECT rab.id as rel_id, a.id as act_id, a.nom as act_nom, b.id as bouq_id, b.nom as bouq_nom  FROM rel_act_bouquet rab 
JOIN activite a ON rab.idActivite = a.id 
JOIN bouquet b ON rab.idBouquet = b.id; 

-- Bouquet a partir ny act_id
SELECT bouq_id as id, bouq_nom as nom FROM v_act_rel_bouquet
WHERE act_id = 1;

-- Get act a paritr de bouq_id
SELECT act_id as id, act_nom as nom FROM v_act_rel_bouquet
WHERE bouq_id = 1;