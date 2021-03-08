package com.example.agenda.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.agenda.R;
import com.example.agenda.model.DAO;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainActivity extends AppCompatActivity {

    private final static String MAIN_APPBAR_TITLE = "List of students";

    private final DAO dao = new DAO();

    private ListView students;
    private FloatingActionButton btn_open_form;



    private void initializeFields() {
        this.students = findViewById(R.id.activity_main_students);
        this.btn_open_form = findViewById(R.id.activity_main_add_student);
    }

    public void onClickOpenFormStudent(View v) {
        super.startActivity( new Intent(
            this,
            FormStudentActivity.class
        ));
    }



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        super.setTitle(MAIN_APPBAR_TITLE);

        this.initializeFields();
        this.btn_open_form.bringToFront();
    }

    @Override
    protected void onResume() {
        super.onResume();

        this.students.setAdapter( new ArrayAdapter<>(
            this,
            android.R.layout.simple_list_item_1,
            this.dao.getStudents()
        ));
    }

}
