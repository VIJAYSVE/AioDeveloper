package com.vijay.aiodeveloper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SignUpActivity extends AppCompatActivity     {
    private Button signup;
    private EditText name , gender, phone, password;
    EditText email;
    RadioGroup radioSexGroup;
    RadioButton radioSexButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);



//        signup = (Button) findViewById(R.id.sign_up_button);
//
//        name = (EditText) findViewById(R.id.name);
//        email = (EditText) findViewById(R.id.email);
//        radioSexGroup = (RadioGroup) findViewById(R.id.radioSex);
//        phone = (EditText) findViewById(R.id.phone);
//        password = (EditText) findViewById(R.id.password);
//
//        signup.setOnClickListener(this);
//
//    }
//
//    @Override
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.sign_up_button:
//                sendData();
//                break;
//        }
//    }
//
//    private void sendData() {
//        int selectedId = radioSexGroup.getCheckedRadioButtonId();
//// find the radiobutton by returned id
//        radioSexButton = (RadioButton) findViewById(selectedId);
//        JsonObject object = new JsonObject();
//        object.addProperty("name", name.getText().toString().trim());
//        object.addProperty("email", email.getText().toString().trim());
//        object.addProperty("gender", radioSexButton.getText().toString());
//        object.addProperty("password", password.getText().toString());
//        object.addProperty("phone", phone.getText().toString());
//
//
//        Log.e("REQUEST",object.toString());
//
//        Ion.with(getApplicationContext())
//                .load("http://dev.appsquadz.com/intern/index.php/sign_up")
//                .setJsonObjectBody(object)
//                .asString()
//                .setCallback(new FutureCallback<String>() {
//            @Override
//            public void onCompleted(Exception e, String result) {
//
//                try {
//                    JSONObject json = new JSONObject(result);
//                    String json_result = json.getString("result");
//                    if (json.optBoolean("isSuccess")){
//
//                        String Register = json.getString("message");
//                        Toast.makeText(getApplicationContext(), Register, Toast.LENGTH_LONG).show();
//                        Intent to_main = new Intent(getApplicationContext(), MainActivity.class); // New intent to MainActivity
//                        startActivity(to_main); // Starts MainActivity
//                        finish();
//
//
//                    } else {
//                        // Result is NOT "OK"
//                        String error = json.getString("message");
//                        Toast.makeText(getApplicationContext(), error, Toast.LENGTH_LONG).show();
//                        finish();
//                    }
//                } catch (JSONException e1){
//
//                    e1.printStackTrace();
//                }
//
//            }
//        });
   }
}
