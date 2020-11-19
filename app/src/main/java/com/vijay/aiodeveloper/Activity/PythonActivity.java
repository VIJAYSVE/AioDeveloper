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
import com.vijay.aiodeveloper.webviews.PythonWebViewActivity;

public class PythonActivity extends AppCompatActivity {
    String[] PythonArray={"Program to get the Python version you are using.",
            "Program to display the current date and time.",
            "Program which accepts the radius of a circle from the user and compute the area.",
            "Program which accepts the user's first and last name and print them in reverse order with a space between them.",
            "Program to accept a filename from the user and print the extension of that. Sample filename : abc.java" ,
            "Program to print the calendar of a given month and year",
            "Program to get the volume of a sphere with radius 6",
            "Program to test whether a number is within 100 of 1000 or 2000.",
            "Program to calculate the sum of three given numbers, if the values are equal then return thrice of their sum",
            "Program to test whether a passed letter is a vowel or not.",
            "Program that will accept the base and height of a triangle and compute the area.",
            "Program to display your details like name, age, address in three different lines",
            "Program to list all files in a directory in Python.",
            "Program to get the current username",
            "Program to get the ASCII value of a character.",
            "Program to swap two variables.",
            "Program to clear the screen or terminal.",
            "Program to check if a number is positive, negative or zero.",
            "Program to remove the first item from a specified list",
            "Program to determine the largest and smallest integers, longs, floats.",
            "Program to check if lowercase letters exist in a string.",
            "Program to valid a IP address.",
            "Program to convert decimal to hexadecimal",
            "Program to check if variable is of integer or string.",
            "Program to check if multiple variables have the same value",
            "Program to create a copy of its own source code",
            "Program to get the least common multiple (LCM) of two positive integers. ",
            "Program to calculate the length of a string.",
            "Python function that takes a list of words and returns the length of the longest one.",
            "Program to remove the characters which have odd index values of a given string. ",
            "Program to display a number with a comma separator.",
            "Program to reverse a string.",
            "Program to print the square and cube symbol in the area of a rectangle and volume of a cylinder.",
            "Program to check if a string contains all letters of the alphabet.",
            "Program to lowercase first n characters in a string.",
            "Program to swap comma and dot in a string.",
            "Program to count and display the vowels of a given text.",
            "Program to convert a string in a list.",
            "Program to check whether a string starts with specified characters.",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ArrayAdapter adapter=new ArrayAdapter<String>(this,R.layout.list_python_item,PythonArray);

        ListView listView=(ListView)findViewById(R.id.listviewpython);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(PythonActivity.this,PythonArray[position],Toast.LENGTH_SHORT).show();

                switch (position) {
                    case 0:
                        Intent intent = new Intent(getApplicationContext(),  PythonWebViewActivity.class);
                        intent.putExtra("p1", "program1");
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent1.putExtra("p2", "program2");
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent2.putExtra("p3", "program3");
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent3.putExtra("p4", "program4");
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent4.putExtra("p5", "program5");
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent5.putExtra("p6", "program6");
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent6.putExtra("p7", "program7");
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent7.putExtra("p8", "program8");
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent8.putExtra("p9", "program9");
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent9.putExtra("p10", "program10");
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent10.putExtra("p11", "program11");
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent11.putExtra("p12", "program12");
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent12.putExtra("p13", "program13");
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent13.putExtra("p14", "program14");
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent14.putExtra("p15", "program15");
                        startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent15.putExtra("p16", "program16");
                        startActivity(intent15);
                        break;
                    case 16:
                        Intent intent16 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent16.putExtra("p17", "program17");
                        startActivity(intent16);
                        break;
                    case 17:
                        Intent intent17 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent17.putExtra("p18", "program18");
                        startActivity(intent17);
                        break;
                    case 18:
                        Intent intent18 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent18.putExtra("p19", "program19");
                        startActivity(intent18);
                        break;
                    case 19:
                        Intent intent19 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent19.putExtra("p20", "program20");
                        startActivity(intent19);
                        break;
                    case 20:
                        Intent intent20 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent20.putExtra("p21", "program21");
                        startActivity(intent20);
                        break;
                    case 21:
                        Intent intent21 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent21.putExtra("p22", "program22");
                        startActivity(intent21);
                        break;
                    case 22:
                        Intent intent22 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent22.putExtra("p23", "program23");
                        startActivity(intent22);
                        break;
                    case 23:
                        Intent intent23 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent23.putExtra("p24", "program24");
                        startActivity(intent23);
                        break;
                    case 24:
                        Intent intent24 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent24.putExtra("p25", "program25");
                        startActivity(intent24);
                        break;
                    case 25:
                        Intent intent25 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent25.putExtra("p26", "program26");
                        startActivity(intent25);
                        break;
                    case 26:
                        Intent intent26 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent26.putExtra("p27", "program27");
                        startActivity(intent26);
                        break;
                    case 27:
                        Intent intent27 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent27.putExtra("p28", "program28");
                        startActivity(intent27);
                        break;
                    case 28:
                        Intent intent28 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent28.putExtra("p29", "program29");
                        startActivity(intent28);
                        break;
                    case 29:
                        Intent intent29 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent29.putExtra("p30", "program30");
                        startActivity(intent29);
                        break;
                    case 30:
                        Intent intent30 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent30.putExtra("p31", "program31");
                        startActivity(intent30);
                        break;
                    case 31:
                        Intent intent31 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent31.putExtra("p32", "program32");
                        startActivity(intent31);
                        break;
                    case 32:
                        Intent intent32 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent32.putExtra("p33", "program33");
                        startActivity(intent32);
                        break;
                    case 33:
                        Intent intent33 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent33.putExtra("p34", "program34");
                        startActivity(intent33);
                        break;
                    case 34:
                        Intent intent34 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent34.putExtra("p35", "program35");
                        startActivity(intent34);
                        break;
                    case 35:
                        Intent intent35 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent35.putExtra("p36", "program36");
                        startActivity(intent35);
                        break;
                    case 36:
                        Intent intent36 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent36.putExtra("p37", "program37");
                        startActivity(intent36);
                        break;
                    case 37:
                        Intent intent37 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent37.putExtra("p38", "program38");
                        startActivity(intent37);
                        break;
                    case 38:
                        Intent intent38 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent38.putExtra("p39", "program39");
                        startActivity(intent38);
                        break;
                    case 39:
                        Intent intent39 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
                        intent39.putExtra("p40", "program40");
                        startActivity(intent39);
                        break;
//                    case 40:
//                        Intent intent40 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
//                        intent40.putExtra("p41", "program41");
//                        startActivity(intent40);
//                        break;
//                    case 41:
//                        Intent intent41 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
//                        intent41.putExtra("p42", "program42");
//                        startActivity(intent41);
//                        break;
//                    case 42:
//                        Intent intent42 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
//                        intent42.putExtra("p43", "program43");
//                        startActivity(intent42);
//                        break;
//                    case 43:
//                        Intent intent43 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
//                        intent43.putExtra("p44", "program44");
//                        startActivity(intent43);
//                        break;
//                    case 44:
//                        Intent intent44 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
//                        intent44.putExtra("p45", "program45");
//                        startActivity(intent44);
//                        break;
//                    case 45:
//                        Intent intent45 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
//                        intent45.putExtra("p46", "program46");
//                        startActivity(intent45);
//                        break;
//                    case 46:
//                        Intent intent46 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
//                        intent46.putExtra("p47", "program47");
//                        startActivity(intent46);
//                        break;
//                    case 47:
//                        Intent intent47 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
//                        intent47.putExtra("p48", "program48");
//                        startActivity(intent47);
//                        break;
//                    case 48:
//                        Intent intent48 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
//                        intent48.putExtra("p49", "program49");
//                        startActivity(intent48);
//                        break;
//                    case 49:
//                        Intent intent49 = new Intent(getApplicationContext(), PythonWebViewActivity.class);
//                        intent49.putExtra("p50", "program50");
//                        startActivity(intent49);
//                        break;
                }
            }
        });

    }
}
