/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.jobs.entities.concretes;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Emre Yıldırım
 */
@Entity
@Table(name = "users")
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lname;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;
    
    @Transient
    @Column(name="password_again")
    private String password_again;
    
    
    
    
//    @ManyToMany
//    @JoinTable(
//            name = "user_position",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "position_id")
//    )
//    private Set<JobPosition> positions;
//
//    @ManyToMany
//    @JoinTable(
//            name = "user_company",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "company_id")
//    )
//    private Set<Company> companies;

    @OneToMany(mappedBy = "user")
    private Set<UserPositionCompany> userPositionCompanies;
}
