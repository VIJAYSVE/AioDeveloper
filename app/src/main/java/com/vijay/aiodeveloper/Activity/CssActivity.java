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
import com.vijay.aiodeveloper.webviews.CssWebViewActivity;

public class CssActivity extends AppCompatActivity {
    String[]CssArray={ "Introduction of CSS",
            "CSS Syntax", "Inserting a style sheet", "Colors in CSS","Set the Background", "Border in CSS",
            "Margins in CSS", "Padding in CSS", "Setting height and width", "Box Model in CSS",
            "Outline in CSS", "Text in CSS", "Set the Font Family", "Links in CSS",
            "Lists in CSS","Css Counters","Css Attr Selectors","Tables in CSS","CSS Display","CSS Max-Width","Position in CSS","CSS Overflow","Float Property Of CSS",
    "CSS Inline-block","Alignment In CSS","CSS Combinators","Opacity Property In CSS","Navigation Bar In CSS","Dropdowns In CSS",
    "CSS Forms"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_css);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        ArrayAdapter adapter=new ArrayAdapter<String>(this, R.layout.list_css_items,CssArray);

        ListView listView=(ListView)findViewById(R.id.listviewcss);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(CssActivity.this,CssArray[position],Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), CssWebViewActivity.class);

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
                }

            }
        });

    }

}
