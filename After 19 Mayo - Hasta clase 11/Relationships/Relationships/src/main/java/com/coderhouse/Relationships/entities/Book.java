package com.coderhouse.Relationships.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    @Column(unique = true)
    private String code;
    public Book(String description, String code, Member member) {
        this.description = description;
        this.code = code;
        this.member = member;
    }
    public Book(){}

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", code='" + code + '\'' +
                ", member=" + member +
                '}';
    }

    @ManyToOne
    //Si no colocamos el JoinColumn, por default agrega una column member_id
    //@JoinColumn(name = "id_member")
    private Member member;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /*public Member getUser() {
        return member;
    }

    public void setUser(Member member) {
        this.member = member;
    }*/
}
