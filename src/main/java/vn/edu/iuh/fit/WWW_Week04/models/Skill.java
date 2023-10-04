package vn.edu.iuh.fit.WWW_Week04.models;


import lombok.Data;

@Data
public class Skill {
    private long id;
    private String skillName;
    private String skillDescription;
    private Short type;
}
