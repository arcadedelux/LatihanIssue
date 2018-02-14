/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.latihanissue.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.mycompany.latihanissue.entity.Kelurahan;
/**
 *
 * @author bubun
 */
public interface KelurahanRepository extends CrudRepository<Kelurahan,String>{
     public List<Kelurahan> findAll(); 
    
}
