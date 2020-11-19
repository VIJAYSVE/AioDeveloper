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
import com.vijay.aiodeveloper.webviews.JsWebViewActivity;

public class JavaScriptActivity extends AppCompatActivity {
    String[] JavaScriptArray={"Hello World",
            "Alert",
            "Form",
            "Multiline comment",
            "JavaScript Popup Window Program",
            "Push -pop operations on Array elements",
            "Javascript program to find factorial",
            "Temperature converter",
            "Prime numbers without using a function",
            "Square and cube of numbers",
            "Time",
            "Area of square",
            "Drop down menu",
            "Simple Interest",
            "Generate Multiplication tables",
            "Change Case of the entered String.",
            "Copy text from one field to another",
            "Finding Even - Odd Number",
            "A simple JavaScript program Table of factorial upto 10",
            "An HTML form with a JavaScript event handler defined",
            "Defining JavaScript Functions",
            "Checking for the Correct Number of Arguments",
            "A Multi-Argument max() Function",
            "Creating and Initializing an Array",
            "Static Variables",
            "A Rectangle Object Constructor Function",
            "Defining Methods in a Constructor",
            "Are Strings and Functions Compared by Value or Reference?",
            "A Simple JavaScript Program in an HTML File",
            "JavaScript program to display the current day and time in the following format.",
            "JavaScript program to print the contents of the current window.",
            "JavaScript program to get the current date.",
            "JavaScript program to find the area of a triangle where lengths of the three of its sides.",
            "JavaScript program to rotate the string ' Welcome to the tutorial of JavaScript.' in right direction by periodically removing one letter from the end of the string and attaching it to the front.",
            "JavaScript program to determine whether a given year is a leap year in the Gregorian calendar.",
            "JavaScript program to find 1st January is being a Sunday between 2000 and 2050.",
            "JavaScript program where the program takes a random integer between 1 to 10, the user is then prompted to input a guess number. ",
            "JavaScript program to calculate days left until next Christmas.",
            "JavaScript program to calculate multiplication and division of two numbers (input from user).",
            "JavaScript program to get the website URL (loading page).",
            "JavaScript function that reverse a number.",
            "JavaScript function that checks whether a passed string is palindrome or not.?",
            "JavaScript function that generates all combinations of a string.",
            "JavaScript function that returns a passed string with letters in alphabetical order.",
            "JavaScript function that accepts a string as a parameter and converts the first letter of each word of the string in upper case.",
            "JavaScript function that accepts a number as a parameter and check the number is prime or not.",
            "JavaScript function that accepts a string as a parameter and find the longest word within the string.",
            "JavaScript function that accepts a string as a parameter and counts the number of vowels within the string.",
            "JavaScript function which accepts an argument and returns the type.",
            "JavaScript function which returns the n rows by n columns identity matrix.",
            "JavaScript function which will take an array of numbers stored and find the second lowest and second greatest numbers, respectively.",
            "JavaScript function which says whether a number is perfect.",
            "JavaScript function to compute the factors of a positive integer",
            "JavaScript function to convert an amount to coins.",
            "JavaScript function to compute the value of bn where n is the exponent and b is the bases. Accept b and n from the user and display the result.",
            "JavaScript function to extract unique characters from a string.",
            "JavaScript function for searching an element in arrays by using  binary search.",
            "JavaScript function that returns array elements larger than a number.",
            "JavaScript function that accepts two arguments, a string and a letter and the function will count the number of occurrences of the specified letter within the string.",
            "JavaScript function to find the first not repeated character.",
            "JavaScript function to apply Bubble Sort algorithm.",
            "If â€“ conditional statement",
            "If - Else statement ",
            "Else if Statement",
            "Switch Case",
            "For loops",
            "For â€“ in Loop",
            "For â€“ of Statement",
            "Do â€“ while loops",
            "While Loop",
            "Break Statement",
            "Continue statement",
            "Defining and using the valueOf() method ",
            "Try â€“ Catch block with confirmation block",
            "One Error event",
            "Try â€“ catch statements",
            "JavaScript program to sort a list of elements using Quick sort.",
            "JavaScript program to sort a list of elements using Merge sort.",
            "JavaScript program to sort a list of elements using Heap sort.",
            "JavaScript program to sort a list of elements using Insertion sort.",
            "JavaScript program to sort a list of elements using the Selection sort algorithm.",
            "JavaScript program to sort a list of elements using Shell sort.",
            "JavaScript program to sort a list of elements using Bubble sort.",
            "User assignment of a property and dynamic generation of a Web page",
            "Modifying the style of the paragraph text through JavaScript code.",
            "JavaSript program to Open a new Window. ",
            "JavaScript for Replacing the contents .",
            "JavaScript to Find the number of Anchors.",
            "JavaScript to Display all name/value pairs of cookies in a document.",
            "JavaScript function to get the value of the href, hreflang, rel, target, and type attributes of the specified link.",
            "JavaScript program to count, display and remove the items of a dropdown list.",
            "JavaScript program to get the width and height of the window (any time the window is resized).",
            "Change the background color of an iframe",
            "JavaScript to get the height of the iframe.",
            "JavaScript Program  to Check whether the pattern of an e-mail address matches a specific format .",
            "JavaScript program to search a date within a string.",
            "Write a JavaScript function to check whether a given value is a valid url or not.",
            "JavaScript function to check whether a given value is alpha numeric or not.",
            "JavaScript for  Password Validation",
            "JavaScript Program for re-typing of Password Validation"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_script);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ArrayAdapter adapter=new ArrayAdapter<String>(this, R.layout.list_js_item,JavaScriptArray);

        ListView listView=(ListView)findViewById(R.id.listviewjavascript);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(JavaScriptActivity.this,JavaScriptArray[position],Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), JsWebViewActivity.class);

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
                    case 33:
                        intent.putExtra("p34", "program34");
                        startActivity(intent);
                        break;
                    case 34:
                        intent.putExtra("p35", "program35");
                        startActivity(intent);
                        break;
                    case 35:
                        intent.putExtra("p36", "program36");
                        startActivity(intent);
                        break;
                    case 36:
                        intent.putExtra("p37", "program37");
                        startActivity(intent);
                        break;
                    case 37:
                        intent.putExtra("p38", "program38");
                        startActivity(intent);
                        break;
                    case 38:
                        intent.putExtra("p39", "program39");
                        startActivity(intent);
                        break;
                    case 39:
                        intent.putExtra("p40", "program40");
                        startActivity(intent);
                        break;
                    case 40:
                        intent.putExtra("p41", "program41");
                        startActivity(intent);
                        break;
                    case 41:
                        intent.putExtra("p42", "program42");
                        startActivity(intent);
                        break;
                    case 42:
                        intent.putExtra("p43", "program43");
                        startActivity(intent);
                        break;
                    case 43:
                        intent.putExtra("p44", "program44");
                        startActivity(intent);
                        break;
                    case 44:
                        intent.putExtra("p45", "program45");
                        startActivity(intent);
                        break;
                    case 45:
                        intent.putExtra("p46", "program46");
                        startActivity(intent);
                        break;
                    case 46:
                        intent.putExtra("p47", "program47");
                        startActivity(intent);
                        break;
                    case 47:
                        intent.putExtra("p48", "program48");
                        startActivity(intent);
                        break;
                    case 48:
                        intent.putExtra("p49", "program49");
                        startActivity(intent);
                        break;
                    case 49:
                        intent.putExtra("p50", "program50");
                        startActivity(intent);
                        break;
                    case 50:
                        intent.putExtra("p51", "program51");
                        startActivity(intent);
                        break;
                    case 51:
                        intent.putExtra("p52", "program52");
                        startActivity(intent);
                        break;

                    case 52:
                        intent.putExtra("p53", "program53");
                        startActivity(intent);
                        break;
                    case 53:
                        intent.putExtra("p54", "program54");
                        startActivity(intent);
                        break;
                    case 54:
                        intent.putExtra("p55", "program55");
                        startActivity(intent);
                        break;
                    case 55:
                        intent.putExtra("p56", "program56");
                        startActivity(intent);
                        break;
                    case 56:
                        intent.putExtra("p57", "program57");
                        startActivity(intent);
                        break;
                    case 57:
                        intent.putExtra("p58", "program58");
                        startActivity(intent);
                        break;
                    case 58:
                        intent.putExtra("p59", "program59");
                        startActivity(intent);
                        break;
                    case 59:
                        intent.putExtra("p60", "program60");
                        startActivity(intent);
                        break;
                    case 60:
                        intent.putExtra("p61", "program61");
                        startActivity(intent);
                        break;
                    case 61:
                        intent.putExtra("p62", "program62");
                        startActivity(intent);
                        break;
                    case 62:
                        intent.putExtra("p63", "program63");
                        startActivity(intent);
                        break;
                    case 63:
                        intent.putExtra("p64", "program64");
                        startActivity(intent);
                        break;
                    case 64:
                        intent.putExtra("p65", "program65");
                        startActivity(intent);
                        break;
                    case 65:
                        intent.putExtra("p66", "program66");
                        startActivity(intent);
                        break;
                    case 66:
                        intent.putExtra("p67", "program67");
                        startActivity(intent);
                        break;
                    case 67:
                        intent.putExtra("p68", "program68");
                        startActivity(intent);
                        break;
                    case 68:
                        intent.putExtra("p69", "program69");
                        startActivity(intent);
                        break;
                    case 69:
                        intent.putExtra("p70", "program70");
                        startActivity(intent);
                        break;
                    case 70:
                        intent.putExtra("p71", "program71");
                        startActivity(intent);
                        break;
                    case 71:
                        intent.putExtra("p72", "program72");
                        startActivity(intent);
                        break;
                    case 72:
                        intent.putExtra("p73", "program73");
                        startActivity(intent);
                        break;
                    case 73:
                        intent.putExtra("p74", "program74");
                        startActivity(intent);
                        break;
                    case 74:
                        intent.putExtra("p75", "program75");
                        startActivity(intent);
                        break;
                    case 75:
                        intent.putExtra("p76", "program76");
                        startActivity(intent);
                        break;
                    case 76:
                        intent.putExtra("p77", "program77");
                        startActivity(intent);
                        break;
                    case 77:
                        intent.putExtra("p78", "program78");
                        startActivity(intent);
                        break;
                    case 78:
                        intent.putExtra("79", "program79");
                        startActivity(intent);
                        break;
                    case 79:
                        intent.putExtra("p80", "program80");
                        startActivity(intent);
                        break;
                    case 80:
                        intent.putExtra("p81", "program81");
                        startActivity(intent);
                        break;
                    case 81:
                        intent.putExtra("p82", "program82");
                        startActivity(intent);
                        break;
                    case 82:
                        intent.putExtra("p83", "program83");
                        startActivity(intent);
                        break;
                    case 83:
                        intent.putExtra("p84", "program84");
                        startActivity(intent);
                        break;
                    case 84:
                        intent.putExtra("p85", "program85");
                        startActivity(intent);
                        break;
                    case 85:
                        intent.putExtra("p86", "program86");
                        startActivity(intent);
                        break;
                    case 86:
                        intent.putExtra("p87", "program87");
                        startActivity(intent);
                        break;
                    case 87:
                        intent.putExtra("p88", "program88");
                        startActivity(intent);
                        break;
                    case 88:
                        intent.putExtra("p89", "program89");
                        startActivity(intent);
                        break;
                    case 89:
                        intent.putExtra("p90", "program90");
                        startActivity(intent);
                        break;
                    case 90:
                        intent.putExtra("p91", "program91");
                        startActivity(intent);
                        break;
                    case 91:
                        intent.putExtra("p92", "program92");
                        startActivity(intent);
                        break;
                    case 92:
                        intent.putExtra("p93", "program93");
                        startActivity(intent);
                        break;
                    case 93:
                        intent.putExtra("p94", "program94");
                        startActivity(intent);
                        break;
                    case 94:
                        intent.putExtra("p95", "program95");
                        startActivity(intent);
                        break;
                    case 95:
                        intent.putExtra("p96", "program96");
                        startActivity(intent);
                        break;
                    case 96:
                        intent.putExtra("p97", "program97");
                        startActivity(intent);
                        break;
                    case 97:
                        intent.putExtra("p98", "program98");
                        startActivity(intent);
                        break;
                    case 98:
                        intent.putExtra("p99", "program99");
                        startActivity(intent);
                        break;
                    case 99:
                        intent.putExtra("p100", "program100");
                        startActivity(intent);
                        break;


                }

            }
        });

    }

}
