package com.example.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by brindank on 3/28/2017.
 */

@Entity
@Table(name="LOCATION")
public class Location implements Serializable {
    private static final long serialVersionUID = -3009157732242241106L;
    @Id
    @Column(name="LOCATION_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long loc_id;
    @Column(name="STATE")
    private String state;
    @Column(name="COUNTRY")
    private String country;


    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL,targetEntity = Branch.class)
    private List<Branch> branches;



    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }
}
