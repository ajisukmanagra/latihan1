package com.example.latihan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.app.AlertDialog;

public class activity_mainlogin extends AppCompatActivity {
    //deklarasi variabel
    EditText username, password;
    Button btnlogin;
    String usernamekey, passwordkey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainlogin);

        //inisialisasi atau memanggil widget yang digunakan pada mainaktivity

        username = (EditText) findViewById(R.id.edit1);
        password = findViewById(R.id.edit2);
        btnlogin = findViewById(R.id.button);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usernamekey = username.getText().toString();
                passwordkey = password.getText().toString();

                //ini untuk pengecekan jika username dan password sesuai

                if (usernamekey.equals("NURIS") && passwordkey.equals("NURIS")) {

                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "login Sukses",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(activity_mainlogin.this, MainActivityhomepage.class);
                    activity_mainlogin.this.startActivity(intent);
                    finish();

                } else {
                    //jika login gagal
                    AlertDialog.Builder builder = new
                            AlertDialog.Builder(activity_mainlogin.this);
                    builder.setMessage("username dan password anda salah").setNegativeButton("Retry", null).create().show();
                }
            }


        });
    }

}