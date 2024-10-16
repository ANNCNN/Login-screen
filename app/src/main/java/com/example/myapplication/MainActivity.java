package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(view -> {

            EditText etPin = findViewById(R.id.etPin);
            if (etPin.getText().toString().equals("123")){
                Toast.makeText(MainActivity.this, "Giriş Başarılı", Toast.LENGTH_SHORT).show();
                btnLogin.setVisibility(View.GONE);

                Intent intent=new Intent (this, ProfileActivity.class);
                intent.putExtra("profile" , "staff");
                startActivity(intent);

                finish();

            }else if(etPin.getText().toString().equals("456")){
                Toast.makeText(MainActivity.this, "Giriş Başarılı", Toast.LENGTH_SHORT).show();
                btnLogin.setVisibility(View.GONE);

                Intent intent=new Intent (this, ProfileActivity.class);
                intent.putExtra("profile" , "manager");
                startActivity(intent);
                finish();



            }else {
                Toast.makeText(MainActivity.this, "Pin Kodunuz Hatalı", Toast.LENGTH_SHORT).show();
            }

        });
    }
}