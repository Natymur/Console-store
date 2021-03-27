package task1;

import java.io.*;
import java.util.ArrayList;

public class User {
    private int id = 0;
    private String name, lastName, role, email;
    private boolean userLogged = false;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId (int id) {
        this.id = id;
    }

}
