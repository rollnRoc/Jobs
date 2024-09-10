/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.jobs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Emre Yıldırım
 */
@Entity
@Table(name="job_seekers")
@Data

public class JobSeeker extends  User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    @Column(name="national_identity")
    private String nationalIdentity;
    
    @Column(name="birth_of_date")
    private String birthOfDate;
}
