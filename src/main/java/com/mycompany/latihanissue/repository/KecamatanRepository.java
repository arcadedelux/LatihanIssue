/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.latihanissue.repository;

import com.mycompany.latihanissue.entity.Kecamatan;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author bubun
 */
public interface KecamatanRepository extends CrudRepository<Kecamatan,String>{
     public List<Kecamatan> findAll();
    
}
