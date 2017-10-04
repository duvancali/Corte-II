package com.example.duvan.corteii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Segunda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
            }

            public void llamar(View View){
                Intent i=new Intent(this,Registro.class);
                startActivity(i);

            }
}
