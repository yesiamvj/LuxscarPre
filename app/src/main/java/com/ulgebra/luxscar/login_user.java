package com.ulgebra.luxscar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class login_user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);
    }
    public void goToSignUp(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void goToforgotPass(View view){
        Intent intent=new Intent(this,forgotPassStep1.class);
        startActivity(intent);
    }
}
