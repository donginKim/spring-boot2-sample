package com.amiro.demo.view.domain;

import javax.persistence.*;

/**
 * Created by DinKim on 20. 07. 05
 */
@Entity(name="User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private boolean proceeding;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isProceeding() {
        return proceeding;
    }

    public void setProceeding(boolean proceeding) {
        this.proceeding = proceeding;
    }
}
