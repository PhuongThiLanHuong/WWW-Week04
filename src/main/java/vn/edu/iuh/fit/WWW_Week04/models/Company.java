package vn.edu.iuh.fit.WWW_Week04.models;


import lombok.Data;



@Data
public class Company {
    private long id;
    private String about;
    private String email;
    private String companyName;
    private String phone;
    private String webUrl;
    private Address address;
}
