/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  bubun
 * Created: Feb 12, 2018
 */

CREATE TABLE master_kecamatan(
    kode_kecamatan character varying(255) not null primary key,
    nama_kecamatan character varying(50) not null unique,
    created_date timestamp not null,
    created_by character varying(50)
);
CREATE TABLE master_kelurahan(
  kode_kelurahan CHARACTER VARYING(255) not null UNIQUE  primary key,
  nama_kelurahan CHARACTER VARYING(50) not null,
  kode_pos CHARACTER VARYING(5) NOT null,
  created_date TIMESTAMP not null,
  created_by CHARACTER VARYING(20),
  kecamatan_id CHARACTER VARYING(255) not null REFERENCES master_kecamatan(kode_kecamatan)
);
