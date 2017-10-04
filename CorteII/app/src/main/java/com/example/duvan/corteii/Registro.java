package com.example.duvan.corteii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.firebase.auth.FirebaseAuth;


public class Registro extends AppCompatActivity implements View.OnClickListener {
    Button btnregistrarM;
    private LoginButton loginButton;
    private CallbackManager callbackManager;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        btnregistrarM = (Button) findViewById(R.id.registrarseM);
        btnregistrarM.setOnClickListener(this);

        callbackManager = CallbackManager.Factory.create();
        loginButton = (LoginButton) findViewById(R.id.login_button);


        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {

            /**
             * Called when the dialog completes without error
             *
             * @param loginResult Result from the dialog
             */
            @Override
            public void onSuccess(LoginResult loginResult) {

            }

            /**
             * Called when the dialog is canceled
             */
            @Override
            public void onCancel() {

            }

            /**
             * Called when the dialog finishes with an error
             *
             * @param error The error that occurred
             */
            @Override
            public void onError(FacebookException error) {

            }
        });

    }


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.registrarseM:
                Intent intent = new Intent(Registro.this, Segunda.class);
                startActivity(intent);
                break;
        }
    }
    public void fecha5(View View){
        Intent i=new Intent(this,fecha.class);
        startActivity(i);
    }
}

