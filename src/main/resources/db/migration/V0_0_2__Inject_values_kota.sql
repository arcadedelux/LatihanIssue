/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  bubun
 * Created: Feb 12, 2018
 */

INSERT INTO master_kecamatan
(kode_kecamatan, nama_kecamatan, created_date, created_by)
VALUES
  ('001', 'Sukajadi', now(), 'migration'),
  ('002', 'Sumurbandung', now(), 'migration');

INSERT INTO master_keluran 
(kode_kelurahan, nama_kelurahan, kode_pos, created_date, created_by, kecamatan_id)
VALUES
('001', 'Cipedes', '40162', now(), 'migration', '001'),
('002', 'Pasteur', '40161', now(), 'migration', '001'),
('003', 'Sukabungah','40162', now(), 'migration', '001'),
('004', 'Sukawarna', '40164',now(), 'migration', '001'),
('005', 'Sukabgalih', '40163',now(), 'migration', '001'),
('006', 'Babakanciamis','40117', now(), 'migration', '002'),
('007', 'Braga','40111', now(), 'migration', '002'),
('008', 'Kebonpisang','40112', now(), 'migration', '002'),
('009', 'Merdeka','40113', now(), 'migration', '002');