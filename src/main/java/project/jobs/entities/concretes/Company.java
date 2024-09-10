/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.jobs.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Emre Yıldırım
 */

@Entity
@Table(name="Companies")
@Data
public class Company {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    
    @Column(name="company_name")
    private String companyName;
    
    @OneToMany(mappedBy = "company") 
    @JsonIgnore
    private Set<UserPositionCompany> userPositionCompanies;
    
    //5karakterden az olmamalı
    //boş olmamalı
}
