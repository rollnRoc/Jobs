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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

/**
 *
 * @author Emre Yıldırım
 */
@Entity
@Table(name="user_position_company")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPositionCompany {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id")
        private long id;
        
        @ManyToOne
        @JoinColumn(name="user_id")
        private User user;
        
        @ManyToOne
        @JoinColumn(name="position_id")
        private JobPosition position;
        
        @ManyToOne
        @JoinColumn(name="company_id")
        private Company company;
        
    
}
