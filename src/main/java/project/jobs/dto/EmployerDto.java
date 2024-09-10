package project.jobs.dto;

import java.util.Set;
import lombok.Data;


@Data
public class EmployerDto {
    private long id;
    private String website;
    private String phoneNumber;
    private long userId;
    private String email;
    private String name;
    private String lname;
    private String password;
    private String password_again;
    private Set<UserPositionCompanyDto> userPositionCompanys;

    // Getters and Setters
}
