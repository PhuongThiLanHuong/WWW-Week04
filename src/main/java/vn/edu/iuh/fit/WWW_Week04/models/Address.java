package vn.edu.iuh.fit.WWW_Week04.models;

import lombok.Data;


@Data
public class Address {
    private long id;
    private String city;
    private Short country;
    private String number;
    private String zipCode;
}
