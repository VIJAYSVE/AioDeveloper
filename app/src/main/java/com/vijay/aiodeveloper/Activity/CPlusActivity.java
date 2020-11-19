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
import com.vijay.aiodeveloper.webviews.CPlusWebViewActivity;

public class CPlusActivity extends AppCompatActivity {
    String[] CPlusArray={"Hello World","If Statement Example Program","If..Else Statement Example Program",
            "2D Array","Add n numbers","Add subtract multiply divide","Addition of digits","Addition of matrices",
            "Area of a triangle","Binary Operator Overloading","Binary Searching using recursion",
            "Binary to Decimal","Binary to Hexadecimal","Binary to Octal","Decimal to Binary","Decimal to Octal",
            "Check Positive or Negative","Current Date","Delete Vowels","Find ASCII value of a character",
            "Get IP Address","Hcf & Lcm","nCr & nPr","Odd or Even","Pattern 1","Pattern 2","Pattern 3","Pattern 4",
            "Pattern 5","Pattern 6","Pattern 7","Pattern 8","Pattern 9","Pattern 10","Shutdown Computer",
            "Program To Add Two Complex Numbers",
            "Program To Generate Random Numbers","Program To Reverse A Number","Program For Call By Reference",
            "Program For Call By Value","Program For Constructor Over Loading"," Program For Declaring Pointers as Class Member",
            " Program For Matrix Addition"," Program To Implement Encapsulation","Program To Implement Function Overloading",
            "Program to Compute Cross Product of Two Vectors","Program to Find Largest Rectangular Area in a Histogram",
            "Program to Implement Binary Search Method","Program to Implement Bubble Sort Method",
            "Program to Find the Number of Permutations of a Given String"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplus);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        ArrayAdapter adapter=new ArrayAdapter<String>(this, R.layout.list_cplus_item,CPlusArray);

        ListView listView=(ListView)findViewById(R.id.listviewcplus);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(CPlusActivity.this,CPlusArray[position],Toast.LENGTH_SHORT).show();

                switch (position){
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent.putExtra("p1", "program1");
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent1.putExtra("p2", "program2");
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent2.putExtra("p3", "program3");
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent3.putExtra("p4", "program4");
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent4.putExtra("p5", "program5");
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getApplicationContext(),CPlusWebViewActivity.class);
                        intent5.putExtra("p6", "program6");
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent6.putExtra("p7", "program7");
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent7.putExtra("p8", "program8");
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(getApplicationContext(),CPlusWebViewActivity.class);
                        intent8.putExtra("p9", "program9");
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent9.putExtra("p10", "program10");
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent10.putExtra("p11", "program11");
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent11.putExtra("p12", "program12");
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent12.putExtra("p13", "program13");
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent13.putExtra("p14", "program14");
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent14.putExtra("p15", "program15");
                        startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent15.putExtra("p16", "program16");
                        startActivity(intent15);
                        break;
                    case 16:
                        Intent intent16 = new Intent(getApplicationContext(),CPlusWebViewActivity.class);
                        intent16.putExtra("p17", "program17");
                        startActivity(intent16);
                        break;
                    case 17:
                        Intent intent17 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent17.putExtra("p18", "program18");
                        startActivity(intent17);
                        break;
                    case 18:
                        Intent intent18 = new Intent(getApplicationContext(),CPlusWebViewActivity.class);
                        intent18.putExtra("p19", "program19");
                        startActivity(intent18);
                        break;
                    case 19:
                        Intent intent19 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent19.putExtra("p20", "program20");
                        startActivity(intent19);
                        break;
                    case 20:
                        Intent intent20 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent20.putExtra("p21", "program21");
                        startActivity(intent20);
                        break;
                    case 21:
                        Intent intent21 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent21.putExtra("p22", "program22");
                        startActivity(intent21);
                        break;
                    case 22:
                        Intent intent22 = new Intent(getApplicationContext(),CPlusWebViewActivity.class);
                        intent22.putExtra("p23", "program23");
                        startActivity(intent22);
                        break;
                    case 23:
                        Intent intent23 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent23.putExtra("p24", "program24");
                        startActivity(intent23);
                        break;
                    case 24:
                        Intent intent24 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent24.putExtra("p25", "program25");
                        startActivity(intent24);
                        break;
                    case 25:
                        Intent intent25 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent25.putExtra("p26", "program26");
                        startActivity(intent25);
                        break;
                    case 26:
                        Intent intent26 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent26.putExtra("p27", "program27");
                        startActivity(intent26);
                        break;
                    case 27:
                        Intent intent27 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent27.putExtra("p28", "program28");
                        startActivity(intent27);
                        break;
                    case 28:
                        Intent intent28 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent28.putExtra("p29", "program29");
                        startActivity(intent28);
                        break;
                    case 29:
                        Intent intent29 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent29.putExtra("p30", "program30");
                        startActivity(intent29);
                        break;
                    case 30:
                        Intent intent30 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent30.putExtra("p31", "program31");
                        startActivity(intent30);
                        break;
                    case 31:
                        Intent intent31 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent31.putExtra("p32", "program32");
                        startActivity(intent31);
                        break;
                    case 32:
                        Intent intent32 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent32.putExtra("p33", "program33");
                        startActivity(intent32);
                        break;
                    case 33:
                        Intent intent33 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent33.putExtra("p34", "program34");
                        startActivity(intent33);
                        break;
                    case 34:
                        Intent intent34 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent34.putExtra("p35", "program35");
                        startActivity(intent34);
                        break;
                    case 35:
                        Intent intent35 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent35.putExtra("p36", "program36");
                        startActivity(intent35);
                        break;
                    case 36:
                        Intent intent36 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent36.putExtra("p37", "program37");
                        startActivity(intent36);
                        break;
                    case 37:
                        Intent intent37 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent37.putExtra("p38", "program38");
                        startActivity(intent37);
                        break;
                    case 38:
                        Intent intent38 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent38.putExtra("p39", "program39");
                        startActivity(intent38);
                        break;
                    case 39:
                        Intent intent39 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent39.putExtra("p40", "program40");
                        startActivity(intent39);
                        break;
                    case 40:
                        Intent intent40 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent40.putExtra("p41", "program41");
                        startActivity(intent40);
                        break;
                    case 41:
                        Intent intent41 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent41.putExtra("p42", "program42");
                        startActivity(intent41);
                        break;
                    case 42:
                        Intent intent42 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent42.putExtra("p43", "program43");
                        startActivity(intent42);
                        break;
                    case 43:
                        Intent intent43 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent43.putExtra("p44", "program44");
                        startActivity(intent43);
                        break;
                    case 44:
                        Intent intent44 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent44.putExtra("p45", "program45");
                        startActivity(intent44);
                        break;
                    case 45:
                        Intent intent45 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent45.putExtra("p46", "program46");
                        startActivity(intent45);
                        break;
                    case 46:
                        Intent intent46 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent46.putExtra("p47", "program47");
                        startActivity(intent46);
                        break;
                    case 47:
                        Intent intent47 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent47.putExtra("p48", "program48");
                        startActivity(intent47);
                        break;
                    case 48:
                        Intent intent48 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent48.putExtra("p49", "program49");
                        startActivity(intent48);
                        break;
                    case 49:
                        Intent intent49 = new Intent(getApplicationContext(), CPlusWebViewActivity.class);
                        intent49.putExtra("p50", "program50");
                        startActivity(intent49);
                        break;

                }

            }
        });

    }
}
