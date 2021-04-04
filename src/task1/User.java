package task1;

import java.io.*;
import java.util.ArrayList;

public class User {
    private static int id = 0;
    private String name, lastName, role, email;

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

    public static void setId(int id) {
        User.id = id;
    }

    public static int getId() {
        return id;
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

}
