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
import com.vijay.aiodeveloper.webviews.MySqlWebViewActivity;

public class MySqlActivity extends AppCompatActivity {
        String[] MySqlArray = {
                "SQL Introduction",
                "SQL Database",
                "SQL Select",
                "SQL Where",
                "SQL Insert",
                "SQL Update",
                "SQL Delete",
                "SQL Order By",
                "SQL Select Top",
                "SQL Offset-Fetch",
                "SQL Select Distinct",
                "SQL Min, Max",
                "SQL Count, Sum, Avg",
                "SQL And, Or, Not",
                "SQL Between",
                "SQL In",
                "SQL Like",
                "SQL Is Null",
                "SQL Group By",
                "SQL Having",
                "SQL Alias",
                "SQL Join",
                "SQL Left Join",
                "SQL Right Join",
                "SQL Full Join",
                "SQL Self Join",
                "SQL Union",
                "SQL Subquery",
                "SQL Any, All",
                "SQL Exists",
                "SQL Select Into",
                "SQL Insert Into",
                "SQL Injection and Keywords"
        };


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_my_sql);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

            ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_mysql_item, MySqlArray);

            ListView listView = (ListView) findViewById(R.id.listviewmysql);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(MySqlActivity.this, MySqlArray[position], Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(getApplicationContext(), MySqlWebViewActivity.class);

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
                        case 20:
                            intent.putExtra("p21", "program21");
                            startActivity(intent);
                            break;
                        case 21:
                            intent.putExtra("p22", "program22");
                            startActivity(intent);
                            break;
                        case 22:
                            intent.putExtra("p23", "program23");
                            startActivity(intent);
                            break;
                        case 23:
                            intent.putExtra("p24", "program24");
                            startActivity(intent);
                            break;
                        case 24:
                            intent.putExtra("p25", "program25");
                            startActivity(intent);
                            break;
                        case 25:
                            intent.putExtra("p26", "program26");
                            startActivity(intent);
                            break;
                        case 26:
                            intent.putExtra("p27", "program27");
                            startActivity(intent);
                            break;
                        case 27:
                            intent.putExtra("p28", "program28");
                            startActivity(intent);
                            break;
                        case 28:
                            intent.putExtra("p29", "program29");
                            startActivity(intent);
                            break;
                        case 29:
                            intent.putExtra("p30", "program30");
                            startActivity(intent);
                            break;
                        case 30:
                            intent.putExtra("p31", "program31");
                            startActivity(intent);
                            break;
                        case 31:
                            intent.putExtra("p32", "program32");
                            startActivity(intent);
                            break;
                        case 32:
                            intent.putExtra("p33", "program33");
                            startActivity(intent);
                            break;
                    }
                }
            });

        }
    }
