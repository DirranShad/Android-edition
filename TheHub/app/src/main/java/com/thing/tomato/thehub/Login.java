package com.thing.tomato.thehub;

import android.content.Intent;
import android.os.Build;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //test login CRED's

        final String mockUsername = "hubDem";

        Button move_to_sign_up = (Button) findViewById(R.id.button2);

        final String password1 = "123demo";

        //Initialize id's, components, etc...
        final EditText password = (EditText) findViewById(R.id.password);

        final EditText username = (EditText) findViewById(R.id.username);

        Button submit = (Button) findViewById(R.id.login);


        //Attain text form variables
        //Check Database and add loading screen through Thread method
        submit. setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                final String passwordTXT = password.getText().toString();
                final String usernameTXT = username.getText().toString();

                if (usernameTXT.equals(mockUsername) && passwordTXT.equals(password1)) {
                        splashChoice.choice = 1;
                        Intent movePage = new Intent(getApplicationContext(), splashScreen.class);
                        startActivity(movePage);
                        finish();
                }else{
                    String msgText = globalStrings.errText;
                    Intent movePageLoad = new Intent(getApplicationContext(), splashScreen.class);
                    startActivity(movePageLoad);
                    finish();
                }
            }
        });
        move_to_sign_up.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                splashChoice.choice = 2;
                Intent moveTosplashScreen = new Intent(getApplicationContext(), (splashScreen.class));
                startActivity(moveTosplashScreen);
            }
        });
    }
}
