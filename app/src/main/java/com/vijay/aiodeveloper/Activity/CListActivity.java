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

public class CListActivity extends AppCompatActivity {
    String[] CArray={"Hello world Example","Check Odd or Even","Check Vowel or Not","Program to check Leap Year",
            "Factorial program in c","Palindrome Numbers","Print Patterns","Prime Number",
            "Armstrong Number","Fibonacci series in C","Find Maximum Elements In Array","Linear search , Binary Search",
            "Insertion,Bubble,Selection Sort","Addition Of Matrices","C Program to find exponent Power Series",
    "Find greatest in 3 numbers","Print First 10 Natural No.","Check Whether Number is Perfect Or Not","Program to find HCF and LCM",
    "Swapping of two numbers without third variable","Find all Roots of a Quadratic equation"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clist);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        ArrayAdapter adapter=new ArrayAdapter<String>(this,R.layout.list_c_item,CArray);

        ListView listView=(ListView)findViewById(R.id.listviewc);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(CListActivity.this,CArray[position],Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), WebViewActivity.class);

                    switch (position){
                        case 0:
                            intent.putExtra("p1", "program1");
                            startActivity(intent);
                            break;
                        case 1:
                            intent.putExtra("p2", "program2");
                            startActivity(intent);
                            break;
                        case 2:
                            intent.putExtra("p3", "program3");
                            startActivity(intent);
                            break;
                        case 3:
                            intent.putExtra("p4", "program4");
                            startActivity(intent);
                            break;
                        case 4:
                            intent.putExtra("p5", "program5");
                            startActivity(intent);
                            break;
                        case 5:
                            intent.putExtra("p6", "program6");
                            startActivity(intent);
                            break;
                        case 6:
                            intent.putExtra("p7", "program7");
                            startActivity(intent);
                            break;
                        case 7:
                            intent.putExtra("p8", "program8");
                            startActivity(intent);
                            break;
                        case 8:
                            intent.putExtra("p9", "program9");
                            startActivity(intent);
                            break;
                        case 9:
                            intent.putExtra("p10", "program10");
                            startActivity(intent);
                            break;
                        case 10:
                            intent.putExtra("p11", "program11");
                            startActivity(intent);
                            break;
                        case 11:
                            intent.putExtra("p12", "program12");
                            startActivity(intent);
                            break;
                        case 12:
                            intent.putExtra("p13", "program13");
                            startActivity(intent);
                            break;
                        case 13:
                            intent.putExtra("p14", "program14");
                            startActivity(intent);
                            break;
                        case 14:
                            intent.putExtra("p15", "program15");
                            startActivity(intent);
                            break;
                        case 15:
                            intent.putExtra("p16", "program16");
                            startActivity(intent);
                            break;
                        case 16:
                            intent.putExtra("p17", "program17");
                            startActivity(intent);
                            break;
                        case 17:
                            intent.putExtra("p18", "program18");
                            startActivity(intent);
                            break;
                        case 18:
                            intent.putExtra("p19", "program19");
                            startActivity(intent);
                            break;
                        case 19:
                            intent.putExtra("p20", "program20");
                            startActivity(intent);
                            break;
                        case 20:
                            intent.putExtra("p21", "program21");
                            startActivity(intent);
                            break;
                        case 21:
                            intent.putExtra("p22", "program22");
                            startActivity(intent);
                            break;

                    }

            }
        });

    }

}
