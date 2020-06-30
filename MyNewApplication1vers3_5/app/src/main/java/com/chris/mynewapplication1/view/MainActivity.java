package com.chris.mynewapplication1.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.chris.mynewapplication1.R;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.chris.mynewapplication1.R;

public class MainActivity extends AppCompatActivity {

    Button boutonLogin;
    TextView textlogin;
    TextView editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // la vue activity_main.xml
        setContentView(R.layout.activity_main);
        init();
        initBoutonListener();
    }

    private void init() {
        this.boutonLogin = findViewById(R.id.boutonLogin);
        this.textlogin = findViewById(R.id.textlogin);
        this.editTextPassword = findViewById(R.id.editTextPassword);
    }

    private void initBoutonListener() {
        boutonLogin.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d("Message","clic de connexion User");
            }
        });
    }

}
