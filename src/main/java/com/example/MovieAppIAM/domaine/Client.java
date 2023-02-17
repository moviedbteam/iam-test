package com.example.MovieAppIAM.domaine;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client {
    @Id
    @Column(unique = true)
    private String email;

    private String name;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;

    public Client(String email, String name, List<Role> roles) {
        this.email = email;
        this.name = name;
        this.roles = roles;
    }

    public Client() {

    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
