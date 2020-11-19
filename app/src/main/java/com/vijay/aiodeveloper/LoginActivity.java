package com.vijay.aiodeveloper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.vijay.aiodeveloper.utils.AppUtils;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    Button login,skip;
    EditText email_login,password_login;
    TextView link_signup;
    ImageView viewImage;
    Context mctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login=(Button)findViewById(R.id.login);
        login.setOnClickListener(this);
        email_login=(EditText)findViewById(R.id.email_login);
        password_login=(EditText)findViewById(R.id.password_login);
        link_signup=(TextView)findViewById(R.id.link_signup);
        link_signup.setOnClickListener(this);
        skip=(Button)findViewById(R.id.skip);
        skip.setOnClickListener(this);
        mctx=getApplicationContext();

//        viewImage=(ImageView)findViewById(R.id.viewImage);
//        viewImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
//            case R.id.viewImage:
//                selectImage();
//                break;
            case R.id.login:
                dologin();
                break;
            case R.id.link_signup:
                Intent intent = new Intent(this, SignUp.class);
                //i.putExtra("Name", str);
                startActivity(intent);
                break;
            case R.id.skip:
                Intent skip = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(skip);
                break;
        }
    }

    private void dologin() {
        String email = email_login.getText().toString().trim();
        String password = password_login.getText().toString().trim();
        if (email.length() == 0) {
            // AppUtils.toast(mctx,"Enter Username");
            email_login.setError("Enter User Name");

        } else if (password.length() == 0) {
            //AppUtils.toast(mctx,"Enter Password");
            password_login.setError("Enter Password");
        } else {
            int res = AppUtils.checkLogin(mctx, email, password);
            if (res == 0) {
                AppUtils.toast(mctx, "Please Register First");
            } else if (res == 1) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                //intent.putExtra("user",email);
                startActivity(intent);
                AppUtils.toast(mctx, "Login Successful");
            } else if (res == 2) {
                AppUtils.toast(mctx, "Please Enter Valid Details");
            }
        }
    }


//    private void selectImage() {
//
//        final CharSequence[] options = { "Take Photo", "Choose from Gallery","Cancel" };
//
//        AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
//        builder.setTitle("Add Photo!");
//        builder.setItems(options, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int item) {
//                if (options[item].equals("Take Photo"))
//                {
//                    Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                    File f = new File(android.os.Environment.getExternalStorageDirectory(), "temp.jpg");
//                    intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(f));
//                    startActivityForResult(intent, 1);
//                }
//                else if (options[item].equals("Choose from Gallery"))
//                {
//                    Intent intent = new   Intent(Intent.ACTION_PICK,android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//                    startActivityForResult(intent, 2);
//
//                }
//                else if (options[item].equals("Cancel")) {
//                    dialog.dismiss();
//                }
//            }
//        });
//        builder.show();
//    }
//
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (resultCode == RESULT_OK) {
//            if (requestCode == 1) {
//                File f = new File(Environment.getExternalStorageDirectory().toString());
//                for (File temp : f.listFiles()) {
//                    if (temp.getName().equals("temp.jpg")) {
//                        f = temp;
//                        break;
//                    }
//                }
//                try {
//                    Bitmap bitmap;
//                    BitmapFactory.Options bitmapOptions = new BitmapFactory.Options();
//
//                    bitmap = BitmapFactory.decodeFile(f.getAbsolutePath(),
//                            bitmapOptions);
//
//                    viewImage.setImageBitmap(bitmap);
//
//                    String path = android.os.Environment
//                            .getExternalStorageDirectory()
//                            + File.separator
//                            + "Phoenix" + File.separator + "default";
//                    f.delete();
//                    OutputStream outFile = null;
//                    File file = new File(path, String.valueOf(System.currentTimeMillis()) + ".jpg");
//                    try {
//                        outFile = new FileOutputStream(file);
//                        bitmap.compress(Bitmap.CompressFormat.JPEG, 85, outFile);
//                        outFile.flush();
//                        outFile.close();
//                    } catch (FileNotFoundException e) {
//                        e.printStackTrace();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            } else if (requestCode == 2) {
//
//                Uri selectedImage = data.getData();
//                String[] filePath = { MediaStore.Images.Media.DATA };
//                Cursor c = getContentResolver().query(selectedImage,filePath, null, null, null);
//                c.moveToFirst();
//                int columnIndex = c.getColumnIndex(filePath[0]);
//                String picturePath = c.getString(columnIndex);
//                c.close();
//                Bitmap thumbnail = (BitmapFactory.decodeFile(picturePath));
//                // Log.w("path of image from gallery......******************.........", picturePath+"");
//                viewImage.setImageBitmap(thumbnail);
//            }
//        }
//
//    }

}

