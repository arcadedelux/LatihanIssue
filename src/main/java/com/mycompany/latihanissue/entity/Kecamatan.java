/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.latihanissue.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author bubun
 */
@Entity
@Table(name="master_kecamatan")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude="listkota")
public class Kecamatan {
    @Id
    @GenericGenerator(name="uuid_provinsi",strategy="uuid2")
    @Column(name="kode_kecamatan",nullable=false,unique=true)
    private String id;
    @Column(name="nama_kecamatan",nullable=false,length=50)
    private String nama;
    @Column(name="created_date",nullable=false)
    private Timestamp createDate;
    @Column(name="created_by",length=20)
    private String createdBy;
    
    @OneToMany(mappedBy="kecamatan")
    private List<Kelurahan>listKota =new ArrayList<>();
}
