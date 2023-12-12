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