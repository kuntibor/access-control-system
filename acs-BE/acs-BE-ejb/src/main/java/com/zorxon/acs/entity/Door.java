package com.zorxon.acs.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "door")
public class Door implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "door_id")
    private String doorId;

    public Door() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDoorId() {
        return doorId;
    }

    public void setDoorId(String doorId) {
        this.doorId = doorId;
    }

}
