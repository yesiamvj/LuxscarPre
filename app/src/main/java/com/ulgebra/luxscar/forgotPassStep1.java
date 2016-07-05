package com.ulgebra.luxscar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class forgotPassStep1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass_step1);
    }
    public void goToLogin(View view){
        Intent intent=new Intent(this,login_user.class);
        startActivity(intent);
    }
    public void ifMailSent(View view){
        Intent intent=new Intent(this,forgotPasswordFinal.class);
        startActivity(intent);
    }
}
