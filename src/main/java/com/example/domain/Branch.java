package com.example.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by brindank on 3/28/2017.
 */

@Entity
@Table(name="BRANCH")
public class Branch  implements Serializable{

    private static final long serialVersionUID = -3009157732242241106L;
    @Id
    @Column(name="BRANCH_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long branch_id;
    @Column(name="FOUNDED_AT")
    private String foundedDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "LOCATION_ID")
    private Location location;



    public Long getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(Long branch_id) {
        this.branch_id = branch_id;
    }

    public String getFoundedDate() {
        return foundedDate;
    }

    public void setFoundedDate(String foundedDate) {
        this.foundedDate = foundedDate;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
