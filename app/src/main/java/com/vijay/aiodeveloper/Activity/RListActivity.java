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
import com.vijay.aiodeveloper.webviews.RWebViewActivity;

public class RListActivity extends AppCompatActivity {
    String[] RArray= {
            "Introduction",
            "R-Basic Syntax",
            "R-Data Types",
            "R-Objects",
            "Variables in R",
            "Constant in R",
            "R Operator",
            "R Control Statements",
            "R Vector",
            "R Arrays",
            "R Lists",
            "R Matrices",
            "R Factors",
            "R Data Frames",
            "Line Plot",
            "Line Plot",
            "Line Plot",
            "3D plot",
            "3D plot",
            "CSV File"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rlist);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ArrayAdapter adapter=new ArrayAdapter<String>(this, R.layout.list_r_item,RArray);

        ListView listView=(ListView)findViewById(R.id.listviewr);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(RListActivity.this,RArray[position],Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), RWebViewActivity.class);

                switch (position) {

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
                }

            }
        });

    }

}
