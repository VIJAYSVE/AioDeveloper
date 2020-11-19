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
import com.vijay.aiodeveloper.webviews.MathWebViewActivity;

public class MathListActivity extends AppCompatActivity {
    String[] MathsArray={"Algebra","Geometry","Analytical Geometry","Trigonometry","Derivative","Integration","Laplace TransForm",
            "Fourier Series","Series And Expansions","Numericals Methods","Vector Calculas","Beta Gamma","Z-Transform","Probability"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ArrayAdapter adapter=new ArrayAdapter<String>(this, R.layout.list_math_item,MathsArray);

        ListView listView=(ListView)findViewById(R.id.listviewmaths);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MathListActivity.this,MathsArray[position],Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), MathWebViewActivity.class);
                        intent.putExtra("p1", "program1");
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(), MathWebViewActivity.class);
                        intent1.putExtra("p2", "program2");
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), MathWebViewActivity.class);
                        intent2.putExtra("p3", "program3");
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(), MathWebViewActivity.class);
                        intent3.putExtra("p4", "program4");
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getApplicationContext(), MathWebViewActivity.class);
                        intent4.putExtra("p5", "program5");
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getApplicationContext(), MathWebViewActivity.class);
                        intent5.putExtra("p6", "program6");
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getApplicationContext(), MathWebViewActivity.class);
                        intent6.putExtra("p7", "program7");
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getApplicationContext(), MathWebViewActivity.class);
                        intent7.putExtra("p8", "program8");
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(getApplicationContext(), MathWebViewActivity.class);
                        intent8.putExtra("p9", "program9");
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(getApplicationContext(), MathWebViewActivity.class);
                        intent9.putExtra("p10", "program10");
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(getApplicationContext(), MathWebViewActivity.class);
                        intent10.putExtra("p11", "program11");
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(getApplicationContext(), MathWebViewActivity.class);
                        intent11.putExtra("p12", "program12");
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(getApplicationContext(), MathWebViewActivity.class);
                        intent12.putExtra("p13", "program13");
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(getApplicationContext(), WebViewActivity.class);
                        intent13.putExtra("p14", "program14");
                        startActivity(intent13);
                        break;
                }
            }
        });
    }
}
