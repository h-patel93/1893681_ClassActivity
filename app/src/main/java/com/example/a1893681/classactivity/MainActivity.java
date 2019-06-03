package com.example.a1893681.classactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_submit,btn_exit;
        EditText edt_email,edt_password,edt_fname,edt_lname;
        btn_submit = findViewById(R.id.btn_submit);
        btn_exit = findViewById(R.id.btn_exit);
        edt_email = findViewById(R.id.edt_email);
        edt_fname = findViewById(R.id.edt_fname);
    }
}
