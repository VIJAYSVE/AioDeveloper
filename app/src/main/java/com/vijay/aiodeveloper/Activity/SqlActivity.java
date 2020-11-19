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
import com.vijay.aiodeveloper.webviews.SqlWebViewActivity;

public class SqlActivity extends AppCompatActivity {
    String[] SqlArray={"Introduction",
            "What is AngularJS",
            "Advantage of AngularJS",
            "AngularJS MVC Architecture",
            "AngularJS First Example",
            "AngularJS Data Binding",
            "AngularJS Expressions",
            "AngularJS Directives",
            "AngularJS Controllers",
            "AngularJS Module",
            "AngularJS Scopes",
            "AngularJS Dependency Injection",
            "AngularJS Filters",
            "AngularJS Tables",
            "AngularJS Select",
            "AngularJS HTML DOM",
            "AngularJS Forms",
            "AngularJS Form Validation",
            "AngularJS AJAX",
            "AngularJS Animations"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ArrayAdapter adapter=new ArrayAdapter<String>(this, R.layout.list_sql_item,SqlArray);

        ListView listView=(ListView)findViewById(R.id.listviewsql);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SqlActivity.this,SqlArray[position],Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), SqlWebViewActivity.class);

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
                }
            }
        });

    }
}
