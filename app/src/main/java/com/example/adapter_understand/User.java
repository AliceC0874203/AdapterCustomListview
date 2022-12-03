package com.example.adapter_understand;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private String program;

    public User(String name, String email, String program) {
        this.name = name;
        this.email = email;
        this.program = program;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getProgram() {
        return program;
    }

    public static List<User> userList = new ArrayList<>();

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}
