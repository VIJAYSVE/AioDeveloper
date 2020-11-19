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
import com.vijay.aiodeveloper.webviews.DsWebViewActivity;

public class DSProgramsListActivity extends AppCompatActivity {
    String[] DsTutArray={"Introduction","Array In Data Structures","Queue In Data Structures","Single Linked List",
            "Double Linked List","Circular Linked List"};

    String[] DsProgramsArray={
            "Single Linked List",
            "Double Linked List",
            "Circular Linked List",
            "Array Linked List",
            "Sorted Linked List",
            "Reverse Linked List",
            "Polynomial addition",
            "Various Operations on Stack",
            "Infix to Postfix Conversion using Stack",
            "Evaluate of Postfix expression",
            "Various operations on Linear and Circular queue",
            "Binary Tree",
            "Binary Search Tree",
            "Depth First Search (DFS) Program",
            "Selection Sort"," Bubble Sort", "Insertion Sort","Heap Sort","Quick Sort" , "Merge Sort",
            "Tower of Hanoi problem ",
            "Insertion, Deletion and Traversal in AVL Tree"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsprograms_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_dsprograms_item, DsTutArray);
        ArrayAdapter adapterprograms = new ArrayAdapter<String>(this, R.layout.list_dsprograms_item, DsProgramsArray);

        ListView listView = (ListView) findViewById(R.id.listviewdsprograms);
        Intent myIntent = getIntent();
        if (myIntent.hasExtra("b1")) {
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(DSProgramsListActivity.this, DsTutArray[position], Toast.LENGTH_SHORT).show();

                    switch (position) {
                        case 0:
                            Intent intent = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent.putExtra("t1", "tut1");
                            startActivity(intent);
                            break;
                        case 1:
                            Intent intent1 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent1.putExtra("t2", "tut2");
                            startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent2.putExtra("t3", "tut3");
                            startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent3.putExtra("t4", "tut4");
                            startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent4.putExtra("t5", "tut5");
                            startActivity(intent4);
                            break;
                        case 5:
                            Intent intent5 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent5.putExtra("t6", "tut6");
                            startActivity(intent5);
                            break;

                    }
                }
            });

        } else if (myIntent.hasExtra("b2")) {
            listView.setAdapter(adapterprograms);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(DSProgramsListActivity.this, DsProgramsArray[position], Toast.LENGTH_SHORT).show();

                    switch (position) {
                        case 0:
                            Intent intent = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent.putExtra("p1", "program1");
                            startActivity(intent);
                            break;
                        case 1:
                            Intent intent1 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent1.putExtra("p2", "program2");
                            startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent2.putExtra("p3", "program3");
                            startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent3.putExtra("p4", "program4");
                            startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent4.putExtra("p5", "program5");
                            startActivity(intent4);
                            break;
                        case 5:
                            Intent intent5 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent5.putExtra("p6", "program6");
                            startActivity(intent5);
                            break;
                        case 6:
                            Intent intent6 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent6.putExtra("p7", "program7");
                            startActivity(intent6);
                            break;
                        case 7:
                            Intent intent7 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent7.putExtra("p8", "program8");
                            startActivity(intent7);
                            break;
                        case 8:
                            Intent intent8 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent8.putExtra("p9", "program9");
                            startActivity(intent8);
                            break;
                        case 9:
                            Intent intent9 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent9.putExtra("p10", "program10");
                            startActivity(intent9);
                            break;
                        case 10:
                            Intent intent10 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent10.putExtra("p11", "program11");
                            startActivity(intent10);
                            break;
                        case 11:
                            Intent intent11 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent11.putExtra("p12", "program12");
                            startActivity(intent11);
                            break;
                        case 12:
                            Intent intent12 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent12.putExtra("p13", "program13");
                            startActivity(intent12);
                            break;
                        case 13:
                            Intent intent13 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent13.putExtra("p14", "program14");
                            startActivity(intent13);
                            break;
                        case 14:
                            Intent intent14 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent14.putExtra("p15", "program15");
                            startActivity(intent14);
                            break;
                        case 15:
                            Intent intent15 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent15.putExtra("p16", "program16");
                            startActivity(intent15);
                            break;
                        case 16:
                            Intent intent16 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent16.putExtra("p17", "program17");
                            startActivity(intent16);
                            break;
                        case 17:
                            Intent intent17 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent17.putExtra("p18", "program18");
                            startActivity(intent17);
                            break;
                        case 18:
                            Intent intent18 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent18.putExtra("p19", "program19");
                            startActivity(intent18);
                            break;
                        case 19:
                            Intent intent19 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent19.putExtra("p20", "program20");
                            startActivity(intent19);
                            break;
                        case 20:
                            Intent intent20 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent20.putExtra("p21", "program21");
                            startActivity(intent20);
                            break;
                        case 21:
                            Intent intent21 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent21.putExtra("p22", "program22");
                            startActivity(intent21);
                            break;
                        case 22:
                            Intent intent22 = new Intent(getApplicationContext(), DsWebViewActivity.class);
                            intent22.putExtra("p23", "program23");
                            startActivity(intent22);
                            break;


                    }
                }
            });

        }
    }
}
