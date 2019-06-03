package com.example.a1893681.classactivity;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_submit,btn_exit;
        final EditText edt_email,edt_password,edt_fname,edt_lname;
        btn_submit = findViewById(R.id.btn_submit);
        btn_exit = findViewById(R.id.btn_exit);
        edt_email = findViewById(R.id.edt_email);
        edt_fname = findViewById(R.id.edt_fname);
        edt_lname = findViewById(R.id.edt_lname);
        edt_password = findViewById(R.id.edt_password);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), edt_fname.getText() + "Thank you", Toast.LENGTH_SHORT).show();

                Snackbar snackbar = Snackbar.make(findViewById(R.id.imageView),"Registration Done",Snackbar.LENGTH_LONG).setAction("Clear", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        

                    }
                });

snackbar.show();
            }
        });

        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

    }
}
