package com.example.agenda.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.agenda.R;
import com.example.agenda.model.DAO;
import com.example.agenda.model.Student;

public class FormStudentActivity extends AppCompatActivity {

    private final static String APPBAR_TITLE = "Add new student";

    private final DAO dao = new DAO();
    private EditText edt_name;
    private EditText edt_phone;
    private EditText edt_email;



    private void initializeFields() {
        this.edt_name = findViewById(R.id.activity_form_student_name);
        this.edt_phone = findViewById(R.id.activity_form_student_phone);
        this.edt_email = findViewById(R.id.activity_form_student_email);
    }

    private Student createStudent() {
        String name = this.edt_name.getText().toString();
        String phone = this.edt_phone.getText().toString();
        String email = this.edt_email.getText().toString();

        return new Student(name, phone, email);
    }



    public void onClickSaveStudent(View v) {
        Student student = createStudent();
        dao.insertStudent(student);

        super.finish();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_form_student);
        super.setTitle(this.APPBAR_TITLE);

        this.initializeFields();
    }

}