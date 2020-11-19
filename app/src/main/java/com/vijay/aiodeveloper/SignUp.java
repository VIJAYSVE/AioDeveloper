package com.vijay.aiodeveloper;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.vijay.aiodeveloper.utils.AppUtils;
import com.vijay.aiodeveloper.utils.Contstans;

public class SignUp extends AppCompatActivity implements View.OnClickListener{
    EditText name,age,email_signup,password_signup,confirmPassword_signup,mobile;
    Button register;
    private Context mctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        mctx=getApplicationContext();
        name= (EditText)findViewById(R.id.name);
        age = (EditText)findViewById(R.id.age);
        email_signup= (EditText)findViewById(R.id.email_signup);
        password_signup = (EditText)findViewById(R.id.password_signup);
        confirmPassword_signup=(EditText)findViewById(R.id.confirmpassword_signup);
        mobile = (EditText)findViewById(R.id.mobile);
        register = (Button)findViewById(R.id.register);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.register:
                doregister();
                break;
        }
    }

    private void doregister(){
        String user=name.getText().toString().trim();
        //String ages=age.getText().toString().trim();
        String email=email_signup.getText().toString().trim();
        String password=password_signup.getText().toString().trim();
        String confirmpassword=confirmPassword_signup.getText().toString().trim();
        String phone=mobile.getText().toString().trim();
        if (name.length()==0) {
            // name.setText("Enter Username");
            name.setError("Enter Username");
        }
        else if (age.length()==0) {
            //age.setText("Enter Username");
            age.setError("Enter Age");
        }
        else if (email.length()==0){
            //email_signup.setText("Enter User Nme");
            email_signup.setError("Enter Email");
        }
        else if (password.length()==0){
            //password_signup.setText("Enter Password");
            password_signup.setError("Enter Password");
        }
        else if(confirmpassword.length()==0){
            //confirmPassword_signup.setText("Enter Password AGAIN");
            confirmPassword_signup.setError("Enter Password Again");
        }
        else if (mobile.length()==0){
            //name.setText("Enter Username");
            mobile.setError("Enter Mobile No.");
        }
        else if (!password.equals(confirmpassword)){
            AppUtils.toast(mctx,"Password and Confirm Password are Not Equal");
        }
        else {
            SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(mctx);
            SharedPreferences.Editor edit=preferences.edit();
            edit.putString(Contstans.KEY_UNM,email);
            edit.putString(Contstans.KEY_PWD,password);
            edit.putString("mob",phone);
            edit.commit();
            finish();
            AppUtils.toast(mctx,"Registered");
//            // fetching details to paste in profile
            Intent intent = new Intent(SignUp.this,LoginActivity.class);
//            intent.putExtra("uname",user);
//            //intent.putExtra("agee",ages);
//            intent.putExtra("user",email);
//           // intent.putExtra("pass",password);
//            //intent.putExtra("cpass",confirmpassword);
//            intent.putExtra("mobile_no",phone);
            startActivity(intent);
        }
    }
}
