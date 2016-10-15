package com.thing.tomato.thehub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sign_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Button sign_in_move = (Button) findViewById(R.id.button2);
        Button sign_up_button = (Button) findViewById(R.id.button4);
        final EditText username = (EditText) findViewById(R.id.usernameSignUp);
        final EditText password = (EditText) findViewById(R.id.editText);
        final EditText repeatPassword = (EditText) findViewById(R.id.editText2);

        sign_up_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String passwordTxt = password.getText().toString();
                String usernameTxt = username.getText().toString();
                String repeatPassword = username.getText().toString();

                if(!passwordTxt.equals(repeatPassword)){
                    splashChoice.choice = 2;
                    Intent reload = new Intent(getApplicationContext(), splashScreen.class);
                    startActivity(reload);
                    finish();
                }

            }
        });
        sign_in_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                splashChoice.choice = 1;
                Intent moveToSplash = new Intent(getApplicationContext(), splashScreen.class);
                startActivity(moveToSplash);
                finish();
            }
        });
    }

}
