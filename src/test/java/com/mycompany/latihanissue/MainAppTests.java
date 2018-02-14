/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.latihanissue;

import com.mycompany.latihanissue.MainApp;
import com.mycompany.latihanissue.entity.Kecamatan;
import com.mycompany.latihanissue.entity.Kelurahan;
import com.mycompany.latihanissue.service.WilayahService;
import java.util.List;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author bubun
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MainAppTests extends TestCase{
    
        @Autowired
	private WilayahService wilayahService;
        
        @Test
	public void contextLoads() {
	}
        
        
        @Test
        public void TestKelurahan(){
            List<Kecamatan> listKecamatan = this.wilayahService.findAllKecamatan();
            assertEquals(2, listKecamatan.size());
            List<Kelurahan> listKelurahan = this.wilayahService.findAllKelurahan();
            assertEquals(9, listKelurahan.size());
            
            Kecamatan Sumurbandung = this.wilayahService.findKecamatanByName("Sumurbandung");
            assertNotNull(Sumurbandung);
            assertEquals(4, Sumurbandung.getListKota().size());
    }
}
