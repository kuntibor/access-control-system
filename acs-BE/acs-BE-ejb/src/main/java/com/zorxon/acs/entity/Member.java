package com.zorxon.acs.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "member")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("M")
@NamedQueries({
        @NamedQuery(name = "Member.findByAcessCard",
                query = "SELECT m FROM Member m INNER JOIN m.accessCard ac " +
                        "INNER JOIN ac.roles r INNER JOIN r.doors d " +
                        "WHERE ac.cardId = :cardId AND d.doorId = :doorId")})
public class Member implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "access_card_id")
    private AccessCard accessCard;

    public Member() {
    }

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

    public AccessCard getAccessCard() {
        return accessCard;
    }

    public void setAccessCard(AccessCard accessCard) {
        this.accessCard = accessCard;
    }

}
