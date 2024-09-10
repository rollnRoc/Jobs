package project.jobs.dto;

import lombok.Data;

@Data
public class UserPositionCompanyDto {
    private long id;
    private long companyId;
    private String companyName;
    private long positionId;
    private String positionName;

    // Getters and Setters
}
