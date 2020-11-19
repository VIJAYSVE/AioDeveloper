package com.vijay.aiodeveloper.strings;

/**
 * Created by Nabeel-PC on 05-07-2017.
 */

public class StringJavascript {

    public static final String javascript1 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;JavaScript Program to display Hello World! &lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script language=\"javascript\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Hello World!\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>Output:-</strong></p>\n" +
            "<p>Hello World!</p>\n" +
            "<p>&nbsp;</p>";
    public static final String javascript2 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;JavaScript program for an Alert &lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script language=\"javascript\"&gt;</p>\n" +
            "<p>alert(\"An Alert is Generated\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>alert(\"Welcome to a example of Alert using Javascript.\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var a= confirm(\"Good Bye!!\")</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if(true)</p>\n" +
            "<p>document.write(\"Pressed Ok\");</p>\n" +
            "<p>else</p>\n" +
            "<p>document.write(\"Pressed Cancel\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.close();</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>";
    public static final String javascript3 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;Form&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script language=\"javascript\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function form()</p>\n" +
            "<p>{</p>\n" +
            "<p>var a = document.this_form.name.value;</p>\n" +
            "<p>if(a==null || a==\"\")</p>\n" +
            "<p>{</p>\n" +
            "<p>alert(\"Enter your Name : \");</p>\n" +
            "<p>return false;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var b = document.this_form.address.value;</p>\n" +
            "<p>if( b ==null || b ==\"\")</p>\n" +
            "<p>{</p>\n" +
            "<p>alert(\"Enter your address : \");</p>\n" +
            "<p>return false;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var c = document.this_form.age.value;</p>\n" +
            "<p>if(c ==null || c==\"\")</p>\n" +
            "<p>{</p>\n" +
            "<p>alert(\"Enter your Age : \");</p>\n" +
            "<p>return false;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var data = document.this_form.email.value;</p>\n" +
            "<p>var j= data.indexOf('@');</p>\n" +
            "<p>var i= data.indexOf('.');</p>\n" +
            "<p>var diff = parseInt(i)+parseInt(j);</p>\n" +
            "<p>var k=parseInt(j)+1;</p>\n" +
            "<p>var c=data.charAt(k);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if(i&lt;1||diff&lt;=1||c==\"\")</p>\n" +
            "<p>{</p>\n" +
            "<p>alert(\"Invalid email address \");</p>\n" +
            "<p>document.this_form.email.focus();</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if((this_form.gender.checked==false) &amp;&amp; (this_form.gender.checked==false))</p>\n" +
            "<p>{</p>\n" +
            "<p>alert(\"Select Gender : \");</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;form name=\"this_form\" action=\"\" method=\"get\" &gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Name :&lt;br&gt;&lt;input type = \"text\" name = \"name\"&gt;&lt;br&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Age : &lt;br&gt;&lt;input type = \"text\" name = \"age\"&gt;&lt;br&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Address : &lt;br&gt;&lt;input type = \"text\" name = \"address\"&gt;&lt;br&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Email Address : &lt;br&gt;&lt;input type = \"text\" name = \"email\"&gt;&lt;br&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Gender : &lt;br&gt;&lt;input type = \"radio\" name = \"gender\"&gt;Female&lt;br&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;input type = \"radio\" name = \"gender\"&gt;Male&lt;br&gt;</p>\n" +
            "<p>You live in:</p>\n" +
            "<p>&lt;select name=\"country\" size = \"1\"&gt;&lt;br&gt;</p>\n" +
            "<p>&lt;option value = \"India\"&gt;India&lt;/option&gt;</p>\n" +
            "<p>&lt;option value = \"aus\"&gt;Australia&lt;/option&gt;</p>\n" +
            "<p>&lt;option value = \"china\"&gt;China&lt;/option&gt;</p>\n" +
            "<p>&lt;option value = \"japan\"&gt;Japan&lt;/option&gt;</p>\n" +
            "<p>&lt;option value = \"russia\"&gt;Russia&lt;/option&gt;</p>\n" +
            "<p>&lt;/select&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;br&gt;&lt;br&gt;&lt;input type= \"submit\" name=\"submit\" value = \"Submit\" onclick=\"form()\"&gt;</p>\n" +
            "<p>&lt;/form&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript4 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;Java Script for multiline comment &lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script language=\"javascript\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>/* Here is the use of multiline comment*/</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript5 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;JavaScript Pop-up Window example&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script type=\"text/javaScript\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function popup()</p>\n" +
            "<p>{</p>\n" +
            "<p>var a = confirm(\"Click OK to see Google Homepage or CANCEL to see Bing Homepage\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (a == true)</p>\n" +
            "<p>{</p>\n" +
            "<p>window.location=\"http://www.google.co.in/\";</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>window.location=\"http://www.bing.com/\";</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;center&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;form&gt;</p>\n" +
            "<p>&lt;input type=\"button\" value=\"Click Here\" onclick=\"popup()\"&gt;</p>\n" +
            "<p>&lt;/form&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/center&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript6 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;p&gt;Click the button to remove the last element from the array.&lt;/p&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;button onclick=\"pop_element()\"&gt;POP Elements&lt;/button&gt;</p>\n" +
            "<p>&lt;button onclick=\"push_element()\"&gt;PUSH Elements&lt;/button&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;p id=\"demo\"&gt;&lt;/p&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>var fruits = [\"Red\", \"Yellow\", \"Green\", \"Blue\"];</p>\n" +
            "<p>document.getElementById(\"demo\").innerHTML = fruits;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function pop_element()</p>\n" +
            "<p>{</p>\n" +
            "<p>fruits.pop();</p>\n" +
            "<p>document.getElementById(\"demo\").innerHTML = fruits;</p>\n" +
            "<p>}</p>\n" +
            "<p>function push_element()</p>\n" +
            "<p>{</p>\n" +
            "<p>fruits.push(\"Black\",\"White\", \"Orange\");</p>\n" +
            "<p>document.getElementById(\"demo\").innerHTML = fruits;</p>\n" +
            "<p>}</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript7 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;JavaScript to Calculate Factorial&lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script language=\"javascript\"&gt;</p>\n" +
            "<p>var num;</p>\n" +
            "<p>var factorial = 1;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>num = prompt(\"Enter the number to calculate factorial: \");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for(i=1;i&lt;=num;i++)</p>\n" +
            "<p>factorial=factorial*i;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Factorial of the number is = \",+factorial);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript8 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt; &lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script language=\"javascript\"&gt;</p>\n" +
            "<p>var a;</p>\n" +
            "<p>var ans;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>a = prompt(\"Enter the Degree in celsius\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>ans =(a*1.8)+32;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Celsius converted into Farenhite = \",+ans);</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript9 ="<p>html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;Find Prime Numbers&lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script language=\"javascript\"&gt;</p>\n" +
            "<p>var i,flag=0,j,n;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>n= prompt(\"Enter any number upto which you want to find prime numbers : \");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"The prime number till the number you entered are = 1,2\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for(i=3;i&lt;=n;i++)</p>\n" +
            "<p>{</p>\n" +
            "<p>for(j=2;j&lt;i;j++)</p>\n" +
            "<p>{</p>\n" +
            "<p>if(i%j!=0)</p>\n" +
            "<p>{</p>\n" +
            "<p>flag=0;</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>flag=1;</p>\n" +
            "<p>break;</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>if(flag==0)</p>\n" +
            "<p>document.write(\", \", +i);</p>\n" +
            "<p>}</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript10 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;Finding Square and Cube of Numbers&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script language=\"javascript\"&gt;</p>\n" +
            "<p>function square_cube()</p>\n" +
            "<p>{</p>\n" +
            "<p>var square;</p>\n" +
            "<p>var cube;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>square=n*n;</p>\n" +
            "<p>cube=n*n*n</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.writeln(\"Square of the number = \",+square);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.writeln(\"&lt;br&gt;Cube of the number = \",+cube);</p>\n" +
            "<p>}var n ;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>n = prompt(\"Enter the number to find it's square and cube: \");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>square_cube();</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript11="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;Display Date and time&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script language=\"javascript\"&gt;</p>\n" +
            "<p>var date = new Date();</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Date and time = \",date);</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Date and time = Sat Sep 03 2016 10:21:48 GMT+0530 (India Standard Time)</p>";
    public static final String javascript12="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt; &lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script language=\"javascript\"&gt;</p>\n" +
            "<p>var side;</p>\n" +
            "<p>var area;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>side= prompt(\"Enter the sides of square: \");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>area=side*side;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Area of the square = \",+area);</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript13 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;Change colour&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script language=\"javascript\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function change_colour()</p>\n" +
            "<p>{</p>\n" +
            "<p>if(window.document.form1.color.selectedIndex==0)</p>\n" +
            "<p>{document.bgColor=\"Red\";}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if(window.document.form1.color.selectedIndex==1)</p>\n" +
            "<p>{document.bgColor=\"Green\";}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if(window.document.form1.color.selectedIndex==2)</p>\n" +
            "<p>{document.bgColor=\"Blue\";}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if(window.document.form1.color.selectedIndex==3)</p>\n" +
            "<p>{document.bgColor=\"Pink\";}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if(window.document.form1.color.selectedIndex==3)</p>\n" +
            "<p>{document.bgColor=\"Yellow\";}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>}</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>Select the colour you want :&lt;br&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;form name=\"form1\"&gt;</p>\n" +
            "<p>&lt;select name=\"color\" onchange=\"change_colour()\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;option name=\"red\" &gt;Red&lt;/option&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;option name=\"green\"&gt;Green&lt;/option&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;option name=\"blue\"&gt;Blue&lt;/option&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;option name=\"pink\"&gt;Pink&lt;/option&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;option name=\"yellow\"&gt;Yellow&lt;/option&gt;</p>\n" +
            "<p>&lt;/select&gt;</p>\n" +
            "<p>&lt;/form&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript14 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;Calculate Simple Intrest &lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script language=\"javascript\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var p,r,n;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>n= prompt(\"Enter the net amount = \");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>r= prompt(\"Enter the no. of years = \");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>p= prompt(\"Enter the rate of intrest = \");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>sum=p*r*n/100;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Simple intrest = \",+sum);</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript15 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;Creating the table of any entered Number&lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script language=\"javascript\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var n;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var ans;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>n= prompt(\"Enter any number: \");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Table of \",+n, \" is:\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for(i=1;i&lt;=10;i++)</p>\n" +
            "<p>{</p>\n" +
            "<p>ans=n*i;</p>\n" +
            "<p>document.write(\"&lt;br&gt;\"+n+\" * \"+i+\" = \",+ans);</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript16 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;Change Case&lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script language=\"javascript\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var str;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>str = prompt(\"Enter the string: \", str);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"The Entered string in upper case is: \");</p>\n" +
            "<p>document.write(str.toUpperCase(),\"&lt;br&gt;\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"The Entered string in lower case is: \");</p>\n" +
            "<p>document.write(str.toLowerCase());</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript17 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;Copy text&lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;center&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;h2&gt;Copy text from one field to another&lt;/h2&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;input type=\"text\" style=\"\" id=\"txt1\" value=\"This is Default text\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;input type=\"text\" style=\"\" id=\"txt2\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;br&gt;&lt;br&gt;&lt;button style=\" \"onclick=\"document.getElementById('txt2').value = document.getElementById('txt1').value\"&gt;Click Here</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/center&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript18 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;Number Even or ODD&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script type=\"text/javascript\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var number</p>\n" +
            "<p>number = prompt(\"Enter a number to find odd or even: \");</p>\n" +
            "<p>number = parseInt(number);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (isNaN(number))</p>\n" +
            "<p>{</p>\n" +
            "<p>alert(\"Please Enter any Number\");</p>\n" +
            "<p>}</p>\n" +
            "<p>else if (number == 0)</p>\n" +
            "<p>{</p>\n" +
            "<p>alert(\"The number is zero.\");</p>\n" +
            "<p>}</p>\n" +
            "<p>else if (number%2)</p>\n" +
            "<p>{</p>\n" +
            "<p>alert(\"The Entered number is odd.\");</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>alert(\"The entered number is even.\");</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript19 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;title&gt; Factorials&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script language=\"javascript\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"&lt;h2&gt;Table of factorials upto 10&lt;/h2&gt;\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for(i = 1, fact = 1; i &lt;=10; i++, fact *= i)</p>\n" +
            "<p>{</p>\n" +
            "<p>document.write(i + \"! = \" + fact);</p>\n" +
            "<p>document.write(\"&lt;br&gt;\");</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Table of factorials upto 10</p>\n" +
            "<p>1! = 1</p>\n" +
            "<p>2! = 2</p>\n" +
            "<p>3! = 6</p>\n" +
            "<p>4! = 24</p>\n" +
            "<p>5! = 120</p>\n" +
            "<p>6! = 720</p>\n" +
            "<p>7! = 5040</p>\n" +
            "<p>8! = 40320</p>\n" +
            "<p>9! = 362880</p>\n" +
            "<p>10! = 3628800</p>";
    public static final String javascript20 ="<p>&lt;FORM&gt;</p>\n" +
            "<p>&lt;INPUT TYPE=\"button\"</p>\n" +
            "<p>VALUE=\"Click\"</p>\n" +
            "<p>onClick=\"alert('The Button was just clicked by you..')\"&gt;</p>\n" +
            "<p>&lt;/FORM&gt;</p>";
    public static final String javascript21 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;JavaScript example for Function &lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>var string;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function print(string)</p>\n" +
            "<p>{</p>\n" +
            "<p>document.write(string);</p>\n" +
            "<p>}</p>\n" +
            "<p>string = prompt(\"Enter the string: \");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"The Entered string by the user is: \" +string);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript22 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;Checking for the Correct Number of Arguments&lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>// We define some simple functions here</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function addition(x,y) { return x + y; }</p>\n" +
            "<p>function subtract(x,y) { return x - y; }</p>\n" +
            "<p>function multiply(x,y) { return x * y; }</p>\n" +
            "<p>function divide(x,y) { return x / y; }</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>// Here's a function that takes one of the above functions</p>\n" +
            "<p>// as an argument and invokes it on two operands</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function operate(operator, operand1, operand2)</p>\n" +
            "<p>{</p>\n" +
            "<p>return operator(operand1, operand2);</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>// invoking the above function</p>\n" +
            "<p>var i = operate(addition, 56, 4);</p>\n" +
            "<p>document.write(\"Value after performing above operation is: \"+i);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>// Now we store the functions defined above in an associative array</p>\n" +
            "<p>var operators = new Object();</p>\n" +
            "<p>operators[\"addition\"] = addition;</p>\n" +
            "<p>operators[\"subtract\"] = subtract;</p>\n" +
            "<p>operators[\"multiply\"] = multiply;</p>\n" +
            "<p>operators[\"divide\"] = divide;</p>\n" +
            "<p>operators[\"pow\"] = Math.pow; // works for predefined functions too.</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>// This function takes the name of an operator, looks up</p>\n" +
            "<p>// that operator in the array, and then invokes it on the</p>\n" +
            "<p>// supplied operands. Note the syntax used to invoke the</p>\n" +
            "<p>// operator function.</p>\n" +
            "<p>function operate2(op_name, operand1, operand2)</p>\n" +
            "<p>{</p>\n" +
            "<p>if (operators[op_name] == null) return \"unknown operator\";</p>\n" +
            "<p>else return operators[op_name](operand1, operand2);</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>// We could invoke this function as follows to compute</p>\n" +
            "<p>// the value (\"hello\" + \" \" + \"world\"):</p>\n" +
            "<p>var j = operate2(\"addition\", \"hello\", operate2(\"addition\", \" \", \"world\"))</p>\n" +
            "<p>document.write(\"&lt;br&gt;Addition of string using the function is: \"+ j);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>// Using the predefined Math.pow() function</p>\n" +
            "<p>var k = operate2(\"pow\", 25, 3)</p>\n" +
            "<p>document.write(\"&lt;br&gt;Power to the given number is: \"+ k);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Value after performing above operation is: 60</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Addition of string using the function is: hello world</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Power to the given number is: 15625</p>";
    public static final String javascript23 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;A Multi-Argument Function&lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function find_max()</p>\n" +
            "<p>{</p>\n" +
            "<p>var num = -Number.MAX_VALUE;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>// loop through all the arguments, looking for, and</p>\n" +
            "<p>// remembering, the biggest.</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for(var i = 0; i &lt; find_max.arguments.length; i++)</p>\n" +
            "<p>if (find_max.arguments[i] &gt; num) num = find_max.arguments[i];</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>return num;</p>\n" +
            "<p>}</p>\n" +
            "<p>var max_num = find_max(11, 500, 457, 1256, 1, 78, 0, 452, 789);</p>\n" +
            "<p>document.write(\"Largest of given numbers is: \"+max_num)</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Largest of given numbers is: 1256</p>";
    public static final String javascript24 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;Creating and Initializing an Array &lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function InitializedArray(len)</p>\n" +
            "<p>{</p>\n" +
            "<p>this.size = len;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Element entered in array are: &lt;br&gt;\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (var i = 0; i &lt; InitializedArray.arguments.length; i++)</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>this[i] = document.write(InitializedArray.arguments[i] + \"&lt;br&gt;\");</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>//function call</p>\n" +
            "<p>InitializedArray(8, 45, 41, 99, 150);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Element entered in array are:</p>\n" +
            "<p>8</p>\n" +
            "<p>45</p>\n" +
            "<p>41</p>\n" +
            "<p>99</p>\n" +
            "<p>150</p>";
    public static final String javascript25 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt; Static Variables &lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function count()</p>\n" +
            "<p>{</p>\n" +
            "<p>count.counter = ++count.counter|| 1;</p>\n" +
            "<p>alert(\"Function is called \" + count.counter + \" time(s).\");</p>\n" +
            "<p>}</p>\n" +
            "<p>count();</p>\n" +
            "<p>count();</p>\n" +
            "<p>count();</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Total time function called \"+ count.counter + \" time(s).\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript26 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt; Object Constructor Function &lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function Rectangle(w, h)</p>\n" +
            "<p>{</p>\n" +
            "<p>this.width = w;</p>\n" +
            "<p>this.height = h;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>// invoking the constructor</p>\n" +
            "<p>R1 = new Rectangle(7, 5);</p>\n" +
            "<p>R2 = new Rectangle(12.5, 3.6);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var area;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"The width and height of 1st rectangle is: \" +R1.width+ \" and \" +R1.height);</p>\n" +
            "<p>area = R1.width * R1.height;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"&lt;br&gt;Area of rectangle is: \" + area);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"&lt;br&gt;&lt;br&gt;The width and height of 2nd rectangle is: \" +R2.width+ \" and \" +R2.height);</p>\n" +
            "<p>area = R2.width * R2.height;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"&lt;br&gt;Area of rectangle is: \" + area);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>The width and height of 1st rectangle is: 7 and 5</p>\n" +
            "<p>Area of rectangle is: 35</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>The width and height of 2nd rectangle is: 12.5 and 3.6</p>\n" +
            "<p>Area of rectangle is: 45</p>";
    public static final String javascript27 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;Define Methods in a Constructor&lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>// defining some functions that will be used as methods</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function Rectangle_area() { return this.width * this.height; }</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function Rectangle_perimeter() { return 2*this.width + 2*this.height; }</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function Rectangle_set_size(w,h) { this.width = w; this.height = h; }</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function Rectangle_enlarge() { this.width *= 2; this.height *= 2; }</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function Rectangle_shrink() { this.width /= 2; this.height /= 2; }</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>// Then define a constructor method for our Rectangle objects.</p>\n" +
            "<p>function Rectangle(w, h)</p>\n" +
            "<p>{</p>\n" +
            "<p>// initialize</p>\n" +
            "<p>this.width = w;</p>\n" +
            "<p>this.height = h;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>// define methods</p>\n" +
            "<p>this.area = Rectangle_area;</p>\n" +
            "<p>this.perimeter = Rectangle_perimeter;</p>\n" +
            "<p>this.set_size = Rectangle_set_size;</p>\n" +
            "<p>this.enlarge = Rectangle_enlarge;</p>\n" +
            "<p>this.shrink = Rectangle_shrink;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>//Create a method name rectangle</p>\n" +
            "<p>r = new Rectangle(2,2);</p>\n" +
            "<p>a = r.area();</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Area of rectangle is: \"+a);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>r.enlarge();</p>\n" +
            "<p>p = r.perimeter();</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"&lt;br&gt;Perimeter of rectangle is: \"+p);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Area of rectangle is: 4</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Perimeter of rectangle is: 16</p>";
    public static final String javascript28 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;Are Strings and Functions Compared by Value or Reference?&lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>// Determining whether strings are compared by value or reference is easy.</p>\n" +
            "<p>//If they are compared by value they will be equal, but if they</p>\n" +
            "<p>// are compared by reference, they will not be equal:</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>s1 = \"JavaScript\";</p>\n" +
            "<p>s2 = \"Java\" + \"Script\";</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (s1 == s2) document.write(\"The given strings is compared by value\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>// Determining whether functions are compared by value or reference</p>\n" +
            "<p>// If JavaScript says these two functions are equal, then functions are</p>\n" +
            "<p>// compared by value, otherwise they are compared by reference</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>F1 = new Function(\"return 1;\"); // F and G are Function objects that contain</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>F2 = new Function(\"return 1;\"); // unnamed function values.</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>f1 = F1.valueOf(); // Convert F and G to the actual function values</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>f2 = F2.valueOf();</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (f1 == f2) // now compare them</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Functions compared by value\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>The given strings is compared by value</p>";
    public static final String javascript29 ="<p>&lt;HTML&gt;</p>\n" +
            "<p>&lt;HEAD&gt;</p>\n" +
            "<p>&lt;TITLE&gt;Today's Date and Time&lt;/TITLE&gt;</p>\n" +
            "<p>&lt;SCRIPT LANGUAGE=\"JavaScript\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>// Define a function for use later on.</p>\n" +
            "<p>function print_todays_date()</p>\n" +
            "<p>{</p>\n" +
            "<p>var T_date = new Date(); // today's date and time.</p>\n" +
            "<p>document.write(T_date.toLocaleString());</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/SCRIPT&gt;</p>\n" +
            "<p>&lt;/HEAD&gt;</p>\n" +
            "<p>&lt;BODY&gt;</p>\n" +
            "<p>&lt;HR&gt;Today's date and time are:&lt;BR&gt;&lt;B&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;SCRIPT LANGUAGE=\"JavaScript\"&gt;</p>\n" +
            "<p>// now call the function we defined above</p>\n" +
            "<p>print_todays_date();</p>\n" +
            "<p>&lt;/SCRIPT&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/B&gt;&lt;HR&gt;</p>\n" +
            "<p>&lt;/BODY&gt;</p>\n" +
            "<p>&lt;/HTML&gt;</p>";
    public static final String javascript30 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=\"utf-8\"&gt;</p>\n" +
            "<p>&lt;title&gt;Current day and time&lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>var today = new Date();</p>\n" +
            "<p>var day = today.getDay();</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var daylist = [\"Sunday\",\"Monday\",\"Tuesday\",\"Wednesday \",\"Thursday\",\"Friday\",\"Saturday\"];</p>\n" +
            "<p>document.write(\"Today is : \" + daylist[day] + \".\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var hour = today.getHours();</p>\n" +
            "<p>var minute = today.getMinutes();</p>\n" +
            "<p>var second = today.getSeconds();</p>\n" +
            "<p>var prepand = (hour &gt;= 12)? \" PM \":\" AM \";</p>\n" +
            "<p>hour = (hour &gt;= 12)? hour - 12: hour;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (hour===0 &amp;&amp; prepand===' PM ')</p>\n" +
            "<p>{</p>\n" +
            "<p>if (minute===0 &amp;&amp; second===0)</p>\n" +
            "<p>{</p>\n" +
            "<p>hour=12;</p>\n" +
            "<p>prepand=' Noon';</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>hour=12;</p>\n" +
            "<p>prepand=' PM';</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (hour===0 &amp;&amp; prepand===' AM ')</p>\n" +
            "<p>{</p>\n" +
            "<p>if (minute===0 &amp;&amp; second===0)</p>\n" +
            "<p>{</p>\n" +
            "<p>hour=12;</p>\n" +
            "<p>prepand=' Midnight';</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>hour=12;</p>\n" +
            "<p>prepand=' AM';</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"&lt;br&gt;Current Time : \"+hour + prepand + \" : \" + minute + \" : \" + second);</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p></p>\n" +
            "<p>Today is : Wednesday .</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Current Time : 6 PM : 19 : 16</p>";
    public static final String javascript31 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;title&gt;Print the current page.&lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;p&gt;Click the button to print the current page.&lt;/p&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;button onclick=\"print_current_page()\"&gt;Click here&lt;/button&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function print_current_page()</p>\n" +
            "<p>{</p>\n" +
            "<p>window.print();</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript32 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=\"utf-8\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;Write a JavaScript program to get the current date.&lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script&gt;.</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var today = new Date();</p>\n" +
            "<p>var dd = today.getDate();</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var mm = today.getMonth()+1;</p>\n" +
            "<p>var yyyy = today.getFullYear();</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if(dd&lt;10)</p>\n" +
            "<p>{</p>\n" +
            "<p>dd='0'+dd;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if(mm&lt;10)</p>\n" +
            "<p>{</p>\n" +
            "<p>mm='0'+mm;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Current date in different format is: \");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>today = mm+'-'+dd+'-'+yyyy;</p>\n" +
            "<p>document.write(\"&lt;br&gt;&lt;br&gt;\"+today+ \" (mm-dd-yyyy)\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>today = mm+'/'+dd+'/'+yyyy;</p>\n" +
            "<p>document.write(\"&lt;br&gt;&lt;br&gt;\"+today+\" (mm/dd/yyyy)\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>today = dd+'-'+mm+'-'+yyyy;</p>\n" +
            "<p>document.write(\"&lt;br&gt;&lt;br&gt;\"+today+ \" (dd-mm-yyyy)\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>today = dd+'/'+mm+'/'+yyyy;</p>\n" +
            "<p>document.write(\"&lt;br&gt;&lt;br&gt;\"+today+ \" (dd/mm/yyyy)\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Current date in different format is:</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>09-08-2016 (mm-dd-yyyy)</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>09/08/2016 (mm/dd/yyyy)</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>08-09-2016 (dd-mm-yyyy)</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>08/09/2016 (dd/mm/yyyy)</p>";
    public static final String javascript33 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;Calculate area of a traingle&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>var side1 = 6;</p>\n" +
            "<p>var base = 5;</p>\n" +
            "<p>var side3 = 8;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var perimeter = (side1 + base + side3);</p>\n" +
            "<p>document.write(\"Perimeter of Traingle is : \"+perimeter);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var semi_perimeter = perimeter/2;</p>\n" +
            "<p>document.write(\"Semi-perimeter of Traingle is : \"+semi_perimeter);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var area = Math.sqrt(perimeter*((perimeter-side1)*(perimeter-base)*(perimeter-side3)));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"&lt;br&gt;Area of Traingle is : \"+area);</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Perimeter of Traingle is : 19</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Semi-perimeter of Traingle is : 9.5</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Area of Traingle is : 195.03333048481738</p>";
    public static final String javascript34 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript basic animation&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;body onload=\"animate_string('target')\"</p>\n" +
            "<p>&lt;pre id=\"target\"&gt;</p>\n" +
            "<p>&lt;font size=\"+5\"&gt;</p>\n" +
            "<p>&lt;marquee width=\"100%\" height=\"200\" &gt;</p>\n" +
            "<p>&lt;/font&gt;</p>\n" +
            "<p>Welcome to the tutorial of JavaScript.</p>\n" +
            "<p>&lt;/marquee&gt; &lt;/pre&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script type=\"text/javascript\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function animate_string(id)</p>\n" +
            "<p>{</p>\n" +
            "<p>var element = document.getElementById(id);</p>\n" +
            "<p>var textNode = element.childNodes[0]; // assuming no other children</p>\n" +
            "<p>var text = textNode.data;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>setInterval(function ()</p>\n" +
            "<p>{</p>\n" +
            "<p>text = text[text.length - 1] + text.substring(0, text.length - 1);</p>\n" +
            "<p>textNode.data = text;</p>\n" +
            "<p>}, 100);</p>\n" +
            "<p>}</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript35 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&lt;title&gt;Find Leap Year&lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>year = window.prompt(\"Enter a Year of your choice \");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (year % 4 !== 0 &amp;&amp; year % 400 !== 0)</p>\n" +
            "<p>{</p>\n" +
            "<p>alert(year + \" is not a leap year.\");</p>\n" +
            "<p>document.write(\"&lt;br&gt;\"+year+\" is not a leap year.\");</p>\n" +
            "<p>}</p>\n" +
            "<p>else if (year % 100 !== 0)</p>\n" +
            "<p>{</p>\n" +
            "<p>alert(year + \" is a leap year. \");</p>\n" +
            "<p>document.write(\"&lt;br&gt;\"+year+\" is a leap year.\");</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>alert(\"Wrong Input.\");</p>\n" +
            "<p>}</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript36 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&lt;title&gt;Program to find 1st January is being a Sunday between 2000 and 2050.&lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (var year = 2000; year &lt;= 2050; year++)</p>\n" +
            "<p>{</p>\n" +
            "<p>var d = new Date(year, 0, 1);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if ( d.getDay() === 0 )</p>\n" +
            "<p>document.write(\"&lt;br&gt;1st January is being a Sunday for \"+year);</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>1st January is being a Sunday for 2006</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>1st January is being a Sunday for 2012</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>1st January is being a Sunday for 2017</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>1st January is being a Sunday for 2023</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>1st January is being a Sunday for 2034</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>1st January is being a Sunday for 2040</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>1st January is being a Sunday for 2045</p>";
    public static final String javascript37 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&lt;title&gt;Guessing a number&lt;/title&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>// Get a random integer from 1 to 10 inclusive</p>\n" +
            "<p>var num = Math.ceil(Math.random() * 10);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var ran_num = prompt('Enter any number of your choice to guess the number between 1 and 10 ');</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (ran_num == num)</p>\n" +
            "<p>alert('Right Guess..The number matched. ');</p>\n" +
            "<p>else</p>\n" +
            "<p>alert('Not matched, the number was ' + num);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Try again later.\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript38 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript program to calculate days left until next Christmas&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>today_date = new Date();</p>\n" +
            "<p>var cmas_day =new Date(today_date.getFullYear(), 11, 25);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (today_date.getMonth()==11 &amp;&amp; today_date.getDate()&gt;25)</p>\n" +
            "<p>{</p>\n" +
            "<p>cmas_day.setFullYear(cmas_day.getFullYear()+1);</p>\n" +
            "<p>}</p>\n" +
            "<p>var one_day=1000*60*60*24;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>alert(Math.ceil((cmas_day.getTime()-today_date.getTime())/(one_day))+ \" days left until Christmas!\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(Math.ceil((cmas_day.getTime()-today_date.getTime())/(one_day))+ \" days to go..&lt;br&gt; Merry Christmas!\")</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript39 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript program to calculate multiplication and division of two numbers &lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;style type=\"text/css\"&gt;</p>\n" +
            "<p>body {margin: 30px;}</p>\n" +
            "<p>&lt;/style&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;form&gt;</p>\n" +
            "<p>Entet 1st Number : &lt;input type=\"text\" id=\"firstNumber\" /&gt;&lt;br&gt;&lt;br&gt;</p>\n" +
            "<p>Enter 2nd Number: &lt;input type=\"text\" id=\"secondNumber\" /&gt;&lt;br&gt;&lt;br&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;input type=\"button\" onClick=\"multiplyBy()\" Value=\"Multiply\" /&gt;</p>\n" +
            "<p>&lt;input type=\"button\" onClick=\"divideBy()\" Value=\"Divide\" /&gt;</p>\n" +
            "<p>&lt;/form&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;p&gt;The Result is : &lt;br&gt;</p>\n" +
            "<p>&lt;span id = \"result\"&gt;&lt;/span&gt;</p>\n" +
            "<p>&lt;/p&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function multiplyBy()</p>\n" +
            "<p>{</p>\n" +
            "<p>num1 = document.getElementById(\"firstNumber\").value;</p>\n" +
            "<p>num2 = document.getElementById(\"secondNumber\").value;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.getElementById(\"result\").innerHTML = num1 * num2;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function divideBy()</p>\n" +
            "<p>{</p>\n" +
            "<p>num1 = document.getElementById(\"firstNumber\").value;</p>\n" +
            "<p>num2 = document.getElementById(\"secondNumber\").value;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.getElementById(\"result\").innerHTML = num1 / num2;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript40 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=\"utf-8\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript program to get the URL of the loading page&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>alert(document.URL);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"\"+document.URL);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript41 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript Program for Reverse a number &lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function reverse_a_number(n)</p>\n" +
            "<p>{</p>\n" +
            "<p>n = n + \"\";</p>\n" +
            "<p>return n.split(\"\").reverse().join(\"\");</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Reverse of the given number is: \"+reverse_a_number(45886));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Reverse of the given number is: 68854</p>";
    public static final String javascript42 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script type=\"text/javascript\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function check_Palindrome()</p>\n" +
            "<p>{</p>\n" +
            "<p>var revStr = \"\";</p>\n" +
            "<p>var str = document.getElementById(\"str\").value;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var i = str.length;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for(var j=i; j&gt;=0; j--)</p>\n" +
            "<p>{</p>\n" +
            "<p>revStr = revStr+str.charAt(j);</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if(str == revStr)</p>\n" +
            "<p>{</p>\n" +
            "<p>alert(str+\" is Palindrome\");</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>alert(str+\" is not a Palindrome\");</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;center&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;form &gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Enter any String or Number to check palindrome or not: &lt;input type=\"text\" id=\"str\" name=\"string\" /&gt;&lt;br /&gt;</p>\n" +
            "<p>&lt;input type=\"submit\" value=\"Check\" onclick=\"check_Palindrome(); \"/&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/form&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;center&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript43 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript to generates all combinations of a word.&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function generate_word(str)</p>\n" +
            "<p>{</p>\n" +
            "<p>var array = [];</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (var x = 0, y=1; x &lt; str.length; x++,y++)</p>\n" +
            "<p>{</p>\n" +
            "<p>array[x]=str.substring(x, y);</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var combine_word = [];</p>\n" +
            "<p>var temp= \"\";</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var slent = Math.pow(2, array.length);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (var i = 0; i &lt; str_len ; i++)</p>\n" +
            "<p>{</p>\n" +
            "<p>temp= \"\";</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (var j=0;j&lt;array.length;j++)</p>\n" +
            "<p>{</p>\n" +
            "<p>if ((i &amp; Math.pow(2,j)))</p>\n" +
            "<p>{</p>\n" +
            "<p>temp += array[j];</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (temp !== \"\")</p>\n" +
            "<p>{</p>\n" +
            "<p>combine_word.push(temp);</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Combination of word are:&lt;br&gt;\"+combine_word.join(\"&lt;br&gt;\"));</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>generate_word(\"can\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Combination of word are:</p>\n" +
            "<p>c</p>\n" +
            "<p>a</p>\n" +
            "<p>ca</p>\n" +
            "<p>n</p>\n" +
            "<p>cn</p>\n" +
            "<p>an</p>\n" +
            "<p>can</p>";
    public static final String javascript44 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;Arrange the alphabets in alphabetic order of the given words. &lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function alphabet_order(str)</p>\n" +
            "<p>{</p>\n" +
            "<p>return str.split('').sort().join('');</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"The alphabetic order of the given word is: \" +alphabet_order(\"JAVASCRIPT\"));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>The alphabetic order of the given word is: AACIJPRSTV</p>";
    public static final String javascript45 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript function that accepts a string as a parameter and converts the first letter of each word of the string in upper case.&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function uppercase(str)</p>\n" +
            "<p>{</p>\n" +
            "<p>var arr = str.split(' ');</p>\n" +
            "<p>var new_arr = [];</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for(var x = 0; x &lt; arr.length; x++)</p>\n" +
            "<p>{</p>\n" +
            "<p>new_arr.push(arr[x].charAt(0).toUpperCase()+arr[x].slice(1));</p>\n" +
            "<p>}</p>\n" +
            "<p>return new_arr.join(' ');</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"The sentence becomes: &lt;br&gt;\"+uppercase(\"i am learning javascript.\"));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>The sentence becomes:</p>\n" +
            "<p>I Am Learning Javascript.</p>";
    public static final String javascript46 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt; JavaScript to check a number as a parameter is prime or not.&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function prime_num(num)</p>\n" +
            "<p>{</p>\n" +
            "<p>if (num===1)</p>\n" +
            "<p>{</p>\n" +
            "<p>return document.write(\"The given number is not prime number.\");</p>\n" +
            "<p>}</p>\n" +
            "<p>else if(num === 2)</p>\n" +
            "<p>{</p>\n" +
            "<p>return document.write(\"The given number is a prime number.\");</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>for(n = 2; n &lt; num; n++)</p>\n" +
            "<p>{</p>\n" +
            "<p>if(num % n === 0)</p>\n" +
            "<p>{</p>\n" +
            "<p>return document.write(\"The given number is not prime number.\");</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>return document.write(\"The given number is a prime number.\");</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var n = prime_num(121);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>The given number is not prime number.</p>";
    public static final String javascript47 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;Find the longest word within a string&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function longest_word(str)</p>\n" +
            "<p>{</p>\n" +
            "<p>var array = str.match(/\\w[a-z]{0,}/gi);</p>\n" +
            "<p>var result = array[0];</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for(var i = 1 ; i &lt; array.length ; i++)</p>\n" +
            "<p>{</p>\n" +
            "<p>if(result.length &lt; array[i].length)</p>\n" +
            "<p>{</p>\n" +
            "<p>result = array[i];</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>return result;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"The longest word from the given string is:&lt;br&gt; \"+longest_word('I am learning a new programming language.'));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>The longest word from the given string is:</p>\n" +
            "<p>Programming</p>";
    public static final String javascript48 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=\"utf-8\"&gt;</p>\n" +
            "<p>&lt;meta name=\"viewport\" content=\"width=device-width\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript to count number of vowels in a given string.&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function vowel_count(str)</p>\n" +
            "<p>{</p>\n" +
            "<p>var vowel_list = 'aeiouAEIOU';</p>\n" +
            "<p>var count = 0;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for(var i = 0; i &lt;str.length ; i++)</p>\n" +
            "<p>{</p>\n" +
            "<p>if (vowel_list.indexOf(str[i]) !== -1)</p>\n" +
            "<p>{</p>\n" +
            "<p>count += 1;</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>return count;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Total numbers of Vowels in a given string are: \" +vowel_count(\"Javascript is very intresting. \"));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Total numbers of Vowels in a given string are: 8</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>";
    public static final String javascript49 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript to Detect Data Types&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function detect_data_type(value)</p>\n" +
            "<p>{</p>\n" +
            "<p>var data_types = [Function, RegExp, Number, String, Boolean, Object], x, length;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (typeof value === \"object\" || typeof value === \"function\")</p>\n" +
            "<p>{</p>\n" +
            "<p>for (x = 0, length = data_types.length; x &lt; length; x++)</p>\n" +
            "<p>{</p>\n" +
            "<p>if (value instanceof data_types[x])</p>\n" +
            "<p>{</p>\n" +
            "<p>return data_types[x];</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>return typeof value;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Data type of the first input is : \"+detect_data_type(12));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"&lt;br&gt;Data type of the second input is : \"+detect_data_type('JavaScript'));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"&lt;br&gt;Data type of the third input is : \"+detect_data_type(false));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Data type of the first input is : number</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Data type of the second input is : string</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Data type of the third input is : Boolean</p>";
    public static final String javascript50 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript to genrate an Identity Matrix&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function identity_matrix(size)</p>\n" +
            "<p>{</p>\n" +
            "<p>var i;</p>\n" +
            "<p>var j;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Identity matrix is: &lt;br&gt;&lt;br&gt; \");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (i=0; i&lt;size; i++)</p>\n" +
            "<p>{</p>\n" +
            "<p>for (j=0; j&lt;size; j++)</p>\n" +
            "<p>{</p>\n" +
            "<p>if (i == j)</p>\n" +
            "<p>{</p>\n" +
            "<p>document.write(\" 1 \");</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>document.write(\" 0 \");</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>document.write('&lt;br&gt;');</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>identity_matrix(5);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Identity matrix is:</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>1 0 0 0 0</p>\n" +
            "<p>0 1 0 0 0</p>\n" +
            "<p>0 0 1 0 0</p>\n" +
            "<p>0 0 0 1 0</p>\n" +
            "<p>0 0 0 0 1</p>";
    public static final String javascript51 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;Find the second lowest and second greatest numbers from an array&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function lower_greater(num)</p>\n" +
            "<p>{</p>\n" +
            "<p>num.sort(function(x,y)</p>\n" +
            "<p>{</p>\n" +
            "<p>return x-y;</p>\n" +
            "<p>});</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var n = [num[0]];</p>\n" +
            "<p>var result = [];</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for(var j=1; j&lt;num.length; j++)</p>\n" +
            "<p>{</p>\n" +
            "<p>if(num[j-1] !== num[j])</p>\n" +
            "<p>{</p>\n" +
            "<p>n.push(num[j]);</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>result.push(n[1],n[n.length-2]);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>return result.join(',');</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"The second Largest and Smaller number from the array are: \"+lower_greater([99, 1, 69, 0, 55, 42 ]));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>The second Largest and Smaller number from the array are: 1, 69</p>";
    public static final String javascript52 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript to find the Perfect Number&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function perfect_num(num)</p>\n" +
            "<p>{</p>\n" +
            "<p>var temp = 0;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for(var i=1;i&lt;=num/2;i++)</p>\n" +
            "<p>{</p>\n" +
            "<p>if(num%i === 0)</p>\n" +
            "<p>{</p>\n" +
            "<p>temp += i;</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if(temp === num &amp;&amp; temp !== 0)</p>\n" +
            "<p>{</p>\n" +
            "<p>document.write(\"The number is a perfect square.\");</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>document.write(\"The number is not a perfect square.\");</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>perfect_num(28);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>The number is a perfect square.</p>";
    public static final String javascript53 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;Compute the factors of a positive integer&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function find_factors(n)</p>\n" +
            "<p>{</p>\n" +
            "<p>var fact_arr = [], i;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (i = 1; i &lt;= Math.floor(Math.sqrt(n)); i += 1)</p>\n" +
            "<p>if (n % i === 0)</p>\n" +
            "<p>{</p>\n" +
            "<p>fact_arr.push(i);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (n / i !== i)</p>\n" +
            "<p>fact_arr.push(n / i);</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>fact_arr.sort(function(x, y)</p>\n" +
            "<p>{</p>\n" +
            "<p>return x - y;}); // numeric sort</p>\n" +
            "<p>return fact_arr;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"The Factors of numbers are: \");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"&lt;br&gt;[ \" +find_factors(15)+ \" ]\"); // [1,3,5,15]</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"&lt;br&gt;[ \" +find_factors(16)+ \" ]\"); // [1,2,4,8,16]</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"&lt;br&gt;[ \" +find_factors(17)+ \" ]\"); // [1,17]</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>The Factors of numbers are:</p>\n" +
            "<p>[ 1, 3, 5, 15 ]</p>\n" +
            "<p>[ 1, 2, 4, 8, 16 ]</p>\n" +
            "<p>[ 1, 17 ]</p>";
    public static final String javascript54 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;Write a JavaScript function to convert an amount to coins.&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function amount_change(amount, coins)</p>\n" +
            "<p>{</p>\n" +
            "<p>if (amount == 0)</p>\n" +
            "<p>{</p>\n" +
            "<p>return [];</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>if (amount &gt;= coins[0])</p>\n" +
            "<p>{</p>\n" +
            "<p>left = (amount - coins[0]);</p>\n" +
            "<p>return [coins[0]].concat( amount_change(left, coins) );</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>coins.shift();</p>\n" +
            "<p>return amount_change(amount, coins);</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"The amount will be made as: \"+amount_change(105, [25, 10, 5, 2,1]));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>The amount will be made as: 25, 25, 25, 25, 5</p>";
    public static final String javascript55 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript to find exponent of a given number. &lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function exponent(number,n)</p>\n" +
            "<p>{</p>\n" +
            "<p>var num = 1;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (var i =1; i &lt;= n; i++)</p>\n" +
            "<p>{</p>\n" +
            "<p>num = number * num;</p>\n" +
            "<p>}</p>\n" +
            "<p>return num;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Result is: \"+exponent(2, 3));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Result is: 64</p>";
    public static final String javascript56 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;Extract unique character from a string&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function unique_char(str1)</p>\n" +
            "<p>{</p>\n" +
            "<p>var str=str1;</p>\n" +
            "<p>var unique=\"\";</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (var x=0;x&lt;str.length;x++)</p>\n" +
            "<p>{</p>\n" +
            "<p>if(unique.indexOf(str.charAt(x))== -1)</p>\n" +
            "<p>{</p>\n" +
            "<p>unique += str[x];</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>return unique;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Output is:\"+unique_char(\"thequickbrownfoxjumpsoverthelazydog\"));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Output is: thequickbrownfxjmpsvlazydg</p>";
    public static final String javascript57 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript to search an element using Binary Search&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function binary_search(array, key)</p>\n" +
            "<p>{</p>\n" +
            "<p>var position = Math.floor(array.length / 2);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (array[position] === key)</p>\n" +
            "<p>{</p>\n" +
            "<p>return position;</p>\n" +
            "<p>}</p>\n" +
            "<p>else if (array.length === 1)</p>\n" +
            "<p>{</p>\n" +
            "<p>return null;</p>\n" +
            "<p>}</p>\n" +
            "<p>else if (array[position] &lt; key)</p>\n" +
            "<p>{</p>\n" +
            "<p>var arr = array.slice(position + 1);</p>\n" +
            "<p>var res = binary_search(arr, key);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (res === null)</p>\n" +
            "<p>{</p>\n" +
            "<p>return null;</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>return position + 1 + res;</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>var arr1 = array.slice(0, position);</p>\n" +
            "<p>return binary_search(arr1, key);</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var myArray = [1, 2, 3, 5, 6, 7, 10, 11, 14, 15, 17, 19, 20, 22, 23];</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Element search is present at position: \"+binary_search(myArray, 6));</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Element search is present at position: 4</p>";
    public static final String javascript58 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt; JavaScript to find Bigger elements in an array&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function find_element(num)</p>\n" +
            "<p>{</p>\n" +
            "<p>return function(value, index, array)</p>\n" +
            "<p>{</p>\n" +
            "<p>return (value &gt;= num);</p>\n" +
            "<p>};</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var result = [0, 2, 11, 45, 4, 31, 64, 10, 3, 23, 1 ]. filter(find_element(2));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Element bigger than the entered element is: \"+result);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Element bigger than the entered element is: 2, 11, 45, 4, 31, 64, 10, 3, 23</p>";
    public static final String javascript59 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=\"utf-8\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript to count number of occurences of alpabet within a given string&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function char_count(str, letter)</p>\n" +
            "<p>{</p>\n" +
            "<p>var count = 0;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (var position = 0; position &lt; str.length; position++)</p>\n" +
            "<p>{</p>\n" +
            "<p>if (str.charAt(position) == letter)</p>\n" +
            "<p>{</p>\n" +
            "<p>count += 1;</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>return count;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(char_count('johnny-jump-up ', 'n'));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>The count of given alphabet is: 2</p>";
    public static final String javascript60 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=\"utf-8\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript to find the alphabet which is not repeated in given string.&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function find_character(str)</p>\n" +
            "<p>{</p>\n" +
            "<p>var array = str.split('');</p>\n" +
            "<p>var result = '';</p>\n" +
            "<p>var count = 0;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (var i = 0; i &lt; array.length; i++)</p>\n" +
            "<p>{</p>\n" +
            "<p>count = 0;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (var j = 0; j &lt; array.length; j++)</p>\n" +
            "<p>{</p>\n" +
            "<p>if (array[i] === array[j])</p>\n" +
            "<p>{</p>\n" +
            "<p>count+= 1;</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (count &lt; 2)</p>\n" +
            "<p>{</p>\n" +
            "<p>result = array[i];</p>\n" +
            "<p>break;</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>return result;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"The non-repeated word is: \"+find_character('johnny-jump-up'));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>The non-repeated word is: o</p>\n" +
            "<p>&nbsp;</p>";
    public static final String javascript61 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=\"utf-8\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript function for Bubble Sort&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function bubble_Sort(num)</p>\n" +
            "<p>{</p>\n" +
            "<p>var swap_num;</p>\n" +
            "<p>var n = num.length-1;</p>\n" +
            "<p>var j = 0;</p>\n" +
            "<p>var x=num;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>do</p>\n" +
            "<p>{</p>\n" +
            "<p>swap_num = false;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (var i=0; i &lt; n; i++)</p>\n" +
            "<p>{</p>\n" +
            "<p>if (x[i] &lt; x[i+1])</p>\n" +
            "<p>{</p>\n" +
            "<p>var temp = x[i];</p>\n" +
            "<p>x[i] = x[i+1];</p>\n" +
            "<p>x[i+1] = temp;</p>\n" +
            "<p>swap_num = true;</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>n--;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>} while (swap_num);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>return x;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"After sorting in descending order : &lt;br&gt;\" +bubble_Sort([1, 99, 4, 54, 22, 48, 0, 3, 23, 2, 4, 67, 24, 34, 13]));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>After sorting in descending order :</p>\n" +
            "<p>99,67,54,48,34,24,23,22,13,4,4,3,2,1,0</p>";
    public static final String javascript62 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript example for IF-Statement&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;p id=\"demo\"&gt;Good Evening!&lt;/p&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (new Date().getHours() &lt; 18)</p>\n" +
            "<p>{</p>\n" +
            "<p>document.getElementById(\"demo\").innerHTML = \"Good day!\";</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:<br /><br /></strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Good day!</p>";
    public static final String javascript63 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;p&gt;Click the button to display a time-based greeting:&lt;/p&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;button onclick=\"myFunction()\"&gt;Click Here&lt;/button&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;p id=\"demo\"&gt;&lt;/p&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function myFunction()</p>\n" +
            "<p>{</p>\n" +
            "<p>var hour = new Date().getHours();</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var greeting;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (hour &lt; 18)</p>\n" +
            "<p>{</p>\n" +
            "<p>greeting = \"Good day!!\";</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>greeting = \"Good evening!!\";</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.getElementById(\"demo\").innerHTML = greeting;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>}</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript64 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;p&gt;Click the button to get a time-based greeting:&lt;/p&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;button onclick=\"myFunction()\"&gt;Click Here&lt;/button&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;p id=\"demo\"&gt;&lt;/p&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function myFunction()</p>\n" +
            "<p>{</p>\n" +
            "<p>var greeting;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var time = new Date().getHours();</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (time &lt; 10)</p>\n" +
            "<p>{</p>\n" +
            "<p>greeting = \"Good morning!!\";</p>\n" +
            "<p>}</p>\n" +
            "<p>else if (time &lt; 20)</p>\n" +
            "<p>{</p>\n" +
            "<p>greeting = \"Good day!!\";</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>greeting = \"Good evening!!\";</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.getElementById(\"demo\").innerHTML = greeting;</p>\n" +
            "<p>}</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript65 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript for Switch case&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script type=\"text/javascript\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var num=prompt(\"Enter any number between 1 to 7:\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>switch (num)</p>\n" +
            "<p>{</p>\n" +
            "<p>case (num=\"1\"):</p>\n" +
            "<p>document.write(\"Sunday\");</p>\n" +
            "<p>alert(\"The day is Sunday.\")</p>\n" +
            "<p>break;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>case (num=\"2\"):</p>\n" +
            "<p>document.write(\"Monday\");</p>\n" +
            "<p>alert(\"The day is Monday.\")</p>\n" +
            "<p>break;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>case (num=\"3\"):</p>\n" +
            "<p>document.write(\"Tuesday\");</p>\n" +
            "<p>alert(\"The day is Tuesday.\")</p>\n" +
            "<p>break;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>case (num=\"4\"):</p>\n" +
            "<p>document.write(\"Wednesday\");</p>\n" +
            "<p>alert(\"The day is Wednesday.\")</p>\n" +
            "<p>break;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>case (num=\"5\"):</p>\n" +
            "<p>document.write(\"Thursday\");</p>\n" +
            "<p>alert(\"The day is Thursday.\")</p>\n" +
            "<p>break;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>case (num=\"6\"):</p>\n" +
            "<p>document.write(\"Friday\");</p>\n" +
            "<p>alert(\"The day is Friday.\")</p>\n" +
            "<p>break;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>case (num=\"7\"):</p>\n" +
            "<p>document.write(\"Saturday\");</p>\n" +
            "<p>alert(\"The day is Saturday.\")</p>\n" +
            "<p>break;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>default:</p>\n" +
            "<p>document.write(\"Invalid Weekday\");</p>\n" +
            "<p>break;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript66 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;button onclick=\"myFunction()\"&gt;Click here&lt;/button&gt;</p>\n" +
            "<p>&lt;p id=\"example\"&gt;&lt;/p&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function myFunction()</p>\n" +
            "<p>{</p>\n" +
            "<p>var a = \"\", i;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (i=0; i&lt;10; i++)</p>\n" +
            "<p>{</p>\n" +
            "<p>a = a + \"The number is \" + i + \"&lt;br&gt;\";</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.getElementById(\"example\").innerHTML = a;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript67 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript example for - in loop. &lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>var Student = function(name)</p>\n" +
            "<p>{</p>\n" +
            "<p>this.name = name;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Student.prototype.age = 20;</p>\n" +
            "<p>Student.prototype.country = \"India\";</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var student = new Student(\"Sachin\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (var item in student)</p>\n" +
            "<p>{</p>\n" +
            "<p>if (student.hasOwnProperty(item))</p>\n" +
            "<p>{</p>\n" +
            "<p>alert (\"Student name is : \"+student[item]);</p>\n" +
            "<p>document.write(\"Student name is : \"+student[item] +\"&lt;br&gt;\");</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript68 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript example for - of loop. &lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>let arr = [3, 2, 4, 0, 1, 9];</p>\n" +
            "<p>arr.hello = \"hello\";</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (let i in arr)</p>\n" +
            "<p>{</p>\n" +
            "<p>document.write(\"&lt;br&gt;\"+i); // logs \"0\", \"1\", \"2\", \"3\", \"4\", \"hello\"</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (let i of arr)</p>\n" +
            "<p>{</p>\n" +
            "<p>document.write(\"&lt;br&gt;\"+i); // logs \"3\", \"5\", \"7\"</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>0</p>\n" +
            "<p>1</p>\n" +
            "<p>2</p>\n" +
            "<p>3</p>\n" +
            "<p>4</p>\n" +
            "<p>5</p>\n" +
            "<p>hello</p>\n" +
            "<p>3</p>\n" +
            "<p>2</p>\n" +
            "<p>4</p>\n" +
            "<p>0</p>\n" +
            "<p>1</p>\n" +
            "<p>9</p>";
    public static final String javascript69 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript example Do - while loop. &lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var sum = 0;</p>\n" +
            "<p>var number = 1;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>do</p>\n" +
            "<p>{</p>\n" +
            "<p>sum += number; // body</p>\n" +
            "<p>number++; // updater</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>} while (number &lt;= 20); // condition</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>alert(\"Sum of numbers upto 20 : \" + sum);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Sum of numbers upto 20 : \" + sum);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript70 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript example While loop. &lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>var i = 0;</p>\n" +
            "<p>var x = 0;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>while (i &lt; 10)</p>\n" +
            "<p>{</p>\n" +
            "<p>i++;</p>\n" +
            "<p>x += i;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Addition of numbers is : \"+x);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Addition of number is : 55a</p>";
    public static final String javascript71 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript example break statement. &lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>var i = 0;</p>\n" +
            "<p>var j = 0;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>labelCancelLoops:</p>\n" +
            "<p>while (true)</p>\n" +
            "<p>{</p>\n" +
            "<p>document.write(\"&lt;br&gt;Outer loops: \" + i + \"&lt;br&gt;\");</p>\n" +
            "<p>i += 1;</p>\n" +
            "<p>j = 1;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>while (true)</p>\n" +
            "<p>{</p>\n" +
            "<p>document.write(\"Inner loops: \" + j + \"&lt;br&gt;\");</p>\n" +
            "<p>j += 1;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (j == 5 &amp;&amp; i == 5)</p>\n" +
            "<p>{</p>\n" +
            "<p>break labelCancelLoops;</p>\n" +
            "<p>}</p>\n" +
            "<p>else if (j == 5)</p>\n" +
            "<p>{</p>\n" +
            "<p>break;</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Outer loops: 0</p>\n" +
            "<p>Inner loops: 1</p>\n" +
            "<p>Inner loops: 2</p>\n" +
            "<p>Inner loops: 3</p>\n" +
            "<p>Inner loops: 4</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Outer loops: 1</p>\n" +
            "<p>Inner loops: 1</p>\n" +
            "<p>Inner loops: 2</p>\n" +
            "<p>Inner loops: 3</p>\n" +
            "<p>Inner loops: 4</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Outer loops: 2</p>\n" +
            "<p>Inner loops: 1</p>\n" +
            "<p>Inner loops: 2</p>\n" +
            "<p>Inner loops: 3</p>\n" +
            "<p>Inner loops: 4</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Outer loops: 3</p>\n" +
            "<p>Inner loops: 1</p>\n" +
            "<p>Inner loops: 2</p>\n" +
            "<p>Inner loops: 3</p>\n" +
            "<p>Inner loops: 4</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Outer loops: 4</p>\n" +
            "<p>Inner loops: 1</p>\n" +
            "<p>Inner loops: 2</p>\n" +
            "<p>Inner loops: 3</p>\n" +
            "<p>Inner loops: 4</p>";
    public static final String javascript72 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript example Continue statement. &lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var number = 0;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>while (number &lt;= 10)</p>\n" +
            "<p>{</p>\n" +
            "<p>number++;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if ((number % 2) != 0)</p>\n" +
            "<p>{</p>\n" +
            "<p>continue;</p>\n" +
            "<p>}</p>\n" +
            "<p>alert(number);</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript73 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;Defining and using the valueOf() method &lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function Complex(x,y)</p>\n" +
            "<p>{</p>\n" +
            "<p>this.x = x; // real part of complex number</p>\n" +
            "<p>this.y = y; // imaginary part of complex number.</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>// force the prototype object to be created.</p>\n" +
            "<p>new Complex(0,0);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>// define some methods</p>\n" +
            "<p>Complex.prototype.valueOf = new Function(\"return this.x\");</p>\n" +
            "<p>Complex.prototype.toString = new Function(\"return '{'+this.x+','+this.y+'}'\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>// create new complex number object</p>\n" +
            "<p>c = new Complex(4,1);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>x = c * 2; // x = 8</p>\n" +
            "<p>document.write(\"The Value becomes: \"+x+\"&lt;br&gt;\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>x = Math.sqrt(c); // x = 2</p>\n" +
            "<p>document.write(\"After taking its square root value is: \"+x);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>The Value of becomes: 8</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>After taking its square root value is: 2</p>";
    public static final String javascript74 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaSript rogram for Try - Catch Block&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>var txt = \"\";</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function message()</p>\n" +
            "<p>{</p>\n" +
            "<p>try</p>\n" +
            "<p>{</p>\n" +
            "<p>addalert(\"Welcome guest!\");</p>\n" +
            "<p>}</p>\n" +
            "<p>catch(err)</p>\n" +
            "<p>{</p>\n" +
            "<p>txt = \"There was an error on this page.\\n\\n\";</p>\n" +
            "<p>txt += \"Click OK to continue viewing this page,\\n\";</p>\n" +
            "<p>txt += \"or Cancel to return to the home page.\\n\\n\";</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if(!confirm(txt))</p>\n" +
            "<p>{</p>\n" +
            "<p>document.location.href = \"http://www.google.com/\";</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;input type=\"button\" value=\"View message\" onclick=\"message()\" /&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript75 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;title&gt;JavaScript Program for one Error event&lt;/title&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>onerror = handleErr;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var txt = \"\";</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function handleErr(msg, url, l)</p>\n" +
            "<p>{</p>\n" +
            "<p>txt = \"There was an error on this page.\\n\\n\";</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>txt += \"Error: \" + msg + \"\\n\";</p>\n" +
            "<p>txt += \"URL: \" + url + \"\\n\";</p>\n" +
            "<p>txt += \"Line: \" + l + \"\\n\\n\";</p>\n" +
            "<p>txt += \"Click OK to continue.\\n\\n\";</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>alert(txt);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>return true;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function message()</p>\n" +
            "<p>{</p>\n" +
            "<p>adddlert(\"Welcome guest!\");</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;input type=\"button\" value=\"Click Here\" onclick=\"message()\" /&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript76 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;p id=\"demo\"&gt;&lt;/p&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>try</p>\n" +
            "<p>{</p>\n" +
            "<p>addalert(\"Welcome guest!\");</p>\n" +
            "<p>}</p>\n" +
            "<p>catch(err)</p>\n" +
            "<p>{</p>\n" +
            "<p>document.getElementById(\"demo\").innerHTML = err.message;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>addalert is not defined</p>";
    public static final String javascript77 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=\"utf-8\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript to perform quick sort Quick sort&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function quick_Sort(array)</p>\n" +
            "<p>{</p>\n" +
            "<p>if (array.length &lt;= 1)</p>\n" +
            "<p>{</p>\n" +
            "<p>return array;</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>var left = [];</p>\n" +
            "<p>var right = [];</p>\n" +
            "<p>var newArray = [];</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var pivot = array.pop();</p>\n" +
            "<p>var length = array.length;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (var i = 0; i &lt; length; i++)</p>\n" +
            "<p>{</p>\n" +
            "<p>if (array[i] &lt;= pivot)</p>\n" +
            "<p>{</p>\n" +
            "<p>left.push(array[i]);</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>right.push(array[i]);</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>return newArray.concat(quick_Sort(left), pivot, quick_Sort(right));</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var input_array = [7, 30, 0, -5, 10, -7, 3, 2 ];</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Array Before performing Quick sort: \" + input_array);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var sortedArray = quick_Sort(input_array);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"&lt;br&gt;Sorted array is: \" + sortedArray);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Array Before performing Quick sort: 7,30,0,-5,10,-7,3,2</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Sorted array is: -7,-5,0,2,3,7,10,30</p>";
    public static final String javascript78 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=\"utf-8\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript to perform Merge sort&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function merge_sort(left_list,right_list)</p>\n" +
            "<p>{</p>\n" +
            "<p>var i = 0;</p>\n" +
            "<p>var j = 0;</p>\n" +
            "<p>var sorted_list = [];</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>while (i &lt; left_list.length || j &lt; right_list.length)</p>\n" +
            "<p>{</p>\n" +
            "<p>if (i === left_list.length)</p>\n" +
            "<p>{</p>\n" +
            "<p>// j is the only index left_list</p>\n" +
            "<p>sorted_list.push(right_list[j]);</p>\n" +
            "<p>j++;</p>\n" +
            "<p>}</p>\n" +
            "<p>else if (j === right_list.length || left_list[i] &lt;= right_list[j])</p>\n" +
            "<p>{</p>\n" +
            "<p>sorted_list.push(left_list[i]);</p>\n" +
            "<p>i++;</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>sorted_list.push(right_list[j]);</p>\n" +
            "<p>j++;</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>return sorted_list;</p>\n" +
            "<p>}</p>\n" +
            "<p>document.write(\"Sorted List is: \"+merge_sort([1,2,9], [3,7,9]));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Sorted List is: 1,2,3,7,9,9</p>";
    public static final String javascript79 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=\"utf-8\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript to perform Heap sort&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>var arr_len;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>// to create MAX array</p>\n" +
            "<p>function heap_root(input, i)</p>\n" +
            "<p>{</p>\n" +
            "<p>var left = 2 * i + 1;</p>\n" +
            "<p>var right = 2 * i + 2;</p>\n" +
            "<p>var max = i;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (left &lt; arr_len &amp;&amp; input[left] &gt; input[max])</p>\n" +
            "<p>{</p>\n" +
            "<p>max = left;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (right &lt; arr_len &amp;&amp; input[right] &gt; input[max])</p>\n" +
            "<p>{</p>\n" +
            "<p>max = right;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (max != i)</p>\n" +
            "<p>{</p>\n" +
            "<p>swap(input, i, max);</p>\n" +
            "<p>heap_root(input, max);</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function swap(input, index_A, index_B)</p>\n" +
            "<p>{</p>\n" +
            "<p>var temp = input[index_A];</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>input[index_A] = input[index_B];</p>\n" +
            "<p>input[index_B] = temp;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function heap_Sort(input)</p>\n" +
            "<p>{</p>\n" +
            "<p>arr_len = input.length;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (var i = Math.floor(arr_len / 2); i &gt;= 0; i -= 1)</p>\n" +
            "<p>{</p>\n" +
            "<p>heap_root(input, i);</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (i = input.length - 1; i &gt; 0; i--)</p>\n" +
            "<p>{</p>\n" +
            "<p>swap(input, 0, i);</p>\n" +
            "<p>arr_len--;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>heap_root(input, 0);</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var arr = [3, 2, 4, 0, -1, 9, -9, 5, -7];</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>heap_Sort(arr);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Sorted Array list is: \"+arr);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Sorted Array list is: -9,-7,-1,0,2,3,4,5,9</p>";
    public static final String javascript80 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=\"utf-8\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript to perform Insertion sort&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function insertion_Sort(arr)</p>\n" +
            "<p>{</p>\n" +
            "<p>for (var i = 1; i &lt; arr.length; i++)</p>\n" +
            "<p>{</p>\n" +
            "<p>if (arr[i] &lt; arr[0])</p>\n" +
            "<p>{</p>\n" +
            "<p>//move current element to the first position</p>\n" +
            "<p>arr.unshift(arr.splice(i,1)[0]);</p>\n" +
            "<p>}</p>\n" +
            "<p>else if (arr[i] &gt; arr[i-1])</p>\n" +
            "<p>{</p>\n" +
            "<p>//leave current element where it is</p>\n" +
            "<p>continue;</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>//find where element should go</p>\n" +
            "<p>for (var j = 1; j &lt; i; j++)</p>\n" +
            "<p>{</p>\n" +
            "<p>if (arr[i] &gt; arr[j-1] &amp;&amp; arr[i] &lt; arr[j])</p>\n" +
            "<p>{</p>\n" +
            "<p>//move element</p>\n" +
            "<p>arr.splice(j,0,arr.splice(i,1)[0]);</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>return arr;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Sorted array is: \"+insertion_Sort([4, 3, 0, 9, -1, -2, 1, 5]));</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Sorted array is: -2,-1,0,1,3,4,5,9</p>";
    public static final String javascript81 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=\"utf-8\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript to perform Selection sort&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function selectionSort(items)</p>\n" +
            "<p>{</p>\n" +
            "<p>var length = items.length;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (var i = 0; i &lt; length - 1; i++) //Number of passes</p>\n" +
            "<p>{</p>\n" +
            "<p>var min = i; //min holds the current minimum number position for each pass; i holds the Initial min number</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (var j = i + 1; j &lt; length; j++) //Note that j = i + 1 as we only need to go through unsorted array</p>\n" +
            "<p>{</p>\n" +
            "<p>if (items[j] &lt; items[min]) //Compare the numbers</p>\n" +
            "<p>{</p>\n" +
            "<p>min = j; //Change the current min number position if a smaller num is found</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (min != i)</p>\n" +
            "<p>{</p>\n" +
            "<p>//After each pass, if the current min num != initial min num, exchange the position.</p>\n" +
            "<p>//Swap the numbers</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var tmp = items[i];</p>\n" +
            "<p>items[i] = items[min];</p>\n" +
            "<p>items[min] = tmp;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>}</p>\n" +
            "<p>return items;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Sorted list is: \"+selectionSort([4, 3, 0, 9, -1, -2, 1, 5]));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Sorted list is: -2,-1,0,1,3,4,5,9</p>";
    public static final String javascript82 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=\"utf-8\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript program of Shell sort&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function shell_Sort(array)</p>\n" +
            "<p>{</p>\n" +
            "<p>var increment = array.length / 2;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>while (increment &gt; 0)</p>\n" +
            "<p>{</p>\n" +
            "<p>for (i = increment; i &lt; array.length; i++)</p>\n" +
            "<p>{</p>\n" +
            "<p>var j = i;</p>\n" +
            "<p>var temp = array[i];</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>while (j &gt;= increment &amp;&amp; array[j-increment] &gt; temp)</p>\n" +
            "<p>{</p>\n" +
            "<p>array[j] = array[j-increment];</p>\n" +
            "<p>j = j - increment;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>array[j] = temp;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (increment == 2)</p>\n" +
            "<p>{</p>\n" +
            "<p>increment = 1;</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>increment = parseInt(increment*5 / 11);</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>return array;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"Sorted order is: \"+shell_Sort([4, 3, 0, 9, -1, -2, 1, 5]));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Sorted order is: -2,-1,0,1,3,4,5,9</p>";
    public static final String javascript83 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=\"utf-8\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript program of Bubble sort&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function swap(arr, first, second)</p>\n" +
            "<p>{</p>\n" +
            "<p>var temp = arr[first];</p>\n" +
            "<p>arr[first] = arr[second];</p>\n" +
            "<p>arr[second] = temp;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function bubble_Sort(arr)</p>\n" +
            "<p>{</p>\n" +
            "<p>var len = arr.length,</p>\n" +
            "<p>i, j, stop;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (i=0; i &lt; len; i++)</p>\n" +
            "<p>{</p>\n" +
            "<p>for (j=0, stop=len-i; j &lt; stop; j++)</p>\n" +
            "<p>{</p>\n" +
            "<p>if (arr[j] &gt; arr[j+1])</p>\n" +
            "<p>{</p>\n" +
            "<p>swap(arr, j, j+1);</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>return arr;</p>\n" +
            "<p>}</p>\n" +
            "<p>document.write(\"Sorted array is: \"+bubble_Sort([4, 3, 0, 9, -1, -2, 1, 5]));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Sorted array is: -2,-1,0,1,3,4,5,9</p>";
    public static final String javascript84 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;HTML&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;HEAD&gt;</p>\n" +
            "<p>&lt;SCRIPT LANGUAGE = \"Javascript\"&gt;</p>\n" +
            "<p>document.firstline = \"Welcome to the page.&lt;br&gt;You are Learning a new example in JavaScript.\"</p>\n" +
            "<p>&lt;/SCRIPT&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;TITLE&gt;load demo&lt;/TITLE&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/HEAD&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;BODY&gt;</p>\n" +
            "<p>&lt;SCRIPT&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.open()</p>\n" +
            "<p>document.write(document.firstline);</p>\n" +
            "<p>document.open()</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/SCRIPT&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/BODY&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/HTML&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Welcome to the page.</p>\n" +
            "<p>You are Learning a new example in JavaScript.</p>";
    public static final String javascript85 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript DOM paragraph style&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;p id ='text'&gt;These is a JavaScript Example &lt;/p&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;div&gt;</p>\n" +
            "<p>&lt;button id=\"change_style\"</p>\n" +
            "<p>onclick=\"change_style()\"&gt;Click Here&lt;/button&gt;</p>\n" +
            "<p>&lt;/div&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function change_style()</p>\n" +
            "<p>{</p>\n" +
            "<p>text.style.fontSize = \"20pt\";</p>\n" +
            "<p>text.style.fontFamily = \"Times new Roman\";</p>\n" +
            "<p>text.style.color = \"red\";</p>\n" +
            "<p>}</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript86 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;p&gt;Click the button to open a new window &lt;/p&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;button onclick=\"open_window()\"&gt;Click here&lt;/button&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function open_window()</p>\n" +
            "<p>{</p>\n" +
            "<p>var w = window.open();</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>w.document.open();</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>w.document.write(\"&lt;h1&gt;Welcome to JavaScript.&lt;/h1&gt;\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>w.document.close();</p>\n" +
            "<p>}</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript87 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;p id=\"demo\"&gt;Click the button to replace this document with new content.&lt;/p&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;button onclick=\"myFunction()\"&gt;Try it&lt;/button&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function myFunction()</p>\n" +
            "<p>{</p>\n" +
            "<p>document.open(\"text/html\",\"replace\");</p>\n" +
            "<p>document.write(\"&lt;h2&gt;Learning about the HTML DOM is fun!&lt;/h2&gt;\");</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.close();</p>\n" +
            "<p>}</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript88 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;a name=\"line1\"&gt;JavaScript &lt;/a&gt;&lt;br&gt;</p>\n" +
            "<p>&lt;a name=\"line2\"&gt;Example&lt;/a&gt;&lt;br&gt;</p>\n" +
            "<p>&lt;a name=\"line3\"&gt;for Anchor Collection&lt;/a&gt;&lt;br&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;p id=\"example\"&gt;&lt;/p&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>document.getElementById(\"example\").innerHTML =</p>\n" +
            "<p>\"Number of anchors are: \" + document.anchors.length;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>JavaScript</p>\n" +
            "<p>Example</p>\n" +
            "<p>for Anchor Collection</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Numbers of anchors are: 3</p>";
    public static final String javascript89 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;p id=\"demo\"&gt;Click the button to display the cookies.&lt;/p&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;button onclick=\"myFunction()\"&gt;Click Here&lt;/button&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function myFunction()</p>\n" +
            "<p>{</p>\n" +
            "<p>document.getElementById(\"demo\").innerHTML =</p>\n" +
            "<p>\"Cookies associated with this document: \" + document.cookie;</p>\n" +
            "<p>}</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript90 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;Get Attributes&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;p&gt;&lt;a id=\"youTube\" type=\"text/html\" hreflang=\"en-in\" rel=\"nofollow\" target=\"_self\" href=\"http://www.youtube.com/\"&gt;Youtube&lt;/a&gt;&lt;/p&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;button onclick=\"getAttributes()\"&gt;Click here&lt;/button&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function getAttributes()</p>\n" +
            "<p>{</p>\n" +
            "<p>var a = document.getElementById(\"youTube\").href;</p>\n" +
            "<p>alert('The value of the href attribute of the link is : '+a);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var b = document.getElementById(\"youTube\").hreflang;</p>\n" +
            "<p>alert('The value of the hreflang attribute of the link is : '+b);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var c = document.getElementById(\"youTube\").rel;</p>\n" +
            "<p>alert('The value of the rel attribute of the link is : '+c);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var d = document.getElementById(\"youTube\").target;</p>\n" +
            "<p>alert('The value of the taget attribute of the link is : '+d);</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>var e = document.getElementById(\"youTube\").type;</p>\n" +
            "<p>alert('The value of the type attribute of the link is : '+e);</p>\n" +
            "<p>}</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript91 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;style type=\"text/css\"&gt;</p>\n" +
            "<p>body {margin: 60px;}</p>\n" +
            "<p>&lt;/style&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt; JavaScript program to count, display and remove the items of a dropdown list &lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;form&gt;</p>\n" +
            "<p>&lt;select id=\"selected\"&gt;</p>\n" +
            "<p>&lt;option&gt;Red&lt;/option&gt;</p>\n" +
            "<p>&lt;option&gt;Green&lt;/option&gt;</p>\n" +
            "<p>&lt;option&gt;Blue&lt;/option&gt;</p>\n" +
            "<p>&lt;option&gt;Black&lt;/option&gt;</p>\n" +
            "<p>&lt;option&gt;White&lt;/option&gt;</p>\n" +
            "<p>&lt;/select&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;input type=\"button\" onclick=\"get_data()\" value=\"Count and list of colors\"&gt;</p>\n" +
            "<p>&lt;input type=\"button\" onclick=\"remove_color()\" value=\"Remove selected color\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/form&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function get_data()</p>\n" +
            "<p>{</p>\n" +
            "<p>var a=document.getElementById(\"selected\");</p>\n" +
            "<p>var list = \"Number of colors in dropdown list : \";</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>l=document.getElementById(\"selected\").length;</p>\n" +
            "<p>list = list+l;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>for (var i=0;i&lt;a.length;i++)</p>\n" +
            "<p>{</p>\n" +
            "<p>list = list + \"\\n\" + a.options[i].text;</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>alert(list);</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function remove_color()</p>\n" +
            "<p>{</p>\n" +
            "<p>var a=document.getElementById(\"selected\");</p>\n" +
            "<p>alert(\"Selected color removed\");</p>\n" +
            "<p>a.remove(a.selectedIndex);</p>\n" +
            "<p>}</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript92 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript to get the window resolution&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;!-- Resize the window (here output panel) and see the result !--&gt;</p>\n" +
            "<p>&lt;body onload=\"get_windowSize()\" onresize=\"get_windowSize()\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;div id=\"widthHeight\"&gt;</p>\n" +
            "<p>&lt;!-- Place height and width size here! --&gt;</p>\n" +
            "<p>&lt;/div&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function get_windowSize()</p>\n" +
            "<p>{</p>\n" +
            "<p>var width = document.documentElement.clientWidth;</p>\n" +
            "<p>var height = document.documentElement.clientHeight;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.getElementById('widthHeight').innerHTML = \"&lt;h1&gt;Width: \" + width + \"&lt;br&gt; Height: \" + height + \"&lt;/h1&gt;\";</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Width: 1366</p>\n" +
            "<p>Height: 657</p>";
    public static final String javascript93 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;iframe id=\"myframe\" src=\"#\"&gt;</p>\n" +
            "<p>&lt;p&gt;Your browser does not support iframes.&lt;/p&gt;</p>\n" +
            "<p>&lt;/iframe&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;p&gt;Click the button to change the background color of the document in the iframe.&lt;/p&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;p id=\"demo\"&gt;&lt;/p&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;button onclick=\"myFunction()\"&gt;Click Here&lt;/button&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function myFunction()</p>\n" +
            "<p>{</p>\n" +
            "<p>var x = document.getElementById(\"myframe\");</p>\n" +
            "<p>x.style.backgroundColor = \"yellow\";</p>\n" +
            "<p>}</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript94 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;iframe id=\"myframe\" src=\"#\" height=\"300\" width=\"350\"&gt;</p>\n" +
            "<p>&lt;p&gt;Your browser does not support iframes.&lt;/p&gt;</p>\n" +
            "<p>&lt;/iframe&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;p&gt;Click the button to display the height of the iframe.&lt;/p&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;button onclick=\"myFunction()\"&gt;click here&lt;/button&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;p id=\"demo\"&gt;&lt;/p&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function myFunction()</p>\n" +
            "<p>{</p>\n" +
            "<p>var x = document.getElementById(\"myframe\").height;</p>\n" +
            "<p>document.getElementById(\"demo\").innerHTML = x ;</p>\n" +
            "<p>}</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
    public static final String javascript95 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=utf-8 /&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript Regular expression to valid an email address&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function valid_email(email_id)</p>\n" +
            "<p>{</p>\n" +
            "<p>var mailformat = /^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$/;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if(mailformat.test(email_id))</p>\n" +
            "<p>{</p>\n" +
            "<p>document.write(\"You Entered the Valid email address!\");</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>document.write(\"You have entered an invalid email address!\");</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>valid_email('rosa12@gmail.com');</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>You Entered the Valid email address!</p>";
    public static final String javascript96 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=\"utf-8\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript function to check whether a given value is date string or not.&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function check_date(str)</p>\n" +
            "<p>{</p>\n" +
            "<p>regexp = /^(1[0-2]|0?[1-9])\\/(3[01]|[12][0-9]|0?[1-9])\\/(?:[0-9]{2})?[0-9]{2}$/;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (regexp.test(str))</p>\n" +
            "<p>{</p>\n" +
            "<p>return true;</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>return false;</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(check_date(\"12/15/1896\"));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"&lt;br&gt;\"+check_date(\"01/23/2014\"));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"&lt;br&gt;\"+check_date(\"32/01/2015\"));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>true</p>\n" +
            "<p>true</p>\n" +
            "<p>false</p>\n" +
            "<p>&nbsp;</p>";
    public static final String javascript97 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=\"utf-8\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript function to check whether a given value is an url or not&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function check_url(str)</p>\n" +
            "<p>{</p>\n" +
            "<p>regexp = /^(?:(?:https?|ftp):\\/\\/)?(?:(?!(?:10|127)(?:\\.\\d{1,3}){3})(?!(?:169\\.254|192\\.168)(?:\\.\\d{1,3}){2})(?!172\\.(?:1[6-9]|2\\d|3[0-1])(?:\\.\\d{1,3}){2})(?:[1-9]\\d?|1\\d\\d|2[01]\\d|22[0-3])(?:\\.(?:1?\\d{1,2}|2[0-4]\\d|25[0-5])){2}(?:\\.(?:[1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-4]))|(?:(?:[a-z\\u00a1-\\uffff0-9]-*)*[a-z\\u00a1-\\uffff0-9]+)(?:\\.(?:[a-z\\u00a1-\\uffff0-9]-*)*[a-z\\u00a1-\\uffff0-9]+)*(?:\\.(?:[a-z\\u00a1-\\uffff]{2,})))(?::\\d{2,5})?(?:\\/\\S*)?$/;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (regexp.test(str))</p>\n" +
            "<p>{</p>\n" +
            "<p>return true;</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>return false;</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(check_url(\"http://www.example.com\"));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"&lt;br&gt;\"+check_url(\"https://www.example.com\"));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"&lt;br&gt;\"+check_url(\"www.example.com\"));</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>true</p>\n" +
            "<p>true</p>\n" +
            "<p>true</p>\n" +
            "<p>&nbsp;</p>";
    public static final String javascript98 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=\"utf-8\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript function to check whether a given value is alpha numeric or not.&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function check_alphanumeric(str)</p>\n" +
            "<p>{</p>\n" +
            "<p>regexp = /^[A-Za-z0-9]+$/;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (regexp.test(str))</p>\n" +
            "<p>{</p>\n" +
            "<p>return true;</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>return false;</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(check_alphanumeric(\"548sdf48\"));</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>document.write(\"&lt;br&gt;\"+check_alphanumeric(\"dfjk@12#\"));</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>true</p>\n" +
            "<p>false</p>";
    public static final String javascript99 ="<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript for Password Validation&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>function password_valid()</p>\n" +
            "<p>{</p>\n" +
            "<p>var password=document.myform.password.value;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if (password==null || password==\"\")</p>\n" +
            "<p>{</p>\n" +
            "<p>alert(\"password can't be blank\");</p>\n" +
            "<p>return false;</p>\n" +
            "<p>}</p>\n" +
            "<p>else if(password.length&lt;8)</p>\n" +
            "<p>{</p>\n" +
            "<p>alert(\"Password must be at least 8 characters long.\");</p>\n" +
            "<p>return false;</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;form name=\"myform\" method=\"post\" action=\"#\" onsubmit=\"return password_valid()\" &gt;</p>\n" +
            "<p>Enter Password: &lt;input type=\"password\" name=\"password\"&gt;</p>\n" +
            "<p>&lt;input type=\"submit\" value=\"submit\"&gt;</p>\n" +
            "<p>&lt;/form&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&nbsp;</p>";
    public static final String javascript100 ="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;</p>\n" +
            "<p>&lt;meta charset=\"utf-8\"&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;title&gt;JavaScript function for retyping Password Validation&lt;/title&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>function pass_validation()</p>\n" +
            "<p>{</p>\n" +
            "<p>var firstpassword=document.f1.password1.value;</p>\n" +
            "<p>var secondpassword=document.f1.password2.value;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>if(firstpassword==secondpassword)</p>\n" +
            "<p>{</p>\n" +
            "<p>return true;</p>\n" +
            "<p>}</p>\n" +
            "<p>else</p>\n" +
            "<p>{</p>\n" +
            "<p>alert(\"Both the password must be same..! Please Enter again.\");</p>\n" +
            "<p>return false;</p>\n" +
            "<p>}</p>\n" +
            "<p>}</p>\n" +
            "<p>&lt;/script&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;form name=\"f1\" action=\"/JavaScript/Index\" onsubmit=\"return pass_validation()\"&gt;</p>\n" +
            "<p>Password:&lt;input type=\"password\" name=\"password1\" /&gt;&lt;br/&gt; &lt;br&gt;</p>\n" +
            "<p>Re-enter Password:&lt;input type=\"password\" name=\"password2\"/&gt;&lt;br/&gt; &lt;br&gt;</p>\n" +
            "<p>&lt;input type=\"submit\"&gt;</p>\n" +
            "<p>&lt;/form&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>";
}
