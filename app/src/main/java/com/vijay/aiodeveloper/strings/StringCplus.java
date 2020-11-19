package com.vijay.aiodeveloper.strings;

/**
 * Created by Rajat_Pc on 27/06/2017.
 */

public class StringCplus {
    public static final String cplusprogram1="<p>#include<iostream><br />\n" +
            "#include<conio.h></p>\n" +
            "\n" +
            "<p>//Standard namespace declaration<br />\n" +
            "using namespace std;</p>\n" +
            "\n" +
            "<p>//Main Function<br />\n" +
            "int main()<br />\n" +
            "{</p>\n" +
            "\n" +
            "<p> //Standard Ouput Statement<br />\n" +
            " cout<<&quot;My First C++ Program&quot;;</p>\n" +
            "\n" +
            "<p> // Wait For Output Screen<br />\n" +
            " getch();</p>\n" +
            "\n" +
            "<p> //Main Function return Statement<br />\n" +
            " return 0;<br />\n" +
            "}</p>";
    public static final String cplusprogram2="<p>#include<iostream><br />\n" +
            "#include<conio.h></p>\n" +
            "\n" +
            "<p>using namespace std;<br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " // Variable Declaration<br />\n" +
            " int a;<br />\n" +
            " <br />\n" +
            " //Get Input Value<br />\n" +
            " cout<<&quot;Enter the Number :&quot;;<br />\n" +
            " cin>>a;<br />\n" +
            " <br />\n" +
            " //If Condition Check<br />\n" +
            " if(a > 10)<br />\n" +
            " {<br />\n" +
            " // Block For Condition Success<br />\n" +
            " cout<<a<<&quot; Is Greater than 10&quot;;<br />\n" +
            " }<br />\n" +
            " <br />\n" +
            " // Wait For Output Screen<br />\n" +
            " getch();<br />\n" +
            " return 0;<br />\n" +
            " }</p>\n" +
            "\n" +
            "<p>\n" +
            "Sample Output</p>\n" +
            "\n" +
            "<p>Enter the Number :15<br />\n" +
            "15 Is Greater than 10</p>";
    public static final String cplusprogram3="<p>#include<iostream><br />\n" +
            "#include<conio.h></p>\n" +
            "\n" +
            "<p>using namespace std;</p>\n" +
            "\n" +
            "<p>int main()<br />\n" +
            "{</p>\n" +
            "\n" +
            "<p> // Variable Declaration<br />\n" +
            " int a;</p>\n" +
            "\n" +
            "<p> // Get Input Value<br />\n" +
            " cout<<&quot;Enter the Number :&quot;;<br />\n" +
            " cin>>a;</p>\n" +
            "\n" +
            "<p> //If Condition Check<br />\n" +
            " if(a > 10)<br />\n" +
            " {<br />\n" +
            " // Block For Condition Success<br />\n" +
            " cout<<a<<&quot; Is Greater than 10&quot;;<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " // Block For Condition Fail<br />\n" +
            " cout<<a<<&quot; Is Less than/Equal 10&quot;;<br />\n" +
            " }</p>\n" +
            "\n" +
            "<p> // Wait For Output Screen<br />\n" +
            " getch();<br />\n" +
            " return 0;<br />\n" +
            " }</p>";
    public static final String cplusprogram4="<p>#include <iostream><br />\n" +
            "#define size 16<br />\n" +
            "using namespace std;</p>\n" +
            "\n" +
            "<p>int main ()<br />\n" +
            "{<br />\n" +
            " int m,n;<br />\n" +
            " int a[size][size];<br />\n" +
            " cout<<&quot;Enter the number of rows&quot;<<endl;<br />\n" +
            " cin>>m;<br />\n" +
            " cout<<&quot;Enter the number of columns&quot;<<endl;<br />\n" +
            " cin>>n;<br />\n" +
            " cout<<&quot;Enter the Elements in Table&quot;<<endl;<br />\n" +
            " for ( int i = 0; i < m; i++ )<br />\n" +
            " {<br />\n" +
            " for ( int j = 0; j < n; j++ )<br />\n" +
            " {<br />\n" +
            " cin >>a[i][j];<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            "// output each array element&quot;s value<br />\n" +
            " for ( int i = 0; i < m; i++ )<br />\n" +
            " for ( int j = 0; j < n; j++ )<br />\n" +
            " {<br />\n" +
            " cout << &quot;a[&quot; << i << &quot;][&quot; << j << &quot;]: &quot;;<br />\n" +
            " cout << a[i][j]<< endl;<br />\n" +
            " }<br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>Output:<br />\n" +
            "Enter the number of rows<br />\n" +
            "2<br />\n" +
            "Enter the number of columns<br />\n" +
            "3<br />\n" +
            "Enter the Elements in Table<br />\n" +
            "1 2 3 4 5 6<br />\n" +
            "a[0][0]: 1<br />\n" +
            "a[0][1]: 2<br />\n" +
            "a[0][2]: 3<br />\n" +
            "a[1][0]: 4<br />\n" +
            "a[1][1]: 5<br />\n" +
            "a[1][2]: 6<br />\n" +
            "</p>";
    public static final String cplusprogram5="<p>#include < iostream.h ></p>\n" +
            "\n" +
            "<p>int main()<br />\n" +
            "{<br />\n" +
            " int n, sum = 0, c, value;<br />\n" +
            " cout<<&quot;Enter the number of integers you want to add\\n&quot;;<br />\n" +
            " cin>>n;<br />\n" +
            " cout<<&quot;Enter&quot;<<n<<&quot;integers&quot;<<&quot;\\n&quot;;<br />\n" +
            " for (c = 1; c <= n; c++)<br />\n" +
            " {<br />\n" +
            " cin>>value;<br />\n" +
            " sum = sum + value;<br />\n" +
            " /*adding each no in sum*/<br />\n" +
            " }<br />\n" +
            " cout<<&quot;Sum of entered integers =&quot;<<sum<<&quot;\\n&quot;;<br />\n" +
            " return 0;<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram6="<p>#include < iostream.h ></p>\n" +
            "\n" +
            "<p>int main()<br />\n" +
            "{<br />\n" +
            " int first, second, add, subtract, multiply;<br />\n" +
            " float divide;<br />\n" +
            " cout<<&quot;Enter two integers\\n&quot;;<br />\n" +
            " cin>>first>>second;<br />\n" +
            " add = first + second;<br />\n" +
            " subtract = first - second;<br />\n" +
            " multiply = first * second;<br />\n" +
            " divide = first / (float)second;<br />\n" +
            "//typecasting<br />\n" +
            " cout<<&quot;Sum = &quot;<<add<<&quot;\\n&quot;;<br />\n" +
            " cout<<&quot;Difference =&quot;<<subtract<<&quot;\\n&quot;;<br />\n" +
            " cout<<&quot;Multiplication =&quot;<<multiply<<&quot;\\n&quot;;<br />\n" +
            " cout<<&quot;Division =&quot;<<divide<<&quot;\\n&quot;;<br />\n" +
            " return 0;<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram7="<p>#include <iostream><br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " int n, sum = 0, remainder;<br />\n" +
            " cout<<&quot;Enter an integer\\n&quot;;<br />\n" +
            " cin>>n;<br />\n" +
            " while(n != 0)<br />\n" +
            " {<br />\n" +
            " remainder = n % 10;<br />\n" +
            " /*stores unit place digit to remainder*/<br />\n" +
            " sum = sum + remainder;<br />\n" +
            " n = n / 10;<br />\n" +
            " /*dividing no to discard unit place digit*/<br />\n" +
            " }<br />\n" +
            " cout<<&quot;Sum of digits of entered number = &quot;<<sum<<endl;<br />\n" +
            " return 0;<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram8="<p>#include < iostream.h ></p>\n" +
            "\n" +
            "<p>int main()<br />\n" +
            "{<br />\n" +
            " int m, n, c, d, first[10][10], second[10][10], sum[10][10];<br />\n" +
            " cout<<&quot;Enter the number of rows and columns of matrix\\n&quot;;<br />\n" +
            " cin>>m>>n;<br />\n" +
            " cout<<&quot;Enter the elements of first matrix\\n&quot;;<br />\n" +
            " for ( c = 0 ; c < m ; c++ )<br />\n" +
            " for ( d = 0 ; d < n ; d++ )<br />\n" +
            " cin>>first[c][d];<br />\n" +
            " cout<<&quot;Enter the elements of second matrix\\n&quot;;<br />\n" +
            " for ( c = 0 ; c < m ; c++ )<br />\n" +
            " for ( d = 0 ; d < n ; d++ )<br />\n" +
            " cin>>second[c][d];<br />\n" +
            " for ( c = 0 ; c < m ; c++ )<br />\n" +
            " for ( d = 0 ; d < n ; d++ )<br />\n" +
            " sum[c][d] = first[c][d] + second[c][d];<br />\n" +
            " /* Matrix addition */<br />\n" +
            " cout<<&quot;Sum of entered matrices:-\\n&quot;;<br />\n" +
            " for ( c = 0 ; c < m ; c++ )<br />\n" +
            " {<br />\n" +
            " for ( d = 0 ; d < n ; d++ )<br />\n" +
            " cout<<sum[c][d]<<&quot;\\t&quot;;<br />\n" +
            " cout<<&quot;\\n&quot;;<br />\n" +
            " }<br />\n" +
            " return 0;<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram9="<p>#include < iostream.h ></p>\n" +
            "\n" +
            "<p>void main()<br />\n" +
            "{<br />\n" +
            " int height, base;<br />\n" +
            " float ans;/*ans may come in fractions*/<br />\n" +
            " cout<<&quot;Enter height and base&quot;;<br />\n" +
            " cin>>height>>base;<br />\n" +
            " ans= (1/2)*height*base;<br />\n" +
            " /* mathematical formula*/<br />\n" +
            " cout<<&quot;Area if triangle is&quot;<<ans;<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram10="<p>#include < iostream.h ><br />\n" +
            "using namespace std;</p>\n" +
            "\n" +
            "<p>class Cube<br />\n" +
            "{<br />\n" +
            "public:</p>\n" +
            "\n" +
            "<p> void setLength( double l )<br />\n" +
            " {<br />\n" +
            " length = l;<br />\n" +
            " }</p>\n" +
            "\n" +
            "<p> void setBreadth( double b )<br />\n" +
            " {<br />\n" +
            " breadth = b;<br />\n" +
            " }</p>\n" +
            "\n" +
            "<p> void setHeight( double h )<br />\n" +
            " {<br />\n" +
            " height = h;<br />\n" +
            " }<br />\n" +
            " double getVolume(void)<br />\n" +
            " {<br />\n" +
            " return length * breadth * height;<br />\n" +
            " }</p>\n" +
            "\n" +
            "<p>// Overload + operator to add two Cube objects.<br />\n" +
            " Cube operator+(const Cube&amp; b)<br />\n" +
            " {<br />\n" +
            " Cube C;<br />\n" +
            " C.length = this->length + b.length;<br />\n" +
            " C.breadth = this->breadth + b.breadth;<br />\n" +
            " C.height = this->height + b.height;<br />\n" +
            " return C;<br />\n" +
            " }<br />\n" +
            "private:<br />\n" +
            " double length; // Length of a Cube<br />\n" +
            " double breadth; // Breadth of a Cube<br />\n" +
            " double height; // Height of a Cube<br />\n" +
            "};<br />\n" +
            "// Main function for the program<br />\n" +
            "int main( )<br />\n" +
            "{<br />\n" +
            " Cube C1; // Declare C1 of type Cube<br />\n" +
            " Cube C2; // Declare C2 of type Cube<br />\n" +
            " Cube C3; // Declare C3 of type Cube<br />\n" +
            " double volume = 0.0; // Store the volume of a Cube here<br />\n" +
            "// Cube 1 specification<br />\n" +
            " C1.setLength(4.0);<br />\n" +
            " C1.setBreadth(6.0);<br />\n" +
            " C1.setHeight(5.0);<br />\n" +
            "// Cube 2 specification<br />\n" +
            " C2.setLength(8.0);<br />\n" +
            " C2.setBreadth(4.0);<br />\n" +
            " C2.setHeight(10.0);<br />\n" +
            "// volume of Cube 1<br />\n" +
            " volume = C1.getVolume();<br />\n" +
            " cout << &quot;Volume of Cube 1 : &quot; << volume <<endl;<br />\n" +
            "// volume of Cube 2<br />\n" +
            " volume = C2.getVolume();<br />\n" +
            " cout << &quot;Volume of Cube 2 : &quot; << volume <<endl;<br />\n" +
            "// Add two object as follows:<br />\n" +
            " C3 = C1 + C2;<br />\n" +
            "// volume of Cube 3<br />\n" +
            " volume = C3.getVolume();<br />\n" +
            " cout << &quot;Volume of Cube 3 : &quot; << volume <<endl;<br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>Output<br />\n" +
            "Volume of Cube 1 : 120<br />\n" +
            "Volume of Cube 2 : 320<br />\n" +
            "Volume of Cube 3 : 1800<br />\n" +
            "</p>";
    public static final String cplusprogram11="<p>#include < iostream.h ><br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " int a[10],i,n,m,c,l,u;<br />\n" +
            " cout<<&quot;Enter the size of an array: &quot;;<br />\n" +
            " cin>>n;<br />\n" +
            " cout<<&quot;Enter the elements of the array: &quot; ;<br />\n" +
            " for(i=0; i < n; i++)<br />\n" +
            " cin>>a[i];<br />\n" +
            " cout<<&quot;Enter the number to be search: &quot;;<br />\n" +
            " cin>>m;<br />\n" +
            " l=0,u=n-1;<br />\n" +
            " c=binary(a,n,m,l,u);<br />\n" +
            " if(c==0)<br />\n" +
            " cout<<&quot;Number is not found.&quot;;<br />\n" +
            " else<br />\n" +
            " cout<<&quot;Number is found.&quot;;<br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>/*Binary search will search element at middle, if element is not found and if element to be searched is less than middle then it will search only in lower part and if greater then in upper part */</p>\n" +
            "\n" +
            "<p>int binary(int a[],int n,int m,int l,int u)<br />\n" +
            "{<br />\n" +
            " int mid,c=0;<br />\n" +
            " if(l < = u)<br />\n" +
            " {<br />\n" +
            " mid=(l+u)/2;<br />\n" +
            " if(m==a[mid])<br />\n" +
            " {<br />\n" +
            " c=1;<br />\n" +
            " }<br />\n" +
            " else if(m < a[mid])<br />\n" +
            " {<br />\n" +
            " return binary(a,n,m,l,mid-1);<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " return binary(a,n,m,mid+1,u);<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " return c;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>Output:</p>\n" +
            "\n" +
            "<p>Enter the size of an array:4<br />\n" +
            "Enter the elements of the array:5 3 6 2<br />\n" +
            "Enter the number to be search:3<br />\n" +
            "Number is found.<br />\n" +
            "Number is found.<br />\n" +
            "</p>";
    public static final String cplusprogram12="<p>#include < iostream.h ></p>\n" +
            "\n" +
            "<p>void main()<br />\n" +
            "{<br />\n" +
            " int num, binary_val, decimal_val = 0, base = 1, rem;<br />\n" +
            " cout<<&quot;Enter a binary number(1s and 0s) \\n&quot;;<br />\n" +
            " cin>>amp num;<br />\n" +
            " binary_val = num;<br />\n" +
            " while (num > 0)<br />\n" +
            " {<br />\n" +
            " rem = num % 10;<br />\n" +
            " decimal_val = decimal_val + rem * base;<br />\n" +
            " num = num / 10 ;<br />\n" +
            " num = num / 10 ;<br />\n" +
            " base = base * 2;<br />\n" +
            " }<br />\n" +
            " cout<<&quot;The Binary number is =&quot;<<binary_val<<&quot; \\n&quot;;<br />\n" +
            " cout<<&quot;Its decimal equivalent is =&quot;<<decimal_val<<&quot; \\n&quot;;<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram13="<p>#include < iostream.h></p>\n" +
            "\n" +
            "<p>int main()<br />\n" +
            "{<br />\n" +
            " long int binaryval, hexadecimalval = 0, i = 1, remainder;<br />\n" +
            " cout<<&quot;Enter the binary number: &quot;;<br />\n" +
            " cin>>binaryval;<br />\n" +
            " while (binaryval != 0)<br />\n" +
            " {<br />\n" +
            " remainder = binaryval % 10;<br />\n" +
            " hexadecimalval = hexadecimalval + remainder * i;<br />\n" +
            " i = i * 2;<br />\n" +
            " binaryval = binaryval / 10;<br />\n" +
            " }<br />\n" +
            " cout<<&quot;Equivalent hexadecimal value:&quot;<<hexadecimalval;<br />\n" +
            " return 0;<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram14="<p>#include < iostream.h></p>\n" +
            "\n" +
            "<p>int main()<br />\n" +
            "{<br />\n" +
            " long int binarynum, octalnum = 0, j = 1, remainder;<br />\n" +
            " cout<<&quot;Enter the value for binary number: &quot;;<br />\n" +
            " cin>>binarynum;<br />\n" +
            " while (binarynum != 0)<br />\n" +
            " {<br />\n" +
            " remainder = binarynum % 10;<br />\n" +
            " octalnum = octalnum + remainder * j;<br />\n" +
            " j = j * 2;<br />\n" +
            " binarynum = binarynum / 10;<br />\n" +
            " }<br />\n" +
            " cout<<&quot;Equivalent octal value:&quot;<<octalnum;<br />\n" +
            " return 0;<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram15="<p>#include < iostream.h ></p>\n" +
            "\n" +
            "<p>int main()<br />\n" +
            "{<br />\n" +
            " int n, c, k;<br />\n" +
            " cout<<&quot;Enter an integer in decimal number system\\n&quot;;<br />\n" +
            " cin>>n;<br />\n" +
            " cout<<n<<&quot;in binary number system is:\\n&quot;;<br />\n" +
            " for (c = 31; c >= 0; c--)<br />\n" +
            " {<br />\n" +
            " k = n >> c;<br />\n" +
            " /*Right shift(Binary Divide by 2)*/<br />\n" +
            " if (k &amp; 1)//k is logically ANDed with 1<br />\n" +
            " cout<<&quot;1&quot;;<br />\n" +
            " else<br />\n" +
            " cout<<&quot;0&quot;;<br />\n" +
            " }<br />\n" +
            " return 0;<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram16="<p>#include <iostream.h></p>\n" +
            "\n" +
            "<p>void main()<br />\n" +
            "{<br />\n" +
            " long num, decimal_num, remainder, base = 1, octal = 0;<br />\n" +
            " cout<<&quot;Enter a decimal integer \\n&quot;;<br />\n" +
            " cin>>amp num;<br />\n" +
            " decimal_num = num;<br />\n" +
            " while (num > 0)<br />\n" +
            " {<br />\n" +
            " remainder = num % 8;<br />\n" +
            " octal = octal + remainder * base;<br />\n" +
            " num = num / 8;<br />\n" +
            " base = base * 10;<br />\n" +
            " }<br />\n" +
            " cout<<&quot;Input number is =&quot;<<decimal_num<<&quot;\\n&quot;;<br />\n" +
            " cout<<&quot;Its octal equivalent is =&quot;<<Octal<<&quot;\\n&quot;;<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram17="<p>#include <iostream.h><br />\n" +
            "#include<conio.h></p>\n" +
            "\n" +
            "<p>void main()<br />\n" +
            "{<br />\n" +
            " clrscr(); //clear screen<br />\n" +
            " int number;<br />\n" +
            " cout<< &quot;Enter an integer: &quot;;<br />\n" +
            " cin>> number;<br />\n" +
            " if ( number >= 0)<br />\n" +
            " {<br />\n" +
            " cout << &quot;You entered a positive integer: &quot;<<number<<endl;<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " cout<<&quot;You entered a negative integer: &quot;<<number<<endl;<br />\n" +
            " }<br />\n" +
            " cout<<&quot;This statement is always executed because it's outside if...else statement.&quot;;<br />\n" +
            " getch();<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram18="<p>#include <ctime><br />\n" +
            "#include <iostream><br />\n" +
            "using namespace std;</p>\n" +
            "\n" +
            "<p>int main()<br />\n" +
            "{<br />\n" +
            " time_t t = time(0); // get time now<br />\n" +
            " struct tm * now = localtime( &amp; t );<br />\n" +
            " cout << &quot;Current Date is : &quot;<br />\n" +
            " cout << now->tm_mday << '-'<< (now->tm_mon + 1) << '-' << (now->tm_year + 1900) << endl;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>Output<br />\n" +
            "Current Date is : 16-6-2015<br />\n" +
            "</p>";
    public static final String cplusprogram19="<p>#include < iostream.h ><br />\n" +
            "#include < string.h ></p>\n" +
            "\n" +
            "<p>int check_vowel(char);</p>\n" +
            "\n" +
            "<p>int main()<br />\n" +
            "{<br />\n" +
            " char s[100], t[100];<br />\n" +
            " int i, j = 0;<br />\n" +
            " cout<<&quot;Enter a string to delete vowels\\n&quot;;<br />\n" +
            " gets(s);<br />\n" +
            " /* In the program we create a new string and process entered string character by character, and if a vowel is found it is not added to new string otherwise the character is added to new string, after the string ends we copy the new string into original string*/<br />\n" +
            " for(i = 0; s[i] != '\\0'; i++)<br />\n" +
            " {<br />\n" +
            " if(check_vowel(s[i]) == 0)<br />\n" +
            " {<br />\n" +
            " /* not a vowel */<br />\n" +
            " t[j] = s[i];<br />\n" +
            " j++<br />\n" +
            " ;<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " t[j] = '\\0';<br />\n" +
            " strcpy(s, t);<br />\n" +
            " /* We are changing initial string */<br />\n" +
            " cout<<&quot;String after deleting vowels:&quot;<< s<<&quot;\\n&quot;;<br />\n" +
            " return 0;<br />\n" +
            "}<br />\n" +
            "int check_vowel(char c)<br />\n" +
            "{<br />\n" +
            " switch(c)<br />\n" +
            " {<br />\n" +
            " case 'a':<br />\n" +
            " case 'A':<br />\n" +
            " case 'e':<br />\n" +
            " case 'E':<br />\n" +
            " case 'i':<br />\n" +
            " case 'I':<br />\n" +
            " case 'o':<br />\n" +
            " case 'O':<br />\n" +
            " case 'u':<br />\n" +
            " case 'U':<br />\n" +
            " return 1;<br />\n" +
            " default:<br />\n" +
            " return 0;<br />\n" +
            " }<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram20="<p>#include <iostream.h><br />\n" +
            "#include <conio.h></p>\n" +
            "\n" +
            "<p>void main()<br />\n" +
            "{<br />\n" +
            " clrscr();<br />\n" +
            " cout << &quot;Size of char: &quot; << sizeof(char) << &quot; byte&quot; << endl;<br />\n" +
            " cout << &quot;Size of int: &quot; << sizeof(int) << &quot; bytes&quot; << endl;<br />\n" +
            " cout << &quot;Size of float: &quot; << sizeof(float) << &quot; bytes&quot; << endl;<br />\n" +
            " cout << &quot;Size of double: &quot; << sizeof(double) << &quot; bytes&quot; << endl;<br />\n" +
            " getch();<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram21="<p>#include<stdlib.h></p>\n" +
            "\n" +
            "<p>int main()<br />\n" +
            "{<br />\n" +
            " system(&quot;C:\\\\Windows\\\\System32\\\\ipconfig&quot;);<br />\n" +
            " /* ipconfig command to get ip of system */<br />\n" +
            " return 0;<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram22="<p>#include < iostream.h ></p>\n" +
            "\n" +
            "<p>long gcd(long, long);<br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " long x, y, hcf, lcm;<br />\n" +
            " cout<<&quot;Enter two integers\\n&quot;;<br />\n" +
            " cin>>x>>y;<br />\n" +
            " hcf = gcd(x, y);<br />\n" +
            " lcm = (x*y)/hcf;<br />\n" +
            " cout<<&quot;Greatest common divisor of &quot;<<x <<&quot;and&quot;<<y<<&quot; = &quot;<<hcf<<&quot;\\n&quot;;<br />\n" +
            " cout<<&quot;Least common multiple of &quot;<< x <<&quot;and &quot;<< y<<&quot;= &quot;<<lcm<<&quot;\\n&quot;;<br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>/*if 1st no is 0 then 2nd no is gcd<br />\n" +
            "make 2nd no 0 by subtracting smallest from largest and return 1st no as gcd*/<br />\n" +
            "long gcd(long x, long y)<br />\n" +
            "{<br />\n" +
            " if (x == 0)<br />\n" +
            " {<br />\n" +
            " return y;<br />\n" +
            " }<br />\n" +
            " while (y != 0)<br />\n" +
            " {<br />\n" +
            " if (x > y)<br />\n" +
            " {<br />\n" +
            " x = x - y;<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " y = y - x;<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " return x;<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram23="<p>#include < iostream.h ></p>\n" +
            "\n" +
            "<p>long factorial(int);<br />\n" +
            "long find_ncr(int, int);<br />\n" +
            "long find_npr(int, int);</p>\n" +
            "\n" +
            "<p>main()<br />\n" +
            "{<br />\n" +
            " int n, r;<br />\n" +
            " long ncr, npr;<br />\n" +
            " cout<<&quot;Enter the value of n and r\\n&quot;;<br />\n" +
            " cin>>n>>r;<br />\n" +
            " ncr = find_ncr(n, r);<br />\n" +
            " npr = find_npr(n, r);<br />\n" +
            " cout<<n<<&quot;C&quot;<<r<<&quot; =&quot;<<ncr<<&quot;\\n&quot;;<br />\n" +
            " cout<<n<<&quot;P&quot;<<r<<&quot;=&quot; <<npr<<&quot;\\n&quot;;<br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>long find_ncr(int n, int r)<br />\n" +
            "{<br />\n" +
            " long result;<br />\n" +
            " result = factorial(n)/(factorial(r)*factorial(n-r));<br />\n" +
            " return result;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>long find_npr(int n, int r)<br />\n" +
            "{<br />\n" +
            " long result;<br />\n" +
            " result = factorial(n)/factorial(n-r);<br />\n" +
            " return result;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>long factorial(int n)<br />\n" +
            "{<br />\n" +
            " int c;<br />\n" +
            " long result = 1;<br />\n" +
            " for( c = 1 ; c < = n ; c++ )<br />\n" +
            " result = result*c;<br />\n" +
            " return ( result );<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram24="<p>#include <iostream.h><br />\n" +
            "#include <conio.h></p>\n" +
            "\n" +
            "<p>void main()<br />\n" +
            "{<br />\n" +
            " clrscr();<br />\n" +
            " int n;<br />\n" +
            " cout << &quot;Enter an integer: &quot;;<br />\n" +
            " cin >> n;<br />\n" +
            " if ( n%2 == 0)<br />\n" +
            " {<br />\n" +
            " cout << n << &quot; is even.&quot;;<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " cout << n << &quot; is odd.&quot;;<br />\n" +
            " }<br />\n" +
            " getch();<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram25="<p>#include <iostream.h><br />\n" +
            "#include <conio.h><br />\n" +
            "void main()<br />\n" +
            "{<br />\n" +
            " clrscr(); //clears the previous screen<br />\n" +
            "//Printing first pattern (Floyds triangle)<br />\n" +
            " int rows,i,j,k=0;<br />\n" +
            " cout<<&quot;Enter number of rows: &quot;;<br />\n" +
            " cin>>rows;<br />\n" +
            " for(i=1; i<=rows; i++)<br />\n" +
            " {<br />\n" +
            " for(j=1; j<=i; ++j)<br />\n" +
            " cout<<k+j<<&quot; &quot;;<br />\n" +
            " ++k;<br />\n" +
            " cout<<endl;<br />\n" +
            " }<br />\n" +
            " getch(); // wait for input<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram26="<p>#include <iostream.h><br />\n" +
            "#include <conio.h><br />\n" +
            "void main()<br />\n" +
            "{<br />\n" +
            " clrscr(); //clears the previous screen<br />\n" +
            "//Printing first pattern (Pascals triangle)<br />\n" +
            " int rows,coef=1,space,i,j;<br />\n" +
            " cout<<&quot;Enter number of rows: &quot;;<br />\n" +
            " cin>>rows;<br />\n" +
            " for(i=0; i<rows; i++)<br />\n" +
            " {<br />\n" +
            " for(space=1; space<=rows-i; space++)<br />\n" +
            " cout<<&quot; &quot;;<br />\n" +
            " for(j=0; j<=i; j++)<br />\n" +
            " {<br />\n" +
            " if (j==0||i==0)<br />\n" +
            " coef=1;<br />\n" +
            " else<br />\n" +
            " coef=coef*(i-j+1)/j;<br />\n" +
            " cout<<&quot; &quot;<<coef;<br />\n" +
            " }<br />\n" +
            " cout<<endl;<br />\n" +
            " }<br />\n" +
            " getch(); // wait for input<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram27="<p>#include <iostream.h><br />\n" +
            "#include <conio.h><br />\n" +
            "void main()<br />\n" +
            "{<br />\n" +
            " clrscr(); //clears the previous screen<br />\n" +
            "//Printing pattern<br />\n" +
            " int i,j,rows;<br />\n" +
            " cout<<&quot;Enter the number of rows: &quot;;<br />\n" +
            " cin>>rows;<br />\n" +
            " for(i=1; i<=rows; ++i)<br />\n" +
            " {<br />\n" +
            " for(j=1; j<=i; ++j)<br />\n" +
            " {<br />\n" +
            " cout<<&quot;* &quot;;<br />\n" +
            " }<br />\n" +
            " cout<<&quot;\\n&quot;;<br />\n" +
            " }<br />\n" +
            " getch(); // wait for input<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>OUTPUT: </p>\n" +
            "\n" +
            "<p>*<br />\n" +
            "*<br />\n" +
            "**<br />\n" +
            "***<br />\n" +
            "****<br />\n" +
            "*****<br />\n" +
            "*<br />\n" +
            "</p>";
    public static final String cplusprogram28="<p>#include <iostream.h><br />\n" +
            "#include <conio.h><br />\n" +
            "void main()<br />\n" +
            "{<br />\n" +
            " clrscr(); //clears the previous screen<br />\n" +
            "//Printing pattern<br />\n" +
            " int i,j,rows;<br />\n" +
            " cout<<&quot;Enter the number of rows: &quot;;<br />\n" +
            " cin>>rows;<br />\n" +
            " for(i=1; i<=rows; ++i)<br />\n" +
            " {<br />\n" +
            " for(j=1; j<=i; ++j)<br />\n" +
            " {<br />\n" +
            " cout<<j<<&quot; &quot;;<br />\n" +
            " }<br />\n" +
            " cout<<&quot;\\n&quot;;<br />\n" +
            " }<br />\n" +
            " getch(); // wait for input<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>OUTPUT :<br />\n" +
            "/*<br />\n" +
            "1<br />\n" +
            "12<br />\n" +
            "123<br />\n" +
            "1234<br />\n" +
            "12345<br />\n" +
            "*/<br />\n" +
            "</p>";
    public static final String cplusprogram29="<p>#include <iostream.h><br />\n" +
            "#include <conio.h><br />\n" +
            "void main()<br />\n" +
            "{<br />\n" +
            " clrscr(); //clears the previous screen<br />\n" +
            "//Printing pattern<br />\n" +
            " int i,j;<br />\n" +
            " char input,temp='A';<br />\n" +
            " cout<<&quot;Enter uppercase character you want in triange at last row: &quot;;<br />\n" +
            " cin>>input;<br />\n" +
            " for(i=1; i<=(input-'A'+1); ++i)<br />\n" +
            " {<br />\n" +
            " for(j=1; j<=i; ++j)<br />\n" +
            " cout<<temp<<&quot; &quot;;<br />\n" +
            " ++temp;<br />\n" +
            " cout<<endl;<br />\n" +
            " }<br />\n" +
            " getch(); // wait for input<br />\n" +
            "} </p>\n" +
            "\n" +
            "<p>\n" +
            "OUTPUT :<br />\n" +
            "/*<br />\n" +
            "A<br />\n" +
            "BB<br />\n" +
            "CCC<br />\n" +
            "DDDD<br />\n" +
            "EEEEE<br />\n" +
            "*/<br />\n" +
            "</p>";
    public static final String cplusprogram30="<p>#include <iostream.h><br />\n" +
            "#include <conio.h><br />\n" +
            "void main()<br />\n" +
            "{<br />\n" +
            " clrscr(); //clears the previous screen<br />\n" +
            "//Printing pattern<br />\n" +
            " int i,j,rows;<br />\n" +
            " cout<<&quot;Enter the number of rows: &quot;;<br />\n" +
            " cin>>rows;<br />\n" +
            " for(i=rows; i>=1; --i)<br />\n" +
            " {<br />\n" +
            " for(j=1; j<=i; ++j)<br />\n" +
            " {<br />\n" +
            " cout<<&quot;* &quot;;<br />\n" +
            " }<br />\n" +
            " cout<<&quot;\\n&quot;;<br />\n" +
            " }<br />\n" +
            " getch(); // wait for input<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>OOTPUT :<br />\n" +
            "/*<br />\n" +
            "*****<br />\n" +
            "****<br />\n" +
            "***<br />\n" +
            "**<br />\n" +
            "*<br />\n" +
            "*/<br />\n" +
            "</p>";
    public static final String cplusprogram31="<p>#include <iostream.h><br />\n" +
            "#include <conio.h><br />\n" +
            "void main()<br />\n" +
            "{<br />\n" +
            " clrscr(); //clears the previous screen<br />\n" +
            "//Printing pattern<br />\n" +
            " int i,j,rows;<br />\n" +
            " cout<<&quot;Enter the number of rows: &quot;;<br />\n" +
            " cin>>rows;<br />\n" +
            " for(i=rows; i>=1; --i)<br />\n" +
            " {<br />\n" +
            " for(j=1; j<=i; ++j)<br />\n" +
            " {<br />\n" +
            " cout<<j<<&quot; &quot;;<br />\n" +
            " }<br />\n" +
            " cout<<&quot;\\n&quot;;<br />\n" +
            " }<br />\n" +
            " getch(); // wait for input<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>OUTPUT :<br />\n" +
            "/*<br />\n" +
            "12345<br />\n" +
            "1234<br />\n" +
            "123<br />\n" +
            "12<br />\n" +
            "1<br />\n" +
            "*/<br />\n" +
            "</p>";
    public static final String cplusprogram32="<p>#include <iostream.h><br />\n" +
            "#include <conio.h><br />\n" +
            "void main()<br />\n" +
            "{<br />\n" +
            " clrscr(); //clears the previous screen<br />\n" +
            "//Printing pattern<br />\n" +
            " int i,space,rows,k=0;<br />\n" +
            " cout<<&quot;Enter the number of rows: &quot;;<br />\n" +
            " cin>>rows;<br />\n" +
            " for(i=1; i<=rows; ++i)<br />\n" +
            " {<br />\n" +
            " for(space=1; space<=rows-i; ++space)<br />\n" +
            " {<br />\n" +
            " cout<<&quot; &quot;;<br />\n" +
            " }<br />\n" +
            " while(k!=2*i-1)<br />\n" +
            " {<br />\n" +
            " cout<<&quot;* &quot;;<br />\n" +
            " ++k;<br />\n" +
            " }<br />\n" +
            " k=0;<br />\n" +
            " cout<<&quot;\\n&quot;;<br />\n" +
            " }<br />\n" +
            " getch(); // wait for input<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>OUTPUT :<br />\n" +
            "/*<br />\n" +
            " *<br />\n" +
            " ***<br />\n" +
            " *****<br />\n" +
            " *******<br />\n" +
            " *********</p>\n" +
            "\n" +
            "<p> */<br />\n" +
            "</p>";
    public static final String cplusprogram33="<p>#include <iostream.h><br />\n" +
            "#include <conio.h><br />\n" +
            "void main()<br />\n" +
            "{<br />\n" +
            " clrscr(); //clears the previous screen<br />\n" +
            "//Printing pattern<br />\n" +
            " int i,space,rows,k=0,count=0,count1=0;<br />\n" +
            " cout<<&quot;Enter the number of rows: &quot;;<br />\n" +
            " cin>>rows;<br />\n" +
            " for(i=1; i<=rows; ++i)<br />\n" +
            " {<br />\n" +
            " for(space=1; space<=rows-i; ++space)<br />\n" +
            " {<br />\n" +
            " cout<<&quot; &quot;;<br />\n" +
            " ++count;<br />\n" +
            " }<br />\n" +
            " while(k!=2*i-1)<br />\n" +
            " {<br />\n" +
            " if (count<=rows-1)<br />\n" +
            " {<br />\n" +
            " cout<<i+k<<&quot; &quot;;<br />\n" +
            " ++count;<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " ++count1;<br />\n" +
            " cout<<i+k-2*count1<<&quot; &quot;;<br />\n" +
            " }<br />\n" +
            " ++k;<br />\n" +
            " }<br />\n" +
            " count1=count=k=0;<br />\n" +
            " cout<<&quot;\\n&quot;;<br />\n" +
            " }<br />\n" +
            " getch(); // wait for input<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>OUTPUT :<br />\n" +
            "/*<br />\n" +
            " 1<br />\n" +
            " 232<br />\n" +
            " 34543<br />\n" +
            " 4567654<br />\n" +
            " 567898765</p>\n" +
            "\n" +
            "<p> */<br />\n" +
            "</p>";
    public static final String cplusprogram34="<p>//Floyds Triangle</p>\n" +
            "\n" +
            "<p>#include <iostream.h><br />\n" +
            "#include <conio.h><br />\n" +
            "void main()<br />\n" +
            "{<br />\n" +
            " clrscr(); //clears the previous screen<br />\n" +
            "//Printing pattern<br />\n" +
            " int rows,i,j,space;<br />\n" +
            " cout<<&quot;Enter number of rows: &quot;;<br />\n" +
            " cin>>rows;<br />\n" +
            " for(i=rows; i>=1; --i)<br />\n" +
            " {<br />\n" +
            " for(space=0; space<rows-i; ++space)<br />\n" +
            " cout<<&quot; &quot;;<br />\n" +
            " for(j=i; j<=2*i-1; ++j)<br />\n" +
            " cout<<&quot;* &quot;;<br />\n" +
            " for(j=0; j<i-1; ++j)<br />\n" +
            " cout<<&quot;* &quot;;<br />\n" +
            " cout<<endl;<br />\n" +
            " }<br />\n" +
            " getch(); // wait for input<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>OUTPUT :<br />\n" +
            "/*<br />\n" +
            " *********<br />\n" +
            " *******<br />\n" +
            " *****<br />\n" +
            " ***<br />\n" +
            " *<br />\n" +
            "*/<br />\n" +
            "</p>";
    public static final String cplusprogram35="<p>\n" +
            "#include < iostream.h ><br />\n" +
            "#include < stdlib.h ></p>\n" +
            "\n" +
            "<p>main()<br />\n" +
            "{<br />\n" +
            " char ch;<br />\n" +
            " cout<<&quot;Do you want to shutdown your computer now (y/n)\\n&quot;;<br />\n" +
            " cin>>ch;<br />\n" +
            " if (ch == 'y' || ch == 'Y')<br />\n" +
            " system(&quot;C:\\\\WINDOWS\\\\System32\\\\shutdown /s&quot;);<br />\n" +
            " /*shutdown command*/<br />\n" +
            " return 0;<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram36="<p>#include <iostream></p>\n" +
            "\n" +
            "<p>using namespace std;</p>\n" +
            "\n" +
            "<p>class complex<br />\n" +
            "{<br />\n" +
            "public :<br />\n" +
            " int real, img;<br />\n" +
            "};</p>\n" +
            "\n" +
            "<p>int main()<br />\n" +
            "{<br />\n" +
            " complex a, b, c;<br />\n" +
            " cout << &quot;Enter a and b where a + ib is the first complex number.&quot;;<br />\n" +
            " cout << &quot;\\na = &quot;;<br />\n" +
            " cin >> a.real;<br />\n" +
            " cout << &quot;b = &quot;;<br />\n" +
            " cin >> a.img;<br />\n" +
            " cout << &quot;Enter c and d where c + id is the second complex number.&quot;;<br />\n" +
            " cout << &quot;\\nc = &quot;;<br />\n" +
            " cin >> b.real;<br />\n" +
            " cout << &quot;d = &quot;;<br />\n" +
            " cin >> b.img;<br />\n" +
            " c.real = a.real + b.real;<br />\n" +
            " c.img = a.img + b.img;<br />\n" +
            " if ( c.img >= 0 )<br />\n" +
            " cout << &quot;Sum of two complex numbers = &quot; << c.real << &quot; + &quot; << c.img << &quot;i&quot;;<br />\n" +
            " else<br />\n" +
            " cout << &quot;Sum of two complex numbers = &quot; << c.real << &quot; &quot; << c.img << &quot;i&quot;;<br />\n" +
            " return 0;<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram37="<p>#include<iostream><br />\n" +
            "#include<cstdlib></p>\n" +
            "\n" +
            "<p>using namespace std;</p>\n" +
            "\n" +
            "<p>main()<br />\n" +
            "{<br />\n" +
            " int n, max, num, c;<br />\n" +
            " cout << &quot;Enter the number of random numbers you want &quot;;<br />\n" +
            " cin >> n;<br />\n" +
            " cout << &quot;Enter the maximum value of random number &quot;;<br />\n" +
            " cin >> max;<br />\n" +
            " cout << &quot;random numbers from 0 to &quot; << max << &quot; are :-&quot; << endl;<br />\n" +
            " for ( c = 1 ; c <= n ; c++ )<br />\n" +
            " {<br />\n" +
            " num = random(max);<br />\n" +
            " cout << num << endl;<br />\n" +
            " }<br />\n" +
            " return 0;<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram38="<p>#include <iostream></p>\n" +
            "\n" +
            "<p>using namespace std;</p>\n" +
            "\n" +
            "<p>class Operations<br />\n" +
            "{<br />\n" +
            " long c;</p>\n" +
            "\n" +
            "<p>public:<br />\n" +
            " void inputNumber()<br />\n" +
            " {<br />\n" +
            " cout << &quot;Input a number\\n&quot;;<br />\n" +
            " cin >> c;<br />\n" +
            " }</p>\n" +
            "\n" +
            "<p> long reverseNumber()<br />\n" +
            " {<br />\n" +
            " long invert = 0;<br />\n" +
            " while (c != 0)<br />\n" +
            " {<br />\n" +
            " invert = invert * 10;<br />\n" +
            " invert = invert + c%10;<br />\n" +
            " c = c/10;<br />\n" +
            " }<br />\n" +
            " return invert;<br />\n" +
            " }</p>\n" +
            "\n" +
            "<p>};</p>\n" +
            "\n" +
            "<p>int main()<br />\n" +
            "{<br />\n" +
            " long result;<br />\n" +
            " Operations t;<br />\n" +
            " t.inputNumber();<br />\n" +
            " result = t.reverseNumber();<br />\n" +
            " cout << &quot;Number obtained on reversal = &quot; << result;<br />\n" +
            " return 0;<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram39="<p>#include <iostream.h></p>\n" +
            "\n" +
            "<p>#include <conio.h></p>\n" +
            "\n" +
            "<p>void multi(int &amp;a)</p>\n" +
            "\n" +
            "<p>{<br />\n" +
            " int a,b,c;<br />\n" +
            " int *q = &amp;p;<br />\n" +
            "cout<<&rdquo;Enter the b value:<br />\n" +
            " &rdquo;<br />\n" +
            " cin>>b;<br />\n" +
            " c=q*b;<br />\n" +
            "cout<<&rdquo;Multiplication of a and b is:<br />\n" +
            " &ldquo;<<c;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>int main()<br />\n" +
            "{<br />\n" +
            " clrscr();<br />\n" +
            " int a;<br />\n" +
            "cout<<&rdquo;Enter the a value:<br />\n" +
            " &rdquo;<br />\n" +
            " cin>>a;<br />\n" +
            " muti(&amp;a);<br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>\n" +
            "</p>";
    public static final String cplusprogram40="<p>#include <iostream></p>\n" +
            "\n" +
            "<p>void doubleIt(int);</p>\n" +
            "\n" +
            "<p>int main ()</p>\n" +
            "\n" +
            "<p>{<br />\n" +
            " int num;<br />\n" +
            " cout << &quot;Enter number: &quot;;<br />\n" +
            " cin >> num;<br />\n" +
            " doubleIt(num);<br />\n" +
            " cout << &quot;The number doubled in main is &quot; << num << endl;<br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>void doubleIt (int x)</p>\n" +
            "\n" +
            "<p>{<br />\n" +
            " cout << &quot;The number to be doubled is &quot; << x << endl;<br />\n" +
            " x *= 2;<br />\n" +
            " cout << &quot;The number doubled in doubleIt is &quot; << x << endl;<br />\n" +
            "}</p>";
    public static final String cplusprogram41="<p>// Step 1: Create the class.</p>\n" +
            "\n" +
            "<p>// Step 2: Declare the constructors with different parameter type and list.</p>\n" +
            "\n" +
            "<p>// Step 3: Create the objects for the Fixed_deposite.</p>\n" +
            "\n" +
            "<p>// Step 4: Object creation automatically call the type matched constructor.</p>\n" +
            "\n" +
            "<p>// Step 5: The matched type constructor procedure will be run.</p>\n" +
            "\n" +
            "<p>// Step 6: Compile and run the program.</p>\n" +
            "\n" +
            "<p>#include <iostream.h><br />\n" +
            "class Fixed_deposite<br />\n" +
            "{<br />\n" +
            " long int P_amount;<br />\n" +
            " int Years;<br />\n" +
            " float Rate;<br />\n" +
            " float R_value;<br />\n" +
            "public :<br />\n" +
            " Fixed_deposit() {}<br />\n" +
            " Fixed_deposit(long int p, int y,float r=0.12);<br />\n" +
            " Fixed_deposit(long int p,int y,int r);<br />\n" +
            " Void display(void);<br />\n" +
            "};<br />\n" +
            "Fixed_deposite :: Fixed_deposit (long int p,int y,float r)<br />\n" +
            "{<br />\n" +
            " P_amount=p;<br />\n" +
            " Years=y;<br />\n" +
            " Rate =r;<br />\n" +
            " R_value=p_amount;<br />\n" +
            " for(int i=1; i<=y; i++)<br />\n" +
            " R_value=R_value * (1.0+r);<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>Fixed_deposite :: Fixed_deposit (long int p,int y,int r)<br />\n" +
            "{<br />\n" +
            " P_amount=p;<br />\n" +
            " Years=y;<br />\n" +
            " Rate =r;<br />\n" +
            " R_value=p_amount;<br />\n" +
            " for(int i=1; i<=y; i++)<br />\n" +
            " R_value=R_value * (1.0+float(r)/100);<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>void Fixed_deposite :: display(void)<br />\n" +
            "{<br />\n" +
            " cout<<&rdquo;\\n&rdquo;<<&rdquo;Principal Amount=&rdquo;<<P_amoun<<&rdquo;\\n&rdquo;<<&rdquo;Return Value=&rdquo;<<R_value <<&rdquo;\\n&rdquo;;<br />\n" +
            "}<br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " Fixed_deposite FD1,FD2,FD3;<br />\n" +
            " long int p;<br />\n" +
            " int y;<br />\n" +
            " float r;<br />\n" +
            " int R;<br />\n" +
            " cout<<&rdquo;ENTER amount,period,interest rate(in percent)&rdquo;<<&rdquo;\\n&rdquo;;<br />\n" +
            " cin>>p>>y>>R;<br />\n" +
            " FD1 =Fixed_deposite(p,y,R);<br />\n" +
            " cout<<&rdquo;ENTER amount,period,interest rate(decimal form)&rdquo;<<&rdquo;\\n&rdquo;;<br />\n" +
            " cin>>p>>y>>r;<br />\n" +
            " FD2 =Fixed_deposite(p,y,R);<br />\n" +
            " cout<<&rdquo;Enter the amount and period\\n&rdquo;;<br />\n" +
            " cin>>p>>y;<br />\n" +
            " FD1 =Fixed_deposite(p,y);<br />\n" +
            " cout<<&quot;\\nDeposiote&quot;;<br />\n" +
            " FD1.display();<br />\n" +
            " cout<<&quot;\\nDeposiote&quot;;<br />\n" +
            " FD2.display();<br />\n" +
            " cout<<&quot;\\nDeposiote&quot;;<br />\n" +
            " FD3.display();<br />\n" +
            "return 0:<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p></p>";
    public static final String cplusprogram42="<p>// Start the program<br />\n" +
            "// Create the class and declare the data members and member functions<br />\n" +
            "// Declare the pointer and store the address of data in the pointer<br />\n" +
            "// Create the object and call the function in the main program<br />\n" +
            "// Compile and execute the program</p>\n" +
            "\n" +
            "<p>#include<iostream.h></p>\n" +
            "\n" +
            "<p>class c1</p>\n" +
            "\n" +
            "<p>{</p>\n" +
            "\n" +
            "<p>public:</p>\n" +
            "\n" +
            "<p> int i;</p>\n" +
            "\n" +
            "<p> c1(int j)</p>\n" +
            "\n" +
            "<p> {<br />\n" +
            " i = j;<br />\n" +
            " }</p>\n" +
            "\n" +
            "<p>};</p>\n" +
            "\n" +
            "<p>int main()</p>\n" +
            "\n" +
            "<p>{<br />\n" +
            " c1 ob(1);<br />\n" +
            " int *p;<br />\n" +
            " p = &amp;ob.i; //get address of ob.i<br />\n" +
            " cout<<*p; // access ob.i via p<br />\n" +
            " return 0;<br />\n" +
            "}</p>";
    public static final String cplusprogram43="<p>#include<iostream.h></p>\n" +
            "\n" +
            "<p>class matrix</p>\n" +
            "\n" +
            "<p>{</p>\n" +
            "\n" +
            "<p> int a[2][2], b[2][2], c[2][2];</p>\n" +
            "\n" +
            "<p> void add()</p>\n" +
            "\n" +
            "<p> {<br />\n" +
            "cout<<&rdquo;Enter the A matrix:<br />\n" +
            " &rdquo;<<&rdquo;\\n&rdquo;;<br />\n" +
            " for(int i=0; i<2; i++)<br />\n" +
            " {<br />\n" +
            " for(int j=0; j<2; j++)<br />\n" +
            " {<br />\n" +
            " cin>>a[i][j];<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            "cout<<&rdquo;Enter the B matrix:<br />\n" +
            " &rdquo;<<&rdquo;\\n&rdquo;;<br />\n" +
            " for(int i=0; i<2; i++)<br />\n" +
            " {<br />\n" +
            " for (int j=0; j<2; j++)<br />\n" +
            " {<br />\n" +
            " cin>>b[i][j];<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " for( i = 0; i< 2; i++)<br />\n" +
            " {<br />\n" +
            " for( j = 0; j<2; j++)<br />\n" +
            " {<br />\n" +
            " c[i][j] = a[i][j] + b[i][j];<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            "cout<<&rdquo;Addition of Two matrixes:<br />\n" +
            " &rdquo;<<c[i][j];<br />\n" +
            " }</p>\n" +
            "\n" +
            "<p> main()</p>\n" +
            "\n" +
            "<p> {<br />\n" +
            " matrix m;<br />\n" +
            " m.add();<br />\n" +
            " }</p>\n" +
            "\n" +
            "<p>\n" +
            "</p>";
    public static final String cplusprogram44="<p>// Start the program<br />\n" +
            "// Create the class and declare the data members<br />\n" +
            "// Pass the value for the variables through the function<br />\n" +
            "// Create the object for the class and call the function with arguments<br />\n" +
            "// Compile and execute the program</p>\n" +
            "\n" +
            "<p>#include<iostream.h></p>\n" +
            "\n" +
            "<p>class myclass</p>\n" +
            "\n" +
            "<p>{</p>\n" +
            "\n" +
            "<p> int a, b;</p>\n" +
            "\n" +
            "<p>public:</p>\n" +
            "\n" +
            "<p> void init(int i, int j);</p>\n" +
            "\n" +
            "<p> {<br />\n" +
            " a = i;<br />\n" +
            " b = j;<br />\n" +
            " }</p>\n" +
            "\n" +
            "<p> void show();</p>\n" +
            "\n" +
            "<p> {<br />\n" +
            " cout<<&rdquo;a=&rdquo;<<a<<&rdquo;\\n&rdquo;;<br />\n" +
            " cout<<&rdquo;b=&rdquo;<<b<<&rdquo;\\n&rdquo;;<br />\n" +
            " }</p>\n" +
            "\n" +
            "<p>};</p>\n" +
            "\n" +
            "<p>int main()</p>\n" +
            "\n" +
            "<p>{<br />\n" +
            " myclass x;<br />\n" +
            " x.init(10, 20);<br />\n" +
            " x.show();<br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>\n" +
            "</p>";
    public static final String cplusprogram45="<p>// Start the program<br />\n" +
            "// Create the function with same name<br />\n" +
            "// The function will be differed in return type and number of arguments<br />\n" +
            "// Implement the function, which has the same name<br />\n" +
            "// Compile and execute the program</p>\n" +
            "\n" +
            "<p>#include <iostream.h></p>\n" +
            "\n" +
            "<p>#include<conio.h></p>\n" +
            "\n" +
            "<p>int abs(int n);</p>\n" +
            "\n" +
            "<p>double abs(double n);</p>\n" +
            "\n" +
            "<p>int main()</p>\n" +
            "\n" +
            "<p>{<br />\n" +
            " clrscr();<br />\n" +
            " cout << &quot;Absolute value of -10: &quot; << abs(-10) << endl;<br />\n" +
            " cout << &quot;Absolute value of -10.01: &quot; << abs(-10.01) << endl;<br />\n" +
            " getch();<br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>int abs(int n)</p>\n" +
            "\n" +
            "<p>{<br />\n" +
            " cout << &quot;In integer abs()\\n&quot;;<br />\n" +
            " return n<0 ? -n : n;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>double abs(double n)</p>\n" +
            "\n" +
            "<p>{<br />\n" +
            " cout << &quot;In double abs()\\n&quot;;<br />\n" +
            " return n<0 ? -n : n;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>\n" +
            "</p>";
    public static final String cplusprogram46="<p>/*This is a C++ Program to find the cross product of two vectors. In mathematics, the cross product or vector product is a binary operation on two vectors in three-dimensional space. It results in a vector that is perpendicular to both and therefore normal to the plane containing them.*/</p>\n" +
            "\n" +
            "<p>#include<time.h><br />\n" +
            "#include<stdlib.h><br />\n" +
            "#include<iostream><br />\n" +
            "#include<math.h></p>\n" +
            "\n" +
            "<p>using namespace std;<br />\n" +
            "const int LOW = 0;<br />\n" +
            "const int HIGH = 10;<br />\n" +
            "int main(int argc, char **argv)<br />\n" +
            "{<br />\n" +
            " time_t seconds;<br />\n" +
            " time(&amp;seconds);<br />\n" +
            " srand((unsigned int) seconds);<br />\n" +
            " int u1, u2, u3, v1, v2, v3;<br />\n" +
            " u1 = rand() % (HIGH - LOW + 1) + LOW;<br />\n" +
            " u2 = rand() % (HIGH - LOW + 1) + LOW;<br />\n" +
            " u3 = rand() % (HIGH - LOW + 1) + LOW;<br />\n" +
            " v1 = rand() % (HIGH - LOW + 1) + LOW;<br />\n" +
            " v2 = rand() % (HIGH - LOW + 1) + LOW;<br />\n" +
            " v3 = rand() % (HIGH - LOW + 1) + LOW;<br />\n" +
            " int uvi, uvj, uvk;<br />\n" +
            " uvi = u2 * v3 - v2 * u3;<br />\n" +
            " uvj = v1 * u3 - u1 * v3;<br />\n" +
            " uvk = u1 * v2 - v1 * u2;<br />\n" +
            " cout << &quot;The cross product of the 2 vectors \\n u = &quot; << u1 << &quot;i + &quot; << u2<br />\n" +
            " << &quot;j + &quot; << u3 << &quot;k and \\n v = &quot; << u1 << &quot;i + &quot; << u2 << &quot;j + &quot;<br />\n" +
            " << u3 << &quot;k \\n &quot;;<br />\n" +
            " cout << &quot;u X v : &quot; << uvi << &quot;i +&quot; << uvj << &quot;j+ &quot; << uvk << &quot;k &quot;;<br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>OUTPUT :<br />\n" +
            "/*</p>\n" +
            "\n" +
            "<p>The cross product of the 2 vectors<br />\n" +
            " u = 6i + 9j + 9k and<br />\n" +
            " v = 6i + 9j + 9k<br />\n" +
            " u X v : 0i +6j+ -6k<br />\n" +
            "</p>";
    public static final String cplusprogram47="<p>/*<br />\n" +
            " * C++ Program to Find Largest Rectangular Area in a Histogram<br />\n" +
            " */<br />\n" +
            "#include <iostream><br />\n" +
            "#include <cmath><br />\n" +
            "#include <climits><br />\n" +
            "#include <algorithm><br />\n" +
            "#define max(x, y, z) max(max(x, y) , z)<br />\n" +
            "using namespace std;<br />\n" +
            "/*<br />\n" +
            " * get minimum of two numbers in hist[]<br />\n" +
            " */<br />\n" +
            "int minVal(int *hist, int i, int j)<br />\n" +
            "{<br />\n" +
            " if (i == -1)<br />\n" +
            " return j;<br />\n" +
            " if (j == -1)<br />\n" +
            " return i;<br />\n" +
            " return (hist[i] < hist[j])? i : j;<br />\n" +
            "}<br />\n" +
            "/*<br />\n" +
            " * get the middle index from corner indexes.<br />\n" +
            " */<br />\n" +
            "int getMid(int s, int e)<br />\n" +
            "{<br />\n" +
            " return s + (e -s)/2;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>/*<br />\n" +
            " * get the index of minimum value in a given range of indexes.<br />\n" +
            " */<br />\n" +
            "int RMQUtil(int *hist, int *st, int ss, int se, int qs, int qe, int index)<br />\n" +
            "{<br />\n" +
            " if (qs <= ss &amp;&amp; qe >= se)<br />\n" +
            " return st[index];<br />\n" +
            " if (se < qs || ss > qe)<br />\n" +
            " return -1;<br />\n" +
            " int mid = getMid(ss, se);<br />\n" +
            " return minVal(hist, RMQUtil(hist, st, ss, mid, qs, qe, 2 * index + 1),<br />\n" +
            " RMQUtil(hist, st, mid + 1, se, qs, qe, 2 * index + 2));<br />\n" +
            "}<br />\n" +
            "/*<br />\n" +
            " * Return index of minimum element in range from index qs to qe<br />\n" +
            " */<br />\n" +
            "int RMQ(int *hist, int *st, int n, int qs, int qe)<br />\n" +
            "{<br />\n" +
            " if (qs < 0 || qe > n - 1 || qs > qe)<br />\n" +
            " {<br />\n" +
            " cout << &quot;Invalid Input&quot;;<br />\n" +
            " return -1;<br />\n" +
            " }<br />\n" +
            " return RMQUtil(hist, st, 0, n - 1, qs, qe, 0);<br />\n" +
            "}<br />\n" +
            "/*<br />\n" +
            " * constructs Segment Tree for hist[ss..se].<br />\n" +
            " */<br />\n" +
            "int constructSTUtil(int hist[], int ss, int se, int *st, int si)<br />\n" +
            "{<br />\n" +
            " if (ss == se)<br />\n" +
            " return (st[si] = ss);<br />\n" +
            " int mid = getMid(ss, se);<br />\n" +
            " st[si] = minVal(hist, constructSTUtil(hist, ss, mid, st, si * 2 + 1),<br />\n" +
            " constructSTUtil(hist, mid + 1, se, st, si * 2 + 2));<br />\n" +
            " return st[si];<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>/*<br />\n" +
            " * construct segment tree from given array.<br />\n" +
            " */<br />\n" +
            "int *constructST(int hist[], int n)<br />\n" +
            "{<br />\n" +
            " int x = (int)(ceil(log2(n)));<br />\n" +
            " int max_size = 2 * (int)pow(2, x) - 1;<br />\n" +
            " int *st = new int[max_size];<br />\n" +
            " constructSTUtil(hist, 0, n - 1, st, 0);<br />\n" +
            " return st;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>/*<br />\n" +
            " * find the maximum rectangular area.<br />\n" +
            " */<br />\n" +
            "int getMaxAreaRec(int *hist, int *st, int n, int l, int r)<br />\n" +
            "{<br />\n" +
            " if (l > r)<br />\n" +
            " return INT_MIN;<br />\n" +
            " if (l == r)<br />\n" +
            " return hist[l];<br />\n" +
            " int m = RMQ(hist, st, n, l, r);<br />\n" +
            " return max (getMaxAreaRec(hist, st, n, l, m - 1),<br />\n" +
            " getMaxAreaRec(hist, st, n, m + 1, r), (r - l + 1) * (hist[m]));<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>/*<br />\n" +
            " * find max area<br />\n" +
            " */<br />\n" +
            "int getMaxArea(int hist[], int n)<br />\n" +
            "{<br />\n" +
            " int *st = constructST(hist, n);<br />\n" +
            " return getMaxAreaRec(hist, st, n, 0, n - 1);<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>/*<br />\n" +
            " * Main<br />\n" +
            " */<br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " int hist[] = {6, 1, 5, 4, 5, 2, 6};<br />\n" +
            " int n = sizeof(hist)/sizeof(hist[0]);<br />\n" +
            " cout << &quot;Maximum area is &quot; << getMaxArea(hist, n)<<endl;<br />\n" +
            " return 0;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>\n" +
            "OUTPUT :<br />\n" +
            "/*</p>\n" +
            "\n" +
            "<p>Maximum area is 12<br />\n" +
            "</p>";
    public static final String cplusprogram48="<p>/* */<br />\n" +
            "/* File name : bin_srch.cpp */</p>\n" +
            "\n" +
            "<p>/*-------------------- BINARY SEARCH METHOD --------------------------*/</p>\n" +
            "\n" +
            "<p>/* THIS PROGRAM SEARCHES A NUMBER IN THE SORTED ARRAY.</p>\n" +
            "\n" +
            "<p> INPUTS : 1) The total number of elements in the sorted array.</p>\n" +
            "\n" +
            "<p> 2) Array of numbers.</p>\n" +
            "\n" +
            "<p> 3) An element to be searched for.</p>\n" +
            "\n" +
            "<p> OUTPUTS : The position of the number in array. */</p>\n" +
            "\n" +
            "<p>/*------------------------------ PROGRAM -------------------------*/</p>\n" +
            "\n" +
            "<p>#include<stdio.h><br />\n" +
            "#include<math.h><br />\n" +
            "#include<stdlib.h><br />\n" +
            "#include<conio.h></p>\n" +
            "\n" +
            "<p>void main()<br />\n" +
            "{<br />\n" +
            " double x[100],y[100],z; /*DECLARATION OF ARRAY */<br />\n" +
            " int i,n,k,j,t;<br />\n" +
            " clrscr();<br />\n" +
            " printf(&quot;\\n Computational Techniques - J. S. CHITODE&quot;);<br />\n" +
            " printf(&quot;\\n BINARY SEARCH METHOD\\n&quot;);<br />\n" +
            " printf(&quot;\\n\\nEnter the total number of elements &quot;<br />\n" +
            " &quot;in the array(max 100) = &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;n); /* ENTER THE NUMBER OF ELEMENTS IN THE ARRAY */<br />\n" +
            " for(i = 0; i < n; i++)<br />\n" +
            " {<br />\n" +
            " /* LOOP TO ENTER ACTUAL VALUES OF ARRAY ELEMENTS */<br />\n" +
            " printf(&quot;\\nx%d = &quot;,i);<br />\n" +
            " scanf(&quot;%lf&quot;,&amp;x[i]);<br />\n" +
            " }<br />\n" +
            " printf(&quot;\\nEnter the number to be searched = &quot;);<br />\n" +
            " scanf(&quot;%lf&quot;,&amp;z); /* NUMBER TO BE SEARCHED FOR */<br />\n" +
            " k = n/2; /* MIDDLE OF THE ARRAY */<br />\n" +
            " t = 0;<br />\n" +
            " while(k >= 1)<br />\n" +
            " {<br />\n" +
            " if(x[0] == z) /* CHECK IF x[0] IS THE NUMBER TO BE SEARCHED */<br />\n" +
            " {<br />\n" +
            " printf(&quot;match is found at key = 0&quot;);<br />\n" +
            " break; /* break IS USED TO GO OUT OF THE LOOP */<br />\n" +
            " }<br />\n" +
            " if(x[n-1] == z) /* CHECK IF x[n-1] IS THE NUMBER TO BE SEARCHED*/<br />\n" +
            " {<br />\n" +
            " printf(&quot;match is found at key = %d&quot;,n-1);<br />\n" +
            " break; /* break IS USED TO GO OUT OF THE LOOP */<br />\n" +
            " }<br />\n" +
            " if(x[k] > z) /* CHECK IN THE TOP HALF */<br />\n" +
            " {<br />\n" +
            " k = (k+1)/2;<br />\n" +
            " if(x[k] == z)<br />\n" +
            " {<br />\n" +
            " printf(&quot;match is found at key = %d&quot;,k);<br />\n" +
            " break;<br />\n" +
            " }<br />\n" +
            " for(i = 0; i < k; i++)<br />\n" +
            " {<br />\n" +
            " y[i] = x[i];<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " if(x[k] <= z) /* CHECK IN THE BOTTOM HALF */<br />\n" +
            " {<br />\n" +
            " k = (k+1)/2;<br />\n" +
            " if(x[k] == z)<br />\n" +
            " {<br />\n" +
            " printf(&quot;match is found at key = %d&quot;,n-k-1);<br />\n" +
            " break;<br />\n" +
            " }<br />\n" +
            " for(i = k,j = 0; i < n; i++,j++)<br />\n" +
            " {<br />\n" +
            " y[j] = x[i];<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " for(i = 0; i <= k; i++)<br />\n" +
            " {<br />\n" +
            " x[i] = y[i]; /*FORM THE NEW ARRAY OF k/2 ELEMENTS */<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            "}<br />\n" +
            "</p>";
    public static final String cplusprogram49="<p>INPUTS : 1) The total number of elements to be sorted.</p>\n" +
            "\n" +
            "<p> 2) Array of numbers.</p>\n" +
            "\n" +
            "<p> OUTPUTS : Sorted array of elements. */</p>\n" +
            "\n" +
            "<p>/*------------------------------ PROGRAM ----------------------------*/</p>\n" +
            "\n" +
            "<p>#include<stdio.h><br />\n" +
            "#include<math.h><br />\n" +
            "#include<stdlib.h><br />\n" +
            "#include<conio.h></p>\n" +
            "\n" +
            "<p>void main()<br />\n" +
            "{<br />\n" +
            " double x[100],z; /*DECLARATION OF ARRAY */<br />\n" +
            " int i,n,k;<br />\n" +
            " clrscr();<br />\n" +
            " printf(&quot;\\n Computational Techniques - J. S. CHITODE&quot;);<br />\n" +
            " printf(&quot;\\n BUBBLE SORT METHOD\\n&quot;);<br />\n" +
            " printf(&quot;\\n\\nEnter the total number of elements &quot;<br />\n" +
            " &quot;to sorted (max 100) = &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;n); /* ENTER THE NUMBER OF ELEMENTS TO BE SORTED */<br />\n" +
            " for(i = 0; i < n; i++)<br />\n" +
            " {<br />\n" +
            " /* LOOP TO ENTER ACTUAL VALUES OF ARRAY ELEMENTS */<br />\n" +
            " printf(&quot;\\nx%d = &quot;,i);<br />\n" +
            " scanf(&quot;%lf&quot;,&amp;x[i]);<br />\n" +
            " }<br />\n" +
            " for(i = 0; i < n-1; i++)<br />\n" +
            " {<br />\n" +
            " /* LOOP TO SORT THE ARRAY */<br />\n" +
            " for(k = 0; k < n-1; k++)<br />\n" +
            " {<br />\n" +
            " if(x[k] > x[k+1])<br />\n" +
            " {<br />\n" +
            " z = x[k];<br />\n" +
            " x[k] = x[k+1];<br />\n" +
            " x[k+1] = z;<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " printf(&quot;\\nThe sorted array in ascending order is ....\\n&quot;);<br />\n" +
            " for(i = 0; i < n; i++)<br />\n" +
            " {<br />\n" +
            " /* LOOP TO PRINT THE ARRAY */<br />\n" +
            " printf(&quot;\\nx%d = %lf&quot;,i,x[i]);<br />\n" +
            " }<br />\n" +
            "}</p>";

    public static final String cplusprogram50="<p>\n"+
        "#include<stdio.h><br />\n"+
        "#include<conio.h><br />\n"+
        "#include<iostream><br />\n"+
        "using namespace std;<br />\n"+
        "void swap (char *x, char *y)<br />\n"+
        "{<br />\n"+
        " char temp;<br />\n"+
        " temp = *x;<br />\n"+
        " *x = *y;<br />\n"+
        " *y = temp;<br />\n"+
        "}<br />\n"+
        "void permute(char *a, int i, int n)<br />\n"+
        "{<br />\n"+
        " int j;<br />\n"+
        " if (i == n)<br />\n"+
        " {<br />\n"+
        " cout<<a<<endl;<br />\n"+
        " }<br />\n"+
        " else<br />\n"+
        " {<br />\n"+
        " for (j = i; j <= n; j++)<br />\n"+
        " {<br />\n"+
        " swap((a + i), (a + j));<br />\n"+
        " permute(a, i + 1, n);<br />\n"+
        " swap((a + i), (a + j));<br />\n"+
        " }<br />\n"+
        " }<br />\n"+
        "}<br />\n"+
        "int main()<br />\n"+
        "{<br />\n"+
        " char a[] = &quot;ABC&quot;;<br />\n"+
        " permute(a, 0, 2);<br />\n"+
        " getch();<br />\n"+
        "}</p>\n"+
        "\n"+
        "<p>OUTPUT :<br />\n"+
        "/*</p>\n"+
        "\n"+
        "<p>ABC<br />\n"+
        "ACB<br />\n"+
        "BAC<br />\n"+
        "BCA<br />\n"+
        "CBA<br />\n"+
        "CAB<br />\n"+
        "</p>";
}
