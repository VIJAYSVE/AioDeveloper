package com.vijay.aiodeveloper;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import org.json.JSONException;
import org.json.JSONObject;

public class ForgetPasswordActivity extends AppCompatActivity implements View.OnClickListener{
    EditText forgotemail;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        forgotemail = (EditText) findViewById(R.id.forgotemail);


        button = (Button) findViewById(R.id.forgotbutton);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.forgotbutton:
                forgotdata();
                break;


        }
    }

    private void forgotdata() {
        JsonObject object = new JsonObject();
        object.addProperty("email", forgotemail.getText().toString().trim());
        Log.e("REQUEST",object.toString());

        Ion.with(getApplicationContext())
                .load("http://dev.appsquadz.com/intern/index.php/forget_password")
                .setJsonObjectBody(object)
                .asString()
                .setCallback(new FutureCallback<String>() {
                    @Override
                    public void onCompleted(Exception e, String result) {

                        try {
                            JSONObject json = new JSONObject(result);
                            String json_result = json.getString("result");
                            if (json.optBoolean("isSuccess")){
                                String Register = json.getString("message");
                                Toast.makeText(getApplicationContext(), Register, Toast.LENGTH_LONG).show();
                                finish();


                            } else {

                                String error = json.getString("message");
                                Toast.makeText(getApplicationContext(), error, Toast.LENGTH_LONG).show();
                                finish();
                            }
                        } catch (JSONException e1){

                            e1.printStackTrace();
                        }

                    }
                });
    }
}