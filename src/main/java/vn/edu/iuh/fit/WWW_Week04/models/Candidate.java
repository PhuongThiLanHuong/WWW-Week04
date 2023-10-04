package vn.edu.iuh.fit.WWW_Week04.models;

import lombok.Data;

import java.time.LocalTime;

@Data
public class Candidate {
    private long id;

    private LocalTime dob;
    private String email;
    private String fullName;
    private String phone;
    private Address address;

    public Candidate(long id,LocalTime dob, String email, String fullName,String phone,Address address) {
        this.id=id;
        this.dob=dob;
        this.email=email;
        this.fullName=fullName;
        this.phone=phone;
        this.address=address;
    }
}
