package com.vijay.aiodeveloper.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.vijay.aiodeveloper.R;
import com.vijay.aiodeveloper.webviews.JavaWebViewActivity;

public class JavaListActivity extends AppCompatActivity {
    String[] JavaArray={
            "Hello World example", "Armstrong Numbers", "Compare two numbers", "Find even or odd",
            "Find Largest and smallest number", "Fahrenheit to celsius", "Prime Numbers", "Palindrome", "Harmonic Series", "Fibonacci Series",
            "Reverse a given number", "Swap Values", "Break statement", "Continue statement", "Create New Thread Using Runnable Example",
            "Convert given no. of days into months and days","Inheritence Example", "Method and Constructor Overloading", "Java Sort",
            "Patterns", "Java exception handling", "Linear and Binary Search","Hello World Applet Example", "JDBC Example", "RMI"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

            ArrayAdapter adapter=new ArrayAdapter<String>(this,R.layout.list_item,R.id.listitems,JavaArray);

            ListView listView=(ListView)findViewById(R.id.listviewjava);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(JavaListActivity.this,JavaArray[position],Toast.LENGTH_SHORT).show();

                    switch (position) {
                        case 0:
                            Intent intent = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent.putExtra("p1", "program1");
                            startActivity(intent);
                            break;
                        case 1:
                            Intent intent1 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent1.putExtra("p2", "program2");
                            startActivity(intent1);
                            break;

                        case 2:
                            Intent intent2 = new Intent(getApplicationContext(),JavaWebViewActivity.class);
                            intent2.putExtra("p3", "program3");
                            startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent3.putExtra("p4", "program4");
                            startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent4.putExtra("p5", "program5");
                            startActivity(intent4);
                            break;
                        case 5:
                            Intent intent5 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent5.putExtra("p6", "program6");
                            startActivity(intent5);
                            break;
                        case 6:
                            Intent intent6 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent6.putExtra("p7", "program7");
                            startActivity(intent6);
                            break;
                        case 7:
                            Intent intent7 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent7.putExtra("p8", "program8");
                            startActivity(intent7);
                            break;
                        case 8:
                            Intent intent8 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent8.putExtra("p9", "program9");
                            startActivity(intent8);
                            break;
                        case 9:
                            Intent intent9 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent9.putExtra("p10", "program10");
                            startActivity(intent9);
                            break;
                        case 10:
                            Intent intent10 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent10.putExtra("p11", "program11");
                            startActivity(intent10);
                            break;
                        case 11:
                            Intent intent11 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent11.putExtra("p12", "program12");
                            startActivity(intent11);
                            break;
                        case 12:
                            Intent intent12 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent12.putExtra("p13", "program13");
                            startActivity(intent12);
                            break;
                        case 13:
                            Intent intent13 = new Intent(getApplicationContext(),JavaWebViewActivity.class);
                            intent13.putExtra("p14", "program14");
                            startActivity(intent13);
                            break;
                        case 14:
                            Intent intent14 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent14.putExtra("p15", "program15");
                            startActivity(intent14);
                            break;
                        case 15:
                            Intent intent15 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent15.putExtra("p16", "program16");
                            startActivity(intent15);
                            break;
                        case 16:
                            Intent intent16 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent16.putExtra("p17", "program17");
                            startActivity(intent16);
                            break;
                        case 17:
                            Intent intent17 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent17.putExtra("p18", "program18");
                            startActivity(intent17);
                            break;
                        case 18:
                            Intent intent18 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent18.putExtra("p19", "program19");
                            startActivity(intent18);
                            break;
                        case 19:
                            Intent intent19 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent19.putExtra("p20", "program20");
                            startActivity(intent19);
                            break;
                        case 20:
                            Intent intent20 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent20.putExtra("p21", "program21");
                            startActivity(intent20);
                            break;
                        case 21:
                            Intent intent21 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent21.putExtra("p22", "program22");
                            startActivity(intent21);
                            break;
                        case 22:
                            Intent intent22 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent22.putExtra("p23", "program23");
                            startActivity(intent22);
                            break;
                        case 23:
                            Intent intent23 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent23.putExtra("p24", "program24");
                            startActivity(intent23);
                            break;
                        case 24:
                            Intent intent24 = new Intent(getApplicationContext(), JavaWebViewActivity.class);
                            intent24.putExtra("p25", "program25");
                            startActivity(intent24);
                            break;
                    }
                }
            });

            }

    }

