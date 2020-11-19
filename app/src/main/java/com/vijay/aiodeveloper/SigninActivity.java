package com.vijay.aiodeveloper;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import org.json.JSONException;
import org.json.JSONObject;


public class SigninActivity extends AppCompatActivity implements View.OnClickListener {
    final Context context = this;

    String TAG = "Main_Activity";
    TextView next;
    EditText email, password;
    Button button, button1, rateApp;
    private ProgressDialog mProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        email = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);

        button = (Button) findViewById(R.id.email_sign_up_button);
        button.setOnClickListener(this);

        button1 = (Button) findViewById(R.id.email_sign_in_button);
        button1.setOnClickListener(this);

        next = (TextView) findViewById(R.id.textviewforgot);
        next.setOnClickListener(this);

        mProgress=new ProgressDialog(context);
        mProgress.setTitle("Processing");
        mProgress.setMessage("Please Wait");
        mProgress.setCancelable(false);
        mProgress.setIndeterminate(true);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.email_sign_up_button:
                Intent i = new Intent(SigninActivity.this, SignUpActivity.class);
                startActivity(i);
                break;
            case R.id.email_sign_in_button:
                mProgress.show();
                sendData();
                break;
            case R.id.textviewforgot:
                Intent intent = new Intent(SigninActivity.this, ForgetPasswordActivity.class);
                startActivity(intent);
                break;

        }
    }

    private void sendData() {
        JsonObject object = new JsonObject();
        object.addProperty("email", email.getText().toString().trim());
        object.addProperty("password", password.getText().toString());
        Log.e("REQUEST", object.toString());

        Ion.with(getApplicationContext())
                .load("http://dev.appsquadz.com/intern/index.php/login")
                .setJsonObjectBody(object)
                .asString()
                .setCallback(new FutureCallback<String>() {
                    @Override
                    public void onCompleted(Exception e, String result) {

                        try {
                            JSONObject json = new JSONObject(result);
                            String json_result = json.getString("result");
                            if (json.optBoolean("isSuccess")) {
                                mProgress.dismiss();
                                String Register = json.getString("message");
                                Toast.makeText(getApplicationContext(), Register, Toast.LENGTH_LONG).show(); // This will show the user what went wrong with a toast
                                Intent to_main = new Intent(getApplicationContext(), MainActivity.class); // New intent to MainActivity
                                startActivity(to_main); // Starts MainActivity
                                finish();


                            } else {
                                // Result is NOT "OK"
                                mProgress.dismiss();
                                String error = json.getString("message");
                                Toast.makeText(getApplicationContext(), error, Toast.LENGTH_LONG).show();
                                finish();
                            }
                        } catch (JSONException e1) {

                            e1.printStackTrace();
                        }

                    }
                });
    }
}