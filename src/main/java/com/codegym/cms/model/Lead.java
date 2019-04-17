package com.codegym.cms.model;

import javax.persistence.*;

@Entity
@Table(name = "Leads")
public class Lead {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String phoneNumber;
    private String email;
    private String source;
    private boolean isDeleted;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;

    public Lead() {
    }

    public Lead(String name, String phoneNumber, String email, String source, Status status) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.source = source;
        this.status = status;
        this.isDeleted = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
