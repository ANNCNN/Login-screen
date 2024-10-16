package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        String profile = getIntent().getStringExtra("profile");
        TextView tvProfile = findViewById(R.id.tvProfile);
        tvProfile.setText(profile);

        Button btnCallMe = findViewById(R.id.btnCallMe);
        btnCallMe.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:02121234567"));
            startActivity(intent);
        });

        Button btnOpenWeb = findViewById(R.id.btnOpenWeb);
        btnOpenWeb.setOnClickListener(view -> {Uri webpage = Uri.parse("https://www.medipol.edu.tr");
            Intent intent =new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(intent);
        });

        Button btnOpenMap = findViewById(R.id.btnOpenMap);
        btnOpenMap.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:0,0?q=41.08781374197936,29.088934131516528(Medipol Üniversitesi)"));
            startActivity(intent);
        } );

        Button btnLogOut= findViewById(R.id.btnLogOut);
        btnLogOut.setOnClickListener(view -> {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        });
    }
}