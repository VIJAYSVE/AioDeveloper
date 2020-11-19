package com.vijay.aiodeveloper.strings;

/**
 * Created by Nabeel-PC on 28-06-2017.
 */

public class StringMathData {
    public static final String program1 = "";
    public static final String program2 = "<p><style><br />\n" +
            "p {<br />\n" +
            " font-size: 160%;<br />\n" +
            "}<br />\n" +
            "</style></p>\n" +
            "\n" +
            "<p>Statement: Write a program to count number of l&rsquo;s in the contents of D register and store the count in the B register.<br><br></p>\n" +
            "\n" +
            "<p>Sample problem:--<br />\n" +
            "(2200H) = 04<br />\n" +
            "(2201H) = 34H<br />\n" +
            "(2202H) = A9H<br />\n" +
            "(2203H) = 78H<br />\n" +
            "(2204H) = 56H<br />\n" +
            "Result = (2202H) = A9H<br><br></p>\n" +
            "\n" +
            "<p>PROGRAM:--<br />\n" +
            "MVI B, 00H<br />\n" +
            "MVI C, 08H<br />\n" +
            "MOV A, D<br />\n" +
            "BACK: RAR<br />\n" +
            "JNC SKIP<br />\n" +
            "INR B<br />\n" +
            "SKIP: DCR C<br />\n" +
            "JNZ BACK<br />\n" +
            "HLT<br />\n" +
            "</p>";


}
