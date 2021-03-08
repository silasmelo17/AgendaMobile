package com.example.agenda.model;

import java.util.ArrayList;
import java.util.List;

public class DAO {

    private final static List<Student> students = new ArrayList<>();

    public void insertStudent( Student student ) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return new ArrayList<>(this.students);
    }

}
