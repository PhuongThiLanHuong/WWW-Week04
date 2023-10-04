package vn.edu.iuh.fit.WWW_Week04.models;

import lombok.Data;



@Data
public class Job {
    private long id;
    private String jobDescription;
    private String jobName;
    private Company company;
}
