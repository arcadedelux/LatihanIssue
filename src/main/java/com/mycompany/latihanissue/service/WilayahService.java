/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.latihanissue.service;

import com.mycompany.latihanissue.repository.KecamatanRepository;
import com.mycompany.latihanissue.repository.KelurahanRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mycompany.latihanissue.entity.Kecamatan;
import com.mycompany.latihanissue.entity.Kelurahan;

/**
 *
 * @author bubun
 */
@Service
@Transactional(readOnly=true)
public class WilayahService {
    @Autowired
    private KelurahanRepository kelurahanRepository;
   
    @Autowired
    private KecamatanRepository kecamatanRepository;
    
    public List<Kecamatan> findAllKecamatan(){
        return this.kecamatanRepository.findAll();
    }
    
    public List<Kelurahan> findAllKelurahan(){
        return this.kelurahanRepository.findAll();
    }
    
    public Kecamatan findKecamatanByName(String nama){
        return this.kecamatanRepository.findOne(nama);
    }
}
