package com.example.agenda.model;

import androidx.annotation.NonNull;

public class Student {

    private String name;
    private String phone;
    private String email;



    public Student(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @NonNull
    @Override
    public String toString() {
        return this.name;
    }

}
