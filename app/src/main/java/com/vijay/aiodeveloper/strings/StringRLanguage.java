package com.vijay.aiodeveloper.strings;

/**
 * Created by Nabeel-PC on 07-04-2018.
 */

public class StringRLanguage {

    public static final String rlanguage1="<h1 align=\"center\"><span style=\"font-size: 14pt;\"><span style=\"color: #008000;\">Introduction of</span> <span style=\"color: #008080;\">R</span></span></h1>\n" +
            "<p><span style=\"font-size: 12pt;\"><strong><span style=\"color: #0000ff;\">R</span></strong> is an interpreted programming language&nbsp;and software environment for statistical analysis, graphics representation and reporting.&nbsp;R was created by Ross Ihaka and Robert Gentleman at the University of Auckland, New Zealand, and is currently developed by the R Development Core Team.&nbsp;</span></p>\n" +
            "<p><span style=\"font-size: 12pt;\"><span style=\"color: #0000ff;\">R</span> provides a mixture of programming paradigms. It&nbsp;supports object-oriented features where data and functions are encapsulated inside classes and also functional programming wherein functions are first-class objects and you treat them like any other variable.&nbsp;</span></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<h3 align=\"center\"><span style=\"font-size: 14pt;\"><span style=\"color: #008000;\">Uses Of</span> <span style=\"color: #0000ff;\">R</span></span></h3>\n" +
            "<ul>\n" +
            "<li><span style=\"font-size: 12pt;\">Weather Service uses R to predict severe flooding.</span></li>\n" +
            "<li><span style=\"font-size: 12pt;\">Social networking companies are using R to monitor their user experience.</span></li>\n" +
            "<li><span style=\"font-size: 12pt;\">Newspapers companies are using R to create infographics and interactive data journalism applications.</span></li>\n" +
            "</ul>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp; &nbsp; &nbsp;R is adopted by the major companies because their data scientists&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;prefer to use it.</span></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<h3 align=\"center\"><span style=\"font-size: 14pt;\"><strong><span style=\"color: #008000;\">Features of </span><span style=\"color: #0000ff;\">R</span></strong></span></h3>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp; &nbsp; &nbsp;The below mentioned are the significant features of R language:</span></p>\n" +
            "<ul>\n" +
            "<li><span style=\"font-size: 12pt;\"><span style=\"color: #0000ff;\">R</span> is simple and effective programming language which has been well-developed, as well as R is data analysis software.</span></li>\n" +
            "<li><span style=\"font-size: 12pt;\"><span style=\"color: #0000ff;\">R</span> is a well - designed, easy and effective language that has the concepts of conditionals, looping, user-defined recursive procedures and various I/O facilities.</span></li>\n" +
            "<li><span style=\"font-size: 12pt;\"><span style=\"color: #0000ff;\">R</span> has a large, consistent and incorporated set of tools used for data analysis.</span></li>\n" +
            "<li><span style=\"font-size: 12pt;\"><span style=\"color: #0000ff;\">R</span> contains suite of operators for different types of calculations on arrays, lists and vectors.</span></li>\n" +
            "<li><span style=\"font-size: 12pt;\"><span style=\"color: #0000ff;\">R</span> provides highly extensible graphical techniques.</span></li>\n" +
            "<li><span style=\"font-size: 12pt;\"><span style=\"color: #0000ff;\">R</span> graphical techniques for data analysis output either directly display to the computer, or can be print on paper.</span></li>\n" +
            "<li><span style=\"font-size: 12pt;\"><span style=\"color: #0000ff;\">R</span> has an effective data handling and storage facility.</span></li>\n" +
            "<li><span style=\"font-size: 12pt;\"><span style=\"color: #0000ff;\">R</span> is an online vibrant community.</span></li>\n" +
            "<li><span style=\"font-size: 12pt;\"><span style=\"color: #0000ff;\">R</span> is free, open source, powerful and highly extensible.</span></li>\n" +
            "</ul>";


    public static final String rlanguage2="<h1 align=\"center\"><span style=\"font-size: 14pt;\">&nbsp;<span style=\"color: #0000ff;\">R -</span>&nbsp;<span style=\"color: #008000;\">Basic syntax</span></span></h1>\n" +
            "<p><span style=\"font-size: 12pt;\">Based on the requirements, you can program either in R command prompt or you can simply use an R script file for writing your program. So let's start coding and learn the basic syntax.</span></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<h2 align=\"center\"><span style=\"font-size: 14pt;\"><span style=\"color: #0000ff;\">R</span> <span style=\"color: #008000;\">Command Prompt</span></span></h2>\n" +
            "<p><span style=\"font-size: 12pt;\">Once you have R environment setup, then it&rsquo;s easy to start your R command prompt by just typing the following command at your command prompt &minus;</span></p>\n" +
            "<pre class=\"result notranslate\"><span style=\"font-size: 12pt; color: #008000;\">$ R<br />\n" +
            "</span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\">This will launch R interpreter and you will get a prompt &gt; where you can start typing your program as follows &minus;</span></p>\n" +
            "<pre class=\"prettyprint notranslate prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\"><span class=\"pun\">&gt;</span><span class=\"pln\"> myString </span><span class=\"pun\">&lt;-</span> <span class=\"str\">\"Hello, User!\"</span>\n" +
            "<span class=\"pun\">&gt;</span> <span class=\"kwd\">print</span> <span class=\"pun\">(</span><span class=\"pln\"> myString</span><span class=\"pun\">)</span>\n" +
            "<span class=\"pun\">[</span><span class=\"lit\">1</span><span class=\"pun\">]</span> <span class=\"str\">\"Hello, User!\"<br /><br /></span></span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\">Here first statement defines a string variable myString, where we assign a string \"Hello, User!\" and then next statement print() is being used to print the value stored in variable myString.</span></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<h2 align=\"center\"><span style=\"font-size: 14pt;\"><span style=\"color: #0000ff;\">R</span> <span style=\"color: #008000;\">Script File</span></span></h2>\n" +
            "<p><span style=\"font-size: 12pt;\">Generally, you will write your programs in script files and then you implement those scripts at your command prompt using the help of R interpreter called <span style=\"color: #0000ff;\"><strong>Rscript</strong>.</span> Here is the Hello World Script:</span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #008000;\"><code>myString &lt;- \"Hello, World!\"\n" +
            "\n" +
            "print ( myString)<br /></code></span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\">Save the code you have written in a file \"helo.R\" and execute this code at Linux command prompt using the below mentioned command. Whatever be your OS, either Windows or other system, the command syntax will stay same.</span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #008000;\"><code>$ Rscript test.R<br /></code></span></pre>\n" +
            "<h3 align=\"center\"><span style=\"font-size: 14pt;\"><span style=\"color: #008000;\">Comments in</span> <span style=\"color: #0000ff;\">R</span></span></h3>\n" +
            "<p><span style=\"font-size: 12pt;\">Comments are like helping text within your R source code and these statements get ignored by the interpreter while running your actual program. The single line comment is written with the starting symbol '#' in the beginning of the statement as given below:</span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #008000;\"><code># My first R program is Hello - World<br /><br /></code></span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\">It can be disadvantageous that R does not support multi-line comment but you can perform a trick and its code will look something like this:</span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #008000;\"><code>if(FALSE) {\n" +
            "\"This is an example of how to write multi-line comments.\n" +
            "}\n" +
            "\n" +
            "newStr &lt;- \"Hello - World!\"\n" +
            "\n" +
            "print ( newStr)<br /><br /></code></span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\">It is to be noted that the strings while using Multi-line comment should have to be put inside either Single quote or Double Quote.</span></p>\n" +
            "\n";


    public static final String rlanguage3="<h1 align=\"center\"><span style=\"font-size: 14pt; color: #0000ff;\">R - <span style=\"color: #008000;\">Data Types</span></span></h1>\n" +
            "<div class=\"card-header\">&nbsp; <span style=\"font-size: 12pt;\">&nbsp; The list of all the data types provided by R:</span></div>\n" +
            "<ul>\n" +
            "<li><span style=\"font-size: 12pt;\">Numeric</span></li>\n" +
            "<li><span style=\"font-size: 12pt;\">Integer</span></li>\n" +
            "<li><span style=\"font-size: 12pt;\">Complex</span></li>\n" +
            "<li><span style=\"font-size: 12pt;\">Logical</span></li>\n" +
            "<li><span style=\"font-size: 12pt;\">Character</span></li>\n" +
            "</ul>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp;</span></p>\n" +
            "<h3 align=\"center\"><strong><span style=\"font-size: 13pt; color: #0000ff;\">Numeric data Type</span></strong></h3>\n" +
            "<p><span style=\"font-size: 12pt;\">Decimal values are referred as numeric data types in R. This is the default working out data type. If you assign a decimal value for any variable x like given below, x will become a numeric type.</span></p>\n" +
            "<h3><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\"><code class=\"prettyprint prettyprinted\"><span class=\"pun\">&gt;</span><span class=\"pln\"> g </span><span class=\"pun\">=</span> <span class=\"lit\">62.4</span><span class=\"pln\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span><span class=\"com\"># assign a decimal value to g</span>\n" +
            "</code></span></h3>\n" +
            "<h3><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\"><code class=\"prettyprint prettyprinted\"><span class=\"pun\">&gt;</span><span class=\"pln\"> g&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span><span class=\"com\"># print the variable's value - g</span></code></span></h3>\n" +
            "<p><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\"><code class=\"prettyprint prettyprinted\"></code></span></p>\n" +
            "<h3 class=\"card-body\" align=\"center\"><strong><span style=\"color: #0000ff; font-size: 13pt;\">Integer Data Type</span></strong></h3>\n" +
            "<p><span style=\"font-size: 12pt;\">If you want to create any integer variable in R, you have to invoke the as.integer() function to define any integer type data. You can be certain that y is definitely an integer by applying the is.integer() function.</span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\"><code class=\"prettyprint prettyprinted\"><span class=\"pun\">&gt;</span><span class=\"pln\"> s </span><span class=\"pun\">=</span> <span class=\"kwd\">as</span><span class=\"pun\">.</span><span class=\"pln\">integer</span><span class=\"pun\">(</span><span class=\"lit\">3</span><span class=\"pun\">)</span>\n" +
            "\n" +
            "<span class=\"pun\">&gt;</span><span class=\"pln\"> s&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; </span><span class=\"com\"># print the value of s<br /></span></code></span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\">Fortunately, you can drive in a numeric value into an integer with this above mentioned as.integer() function like this:</span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #008000;\"><code class=\"prettyprint prettyprinted\"><span class=\"pun\">&gt;</span> <span class=\"kwd\">as</span><span class=\"pun\">.</span><span class=\"pln\">integer</span><span class=\"pun\">(</span><span class=\"lit\">3.14</span><span class=\"pun\">)</span><span class=\"pln\">&nbsp;&nbsp;&nbsp; </span><span class=\"com\"># drives in a numeric value</span></code></span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\">But it will work like type casting where the value of 3.14 gets changed to 3.</span></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<h3 align=\"center\"><span style=\"color: #0000ff;\"><strong><span style=\"font-size: 13pt;\">Complex Data Type</span></strong></span></h3>\n" +
            "<p><span style=\"font-size: 12pt;\">A complex value for coding in R can be defined using the pure imaginary values 'i'.</span></p>\n" +
            "<h3><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\"><code class=\"prettyprint prettyprinted\"><span class=\"pun\">&gt;</span><span class=\"pln\"> k </span><span class=\"pun\">=</span> <span class=\"lit\">1</span> <span class=\"pun\">+</span> <span class=\"lit\">2i</span><span class=\"pln\">&nbsp;&nbsp;&nbsp;&nbsp; </span><span class=\"com\"># creating a complex number</span>\n" +
            "</code></span></h3>\n" +
            "<h3><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\"><code class=\"prettyprint prettyprinted\"><span class=\"pun\">&gt;</span><span class=\"pln\"> k&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span><span class=\"com\"># printing the value of k</span></code></span></h3>\n" +
            "<p>&nbsp;</p>\n" +
            "<h3 align=\"center\"><strong><span style=\"color: #0000ff; font-size: 13pt;\">Logical Data Type</span></strong></h3>\n" +
            "<p><span style=\"font-size: 12pt;\">A logical value is mostly created when comparison between variables are done. Example will be like:</span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\"><code class=\"prettyprint prettyprinted\"><span class=\"pun\">&gt;</span><span class=\"pln\"> &nbsp;&nbsp;a </span><span class=\"pun\">=</span> <span class=\"lit\">4</span><span class=\"pun\">;</span><span class=\"pln\"> b </span><span class=\"pun\">=</span> <span class=\"lit\">6</span><span class=\"pln\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  </span><span class=\"com\"># sample values</span>\n" +
            "\n" +
            "<span class=\"pun\">&gt;</span><span class=\"pln\"> &nbsp;&nbsp;g </span><span class=\"pun\">=</span><span class=\"pln\"> a </span><span class=\"pun\">&gt;</span><span class=\"pln\"> b&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span><span class=\"com\"># is a larger than b?</span>\n" +
            "\n" +
            "<span class=\"pun\">&gt;</span><span class=\"pln\"> &nbsp;&nbsp;g&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span><span class=\"com\"># print the logical value<br /></span></code></span></pre>\n" +
            "<p><span class=\"example\" style=\"font-size: 12pt; color: #0000ff;\">Output:</span></p>\n" +
            "<h3><span style=\"font-size: 12pt; color: #0000ff;\">[1] False</span><br /><br /></h3>\n" +
            "<h3 align=\"center\"><strong><span style=\"color: #0000ff; font-size: 13pt;\">Character Data Type</span></strong></h3>\n" +
            "<p><span style=\"font-size: 12pt;\">A character object can be used for representing string values in R. You have to convert objects into character values using the as.character() function within your code like this:</span></p>\n" +
            "<pre><span style=\"font-size: 12pt; font-family: verdana, geneva; color: #008000;\"><code class=\"prettyprint prettyprinted\"><span class=\"pun\">&gt;</span><span class=\"pln\"> g </span><span class=\"pun\">=</span> <span class=\"kwd\">as</span><span class=\"pun\">.</span><span class=\"pln\">character</span><span class=\"pun\">(</span><span class=\"lit\">62.48</span><span class=\"pun\">)</span>\n" +
            "\n" +
            "<span class=\"pun\">&gt;</span><span class=\"pln\"> g&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span><span class=\"com\"># prints the character string</span></code></span></pre>\n" +
            "<p><span class=\"example\" style=\"font-size: 12pt; color: #0000ff;\">Output:</span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\">[1] \"3.14\"</span></pre>\n" +
            "<pre><span style=\"font-size: 12pt; color: #008000;\"><code class=\"prettyprint prettyprinted\"><span class=\"pun\">&gt;</span> <span class=\"kwd\">class</span><span class=\"pun\">(</span><span class=\"pln\">s</span><span class=\"pun\">)</span><span class=\"pln\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span><span class=\"com\"># print the class name of s</span></code></span></pre>\n" +
            "<p><span class=\"example\" style=\"font-size: 12pt; color: #0000ff;\">Output:</span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\">[1] \"character\"</span></pre>";


    public static final String rlanguage4="<h1 align=\"center\"><strong><span style=\"font-size: 14pt;\"><span style=\"color: #0000ff;\">R-</span> <span style=\"color: #008000;\">Objects</span></span></strong></h1>\n" +
            "<p><span style=\"font-size: 12pt;\">In contrast to other programming languages like C and java in R, the variables are not declared as some data type. The variables are assigned with R-Objects and the data type of the R-object becomes the data type of the variable. There are many types of <span style=\"color: #0000ff;\">R-objects</span>. The frequently used ones are &minus;</span></p>\n" +
            "<ul class=\"list\">\n" +
            "<li><span style=\"font-size: 12pt;\">Vectors</span></li>\n" +
            "<li><span style=\"font-size: 12pt;\">Lists</span></li>\n" +
            "<li><span style=\"font-size: 12pt;\">Matrices</span></li>\n" +
            "<li><span style=\"font-size: 12pt;\">Arrays</span></li>\n" +
            "<li><span style=\"font-size: 12pt;\">Factors</span></li>\n" +
            "<li><span style=\"font-size: 12pt;\">Data Frames</span></li>\n" +
            "</ul>\n" +
            "<h2 align=\"center\"><span style=\"font-size: 13pt;\"><strong><span style=\"color: #0000ff;\">Vectors</span></strong></span></h2>\n" +
            "<p><span style=\"font-size: 12pt;\">When you want to create vector with more than one element, you should use&nbsp;<strong>c()</strong>&nbsp;function which means to combine the elements into a vector.</span></p>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\"><span class=\"com\"># Create a vector.</span>\n" +
            "<span class=\"pun\">r_vector&lt;-</span><span class=\"pln\"> c</span><span class=\"pun\">(</span><span class=\"str\">'R'</span><span class=\"pun\">,</span><span class=\"str\">'programming'</span><span class=\"pun\">,</span><span class=\"str\">\"language\"</span><span class=\"pun\">)</span>\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">apple</span><span class=\"pun\">)</span>\n" +
            "\n" +
            "<span class=\"com\"># Get the class of the vector.</span>\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"kwd\">class</span><span class=\"pun\">(r_vector</span><span class=\"pun\">))<br /><br /></span></span></pre>\n" +
            "<p><span style=\"font-size: 12pt; color: #0000ff;\">Output &minus;</span></p>\n" +
            "<pre class=\"result notranslate\"><span style=\"font-size: 12pt; color: #0000ff;\">[1] \"R\"    \"<span style=\"font-size: 12pt;\"><span class=\"str\">programming</span></span>\"  \"<span style=\"font-size: 12pt;\"><span class=\"str\">language</span></span>\"\n" +
            "[1] \"character\"<br />\n" +
            "</span></pre>\n" +
            "<h2 align=\"center\"><strong><span style=\"font-size: 13pt; color: #0000ff;\">Lists</span></strong></h2>\n" +
            "<p><span style=\"font-size: 12pt;\">A list is an R-object which can contain many different types of elements inside it like vectors, functions and even another list inside it.</span></p>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\"><span class=\"com\"><span class=\"pln\">list1 </span><span class=\"pun\">&lt;-</span><span class=\"pln\"> list</span><span class=\"pun\">(</span><span class=\"pln\">c</span><span class=\"pun\">(</span><span class=\"lit\">2</span><span class=\"pun\">,</span><span class=\"lit\">5</span><span class=\"pun\">,</span><span class=\"lit\">3</span><span class=\"pun\">),</span><span class=\"lit\">21.3</span><span class=\"pun\">,</span><span class=\"pln\">sin</span><span class=\"pun\">)        </span># Create a list.</span>\n" +
            "\n" +
            "\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">list1</span><span class=\"pun\">)                            </span><span class=\"com\"># Print the list.</span>\n" +
            "<span class=\"pun\"><br /><br /></span></span></pre>\n" +
            "<p><span style=\"font-size: 12pt; color: #0000ff;\">Output &minus;</span></p>\n" +
            "<pre class=\"result notranslate\"><span style=\"font-size: 12pt; color: #0000ff;\">[[1]]\n" +
            "[1] 2 5 3\n" +
            "\n" +
            "[[2]]\n" +
            "[1] 21.3\n" +
            "\n" +
            "[[3]]\n" +
            "function (x)  .Primitive(\"sin\")<br />\n" +
            "</span></pre>\n" +
            "<h2 align=\"center\"><span style=\"font-size: 13pt;\"><strong><span style=\"color: #0000ff;\">Matrices</span></strong></span></h2>\n" +
            "<p><span style=\"font-size: 12pt;\">A matrix is a two-dimensional rectangular data set. It can be created using a vector input to the matrix function.</span></p>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\"><span class=\"com\"># Create a matrix.<br /></span><span class=\"pln\">\n" +
            "M </span><span class=\"pun\">=</span><span class=\"pln\"> matrix</span><span class=\"pun\">(</span><span class=\"pln\"> c</span><span class=\"pun\">(</span><span class=\"str\">'a1'</span><span class=\"pun\">,</span><span class=\"str\">'a2'</span><span class=\"pun\">,</span><span class=\"str\">'b1'</span><span class=\"pun\">,</span><span class=\"str\">'c'</span><span class=\"pun\">,</span><span class=\"str\">'b2'</span><span class=\"pun\">,</span><span class=\"str\">'a3'</span><span class=\"pun\">),</span><span class=\"pln\"> nrow </span><span class=\"pun\">=</span> <span class=\"lit\">2</span><span class=\"pun\">,</span><span class=\"pln\"> ncol </span><span class=\"pun\">=</span> <span class=\"lit\">3</span><span class=\"pun\">,</span><span class=\"pln\"> byrow </span><span class=\"pun\">=</span><span class=\"pln\"> TRUE</span><span class=\"pun\">)</span>\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">M</span><span class=\"pun\">)<br /><br /></span></span></pre>\n" +
            "<p><span style=\"font-size: 12pt; color: #0000ff;\">Output &minus;</span></p>\n" +
            "<pre class=\"result notranslate\"><span style=\"font-size: 12pt; color: #0000ff;\">     [,1] [,2] [,3]\n" +
            "[1,] \"a1\" \"a2\"  \"b1\" \n" +
            "[2,] \"c\"  \"b2\"  \"a3\"<br />\n" +
            "</span></pre>\n" +
            "<h2 align=\"center\"><span style=\"font-size: 13pt;\"><strong><span style=\"color: #0000ff;\">Arrays</span></strong></span></h2>\n" +
            "<p><span style=\"font-size: 12pt;\">While matrices are confined to two dimensions, arrays can be of any number of dimensions. The array function takes a dim attribute which creates the required number of dimension. In the below example we create an array with two elements which are 3x3 matrices each.</span></p>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\"><span class=\"com\"># Create an array.</span><span class=\"pln\">\n" +
            "a </span><span class=\"pun\">&lt;-</span><span class=\"pln\"> array</span><span class=\"pun\">(</span><span class=\"pln\">c</span><span class=\"pun\">(</span><span class=\"str\">'green'</span><span class=\"pun\">,</span><span class=\"str\">'yellow'</span><span class=\"pun\">),</span><span class=\"pln\">dim </span><span class=\"pun\">=</span><span class=\"pln\"> c</span><span class=\"pun\">(</span><span class=\"lit\">3</span><span class=\"pun\">,</span><span class=\"lit\">3</span><span class=\"pun\">,</span><span class=\"lit\">2</span><span class=\"pun\">))</span>\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">a</span><span class=\"pun\">)<br /><br /></span></span></pre>\n" +
            "<p><span style=\"font-size: 12pt; color: #0000ff;\">Output &minus;</span></p>\n" +
            "<pre class=\"result notranslate\"><span style=\"font-size: 12pt;\"><span style=\"color: #0000ff;\">, , 1\n" +
            "\n" +
            "     [,1]     [,2]     [,3]    \n" +
            "[1,] \"green\"  \"yellow\" \"green\" \n" +
            "[2,] \"yellow\" \"green\"  \"yellow\"\n" +
            "[3,] \"green\"  \"yellow\" \"green\" \n" +
            "\n" +
            ", , 2\n" +
            "\n" +
            "     [,1]     [,2]     [,3]    \n" +
            "[1,] \"yellow\" \"green\"  \"yellow\"\n" +
            "[2,] \"green\"  \"yellow\" \"green\" \n" +
            "[3,] \"yellow\" \"green\"  \"yellow\"</span>  <br />\n" +
            "</span></pre>\n" +
            "<h2 align=\"center\"><strong><span style=\"font-size: 13pt; color: #0000ff;\">Factors</span></strong></h2>\n" +
            "<p><span style=\"font-size: 12pt;\">Factors are the r-objects which are created using a vector. It stores the vector along with the distinct values of the elements in the vector as labels. The labels are always character irrespective of whether it is numeric or character or Boolean etc. in the input vector. They are useful in statistical modeling.</span></p>\n" +
            "<p><span style=\"font-size: 12pt;\">Factors are created using the&nbsp;<strong>factor()</strong>&nbsp;function.The&nbsp;<strong>nlevels</strong>&nbsp;functions gives the count of levels.</span></p>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\"><span class=\"com\"># Create a vector.</span><span class=\"pln\">\n" +
            "<span class=\"hl std\">x</span> <span class=\"hl kwb\">=</span> <span class=\"hl kwd\">c</span><span class=\"hl std\">(</span><span class=\"hl num\">1</span><span class=\"hl std\">,</span> <span class=\"hl num\">2</span><span class=\"hl std\">,</span> <span class=\"hl num\">3</span><span class=\"hl std\">,</span> <span class=\"hl num\">3</span><span class=\"hl std\">,</span> <span class=\"hl num\">5</span><span class=\"hl std\">,</span> <span class=\"hl num\">3</span><span class=\"hl std\">,</span> <span class=\"hl num\">2</span><span class=\"hl std\">,</span> <span class=\"hl num\">4</span><span class=\"hl std\">,</span> <span class=\"hl num\">NA</span><span class=\"hl std\">)</span><br /></span>\n" +
            "<span class=\"com\"># Create a factor object.</span><span class=\"pln\">\n" +
            "factor_x </span><span class=\"pun\">&lt;-</span><span class=\"pln\"> factor</span><span class=\"pun\">(</span><span class=\"pln\">x</span><span class=\"pun\">)</span>\n" +
            "\n" +
            "<span class=\"com\"># Print the factor.</span>\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">factor_x</span><span class=\"pun\">)</span>\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">nlevels</span><span class=\"pun\">(</span><span class=\"pln\">factor_x</span><span class=\"pun\">))    <br /></span></span></pre>\n" +
            "<div class=\"source\">\n" +
            "<pre class=\"knitr r\">&nbsp;</pre>\n" +
            "</div>\n" +
            "<div class=\"output\">\n" +
            "<pre class=\"knitr r\">&nbsp;</pre>\n" +
            "</div>\n" +
            "<p><span style=\"font-size: 12pt; color: #0000ff;\">Output &minus;</span></p>\n" +
            "<pre class=\"result notranslate\"><span style=\"font-size: 12pt; color: #0000ff;\">[1] <span style=\"font-size: 12pt;\"><span class=\"pln\"><span class=\"hl num\">1</span><span class=\"hl std\">,</span> <span class=\"hl num\">2</span><span class=\"hl std\">,</span> <span class=\"hl num\">3</span><span class=\"hl std\">,</span> <span class=\"hl num\">3</span><span class=\"hl std\">,</span> <span class=\"hl num\">5</span><span class=\"hl std\">,</span> <span class=\"hl num\">3</span><span class=\"hl std\">,</span> <span class=\"hl num\">2</span><span class=\"hl std\">,</span> <span class=\"hl num\">4</span><span class=\"hl std\">,</span> <span class=\"hl num\">NA</span></span></span> \n" +
            "Levels: \"1\" \"2\" \"3\" \"4\" \"5\"\n" +
            "# applying the nlevels function we can know the number of distinct values\n" +
            "[1] 5<br />\n" +
            "</span></pre>\n" +
            "<h2 align=\"center\"><strong><span style=\"font-size: 13pt; color: #0000ff;\">Data Frames</span></strong></h2>\n" +
            "<p><span style=\"font-size: 12pt;\">Data frames are tabular data objects. Unlike a matrix in data frame each column can contain different modes of data. The first column can be numeric while the second column can be character and third column can be logical. It is a list of vectors of equal length.</span></p>\n" +
            "<p><span style=\"font-size: 12pt;\">Data Frames are created using the&nbsp;<strong>data.frame()</strong>&nbsp;function.</span></p>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\"><span class=\"com\"># Create the data frame.</span><span class=\"pln\">\n" +
            "BMI </span><span class=\"pun\">&lt;-</span><span class=\"pln\"> \tdata</span><span class=\"pun\">.</span><span class=\"pln\">frame</span><span class=\"pun\">(</span><span class=\"pln\">\n" +
            "   gender </span><span class=\"pun\">=</span><span class=\"pln\"> c</span><span class=\"pun\">(</span><span class=\"str\">\"Male\"</span><span class=\"pun\">,</span> <span class=\"str\">\"Female\"</span><span class=\"pun\">,</span><span class=\"str\">\"Female\"</span><span class=\"pun\">),</span><span class=\"pln\"> \n" +
            "   height </span><span class=\"pun\">=</span><span class=\"pln\"> c</span><span class=\"pun\">(</span><span class=\"lit\">162</span><span class=\"pun\">,</span> <span class=\"lit\">141.5</span><span class=\"pun\">,</span> <span class=\"lit\">165</span><span class=\"pun\">),</span><span class=\"pln\"> \n" +
            "   weight </span><span class=\"pun\">=</span><span class=\"pln\"> c</span><span class=\"pun\">(7</span><span class=\"lit\">1</span><span class=\"pun\">,</span><span class=\"lit\">95</span><span class=\"pun\">,</span> <span class=\"lit\">78</span><span class=\"pun\">),</span>\n" +
            "   <span class=\"typ\">Age</span> <span class=\"pun\">=</span><span class=\"pln\"> c</span><span class=\"pun\">(</span><span class=\"lit\">42</span><span class=\"pun\">,60</span><span class=\"pun\">,</span><span class=\"lit\">29</span><span class=\"pun\">)</span>\n" +
            "<span class=\"pun\">)</span>\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">BMI</span><span class=\"pun\">)<br /><br /></span></span></pre>\n" +
            "<p><span style=\"font-size: 12pt; color: #0000ff;\">Output &minus;</span></p>\n" +
            "<pre class=\"result notranslate\"><span style=\"font-size: 12pt;\"><span style=\"color: #0000ff;\">  gender height weight Age\n" +
            "1   Male  162.0     71  42\n" +
            "2   Male  151.5     95  60\n" +
            "3 Female  165.0     78  29</span> </span></pre>\n";


    public static final String rlanguage5="<p style=\"text-align: center;\" align=\"center\"><span style=\"color: #0000ff; font-size: 14pt;\"><strong><span style=\"color: #008000;\">Variable in</span> R</strong></span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">Variables are used for storing data where that value can be altered based to your need. Unique name has to be given to variable (also for functions and objects) is identifier.</span></p>\n" +
            "<h2 style=\"text-align: center;\"><span style=\"font-size: 13pt;\"><span style=\"color: #008000;\">Rules for writing Identifiers in</span> <span style=\"color: #0000ff;\">R</span></span></h2>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">Identifier names are a combination of<span style=\"color: #0000ff;\"> alphabets, digits, period (.) <span style=\"color: #000000;\">and</span>&nbsp;underscore (_)</span>. It is mandatory to start an identifier with a letter or a period. Here are some of the points that which you should remember before naming any identifier:</span></p>\n" +
            "<table class=\"table table-bordered\" style=\"width: 577px; border-style: solid; border-color: #000000; margin-left: auto; margin-right: auto;\" border=\"1\">\n" +
            "<tbody>\n" +
            "<tr>\n" +
            "<th style=\"width: 122px;\"><span style=\"font-size: 12pt;\">Variable Name</span></th>\n" +
            "<th style=\"width: 64px;\"><span style=\"font-size: 12pt;\">Validity</span></th>\n" +
            "<th style=\"width: 391px;\"><span style=\"font-size: 12pt;\">Reason</span></th>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"width: 122px;\"><span style=\"font-size: 12pt;\">this_is_accepted</span></td>\n" +
            "<td style=\"width: 64px;\"><span style=\"font-size: 12pt;\">valid</span></td>\n" +
            "<td style=\"width: 391px;\"><span style=\"font-size: 12pt;\">Has letters, numbers, dot and underscore</span></td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"width: 122px;\"><span style=\"font-size: 12pt;\">var_r%</span></td>\n" +
            "<td style=\"width: 64px;\"><span style=\"font-size: 12pt;\">Invalid</span></td>\n" +
            "<td style=\"width: 391px;\"><span style=\"font-size: 12pt;\">Has the character '%'. Only dot(.) and underscore allowed.</span></td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"width: 122px;\"><span style=\"font-size: 12pt;\">5um</span></td>\n" +
            "<td style=\"width: 64px;\"><span style=\"font-size: 12pt;\">invalid</span></td>\n" +
            "<td style=\"width: 391px;\"><span style=\"font-size: 12pt;\">Starts with a number</span></td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"width: 122px;\"><span style=\"font-size: 12pt;\">.work.with ,</span><br /><span style=\"font-size: 12pt;\">var.r</span></td>\n" +
            "<td style=\"width: 64px;\"><span style=\"font-size: 12pt;\">valid</span></td>\n" +
            "<td style=\"width: 391px;\"><span style=\"font-size: 12pt;\">Can start with a dot(.) but the dot(.)should not be followed by a number.</span></td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"width: 122px;\"><span style=\"font-size: 12pt;\">.2var_name</span></td>\n" +
            "<td style=\"width: 64px;\"><span style=\"font-size: 12pt;\">invalid</span></td>\n" +
            "<td style=\"width: 391px;\"><span style=\"font-size: 12pt;\">The starting dot is followed by a number making it invalid.</span></td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"width: 122px;\"><span style=\"font-size: 12pt;\">TRUE</span></td>\n" +
            "<td style=\"width: 64px;\"><span style=\"font-size: 12pt;\">invalid</span></td>\n" +
            "<td style=\"width: 391px;\">\n" +
            "<p><span style=\"font-size: 12pt;\">Reserved words in R cannot be used as identifiers.</span></p>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"width: 122px;\"><span style=\"font-size: 12pt;\">t0t@l</span></td>\n" +
            "<td style=\"width: 64px;\"><span style=\"font-size: 12pt;\">invalid</span></td>\n" +
            "<td style=\"width: 391px;\"><span style=\"font-size: 12pt;\">@ is not used.</span></td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"width: 122px;\"><span style=\"font-size: 12pt;\">_ray</span></td>\n" +
            "<td style=\"width: 64px;\"><span style=\"font-size: 12pt;\">invalid</span></td>\n" +
            "<td style=\"width: 391px;\"><span style=\"font-size: 12pt;\">Starts with _ which is not valid</span></td>\n" +
            "</tr>\n" +
            "</tbody>\n" +
            "</table>\n" +
            "<p style=\"text-align: justify;\">&nbsp;</p>\n" +
            "<h2 style=\"text-align: center;\"><span style=\"color: #0000ff; font-size: 13pt;\"><strong>Variable Assignment</strong></span></h2>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">The variables can be assigned values using leftward, rightward and equal to operator. The values of the variables can be printed using&nbsp;<strong>print()</strong>&nbsp;or&nbsp;<strong>cat()</strong>function. The&nbsp;<strong>cat()</strong>&nbsp;function combines multiple items into a continuous print output.</span></p>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"color: #008000; font-size: 12pt;\"><span class=\"com\"># Assignment using equal operator.</span>\n" +
            "<span class=\"kwd\">var</span><span class=\"pun\">.</span><span class=\"lit\">1</span> <span class=\"pun\">=</span><span class=\"pln\"> c</span><span class=\"pun\">(1</span><span class=\"pun\">,3</span><span class=\"pun\">,5</span><span class=\"pun\">,8</span><span class=\"pun\">)</span>           \n" +
            "\n" +
            "<span class=\"com\"># Assignment using leftward operator.</span>\n" +
            "<span class=\"kwd\">var</span><span class=\"pun\">.</span><span class=\"lit\">2</span> <span class=\"pun\">&lt;-</span><span class=\"pln\"> c</span><span class=\"pun\">(</span><span class=\"str\">\"learn\"</span><span class=\"pun\">,</span><span class=\"str\">\"R\"</span><span class=\"pun\">)</span>         \n" +
            "\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"kwd\">var</span><span class=\"pun\">.</span><span class=\"lit\">1</span><span class=\"pun\">)</span><span class=\"pln\">\n" +
            "cat </span><span class=\"pun\">(</span><span class=\"str\">\"var.1 is \"</span><span class=\"pun\">,</span> <span class=\"kwd\">var</span><span class=\"pun\">.</span><span class=\"lit\">1</span> <span class=\"pun\">,</span><span class=\"str\">\"\\n\"</span><span class=\"pun\">)</span><span class=\"pln\">\n" +
            "cat </span><span class=\"pun\">(</span><span class=\"str\">\"var.2 is \"</span><span class=\"pun\">,</span> <span class=\"kwd\">var</span><span class=\"pun\">.</span><span class=\"lit\">2</span> <span class=\"pun\">,</span><span class=\"str\">\"\\n\"</span><span class=\"pun\">)</span><span class=\"pun\"><br /><br /></span></span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"color: #0000ff; font-size: 12pt;\">Output &minus;</span></p>\n" +
            "<pre class=\"result notranslate\"><span style=\"color: #0000ff; font-size: 12pt;\">[1] 1 3 5 8\n" +
            "var.1 is  0 1 2 3 \n" +
            "var.2 is  learn R \n" +
            "<br /></span></pre>\n" +
            "<h2 style=\"text-align: center;\"><strong><span style=\"font-size: 13pt; color: #0000ff;\">Data Type of a Variable</span></strong></h2>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">R is called a dynamically typed language, which means that we can change a variable&rsquo;s data type of the same variable again and again when using it in a program.</span></p>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt;\"><span style=\"color: #008000;\"><span class=\"pln\">var_x </span><span class=\"pun\">&lt;-</span> <span class=\"str\">\"LearnR\"</span><span class=\"pln\">\n" +
            "cat</span><span class=\"pun\">(</span><span class=\"str\">\"The class of var_x is \"</span><span class=\"pun\">,</span><span class=\"kwd\">class</span><span class=\"pun\">(</span><span class=\"pln\">var_x</span><span class=\"pun\">),</span><span class=\"str\">\"\\n\"</span><span class=\"pun\">)</span><span class=\"pln\">\n" +
            "\n" +
            "var_x </span><span class=\"pun\">&lt;-</span> <span class=\"lit\">51.5</span><span class=\"pln\">\n" +
            "cat</span><span class=\"pun\">(</span><span class=\"str\">\"  Now the class of var_x is \"</span><span class=\"pun\">,</span><span class=\"kwd\">class</span><span class=\"pun\">(</span><span class=\"pln\">var_x</span><span class=\"pun\">),</span><span class=\"str\">\"\\n\"</span><span class=\"pun\">)</span></span><span class=\"pln\">\n" +
            "<br /></span></span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"color: #0000ff; font-size: 12pt;\">Output&minus;</span></p>\n" +
            "<pre class=\"result notranslate\"><span style=\"color: #0000ff; font-size: 12pt;\">The class of var_x is  character \n" +
            "Now the class of var_x is  numeric <br />\n" +
            "</span></pre>\n" +
            "<h2 style=\"text-align: center;\"><span style=\"font-size: 13pt; color: #0000ff;\"><strong>Finding Variables</strong></span></h2>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">To know all the variables currently available in the workspace we use the&nbsp;<strong>ls()&nbsp; </strong>function.</span></p>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"color: #008000; font-size: 12pt;\"><span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">ls</span><span class=\"pun\">())</span></span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"color: #0000ff; font-size: 12pt;\">Output &minus;</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"color: #0000ff; font-size: 12pt;\">#It will show all the available variables</span></p>\n" +
            "<p style=\"text-align: justify;\">&nbsp;</p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">The <span style=\"color: #0000ff;\">ls()</span> function can use patterns to match the variable names.</span></p>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"color: #008000; font-size: 12pt;\"><span class=\"com\"># List the variables starting with the pattern \"r\".</span>\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">ls</span><span class=\"pun\">(</span><span class=\"pln\">pattern </span><span class=\"pun\">=</span> <span class=\"str\">\"r\"</span><span class=\"pun\">))</span>   </span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"color: #0000ff; font-size: 12pt;\">Output &minus;</span></p>\n" +
            "<pre class=\"result notranslate\"><span style=\"color: #0000ff; font-size: 12pt;\">[1] \"r\" \"my_r\"  \"learn_r\"  \"r.1\"      \n" +
            "   \n" +
            "</span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">The variables starting with&nbsp;<strong>dot(.)</strong>&nbsp;are hidden, they can be listed using \"all.names = TRUE\" argument to ls() function.</span></p>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"color: #008000; font-size: 12pt;\"><span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">ls</span><span class=\"pun\">(</span><span class=\"pln\">all</span><span class=\"pun\">.</span><span class=\"pln\">name </span><span class=\"pun\">=</span><span class=\"pln\"> TRUE</span><span class=\"pun\">))</span></span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"color: #0000ff; font-size: 12pt;\">When we execute the above code, it produces the following result &minus;</span></p>\n" +
            "<pre class=\"result notranslate\"><span style=\"color: #0000ff; font-size: 12pt;\">[1] \".cars\" \".Random.seed\" \".var_r\"  \".r\"  \".r2\"   \n" +
            " \n" +
            "</span></pre>\n" +
            "<h2 style=\"text-align: center;\"><span style=\"font-size: 13pt; color: #0000ff;\"><strong>Deleting Variables</strong></span></h2>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">Variables can be deleted by using the&nbsp;<strong>rm()</strong>&nbsp;function. Below we delete the variable var.3. On printing the value of the variable error is thrown.</span></p>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"color: #008000; font-size: 12pt;\"><span class=\"pln\">&gt; rm</span><span class=\"pun\">(</span><span class=\"kwd\">r</span><span class=\"pun\">.</span><span class=\"lit\">3</span><span class=\"pun\">)</span>\n" +
            "<span class=\"kwd\">&gt; print</span><span class=\"pun\">(</span><span class=\"kwd\">r</span><span class=\"pun\">.</span><span class=\"lit\">3</span><span class=\"pun\">)</span></span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"color: #0000ff; font-size: 12pt;\">When we execute the above code, it produces the following result &minus;</span></p>\n" +
            "<pre class=\"result notranslate\"><span style=\"color: #0000ff; font-size: 12pt;\">[1] \"r.3\"\n" +
            "Error in print(var.3) : object 'r.3' not found<br />\n" +
            "</span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">All the variables can be deleted by using the&nbsp;<strong>rm()</strong>&nbsp;and&nbsp;<strong>ls()</strong>&nbsp;function together.</span></p>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"color: #008000; font-size: 12pt;\"><span class=\"pln\">rm</span><span class=\"pun\">(</span><span class=\"pln\">list </span><span class=\"pun\">=</span><span class=\"pln\"> ls</span><span class=\"pun\">())</span>\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">ls</span><span class=\"pun\">())<br /><br /></span></span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"color: #0000ff; font-size: 12pt;\">Output &minus;</span></p>\n" +
            "<pre class=\"result notranslate\"><span style=\"color: #0000ff; font-size: 12pt;\"><span style=\"font-family: verdana, geneva;\">character(0)</span><br /><br /></span></pre>\n" +
            "<pre class=\"result notranslate\">&nbsp;</pre>";


    public static final String rlanguage6="<p style=\"text-align: center;\"><span style=\"font-family: verdana, geneva; font-size: 14pt; color: #0000ff;\"><strong><span style=\"color: #008000;\">Constants in</span> R</strong></span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">Constants are entities within a program whose value can't be changed. There are 2 basic types of constant. These are numeric constants and character constants.</span></p>\n" +
            "<h3 style=\"text-align: center;\"><span style=\"color: #0000ff;\"><strong><span style=\"font-size: 13pt;\">Numeric Constants</span></strong></span></h3>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">All the numbers you will be using within a program fall under this category. There are sub types like integer, double or complex, which is checked usng typeof() function. Example:</span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #008000;\"><code class=\"prettyprint prettyprinted\"><span class=\"pun\">&gt;</span> <span class=\"kwd\">typeof</span> <span class=\"pun\">(</span><span class=\"lit\">6</span><span class=\"pun\">)</span>\n" +
            "<span class=\"pun\">[</span><span class=\"lit\">1</span><span class=\"pun\">]</span> <span class=\"str\">\"double\"</span>\n" +
            "\n" +
            "<span class=\"pun\">&gt;</span> <span class=\"kwd\">typeof</span> <span class=\"pun\">(</span><span class=\"lit\">4L</span><span class=\"pun\">)</span>\n" +
            "<span class=\"pun\">[</span><span class=\"lit\">1</span><span class=\"pun\">]</span> <span class=\"str\">\"integer\"<br /></span></code></span></pre>\n" +
            "<h3 style=\"text-align: center;\"><span style=\"color: #0000ff;\"><strong><span style=\"font-size: 13pt;\">Character Constants</span></strong></span></h3>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">These can be signified by means of either single quotes (') or using double quotes (\") as delimiters.</span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #008000;\"><code class=\"prettyprint prettyprinted\"><span class=\"pun\">&gt;</span> <span class=\"str\">'ray'</span>\n" +
            "<span class=\"pun\">[</span><span class=\"lit\">1</span><span class=\"pun\">]</span> <span class=\"str\">\"ray\"</span>\n" +
            "\n" +
            "<span class=\"pun\">&gt;</span> <span class=\"kwd\">typeof</span><span class=\"pun\">(</span><span class=\"str\">\"karlos\"</span><span class=\"pun\">)</span>\n" +
            "<span class=\"pun\">[</span><span class=\"lit\">1</span><span class=\"pun\">]</span> <span class=\"str\">\"character\"</span></code></span></pre>\n" +
            "<pre class=\"result notranslate\"><span style=\"color: #008000; font-size: 12pt;\">&nbsp;</span></pre>";


    public static final String rlanguage7="<h1 style=\"text-align: center;\"><span style=\"color: #008000;\"><strong><span style=\"font-size: 14pt;\"><span style=\"color: #0000ff;\">R -</span> Operators</span></strong></span></h1>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">The operators are those symbols which tell the compiler for performing precise mathematical or logical manipulations. R programming is loaded with built in operators and supplies below mentioned types of operators.</span></p>\n" +
            "<h2 style=\"text-align: justify;\"><strong><span style=\"font-size: 13pt; color: #0000ff;\">Types of Operators</span></strong></h2>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">We have the following types of operators in R programming &minus;</span></p>\n" +
            "<ol class=\"list\">\n" +
            "<li style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">Arithmetic Operators</span></li>\n" +
            "<li style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">Relational Operators</span></li>\n" +
            "<li style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">Logical Operators</span></li>\n" +
            "<li style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">Assignment Operators</span></li>\n" +
            "<li style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">Miscellaneous Operators</span></li>\n" +
            "</ol>\n" +
            "<h2><span style=\"font-size: 12pt; color: #000000;\">1.</span><strong><span style=\"font-size: 12pt; color: #0000ff;\"> Arithmetic Operators</span></strong></h2>\n" +
            "<p><span style=\"font-size: 12pt;\">The operators act on each element of the vector.</span></p>\n" +
            "<table class=\"table table-bordered\" style=\"border-style: solid; border-color: #000000; margin-left: auto; margin-right: auto;\" border=\"1\">\n" +
            "<tbody>\n" +
            "<tr>\n" +
            "<th style=\"width: 71px;\"><span style=\"font-size: 12pt;\">Operator</span></th>\n" +
            "<th style=\"width: 227px;\"><span style=\"font-size: 12pt;\">Description</span></th>\n" +
            "<th style=\"width: 267px;\"><span style=\"font-size: 12pt;\">Example</span></th>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"width: 71px; text-align: center;\"><span style=\"font-size: 12pt;\">+</span></td>\n" +
            "<td style=\"width: 227px; text-align: center;\"><span style=\"font-size: 12pt;\">Adds two vectors</span></td>\n" +
            "<td style=\"width: 267px;\">\n" +
            "<p><span style=\"font-size: 12pt; color: #008000;\">r &lt;- c( 5,8,10)</span><br /><span style=\"font-size: 12pt; color: #008000;\">l &lt;- c(18, 30, 15)</span><br /><span style=\"font-size: 12pt; color: #008000;\">print(r+l) # Adds two vectors</span><br /><span style=\"font-size: 12pt;\">&nbsp; &nbsp; &nbsp;</span></p>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp;<span style=\"color: #0000ff;\">result &minus;</span></span></p>\n" +
            "<p><span style=\"font-size: 12pt; color: #0000ff;\">[1] 23 38 25</span></p>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"width: 71px; text-align: center;\"><span style=\"font-size: 12pt;\">&minus;</span></td>\n" +
            "<td style=\"width: 227px; text-align: center;\"><span style=\"font-size: 12pt;\">Subtracts second vector from the first</span></td>\n" +
            "<td style=\"width: 267px;\">\n" +
            "<p><span style=\"font-size: 12pt; color: #008000;\">r &lt;- c( 5,8,10)</span><br /><span style=\"font-size: 12pt; color: #008000;\">l &lt;- c(18, 30, 15)</span><br /><span style=\"font-size: 12pt; color: #008000;\">print(r-l)&nbsp;</span></p>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp;<span style=\"color: #0000ff;\">result &minus;</span></span></p>\n" +
            "<p><span style=\"font-size: 12pt; color: #0000ff;\">[1] -13 -22 -5</span></p>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"width: 71px; text-align: center;\"><span style=\"font-size: 12pt;\">*</span></td>\n" +
            "<td style=\"width: 227px; text-align: center;\"><span style=\"font-size: 12pt;\">Multiplies both vectors</span></td>\n" +
            "<td style=\"width: 267px;\">\n" +
            "<p><span style=\"font-size: 12pt; color: #008000;\">r &lt;- c( 5,8,10)</span><br /><span style=\"font-size: 12pt; color: #008000;\">l &lt;- c(18, 30, 15)</span><br /><span style=\"font-size: 12pt; color: #008000;\">print(r*l)&nbsp;</span><br /><span style=\"font-size: 12pt;\">&nbsp; &nbsp; &nbsp;</span></p>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp;<span style=\"color: #0000ff;\">result &minus;</span></span></p>\n" +
            "<p><span style=\"font-size: 12pt; color: #0000ff;\">[1] 90 240 150</span></p>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"width: 71px; text-align: center;\"><span style=\"font-size: 12pt;\">/</span></td>\n" +
            "<td style=\"width: 227px; text-align: center;\"><span style=\"font-size: 12pt;\">Divide the first vector with the second</span></td>\n" +
            "<td style=\"width: 267px;\">\n" +
            "<p><span style=\"font-size: 12pt; color: #008000;\">r &lt;- c( 5,8,10)</span><br /><span style=\"font-size: 12pt; color: #008000;\">l &lt;- c(18, 30, 15)</span><br /><span style=\"font-size: 12pt;\"><span style=\"color: #008000;\">print(v/t)</span>&nbsp;</span><br /><span style=\"font-size: 12pt;\">&nbsp; &nbsp;</span></p>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp;<span style=\"color: #0000ff;\">result &minus;</span></span></p>\n" +
            "<p><span style=\"font-size: 12pt; color: #0000ff;\">[1] 0.250000 1.833333 1.500000</span></p>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"width: 71px; text-align: center;\"><span style=\"font-size: 12pt;\">%%</span></td>\n" +
            "<td style=\"width: 227px; text-align: center;\"><span style=\"font-size: 12pt;\">Give the remainder of the first vector with the second</span></td>\n" +
            "<td style=\"width: 267px;\">\n" +
            "<p><span style=\"font-size: 12pt; color: #008000;\">r &lt;- c( 5,8,10)</span><br /><span style=\"font-size: 12pt; color: #008000;\">l &lt;- c(18, 30, 15)</span><br /><span style=\"font-size: 12pt; color: #008000;\">print(r%%l)</span><br /><span style=\"font-size: 12pt;\">&nbsp; &nbsp; &nbsp;</span></p>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp;<span style=\"color: #0000ff;\">result &minus;</span></span></p>\n" +
            "<p><span style=\"font-size: 12pt; color: #0000ff;\">[1] 5 8 10</span></p>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"width: 71px; text-align: center;\"><span style=\"font-size: 12pt;\">%/%</span></td>\n" +
            "<td style=\"width: 227px; text-align: center;\"><span style=\"font-size: 12pt;\">The result of division of first vector with second (quotient)</span></td>\n" +
            "<td style=\"width: 267px;\">\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\">r &lt;- c( 5,8,10)</span><br /><span style=\"font-size: 12pt; color: #008000;\">l &lt;- c(18, 30, 15)</span><br /><span style=\"font-size: 12pt; color: #008000;\">print(r%/%l)</span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp;<span style=\"color: #0000ff;\">result &minus;</span></span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\">[1] 0 0 0</span></pre>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"width: 71px; text-align: center;\"><span style=\"font-size: 12pt;\">^</span></td>\n" +
            "<td style=\"width: 227px; text-align: center;\"><span style=\"font-size: 12pt;\">The first vector raised to the exponent of second vector</span></td>\n" +
            "<td style=\"width: 267px;\">\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\">r &lt;- c( 5,8,10)</span><br /><span style=\"font-size: 12pt; color: #008000;\">l &lt;- c(18, 30, 15)</span><br /><span style=\"font-size: 12pt; color: #008000;\">print(r^l)</span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp;<span style=\"color: #0000ff;\">result &minus;</span></span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\">[1] 3.814697e+12 1.237940e+27</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">    1.000000e+15</span></pre>\n" +
            "</td>\n" +
            "</tr>\n" +
            "</tbody>\n" +
            "</table>\n" +
            "<h2><span style=\"font-size: 12pt;\">2. <strong><span style=\"color: #0000ff; font-size: 13pt;\">Relational Operators</span></strong></span></h2>\n" +
            "<p>&nbsp;</p>\n" +
            "<table class=\"table table-bordered\" style=\"height: 1002px; border-style: solid; border-color: #000000; margin-left: auto; margin-right: auto;\" border=\"1\">\n" +
            "<tbody>\n" +
            "<tr style=\"height: 18px;\">\n" +
            "<th style=\"height: 18px; width: 75px;\"><span style=\"font-size: 12pt;\">Operator</span></th>\n" +
            "<th style=\"height: 18px; width: 290px;\"><span style=\"font-size: 12pt;\">Description</span></th>\n" +
            "<th style=\"height: 18px; width: 212px;\"><span style=\"font-size: 12pt;\">Example</span></th>\n" +
            "</tr>\n" +
            "<tr style=\"height: 164px;\">\n" +
            "<td style=\"height: 164px; text-align: center; width: 75px;\"><span style=\"font-size: 12pt;\">&gt;</span></td>\n" +
            "<td style=\"height: 164px; width: 290px; text-align: center;\"><span style=\"font-size: 12pt;\">Checks if each element of the first vector is greater than the corresponding element of the second vector.</span></td>\n" +
            "<td style=\"height: 164px; width: 212px;\">\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\">r &lt;- c( 5,80,10)</span><br /><span style=\"font-size: 12pt; color: #008000;\">l &lt;- c(18, 30, 15)</span><br /><span style=\"font-size: 12pt; color: #008000;\">print(r&gt;l)</span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp;<span style=\"color: #0000ff;\">result &minus;</span></span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\">[1] FALSE  TRUE FALSE</span></pre>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr style=\"height: 164px;\">\n" +
            "<td style=\"height: 164px; width: 75px; text-align: center;\"><span style=\"font-size: 12pt;\">&lt;</span></td>\n" +
            "<td style=\"height: 164px; width: 290px; text-align: center;\"><span style=\"font-size: 12pt;\">Checks if each element of the first vector is less than the corresponding element of the second vector.</span></td>\n" +
            "<td style=\"height: 164px; width: 212px;\">\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\">r &lt;- c( 5,80,10)</span><br /><span style=\"font-size: 12pt; color: #008000;\">l &lt;- c(18, 30, 15)</span><br /><span style=\"font-size: 12pt; color: #008000;\">print(r&lt;l)</span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp;<span style=\"color: #0000ff;\">result &minus;</span></span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\">[1]  TRUE FALSE  TRUE</span></pre>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr style=\"height: 164px;\">\n" +
            "<td style=\"height: 164px; width: 75px; text-align: center;\"><span style=\"font-size: 12pt;\">==</span></td>\n" +
            "<td style=\"height: 164px; width: 290px; text-align: center;\"><span style=\"font-size: 12pt;\">Checks if each element of the first vector is equal to the corresponding element of the second vector.</span></td>\n" +
            "<td style=\"height: 164px; width: 212px;\">\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span class=\"pln\" style=\"font-size: 12pt;\"><span style=\"color: #008000;\">r &lt;- c( 18,80,10)</span><br /><span style=\"color: #008000;\">l &lt;- c(18, 30, 15)</span><br /><span style=\"color: #008000;\">print(r==l)</span></span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp;<span style=\"color: #0000ff;\">result &minus;</span></span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\">[1]  TRUE FALSE FALSE</span></pre>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr style=\"height: 164px;\">\n" +
            "<td style=\"height: 164px; width: 75px; text-align: center;\"><span style=\"font-size: 12pt;\">&lt;=</span></td>\n" +
            "<td style=\"height: 164px; width: 290px; text-align: center;\"><span style=\"font-size: 12pt;\">Checks if each element of the first vector is less than or equal to the corresponding element of the second vector.</span></td>\n" +
            "<td style=\"height: 164px; width: 212px;\">\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\">r &lt;- c( 18,80,10)</span><br /><span style=\"font-size: 12pt; color: #008000;\">l &lt;- c(18, 30, 15)</span><br /><span style=\"font-size: 12pt; color: #008000;\">print(r&lt;=l)</span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp;<span style=\"color: #0000ff;\">result &minus;</span></span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\">[1]  TRUE FALSE  TRUE</span></pre>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr style=\"height: 164px;\">\n" +
            "<td style=\"height: 164px; width: 75px; text-align: center;\"><span style=\"font-size: 12pt;\">&gt;=</span></td>\n" +
            "<td style=\"height: 164px; width: 290px; text-align: center;\"><span style=\"font-size: 12pt;\">Checks if each element of the first vector is greater than or equal to the corresponding element of the second vector.</span></td>\n" +
            "<td style=\"height: 164px; width: 212px;\">\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\">r &lt;- c( 18,80,10)</span><br /><span style=\"font-size: 12pt; color: #008000;\">l &lt;- c(18, 30, 15)</span><br /><span style=\"font-size: 12pt; color: #008000;\">print(r&gt;=l)</span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp;<span style=\"color: #0000ff;\">result &minus;</span></span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\">[1]  TRUE  TRUE FALSE</span></pre>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr style=\"height: 164px;\">\n" +
            "<td style=\"height: 164px; width: 75px; text-align: center;\"><span style=\"font-size: 12pt;\">!=</span></td>\n" +
            "<td style=\"height: 164px; width: 290px; text-align: center;\"><span style=\"font-size: 12pt;\">Checks if each element of the first vector is unequal to the corresponding element of the second vector.</span></td>\n" +
            "<td style=\"height: 164px; width: 212px;\">\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\">r &lt;- c( 18,80,10)</span><br /><span style=\"font-size: 12pt; color: #008000;\">l &lt;- c(18, 30, 15)</span><br /><span style=\"font-size: 12pt; color: #008000;\">print(r!=l)</span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp;<span style=\"color: #0000ff;\">result &minus;</span></span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\">[1] FALSE  TRUE  TRUE</span></pre>\n" +
            "</td>\n" +
            "</tr>\n" +
            "</tbody>\n" +
            "</table>\n" +
            "<h2><span style=\"font-size: 12pt;\">3. <strong><span style=\"color: #0000ff; font-size: 13pt;\">Logical Operators</span></strong></span></h2>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">Here are the set of logical operators that R language allows to use.&nbsp; &nbsp; This operator is valid only to vectors of type logical, number or complex numbers. All figures greater than one is considered to be logical value i.e. TRUE.</span></p>\n" +
            "<table class=\"table table-bordered\" style=\"border-style: solid; border-color: #000000; margin-left: auto; margin-right: auto;\" border=\"1\">\n" +
            "<tbody>\n" +
            "<tr>\n" +
            "<th style=\"width: 85px;\"><span style=\"font-size: 12pt;\">Operator</span></th>\n" +
            "<th style=\"width: 250px;\"><span style=\"font-size: 12pt;\">Description</span></th>\n" +
            "<th style=\"width: 242px;\"><span style=\"font-size: 12pt;\">Example</span></th>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"text-align: center; width: 85px;\"><span style=\"font-size: 12pt;\">&amp;</span></td>\n" +
            "<td style=\"text-align: left; width: 250px;\"><span style=\"font-size: 12pt;\">It is called Element-wise Logical AND operator. It combines each element of the first vector with the corresponding element of the second vector and gives a output TRUE if both the elements are TRUE.</span></td>\n" +
            "<td style=\"width: 242px;\">\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\">r &lt;- c(8, 5, TRUE, 4+7i)</span><br /><span style=\"font-size: 12pt; color: #008000;\">l &lt;- c(6,0, FALSE, 4+7i)</span><br /><span style=\"font-size: 12pt; color: #008000;\">print(r&amp;l)</span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp;<span style=\"color: #0000ff;\">result &minus;</span></span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\">[1]  TRUE FALSE FALSE  TRUE</span></pre>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"width: 85px; text-align: center;\"><span style=\"font-size: 12pt;\">|</span></td>\n" +
            "<td style=\"width: 250px;\"><span style=\"font-size: 12pt;\">It is called Element-wise Logical OR operator. It combines each element of the first vector with the corresponding element of the second vector and gives a output TRUE if one the elements is TRUE.</span></td>\n" +
            "<td style=\"width: 242px;\">\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\">r &lt;- c(8, 5, TRUE, 4+7i)</span><br /><span style=\"font-size: 12pt; color: #008000;\">l &lt;- c(6,2, FALSE, 6+7i)</span><br /><span style=\"font-size: 12pt; color: #008000;\">print(r|l)</span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp;<span style=\"color: #0000ff;\">result &minus;</span></span></p>\n" +
            "<pre class=\"result notranslate\"><span style=\"font-size: 12pt; color: #0000ff;\">[1]  TRUE TRUE TRUE  TRUE\n" +
            "</span></pre>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"width: 85px; text-align: center;\"><span style=\"font-size: 12pt;\">!</span></td>\n" +
            "<td style=\"width: 250px;\"><span style=\"font-size: 12pt;\">It is called Logical NOT operator. Takes each element of the vector and gives the opposite logical value.</span></td>\n" +
            "<td style=\"width: 242px;\">\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\">l &lt;- c(6,2, FALSE, 6+7i)</span><br /><span style=\"font-size: 12pt; color: #008000;\">print(!l)</span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp;<span style=\"color: #0000ff;\">result &minus;</span></span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\">[1] FALSE FALSE  TRUE FALSE</span></pre>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"width: 85px; text-align: center;\"><span style=\"font-size: 12pt;\">&amp;&amp;</span></td>\n" +
            "<td style=\"width: 250px;\"><span style=\"font-size: 12pt;\">Called Logical AND operator. Takes first element of both the vectors and gives the TRUE only if both are TRUE.</span></td>\n" +
            "<td style=\"width: 242px;\">\n" +
            "<p><span class=\"pln\" style=\"font-size: 12pt; color: #008000;\">r &lt;- c(8, 5, TRUE, 4+7i)<br />l &lt;- c(6,2, FALSE, 6+7i)<br />print(r&amp;&amp;l)</span></p>\n" +
            "<p><span style=\"font-size: 12pt; color: #0000ff;\">&nbsp;result-</span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\">[1] TRUE</span></pre>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"width: 85px; text-align: center;\"><span style=\"font-size: 12pt;\">||</span></td>\n" +
            "<td style=\"width: 250px;\"><span style=\"font-size: 12pt;\">Called Logical OR operator. Takes first element of both the vectors and gives the TRUE if one of them is TRUE.</span></td>\n" +
            "<td style=\"width: 242px;\">\n" +
            "<p><span class=\"pln\" style=\"font-size: 12pt; color: #008000;\">r &lt;- c(8, 5, FALSE, 4+7i)<br />l &lt;- c(6,2, FALSE, 6+7i)<br />print(r||l)</span></p>\n" +
            "<p><span class=\"pln\" style=\"font-size: 12pt;\">&nbsp;<span style=\"color: #0000ff;\">result-</span></span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\">[1] TRUE</span></pre>\n" +
            "</td>\n" +
            "</tr>\n" +
            "</tbody>\n" +
            "</table>\n" +
            "<p>&nbsp;</p>\n" +
            "<h2><span style=\"font-size: 12pt;\">4. <span style=\"font-size: 13pt; color: #0000ff;\">Assignment Operators</span></span></h2>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">&nbsp; &nbsp; These operators are used to assign values to vectors.</span></p>\n" +
            "<table class=\"table table-bordered\" style=\"border-style: solid; border-color: #000000; margin-left: auto; margin-right: auto; height: 484px;\" border=\"1\" width=\"509\">\n" +
            "<tbody>\n" +
            "<tr>\n" +
            "<th style=\"width: 78px;\"><span style=\"font-size: 12pt;\">Operator</span></th>\n" +
            "<th style=\"width: 190px;\"><span style=\"font-size: 12pt;\">Description</span></th>\n" +
            "<th style=\"width: 219px;\"><span style=\"font-size: 12pt;\">Example</span></th>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"width: 78px;\">\n" +
            "<p style=\"text-align: center;\"><span style=\"font-size: 12pt;\">&lt;&minus;</span></p>\n" +
            "<p style=\"text-align: center;\"><span style=\"font-size: 12pt;\">or</span></p>\n" +
            "<p style=\"text-align: center;\"><span style=\"font-size: 12pt;\">=</span></p>\n" +
            "<p style=\"text-align: center;\"><span style=\"font-size: 12pt;\">or</span></p>\n" +
            "<p style=\"text-align: center;\"><span style=\"font-size: 12pt;\">&lt;&lt;&minus;</span></p>\n" +
            "</td>\n" +
            "<td style=\"width: 190px;\"><span style=\"font-size: 12pt;\">Called Left Assignment</span></td>\n" +
            "<td style=\"width: 219px;\">\n" +
            "<p><span style=\"font-size: 12pt; color: #008000;\">g1 &lt;- c (4,1,TRUE, 5+3i)</span><br /><span style=\"font-size: 12pt; color: #008000;\">g2 &lt;&lt;- c (5,1,FALSE, 5+4i)</span><br /><span style=\"font-size: 12pt; color: #008000;\">g3 = c (8,1, TRUE, 2+8i)</span></p>\n" +
            "<p><span style=\"font-size: 12pt; color: #008000;\">print (g1)</span><br /><span style=\"font-size: 12pt; color: #008000;\">print (g2)</span><br /><span style=\"font-size: 12pt; color: #008000;\">print (g3)</span></p>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp;<span style=\"color: #0000ff;\">result &minus;</span></span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\">[1] 4+0i 1+0i 1+0i 5+3i\n" +
            "[1] 5+0i 1+0i 0+0i 5+4i\n" +
            "[1] 8+0i 1+0i 1+0i 2+8i</span></pre>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"width: 78px;\">\n" +
            "<p style=\"text-align: center;\"><span style=\"font-size: 12pt;\">-&gt;</span></p>\n" +
            "<p style=\"text-align: center;\"><span style=\"font-size: 12pt;\">or</span></p>\n" +
            "<p style=\"text-align: center;\"><span style=\"font-size: 12pt;\">-&gt;&gt;</span></p>\n" +
            "</td>\n" +
            "<td style=\"width: 190px; text-align: center;\"><span style=\"font-size: 12pt;\">Called Right Assignment</span></td>\n" +
            "<td style=\"width: 219px;\">\n" +
            "<p><span style=\"font-size: 12pt; color: #008000;\">c(5,1,FALSE, 5+4i) -&gt; g1</span><br /><span style=\"font-size: 12pt; color: #008000;\">c(8,1, TRUE, 2+8i) -&gt;&gt; g2</span></p>\n" +
            "<p><span style=\"font-size: 12pt; color: #008000;\">print (g1)</span><br /><span style=\"font-size: 12pt; color: #008000;\">print (g2)</span></p>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp;<span style=\"color: #0000ff;\">result &minus;</span></span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\">[1] 5+0i 1+0i 0+0i 5+4i\n" +
            "[1] 8+0i 1+0i 1+0i 2+8i</span></pre>\n" +
            "</td>\n" +
            "</tr>\n" +
            "</tbody>\n" +
            "</table>\n" +
            "<h2><span style=\"font-size: 12pt;\">5. <strong><span style=\"color: #0000ff; font-size: 13pt;\">Miscellaneous Operators</span></strong></span></h2>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">These operators are used to for specific purpose and not general mathematical or logical computation.</span></p>\n" +
            "<table class=\"table table-bordered\" style=\"border-style: solid; border-color: #000000; margin-left: auto; margin-right: auto;\" border=\"1\">\n" +
            "<tbody>\n" +
            "<tr>\n" +
            "<th><span style=\"font-size: 12pt;\">Operator</span></th>\n" +
            "<th><span style=\"font-size: 12pt;\">Description</span></th>\n" +
            "<th><span style=\"font-size: 12pt;\">Example</span></th>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"text-align: center;\"><span style=\"font-size: 12pt;\">:</span></td>\n" +
            "<td style=\"text-align: left;\"><span style=\"font-size: 12pt;\">Colon operator. It creates the series of numbers in sequence for a vector.</span></td>\n" +
            "<td>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\"><span class=\"pln\">v </span><span class=\"pun\">&lt;-</span> 1<span class=\"pun\">:6</span>\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">v</span><span class=\"pun\">)</span> </span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\">&nbsp;<span style=\"color: #0000ff;\">result &minus;</span></span></p>\n" +
            "<pre class=\"result notranslate\"><span style=\"font-size: 12pt; color: #0000ff;\">[1] 1 2 3 4 5 6\n" +
            "</span></pre>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"text-align: center;\"><span style=\"font-size: 12pt;\">%in%</span></td>\n" +
            "<td><span style=\"font-size: 12pt;\">This operator is used to identify if an element belongs to a vector.</span></td>\n" +
            "<td>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\"><span class=\"pln\">r1 </span><span class=\"pun\">&lt;-</span> 5<span class=\"pln\">\n" +
            "r2 </span><span class=\"pun\">&lt;-</span> 20<span class=\"pln\">\n" +
            "t </span><span class=\"pun\">&lt;-</span> <span class=\"lit\">1</span><span class=\"pun\">:</span><span class=\"lit\">15</span>\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">v1 </span><span class=\"pun\">%</span><span class=\"kwd\">in</span><span class=\"pun\">%</span><span class=\"pln\"> t</span><span class=\"pun\">)</span> \n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">v2 </span><span class=\"pun\">%</span><span class=\"kwd\">in</span><span class=\"pun\">%</span><span class=\"pln\"> t</span><span class=\"pun\">)</span> </span></pre>\n" +
            "<p><span style=\"font-size: 12pt; color: #0000ff;\">&nbsp;result &minus;</span></p>\n" +
            "<pre class=\"result notranslate\"><span style=\"font-size: 12pt; color: #0000ff;\">[1] TRUE\n" +
            "[1] FALSE\n" +
            "</span></pre>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td style=\"text-align: center;\"><span style=\"font-size: 12pt;\">%*%</span></td>\n" +
            "<td style=\"text-align: left;\"><span style=\"font-size: 12pt;\">This operator is used to multiply a matrix with its transpose.</span></td>\n" +
            "<td>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\"><span class=\"pln\">M </span><span class=\"pun\">=</span><span class=\"pln\"> matrix</span><span class=\"pun\">(</span><span class=\"pln\"> c</span><span class=\"pun\">(</span><span class=\"lit\">2</span><span class=\"pun\">,</span><span class=\"lit\">6</span><span class=\"pun\">,</span><span class=\"lit\">5</span><span class=\"pun\">,</span><span class=\"lit\">1</span><span class=\"pun\">,</span><span class=\"lit\">10</span><span class=\"pun\">,</span><span class=\"lit\">4</span><span class=\"pun\">),</span><span class=\"pln\"> nrow </span><span class=\"pun\">=</span> <span class=\"lit\">2</span><span class=\"pun\">,</span><span class=\"pln\">ncol </span><span class=\"pun\">=</span> <span class=\"lit\">3</span><span class=\"pun\">,<br /></span><span class=\"pln\">byrow </span><span class=\"pun\">=</span><span class=\"pln\"> TRUE</span><span class=\"pun\">)</span><span class=\"pln\">\n" +
            "t </span><span class=\"pun\">=</span><span class=\"pln\"> M </span><span class=\"pun\">%*%</span><span class=\"pln\"> t</span><span class=\"pun\">(</span><span class=\"pln\">M</span><span class=\"pun\">)</span>\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">t</span><span class=\"pun\">)</span></span></pre>\n" +
            "<p><span style=\"font-size: 12pt; color: #0000ff;\">&nbsp;result &minus;</span></p>\n" +
            "<pre class=\"result notranslate\"><span style=\"font-size: 12pt; color: #0000ff;\">      [,1] [,2]\n" +
            "[1,]   65   82\n" +
            "[2,]   82  117</span></pre>\n" +
            "</td>\n" +
            "</tr>\n" +
            "</tbody>\n" +
            "</table>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span class=\"pun\" style=\"font-size: 12pt;\"><br /><span style=\"font-family: verdana, geneva;\">6. <span style=\"color: #0000ff;\"><strong>Infix Operator</strong></span></span><br /></span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">Most of the&nbsp;operators&nbsp;that we use in R are binary operators (having two operands). Hence, they are infix operators, used between the operands.</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">For example, the expression&nbsp;<code>a*b</code>&nbsp;is actually calling the function&nbsp;<code>`*`()</code>&nbsp;with the arguments&nbsp;<code>a</code>&nbsp;and&nbsp;<code>b</code>, as&nbsp;<code>`*`(a, b)</code>.</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><strong>Note:</strong>&nbsp;the back tick (<code>`</code>), this is important as the function name contains special symbols.</span></p>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span class=\"pun\" style=\"font-size: 12pt; font-family: verdana, geneva;\"><strong>Example-1:</strong><br /></span></pre>\n" +
            "<pre><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><code><span style=\"color: #008000;\">&gt; 5+3</span>\n" +
            "<span style=\"color: #0000ff;\">[1] 8</span><br />\n" +
            "<span style=\"color: #008000;\">&gt; `+`(5,3)</span>\n" +
            "<span style=\"color: #0000ff;\">[1] 8</span><br />\n" +
            "<span style=\"color: #008000;\">&gt; 5-3</span>\n" +
            "<span style=\"color: #0000ff;\">[1] 2</span><br />\n" +
            "<span style=\"color: #008000;\">&gt; `-`(5,3)</span>\n" +
            "<span style=\"color: #0000ff;\">[1] 2</span><br />\n" +
            "<span style=\"color: #008000;\">&gt; 5*3-1</span>\n" +
            "<span style=\"color: #0000ff;\">[1] 14<br /></span>\n" +
            "<span style=\"color: #008000;\">&gt; `-`(`*`(5,3),1)</span>\n" +
            "<span style=\"color: #0000ff;\">[1] 14<br /><br /></span></code></span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">It is possible to create user-defined infix operators in R. This is done by naming a function that starts and ends with&nbsp;<code>%</code>.</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">Following is an example of user-defined infix operator to see if a number is exactly divisible by another.</span></p>\n" +
            "<h2 style=\"text-align: justify;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><strong>Example-2:</strong> User defined infix operator</span></h2>\n" +
            "<pre><span style=\"font-size: 12pt; font-family: verdana, geneva; color: #008000;\"><code>`%divisible%` &lt;- function(x,y)\n" +
            "{\n" +
            "if (x%%y ==0) return (TRUE)\n" +
            "else          return (FALSE)\n" +
            "}\n" +
            "</code></span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">This function can be used as infix operator&nbsp;<code>a %divisible% b</code>&nbsp;or as a function call&nbsp;<span style=\"color: #0000ff;\"><code>`%divisible%`(a, b)</code></span>. Both are the same.</span></p>\n" +
            "<pre><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><code><span style=\"color: #008000;\">&gt; 10 %divisible% 3</span>\n" +
            "<span style=\"color: #0000ff;\">[1] FALSE</span><br />\n" +
            "<span style=\"color: #008000;\">&gt; 10 %divisible% 2</span>\n" +
            "<span style=\"color: #0000ff;\">[1] TRUE</span><br />\n" +
            "<span style=\"color: #008000;\">&gt; `%divisible%`(10,5)</span>\n" +
            "<span style=\"color: #0000ff;\">[1] TRUE\n" +
            "</span></code></span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">Things to remember while defining your own infix operators are that they must start and end with&nbsp;<code>%</code>. Surround it with back tick (<code>`</code>) in the function definition and escape any special symbols.</span></p>\n" +
            "<h2 style=\"text-align: justify;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">Predefined infix operators in R</span></h2>\n" +
            "<table style=\"height: 120px; border-style: solid; border-color: #000000; margin-left: auto; margin-right: auto;\" border=\"1\">\n" +
            "<tbody>\n" +
            "<tr style=\"height: 20px;\">\n" +
            "<td style=\"height: 20px;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">%%</span></td>\n" +
            "<td style=\"height: 20px;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">Remainder operator</span></td>\n" +
            "</tr>\n" +
            "<tr style=\"height: 20px;\">\n" +
            "<td style=\"height: 20px;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">%/%</span></td>\n" +
            "<td style=\"height: 20px;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">Integer division</span></td>\n" +
            "</tr>\n" +
            "<tr style=\"height: 20px;\">\n" +
            "<td style=\"height: 20px;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">%*%</span></td>\n" +
            "<td style=\"height: 20px;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">Matrix multiplication</span></td>\n" +
            "</tr>\n" +
            "<tr style=\"height: 20px;\">\n" +
            "<td style=\"height: 20px;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">%o%</span></td>\n" +
            "<td style=\"height: 20px;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">Outer product</span></td>\n" +
            "</tr>\n" +
            "<tr style=\"height: 20px;\">\n" +
            "<td style=\"height: 20px;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">%x%</span></td>\n" +
            "<td style=\"height: 20px;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">Kronecker product</span></td>\n" +
            "</tr>\n" +
            "<tr style=\"height: 20px;\">\n" +
            "<td style=\"height: 20px;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">%in%</span></td>\n" +
            "<td style=\"height: 20px;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">Matching operator</span></td>\n" +
            "</tr>\n" +
            "</tbody>\n" +
            "</table>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span class=\"pun\" style=\"font-size: 12pt; font-family: verdana, geneva;\">&nbsp;</span></pre>\n" +
            "<pre class=\"result notranslate\"><br /><br /><br /></pre>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\">&nbsp;</pre>\n" +
            "\n";


    public static final String rlanguage8="";


    public static final String rlanguage9="<h1 style=\"text-align: center;\"><span style=\"color: #0000ff;\"><strong><span style=\"font-size: 14pt;\">R <span style=\"color: #008000;\">Vector</span></span></strong></span></h1>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">Vector is a basic data structure in R. It contains element of the same type. The data types can be logical, integer, double, character, complex or raw.</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">There are six types of atomic vectors. They are logical, integer, double, complex, character and raw which can be checked with the&nbsp;<code>typeof()</code>&nbsp;function.</span></p>\n" +
            "<h2 style=\"text-align: center;\"><strong><span style=\"font-size: 13pt;\"><span style=\"color: #008000;\">Create Vector in</span> <span style=\"color: #0000ff;\">R</span></span></strong></h2>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">If we want to create a vector of consecutive numbers, the&nbsp;<span style=\"color: #0000ff;\"><strong><code>:</code>&nbsp;operator</strong></span> is very helpful.</span></p>\n" +
            "<h4 style=\"text-align: justify;\"><span style=\"font-size: 12pt;\"><strong>Example 1</strong>: Creating a vector using<span style=\"color: #0000ff;\"> : operator</span></span></h4>\n" +
            "<pre><span style=\"font-size: 12pt;\"><code><span style=\"color: #008000;\">&gt; x &lt;- 1:5; </span><br /><span style=\"color: #008000;\">&gt; x</span><br /><span style=\"color: #0000ff;\">Output:-\n" +
            "[1] 1 2 3 4 5</span><br />\n" +
            "<span style=\"color: #008000;\">&gt; y &lt;- 2:-2; </span><br /><span style=\"color: #008000;\">&gt; y</span><br /><span style=\"color: #0000ff;\">Output:-\n" +
            "[1]  2  1  0 -1 -2<br /><br /></span></code></span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">More complex sequences can be created using the&nbsp;<span style=\"color: #0000ff;\"><strong><code>seq()</code>&nbsp;function</strong></span>, like defining number of points in an interval, or the step size.</span></p>\n" +
            "<h4 style=\"text-align: justify;\"><span style=\"font-size: 12pt;\"><strong>Example 2:</strong> Creating a vector using <span style=\"color: #0000ff;\">seq() function</span></span></h4>\n" +
            "<pre><span style=\"font-size: 12pt;\"><span style=\"color: #008000;\">&gt; seq(1, 3, by=0.2)          # specify step size</span><br /><span style=\"color: #0000ff;\"><code>Output:-</code> [1] 1.0 1.2 1.4 1.6 1.8 2.0 2.2 2.4 2.6 2.8 3.0</span><br /><span style=\"color: #008000;\">&gt; seq(1, 5, length.out=4) # specify length of the vector</span><br /><span style=\"color: #0000ff;\"><code>Output:-</code> [1] 1.000000 2.333333 3.666667 5.000000</span></span><br /><br /></pre>\n" +
            "<h4 style=\"text-align: justify;\"><span style=\"font-size: 12pt;\"><strong>Example 3:</strong>&nbsp;<strong>Using the <span style=\"color: #0000ff;\">c() function</span></strong></span></h4>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">The non-character values are coerced to character type if one of the elements is a character.</span></p>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\"><span class=\"com\"># The logical and numeric values are converted to characters.</span><span class=\"pln\">\n" +
            "s </span><span class=\"pun\">&lt;-</span><span class=\"pln\"> c</span><span class=\"pun\">(</span><span class=\"str\">'apple'</span><span class=\"pun\">,</span><span class=\"str\">'red'</span><span class=\"pun\">,</span><span class=\"lit\">5</span><span class=\"pun\">,</span><span class=\"pln\">TRUE</span><span class=\"pun\">)</span>\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">s</span><span class=\"pun\">)</span></span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #0000ff;\"><code>Output:-</code></span></p>\n" +
            "<pre class=\"result notranslate\"><span style=\"font-size: 12pt;\"><span style=\"color: #0000ff;\">[1] \"apple\" \"red\"   \"5\"     \"TRUE\"</span> </span><br /><br /></pre>\n" +
            "<h2 style=\"text-align: center;\"><span style=\"font-size: 13pt; color: #0000ff;\"><strong>Accessing Vector Elements</strong></span></h2>\n" +
            "<h4 style=\"text-align: justify;\"><span style=\"font-size: 12pt;\"><strong>Example 1:</strong></span><span style=\"font-size: 12pt;\">&nbsp;Using vector indexing,&nbsp;<span style=\"color: #0000ff;\"><strong>[ ] brackets</strong></span>&nbsp;are used for indexing.</span></h4>\n" +
            "<pre><span style=\"font-size: 12pt;\"><code><span style=\"color: #008000;\">&gt; x &lt;- c(0,2,4,6,8,10)</span><br /><br /><span style=\"color: #0000ff;\">Output:-\n" +
            "[1]  0  2  4  6  8 10</span></code></span><br /><br /></pre>\n" +
            "<pre><span style=\"font-size: 12pt;\"><code><span style=\"color: #008000;\">&gt; x[c(2, 4)]     # access 2nd and 4th element</span><br /><br /><span style=\"color: #0000ff;\">Output:-\n" +
            "[1] 2 6</span><br /><span style=\"color: #008000;\">\n" +
            "&gt; x[-1]          # access all but 1st element</span><br /><br /><span style=\"color: #0000ff;\">Output:-\n" +
            "[1]  2  4  6  8 10</span></code></span><br /><br /></pre>\n" +
            "<pre><span style=\"font-size: 12pt;\"><code><span style=\"color: #008000;\">&gt; x[c(2.4, 3.54)]    # real numbers are truncated to integers</span><br /><br /><span style=\"color: #0000ff;\">Output:-\n" +
            "[1] 2 4</span></code></span><br /><br /></pre>\n" +
            "<h4 style=\"text-align: justify;\"><span style=\"font-size: 12pt;\"><strong>Example 2:&nbsp;</strong>Using Logical vector as index</span></h4>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\"><span class=\"pln\">&gt; t </span><span class=\"pun\">&lt;-</span><span class=\"pln\"> c</span><span class=\"pun\">(</span><span class=\"str\">\"Sun\"</span><span class=\"pun\">,</span><span class=\"str\">\"Mon\"</span><span class=\"pun\">,</span><span class=\"str\">\"Tue\"</span><span class=\"pun\">,</span><span class=\"str\">\"Wed\"</span><span class=\"pun\">,</span><span class=\"str\">\"Thurs\"</span><span class=\"pun\">,</span><span class=\"str\">\"Fri\"</span><span class=\"pun\">,</span><span class=\"str\">\"Sat\"</span><span class=\"pun\">)<br /></span></span></pre>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt;\"><span style=\"color: #008000;\"><span class=\"pln\">&gt; v </span><span class=\"pun\">&lt;-</span><span class=\"pln\"> t</span><span class=\"pun\">[</span><span class=\"pln\">c</span><span class=\"pun\">(</span><span class=\"pln\">TRUE</span><span class=\"pun\">,</span><span class=\"pln\">FALSE</span><span class=\"pun\">,</span><span class=\"pln\">FALSE</span><span class=\"pun\">,</span><span class=\"pln\">FALSE</span><span class=\"pun\">,</span><span class=\"pln\">FALSE</span><span class=\"pun\">,</span><span class=\"pln\">TRUE</span><span class=\"pun\">,</span><span class=\"pln\">FALSE</span><span class=\"pun\">)]</span>\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">v</span></span><span class=\"pun\"><span style=\"color: #008000;\">)</span><br /><br /><span style=\"color: #0000ff;\"><code>Output:-<br /></code></span></span></span><span style=\"color: #0000ff;\">[1] \"Sun\" \"Fri\"</span></pre>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\"><span class=\"com\"><br /># Accessing vector elements using 0/1 indexing.</span><span class=\"pln\">\n" +
            "&gt; y </span><span class=\"pun\">&lt;-</span><span class=\"pln\"> t</span><span class=\"pun\">[</span><span class=\"pln\">c</span><span class=\"pun\">(</span><span class=\"lit\">0</span><span class=\"pun\">,</span><span class=\"lit\">0</span><span class=\"pun\">,</span><span class=\"lit\">0</span><span class=\"pun\">,</span><span class=\"lit\">0</span><span class=\"pun\">,</span><span class=\"lit\">0</span><span class=\"pun\">,</span><span class=\"lit\">0</span><span class=\"pun\">,</span><span class=\"lit\">1</span><span class=\"pun\">)]</span>\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">y</span><span class=\"pun\">)<br /><br /><span style=\"font-size: 12pt; color: #0000ff;\"><code>Output:-<br /></code></span></span></span><span style=\"color: #0000ff;\">[1] \"Sun\"</span></pre>\n" +
            "<h2 style=\"text-align: center;\"><span style=\"font-size: 13pt; color: #0000ff;\"><strong>Modify a vector in R</strong></span></h2>\n" +
            "<pre><span style=\"font-size: 12pt;\"><code><span style=\"color: #008000;\">&gt; x &lt;- c(-3,-2,-1,0,1,2)</span><br /><br /><span style=\"color: #0000ff;\">Output:-\n" +
            "[1] -3 -2 -1  0  1  2</span></code></span></pre>\n" +
            "<pre><span style=\"font-size: 12pt;\"><code><span style=\"color: #008000;\">&gt; x[x&lt;0] &lt;- 5; <br />&gt; x   # modify elements less than 0</span><br /><br /><span style=\"color: #0000ff;\">Output:-\n" +
            "[1] 5 0 5 0 1 2</span></code></span></pre>\n" +
            "<h2 style=\"text-align: center;\"><span style=\"color: #0000ff; font-size: 13pt;\"><strong>Deleting Vector</strong></span></h2>\n" +
            "<pre><span style=\"font-size: 12pt;\"><code><span style=\"color: #008000;\">&gt; x &lt;- c(-3,-2,-1,0,1,2)</span><br /><br /><span style=\"color: #0000ff;\">Output:-\n" +
            "[1] -3 -2 -1  0  1  2</span><br /><br />\n" +
            "<span style=\"color: #008000;\">&gt; x &lt;- NULL\n" +
            "&gt; x</span><br /><br /><span style=\"color: #0000ff;\">Output:-\n" +
            "NULL</span></code></span><br /><br /></pre>\n" +
            "<h3 style=\"text-align: center;\"><span style=\"font-size: 13pt; color: #008000;\"><span style=\"color: #0000ff;\">Sorting&nbsp;Vector Element</span>&nbsp;</span></h3>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">Elements in a vector can be sorted using the&nbsp;<span style=\"color: #0000ff;\"><strong>sort()</strong></span>&nbsp;function.</span></p>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt;\"><span style=\"color: #008000;\"><span class=\"pln\">&gt; v </span><span class=\"pun\">&lt;-</span><span class=\"pln\"> c</span><span class=\"pun\">(</span><span class=\"lit\">3</span><span class=\"pun\">,</span><span class=\"lit\">8</span><span class=\"pun\">,</span><span class=\"lit\">4</span><span class=\"pun\">,</span><span class=\"lit\">5</span><span class=\"pun\">,</span><span class=\"lit\">0</span><span class=\"pun\">,</span><span class=\"lit\">11</span><span class=\"pun\">,</span> <span class=\"pun\">-</span><span class=\"lit\">9</span><span class=\"pun\">,</span> <span class=\"lit\">304</span><span class=\"pun\">)</span>\n" +
            "\n" +
            "<span class=\"com\">&gt; # Sort the elements of the vector.</span><span class=\"pln\">\n" +
            "&gt; sort</span><span class=\"pun\">.</span><span class=\"pln\">result </span><span class=\"pun\">&lt;-</span><span class=\"pln\"> sort</span><span class=\"pun\">(</span><span class=\"pln\">v</span><span class=\"pun\">)</span>\n" +
            "<span class=\"kwd\">&gt; print</span><span class=\"pun\">(</span><span class=\"pln\">sort</span><span class=\"pun\">.</span><span class=\"pln\">result</span><span class=\"pun\">)</span>\n" +
            "<br /><span style=\"color: #0000ff;\">Output:-</span><br /><span style=\"color: #0000ff;\">[1] -9 0 3 4 5 8 11 304</span>\n" +
            "<br /><span class=\"com\">&gt; # Sort the elements in the reverse order.</span><span class=\"pln\">\n" +
            "&gt; revsort</span><span class=\"pun\">.</span><span class=\"pln\">result </span><span class=\"pun\">&lt;-</span><span class=\"pln\"> sort</span><span class=\"pun\">(</span><span class=\"pln\">v</span><span class=\"pun\">,</span><span class=\"pln\"> decreasing </span><span class=\"pun\">=</span><span class=\"pln\"> TRUE</span><span class=\"pun\">)</span>\n" +
            "<span class=\"kwd\">&gt; print</span><span class=\"pun\">(</span><span class=\"pln\">revsort</span><span class=\"pun\">.</span><span class=\"pln\">result</span></span><span class=\"pun\"><span style=\"color: #008000;\">)</span><br /><br /><span style=\"color: #0000ff;\">Output:-</span></span></span><span style=\"font-size: 12pt; color: #0000ff;\">\n" +
            "[1] 304  11   8   5   4   3   0  -9</span></pre>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\">&nbsp;</pre>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\">&nbsp;</pre>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\">&nbsp;</pre>\n" +
            "\n" +
            "\n";


    public static final String rlanguage10="\n" +
            "<h1 style=\"text-align: center;\"><span style=\"color: #0000ff;\"><strong><span style=\"font-size: 14pt;\">R - <span style=\"color: #008000;\">Arrays</span></span></strong></span></h1>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">Arrays are the R data objects which can store data in more than two dimensions. </span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">For example &minus; If we create an array of dimension (4, 6, 5) then it creates 5 rectangular matrices each with 4 rows and 6 columns.</span></p>\n" +
            "<h2 style=\"text-align: justify;\"><span style=\"font-size: 13pt;\"><strong>Example</strong></span></h2>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">The following example creates an array of two 3x3 matrices each with 3 rows and 3 columns:</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\"># Create two vectors of different lengths.</span><br /><span style=\"font-size: 12pt; color: #008000;\">v1 &lt;- c(8,6,3)</span><br /><span style=\"font-size: 12pt; color: #008000;\">v2 &lt;- c(5,11,16,12,14,11)</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\"># Take these vectors as input to the array.</span><br /><span style=\"font-size: 12pt; color: #008000;\">output &lt;- array(c(v1,v2),dim = c(3,3,2))</span><br /><span style=\"font-size: 12pt; color: #008000;\">print(output)</span></p>\n" +
            "<p style=\"text-align: justify;\">&nbsp;</p>\n" +
            "<p style=\"text-align: justify;\"><strong><span style=\"color: #0000ff;\">Output:-</span></strong></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\">, , 1\n" +
            "\n" +
            "     [,1] [,2] [,3]\n" +
            "[1,]    8    5   12\n" +
            "[2,]    6   11   14\n" +
            "[3,]    3   16   11\n" +
            "\n" +
            ", , 2\n" +
            "\n" +
            "     [,1] [,2] [,3]\n" +
            "[1,]    8    5   12\n" +
            "[2,]    6   11   14\n" +
            "[3,]    3   16   11</span><br /><br /></pre>\n" +
            "<h2 style=\"text-align: center;\"><span style=\"font-size: 13pt; color: #0000ff;\"><strong>Naming Columns and Rows</strong></span></h2>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">using the&nbsp;<span style=\"color: #0000ff;\"><strong>dimnames</strong></span>&nbsp;parameter we can give names to the rows, columns and matrices in the array:</span></p>\n" +
            "<p style=\"text-align: left;\"><span style=\"font-size: 12pt; color: #008080;\"># Create two vectors of different lengths.</span><br /><span style=\"font-size: 12pt; color: #008080;\">v1 &lt;- c(8,6,3)</span><br /><span style=\"font-size: 12pt; color: #008080;\">v2 &lt;- c(5,11,16,12,14,11)</span></p>\n" +
            "<p style=\"text-align: left;\"><span style=\"font-size: 12pt; color: #008080;\">column.names &lt;- c(\"COL1\",\"COL2\",\"COL3\")</span><br /><span style=\"font-size: 12pt; color: #008080;\">row.names &lt;- c(\"ROW1\",\"ROW2\",\"ROW3\")</span><br /><span style=\"font-size: 12pt; color: #008080;\">matrix.names &lt;- c(\"Matrix1\")</span><br /><span style=\"font-size: 12pt; color: #008080;\"># Take these vectors as input to the array.</span><br /><span style=\"font-size: 12pt; color: #008080;\">output&lt;- array(c(v1,v2), dim = c(3,3,1),dimnames=list(row.names,column.names, matrix.names))</span><br /><span style=\"font-size: 12pt; color: #008080;\">print(output)</span></p>\n" +
            "<pre><span style=\"font-size: 12pt;\"><br /><strong><span style=\"color: #0000ff;\">Output:-</span></strong><br /><span style=\"color: #0000ff;\">, , Matrix1\n" +
            "\n" +
            "     COL1 COL2 COL3\n" +
            "ROW1    8    5   12\n" +
            "ROW2    6   11   14\n" +
            "ROW3    3   16   11</span></span><br /><br /><br /></pre>\n" +
            "<h2 style=\"text-align: center;\"><span style=\"font-size: 13pt; color: #0000ff;\"><strong>Accessing Array Elements</strong></span></h2>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\"># Print the third row of the second matrix of the array.</span><br /><span style=\"font-size: 12pt; color: #008000;\">print(output[3,,])</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #0000ff;\">Output:-</span></p>\n" +
            "<pre><span style=\"font-size: 12pt;\"><span style=\"color: #0000ff;\">COL1 COL2 COL3 \n" +
            "   3   16   11</span> \n" +
            "</span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\"># Print the element in the 1st row and 3rd column of the 1st matrix.</span><br /><span style=\"font-size: 12pt; color: #008000;\">print(output[2])</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\">Output:-</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\">[1] 6</span></p>\n" +
            "\n";


    public static final String rlanguage11="\n" +
            "<h1 style=\"text-align: center;\"><span style=\"font-size: 14pt; color: #008000;\"><strong><span style=\"color: #0000ff;\">R -</span> Lists</strong></span></h1>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">List is a data structure having components of mixed data types.&nbsp;A&nbsp;vector&nbsp;having all elements of the same type is called atomic vector but a vector having elements of different type is called list.&nbsp;List is created using&nbsp;<span style=\"color: #0000ff;\"><strong>list()</strong></span>&nbsp;function.</span></p>\n" +
            "<p style=\"text-align: justify;\">&nbsp;</p>\n" +
            "<h2 style=\"text-align: center;\"><span style=\"font-size: 13pt; color: #0000ff;\"><strong>Creating a List</strong></span></h2>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">List can be created using the&nbsp;<span style=\"color: #0000ff;\"><code>list()</code></span>&nbsp;function:</span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #008000;\"><code>&gt; x &lt;- list(\"a\" = 2.5, \"b\" = TRUE, \"c\" = 1:3)\n" +
            "</code></span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">Here, we create a list&nbsp;<code>x</code>, of three components with data types&nbsp;<code>double</code>,&nbsp;<code>logical</code>&nbsp;and&nbsp;<code>integer</code>&nbsp;vector respectively.</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">Its structure can be examined with the&nbsp;<span style=\"color: #0000ff;\"><code>str()</code></span>&nbsp;function.</span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #008000;\"><code>&gt; str(x)<br /><br /><span style=\"color: #0000ff;\"><span style=\"font-family: verdana, geneva;\"><strong>Output:-</strong></span>\n" +
            "List of 3\n" +
            "$ a: num 2.5\n" +
            "$ b: logi TRUE\n" +
            "$ c: int [1:3] 1 2 3\n" +
            "</span></code></span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">In this example,&nbsp;<code>a</code>,&nbsp;<code>b</code>&nbsp;and&nbsp;<code>c</code>&nbsp;are called tags which makes it easier to reference the components of the list.</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">However, tags are optional. We can create the same list without the tags as follows:</span></p>\n" +
            "<pre><span style=\"font-size: 12pt;\"><code><span style=\"color: #008000;\">&gt; x &lt;- list(2.5,TRUE,1:3)\n" +
            "&gt; x</span><br /><br /><span style=\"color: #0000ff;\"><span style=\"font-family: verdana, geneva;\"><strong>Output:-</strong></span>\n" +
            "[[1]]\n" +
            "[1] 2.5\n" +
            "[[2]]\n" +
            "[1] TRUE\n" +
            "[[3]]\n" +
            "[1] 1 2 3</span></code></span><br /><br /><br /></pre>\n" +
            "<h2 style=\"text-align: center;\"><span style=\"font-size: 13pt; color: #0000ff;\"><strong>Naming List Elements</strong></span></h2>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\"><span class=\"com\"># Create a list containing a vector, a matrix and a list.</span><span class=\"pln\">\n" +
            "&gt; list_data </span><span class=\"pun\">&lt;-</span><span class=\"pln\"> list</span><span class=\"pun\">(</span><span class=\"pln\">c</span><span class=\"pun\">(</span><span class=\"str\">\"Jan\"</span><span class=\"pun\">,</span><span class=\"str\">\"Feb\"</span><span class=\"pun\">,</span><span class=\"str\">\"Mar\"</span><span class=\"pun\">),</span><span class=\"pln\"> matrix</span><span class=\"pun\">(</span><span class=\"pln\">c</span><span class=\"pun\">(</span><span class=\"lit\">3</span><span class=\"pun\">,</span><span class=\"lit\">9</span><span class=\"pun\">,</span><span class=\"lit\">5</span><span class=\"pun\">,</span><span class=\"lit\">1</span><span class=\"pun\">,-</span><span class=\"lit\">2</span><span class=\"pun\">,</span><span class=\"lit\">8</span><span class=\"pun\">),</span><span class=\"pln\"> nrow </span><span class=\"pun\">=</span> <span class=\"lit\">2</span><span class=\"pun\">),</span><span class=\"pln\">\n" +
            "   list</span><span class=\"pun\">(</span><span class=\"str\">\"green\"</span><span class=\"pun\">,</span><span class=\"lit\">12.3</span><span class=\"pun\">))</span>\n" +
            "\n" +
            "<span class=\"com\"># Give names to the elements in the list.</span><span class=\"pln\">\n" +
            "&gt; names</span><span class=\"pun\">(</span><span class=\"pln\">list_data</span><span class=\"pun\">)</span> <span class=\"pun\">&lt;-</span><span class=\"pln\"> c</span><span class=\"pun\">(</span><span class=\"str\">\"1st Quarter\"</span><span class=\"pun\">,</span> <span class=\"str\">\"A_Matrix\"</span><span class=\"pun\">,</span> <span class=\"str\">\"A Inner list\"</span><span class=\"pun\">)</span>\n" +
            "\n" +
            "<span class=\"com\"># Show the list.</span>\n" +
            "<span class=\"kwd\">&gt; print</span><span class=\"pun\">(</span><span class=\"pln\">list_data</span><span class=\"pun\">)</span></span></pre>\n" +
            "<p style=\"text-align: justify;\">&nbsp;</p>\n" +
            "<p style=\"text-align: justify;\"><strong><span style=\"font-size: 12pt; color: #0000ff;\">Output:-</span></strong></p>\n" +
            "<pre class=\"result notranslate\"><span style=\"font-size: 12pt; color: #0000ff;\">$`1st_Quarter`\n" +
            "[1] \"Jan\" \"Feb\" \"Mar\"\n" +
            "\n" +
            "$A_Matrix\n" +
            "     [,1] [,2] [,3]\n" +
            "[1,]    3    5   -2\n" +
            "[2,]    9    1    8\n" +
            "\n" +
            "$A_Inner_list\n" +
            "$A_Inner_list[[1]]\n" +
            "[1] \"green\"\n" +
            "\n" +
            "$A_Inner_list[[2]]\n" +
            "[1] 12.3</span><br /><br /></pre>\n" +
            "<h3 style=\"text-align: center;\"><span style=\"font-size: 13pt; color: #0000ff;\"><strong>Accesing Elements of List</strong></span></h3>\n" +
            "<pre class=\"result notranslate\"><br /><span style=\"font-size: 12pt;\"><span style=\"color: #008000;\"><span class=\"pln\">&gt; ls </span><span class=\"pun\">&lt;-</span><span class=\"pln\"> list</span><span class=\"pun\">(</span><span class=\"pln\"> first</span><span class=\"pun\">=</span><span class=\"lit\">2</span><span class=\"pun\">,</span><span class=\"pln\"> second</span><span class=\"pun\">=</span><span class=\"lit\">4</span><span class=\"pun\">,</span><span class=\"pln\"> third</span><span class=\"pun\">=</span><span class=\"pln\">list</span><span class=\"pun\">(</span><span class=\"pln\">fourth</span><span class=\"pun\">=</span><span class=\"lit\">3.2</span><span class=\"pun\">,</span><span class=\"pln\"> fifth</span><span class=\"pun\">=</span><span class=\"lit\">6.4</span> <span class=\"pun\">)</span></span><span class=\"pun\"><span style=\"color: #008000;\">)</span><br /><span style=\"color: #008000;\"><span class=\"pln\">&gt; ls </span>[<span class=\"pln\">c</span>(<span class=\"str\">\"first\"</span>, <span class=\"str\">\"second\"</span>)] </span><br /><br /><br /><span style=\"font-family: verdana, geneva;\"><strong><span style=\"color: #0000ff;\">Output:-</span></strong></span><br /></span></span><span style=\"font-size: 12pt; color: #0000ff;\">$first\n" +
            "[1] 2\n" +
            "\n" +
            "$second\n" +
            "[1] 4</span></pre>\n" +
            "<h2 style=\"text-align: center;\"><span style=\"font-size: 13pt; color: #0000ff;\"><strong>Manipulating List Elements</strong></span></h2>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">You can insert, delete, update and modify list elements within a list or just at the end of any list:</span></p>\n" +
            "<p style=\"text-align: justify;\"><strong><span style=\"font-size: 12pt;\">Example:</span></strong></p>\n" +
            "<pre><span style=\"font-size: 12pt;\"><code class=\"prettyprint prettyprinted\"><span style=\"color: #008000;\"><span class=\"pln\">alist</span> <span class=\"pun\">&lt;-</span><span class=\"pln\"> c </span><span class=\"pun\">(</span><span class=\"str\">\"Ray\"</span><span class=\"pun\">,</span> <span class=\"str\">\"Karl\"</span><span class=\"pun\">,</span> <span class=\"str\">\"Steve\"</span><span class=\"pun\">)</span>\n" +
            "\n" +
            "<span class=\"com\"># Now you will add element at the end of the list</span><span class=\"pln\">\n" +
            "\n" +
            "alist</span><span class=\"pun\">[</span><span class=\"lit\">4</span><span class=\"pun\">]</span> <span class=\"pun\">&lt;-</span> <span class=\"str\">\"Mark\"</span>\n" +
            "\n" +
            "<span class=\"kwd\">print</span> <span class=\"pun\">(</span><span class=\"pln\">alist</span><span class=\"pun\">[</span><span class=\"lit\">4</span><span class=\"pun\">])</span><span class=\"pln\"><br />\n" +
            "\n" +
            "</span><span class=\"com\"># Now you will remove the last element from the list</span><span class=\"pln\">\n" +
            "\n" +
            "alist</span><span class=\"pun\">[</span><span class=\"lit\">4</span><span class=\"pun\">]</span> <span class=\"pun\">&lt;-</span><span class=\"pln\"> NULL\n" +
            "\n" +
            "&nbsp;\n" +
            "\n" +
            "</span><span class=\"com\"># Now you will update the 2</span><sup><span class=\"com\">nd</span></sup><span class=\"com\"> Element</span><span class=\"pln\">\n" +
            "\n" +
            "alist </span><span class=\"pun\">[</span><span class=\"lit\">2</span><span class=\"pun\">]</span> <span class=\"pun\">&lt;-</span> <span class=\"str\">\"Karlos\"</span>\n" +
            "\n" +
            "<span class=\"kwd\">print</span> <span class=\"pun\">(</span><span class=\"pln\">alist</span><span class=\"pun\">[</span><span class=\"lit\">2</span><span class=\"pun\">])</span></span></code></span><br /><br /><br /></pre>\n" +
            "<h2 style=\"text-align: center;\"><span style=\"font-size: 12pt; color: #0000ff;\">Converting List to Vector</span></h2>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">A list can be converted to a vector so that the elements of the vector can be used for further manipulation. To do this conversion, we use the&nbsp;<span style=\"color: #0000ff;\"><strong>unlist()</strong></span>&nbsp;function. It takes the list as input and produces a vector.</span></p>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-size: 12pt; color: #008000;\"><span class=\"com\"># Create lists</span><span class=\"pln\">\n" +
            "list1 </span><span class=\"pun\">&lt;-</span><span class=\"pln\"> list</span><span class=\"pun\">(</span><span class=\"lit\">1</span><span class=\"pun\">:</span><span class=\"lit\">5</span><span class=\"pun\">)</span>\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">list1</span><span class=\"pun\">)</span><span class=\"pln\">\n" +
            "\n" +
            "list2 </span><span class=\"pun\">&lt;-</span><span class=\"pln\">list</span><span class=\"pun\">(</span><span class=\"lit\">10</span><span class=\"pun\">:</span><span class=\"lit\">14</span><span class=\"pun\">)</span>\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">list2</span><span class=\"pun\">)</span>\n" +
            "\n" +
            "<span class=\"com\"># Convert the lists to vectors.</span><span class=\"pln\">\n" +
            "v1 </span><span class=\"pun\">&lt;-</span><span class=\"pln\"> unlist</span><span class=\"pun\">(</span><span class=\"pln\">list1</span><span class=\"pun\">)</span><span class=\"pln\">\n" +
            "v2 </span><span class=\"pun\">&lt;-</span><span class=\"pln\"> unlist</span><span class=\"pun\">(</span><span class=\"pln\">list2</span><span class=\"pun\">)</span>\n" +
            "\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">v1</span><span class=\"pun\">)</span>\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">v2</span><span class=\"pun\">)</span>\n" +
            "\n" +
            "<span class=\"com\"># Now add the vectors</span><span class=\"pln\">\n" +
            "result </span><span class=\"pun\">&lt;-</span><span class=\"pln\"> v1</span><span class=\"pun\">+</span><span class=\"pln\">v2\n" +
            "</span><span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">result</span><span class=\"pun\">)</span></span></pre>\n" +
            "<p style=\"text-align: justify;\">&nbsp;</p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"color: #0000ff;\"><strong><span style=\"font-size: 12pt;\">Output:-</span></strong></span></p>\n" +
            "<pre class=\"result notranslate\"><span style=\"font-size: 12pt; color: #0000ff;\">[[1]]\n" +
            "[1] 1 2 3 4 5\n" +
            "\n" +
            "[[1]]\n" +
            "[1] 10 11 12 13 14\n" +
            "\n" +
            "[1] 1 2 3 4 5\n" +
            "[1] 10 11 12 13 14<br />\n" +
            "[1] 11 13 15 17 19</span></pre>\n";


    public static final String rlanguage12="<div style=\"text-align: justify;\">\n" +
            "<h1 style=\"text-align: center;\"><span style=\"font-size: 14pt; color: #0000ff; font-family: verdana, geneva;\"><strong>R - <span style=\"color: #008000;\">Matrices</span></strong></span></h1>\n" +
            "<p><span style=\"font-size: 12pt; font-family: verdana, geneva;\">Matrix is a two dimensional data structure in R programming.</span></p>\n" +
            "<p><span style=\"font-size: 12pt; font-family: verdana, geneva;\">A Matrix is created using the&nbsp;<span style=\"color: #0000ff;\"><strong>matrix()</strong></span>&nbsp;function.</span></p>\n" +
            "<h2><span style=\"font-family: verdana, geneva;\"><strong><span style=\"font-size: 12pt;\">Syntax</span></strong></span></h2>\n" +
            "<p><span style=\"font-size: 12pt; font-family: verdana, geneva;\">The basic syntax for creating a matrix in R is &minus;</span></p>\n" +
            "<pre class=\"result notranslate\"><span style=\"font-size: 12pt; color: #0000ff; font-family: verdana, geneva;\">matrix(data, nrow, ncol, byrow, dimnames)\n" +
            "</span></pre>\n" +
            "<p><span style=\"font-size: 12pt; font-family: verdana, geneva;\">Following is the description of the parameters used &minus;</span></p>\n" +
            "<ul class=\"list\">\n" +
            "<li>\n" +
            "<p><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><strong>data</strong>&nbsp;is the input vector which becomes the data elements of the matrix.</span></p>\n" +
            "</li>\n" +
            "<li>\n" +
            "<p><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><strong>nrow</strong>&nbsp;is the number of rows to be created.</span></p>\n" +
            "</li>\n" +
            "<li>\n" +
            "<p><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><strong>ncol</strong>&nbsp;is the number of columns to be created.</span></p>\n" +
            "</li>\n" +
            "<li>\n" +
            "<p><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><strong>byrow</strong>&nbsp;is a logical clue. If TRUE then the input vector elements are arranged by row.</span></p>\n" +
            "</li>\n" +
            "<li>\n" +
            "<p><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><strong>dimname</strong>&nbsp;is the names assigned to the rows and columns.</span></p>\n" +
            "</li>\n" +
            "</ul>\n" +
            "<p>&nbsp;</p>\n" +
            "<h2><span style=\"font-size: 13pt; color: #0000ff; font-family: verdana, geneva;\"><strong>Create a Matrix</strong></span></h2>\n" +
            "<pre><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><strong>Example:</strong><code><br /></code></span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\"># Elements are arranged sequentially by column.</span><br /><span style=\"font-size: 12pt;\">&gt; matrix(1:9, nrow = 3, ncol = 3)</span></p>\n" +
            "<pre><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><code></code></span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\">Output:-</span><br /><span style=\"font-size: 12pt;\">[,1] [,2] [,3]</span><br /><span style=\"font-size: 12pt;\">[1,] 1 4 7</span><br /><span style=\"font-size: 12pt;\">[2,] 2 5 8</span><br /><span style=\"font-size: 12pt;\">[3,] 3 6 9</span></p>\n" +
            "<pre><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><code></code></span></pre>\n" +
            "<p><span style=\"font-size: 12pt;\">Example-2:</span></p>\n" +
            "<pre><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><code>&nbsp;</code></span></pre>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-family: verdana, geneva;\"><span style=\"font-size: 12pt; color: #008000;\"><span class=\"com\"># Define the column and row names.</span><span class=\"pln\">\n" +
            "&gt;&gt; rownames </span><span class=\"pun\">=</span><span class=\"pln\"> c</span><span class=\"pun\">(</span><span class=\"str\">\"row1\"</span><span class=\"pun\">,</span> <span class=\"str\">\"row2\"</span><span class=\"pun\">,</span> <span class=\"str\">\"row3\"</span><span class=\"pun\">,</span> <span class=\"str\">\"row4\"</span><span class=\"pun\">)<br /></span><span class=\"pln\">&gt;&gt;colnames </span><span class=\"pun\">=</span><span class=\"pln\"> c</span><span class=\"pun\">(</span><span class=\"str\">\"col1\"</span><span class=\"pun\">,</span> <span class=\"str\">\"col2\"</span><span class=\"pun\">,</span> <span class=\"str\">\"col3\"</span><span class=\"pun\">)</span><span class=\"pln\">\n" +
            "\n" +
            "&gt; &gt;P </span><span class=\"pun\">&lt;-</span><span class=\"pln\"> matrix</span><span class=\"pun\">(</span><span class=\"pln\">c</span><span class=\"pun\">(</span><span class=\"lit\">3</span><span class=\"pun\">:</span><span class=\"lit\">14</span><span class=\"pun\">),</span><span class=\"pln\"> nrow </span><span class=\"pun\">=</span> <span class=\"lit\">4</span><span class=\"pun\">,</span><span class=\"pln\"> byrow </span><span class=\"pun\">=</span><span class=\"pln\"> TRUE</span><span class=\"pun\">,<br /></span><span class=\"pln\"> dimnames </span><span class=\"pun\">=</span><span class=\"pln\"> list</span><span class=\"pun\">(</span><span class=\"pln\">rownames</span><span class=\"pun\">,</span><span class=\"pln\"> colnames</span><span class=\"pun\">))</span>\n" +
            "<span class=\"kwd\">print</span><span class=\"pun\">(</span><span class=\"pln\">P</span><span class=\"pun\">)<br /><br /></span></span><span class=\"pun\" style=\"font-size: 12pt;\"><span style=\"color: #0000ff;\"><strong><span style=\"font-size: 12pt;\"><code>Output:-</code></span></strong></span><br /></span></span></pre>\n" +
            "<pre class=\"result notranslate\"><span style=\"font-size: 12pt; color: #0000ff; font-family: verdana, geneva;\">     [,1] [,2] [,3]\n" +
            "[1,]    3    4    5\n" +
            "[2,]    6    7    8\n" +
            "[3,]    9   10   11\n" +
            "[4,]   12   13   14</span></pre>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span style=\"font-family: verdana, geneva;\"><span class=\"pun\" style=\"font-size: 12pt;\"><br /><span style=\"font-size: 12pt;\"><code><strong>Example-3:</strong>&nbsp;</code></span></span><span style=\"font-size: 12pt;\">Another way of creating a matrix is by using functions&nbsp;<br /><span style=\"color: #0000ff;\"><code><strong>&nbsp;            cbind()</strong></code></span>&nbsp;and&nbsp;<strong><span style=\"color: #0000ff;\"><code>rbind()</code></span></strong>&nbsp;as in column bind and row bind.</span></span></pre>\n" +
            "<pre><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><code><span style=\"color: #008000; font-family: verdana, geneva;\">&gt; cbind(c(1,2,3),c(4,5,6))</span><br /><br /><span style=\"color: #0000ff;\"><strong>Output:-</strong>\n" +
            "     [,1] [,2]\n" +
            "[1,]    1    4\n" +
            "[2,]    2    5\n" +
            "[3,]    3    6</span><br /><br /><strong>Example-4:</strong><br /><span style=\"color: #008000;\">\n" +
            "&gt; rbind(c(1,2,3),c(4,5,6))</span><br /><br /><span style=\"color: #0000ff;\"><strong>Output:-</strong>\n" +
            "     [,1] [,2] [,3]\n" +
            "[1,]    1    2    3\n" +
            "[2,]    4    5    6</span></code></span><br /><br /><br /></pre>\n" +
            "<h2><span style=\"font-size: 13pt; color: #0000ff; font-family: verdana, geneva;\"><strong>Accessing Elements of a Matrix</strong></span></h2>\n" +
            "<p><span style=\"font-size: 12pt; font-family: verdana, geneva;\">Elements can be accessed as&nbsp;<code>var[row, column]</code>. Here&nbsp;<code>rows</code>&nbsp;and&nbsp;<code>columns</code>&nbsp;are vectors.</span></p>\n" +
            "<h3><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><code><strong>Example-1:</strong>&nbsp;</code><span style=\"color: #000000;\">Using</span> logical vector as index</span></h3>\n" +
            "<pre><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><code><span style=\"color: #008000;\">&gt; x</span><br />\n" +
            "<span style=\"color: #0000ff;\">     [,1] [,2] [,3]\n" +
            "[1,]    4    8    3\n" +
            "[2,]    6    0    7\n" +
            "[3,]    1    2    9</span><br />\n" +
            "<span style=\"color: #008000;\">&gt; x[c(TRUE,FALSE,TRUE),<br />c(TRUE,TRUE,FALSE)]</span><br />\n" +
            "<span style=\"color: #0000ff;\">     [,1] [,2]\n" +
            "[1,]    4    8\n" +
            "[2,]    1    2</span><br /><br /><span style=\"color: #008000;\"># the 2 element logical vector is recycled to 3 element vector\n" +
            "&gt; x[c(TRUE,FALSE),c(2,3)]</span>    <br />\n" +
            "<span style=\"color: #0000ff;\">     [,1] [,2]\n" +
            "[1,]    8    3\n" +
            "[2,]    2    9\n" +
            "</span></code></span></pre>\n" +
            "<pre><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><code><span style=\"color: #008000;\">&gt; x[c(TRUE, FALSE)]</span><br />\n" +
            "<span style=\"color: #0000ff;\">[1] 4 1 0 3 9\n" +
            "</span></code></span></pre>\n" +
            "<p><span style=\"font-size: 12pt; font-family: verdana, geneva;\">In the above example, the matrix&nbsp;<code>x</code>&nbsp;is treated as vector formed by stacking columns of the matrix one after another, i.e.,&nbsp;<code>(4,6,1,8,0,2,3,7,9)</code>.</span></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<pre><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><code><span style=\"color: #008000;\">&gt; x[x&gt;5]    # select elements greater than 5</span><br />\n" +
            "<span style=\"color: #0000ff;\">[1] 6 8 7 9</span><br /><br />\n" +
            "<span style=\"color: #008000;\">&gt; x[x%%2 == 0]    # select even elements<br /></span>\n" +
            "<span style=\"color: #0000ff;\">[1] 4 6 8 0 2</span><br />\n" +
            "<br /></code></span><span style=\"font-size: 12pt; font-family: verdana, geneva;\">Using character vector as index</span></pre>\n" +
            "<pre><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><code><span style=\"color: #008000;\">&gt; x</span><br />\n" +
            "<span style=\"color: #0000ff;\">    A B C\n" +
            "[1,] 4 8 3\n" +
            "[2,] 6 0 7\n" +
            "[3,] 1 2 9</span><br /><br />\n" +
            "&gt; <span style=\"color: #008000;\">x[,\"A\"]</span><br />\n" +
            "<span style=\"color: #0000ff;\">[1] 4 6 1</span><br /><br />\n" +
            "<span style=\"color: #008000;\">&gt; x[TRUE,c(\"A\",\"C\")]</span><br />\n" +
            "<span style=\"color: #0000ff;\">     A C\n" +
            "[1,] 4 3\n" +
            "[2,] 6 7\n" +
            "[3,] 1 9</span><br /><br />\n" +
            "<span style=\"color: #008000;\">&gt; x[2:3,c(\"A\",\"C\")]</span><br />\n" +
            "<span style=\"color: #0000ff;\">A C\n" +
            "[1,] 6 7\n" +
            "[2,] 1 9</span></code></span></pre>\n" +
            "<h2 style=\"text-align: justify;\"><span style=\"font-size: 13pt; color: #0000ff; font-family: verdana, geneva;\"><strong>Matrix Computations</strong></span></h2>\n" +
            "<h3 style=\"text-align: justify;\"><span style=\"font-family: verdana, geneva;\"><strong><span style=\"font-size: 12pt;\">Matrix Addition &amp; Subtraction</span></strong></span></h3>\n" +
            "<p><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\"># Create two 2x3 matrices.</span><br /><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\">matrix1 &lt;- matrix(c(7, 2, -1, 7, 5, 6), nrow = 2)</span><br /><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\">matrix2 &lt;- matrix(c(1, 2, 0, 6, 7, 4), nrow = 2)</span></p>\n" +
            "<p><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\"># Add the matrices.</span><br /><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\">result &lt;- matrix1 + matrix2</span><br /><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\">cat(\"Result of addition\",\"\\n\")</span><br /><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\">print(result)</span></p>\n" +
            "<p><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\"># Subtract the matrices</span><br /><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\">result &lt;- matrix1 - matrix2</span><br /><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\">cat(\"Result of subtraction\",\"\\n\")</span><br /><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\">print(result)</span></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong><span style=\"font-size: 12pt; color: #000000; font-family: verdana, geneva;\">Output-</span></strong></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff; font-family: verdana, geneva;\">Result of addition \n" +
            "     [,1] [,2] [,3]\n" +
            "[1,]    8   -1   12\n" +
            "[2,]    4   13   10\n" +
            "Result of subtraction \n" +
            "     [,1] [,2] [,3]\n" +
            "[1,]    6   -1   -2\n" +
            "[2,]    0    1    2</span></pre>\n" +
            "<pre><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><code>&nbsp;</code></span></pre>\n" +
            "<h3><span style=\"font-size: 12pt; font-family: verdana, geneva;\">Matrix Multiplication &amp; Division</span></h3>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\"># Create two 2x3 matrices.</span><br /><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\">matrix1 &lt;- matrix(c(7, 9, -2, 7, 2, 6), nrow = 2)</span><br /><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\">print(matrix1)</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\">matrix2 &lt;- matrix(c(7, 2, 1, 9, 0, 4), nrow = 2)</span><br /><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\">print(matrix2)</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\"># Multiply the matrices.</span><br /><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\">result &lt;- matrix1 * matrix2</span><br /><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\">cat(\"Result of multiplication\",\"\\n\")</span><br /><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\">print(result)</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\"># Divide the matrices</span><br /><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\">result &lt;- matrix1 / matrix2</span><br /><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\">cat(\"Result of division\",\"\\n\")</span><br /><span style=\"font-size: 12pt; color: #008000; font-family: verdana, geneva;\">print(result)</span></p>\n" +
            "<pre><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><code><br /><span style=\"color: #0000ff;\"><strong>Output:-</strong></span></code></span></pre>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff; font-family: verdana, geneva;\">     [,1] [,2] [,3]\n" +
            "[1,]    7   -2    2\n" +
            "[2,]    9    7    6\n" +
            "     [,1] [,2] [,3]\n" +
            "[1,]    7    1    0\n" +
            "[2,]    2    9    4\n" +
            "Result of multiplication <br />\n" +
            "     [,1] [,2] [,3]\n" +
            "[1,]   49   -2    0\n" +
            "[2,]   18   63   24\n" +
            "Result of division <br />\n" +
            "     [,1]       [,2] [,3]\n" +
            "[1,]  1.0 -2.0000000  Inf\n" +
            "[2,]  4.5  0.7777778  1.5</span></pre>\n" +
            "<pre><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><code>&nbsp;</code></span></pre>\n" +
            "</div>";


    public static final String rlanguage13="\n" +
            "<h1 style=\"text-align: center;\"><span style=\"font-size: 14pt; color: #0000ff;\"><strong>R - <span style=\"color: #008000;\">Factors</span></strong></span></h1>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">Factors are the data objects which takes only predefined, finite number of values (categorical data).</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">Factors are created using the&nbsp;<span style=\"color: #0000ff;\"><strong>factor()</strong></span>&nbsp;function by taking a vector as input.</span></p>\n" +
            "<p style=\"text-align: justify;\">&nbsp;</p>\n" +
            "<h2 style=\"text-align: center;\"><span style=\"font-size: 13pt; color: #0000ff;\"><strong>Creating a Factor</strong></span></h2>\n" +
            "<h3 style=\"text-align: justify;\"><strong><span style=\"font-size: 12pt;\">Example-1:</span></strong></h3>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\">&gt; # Create a vector as input.</span><br /><span style=\"font-size: 12pt; color: #008000;\">&gt; data &lt;- c(\"Agree\",\"Strongly Agree\",\"Disagree\",\"Agree\")</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\">&gt; print(data)</span><br /><span style=\"font-size: 12pt; color: #008000;\">&gt; print(is.factor(data))</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\">&gt; # Apply the factor function.</span><br /><span style=\"font-size: 12pt; color: #008000;\">&gt; factor_data &lt;- factor(data)</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\">&gt; print(factor_data)</span><br /><span style=\"font-size: 12pt; color: #008000;\">&gt; print(is.factor(factor_data))</span></p>\n" +
            "<p style=\"text-align: justify;\">&nbsp;</p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\"><strong><span style=\"color: #0000ff;\">Output:-</span></strong></span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\">[1] \"Agree\"  \"Strongly Agree\" \"Disagree\"       \"Agree\"         \n" +
            "[1] FALSE\n" +
            "[1] Agree    Strongly Agree Disagree       Agree         \n" +
            "Levels: Agree Disagree Strongly Agree\n" +
            "[1] TRUE</span><br /><br /></pre>\n" +
            "<h3 style=\"text-align: justify;\"><strong><span style=\"font-size: 12pt;\">Example-2:</span></strong></h3>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\">&gt; data &lt;- c(\"Agree\",\"Strongly Agree\", \"Disagree\", \"Agree\")</span><br /><span style=\"font-size: 12pt; color: #008000;\">&gt; # Create the factors</span><br /><span style=\"font-size: 12pt; color: #008000;\">&gt; factor_data &lt;- factor(data)</span><br /><span style=\"font-size: 12pt; color: #008000;\">&gt; print(factor_data)</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\">&gt;<span style=\"color: #ff00ff;\"> # Apply the factor function with required order of the level.</span></span><br /><span style=\"font-size: 12pt; color: #008000;\">&gt; new_order_data &lt;- factor(factor_data,levels = c(\"Strongly Agree\",\"Agree\", \"Disagree\"))</span><br /><span style=\"font-size: 12pt; color: #008000;\">&gt; print(new_order_data)</span></p>\n" +
            "<p style=\"text-align: justify;\">&nbsp;</p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #0000ff;\"><strong>Output:-</strong></span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\">[1] Agree          Strongly Agree Disagree       Agree         \n" +
            "Levels: Agree Disagree Strongly Agree\n" +
            "[1] Agree          Strongly Agree Disagree       Agree         \n" +
            "Levels: Strongly Agree Agree Disagree</span><br /><br /></pre>\n" +
            "<h3 style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">Example-3:</span></h3>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\">&gt; data &lt;- c(\"Agree\", \"Disagree\", \"Agree\")</span><br /><span style=\"font-size: 12pt; color: #008000;\">&gt; # Create the factors</span><br /><span style=\"font-size: 12pt; color: #008000;\">&gt; factor_data &lt;- factor(data)</span><br /><span style=\"font-size: 12pt; color: #008000;\">&gt; print(factor_data)</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\">&gt; <span style=\"color: #ff00ff;\"># levels may be predefined even if not used.</span></span><br /><span style=\"font-size: 12pt; color: #008000;\">&gt; new_order_data &lt;- factor(factor_data,levels = c(\"Strongly Agree\",\"Agree\", \"Disagree\"))</span><br /><span style=\"font-size: 12pt; color: #008000;\">&gt; print(new_order_data)</span></p>\n" +
            "<p style=\"text-align: justify;\">&nbsp;</p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\"><strong><span style=\"color: #0000ff;\">Output:-</span></strong></span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\">[1] Agree    Disagree Agree   \n" +
            "Levels: Agree Disagree\n" +
            "[1] Agree    Disagree Agree   \n" +
            "Levels: Strongly Agree Agree Disagree</span><br /><br /></pre>\n" +
            "<h2 style=\"text-align: center;\"><span style=\"font-size: 13pt; color: #0000ff;\"><strong>Generating Factor Levels</strong></span></h2>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">We can generate factor levels by using the&nbsp;<span style=\"color: #0000ff;\"><strong>gl()</strong></span>&nbsp;function. It takes two integers as input which indicates how many levels and how many times each level.</span></p>\n" +
            "<h3 style=\"text-align: left;\"><strong><span style=\"font-size: 12pt;\">Syntax</span></strong></h3>\n" +
            "<pre class=\"result notranslate\"><span style=\"font-size: 12pt; color: #0000ff;\">gl(n, k, labels)\n" +
            "</span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">Following is the description of the parameters used &minus;</span></p>\n" +
            "<ul class=\"list\" style=\"text-align: justify;\">\n" +
            "<li>\n" +
            "<p><span style=\"font-size: 12pt;\"><strong>n</strong>&nbsp;is a integer giving the number of levels.</span></p>\n" +
            "</li>\n" +
            "<li>\n" +
            "<p><span style=\"font-size: 12pt;\"><strong>k</strong>&nbsp;is a integer giving the number of replications.</span></p>\n" +
            "</li>\n" +
            "<li>\n" +
            "<p><span style=\"font-size: 12pt;\"><strong>labels</strong>&nbsp;is a vector of labels for the resulting factor levels.</span></p>\n" +
            "</li>\n" +
            "</ul>\n" +
            "<p>&nbsp;</p>\n" +
            "<h3 style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">Example</span></h3>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\">&gt; v &lt;- gl(3, 4, labels = c(\"high\",\"low\",\"medium\"))</span><br /><span style=\"font-size: 12pt; color: #008000;\">&gt; print(v)</span></p>\n" +
            "<p style=\"text-align: justify;\">&nbsp;</p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #0000ff;\"><strong>Output:-</strong></span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\">[1] high   high   high   high   low    low    low    low    medium medium\n" +
            "[11] medium medium\n" +
            "Levels: high low medium</span></pre>\n" +
            "\n";


    public static final String rlanguage14="<h1 style=\"text-align: center;\"><strong><span style=\"font-size: 14pt; color: #0000ff;\">R - <span style=\"color: #008000;\">Data Frames</span></span></strong></h1>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\">The function <span style=\"color: #0000ff;\"><code>data.frame()</code></span> creates data frames, tightly coupled collections of variables which share many of the properties of matrices and of lists, used as the fundamental data structure by most of <span style=\"font-family: Courier\\ New, Courier; color: #666666;\"><strong>R</strong></span>'s modeling software.</span></p>\n" +
            "<h3 style=\"text-align: justify;\"><strong><span style=\"font-size: 12pt;\">Syntax:</span></strong></h3>\n" +
            "<pre><span style=\"font-size: 12pt;\">data.frame(..., row.names = NULL, check.rows = FALSE,\n" +
            "           check.names = TRUE, fix.empty.names = TRUE,\n" +
            "           stringsAsFactors = default.stringsAsFactors())<br />\n" +
            "</span></pre>\n" +
            "<h3 style=\"text-align: justify;\"><strong><span style=\"font-size: 12pt;\">Arguments</span></strong></h3>\n" +
            "<table style=\"border-style: solid;\" border=\"1\" summary=\"R argblock\">\n" +
            "<tbody>\n" +
            "<tr valign=\"top\">\n" +
            "<td style=\"text-align: center;\"><span style=\"font-size: 12pt;\"><code>...</code></span></td>\n" +
            "<td>\n" +
            "<p><span style=\"font-size: 12pt;\">these arguments are of either the form <code>value</code> or <code>tag = value</code>. Component names are created based on the tag (if present) or the deparsed argument itself.</span></p>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr valign=\"top\">\n" +
            "<td style=\"text-align: center;\"><span style=\"font-size: 12pt;\"><code>row.names</code></span></td>\n" +
            "<td>\n" +
            "<p><span style=\"font-size: 12pt;\"><code>NULL</code> or a single integer or character string specifying a column to be used as row names, or a character or integer vector giving the row names for the data frame.</span></p>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr valign=\"top\">\n" +
            "<td style=\"text-align: center;\"><span style=\"font-size: 12pt;\"><code>check.rows</code></span></td>\n" +
            "<td>\n" +
            "<p><span style=\"font-size: 12pt;\">if <code>TRUE</code> then the rows are checked for consistency of length and names.</span></p>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr valign=\"top\">\n" +
            "<td style=\"text-align: center;\"><span style=\"font-size: 12pt;\"><code>check.names</code></span></td>\n" +
            "<td>\n" +
            "<p><span style=\"font-size: 12pt;\">logical. If <code>TRUE</code> then the names of the variables in the data frame are checked to ensure that they are syntactically valid variable names and are not duplicated. If necessary they are adjusted (by <code>make.names</code>) so that they are.</span></p>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr valign=\"top\">\n" +
            "<td><span style=\"font-size: 12pt;\"><code>fix.empty.names</code></span></td>\n" +
            "<td>\n" +
            "<p><span style=\"font-size: 12pt;\">logical indicating if arguments which are &ldquo;unnamed&rdquo; (in the sense of not being formally called as <code>someName = arg</code>) get an automatically constructed name or rather name <code>\"\"</code>. Needs to be set to <code>FALSE</code> even when <code>check.names</code> is false if <code>\"\"</code> names should be kept.</span></p>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr valign=\"top\">\n" +
            "<td><span style=\"font-size: 12pt;\"><code>stringsAsFactors</code></span></td>\n" +
            "<td>\n" +
            "<p><span style=\"font-size: 12pt;\">logical: should character vectors be converted to factors? The &lsquo;factory-fresh&rsquo; default is <code>TRUE</code>, but this can be changed by setting <code>options(stringsAsFactors\n" +
            "      = FALSE)</code>.</span></p>\n" +
            "</td>\n" +
            "</tr>\n" +
            "</tbody>\n" +
            "</table>\n" +
            "<p style=\"text-align: justify;\">&nbsp;</p>\n" +
            "<h2 style=\"text-align: center;\"><strong><span style=\"font-size: 13pt; color: #0000ff;\">Creating a Data Frame</span></strong></h2>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\"><strong>Example-1:</strong> By making some vectors first and Next, you just combine the vectors that you made with the <code class=\"lang-r\">data.frame()</code> function:</span></p>\n" +
            "<pre><span style=\"font-size: 12pt;\"><code class=\"lang-r hljs\"><span style=\"color: #008000;\">Died.At &lt;- c(<span class=\"hljs-number\">22</span>,<span class=\"hljs-number\">40</span>,<span class=\"hljs-number\">72</span>,<span class=\"hljs-number\">41</span>)\n" +
            "Writer.At &lt;- c(<span class=\"hljs-number\">16</span>, <span class=\"hljs-number\">18</span>, <span class=\"hljs-number\">36</span>, <span class=\"hljs-number\">36</span>)\n" +
            "First.Name &lt;- c(<span class=\"hljs-string\">\"John\"</span>, <span class=\"hljs-string\">\"Edgar\"</span>, <span class=\"hljs-string\">\"Walt\"</span>, <span class=\"hljs-string\">\"Jane\"</span>)\n" +
            "Second.Name &lt;- c(<span class=\"hljs-string\">\"Doe\"</span>, <span class=\"hljs-string\">\"Poe\"</span>, <span class=\"hljs-string\">\"Whitman\"</span>, <span class=\"hljs-string\">\"Austen\"</span>)\n" +
            "Sex &lt;- c(<span class=\"hljs-string\">\"MALE\"</span>, <span class=\"hljs-string\">\"MALE\"</span>, <span class=\"hljs-string\">\"MALE\"</span>, <span class=\"hljs-string\">\"FEMALE\"</span>)\n" +
            "</span><br /><br /></code></span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #ff00ff;\"># Make the dataframe with the help of data.frame()</span><br /><span style=\"font-size: 12pt; color: #008000;\">writers_df &lt;- data.frame(Died.At, Writer.At, First.Name, Second.Name, Sex)</span></p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #ff00ff;\"><code class=\"lang-r hljs\"></code></span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #ff00ff;\"># Use str() to get more info about writers_df OR to get structure of dataframe</span><br /><span style=\"font-size: 12pt; color: #008000;\">str(writers_df)</span></p>\n" +
            "<p style=\"text-align: justify;\">&nbsp;</p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"color: #0000ff;\"><strong><span style=\"font-size: 12pt;\">Output:-</span></strong></span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #0000ff;\">&gt;writers_df</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">&nbsp;&nbsp; Died.At&nbsp;&nbsp; Writer.At&nbsp;&nbsp;&nbsp;&nbsp; First.Name&nbsp;&nbsp;&nbsp; Second.Name&nbsp;&nbsp;&nbsp; Sex&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">1&nbsp; 22&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 16&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; John&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Doe&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; MALE&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">2&nbsp; 40&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 18&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Edgar &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; Poe&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; MALE&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">3&nbsp; 72&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 36 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; Walt&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Whitman&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; MALE&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">4&nbsp; 41&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 36&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Jane&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Austen&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; FEMALE&nbsp; &nbsp; &nbsp;</span><br /><br /><span style=\"font-size: 12pt; color: #0000ff;\">&gt; # Use str() to get more info about `writers_df`</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">&gt; str(writers_df)</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">&nbsp;'data.frame': &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 4 obs. of 6 variables:</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">$ Died.At : &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; num 22 40 72 41</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">$ Writer.At : &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp; num 16 18 36 36</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">$ First.Name :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; Factor w/ 4 levels \"Edgar\",\"Jane\",..: 3 1 4 2</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">$ Second.Name : &nbsp; &nbsp; Factor w/ 4 levels \"Austen\",\"Doe\",..: 2 3 4 1</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">$ Sex :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Factor w/ 2 levels \"FEMALE\",\"MALE\": 2 2 2 1</span><br /><br /></p>\n" +
            "<p style=\"text-align: justify;\">&nbsp;</p>\n" +
            "<pre><span style=\"font-size: 12pt; color: #0000ff;\"><code class=\"lang-r hljs\"></code></span></pre>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\"><strong>Example-2:</strong></span></p>\n" +
            "<div style=\"left: 47.2433px; top: 142.724px; font-size: 18.1818px; font-family: monospace; transform: scaleX(0.866155); text-align: justify;\"><span style=\"color: #008000;\"><span style=\"font-size: 12pt;\">&gt;measrs&lt;-data.frame(gender=c(\"M\",\"M\",</span><span style=\"font-size: 12pt;\">\"F\"),ht=c(172,186.5,165), wt= c(91,</span><span style=\"font-size: 12pt;\">99,74))</span></span></div>\n" +
            "<div style=\"left: 47.2433px; top: 210.469px; font-size: 18.1818px; font-family: monospace; transform: scaleX(0.866323); text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\">&gt; measrs</span></div>\n" +
            "<div style=\"left: 47.2433px; top: 210.469px; font-size: 18.1818px; font-family: monospace; transform: scaleX(0.866323); text-align: justify;\">&nbsp;</div>\n" +
            "<div style=\"left: 47.2433px; top: 210.469px; font-size: 18.1818px; font-family: monospace; transform: scaleX(0.866323); text-align: justify;\"><strong><span style=\"font-size: 12pt; color: #0000ff;\">Output:</span></strong></div>\n" +
            "<div style=\"left: 66.2983px; top: 243.014px; font-size: 18.1818px; font-family: monospace; transform: scaleX(0.866227); text-align: justify;\"><span style=\"font-size: 12pt; color: #0000ff;\">&nbsp;gender&nbsp; ht&nbsp;&nbsp; wt</span></div>\n" +
            "<div style=\"left: 47.2433px; top: 265.596px; font-size: 18.1818px; font-family: monospace; transform: scaleX(0.866214); text-align: justify;\"><span style=\"font-size: 12pt; color: #0000ff;\">1 M&nbsp;&nbsp;&nbsp;&nbsp; 172.0 91</span></div>\n" +
            "<div style=\"left: 47.2433px; top: 288.179px; font-size: 18.1818px; font-family: monospace; transform: scaleX(0.866214); text-align: justify;\"><span style=\"font-size: 12pt; color: #0000ff;\">2 M&nbsp;&nbsp;&nbsp;&nbsp; 186.5 99</span></div>\n" +
            "<div style=\"left: 47.2433px; top: 310.761px; font-size: 18.1818px; font-family: monospace; transform: scaleX(0.866214); text-align: justify;\"><span style=\"font-size: 12pt; color: #0000ff;\">3 F&nbsp;&nbsp;&nbsp;&nbsp; 165.0 74</span></div>\n" +
            "<div style=\"left: 47.2433px; top: 310.761px; font-size: 18.1818px; font-family: monospace; transform: scaleX(0.866214); text-align: justify;\">&nbsp;</div>\n" +
            "<div style=\"left: 47.2433px; top: 310.761px; font-size: 18.1818px; font-family: monospace; transform: scaleX(0.866214); text-align: justify;\">\n" +
            "<p style=\"text-align: center;\"><span style=\"color: #0000ff; font-family: verdana, geneva; font-size: 13pt;\"><strong>Data Frame Attributes</strong></span><br /><span style=\"color: #0000ff; font-family: verdana, geneva; font-size: 12pt;\">Both List and Matrix</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\">&gt; measrs</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><strong><span style=\"color: #0000ff;\">Output:</span></strong></span></p>\n" +
            "<div style=\"left: 66.2983px; top: 243.014px; font-size: 18.1818px; font-family: monospace; transform: scaleX(0.866227); text-align: justify;\"><span style=\"font-size: 12pt; color: #0000ff;\">&nbsp;gender&nbsp; ht&nbsp;&nbsp; wt</span></div>\n" +
            "<div style=\"left: 47.2433px; top: 265.596px; font-size: 18.1818px; font-family: monospace; transform: scaleX(0.866214); text-align: justify;\"><span style=\"font-size: 12pt; color: #0000ff;\">1 M&nbsp;&nbsp;&nbsp;&nbsp; 172.0 91</span></div>\n" +
            "<div style=\"left: 47.2433px; top: 288.179px; font-size: 18.1818px; font-family: monospace; transform: scaleX(0.866214); text-align: justify;\"><span style=\"font-size: 12pt; color: #0000ff;\">2 M&nbsp;&nbsp;&nbsp;&nbsp; 186.5 99</span></div>\n" +
            "<div style=\"left: 47.2433px; top: 310.761px; font-size: 18.1818px; font-family: monospace; transform: scaleX(0.866214); text-align: justify;\"><span style=\"font-size: 12pt; color: #0000ff;\">3 F&nbsp;&nbsp;&nbsp;&nbsp; 165.0 74</span></div>\n" +
            "<div style=\"left: 47.2433px; top: 310.761px; font-size: 18.1818px; font-family: monospace; transform: scaleX(0.866214); text-align: justify;\">&nbsp;</div>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\"><span style=\"color: #008000;\">&gt; names(measrs)</span></span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #0000ff; font-family: verdana, geneva;\"><strong>Output:</strong></span><br /><span style=\"font-size: 12pt; color: #0000ff;\">[1] \"gender\" \"ht\" \"wt\"</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\"><span style=\"color: #008000;\">&gt; measrs$ht</span></span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\"><strong><span style=\"color: #0000ff;\">Output:</span></strong></span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #0000ff;\">[1] 172.0 186.5 165.0</span></p>\n" +
            "<p style=\"text-align: center;\"><br /><br /><span style=\"font-size: 13pt; color: #0000ff; font-family: verdana, geneva;\"><strong>Components as Vectors</strong></span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">The components of a data frame can be extracted as a vector as in </span><span style=\"font-size: 12pt; font-family: verdana, geneva;\">a list:</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\"><span style=\"color: #008000;\">&gt; height &lt;- measrs$ht</span></span><br /><span style=\"font-size: 12pt; color: #008000;\">&gt; height</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\"><strong><span style=\"color: #0000ff;\">Output:</span></strong></span><br /><span style=\"font-size: 12pt; color: #0000ff;\">[1] 172.0 186.5 165.0</span></p>\n" +
            "<p style=\"text-align: center;\"><br /><strong><span style=\"font-size: 13pt; color: #0000ff; font-family: verdana, geneva;\">Remove Columns And Rows From A Data Frame</span></strong></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">If you want to remove values or entire columns, you can assign a <span style=\"color: #0000ff;\">NULL</span> value to the desired unit:</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\"># Assign `NULL` to the value in [1,3]</span><br /><span style=\"font-size: 12pt; color: #008000;\">writers_df[1,3] &lt;- NULL</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\"># Assign `NULL` TO `Age.At.Death`</span><br /><span style=\"font-size: 12pt; color: #008000;\">Age.At.Death &lt;- NULL</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\"># Print out `writers_df`</span><br /><span style=\"font-size: 12pt; color: #008000;\">writers_df</span></p>\n" +
            "<p style=\"text-align: justify;\"><br /><span style=\"font-family: verdana, geneva;\"><strong><span style=\"font-size: 12pt; color: #0000ff;\">Output:</span></strong></span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"color: #0000ff;\"><span style=\"font-size: 12pt;\">&nbsp; </span><span style=\"font-size: 12pt;\">Age.At&nbsp; Death Age.As.Writer Name Surname Gender&nbsp; Death</span></span><br /><span style=\"font-size: 12pt; color: #0000ff;\">1 22&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 16&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; John&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Doe&nbsp;&nbsp;&nbsp; MALE 2015-05-10</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">2 40&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 18&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Edgar&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Poe&nbsp;&nbsp;&nbsp; MALE 1849-10-07</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">3 72&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 36&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; Walt&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Whitman MALE 1892-03-26</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">4 41&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 36&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Jane&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Austen&nbsp; FEMALE 1817-07-18</span></p>\n" +
            "<p style=\"text-align: center;\"><br /><span style=\"font-size: 13pt; color: #0000ff;\"><strong>Extract Data from Data Frame</strong></span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\"><strong>Example-1:</strong> Extract specific column from a data frame using column name.</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\"><span style=\"color: #008000;\"># Create the data frame.</span></span><br /><span style=\"font-size: 12pt; color: #008000;\">emp.data &lt;- data.frame(</span><br /><span style=\"font-size: 12pt; color: #008000;\">emp_id = c (1:4),</span><br /><span style=\"font-size: 12pt; color: #008000;\">emp_name = c(\"Rishbah\",\"Vijay\",\"Nitin\",\"Rajat\"),</span><br /><span style=\"font-size: 12pt; color: #008000;\">salary = c(623.3,515.2,611.0,729.0),</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\">start_date=as.Date(c(\"1999-01-31\",\"1997-02-23\",\"1996-11-15\", \"2014-05-11\")), </span><span style=\"font-size: 12pt; color: #008000;\">stringsAsFactors = FALSE</span><span style=\"font-size: 12pt; color: #008000;\">)</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\">result &lt;- data.frame(emp.data$emp_name,emp.data$salary)</span><br /><span style=\"font-size: 12pt; color: #008000;\">print(result)</span></p>\n" +
            "<p style=\"text-align: justify;\"><br /><strong><span style=\"font-size: 12pt; color: #0000ff;\">Output:</span></strong></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #0000ff;\">emp.data.emp_name emp.data.salary</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">1 Rishbah&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 623.3</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">2 Vijay&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 515.2</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">3 Nitin&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 611.0</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">4 Rajat&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 729.0</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt;\"><strong>Example-2:</strong></span><br /><span style=\"font-size: 12pt; color: #008000;\"># Create the data frame.</span><br /><span style=\"font-size: 12pt; color: #008000;\">emp.data &lt;- data.frame(</span><br /><span style=\"font-size: 12pt; color: #008000;\">emp_id = c (1:4),</span><br /><span style=\"font-size: 12pt; color: #008000;\">emp_name = c(\"Rishbah\",\"Vijay\",\"Nitin\",\"Rajat\"),</span><br /><span style=\"font-size: 12pt; color: #008000;\">salary = c(623.3,515.2,611.0,729.0),</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\">start_date = as.Date(c(\"1999-01-31\", \"1997-02-23\", \"1996-11-15\", \"2014-05-11\")),</span><br /><span style=\"font-size: 12pt; color: #008000;\">stringsAsFactors = FALSE</span><br /><span style=\"font-size: 12pt; color: #008000;\">)</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\"><span style=\"color: #ff00ff;\"># Extract 2rd and 4th row with 2nd and 4th column</span>.</span><br /><span style=\"font-size: 12pt; color: #008000;\">result &lt;- emp.data[c(2,4),c(2,3)]</span><br /><span style=\"font-size: 12pt; color: #008000;\">print(result)</span></p>\n" +
            "<p style=\"text-align: justify;\">&nbsp;</p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"color: #0000ff;\"><strong><span style=\"font-size: 12pt;\">Output:</span></strong></span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #0000ff;\">&nbsp;emp_id&nbsp; emp_name salary start_date</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">1 1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Rishbah 623.3&nbsp; 1999-01-31</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">2 2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Vijay&nbsp;&nbsp; 515.2&nbsp; 1997-02-23</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">3 3&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Nitin&nbsp;&nbsp; 611.0&nbsp; 1996-11-15</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">4 4&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Rajat&nbsp;&nbsp; 729.0&nbsp; 2014-05-11</span></p>\n" +
            "<p style=\"text-align: center;\"><br /><span style=\"color: #0000ff;\"><strong><span style=\"font-size: 12pt; font-family: verdana, geneva;\">Expanding Data Frames</span></strong></span></p>\n" +
            "<p style=\"text-align: justify;\"><strong><span style=\"font-size: 12pt; font-family: verdana, geneva; color: #000000;\">Row Bind, Column Bind: </span></strong><span style=\"font-size: 12pt; font-family: verdana, geneva;\">If you expand the experiment to add data, use row binding to </span><span style=\"font-size: 12pt; font-family: verdana, geneva;\">expand.</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"color: #008000;\"><span style=\"font-size: 12pt;\">&gt; m2 &lt;- data.frame(gender=c(\"M\",\"F\"),</span><span style=\"font-size: 12pt;\">ht=c(170,166),wt= c(68, + 72),</span><span style=\"font-size: 12pt;\"> age = c(38, 22))</span></span><br /><span style=\"font-size: 12pt; color: #008000;\">&gt; rownames(m2) &lt;- c(\"S4\", \"S5\")</span><br /><span style=\"font-size: 12pt; color: #008000;\">&gt; measrs2 &lt;- rbind(measrs, m2)</span></p>\n" +
            "<p style=\"text-align: center;\"><span style=\"font-family: verdana, geneva;\"><span style=\"color: #0000ff; font-size: 13pt;\"><strong>Select Rows Based Variable Values</strong></span></span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">Commonly, we&rsquo;ll want to select those rows in a data.frame in </span><span style=\"font-family: verdana, geneva;\"><span style=\"font-size: 12pt;\">which one of the variables has specific values. The entries in </span><span style=\"font-size: 12pt;\">measrs2 </span><span style=\"font-size: 12pt;\">with height:</span></span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #008000;\">&gt; talls &lt;- measrs2[measrs2$ht &gt;= 170, ]</span><br /><span style=\"font-size: 12pt; color: #008000;\">&gt; talls</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"color: #0000ff;\"><strong><span style=\"font-size: 12pt;\">Output:</span></strong></span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; color: #0000ff;\">&nbsp;gender ht&nbsp;&nbsp; wt age</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">1 M&nbsp;&nbsp; 172.0&nbsp; 91 28</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">2 M&nbsp;&nbsp; 186.5&nbsp; 99 55</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">4 M&nbsp;&nbsp; 170.0&nbsp; 68 38</span></p>\n" +
            "<p style=\"text-align: center;\"><br /><span style=\"color: #0000ff; font-family: verdana, geneva; font-size: 13pt;\"><strong>Sort a Data Frame by Selected Column</strong></span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"font-size: 12pt; font-family: verdana, geneva;\">Often data are better viewed when sorted. The function </span><span style=\"font-size: 12pt; font-family: verdana, geneva;\">order </span><span style=\"font-size: 12pt; font-family: verdana, geneva;\">sorts a column and gives output that can sort the rows of a</span> <span style=\"font-size: 12pt; font-family: verdana, geneva;\">data.frame. The following sorts</span> <span style=\"font-size: 12pt; font-family: verdana, geneva;\">measrs2 </span><span style=\"font-size: 12pt; font-family: verdana, geneva;\">by age.</span></p>\n" +
            "<p style=\"text-align: justify;\"><br /><span style=\"color: #008000;\"><span style=\"font-size: 12pt;\">&gt; measrsByAge &lt;- measrs2[order(measrs2[,</span><span style=\"font-size: 12pt;\">\"age\"]),]</span></span><br /><span style=\"font-size: 12pt; color: #008000;\">&gt; measrsByAge</span></p>\n" +
            "<p style=\"text-align: justify;\"><span style=\"color: #0000ff;\"><strong><span style=\"font-size: 12pt;\">Output:</span></strong></span><br /><span style=\"font-size: 12pt; color: #0000ff;\">gender ht wt age</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">S5 F 166.0 72 22</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">S1 M 172.0 91 28</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">S4 M 170.0 68 38</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">S3 F 165.0 74 43</span><br /><span style=\"font-size: 12pt; color: #0000ff;\">S2 M 186.5 99 55</span></p>\n" +
            "</div>\n" +
            "<div style=\"left: 47.2433px; top: 310.761px; font-size: 18.1818px; font-family: monospace; transform: scaleX(0.866214);\">\n" +
            "<div style=\"left: 47.2433px; top: 319.129px; font-size: 18.1818px; font-family: monospace; transform: scaleX(0.866195);\">\n" +
            "<div style=\"left: 47.2433px; top: 265.663px; font-size: 18.1818px; font-family: monospace; transform: scaleX(0.866164);\">\n" +
            "<div style=\"left: 421.547px; top: 357.062px; font-size: 18.1818px; font-family: sans-serif;\">\n" +
            "<div style=\"left: 47.2433px; top: 350.019px; font-size: 18.1818px; font-family: monospace; transform: scaleX(0.866192);\">\n" +
            "<div style=\"left: 47.2433px; top: 390.668px; font-size: 18.1818px; font-family: monospace; transform: scaleX(0.866192); text-align: justify;\">&nbsp;</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n";


}
