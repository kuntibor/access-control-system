package com.zorxon.acs.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
@DiscriminatorValue("U")
public class User extends Member implements Serializable {

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
