package com.idn99.project.loginwithpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nama = findViewById(R.id.tv_namaMain);

        nama.setText(Util.getLoggedInUser(getBaseContext()));

        findViewById(R.id.button_logoutMain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Util.clearLoggedInUser(getBaseContext());
                startActivity(new Intent(getBaseContext(), Login.class));
                finish();
            }
        });
    }

}
