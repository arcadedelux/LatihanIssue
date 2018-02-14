/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.latihanissue.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author bubun
 */
@Entity
@Table(name="master_kelurahan")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Kelurahan {
    @Id
    @GenericGenerator(name="uuid_kotakabupaten",strategy="uuid")
    @GeneratedValue(generator="uuid_kotakabupaten")
    @Column(name="kode_kelurahan",nullable=false,unique=true)
    private String id;
    
    @Column(name="nama_kelurahan",nullable=false,length=50)
    private String nama;
    
    @Column (name="kode_pos",nullable=false,length=5)
    private String pos;
    
    @Column(name="created_date",nullable=false)
    private Timestamp createDate;
    
    @Column(name="created_by",length=20)
    private String createBy;
    
    @ManyToOne
    @JoinColumn(name="kecamatan_id",nullable=false)
    private Kecamatan kecamatan;
}
