/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.jobs.entities.concretes;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Emre Yıldırım
 */
@Entity
@Table(name = "employers")
@Data
public class Employer extends User {

    
    
        

    @Column(name = "website")
    private String website;

    @Column(name = "phone_number")
    private String phoneNumber;

//    @ManyToMany
//    @JoinTable(
//            name = "job_positions",
//            joinColumns = @JoinColumn(name="id"),
//            inverseJoinColumns = @JoinColumn(name="position_id")
//    )
//    private Set<JobPosition> positions;
//    
//    
//    @ManyToMany
//    @JoinTable(
//            name = "Companies",
//            joinColumns = @JoinColumn(name = "id"),
//            inverseJoinColumns = @JoinColumn(name = "company_id")
//    )
//    private Set<Company> allCompanies;
 
}
