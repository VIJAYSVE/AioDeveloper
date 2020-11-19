package com.vijay.aiodeveloper.strings;

/**
 * Created by Nabeel-PC on 26-06-2017.
 */

public class StringCData {

    public static final String program1="<p>#include +'<stdio.h>" +
            "'<br />\n" +
            " <br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " printf(&quot;Hello world\\n&quot;);<br />\n" +
            " return 0;<br />\n" +
            "}</p>";

    public static final String program2="<p>#include <stdio.h><br />\n" +
            " <br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " int n;<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter an integer\\n&quot;);<br />\n" +
            " scanf(&quot;%d&quot;, &amp;n);<br />\n" +
            " <br />\n" +
            " if (n%2 == 0)<br />\n" +
            " printf(&quot;Even\\n&quot;);<br />\n" +
            " else<br />\n" +
            " printf(&quot;Odd\\n&quot;);<br />\n" +
            " <br />\n" +
            " return 0;<br />\n" +
            "}</p>";

    public static final String program3 ="<p>#include <stdio.h><br />\n" +
            " <br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " char ch;<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter a character\\n&quot;);<br />\n" +
            " scanf(&quot;%c&quot;, &amp;ch);<br />\n" +
            " <br />\n" +
            " if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch =='o' || ch=='O' || ch == 'u' || ch == 'U')<br />\n" +
            " printf(&quot;%c is a vowel.\\n&quot;, ch);<br />\n" +
            " else<br />\n" +
            " printf(&quot;%c is not a vowel.\\n&quot;, ch);<br />\n" +
            " <br />\n" +
            " return 0;<br />\n" +
            "}</p>";

    public static final String program4="<p>#include <stdio.h><br />\n" +
            " <br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " int year;<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter a year to check if it is a leap year\\n&quot;);<br />\n" +
            " scanf(&quot;%d&quot;, &amp;year);<br />\n" +
            " <br />\n" +
            " if ( year%400 == 0)<br />\n" +
            " printf(&quot;%d is a leap year.\\n&quot;, year);<br />\n" +
            " else if ( year%100 == 0)<br />\n" +
            " printf(&quot;%d is not a leap year.\\n&quot;, year);<br />\n" +
            " else if ( year%4 == 0 )<br />\n" +
            " printf(&quot;%d is a leap year.\\n&quot;, year);<br />\n" +
            " else<br />\n" +
            " printf(&quot;%d is not a leap year.\\n&quot;, year); <br />\n" +
            " <br />\n" +
            " return 0;<br />\n" +
            "}</p>";

    public static final String program5="<p>#include <stdio.h><br />\n" +
            " <br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " int c, n, fact = 1;<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter a number to calculate it's factorial\\n&quot;);<br />\n" +
            " scanf(&quot;%d&quot;, &amp;n);<br />\n" +
            " <br />\n" +
            " for (c = 1; c <= n; c++)<br />\n" +
            " fact = fact * c;<br />\n" +
            " <br />\n" +
            " printf(&quot;Factorial of %d = %d\\n&quot;, n, fact);<br />\n" +
            " <br />\n" +
            " return 0;<br />\n" +
            "}</p>";

    public static final String program6="<p>#include stdio.h><br />\n" +
            " <br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " int n, reverse = 0, temp;<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter a number to check if it is a palindrome or not\\n&quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;n);<br />\n" +
            " <br />\n" +
            " temp = n;<br />\n" +
            " <br />\n" +
            " while( temp != 0 )<br />\n" +
            " {<br />\n" +
            " reverse = reverse * 10;<br />\n" +
            " reverse = reverse + temp%10;<br />\n" +
            " temp = temp/10;<br />\n" +
            " }<br />\n" +
            " <br />\n" +
            " if ( n == reverse )<br />\n" +
            " printf(&quot;%d is a palindrome number.\\n&quot;, n);<br />\n" +
            " else<br />\n" +
            " printf(&quot;%d is not a palindrome number.\\n&quot;, n);<br />\n" +
            " <br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>Output:--</p>\n" +
            "\n" +
            "<p>Enter a number to check if it is a palindrome or not <br />\n" +
            "3 <br />\n" +
            "3 is a palindrome number.</p>";

    public static final String program7="<p>#include <stdio.h><br />\n" +
            " <br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " int row, c, n, temp;<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter the number of rows in pyramid of stars you wish to see &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;n);<br />\n" +
            " <br />\n" +
            " temp = n;<br />\n" +
            " <br />\n" +
            " for ( row = 1 ; row <= n ; row++ )<br />\n" +
            " {<br />\n" +
            " for ( c = 1 ; c < temp ; c++ )<br />\n" +
            " printf(&quot; &quot;);<br />\n" +
            " <br />\n" +
            " temp--;<br />\n" +
            " <br />\n" +
            " for ( c = 1 ; c <= 2*row - 1 ; c++ )<br />\n" +
            " printf(&quot;*&quot;);<br />\n" +
            " <br />\n" +
            " printf(&quot;\\n&quot;);<br />\n" +
            " }<br />\n" +
            " <br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>\n" +
            "Output:--</p>\n" +
            "\n" +
            "<p>Enter the number of rows in pyramid of stars you wish to see 6 <br />\n" +
            " * <br />\n" +
            " *** <br />\n" +
            " ***** <br />\n" +
            " ******* <br />\n" +
            " ********* <br />\n" +
            "***********</p>";

    public static final String program8="<p>#include stdio.h><br />\n" +
            " <br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " int n, i = 3, count, c;<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter the number of prime numbers required\\n&quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;n);<br />\n" +
            " <br />\n" +
            " if ( n >= 1 )<br />\n" +
            " {<br />\n" +
            " printf(&quot;First %d prime numbers are :\\n&quot;,n);<br />\n" +
            " printf(&quot;2\\n&quot;);<br />\n" +
            " }<br />\n" +
            " <br />\n" +
            " for ( count = 2 ; count <= n ; )<br />\n" +
            " {<br />\n" +
            " for ( c = 2 ; c <= i - 1 ; c++ )<br />\n" +
            " {<br />\n" +
            " if ( i%c == 0 )<br />\n" +
            " break;<br />\n" +
            " }<br />\n" +
            " if ( c == i )<br />\n" +
            " {<br />\n" +
            " printf(&quot;%d\\n&quot;,i);<br />\n" +
            " count++;<br />\n" +
            " }<br />\n" +
            " i++;<br />\n" +
            " }<br />\n" +
            " <br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>Output:--</p>\n" +
            "\n" +
            "<p>Enter the number of prime numbers required <br />\n" +
            "10 <br />\n" +
            "First 10 prime numbers are : <br />\n" +
            "2 <br />\n" +
            "3 <br />\n" +
            "5 <br />\n" +
            "7 <br />\n" +
            "11 <br />\n" +
            "13 <br />\n" +
            "17 <br />\n" +
            "19 <br />\n" +
            "23 <br />\n" +
            "29</p>";

    public static final String program9="<p>#include stdio.h><br />\n" +
            " <br />\n" +
            "int power(int, int);<br />\n" +
            " <br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " int n, sum = 0, temp, remainder, digits = 0;<br />\n" +
            " <br />\n" +
            " printf(&quot;Input an integer\\n&quot;);<br />\n" +
            " scanf(&quot;%d&quot;, &amp;n);<br />\n" +
            " <br />\n" +
            " temp = n;<br />\n" +
            " // Count number of digits<br />\n" +
            " while (temp != 0) {<br />\n" +
            " digits++;<br />\n" +
            " temp = temp/10;<br />\n" +
            " }<br />\n" +
            " <br />\n" +
            " temp = n;<br />\n" +
            " <br />\n" +
            " while (temp != 0) {<br />\n" +
            " remainder = temp%10;<br />\n" +
            " sum = sum + power(remainder, digits);<br />\n" +
            " temp = temp/10;<br />\n" +
            " }<br />\n" +
            " <br />\n" +
            " if (n == sum)<br />\n" +
            " printf(&quot;%d is an Armstrong number.\\n&quot;, n);<br />\n" +
            " else<br />\n" +
            " printf(&quot;%d is not an Armstrong number.\\n&quot;, n);<br />\n" +
            " <br />\n" +
            " return 0;<br />\n" +
            "}<br />\n" +
            " <br />\n" +
            "int power(int n, int r) {<br />\n" +
            " int c, p = 1;<br />\n" +
            " <br />\n" +
            " for (c = 1; c <= r; c++) <br />\n" +
            " p = p*n;<br />\n" +
            " <br />\n" +
            " return p; <br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>\n" +
            "Output:--</p>\n" +
            "\n" +
            "<p>Input an integer <br />\n" +
            "2561 <br />\n" +
            "2561 is not an Armstrong number.</p>";

    public static final String program10="<p>#include stdio.h><br />\n" +
            " <br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " int n, first = 0, second = 1, next, c;<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter the number of terms\\n&quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;n);<br />\n" +
            " <br />\n" +
            " printf(&quot;First %d terms of Fibonacci series are :-\\n&quot;,n);<br />\n" +
            " <br />\n" +
            " for ( c = 0 ; c < n ; c++ )<br />\n" +
            " {<br />\n" +
            " if ( c <= 1 )<br />\n" +
            " next = c;<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " next = first + second;<br />\n" +
            " first = second;<br />\n" +
            " second = next;<br />\n" +
            " }<br />\n" +
            " printf(&quot;%d\\n&quot;,next);<br />\n" +
            " }<br />\n" +
            " <br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>\n" +
            "Output:--</p>\n" +
            "\n" +
            "<p>Enter the number of terms <br />\n" +
            "6 <br />\n" +
            "First 6 terms of Fibonacci series are :- <br />\n" +
            "0 <br />\n" +
            "1 <br />\n" +
            "1 <br />\n" +
            "2 <br />\n" +
            "3 <br />\n" +
            "5</p>";

    public static final String program11="<p>#include stdio.h><br />\n" +
            " <br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " int array[100], maximum, size, c, location = 1;<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter the number of elements in array\\n&quot;);<br />\n" +
            " scanf(&quot;%d&quot;, &amp;size);<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter %d integers\\n&quot;, size);<br />\n" +
            " <br />\n" +
            " for (c = 0; c < size; c++)<br />\n" +
            " scanf(&quot;%d&quot;, &amp;array[c]);<br />\n" +
            " <br />\n" +
            " maximum = array[0];<br />\n" +
            " <br />\n" +
            " for (c = 1; c < size; c++)<br />\n" +
            " {<br />\n" +
            " if (array[c] > maximum)<br />\n" +
            " {<br />\n" +
            " maximum = array[c];<br />\n" +
            " location = c+1;<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " <br />\n" +
            " printf(&quot;Maximum element is present at location %d and it's value is %d.\\n&quot;, location, maximum);<br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>\n" +
            "Output:--</p>\n" +
            "\n" +
            "<p>Enter the number of elements in array <br />\n" +
            "5 <br />\n" +
            "Enter 5 integers <br />\n" +
            "2 <br />\n" +
            "3 <br />\n" +
            "5 <br />\n" +
            "6 <br />\n" +
            "1 <br />\n" +
            "Maximum element is present at location 4 and it's value is 6.</p>";


    public static final String program12="<p>Linear search in c:-</p>\n" +
            "\n" +
            "<p>#include stdio.h><br />\n" +
            " <br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " int array[100], search, c, n;<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter the number of elements in array\\n&quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;n);<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter %d integer(s)\\n&quot;, n);<br />\n" +
            " <br />\n" +
            " for (c = 0; c < n; c++)<br />\n" +
            " scanf(&quot;%d&quot;, &amp;array[c]);<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter the number to search\\n&quot;);<br />\n" +
            " scanf(&quot;%d&quot;, &amp;search);<br />\n" +
            " <br />\n" +
            " for (c = 0; c < n; c++)<br />\n" +
            " {<br />\n" +
            " if (array[c] == search) /* if required element found */<br />\n" +
            " {<br />\n" +
            " printf(&quot;%d is present at location %d.\\n&quot;, search, c+1);<br />\n" +
            " break;<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " if (c == n)<br />\n" +
            " printf(&quot;%d is not present in array.\\n&quot;, search);<br />\n" +
            " <br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>\n" +
            "Output:--</p>\n" +
            "\n" +
            "<p>Enter the number of elements in array <br />\n" +
            "8 <br />\n" +
            "Enter 8 integer(s) <br />\n" +
            "2 <br />\n" +
            "6 <br />\n" +
            "4 <br />\n" +
            "5 <br />\n" +
            "3 <br />\n" +
            "1 <br />\n" +
            "5 <br />\n" +
            "8 <br />\n" +
            "Enter the number to search <br />\n" +
            "2 <br />\n" +
            "2 is present at location 1.</p>\n" +
            "\n" +
            "<p>\n" +
            "C program for binary search:---</p>\n" +
            "\n" +
            "<p>#include stdio.h><br />\n" +
            " <br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " int c, first, last, middle, n, search, array[100];<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter number of elements\\n&quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;n);<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter %d integers\\n&quot;, n);<br />\n" +
            " <br />\n" +
            " for (c = 0; c < n; c++)<br />\n" +
            " scanf(&quot;%d&quot;,&amp;array[c]);<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter value to find\\n&quot;);<br />\n" +
            " scanf(&quot;%d&quot;, &amp;search);<br />\n" +
            " <br />\n" +
            " first = 0;<br />\n" +
            " last = n - 1;<br />\n" +
            " middle = (first+last)/2;<br />\n" +
            " <br />\n" +
            " while (first <= last) {<br />\n" +
            " if (array[middle] < search)<br />\n" +
            " first = middle + 1; <br />\n" +
            " else if (array[middle] == search) {<br />\n" +
            " printf(&quot;%d found at location %d.\\n&quot;, search, middle+1);<br />\n" +
            " break;<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " last = middle - 1;<br />\n" +
            " <br />\n" +
            " middle = (first + last)/2;<br />\n" +
            " }<br />\n" +
            " if (first > last)<br />\n" +
            " printf(&quot;Not found! %d is not present in the list.\\n&quot;, search);<br />\n" +
            " <br />\n" +
            " return 0; <br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>Output:-<br />\n" +
            "Enter number of elements <br />\n" +
            "4 <br />\n" +
            "Enter 4 integers <br />\n" +
            "2 <br />\n" +
            "5 <br />\n" +
            "6 <br />\n" +
            "3 <br />\n" +
            "Enter value to find <br />\n" +
            "5 <br />\n" +
            "5 found at location 2.</p>\n" +
            "\n" +
            "<p></p>\n" +
            "\n" +
            "<p></p>\n" +
            "\n" +
            "<p></p>";

    public static final String program13="<p>insertion sort in c:-</p>\n" +
            "\n" +
            "<p>/* insertion sort ascending order */<br />\n" +
            " <br />\n" +
            "#include stdio.h><br />\n" +
            " <br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " int n, array[1000], c, d, t;<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter number of elements\\n&quot;);<br />\n" +
            " scanf(&quot;%d&quot;, &amp;n);<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter %d integers\\n&quot;, n);<br />\n" +
            " <br />\n" +
            " for (c = 0; c < n; c++) {<br />\n" +
            " scanf(&quot;%d&quot;, &amp;array[c]);<br />\n" +
            " }<br />\n" +
            " <br />\n" +
            " for (c = 1 ; c <= n - 1; c++) {<br />\n" +
            " d = c;<br />\n" +
            " <br />\n" +
            " while ( d > 0 &amp;&amp; array[d] < array[d-1]) {<br />\n" +
            " t = array[d];<br />\n" +
            " array[d] = array[d-1];<br />\n" +
            " array[d-1] = t;<br />\n" +
            " <br />\n" +
            " d--;<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " <br />\n" +
            " printf(&quot;Sorted list in ascending order:\\n&quot;);<br />\n" +
            " <br />\n" +
            " for (c = 0; c <= n - 1; c++) {<br />\n" +
            " printf(&quot;%d\\n&quot;, array[c]);<br />\n" +
            " }<br />\n" +
            " <br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>Output:--<br />\n" +
            "Enter number of elements <br />\n" +
            "4 <br />\n" +
            "Enter 4 integers <br />\n" +
            "2 <br />\n" +
            "3 <br />\n" +
            "5 <br />\n" +
            "2 <br />\n" +
            "Sorted list in ascending order: <br />\n" +
            "2 <br />\n" +
            "2 <br />\n" +
            "3 <br />\n" +
            "5</p>\n" +
            "\n" +
            "<p>\n" +
            "C program for bubble sort:-</p>\n" +
            "\n" +
            "<p>/* Bubble sort code */<br />\n" +
            " <br />\n" +
            "#include stdio.h><br />\n" +
            " <br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " int array[100], n, c, d, swap;<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter number of elements\\n&quot;);<br />\n" +
            " scanf(&quot;%d&quot;, &amp;n);<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter %d integers\\n&quot;, n);<br />\n" +
            " <br />\n" +
            " for (c = 0; c < n; c++)<br />\n" +
            " scanf(&quot;%d&quot;, &amp;array[c]);<br />\n" +
            " <br />\n" +
            " for (c = 0 ; c < ( n - 1 ); c++)<br />\n" +
            " {<br />\n" +
            " for (d = 0 ; d < n - c - 1; d++)<br />\n" +
            " {<br />\n" +
            " if (array[d] > array[d+1]) /* For decreasing order use < */<br />\n" +
            " {<br />\n" +
            " swap = array[d];<br />\n" +
            " array[d] = array[d+1];<br />\n" +
            " array[d+1] = swap;<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " <br />\n" +
            " printf(&quot;Sorted list in ascending order:\\n&quot;);<br />\n" +
            " <br />\n" +
            " for ( c = 0 ; c < n ; c++ )<br />\n" +
            " printf(&quot;%d\\n&quot;, array[c]);<br />\n" +
            " <br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>\n" +
            "Output:--<br />\n" +
            "Enter number of elements <br />\n" +
            "3 <br />\n" +
            "Enter 3 integers <br />\n" +
            "3 <br />\n" +
            "6 <br />\n" +
            "2 <br />\n" +
            "Sorted list in ascending order: <br />\n" +
            "2 <br />\n" +
            "3 <br />\n" +
            "6 </p>\n" +
            "\n" +
            "<p>\n" +
            "Selection sort in c:--</p>\n" +
            "\n" +
            "<p>#include stdio.h><br />\n" +
            " <br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " int array[100], n, c, d, position, swap;<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter number of elements\\n&quot;);<br />\n" +
            " scanf(&quot;%d&quot;, &amp;n);<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter %d integers\\n&quot;, n);<br />\n" +
            " <br />\n" +
            " for ( c = 0 ; c < n ; c++ )<br />\n" +
            " scanf(&quot;%d&quot;, &amp;array[c]);<br />\n" +
            " <br />\n" +
            " for ( c = 0 ; c < ( n - 1 ) ; c++ )<br />\n" +
            " {<br />\n" +
            " position = c;<br />\n" +
            " <br />\n" +
            " for ( d = c + 1 ; d < n ; d++ )<br />\n" +
            " {<br />\n" +
            " if ( array[position] > array[d] )<br />\n" +
            " position = d;<br />\n" +
            " }<br />\n" +
            " if ( position != c )<br />\n" +
            " {<br />\n" +
            " swap = array[c];<br />\n" +
            " array[c] = array[position];<br />\n" +
            " array[position] = swap;<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " <br />\n" +
            " printf(&quot;Sorted list in ascending order:\\n&quot;);<br />\n" +
            " <br />\n" +
            " for ( c = 0 ; c < n ; c++ )<br />\n" +
            " printf(&quot;%d\\n&quot;, array[c]);<br />\n" +
            " <br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>\n" +
            "Output:--<br />\n" +
            "Enter number of elements <br />\n" +
            "5 <br />\n" +
            "Enter 5 integers <br />\n" +
            "3 <br />\n" +
            "2 <br />\n" +
            "6 <br />\n" +
            "3 <br />\n" +
            "4 <br />\n" +
            "Sorted list in ascending order: <br />\n" +
            "2 <br />\n" +
            "3 <br />\n" +
            "3 <br />\n" +
            "4 <br />\n" +
            "6</p>";

    public static final String program14="<p>#include stdio.h><br />\n" +
            " <br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " int m, n, c, d, first[10][10], second[10][10], sum[10][10];<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter the number of rows and columns of matrix\\n&quot;);<br />\n" +
            " scanf(&quot;%d%d&quot;, &amp;m, &amp;n);<br />\n" +
            " printf(&quot;Enter the elements of first matrix\\n&quot;);<br />\n" +
            " <br />\n" +
            " for (c = 0; c < m; c++)<br />\n" +
            " for (d = 0; d < n; d++)<br />\n" +
            " scanf(&quot;%d&quot;, &amp;first[c][d]);<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter the elements of second matrix\\n&quot;);<br />\n" +
            " <br />\n" +
            " for (c = 0; c < m; c++)<br />\n" +
            " for (d = 0 ; d < n; d++)<br />\n" +
            " scanf(&quot;%d&quot;, &amp;second[c][d]);<br />\n" +
            " <br />\n" +
            " printf(&quot;Sum of entered matrices:-\\n&quot;);<br />\n" +
            " <br />\n" +
            " for (c = 0; c < m; c++) {<br />\n" +
            " for (d = 0 ; d < n; d++) {<br />\n" +
            " sum[c][d] = first[c][d] + second[c][d];<br />\n" +
            " printf(&quot;%d\\t&quot;, sum[c][d]);<br />\n" +
            " }<br />\n" +
            " printf(&quot;\\n&quot;);<br />\n" +
            " }<br />\n" +
            " <br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>Output:--</p>\n" +
            "\n" +
            "<p>Enter the number of rows and columns of matrix <br />\n" +
            "2 <br />\n" +
            "2 <br />\n" +
            "Enter the elements of first matrix <br />\n" +
            "2 <br />\n" +
            "2 <br />\n" +
            "2 <br />\n" +
            "3 <br />\n" +
            "Enter the elements of second matrix <br />\n" +
            "6 <br />\n" +
            "6 <br />\n" +
            "6 <br />\n" +
            "5 <br />\n" +
            "Sum of entered matrices:- <br />\n" +
            "8 8 <br />\n" +
            "8 8</p>";

    public static final String program15="<p># include <stdio.h><br />\n" +
            "# include <conio.h><br />\n" +
            "void main() <br />\n" +
            "{ <br />\n" +
            " int i, n, exp; <br />\n" +
            " float x, sum = 1, t = 1 ; <br />\n" +
            " clrscr() ; <br />\n" +
            " printf(&quot;Enter the value for x : &quot;) ; <br />\n" +
            " scanf(&quot;%f&quot;, &amp;x) ; <br />\n" +
            " printf(&quot;\\nEnter the value for n : &quot;) ; <br />\n" +
            " scanf(&quot;%d&quot;, &amp;n) ; <br />\n" +
            " for(i = 1 ; i < n + 1 ; i++) <br />\n" +
            " { <br />\n" +
            " exp = i ; <br />\n" +
            " t = t * x / exp ; <br />\n" +
            " sum = sum + t ; <br />\n" +
            " } <br />\n" +
            " printf(&quot;\\nExponential Value of %f is : %8.4f&quot;, x, sum) ; <br />\n" +
            " getch() ; <br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>Output of above program is</p>\n" +
            "\n" +
            "<p>Enter the value for x : 2 <br />\n" +
            "Enter the value for n : 20 <br />\n" +
            "Exponential Value of 2.000000 is : 7.389</p>";

    public static final String program16="<p>#include stdio.h><br />\n" +
            " <br />\n" +
            "int main() {<br />\n" +
            " int a, b, c;<br />\n" +
            " <br />\n" +
            " printf(&quot;\\nEnter value of a, b &amp; c : &quot;);<br />\n" +
            " scanf(&quot;%d %d %d&quot;, &amp;a, &amp;b, &amp;c);<br />\n" +
            " <br />\n" +
            " if ((a > b) &amp;&amp; (a > c))<br />\n" +
            " printf(&quot;\\na is greatest&quot;);<br />\n" +
            " <br />\n" +
            " if ((b > c) &amp;&amp; (b > a))<br />\n" +
            " printf(&quot;\\nb is greatest&quot;);<br />\n" +
            " <br />\n" +
            " if ((c > a) &amp;&amp; (c > b))<br />\n" +
            " printf(&quot;\\nc is greatest&quot;);<br />\n" +
            " <br />\n" +
            " return(0);<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>Output:--</p>\n" +
            "\n" +
            "<p>Enter value for a,b &amp; c : 15 17 21<br />\n" +
            "c is greatest</p>";

    public static final String program17="<p>#include stdio.h><br />\n"+
            " <br />\n"+
            "int main() {<br />\n"+
            " int i = 1;<br />\n"+
            " <br />\n"+
            " for (i = 1; i <= 10; i++) {<br />\n"+
            " printf(&quot;%d&quot;, i);<br />\n"+
            " }<br />\n"+
            " return (0);<br />\n"+
            "}</p>\n"+
            "\n"+
            "<p>\n"+
            "Output:--<br />\n"+
            "12345678910</p>";

    public static final String program18="<p>#include stdio.h><br />\n" +
            " <br />\n" +
            "int main() {<br />\n" +
            " int num, i = 1, sum = 0;<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter a number: &quot;);<br />\n" +
            " scanf(&quot;%d&quot;, &amp;num);<br />\n" +
            " <br />\n" +
            " while (i < num) {<br />\n" +
            " if (num % i == 0) {<br />\n" +
            " sum = sum + i;<br />\n" +
            " }<br />\n" +
            " i++;<br />\n" +
            " }<br />\n" +
            " <br />\n" +
            " if (sum == num)<br />\n" +
            " printf(&quot;%d is a Perfect Number&quot;, i);<br />\n" +
            " else<br />\n" +
            " printf(&quot;%d is Non Perfect Number&quot;, i);<br />\n" +
            " <br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>\n" +
            "Output:--<br />\n" +
            "Enter a number: 256 <br />\n" +
            "256 is Non Perfect Number <br />\n" +
            "</p>";
    public static final String program19="<p>#include stdio.h><br />\n" +
            " <br />\n" +
            "int main() {<br />\n" +
            " int num, i = 1, sum = 0;<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter a number: &quot;);<br />\n" +
            " scanf(&quot;%d&quot;, &amp;num);<br />\n" +
            " <br />\n" +
            " while (i < num) {<br />\n" +
            " if (num % i == 0) {<br />\n" +
            " sum = sum + i;<br />\n" +
            " }<br />\n" +
            " i++;<br />\n" +
            " }<br />\n" +
            " <br />\n" +
            " if (sum == num)<br />\n" +
            " printf(&quot;%d is a Perfect Number&quot;, i);<br />\n" +
            " else<br />\n" +
            " printf(&quot;%d is Non Perfect Number&quot;, i);<br />\n" +
            " <br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>\n" +
            "Output:--<br />\n" +
            "Enter a number: 256 <br />\n" +
            "256 is Non Perfect Number <br />\n" +
            "</p>";

    public static final String program20="<p>#include stdio.h><br />\n" +
            " <br />\n" +
            "int main() {<br />\n" +
            " int a, b, x, y, t, gcd, lcm;<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter two integers\\n&quot;);<br />\n" +
            " scanf(&quot;%d%d&quot;, &amp;x, &amp;y);<br />\n" +
            " <br />\n" +
            " a = x;<br />\n" +
            " b = y;<br />\n" +
            " <br />\n" +
            " while (b != 0) {<br />\n" +
            " t = b;<br />\n" +
            " b = a % b;<br />\n" +
            " a = t;<br />\n" +
            " }<br />\n" +
            " <br />\n" +
            " gcd = a;<br />\n" +
            " lcm = (x*y)/gcd;<br />\n" +
            " <br />\n" +
            " printf(&quot;Greatest common divisor of %d and %d = %d\\n&quot;, x, y, gcd);<br />\n" +
            " printf(&quot;Least common multiple of %d and %d = %d\\n&quot;, x, y, lcm);<br />\n" +
            " <br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>Output:--<br />\n" +
            "Enter two integers <br />\n" +
            "6 <br />\n" +
            "3 <br />\n" +
            "Greatest common divisor of 6 and 3 = 3 <br />\n" +
            "Least common multiple of 6 and 3 = 6 </p>";

    public static final String program21="<p>#include  stdio.h><br />\n" +
            " <br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " int a, b;<br />\n" +
            " <br />\n" +
            " printf(&quot;Enter two integers to swap\\n&quot;);<br />\n" +
            " scanf(&quot;%d%d&quot;, &amp;a, &amp;b);<br />\n" +
            " <br />\n" +
            " a = a + b;<br />\n" +
            " b = a - b;<br />\n" +
            " a = a - b;<br />\n" +
            " <br />\n" +
            " printf(&quot;a = %d\\nb = %d\\n&quot;,a,b);<br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>\n" +
            "Output--<br />\n" +
            "Enter two integers to swap <br />\n" +
            "5 <br />\n" +
            "3 <br />\n" +
            "a = 3 <br />\n" +
            "b = 5</p>0";

    public static final String program22="<p>#include stdio.h><br />\n" +
            "#include math.h></p>\n" +
            "\n" +
            "<p>int main()<br />\n" +
            "{<br />\n" +
            " double a, b, c, determinant, root1,root2, realPart, imaginaryPart;</p>\n" +
            "\n" +
            "<p> printf(&quot;Enter coefficients a, b and c: &quot;);<br />\n" +
            " scanf(&quot;%lf %lf %lf&quot;,&amp;a, &amp;b, &amp;c);</p>\n" +
            "\n" +
            "<p> determinant = b*b-4*a*c;</p>\n" +
            "\n" +
            "<p> // condition for real and different roots<br />\n" +
            " if (determinant > 0)<br />\n" +
            " {<br />\n" +
            " // sqrt() function returns square root<br />\n" +
            " root1 = (-b+sqrt(determinant))/(2*a);<br />\n" +
            " root2 = (-b-sqrt(determinant))/(2*a);</p>\n" +
            "\n" +
            "<p> printf(&quot;root1 = %.2lf and root2 = %.2lf&quot;,root1 , root2);<br />\n" +
            " }</p>\n" +
            "\n" +
            "<p> //condition for real and equal roots<br />\n" +
            " else if (determinant == 0)<br />\n" +
            " {<br />\n" +
            " root1 = root2 = -b/(2*a);</p>\n" +
            "\n" +
            "<p> printf(&quot;root1 = root2 = %.2lf;&quot;, root1);<br />\n" +
            " }</p>\n" +
            "\n" +
            "<p> // if roots are not real <br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " realPart = -b/(2*a);<br />\n" +
            " imaginaryPart = sqrt(-determinant)/(2*a);<br />\n" +
            " printf(&quot;root1 = %.2lf+%.2lfi and root2 = %.2f-%.2fi&quot;, realPart, imaginaryPart, realPart, imaginaryPart);<br />\n" +
            " }</p>\n" +
            "\n" +
            "<p> return 0;<br />\n" +
            "} </p>\n" +
            "\n" +
            "<p>\n" +
            "output:--<br />\n" +
            "Enter coefficients a, b and c: 2.3<br />\n" +
            "4<br />\n" +
            "5.6<br />\n" +
            "Roots are: -0.87+1.30i and -0.87-1.30i</p>";
}


