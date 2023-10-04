package vn.edu.iuh.fit.WWW_Week04.models;

import lombok.Data;

@Data
public class CandidateSkill {
    private long id;
    private Short skillLevel;
    private String moreInfomation;
    private Candidate candidate;
    private Skill skill;
}
