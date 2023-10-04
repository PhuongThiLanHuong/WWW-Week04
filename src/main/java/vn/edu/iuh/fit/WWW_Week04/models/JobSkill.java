package vn.edu.iuh.fit.WWW_Week04.models;

import lombok.Data;

@Data
public class JobSkill {
    private String moreInformation;
    private Short skillLevel;
    private Job job;
    private Skill skill;
}
