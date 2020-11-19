package com.vijay.aiodeveloper.strings;

/**
 * Created by Nabeel-PC on 04-07-2017.
 */

public class StringHtml {
    public static final String program1="<p>&lt;!DOCTYPE html&gt;<br />&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;<br />&lt;title&gt;<span style=\"color: #33cccc;\">Page Title</span>&lt;/title&gt;<br />&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;p&gt;<span style=\"color: #33cccc;\">Hello World</span>&lt;/p&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p><br /><strong>Output :</strong></p>\n" +
            "<p><br />Hello World</p>";

    public static final String program2="\n" +
            "<p>&lt;!DOCTYPE html&gt;<br />&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;h1&gt;<span style=\"color: #33cccc;\">Heading 1</span>&lt;/h1&gt;<br />&lt;h2&gt;<span style=\"color: #33cccc;\">Heading 2</span>&lt;/h2&gt;<br />&lt;h3&gt;<span style=\"color: #33cccc;\">Heading 3</span>&lt;/h3&gt;<br />&lt;h4&gt;<span style=\"color: #33cccc;\">Heading 4</span>&lt;/h4&gt;<br />&lt;h5&gt;<span style=\"color: #33cccc;\">Heading 5</span>&lt;/h5&gt;<br />&lt;h6&gt;<span style=\"color: #33cccc;\">Heading 6</span>&lt;/h6&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p><br /><strong>Output :</strong></p>\n" +
            "<p><br /><span style=\"font-size: 18pt;\"><strong>Heading 1</strong></span></p>\n" +
            "<p><span style=\"font-size: 14pt;\"><strong>Heading 2</strong></span></p>\n" +
            "<p><span style=\"font-size: 12pt;\"><strong>Heading 3</strong></span></p>\n" +
            "<p><span style=\"font-size: 10pt;\"><strong>Heading 4</strong></span></p>\n" +
            "<p><span style=\"font-size: 8pt;\"><strong>Heading 5</strong></span></p>\n" +
            "<p><span style=\"font-size: 8pt;\"><strong>Heading 6</strong></span></p>\n" +
            "\n";

    public static final String program3="<p>&lt;!DOCTYPE html&gt;<br />&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;p&gt;<span style=\"color: #33cccc;\">This is paragraph 1</span>. &lt;/p&gt;<br />&lt;p&gt;<span style=\"color: #33cccc;\">This is paragraph 2.</span> &lt;/p&gt;<br />&lt;p&gt;<span style=\"color: #33cccc;\">This is paragraph 3.</span> &lt;/p&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>Output :</strong></p>\n" +
            "<p><br />This is paragraph 1.</p>\n" +
            "<p>This is paragraph 2.</p>\n" +
            "<p>This is paragraph 3.</p>";
    public static final String program4="<p>&lt;!DOCTYPE html&gt;<br />&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;p&gt;hr tag defines a horizontal rule. &lt;/p&gt;<br />&lt;hr&gt;<br />&lt;p&gt;Paragraph 1. &lt;/p&gt;<br />&lt;hr&gt;<br />&lt;p&gt;Paragraph 2. &lt;/p&gt;</p>\n" +
            "<p><br />&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p><br /><strong>Output :</strong></p>\n" +
            "<p><br />hr tag defines a horizontal rule.</p>\n" +
            "<p>Paragraph 1.<br />------------------------------<br />Paragraph 2.<br />------------------------------</p>\n" +
            "<p>&nbsp;</p>";


    public static final String program5="<p>&lt;!DOCTYPE html&gt;<br />&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;button type=\"button\" onclick=\"alert('Button Clicked !!')\"&gt;<span style=\"color: #33cccc;\">Click Me!</span> &lt;/button&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p><br /><strong>Output :</strong></p>\n" +
            "<p><br /><span style=\"text-decoration: underline;\"><span style=\"color: #808080; text-decoration: underline;\">Click Me!</span></span></p>";

    public static final String program6="<p>&lt;!DOCTYPE html&gt;<br />&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;p&gt;This is &lt;br&gt; an example of &lt;br&gt; line breaks &lt;/p&gt;</p>\n" +
            "<p><br />&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>Output :</strong></p>\n" +
            "<p><br />This is&nbsp;<br />an example of&nbsp;<br />line breaks</p>";

    public static final String program7="<p>&lt;!DOCTYPE html&gt;&lt;!DOCTYPE html&gt;&lt;html&gt;<br />&lt;body&gt;<br />&lt;p&gt;pre tag preserves both spaces and line breaks. &lt;/p&gt;<br />&lt;pre&gt;Hello How<br />AreYou<br />I am fine. &lt;/pre&gt;<br />&lt;/body&gt;<br />&lt;/html&gt;</p>\n" +
            "<p><br /><strong>Output :</strong></p>\n" +
            "<p>pre tag preserves both spaces and line</p>\n" +
            "<p>breaks.</p>\n" +
            "<p><br />&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Hello &nbsp; &nbsp;How &nbsp; Are &nbsp; &nbsp; You &nbsp; &nbsp; I &nbsp; &nbsp; am &nbsp; &nbsp;fine.</p>";

    public static final String program8="<p>&lt;!DOCTYPE html&gt;<br />&lt;html&gt;</p>\n" +
            "<p>&lt;body style=\"background-color:lightgreen;\"&gt;</p>\n" +
            "<p>&lt;p style=\"color:green;\"&gt;I am green&lt;/p&gt;<br />&lt;p style=\"color:blue;\"&gt;I am blue&lt;/p&gt;<br />&lt;p style=\"color:red;\"&gt;I am red&lt;/p&gt;<br />&lt;p style=\"font-family:courier;\"&gt;This is a paragraph. &lt;/p&gt;<br />&lt;p style=\"font-size:160%;\"&gt;This is a paragraph. &lt;/p&gt;<br />&lt;p style=\"text-align:center;\"&gt;Text in center&lt;/p&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p><strong>Output::-</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p style=\"color: green;\">I am green</p>\n" +
            "<p style=\"color: blue;\">I am blue</p>\n" +
            "<p style=\"color: red;\">I am red</p>\n" +
            "<p style=\"font-family: courier;\">This is a paragraph.</p>\n" +
            "<p style=\"font-size: 160%;\">This is a paragraph.</p>\n" +
            "<p style=\"text-align: center;\">Text in center</p>\n" +
            "<p>Output::-</p>";

    public static final String program9="<p>&lt;!DOCTYPE html&gt;<br />&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;p&gt;This is normal text. &lt;/p&gt;</p>\n" +
            "<p>&lt;p&gt;&lt;b&gt;This is bold text. &lt;/b&gt; &lt;/p&gt;</p>\n" +
            "<p>&lt;p&gt;&lt;i&gt;This text is italic&lt;/i&gt;. &lt;/p&gt;</p>\n" +
            "<p>&lt;p&gt;This is &lt;small&gt;small&lt;/small&gt; text. &lt;/p&gt;</p>\n" +
            "<p>&lt;p&gt;This is &lt;mark&gt;marked&lt;/mark&gt; text. &lt;/p&gt;</p>\n" +
            "<p>&lt;p&gt;My favorite color is &lt;del&gt;blue&lt;/del&gt;. &lt;/p&gt;</p>\n" +
            "<p>&lt;p&gt;This is &lt;sub&gt;subscripted&lt;/sub&gt; text. &lt;/p&gt;</p>\n" +
            "<p>&lt;p&gt;This is &lt;sup&gt;superscripted&lt;/sup&gt; text. &lt;/p&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p><br /><strong>Output :</strong></p>\n" +
            "<p><br />This is normal text.</p>\n" +
            "<p><strong>This is bold text.</strong></p>\n" +
            "<p><em>This text is italic.</em></p>\n" +
            "<p>This is&nbsp;<span style=\"font-size: 8pt;\">small</span>&nbsp;text.</p>\n" +
            "<p>This is&nbsp;<span style=\"color: #ffff00;\">marked&nbsp;</span>text.</p>\n" +
            "<p>My favorite color is&nbsp;<span style=\"text-decoration: underline;\">blue.</span></p>\n" +
            "<p>This is&nbsp;<span style=\"font-size: 8pt;\">subscripted</span>&nbsp;text.</p>\n" +
            "<p>This is&nbsp;<span style=\"font-size: 8pt; font-family: 'comic sans ms', sans-serif;\">superscripted</span>&nbsp;text.</p>";

    public static final String program10="<p>&lt;!DOCTYPE html&gt;<br />&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;code&gt;<br />Your code line 1 here.<br />Your code line 2 here.<br />&lt;/code&gt;</p>\n" +
            "<p>&lt;br&gt;<br />&lt;br&gt; To preserve extra whitespace and line-breaks, use a pre element.<br />&lt;br&gt;</p>\n" +
            "<p>&lt;pre&gt;<br />&lt;code&gt;<br />Your code line 1 here.<br />Your code line 2 here.<br />&lt;/code&gt;<br />&lt;/pre&gt;</p>\n" +
            "<p>&lt;br&gt;</p>\n" +
            "<p>&lt;samp&gt;<br />Your code output here.<br />&lt;/samp&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p><br />Output :</p>\n" +
            "<p><br />Your code line 1 here.Your code line 2 here.</p>\n" +
            "<p>To preserve extra whitespace and line-breaks, use a pre element.<br />Your code line 1 here.Your code line 2 here.<br />Your code output here.</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><br /><strong>Output :</strong></p>\n" +
            "<p><br />Your code line 1 here.Your code line 2 here.</p>\n" +
            "<p><strong>To preserve extra whitespace and </strong>line-breaks<strong>, use a pre element.</strong></p>\n" +
            "<p><br />Your code line 1 here.Your code line 2 here.</p>\n" +
            "<p><br />Your code output here.</p>";

    public static final String program11="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&nbsp; &nbsp; &nbsp; &nbsp; &lt;!-- This is comment --&gt;</p>\n" +
            "<p>&nbsp; &nbsp; &nbsp; &nbsp; &lt;p&gt; This is a paragraph.&lt;/p&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>Output :</strong></p>\n" +
            "<p><br />This is a paragraph.</p>\n" +
            "<p>&nbsp;</p>";

    public static final String program12="<p>&lt;!DOCTYPE html&gt;<br />&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;<br />&lt;title&gt;HTML Page title here&lt;/title&gt;<br />&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;<br />Contents here.<br />&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p><br /><strong>Output :</strong></p>\n" +
            "<p><br />Contents here.</p>";

    public static final String program13="<p>&lt;!DOCTYPE html&gt;<br />&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p><br />&lt;h3 style=\"background-color:yellow\"&gt;<br />Background color yellow<br />&lt;/h3&gt;</p>\n" +
            "<p>&lt;h3 style=\"background-color:red\"&gt;<br />Background color red<br />&lt;/h3&gt;</p>\n" +
            "<p>&lt;h3 style=\"background-color:orange\"&gt;<br />Background color orange<br />&lt;/h3&gt;</p>\n" +
            "<p><br />&lt;h3 style=\"background-color:blue;color:white\"&gt;<br />Background color blue<br />&lt;/h3&gt;</p>\n" +
            "<p>&lt;h3 style=\"background-color:lightgreen\"&gt;<br />Background color light green<br />&lt;/h3&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:--</strong></p>\n" +
            "<!DOCTYPE html>\n" +
            "<html>\n" +
            "\n" +
            "<body>\n" +
            "\n" +
            "\n" +
            "<h3 style=\"background-color:yellow\">\n" +
            "Background color yellow\n" +
            "</h3>\n" +
            "\n" +
            "<h3 style=\"background-color:red\">\n" +
            "Background color red\n" +
            "</h3>\n" +
            "\n" +
            "<h3 style=\"background-color:orange\">\n" +
            "Background color orange\n" +
            "</h3>\n" +
            "\n" +
            "\n" +
            "<h3 style=\"background-color:blue;color:white\">\n" +
            "Background color blue\n" +
            "</h3>\n" +
            "\n" +
            "<h3 style=\"background-color:lightgreen\">\n" +
            "Background color light green\n" +
            "</h3>\n" +
            "\n" +
            "</body>\n" +
            "\n" +
            "</html>";

    public static final String program14="<p>&lt;!DOCTYPE html&gt;<br />&lt;html&gt;</p>\n" +
            "<p>&lt;style&gt;<br />a:visited {<br />color: green;<br />background-color: transparent;<br />text-decoration: none<br />}<br />a:hover {<br />color: red;<br />background-color: transparent;<br />text-decoration: underline<br />}<br />&lt;/style&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;a href=\"http://www.google.co.in\"&gt;A web link&lt;/a&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p><strong>output:-</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><a href=\"http://www.google.co.in\">A web link</a></p>";

    public static final String program15="<p>&lt;!DOCTYPE html&gt;<br />&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;<br />&lt;style&gt;<br />table,th,td {<br />border: 1px solid black;<br />border-collapse: collapse;<br />}<br />th,td {<br />padding: 5px;<br />}<br />&lt;/style&gt;<br />&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;h2&gt;HTML Tables&lt;/h2&gt;</p>\n" +
            "<p>&lt;table style=\"width:100%\"&gt;<br />&lt;tr&gt;<br />&lt;th&gt;Name&lt;/th&gt;<br />&lt;th colspan=\"2\"&gt;Numbers&lt;/th&gt;<br />&lt;/tr&gt;<br />&lt;tr&gt;<br />&lt;td&gt;Tim&lt;/td&gt;<br />&lt;td&gt;111 22 333&lt;/td&gt;<br />&lt;td&gt;444 55 666&lt;/td&gt;<br />&lt;/tr&gt;<br />&lt;/table&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>Output :</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<h2 id=\"mcetoc_1bk6teio72n\">HTML Tables</h2>\n" +
            "<table style=\"width: 100%;\">\n" +
            "<tbody>\n" +
            "<tr>\n" +
            "<th>Name</th>\n" +
            "<th colspan=\"2\">Numbers</th>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>Tim</td>\n" +
            "<td>111 22 333</td>\n" +
            "<td>444 55 666</td>\n" +
            "</tr>\n" +
            "</tbody>\n" +
            "</table>";

    public static final String program16="<p>!DOCTYPE html&gt;<br />&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;h3&gt;Unordered List&lt;/h3&gt;</p>\n" +
            "<p>&lt;ul&gt;<br />&lt;li&gt;Ice Cream&lt;/li&gt;<br />&lt;li&gt;Mango&lt;/li&gt;<br />&lt;li&gt;Coffee&lt;/li&gt;<br />&lt;/ul&gt;</p>\n" +
            "<p>&lt;h3&gt;Ordered List&lt;/h3&gt;</p>\n" +
            "<p>&lt;ol&gt;<br />&lt;li&gt;Ice Cream&lt;/li&gt;<br />&lt;li&gt;Mango&lt;/li&gt;<br />&lt;li&gt;Coffee&lt;/li&gt;<br />&lt;/ol&gt;</p>\n" +
            "<p>&lt;h3&gt;DescriptionList&lt;/h3&gt;</p>\n" +
            "<p>&lt;dl&gt;<br />&lt;dt&gt;Ice Cream&lt;/dt&gt;<br />&lt;dd&gt;- white ice cream&lt;/dd&gt;<br />&lt;dt&gt;Fan&lt;/dt&gt;<br />&lt;dd&gt;- needs electricity&lt;/dd&gt;<br />&lt;/dl&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>Output :</strong></p>\n" +
            "<h3 id=\"mcetoc_1bk6tghcg3p\">Unordered List</h3>\n" +
            "<ul>\n" +
            "<li>Ice Cream</li>\n" +
            "<li>Mango</li>\n" +
            "<li>Coffee</li>\n" +
            "</ul>\n" +
            "<h3 id=\"mcetoc_1bk6tghcg3q\">Ordered List</h3>\n" +
            "<ol>\n" +
            "<li>Ice Cream</li>\n" +
            "<li>Mango</li>\n" +
            "<li>Coffee</li>\n" +
            "</ol>\n" +
            "<h3 id=\"mcetoc_1bk6tghch3r\">DescriptionList</h3>\n" +
            "<dl>\n" +
            "<dt>Ice Cream</dt>\n" +
            "<dd>- white ice cream</dd>\n" +
            "<dt>Fan</dt>\n" +
            "<dd>- needs electricity</dd>\n" +
            "</dl>";

    public static final String program17="<p>&lt;!DOCTYPE html&gt;<br />&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;div style=\"background-color:yellow;\"&gt;</p>\n" +
            "<p>&lt;h2&gt;div Element&lt;/h2&gt;</p>\n" +
            "<p>&lt;p&gt;div element is a block-level element. &lt;/p&gt;<br />&lt;/div&gt;</p>\n" +
            "<p>&lt;span style=\"color:red\"&gt;span element is an inline element. &lt;/span&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>Output :</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<div style=\"background-color: yellow;\">\n" +
            "<h2 id=\"mcetoc_1bk6tjj4k3v\">div Element</h2>\n" +
            "<p>div element is a block-level element.</p>\n" +
            "</div>\n" +
            "<p><span style=\"color: red;\">span element is an inline element. </span></p>";

    public static final String program18="<p>&lt;!DOCTYPE html&gt;<br />&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;form&gt;</p>\n" +
            "<p>&lt;select name=\"IcrCreams\"&gt;<br />&lt;option value=\"Strawberry\"&gt;Strawberry&lt;/option&gt;<br />&lt;option value=\"Vanilla\"&gt;Vanilla&lt;/option&gt;<br />&lt;option value=\"Chocolate\"&gt;Chocolate&lt;/option&gt;<br />&lt;option value=\"GrapeIceCream\"&gt;Grape Ice Cream&lt;/option&gt;<br />&lt;/select&gt;</p>\n" +
            "<p>&lt;br&gt;&lt;br&gt;</p>\n" +
            "<p>&lt;input type=\"submit\"&gt;</p>\n" +
            "<p>&lt;/form&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>Output :</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<form><select name=\"IcrCreams\">\n" +
            "<option value=\"Strawberry\">Strawberry</option>\n" +
            "<option value=\"Vanilla\">Vanilla</option>\n" +
            "<option value=\"Chocolate\">Chocolate</option>\n" +
            "<option value=\"GrapeIceCream\">Grape Ice Cream</option>\n" +
            "</select><br /><br /> <input type=\"submit\" /></form>";

    public static final String program19="<p>&lt;!DOCTYPE html&gt;<br />&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;img src=\"https://www.w3.org/html/logo/downloads/HTML5_Logo_64.png\" alt=\"No Internet Connection.\" width=\"110\" height=\"110\"&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p><strong>OUTPUT:-</strong></p>\n" +
            "<p>PLEASE CHECK U=INTERNET</p>";

    public static final String program20="<p>&lt;!DOCTYPE html&gt;<br />&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;<br />&lt;style&gt;<br />div.IceCream {<br />background-color: lightgreen;<br />margin: 15px;<br />padding: 15px;<br />}<br />&lt;/style&gt;<br />&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;div class=\"IceCream\"&gt;<br />&lt;h2&gt;Ice Cream&lt;/h2&gt;</p>\n" +
            "<p>&lt;p&gt;Ice cream is a sweetened frozen food typically eaten as a snack or dessert. &lt;/p&gt;</p>\n" +
            "<p>&lt;p&gt;It is usually made from dairy products, such as milk and cream, and often combined with fruits or other ingredients and flavours. &lt;/p&gt;<br />&lt;/div&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><br /><strong>Output :</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<div class=\"IceCream\">\n" +
            "<h2 id=\"mcetoc_1bk6tt6ig49\">Ice Cream</h2>\n" +
            "<p>Ice cream is a sweetened frozen food typically eaten as a snack or dessert.</p>\n" +
            "<p>It is usually made from dairy products, such as milk and cream, and often combined with fruits or other ingredients and flavours.</p>\n" +
            "</div>";

    public static final String program21="<p>&lt;!DOCTYPE html&gt;<br />&lt;html&gt;</p>\n" +
            "<p>&lt;head&gt;<br />&lt;link rel=\"stylesheet\" href=\"externalStyleSheet.css\"&gt;<br />&lt;/head&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;p&gt;This is a paragraph. &lt;/p&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>Output :</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>This is a paragraph.</p>";

    public static final String program22="internal.html";

    public static final String program23="<p>&lt;!DOCTYPE html&gt;</p>\n" +
            "<p>&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;iframe src=\"https://en.wikipedia.org/wiki/HTML\" width=\"100%\" height=\"400\"&gt; &lt;/iframe&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>Output :</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><iframe src=\"https://en.wikipedia.org/wiki/HTML\" width=\"100%\" height=\"400\"> </iframe></p>\n";

    public static final String program24="<p>&lt;!DOCTYPE html&gt;<br />&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;button onclick=\"function1()\"&gt;Click here&lt;/button&gt;</p>\n" +
            "<p>&lt;p id=\"element1\"&gt; Welcome &lt;/p&gt;</p>\n" +
            "<p>&lt;script&gt;<br />function function1() {<br />document.getElementById(\"element1\").innerHTML = \"Javascript !!\";<br />}<br />&lt;/script&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:-</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><button>Click here</button></p>\n" +
            "<p id=\"element1\">Welcome</p>";

    public static final String program25="<p>&lt;!DOCTYPE html&gt;<br />&lt;html&gt;</p>\n" +
            "<p>&lt;body&gt;</p>\n" +
            "<p>&lt;form&gt;</p>\n" +
            "<p>First Name: &lt;br&gt;<br />&lt;input type=\"text\" name=\"firstName\"&gt;<br />&lt;br&gt;</p>\n" +
            "<p>Last Name: &lt;br&gt;<br />&lt;input type=\"text\" name=\"lastName\"&gt;<br />&lt;br&gt;</p>\n" +
            "<p><br />User password: &lt;br&gt;<br />&lt;input type=\"password\" name=\"psw\"&gt;</p>\n" +
            "<p>&lt;br&gt;&lt;br&gt;</p>\n" +
            "<p>&lt;input type=\"radio\" name=\"IceCream\" value=\"Strawberry\" checked&gt; Strawberry<br />&lt;br&gt;<br />&lt;input type=\"radio\" name=\"IceCream\" value=\"Vanilla\"&gt; Vanilla<br />&lt;br&gt;<br />&lt;input type=\"radio\" name=\"IceCream\" value=\"Chocolate\"&gt; Chocolate</p>\n" +
            "<p>&lt;br&gt;&lt;br&gt;</p>\n" +
            "<p>&lt;input type=\"checkbox\" name=\"Mobile\" value=\"Mood\"&gt;Happy<br />&lt;br&gt;<br />&lt;input type=\"checkbox\" name=\"Mobile\" value=\"Mood\"&gt;Very Happy</p>\n" +
            "<p>&lt;br&gt;&lt;br&gt;</p>\n" +
            "<p>Enter a date :&lt;br&gt;<br />&lt;input type=\"date\" name=\"bday\" min=\"0000-01-02\"&gt;&lt;br&gt;&lt;br&gt;</p>\n" +
            "<p>&lt;input type=\"submit\" value=\"Submit\"&gt;</p>\n" +
            "<p>&lt;/form&gt;</p>\n" +
            "<p>&lt;/body&gt;</p>\n" +
            "<p>&lt;/html&gt;</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:-</strong></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<form>First Name: <br /> <input name=\"firstName\" type=\"text\" /> <br />Last Name: <br /> <input name=\"lastName\" type=\"text\" /> <br />User password: <br /> <input name=\"psw\" type=\"password\" /> <br /><br /> <input checked=\"checked\" name=\"IceCream\" type=\"radio\" value=\"Strawberry\" /> Strawberry <br /> <input name=\"IceCream\" type=\"radio\" value=\"Vanilla\" /> Vanilla <br /> <input name=\"IceCream\" type=\"radio\" value=\"Chocolate\" /> Chocolate <br /><br /> <input name=\"Mobile\" type=\"checkbox\" value=\"Mood\" />Happy <br /> <input name=\"Mobile\" type=\"checkbox\" value=\"Mood\" />Very Happy <br /><br />Enter a date :<br /> <input min=\"0000-01-02\" name=\"bday\" type=\"date\" /><br /><br /> <input type=\"submit\" value=\"Submit\" /></form>";

}
