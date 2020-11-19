package com.vijay.aiodeveloper.strings;

/**
 * Created by Nabeel-PC on 11-07-2017.
 */

public class StringSql {

    public static final String Angular1="<p><span style=\"font-size: 18pt;\"><em><strong>Introduction</strong></em></span></p>\n" +
            "<p>AngularJS tutorial provides basic and advanced concepts of AngularJS. Our AngularJS tutorial is designed for beginners and professionals.</p>\n" +
            "<p>Angular JS is an open source JavaScript framework by Google to build web applications. It can be freely used, changed and shared by anyone.</p>\n" +
            "<p>Our AngularJS tutorial includes all topics of AngularJS such as mvc, expressions, directives, controllers, modules, scopes, filters, dom, forms, ajax, validation, services, animation, dependency injection, views, w3.css etc. There are also given AngularJS interview questions to help you better understand the AngularJS.</p>\n" +
            "<h2 class=\"h2\">Prerequisite</h2>\n" +
            "<p>Before learning AngularJS, you must have the basic knowledge of JavaScript.</p>\n" +
            "<h2 class=\"h2\">Audience</h2>\n" +
            "<p>Our AngularJS tutorial is designed to help beginners and professionals.</p>\n" +
            "<h2 class=\"h2\">Problem</h2>\n" +
            "<p>We assure that you will not find any problem in this AngularJS tutorial. But if there is any mistake, please post the problem in contact form.</p>";
    public static final String Angular2="<p>Angular JS is an open source JavaScript framework that is used to build web applications. It can be freely used, changed and shared by anyone.</p>\n" +
            "<p>Angular Js is developed by Google.</p>\n" +
            "<p>It is an excellent framework for building single phase applications and line of business applications.</p>";
    public static final String Angular3="<p>There are a lot of JavaScript frameworks for building web applications. So, it is a genuine question, why to use Angular JS.</p>\n" +
            "<p><strong>Following are the advantages of AngularJS over other JavaScript frameworks:</strong></p>\n" +
            "<ul class=\"points\">\n" +
            "<li><strong>Dependency Injection:</strong>&nbsp;Dependency Injection specifies a design pattern in which components are given their dependencies instead of hard coding them within the component.</li>\n" +
            "<li><strong>Two way data binding:</strong>&nbsp;AngularJS creates a two way data-binding between the select element and the orderProp model. orderProp is then used as the input for the orderBy filter.</li>\n" +
            "<li><strong>Testing:</strong>&nbsp;Angular JS is designed in a way that we can test right from the start. So, it is very easy to test any of its components through unit testing and end-to-end testing.</li>\n" +
            "<li><strong>Model View Controller:</strong>&nbsp;In Angular JS, it is very easy to develop application in a clean MVC way. You just have to split your application code into MVC components i.e. Model, View and the Controller.</li>\n" +
            "<li>Directives, filters, modules, routes etc.</li>\n" +
            "</ul>";
    public static final String Angular4="<p>MVC stands for Model View Controller. It is a software design pattern for developing web applications. It is very popular because it isolates the application logic from the user interface layer and supports separation of concerns.</p>\n" +
            "<p>The MVC pattern is made up of the following three parts:</p>\n" +
            "<ol>\n" +
            "<li><strong>Model:</strong>&nbsp;It is responsible for managing application data. It responds to the requests from view and to the instructions from controller to update itself.</li>\n" +
            "<li><strong>View:</strong>&nbsp;It is responsible for displaying all data or only a portion of data to the users. It also specifies the data in a particular format triggered by the controller's decision to present the data. They are script-based template systems such as JSP, ASP, PHP and very easy to integrate with AJAX technology.</li>\n" +
            "<li><strong>Controller:</strong>&nbsp;It is responsible to control the relation between models and views. It responds to user input and performs interactions on the data model objects. The controller receives input, validates it, and then performs business operations that modify the state of the data model.</li>\n" +
            "</ol>\n";
    public static final String Angular5="<h1 class=\"h1\"><span style=\"font-size: 12pt;\">AngularJS applications are a mix of HTML and JavaScript. The first thing you need is an HTML page.</span></h1>\n" +
            "<p><span style=\"font-size: 12pt;\">Second, you need to include the AngularJS JavaScript file in the HTML page so we can use AngularJS.</span></p>\n" +
            "<p><span style=\"font-size: 12pt;\">Note: You should always use the latest version of AngularJS</span></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<h2 class=\"h2\">AngularJS First Example</h2>\n" +
            "<p>Following is a simple \"Hello Word\" example made with AngularJS. It specifies the Model, View, Controller part of an AngularJS app.</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span>&nbsp;<span class=\"attribute\">lang</span>=<span class=\"attribute-value\">\"en\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">head</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"https://ajax.googleapis.com/ajax/libs/angularjs/1.2.5/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">head</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myapp\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"HelloController\"</span>&nbsp;<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>Hello&nbsp;{{helloTo.title}}&nbsp;!<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">angular.module(\"myapp\",&nbsp;[])&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;.controller(\"HelloController\",&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.helloTo</span>&nbsp;=&nbsp;{};&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.helloTo.title</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"World,&nbsp;AngularJS\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;);&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><span style=\"font-size: 14pt;\"><strong>OUTPUT:- &nbsp;</strong></span></p>\n" +
            "<h2 class=\"ng-binding\">Hello World, AngularJS !</h2>\n" +
            "<p>&nbsp;</p>\n" +
            "<h3 class=\"h3\">View Part:-</h3>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"HelloController\"</span>&nbsp;<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>Hello&nbsp;{{helloTo.title}}&nbsp;!<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<h3 class=\"h3\">Controller Part:-</h3>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">angular.module(\"myapp\",&nbsp;[])&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;.controller(\"HelloController\",&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.helloTo</span>&nbsp;=&nbsp;{};&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.helloTo.title</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"World,&nbsp;AngularJS\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;});&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>";
    public static final String Angular6="<h1 class=\"h1\">AngularJS Data Binding</h1>\n" +
            "<p>Data binding is a very useful and powerful feature used in software development technologies. It acts as a bridge between the view and business logic of the application.</p>\n" +
            "<p>AngularJS follows Two-Way data binding model.</p>\n" +
            "<h2 class=\"h2\">One-Way Data Binding</h2>\n" +
            "<p>The one-way data binding is an approach where a value is taken from the data model and inserted into an HTML element. There is no way to update model from view. It is used in classical template systems. These systems bind data in only one direction.</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<h2 class=\"h2\">Two-Way Data Binding</h2>\n" +
            "<p>Data-binding in Angular apps is the automatic synchronization of data between the model and view components.</p>\n" +
            "<p>Data binding lets you treat the model as the single-source-of-truth in your application. The view is a projection of the model at all times. If the model is changed, the view reflects the change and vice versa.</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Example:-</p>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"\"</span>&nbsp;<span class=\"attribute\">ng-init</span>=<span class=\"attribute-value\">\"firstName='Ajeet'\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Input&nbsp;something&nbsp;in&nbsp;the&nbsp;input&nbsp;box:<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Name:&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>=<span class=\"attribute-value\">\"text\"</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"firstName\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>You&nbsp;wrote:&nbsp;{{&nbsp;firstName&nbsp;}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;</li>\n" +
            "</ol>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>In the above example, the {{ firstName }} expression is an AngularJS data binding expression. Data binding in AngularJS binds AngularJS expressions with AngularJS data.</p>\n" +
            "<p>{{ firstName }} is bound with ng-model=\"firstName\".</p>\n" +
            "<p>Let's take <strong>another example</strong> where two text fields are bound together with two ng-model directives:</p>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">data-ng-app</span>=<span class=\"attribute-value\">\"\"</span>&nbsp;<span class=\"attribute\">data-ng-init</span>=<span class=\"attribute-value\">\"quantity=1;price=20\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>Cost&nbsp;Calculator<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">Quantity:&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>=<span class=\"attribute-value\">\"number\"</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"quantity\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">Price:&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>=<span class=\"attribute-value\">\"number\"</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"price\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">b</span><span class=\"tag\">&gt;</span>Total&nbsp;in&nbsp;rupees:<span class=\"tag\">&lt;/</span><span class=\"tag-name\">b</span><span class=\"tag\">&gt;</span>&nbsp;{{quantity&nbsp;*&nbsp;price}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;</li>\n" +
            "</ol>";
    public static final String Angular7="<p>In AngularJS, expressions are used to bind application data to HTML. AngularJS resolves the expression, and return the result exactly where the expression is written.</p>\n" +
            "<p>Expressions are written inside double braces {{expression}}.They can also be written inside a directive:</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\"><span class=\"attribute\">ng-bind</span>=<span class=\"attribute-value\">\"expression\"</span>.&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<p>AnularJS expressions are very similar to JavaScript expressions. They can contain literals, operators, and variables. <strong>For example</strong>:</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">{{ 10 + 10 }}&nbsp;or&nbsp;{{&nbsp;firstName&nbsp;+&nbsp;\"&nbsp;\"&nbsp;+&nbsp;lastName&nbsp;}}</li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">AngularJS Expressions Example</h2>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;ng-app<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>simple example:&nbsp;{{ 10 + 10 }}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;</li>\n" +
            "</ol>\n" +
            "<p><strong>Note:</strong>&nbsp;If you remove the directive \"ng-app\", HTML will display the expression without solving it.</p>\n" +
            "<p><strong>See example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>If&nbsp;you&nbsp;remove&nbsp;the&nbsp;directive&nbsp;\"ng-app\",&nbsp;HTML&nbsp;will&nbsp;display&nbsp;the&nbsp;expression&nbsp;without&nbsp;solving&nbsp;it.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>simple example:&nbsp;&nbsp;{{ 10 + 10 }}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "<p>You can also write expressions wherever you want, AngularJS will resolve the expression and return the result.</p>\n" +
            "<p>Let's take an example to change the color of input box by changing its value.</p>\n" +
            "<p><strong>See example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Change&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;input&nbsp;field:<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"\"</span>&nbsp;<span class=\"attribute\">ng-init</span>=<span class=\"attribute-value\">\"myCol='blue'\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">style</span>=<span class=\"attribute-value\">\"background-color:{{myCol}}\"</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"myCol\"</span>&nbsp;<span class=\"attribute\">value</span>=<span class=\"attribute-value\">\"{{myCol}}\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>AngularJS&nbsp;resolves&nbsp;the&nbsp;expression&nbsp;and&nbsp;returns&nbsp;the&nbsp;result.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>The&nbsp;background&nbsp;color&nbsp;of&nbsp;the&nbsp;input&nbsp;box&nbsp;will&nbsp;be&nbsp;whatever&nbsp;you&nbsp;write&nbsp;in&nbsp;the&nbsp;input&nbsp;field.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">AngularJS Numbers</h2>\n" +
            "<p>AngularJS numbers are similar to JavaScript numbers.</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&nbsp;&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"\"</span>&nbsp;<span class=\"attribute\">ng-init</span>=<span class=\"attribute-value\">\"quantity=10;price=10\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Total&nbsp;in&nbsp;dollar:&nbsp;{{&nbsp;quantity&nbsp;* price}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "<p>We can use the same example by using ng-bind:</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"\"</span>&nbsp;<span class=\"attribute\">ng-init</span>=<span class=\"attribute-value\">\"quantity=10;price=10\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Total&nbsp;in&nbsp;dollar:&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">span</span>&nbsp;<span class=\"attribute\">ng-bind</span>=<span class=\"attribute-value\">\"quantity&nbsp;*&nbsp;price\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">span</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">AngularJS Strings</h2>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"\"</span>&nbsp;<span class=\"attribute\">ng-init</span>=<span class=\"attribute-value\">\"firstName='Nitin';lastName='Goyal'\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>My&nbsp;full&nbsp;name&nbsp;is:&nbsp;{{&nbsp;firstName&nbsp;+&nbsp;\"&nbsp;\"&nbsp;+&nbsp;lastName&nbsp;}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "<p><strong>Same example with ng-bind:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"\"</span>&nbsp;<span class=\"attribute\">ng-init</span>=<span class=\"attribute-value\">\"firstName='Neelima';lastName='Pandey'\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>My&nbsp;full&nbsp;name&nbsp;is:&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">span</span>&nbsp;<span class=\"attribute\">ng-bind</span>=<span class=\"attribute-value\">\"firstName&nbsp;+&nbsp;'&nbsp;'&nbsp;+&nbsp;lastName\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">span</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;</li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">AngularJS Objects</h2>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"\"</span>&nbsp;<span class=\"attribute\">ng-init</span>=<span class=\"attribute-value\">\"person={firstName:'Nidhi',lastName:'Kumari'}\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>My&nbsp;name&nbsp;is&nbsp;{{&nbsp;person.firstName&nbsp;}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "<p><strong>Same example with ng-bind:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"\"</span>&nbsp;<span class=\"attribute\">ng-init</span>=<span class=\"attribute-value\">\"person={firstName:'Vijay',lastName:'Verma'}\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>The&nbsp;name&nbsp;is&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">span</span>&nbsp;<span class=\"attribute\">ng-bind</span>=<span class=\"attribute-value\">\"person.firstName\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">span</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">AngularJS Arrays</h2>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"\"</span>&nbsp;<span class=\"attribute\">ng-init</span>=<span class=\"attribute-value\">\"points=[1,15,19,2,40]\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>The&nbsp;first&nbsp;result&nbsp;is&nbsp;{{&nbsp;points[0]&nbsp;}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "<p><strong>Same example with ng-bind:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"\"</span>&nbsp;<span class=\"attribute\">ng-init</span>=<span class=\"attribute-value\">\"points=[1,15,19,2,40]\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>The&nbsp;first&nbsp;result&nbsp;is&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">span</span>&nbsp;<span class=\"attribute\">ng-bind</span>=<span class=\"attribute-value\">\"points[0]\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">span</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">Difference between AngularJS Expressions and JavaScript expressions:</h2>\n" +
            "<ul class=\"points\">\n" +
            "<li>AngularJS expressions can be written inside HTML, while JavaScript expressions cannot.</li>\n" +
            "<li>AngularJS expressions support filters, while JavaScript expressions do not.</li>\n" +
            "<li>AngularJS expressions do not support conditionals, loops, and exceptions, while JavaScript expressions do.</li>\n" +
            "</ul>\n" +
            "<h2 class=\"h2\">Similarity between AngularJS Expressions and JavaScript expressions:</h2>\n" +
            "<ul>\n" +
            "<li>AngularJS expressions and JavaScript expressions both can contain literals, operators and variables.</li>\n" +
            "</ul>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>";
    public static final String Angular8="<h1 class=\"h1\">AngularJS Directives</h1>\n" +
            "<p>AngularJS facilitates you to extend HTML with new attributes. These attributes are called directives.</p>\n" +
            "<p>There is a set of built-in directive in AngularJS which offers functionality to your applications. You can also define your own directives.</p>\n" +
            "<p>Directives are special attributes starting with ng- prefix. Following are the most common directives:</p>\n" +
            "<ul class=\"points\">\n" +
            "<li>ng-app: This directive starts an AngularJS Application.</li>\n" +
            "<li>ng-init: This directive initializes application data.</li>\n" +
            "<li>ng-model: This directive defines the model that is variable to be used in AngularJS.</li>\n" +
            "<li>ng-repeat: This directive repeats html elements for each item in a collection.</li>\n" +
            "</ul>\n" +
            "<hr />\n" +
            "<h2 class=\"h2\">ng-app directive</h2>\n" +
            "<p>ng-app directive defines the root element. It starts an AngularJS Application and automatically initializes or bootstraps the application when web page containing AngularJS Application is loaded. It is also used to load various AngularJS modules in AngularJS Application.</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<p>In following example, we've defined a default AngularJS application using ng-app attribute of a div element.</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;...&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<hr />\n" +
            "<h2 class=\"h2\">ng-init directive</h2>\n" +
            "<p>ng-init directive initializes an AngularJS Application data. It defines the initial values for an AngularJS application.</p>\n" +
            "<p>In following example, we'll initialize an array of countries. We're using JSON syntax to define array of countries.</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"\"</span>&nbsp;<span class=\"attribute\">ng-init</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"countries&nbsp;=&nbsp;[{locale:'en-IND',name:'India'},&nbsp;{locale:'en-PAK',name:'Pakistan'},&nbsp;{locale:'en-AUS',name:'Australia'}]\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;...&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<hr />\n" +
            "<h2 class=\"h2\">ng-model directive:</h2>\n" +
            "<p>ng-model directive defines the model/variable to be used in AngularJS Application.</p>\n" +
            "<p>In following example, we've defined a model named \"name\".</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;...&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Enter&nbsp;your&nbsp;Name:&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"text\"</span>&nbsp;<span class=\"attribute\">ng-model</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"name\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<hr />\n" +
            "<h2 class=\"h2\">ng-repeat directive</h2>\n" +
            "<p>ng-repeat directive repeats html elements for each item in a collection. In following example, we've iterated over array of countries.</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;...&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>List&nbsp;of&nbsp;Countries&nbsp;with&nbsp;locale:<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">ol</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">li</span>&nbsp;<span class=\"attribute\">ng-repeat</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"country&nbsp;in&nbsp;countries\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{{&nbsp;'Country:&nbsp;'&nbsp;+&nbsp;country.name&nbsp;+&nbsp;',&nbsp;Locale:&nbsp;'&nbsp;+&nbsp;country.locale&nbsp;}}&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">li</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">ol</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<h2 class=\"h2\">AngularJS directives Example</h2>\n" +
            "<p>Let's take an example to use all the above discussed directives:</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">head</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">title</span><span class=\"tag\">&gt;</span>AngularJS&nbsp;Directives<span class=\"tag\">&lt;/</span><span class=\"tag-name\">title</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">head</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>Sample&nbsp;Application<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"\"</span>&nbsp;<span class=\"attribute\">ng-init</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"countries&nbsp;=&nbsp;[{locale:'en-IND',name:'India'},&nbsp;{locale:'en-SA',name:'South Africa'},&nbsp;{locale:'en-AUS',name:'Australia'}]\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Enter&nbsp;your&nbsp;Name:&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"text\"</span>&nbsp;<span class=\"attribute\">ng-model</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"name\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Hello&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">span</span>&nbsp;<span class=\"attribute\">ng-bind</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"name\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">span</span><span class=\"tag\">&gt;</span>!<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>List&nbsp;of&nbsp;Countries&nbsp;with&nbsp;locale:<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">ol</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">li</span>&nbsp;<span class=\"attribute\">ng-repeat</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"country&nbsp;in&nbsp;countries\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{{&nbsp;'Country:&nbsp;'&nbsp;+&nbsp;country.name&nbsp;+&nbsp;',&nbsp;Locale:&nbsp;'&nbsp;+&nbsp;country.locale&nbsp;}}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">li</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">ol</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">How to add directives</h2>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;w3-test-directive<span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">var&nbsp;<span class=\"attribute\">app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">angular</span>.module(\"myApp\",&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">app.directive(\"w3TestDirective\",&nbsp;function()&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;template&nbsp;:&nbsp;\"This&nbsp;is&nbsp;a&nbsp;directive&nbsp;constructor.&nbsp;\"&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;};&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;</li>\n" +
            "</ol>\n" +
            "<p><strong>Output:- </strong>This is a directive constructor</p>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>";
    public static final String Angular9="<h1 class=\"h1\">AngularJS Controllers</h1>\n" +
            "<p>AngularJS controllers are used to control the flow of data of AngularJS application. A controller is defined using ng-controller directive. A controller is a JavaScript object containing attributes/properties and functions. Each controller accepts $scope as a parameter which refers to the application/module that controller is to control.</p>\n" +
            "<hr />\n" +
            "<h2 class=\"h2\">AngularJS Controller Example</h2>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"myCtrl\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">First&nbsp;Name:&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>=<span class=\"attribute-value\">\"text\"</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"firstName\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">br</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">Last&nbsp;Name:&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>=<span class=\"attribute-value\">\"text\"</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"lastName\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">br</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">br</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">Full&nbsp;Name:&nbsp;{{firstName&nbsp;+&nbsp;\"&nbsp;\"&nbsp;+&nbsp;lastName}}&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">var&nbsp;<span class=\"attribute\">app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">angular</span>.module('myApp',&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">app.controller('myCtrl',&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.firstName</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"Nitin\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.lastName</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"Goyal\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "<p><strong>Note:</strong></p>\n" +
            "<ul class=\"points\">\n" +
            "<li>Here, the AngularJS application runs inside the &lt;div&gt; is defined by ng-app=\"myApp\".</li>\n" +
            "<li>The AngularJS directive is ng-controller=\"myCtrl\" attribute.</li>\n" +
            "<li>The myCtrl function is a JavaScript function.</li>\n" +
            "<li>AngularJS will invoke the controller with a $scope object.</li>\n" +
            "<li>In AngularJS, $scope is the application object (the owner of application variables and functions).</li>\n" +
            "<li>The controller creates two properties (variables) in the scope (firstName and lastName).</li>\n" +
            "<li>The ng-model directives bind the input fields to the controller properties (firstName and lastName).</li>\n" +
            "</ul>\n" +
            "<h2 class=\"h2\">AngularJS controller example with methods (variables as functions)</h2>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"personCtrl\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">First&nbsp;Name:&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>=<span class=\"attribute-value\">\"text\"</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"firstName\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">br</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">Last&nbsp;Name:&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>=<span class=\"attribute-value\">\"text\"</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"lastName\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">br</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">br</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">Full&nbsp;Name:&nbsp;{{fullName()}}&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">var&nbsp;<span class=\"attribute\">app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">angular</span>.module('myApp',&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">app.controller('personCtrl',&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.firstName</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"Rajat\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.lastName</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"Gupta\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.fullName</span>&nbsp;=&nbsp;<span class=\"attribute-value\">function</span>()&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;$scope.firstName&nbsp;+&nbsp;\"&nbsp;\"&nbsp;+&nbsp;$scope.lastName;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;};&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;</li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">AngularJS Controller in external files</h2>\n" +
            "<p>In larger applications, generally the controllers are stored in external files.</p>\n" +
            "<p>Create an external file named \"personController.js\" to store controller.</p>\n" +
            "<p>Here, \"personController.js\" is:</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;angular.module('myApp',&nbsp;[]).controller('personCtrl',&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.firstName</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"Aryan\"</span>,&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.lastName</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"Khanna\"</span>,&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.fullName</span>&nbsp;=&nbsp;<span class=\"attribute-value\">function</span>()&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;$scope.firstName&nbsp;+&nbsp;\"&nbsp;\"&nbsp;+&nbsp;$scope.lastName;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">});&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"personCtrl\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">First&nbsp;Name:&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>=<span class=\"attribute-value\">\"text\"</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"firstName\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">br</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">Last&nbsp;Name:&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>=<span class=\"attribute-value\">\"text\"</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"lastName\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">br</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">br</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">Full&nbsp;Name:&nbsp;{{firstName&nbsp;+&nbsp;\"&nbsp;\"&nbsp;+&nbsp;lastName}}&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"personController.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>";
    public static final String Angular10="<h1 class=\"h1\">AngularJS Module</h1>\n" +
            "<p>In AngularJS, a module defines an application. It is a container for the different parts of your application like controller, services, filters, directives etc.</p>\n" +
            "<p>A module is used as a Main() method. Controller always belongs to a module.</p>\n" +
            "<hr />\n" +
            "<h2 class=\"h2\">How to create a module</h2>\n" +
            "<p>The angular object's module() method is used to create a module. It is also called AngularJS function angular.module</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span><span class=\"tag\">&gt;</span>...<span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">var&nbsp;<span class=\"attribute\">app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">angular</span>.module(\"myApp\",&nbsp;[]);&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<p>Here, \"myApp\" specifies an HTML element in which the application will run.</p>\n" +
            "<p>Now we can add controllers, directives, filters, and more, to AngularJS application.</p>\n" +
            "<hr />\n" +
            "<h2 class=\"h2\">How to add controller to a module</h2>\n" +
            "<p>If you want to add a controller to your application refer to the controller with the ng-controller directive.</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"myCtrl\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">{{&nbsp;firstName&nbsp;+&nbsp;\"&nbsp;\"&nbsp;+&nbsp;lastName&nbsp;}}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">var&nbsp;<span class=\"attribute\">app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">angular</span>.module(\"myApp\",&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">app.controller(\"myCtrl\",&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.firstName</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"Nitin\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.lastName</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"Goyal\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">How to add directive to a module</h2>\n" +
            "<p>AnglarJS directives are used to add functionality to your application. You can also add your own directives for your applications.</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<h2 class=\"h2\">How to add directives</h2>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;w3-test-directive<span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">var&nbsp;<span class=\"attribute\">app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">angular</span>.module(\"myApp\",&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">app.directive(\"w3TestDirective\",&nbsp;function()&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;template&nbsp;:&nbsp;\"This&nbsp;is&nbsp;a&nbsp;directive&nbsp;constructor.&nbsp;\"&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;};&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">Modules and controllers in file</h2>\n" +
            "<p>In AngularJS applications, you can put the module and the controllers in JavaScript files.</p>\n" +
            "<p>In this example, \"myApp.js\" contains an application module definition, while \"myCtrl.js\" contains the controller:</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"myApp.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"myCtrl.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<p><strong>Here \"myApp.js\" contains:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">app.controller(\"myCtrl\",&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.firstName</span>&nbsp;&nbsp;&nbsp;&nbsp;=&nbsp;<span class=\"attribute-value\">\"Ajeet\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.lastName</span>=&nbsp;<span class=\"attribute-value\">\"Maurya\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">});&nbsp;&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<p><strong>Here \"myCtrl.js\" contains:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"myCtrl\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">{{&nbsp;firstName&nbsp;+&nbsp;\"&nbsp;\"&nbsp;+&nbsp;lastName&nbsp;}}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<p><strong>This example can also be written as:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"myCtrl\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">{{&nbsp;firstName&nbsp;+&nbsp;\"&nbsp;\"&nbsp;+&nbsp;lastName&nbsp;}}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">var&nbsp;<span class=\"attribute\">app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">angular</span>.module(\"myApp\",&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">app.controller(\"myCtrl\",&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.firstName</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"Rishabh\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.lastName</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"Jain\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>";
    public static final String Angular11="<h1 class=\"h1\">AngularJS Scopes</h1>\n" +
            "<p>The Scope is an object that is specified as a binding part between the HTML (view) and the JavaScript (controller). It plays a role of joining controller with the views. It is available for both the view and the controller.</p>\n" +
            "<hr />\n" +
            "<h2 class=\"h2\">How to use Scope</h2>\n" +
            "<p>To make a controller in AngularJS, you have to pass the $scope object as an argument.</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&nbsp;&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"myCtrl\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>{{carname}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">var&nbsp;<span class=\"attribute\">app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">angular</span>.module('myApp',&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">app.controller('myCtrl',&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.carname</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"mercedes\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>The&nbsp;property&nbsp;\"carname\"&nbsp;was&nbsp;made&nbsp;in&nbsp;the&nbsp;controller,&nbsp;and&nbsp;can&nbsp;be&nbsp;referred&nbsp;to&nbsp;in&nbsp;the&nbsp;view&nbsp;by&nbsp;using&nbsp;the&nbsp;{{&nbsp;}}&nbsp;brackets.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>";
    public static final String Angular12="<h1 class=\"h1\">AngularJS Dependency Injection</h1>\n" +
            "<p>AngularJS comes with a built-in dependency injection mechanism. It facilitates you to divide your application into multiple different types of components which can be injected into each other as dependencies.</p>\n" +
            "<p>Dependency Injection is a software design pattern that specifies how components get holds of their dependencies. In this pattern, components are given their dependencies instead of coding them within the component.</p>\n" +
            "<p>Modularizing your application makes it easier to reuse, configure and test the components in your application. Following are the core types of objects and components:</p>\n" +
            "<ul class=\"points\">\n" +
            "<li>value</li>\n" +
            "<li>factory</li>\n" +
            "<li>service</li>\n" +
            "<li>provider</li>\n" +
            "<li>constant</li>\n" +
            "</ul>\n" +
            "<p>These objects and components can be injected into each other using AngularJS Dependency Injection.</p>\n" +
            "<hr />\n" +
            "<h2 class=\"h2\">Value</h2>\n" +
            "<p>In AngularJS, value is a simple object. It can be a number, string or JavaScript object. It is used to pass values in factories, services or controllers during run and config phase.</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-j\" start=\"1\">\n" +
            "<li class=\"alt\"><span class=\"comment\">//define&nbsp;a&nbsp;module</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">var&nbsp;myModule&nbsp;=&nbsp;angular.module(<span class=\"string\">\"myModule\"</span>,&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"comment\">//create&nbsp;a&nbsp;value&nbsp;object&nbsp;and&nbsp;pass&nbsp;it&nbsp;a&nbsp;data.&nbsp;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">myModule.value(<span class=\"string\">\"numberValue\"</span>,&nbsp;<span class=\"number\">100</span>);&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">myModule.value(<span class=\"string\">\"stringValue\"</span>,&nbsp;<span class=\"string\">\"abc\"</span>);&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">myModule.value(<span class=\"string\">\"objectValue\"</span>,&nbsp;{&nbsp;val1&nbsp;:&nbsp;<span class=\"number\">123</span>,&nbsp;val2&nbsp;:&nbsp;<span class=\"string\">\"abc\"</span>}&nbsp;);&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<p>Here, values are defined using the value() function on the module. The first parameter specifies the name of the value, and the second parameter is the value itself. Factories, services and controllers can now reference these values by their name.</p>\n" +
            "<h2 class=\"h3\">Injecting a value</h2>\n" +
            "<p>To inject a value into AngularJS controller function, add a parameter with the same when the value is defined.</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-j\" start=\"1\">\n" +
            "<li class=\"alt\">var&nbsp;myModule&nbsp;=&nbsp;angular.module(<span class=\"string\">\"myModule\"</span>,&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">myModule.value(<span class=\"string\">\"numberValue\"</span>,&nbsp;<span class=\"number\">100</span>);&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">myModule.controller(<span class=\"string\">\"MyController\"</span>,&nbsp;function($scope,&nbsp;numberValue)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;console.log(numberValue);&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">});&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<hr />\n" +
            "<h2 class=\"h2\">Factory</h2>\n" +
            "<p>Factory is a function that is used to return value. When a service or controller needs a value injected from the factory, it creates the value on demand. It normally uses a factory function to calculate and return the value.</p>\n" +
            "<p>Let's take an example that defines a factory on a module, and a controller which gets the factory created value injected:</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-j\" start=\"1\">\n" +
            "<li class=\"alt\">var&nbsp;myModule&nbsp;=&nbsp;angular.module(<span class=\"string\">\"myModule\"</span>,&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">myModule.factory(<span class=\"string\">\"myFactory\"</span>,&nbsp;function()&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"keyword\">return</span>&nbsp;<span class=\"string\">\"a&nbsp;value\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">myModule.controller(<span class=\"string\">\"MyController\"</span>,&nbsp;function($scope,&nbsp;myFactory)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">console.log(myFactory);&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">});&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<h2 class=\"h3\">Injecting values into factory</h2>\n" +
            "<p>To inject a value into AngularJS controller function, add a parameter with the same when the value is defined.</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-j\" start=\"1\">\n" +
            "<li class=\"alt\">var&nbsp;myModule&nbsp;=&nbsp;angular.module(<span class=\"string\">\"myModule\"</span>,&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">myModule.value(<span class=\"string\">\"numberValue\"</span>,&nbsp;<span class=\"number\">100</span>);&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">myModule.controller(<span class=\"string\">\"MyController\"</span>,&nbsp;function($scope,&nbsp;numberValue)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;console.log(numberValue);&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">});&nbsp;</li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">Service</h2>\n" +
            "<p>In AngularJS, service is a JavaScript object which contains a set of functions to perform certain tasks. Services are created by using service() function on a module and then injected into controllers.</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-j\" start=\"1\">\n" +
            "<li class=\"alt\"><span class=\"comment\">//define&nbsp;a&nbsp;module</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">var&nbsp;mainApp&nbsp;=&nbsp;angular.module(<span class=\"string\">\"mainApp\"</span>,&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">...&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"comment\">//create&nbsp;a&nbsp;service&nbsp;which&nbsp;defines&nbsp;a&nbsp;method&nbsp;square&nbsp;to&nbsp;return&nbsp;square&nbsp;of&nbsp;a&nbsp;number.</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">mainApp.service(<span class=\"string\">'CalcService'</span>,&nbsp;function(MathService){&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;<span class=\"keyword\">this</span>.square&nbsp;=&nbsp;function(a)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"keyword\">return</span>&nbsp;MathService.multiply(a,a);&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"comment\">//inject&nbsp;the&nbsp;service&nbsp;\"CalcService\"&nbsp;into&nbsp;the&nbsp;controller</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">mainApp.controller(<span class=\"string\">'CalcController'</span>,&nbsp;function($scope,&nbsp;CalcService,&nbsp;defaultInput)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;$scope.number&nbsp;=&nbsp;defaultInput;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;$scope.result&nbsp;=&nbsp;CalcService.square($scope.number);&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;$scope.square&nbsp;=&nbsp;function()&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$scope.result&nbsp;=&nbsp;CalcService.square($scope.number);&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">});&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<hr />\n" +
            "<h2 class=\"h2\">Provider</h2>\n" +
            "<p>In AngularJS, provider is used internally to create services, factory etc. during config phase (phase during which AngularJS bootstraps itself). It is the most flexible form of factory you can create. Provider is a special factory method with a get() function which is used to return the value/service/factory.</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-j\" start=\"1\">\n" +
            "<li class=\"alt\"><span class=\"comment\">//define&nbsp;a&nbsp;module</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">var&nbsp;mainApp&nbsp;=&nbsp;angular.module(<span class=\"string\">\"mainApp\"</span>,&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">...&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"comment\">//create&nbsp;a&nbsp;service&nbsp;using&nbsp;provider&nbsp;which&nbsp;defines&nbsp;a&nbsp;method&nbsp;square&nbsp;to&nbsp;return&nbsp;square&nbsp;of&nbsp;a&nbsp;number.</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">mainApp.config(function($provide)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;$provide.provider(<span class=\"string\">'MathService'</span>,&nbsp;function()&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"keyword\">this</span>.$get&nbsp;=&nbsp;function()&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;var&nbsp;factory&nbsp;=&nbsp;{};&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;factory.multiply&nbsp;=&nbsp;function(a,&nbsp;b)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"keyword\">return</span>&nbsp;a&nbsp;*&nbsp;b;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"keyword\">return</span>&nbsp;factory;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;};&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;});&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">});&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<hr />\n" +
            "<h2 class=\"h2\">Constants</h2>\n" +
            "<p>You cannot inject values into the module.config() function. Instead constants are used to pass values at config phase.</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-j\" start=\"1\">\n" +
            "<li class=\"alt\">mainApp.constant(<span class=\"string\">\"configParam\"</span>,&nbsp;<span class=\"string\">\"constant&nbsp;value\"</span>);&nbsp;&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<p>Let's take an example to deploy all above mentioned directives.</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">head</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">title</span><span class=\"tag\">&gt;</span>AngularJS&nbsp;Dependency&nbsp;Injection<span class=\"tag\">&lt;/</span><span class=\"tag-name\">title</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">head</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>AngularJS&nbsp;Sample&nbsp;Application<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"mainApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"CalcController\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Enter&nbsp;a&nbsp;number:&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"number\"</span>&nbsp;<span class=\"attribute\">ng-model</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"number\"</span>&nbsp;<span class=\"tag\">/&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">button</span>&nbsp;<span class=\"attribute\">ng-click</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"square()\"</span><span class=\"tag\">&gt;</span>X<span class=\"tag\">&lt;</span><span class=\"tag-name\">sup</span><span class=\"tag\">&gt;</span>2<span class=\"tag\">&lt;/</span><span class=\"tag-name\">sup</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">button</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Result:&nbsp;{{result}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;var&nbsp;<span class=\"attribute\">mainApp</span>&nbsp;=&nbsp;<span class=\"attribute-value\">angular</span>.module(\"mainApp\",&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mainApp.config(function($provide)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$provide.provider('MathService',&nbsp;function()&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.$<span class=\"attribute\">get</span>&nbsp;=&nbsp;<span class=\"attribute-value\">function</span>()&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;var&nbsp;<span class=\"attribute\">factory</span>&nbsp;=&nbsp;{};&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"attribute\">factory.multiply</span>&nbsp;=&nbsp;<span class=\"attribute-value\">function</span>(a,&nbsp;b)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;a&nbsp;*&nbsp;b;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;factory;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;};&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;});&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;});&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mainApp.value(\"defaultInput\", 20);&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mainApp.factory('MathService',&nbsp;function()&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;var&nbsp;<span class=\"attribute\">factory</span>&nbsp;=&nbsp;{};&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"attribute\">factory.multiply</span>&nbsp;=&nbsp;<span class=\"attribute-value\">function</span>(a,&nbsp;b)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;a&nbsp;*&nbsp;b;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;factory;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;});&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mainApp.service('CalcService',&nbsp;function(MathService){&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"attribute\">this.square</span>&nbsp;=&nbsp;<span class=\"attribute-value\">function</span>(a)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;MathService.multiply(a,a);&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;});&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mainApp.controller('CalcController',&nbsp;function($scope,&nbsp;CalcService,&nbsp;defaultInput)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.number</span>&nbsp;=&nbsp;<span class=\"attribute-value\">defaultInput</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.result</span>&nbsp;=&nbsp;<span class=\"attribute-value\">CalcService</span>.square($scope.number);&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.square</span>&nbsp;=&nbsp;<span class=\"attribute-value\">function</span>()&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.result</span>&nbsp;=&nbsp;<span class=\"attribute-value\">CalcService</span>.square($scope.number);&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;});&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>";

    public static final String Angular13="<h1 class=\"h1\">AngularJS Filters</h1>\n" +
            "<p>In AngularJS, filters are used to format data.</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<h2 class=\"h2\">How to add filters to expressions</h2>\n" +
            "<p>You can add filters to expressions by using the pipe character |, followed by a filter.</p>\n" +
            "<p>In this example, the uppercase filter format strings to upper case:</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&nbsp;&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"personCtrl\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>The&nbsp;name&nbsp;is&nbsp;{{&nbsp;firstName&nbsp;|&nbsp;uppercase&nbsp;}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">angular.module('myApp',&nbsp;[]).controller('personCtrl',&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.firstName</span>&nbsp;= \"Nitin<span class=\"attribute-value\">\"</span>,&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.lastName</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"Goyal\"</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;</li>\n" +
            "</ol>\n" +
            "<p>&nbsp;</p>\n" +
            "<p>Let's apply the lowercase filter into the same example:-</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"personCtrl\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>The&nbsp;name&nbsp;is&nbsp;{{&nbsp;firstName&nbsp;|&nbsp;lowercase&nbsp;}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">angular.module('myApp',&nbsp;[]).controller('personCtrl',&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.firstName</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"Sonoo\"</span>,&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.lastName</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"Jaiswal\"</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">How to add filters to directives</h2>\n" +
            "<p>Filters can be added to directives, like ng-repeat, by using the pipe character |, followed by a filter.</p>\n" +
            "<p><strong>Let's take an example:</strong></p>\n" +
            "<p>In this example, orderBy filter is used to sort an array.</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&nbsp;&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"namesCtrl\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Looping&nbsp;with&nbsp;objects:<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">ul</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">li</span>&nbsp;<span class=\"attribute\">ng-repeat</span>=<span class=\"attribute-value\">\"x&nbsp;in&nbsp;names&nbsp;|&nbsp;orderBy:'country'\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;{{&nbsp;x.name&nbsp;+&nbsp;',&nbsp;'&nbsp;+&nbsp;x.country&nbsp;}}&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">li</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">ul</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">angular.module('myApp',&nbsp;[]).controller('namesCtrl',&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.names</span>&nbsp;=&nbsp;[&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Nitin',country:'India'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Abhishek',country:'Pakistan'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Vijay',country:'India'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Rajat',country:'India'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Rishabh',country:'Pakistan'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Neelima',country:'India'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Nidhi',country:'India'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Devesh',country:'UK'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Naman',country:'India'}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;];&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;</li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">The filter Filter</h2>\n" +
            "<p>The filter Filter can only be used on arrays because it selects a subset of an array. It returns an array containing only the matching items.</p>\n" +
            "<p><strong>Let's take an example:</strong></p>\n" +
            "<p>This example will return the names that contain the letter \"o\".</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"namesCtrl\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">ul</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">li</span>&nbsp;<span class=\"attribute\">ng-repeat</span>=<span class=\"attribute-value\">\"x&nbsp;in&nbsp;names&nbsp;|&nbsp;filter&nbsp;:&nbsp;'i'\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;{{&nbsp;x&nbsp;}}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">li</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">ul</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">angular.module('myApp',&nbsp;[]).controller('namesCtrl',&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.names</span>&nbsp;=&nbsp;[&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">'Nitin',&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">'Vijay',&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">'Rajat',&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">'Abhishek',&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">'Rishabh',&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">'Devesh',&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">'Neelima',&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">'Nidhi',&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">'Naman'&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;];&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>This&nbsp;example&nbsp;displays&nbsp;only&nbsp;the&nbsp;names&nbsp;containing&nbsp;the&nbsp;letter&nbsp;\"i\".<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">Filter an array based on user input</h2>\n" +
            "<p>You can use the value of the input field as an expression in a filter by setting the ng-model directive on an input field.</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"namesCtrl\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Type&nbsp;a&nbsp;letter&nbsp;in&nbsp;the&nbsp;input&nbsp;field:<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>=<span class=\"attribute-value\">\"text\"</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"test\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">ul</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">li</span>&nbsp;<span class=\"attribute\">ng-repeat</span>=<span class=\"attribute-value\">\"x&nbsp;in&nbsp;names&nbsp;|&nbsp;filter:test\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;{{&nbsp;x&nbsp;}}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">li</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">ul</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">angular.module('myApp',&nbsp;[]).controller('namesCtrl',&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.names</span>&nbsp;=&nbsp;[&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'Ramesh',&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">'Pooja',&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">'Mahesh',&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">'Ramanujam',&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">'Osama',&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">'Iqbal',&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">'Karl',&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">'Johnson',&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">'Alex'&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;];&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>The&nbsp;list&nbsp;will&nbsp;only&nbsp;contain&nbsp;the&nbsp;names&nbsp;matching&nbsp;the&nbsp;filter.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">Sort an array based on user input</h2>\n" +
            "<p>You can sort an array according to the table columns.</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Click&nbsp;the&nbsp;table&nbsp;headers&nbsp;to&nbsp;change&nbsp;the&nbsp;sorting&nbsp;order:<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"namesCtrl\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">table</span>&nbsp;<span class=\"attribute\">border</span>=<span class=\"attribute-value\">\"1\"</span>&nbsp;<span class=\"attribute\">width</span>=<span class=\"attribute-value\">\"100%\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">th</span>&nbsp;<span class=\"attribute\">ng-click</span>=<span class=\"attribute-value\">\"orderByMe('name')\"</span><span class=\"tag\">&gt;</span>Name<span class=\"tag\">&lt;/</span><span class=\"tag-name\">th</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">th</span>&nbsp;<span class=\"attribute\">ng-click</span>=<span class=\"attribute-value\">\"orderByMe('country')\"</span><span class=\"tag\">&gt;</span>Country<span class=\"tag\">&lt;/</span><span class=\"tag-name\">th</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span>&nbsp;<span class=\"attribute\">ng-repeat</span>=<span class=\"attribute-value\">\"x&nbsp;in&nbsp;names&nbsp;|&nbsp;orderBy:myOrderBy\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>{{x.name}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>{{x.country}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">table</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">angular.module('myApp',&nbsp;[]).controller('namesCtrl',&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.names</span>&nbsp;=&nbsp;[&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Ramesh',country:'India'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Alex',country:'USA'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Pooja',country:'India'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Mahesh',country:'India'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Iqbal',country:'Pakistan'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Ramanujam',country:'India'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Osama',country:'Iraq'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Johnson',country:'UK'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Karl',country:'Russia'}&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;];&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.orderByMe</span>&nbsp;=&nbsp;<span class=\"attribute-value\">function</span>(x)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.myOrderBy</span>&nbsp;=&nbsp;<span class=\"attribute-value\">x</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;</li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">AngularJS Custom Filters</h2>\n" +
            "<p>You can create your own filters by register a new filter factory function with your module.</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Click&nbsp;the&nbsp;table&nbsp;headers&nbsp;to&nbsp;change&nbsp;the&nbsp;sorting&nbsp;order:<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"namesCtrl\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">table</span>&nbsp;<span class=\"attribute\">border</span>=<span class=\"attribute-value\">\"1\"</span>&nbsp;<span class=\"attribute\">width</span>=<span class=\"attribute-value\">\"100%\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">th</span>&nbsp;<span class=\"attribute\">ng-click</span>=<span class=\"attribute-value\">\"orderByMe('name')\"</span><span class=\"tag\">&gt;</span>Name<span class=\"tag\">&lt;/</span><span class=\"tag-name\">th</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">th</span>&nbsp;<span class=\"attribute\">ng-click</span>=<span class=\"attribute-value\">\"orderByMe('country')\"</span><span class=\"tag\">&gt;</span>Country<span class=\"tag\">&lt;/</span><span class=\"tag-name\">th</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span>&nbsp;<span class=\"attribute\">ng-repeat</span>=<span class=\"attribute-value\">\"x&nbsp;in&nbsp;names&nbsp;|&nbsp;orderBy:myOrderBy\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>{{x.name}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>{{x.country}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">table</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">angular.module('myApp',&nbsp;[]).controller('namesCtrl',&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.names</span>&nbsp;=&nbsp;[&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Ramesh',country:'India'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Alex',country:'USA'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Pooja',country:'India'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Mahesh',country:'India'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Iqbal',country:'Pakistan'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Ramanujam',country:'India'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Osama',country:'Iraq'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Johnson',country:'UK'},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Karl',country:'Russia'}&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;];&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.orderByMe</span>&nbsp;=&nbsp;<span class=\"attribute-value\">function</span>(x)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.myOrderBy</span>&nbsp;=&nbsp;<span class=\"attribute-value\">x</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<p>&nbsp;</p>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>";
    public static final String Angular14="<h1 class=\"h1\">AngularJS Tables</h1>\n" +
            "<p>The ng-repeat directive is used to draw tables in AngularJS. Displaying tables with AngularJS is very easy and simple.</p>\n" +
            "<p>Let's take an example. This example use ng-repeat directive to draw a table.</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">table</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">th</span><span class=\"tag\">&gt;</span>Name<span class=\"tag\">&lt;/</span><span class=\"tag-name\">th</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">th</span><span class=\"tag\">&gt;</span>Marks<span class=\"tag\">&lt;/</span><span class=\"tag-name\">th</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span>&nbsp;<span class=\"attribute\">ng-repeat</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"subject&nbsp;in&nbsp;student.subjects\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>{{&nbsp;subject.name&nbsp;}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>{{&nbsp;subject.marks&nbsp;}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">table</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<hr />\n" +
            "<h2 class=\"h2\">Displaying with CSS style</h2>\n" +
            "<p>You can also style the tables by using CSS.</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">style</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;table,&nbsp;th&nbsp;,&nbsp;td&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;border:&nbsp;1px&nbsp;solid&nbsp;grey;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;border-collapse:&nbsp;collapse;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;padding:&nbsp;5px;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;table&nbsp;tr:nth-child(odd)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;background-color:&nbsp;#f2f2f2;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;table&nbsp;tr:nth-child(even)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;background-color:&nbsp;#ffffff;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">style</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<hr />\n" +
            "<h2 class=\"h2\">AngularJS Table example with CSS</h2>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">head</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">title</span><span class=\"tag\">&gt;</span>Angular&nbsp;JS&nbsp;Table<span class=\"tag\">&lt;/</span><span class=\"tag-name\">title</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">style</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;table,&nbsp;th&nbsp;,&nbsp;td&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;border:&nbsp;1px&nbsp;solid&nbsp;grey;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;border-collapse:&nbsp;collapse;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;padding:&nbsp;5px;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;table&nbsp;tr:nth-child(odd)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;background-color:&nbsp;#f2f2f2;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;table&nbsp;tr:nth-child(even)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;background-color:&nbsp;#ffffff;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">style</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">head</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>AngularJS&nbsp;Sample&nbsp;Application<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"mainApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"studentController\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">table</span>&nbsp;<span class=\"attribute\">border</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"0\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>Enter&nbsp;first&nbsp;name:<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"text\"</span>&nbsp;<span class=\"attribute\">ng-model</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"student.firstName\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>Enter&nbsp;last&nbsp;name:&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"text\"</span>&nbsp;<span class=\"attribute\">ng-model</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"student.lastName\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>Name:&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>{{student.fullName()}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>Subject:<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">table</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">th</span><span class=\"tag\">&gt;</span>Name<span class=\"tag\">&lt;/</span><span class=\"tag-name\">th</span><span class=\"tag\">&gt;</span>.&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">th</span><span class=\"tag\">&gt;</span>Marks<span class=\"tag\">&lt;/</span><span class=\"tag-name\">th</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span>&nbsp;<span class=\"attribute\">ng-repeat</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"subject&nbsp;in&nbsp;student.subjects\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>{{&nbsp;subject.name&nbsp;}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>{{&nbsp;subject.marks&nbsp;}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">table</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">table</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;var&nbsp;<span class=\"attribute\">mainApp</span>&nbsp;=&nbsp;<span class=\"attribute-value\">angular</span>.module(\"mainApp\",&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mainApp.controller('studentController',&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.student</span>&nbsp;=&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;firstName:&nbsp;\"Nitin\",&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;lastName:&nbsp;\"Goyal\",&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;fees:500,&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;subjects:[&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Physics',marks:90},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Chemistry',marks:78},&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Math',marks:94},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'English',marks:80},&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{name:'Hindi',marks:75}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;],&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;fullName:&nbsp;function()&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;var&nbsp;studentObject;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"attribute\">studentObject</span>&nbsp;=&nbsp;$scope.student;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;studentObject.firstName&nbsp;+&nbsp;\"&nbsp;\"&nbsp;+&nbsp;studentObject.lastName;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;};&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;});&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>";
    public static final String Angular15="<h1 class=\"h1\">AngularJS Select</h1>\n" +
            "<p>In AngularJS, you can create a dropdown list (select box) based on items in an array, or an object.</p>\n" +
            "<hr />\n" +
            "<h2 class=\"h2\">Using ng-options</h2>\n" +
            "<p>You should use the ng-option directive to create a dropdown list, based on an object or an array in AngularJS.</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&nbsp;&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"myCtrl\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">select</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"selectedName\"</span>&nbsp;<span class=\"attribute\">ng-options</span>=<span class=\"attribute-value\">\"x&nbsp;for&nbsp;x&nbsp;in&nbsp;names\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">select</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">var&nbsp;<span class=\"attribute\">app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">angular</span>.module('myApp',&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">app.controller('myCtrl',&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.names</span>&nbsp;=&nbsp;[\"Java\",&nbsp;\"PHP\",&nbsp;\".Net\",&nbsp;\"AngularJS\",&nbsp;\"C/C++\"];&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "<p><strong>Note:</strong></p>\n" +
            "<p>You can also use the ng-repeat directive to make the same dropdown list as ng-options.</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&nbsp;&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"myCtrl\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">select</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">option</span>&nbsp;<span class=\"attribute\">ng-repeat</span>=<span class=\"attribute-value\">\"x&nbsp;in&nbsp;names\"</span><span class=\"tag\">&gt;</span>{{x}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">option</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">select</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">var&nbsp;<span class=\"attribute\">app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">angular</span>.module('myApp',&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">app.controller('myCtrl',&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.names</span>&nbsp;=&nbsp;[\"Java\",&nbsp;\"PHP\",&nbsp;\".Net\",&nbsp;\"AngularJS\",&nbsp;\"C/C++\"];&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>The&nbsp;same&nbsp;example&nbsp;of&nbsp;dropdown&nbsp;list&nbsp;using&nbsp;the&nbsp;ng-repeat&nbsp;directive.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">ng-options vs. ng-repeat</h2>\n" +
            "<p>Although, both can be used for dropdown list, but ng-repeat directive repeats a block of HTML code for each item in an array, it can be used to create options in a dropdown list, while the ng-options directive was made especially for filling a dropdown list with options, and has at least one important advantage:</p>\n" +
            "<p>Dropdowns made with ng-options allows the selected value to be an object, while dropdowns made from ng-repeat has to be a string.</p>\n" +
            "<p><strong>Consider that you have an array of objects:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">$<span class=\"attribute\">scope.cars</span>&nbsp;=&nbsp;[&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;{model&nbsp;:&nbsp;\"Ford&nbsp;Mustang\",&nbsp;color&nbsp;:&nbsp;\"red\"},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;{model&nbsp;:&nbsp;\"Fiat&nbsp;500\",&nbsp;color&nbsp;:&nbsp;\"white\"},&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;{model&nbsp;:&nbsp;\"Volvo&nbsp;XC90\",&nbsp;color&nbsp;:&nbsp;\"black\"}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">];&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<h2 class=\"h2\">Limitation of ng-repeat</h2>\n" +
            "<p>The ng-repeat directive has a limitation that the selected value must be a string:</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"myCtrl\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Select&nbsp;a&nbsp;car:<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">select</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"selectedCar\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">option</span>&nbsp;<span class=\"attribute\">ng-repeat</span>=<span class=\"attribute-value\">\"x&nbsp;in&nbsp;cars\"</span>&nbsp;<span class=\"attribute\">value</span>=<span class=\"attribute-value\">\"{{x.model}}\"</span><span class=\"tag\">&gt;</span>{{x.model}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">option</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">select</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>You&nbsp;selected:&nbsp;{{selectedCar}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">var&nbsp;<span class=\"attribute\">app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">angular</span>.module('myApp',&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">app.controller('myCtrl',&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.cars</span>&nbsp;=&nbsp;[&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{model&nbsp;:&nbsp;\"Ford\",&nbsp;color&nbsp;:&nbsp;\"red\"},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{model&nbsp;:&nbsp;\"Honda\",&nbsp;color&nbsp;:&nbsp;\"white\"},&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{model&nbsp;:&nbsp;\"Volvo\",&nbsp;color&nbsp;:&nbsp;\"black\"},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{model&nbsp;:&nbsp;\"Hundai\",&nbsp;color&nbsp;:&nbsp;\"gray\"}&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;];&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "<p>While using the ng-options directive, you can select an object value:</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"myCtrl\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Select&nbsp;a&nbsp;car:<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">select</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"selectedCar\"</span>&nbsp;<span class=\"attribute\">ng-options</span>=<span class=\"attribute-value\">\"x.model&nbsp;for&nbsp;x&nbsp;in&nbsp;cars\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">select</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>You&nbsp;selected:&nbsp;{{selectedCar.model}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>It's&nbsp;color&nbsp;is:&nbsp;{{selectedCar.color}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">var&nbsp;<span class=\"attribute\">app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">angular</span>.module('myApp',&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">app.controller('myCtrl',&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.cars</span>&nbsp;=&nbsp;[&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{model&nbsp;:&nbsp;\"Ford\",&nbsp;color&nbsp;:&nbsp;\"red\"},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{model&nbsp;:&nbsp;\"Honda\",&nbsp;color&nbsp;:&nbsp;\"white\"},&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{model&nbsp;:&nbsp;\"Volvo\",&nbsp;color&nbsp;:&nbsp;\"black\"},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{model&nbsp;:&nbsp;\"Hundai\",&nbsp;color&nbsp;:&nbsp;\"gray\"}&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;];&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;</li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">Use data source as an object</h2>\n" +
            "<p>We can also use data source as an object.</p>\n" +
            "<p>Consider that you have an object with following key-value pairs:</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">$<span class=\"attribute\">scope.cars</span>&nbsp;=&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;car01&nbsp;:&nbsp;\"Ford\",&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;car02&nbsp;:&nbsp;\"Honda\",&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;car03&nbsp;:&nbsp;\"Volvo\",&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;car03&nbsp;:&nbsp;\"Hundai\",&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;};&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<p>The expression in the ng-options attribute is a bit different for objects:</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"myCtrl\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Select&nbsp;a&nbsp;car:<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">select</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"selectedCar\"</span>&nbsp;<span class=\"attribute\">ng-options</span>=<span class=\"attribute-value\">\"x&nbsp;for&nbsp;(x,&nbsp;y)&nbsp;in&nbsp;cars\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">select</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>You&nbsp;selected:&nbsp;{{selectedCar}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">var&nbsp;<span class=\"attribute\">app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">angular</span>.module('myApp',&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">app.controller('myCtrl',&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.cars</span>&nbsp;=&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;car01&nbsp;:&nbsp;\"Ford\",&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;car02&nbsp;:&nbsp;\"Honda\",&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;car03&nbsp;:&nbsp;\"Volvo\",&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;car03&nbsp;:&nbsp;\"Hundai\",&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "<p><strong>Example2:</strong></p>\n" +
            "<p>The selected value will always be the value in a key-value pair.</p>\n" +
            "<p>The value in a key-value pair can also be an object:</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">$<span class=\"attribute\">scope.cars</span>&nbsp;=&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">car01&nbsp;:&nbsp;{brand&nbsp;:&nbsp;\"Ford\",&nbsp;model&nbsp;:&nbsp;\"Mustang\",&nbsp;color&nbsp;:&nbsp;\"red\"},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">car02&nbsp;:&nbsp;{brand&nbsp;:&nbsp;\"Honda\",&nbsp;model&nbsp;:&nbsp;\"city\",&nbsp;color&nbsp;:&nbsp;\"white\"},&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">car03&nbsp;:&nbsp;{brand&nbsp;:&nbsp;\"Volvo\",&nbsp;model&nbsp;:&nbsp;\"XC90\",&nbsp;color&nbsp;:&nbsp;\"black\"},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">car04&nbsp;:&nbsp;{brand&nbsp;:&nbsp;\"Hundai\",&nbsp;model&nbsp;:&nbsp;\"Creta\",&nbsp;color&nbsp;:&nbsp;\"gray\"}&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">};&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"myCtrl\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Select&nbsp;a&nbsp;car:<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">select</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"selectedCar\"</span>&nbsp;<span class=\"attribute\">ng-options</span>=<span class=\"attribute-value\">\"x&nbsp;for&nbsp;(x,&nbsp;y)&nbsp;in&nbsp;cars\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">select</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>You&nbsp;selected:&nbsp;{{selectedCar.brand}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>Model:&nbsp;{{selectedCar.model}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">h3</span><span class=\"tag\">&gt;</span>Color:&nbsp;{{selectedCar.color}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h3</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">var&nbsp;<span class=\"attribute\">app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">angular</span>.module('myApp',&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">app.controller('myCtrl',&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.cars</span>&nbsp;=&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">car01&nbsp;:&nbsp;{brand&nbsp;:&nbsp;\"Ford\",&nbsp;model&nbsp;:&nbsp;\"Mustang\",&nbsp;color&nbsp;:&nbsp;\"red\"},&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">car02&nbsp;:&nbsp;{brand&nbsp;:&nbsp;\"Honda\",&nbsp;model&nbsp;:&nbsp;\"city\",&nbsp;color&nbsp;:&nbsp;\"white\"},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">car03&nbsp;:&nbsp;{brand&nbsp;:&nbsp;\"Volvo\",&nbsp;model&nbsp;:&nbsp;\"XC90\",&nbsp;color&nbsp;:&nbsp;\"black\"},&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">car04&nbsp;:&nbsp;{brand&nbsp;:&nbsp;\"Hundai\",&nbsp;model&nbsp;:&nbsp;\"Creta\",&nbsp;color&nbsp;:&nbsp;\"gray\"}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>";
    public static final String Angular16="<h1 class=\"h1\">AngularJS HTML DOM</h1>\n" +
            "<p>In AngularJS, some directives can be used to bind application data to attributes of HTML DOM elements.</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>ng-disabled directive:</strong>The ng-disabled directive binds AngularJS application data to the disabled attribute of HTML elements. In the below code, it binds a model to a checkbox.</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"checkbox\"</span>&nbsp;<span class=\"attribute\">ng-model</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"enableDisableButton\"</span><span class=\"tag\">&gt;</span>Disable&nbsp;Button&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">button&nbsp;<span class=\"attribute\">ng-disabled</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"enableDisableButton\"</span><span class=\"tag\">&gt;</span>Click&nbsp;Me!<span class=\"tag\">&lt;/</span><span class=\"tag-name\">button</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<p><strong>ng-show directive:</strong>&nbsp;The ng-show directive shows or hides an HTML element. In the below code, it binds a model to a checkbox.</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"checkbox\"</span>&nbsp;<span class=\"attribute\">ng-model</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"showHide1\"</span><span class=\"tag\">&gt;</span>Show&nbsp;Button&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">button&nbsp;<span class=\"attribute\">ng-show</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"showHide1\"</span><span class=\"tag\">&gt;</span>Click&nbsp;Me!<span class=\"tag\">&lt;/</span><span class=\"tag-name\">button</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<p><strong>ng-hide directive:</strong>&nbsp;The ng-hide directive hides or shows an HTML element. In the below code, it binds a model to a checkbox.</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"checkbox\"</span>&nbsp;<span class=\"attribute\">ng-model</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"showHide2\"</span><span class=\"tag\">&gt;</span>Hide&nbsp;Button&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">button</span>&nbsp;<span class=\"attribute\">ng-hide</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"showHide2\"</span><span class=\"tag\">&gt;</span>Click&nbsp;Me!<span class=\"tag\">&lt;/</span><span class=\"tag-name\">button</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<p><strong>ng-click directive:</strong>&nbsp;The ng-click directive counts the total clicks an HTML element. In the below code, it binds a model to a checkbox.</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Total&nbsp;click:&nbsp;{{&nbsp;clickCounter&nbsp;}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">lt;button&nbsp;<span class=\"attribute\">ng-click</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"clickCounter&nbsp;=&nbsp;clickCounter&nbsp;+&nbsp;1\"</span><span class=\"tag\">&gt;</span>Click&nbsp;Me!<span class=\"tag\">&lt;/</span><span class=\"tag-name\">button</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<hr />\n" +
            "<p>Let's take an example to deploy the all above directives and test the variations:</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">head</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">title</span><span class=\"tag\">&gt;</span>AngularJS&nbsp;HTML&nbsp;DOM<span class=\"tag\">&lt;/</span><span class=\"tag-name\">title</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">head</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>AngularJS&nbsp;Sample&nbsp;Application<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">table</span>&nbsp;<span class=\"attribute\">border</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"0\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"checkbox\"</span>&nbsp;<span class=\"attribute\">ng-model</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"enableDisableButton\"</span><span class=\"tag\">&gt;</span>Disable&nbsp;Button<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">button</span>&nbsp;<span class=\"attribute\">ng-disabled</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"enableDisableButton\"</span><span class=\"tag\">&gt;</span>Click&nbsp;Me!<span class=\"tag\">&lt;/</span><span class=\"tag-name\">button</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"checkbox\"</span>&nbsp;<span class=\"attribute\">ng-model</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"showHide1\"</span><span class=\"tag\">&gt;</span>Show&nbsp;Button<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">button</span>&nbsp;<span class=\"attribute\">ng-show</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"showHide1\"</span><span class=\"tag\">&gt;</span>Click&nbsp;Me!<span class=\"tag\">&lt;/</span><span class=\"tag-name\">button</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"checkbox\"</span>&nbsp;<span class=\"attribute\">ng-model</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"showHide2\"</span><span class=\"tag\">&gt;</span>Hide&nbsp;Button<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">button</span>&nbsp;<span class=\"attribute\">ng-hide</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"showHide2\"</span><span class=\"tag\">&gt;</span>Click&nbsp;Me!<span class=\"tag\">&lt;/</span><span class=\"tag-name\">button</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Total&nbsp;click:&nbsp;{{&nbsp;clickCounter&nbsp;}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">button</span>&nbsp;<span class=\"attribute\">ng-click</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"clickCounter&nbsp;=&nbsp;clickCounter&nbsp;+&nbsp;1\"</span><span class=\"tag\">&gt;</span>Click&nbsp;Me!<span class=\"tag\">&lt;/</span><span class=\"tag-name\">button</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">table</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>";
    public static final String Angular17="<h1 class=\"h1\">AngularJS Forms</h1>\n" +
            "<p>AngularJS facilitates you to create a form enriches with data binding and validation of input controls.</p>\n" +
            "<p>Input controls are ways for a user to enter data. A form is a collection of controls for the purpose of grouping related controls together.</p>\n" +
            "<p>Following are the input controls used in AngularJS forms:</p>\n" +
            "<ul class=\"points\">\n" +
            "<li>input elements</li>\n" +
            "<li>select elements</li>\n" +
            "<li>button elements</li>\n" +
            "<li>textarea elements</li>\n" +
            "</ul>\n" +
            "<p>AngularJS provides multiple events that can be associated with the HTML controls. These events are associated with the different HTML input elements.</p>\n" +
            "<p>Following is a list of events supported in AngularJS:</p>\n" +
            "<ul class=\"points\">\n" +
            "<li>ng-click</li>\n" +
            "<li>ng-dbl-click</li>\n" +
            "<li>ng-mousedown</li>\n" +
            "<li>ng-mouseup</li>\n" +
            "<li>ng-mouseenter</li>\n" +
            "<li>ng-mouseleave</li>\n" +
            "<li>ng-mousemove</li>\n" +
            "<li>ng-mouseover</li>\n" +
            "<li>ng-keydown</li>\n" +
            "<li>ng-keyup</li>\n" +
            "<li>ng-keypress</li>\n" +
            "<li>ng-change</li>\n" +
            "</ul>\n" +
            "<hr />\n" +
            "<h2 class=\"h2\">Data Binding</h2>\n" +
            "<p>ng-model directive is used to provide data binding.</p>\n" +
            "<p>Let's take an example where ng-model directive binds the input controller to the rest of your application</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span>&nbsp;<span class=\"attribute\">lang</span>=<span class=\"attribute-value\">\"en\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"myApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>=<span class=\"attribute-value\">\"formCtrl\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">form</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;First&nbsp;Name:&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>=<span class=\"attribute-value\">\"text\"</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"firstname\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">form</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">var&nbsp;<span class=\"attribute\">app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">angular</span>.module('myApp',&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">app.controller('formCtrl',&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.firstname</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"Ajeet\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">});&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "<p>You can also change the example in the following way:</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">form</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;First&nbsp;Name:&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>=<span class=\"attribute-value\">\"text\"</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"firstname\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">form</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>You&nbsp;entered:&nbsp;{{firstname}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Change&nbsp;the&nbsp;name&nbsp;inside&nbsp;the&nbsp;input&nbsp;field,&nbsp;and&nbsp;you&nbsp;will&nbsp;see&nbsp;the&nbsp;name&nbsp;in&nbsp;the&nbsp;header&nbsp;changes&nbsp;accordingly.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;</li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">AngularJS Checkbox</h2>\n" +
            "<p>A checkbox has a value true or false. The ng-model directive is used for a checkbox.</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">form</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;Check&nbsp;to&nbsp;show&nbsp;this:&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>=<span class=\"attribute-value\">\"checkbox\"</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"myVar\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">form</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">h1</span>&nbsp;<span class=\"attribute\">ng-show</span>=<span class=\"attribute-value\">\"myVar\"</span><span class=\"tag\">&gt;</span>Checked<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>The&nbsp;ng-show&nbsp;attribute&nbsp;is&nbsp;set&nbsp;to&nbsp;true&nbsp;when&nbsp;the&nbsp;checkbox&nbsp;is&nbsp;checked.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">AngularJS Radio Buttons</h2>\n" +
            "<p>ng-model directive is used to bind radio buttons in your applications.</p>\n" +
            "<p>Let's take an example to display some text, based on the value of the selected radio buttons. In this example, we are also using ng-switch directive to hide and show HTML sections depending on the value of the radio buttons.</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">form</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;Pick&nbsp;a&nbsp;topic:&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>=<span class=\"attribute-value\">\"radio\"</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"myVar\"</span>&nbsp;<span class=\"attribute\">value</span>=<span class=\"attribute-value\">\"tuts\"</span><span class=\"tag\">&gt;</span>Tutorials&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>=<span class=\"attribute-value\">\"radio\"</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"myVar\"</span>&nbsp;<span class=\"attribute\">value</span>=<span class=\"attribute-value\">\"fest\"</span><span class=\"tag\">&gt;</span>Festivals&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>=<span class=\"attribute-value\">\"radio\"</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"myVar\"</span>&nbsp;<span class=\"attribute\">value</span>=<span class=\"attribute-value\">\"news\"</span><span class=\"tag\">&gt;</span>News&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">form</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-switch</span>=<span class=\"attribute-value\">\"myVar\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-switch-when</span>=<span class=\"attribute-value\">\"tuts\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>Tutorials<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Welcome&nbsp;to&nbsp;the&nbsp;best&nbsp;tutorials&nbsp;over&nbsp;the&nbsp;net<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-switch-when</span>=<span class=\"attribute-value\">\"fest\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>Festivals<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Most&nbsp;famous&nbsp;festivals<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-switch-when</span>=<span class=\"attribute-value\">\"news\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>News<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Welcome&nbsp;to&nbsp;the&nbsp;news&nbsp;portal.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>The&nbsp;ng-switch&nbsp;directive&nbsp;hides&nbsp;and&nbsp;shows&nbsp;HTML&nbsp;sections&nbsp;depending&nbsp;on&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;radio&nbsp;buttons.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;</li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">AngularJS Selectbox</h2>\n" +
            "<p>ng-model directive is used to bind select boxes to your application.</p>\n" +
            "<p><strong>See this example:</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">form</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;Select&nbsp;a&nbsp;topic:&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">select</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"myVar\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">option</span>&nbsp;<span class=\"attribute\">value</span>=<span class=\"attribute-value\">\"\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">option</span>&nbsp;<span class=\"attribute\">value</span>=<span class=\"attribute-value\">\"tuts\"</span><span class=\"tag\">&gt;</span>Tutorials&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">option</span>&nbsp;<span class=\"attribute\">value</span>=<span class=\"attribute-value\">\"fest\"</span><span class=\"tag\">&gt;</span>Festivals&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">option</span>&nbsp;<span class=\"attribute\">value</span>=<span class=\"attribute-value\">\"news\"</span><span class=\"tag\">&gt;</span>News&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">select</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">form</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-switch</span>=<span class=\"attribute-value\">\"myVar\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-switch-when</span>=<span class=\"attribute-value\">\"tuts\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>Tutorials<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Welcome&nbsp;to&nbsp;the&nbsp;best&nbsp;tutorials&nbsp;over&nbsp;the&nbsp;net.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-switch-when</span>=<span class=\"attribute-value\">\"fest\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>Festivals<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Most&nbsp;famous&nbsp;festivals.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-switch-when</span>=<span class=\"attribute-value\">\"news\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>News<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>Welcome&nbsp;to&nbsp;the&nbsp;news&nbsp;portal.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>The&nbsp;ng-switch&nbsp;directive&nbsp;hides&nbsp;and&nbsp;shows&nbsp;HTML&nbsp;sections&nbsp;depending&nbsp;on&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;radio&nbsp;buttons.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">p</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;</li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">AngularJS form example</h2>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">head</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">title</span><span class=\"tag\">&gt;</span>Angular&nbsp;JS&nbsp;Forms<span class=\"tag\">&lt;/</span><span class=\"tag-name\">title</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">style</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;table,&nbsp;th&nbsp;,&nbsp;td&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;border:&nbsp;1px&nbsp;solid&nbsp;grey;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;border-collapse:&nbsp;collapse;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;padding:&nbsp;5px;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;table&nbsp;tr:nth-child(odd)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;background-color:&nbsp;lightpink;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;table&nbsp;tr:nth-child(even)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;background-color:&nbsp;lightyellow;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">style</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">head</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>AngularJS&nbsp;Sample&nbsp;Application<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"mainApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"studentController\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">form</span>&nbsp;<span class=\"attribute\">name</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"studentForm\"</span>&nbsp;novalidate<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">table</span>&nbsp;<span class=\"attribute\">border</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"0\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>Enter&nbsp;first&nbsp;name:<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">name</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"firstname\"</span>&nbsp;<span class=\"attribute\">type</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"text\"</span>&nbsp;<span class=\"attribute\">ng-model</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"firstName\"</span>&nbsp;required<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">span</span>&nbsp;<span class=\"attribute\">style</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"color:red\"</span>&nbsp;<span class=\"attribute\">ng-show</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"studentForm.firstname.$dirty&nbsp;&amp;&amp;&nbsp;studentForm.firstname.$invalid\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">span</span>&nbsp;<span class=\"attribute\">ng-show</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"studentForm.firstname.$error.required\"</span><span class=\"tag\">&gt;</span>First&nbsp;Name&nbsp;is&nbsp;required.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">span</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">span</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>Enter&nbsp;last&nbsp;name:&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">name</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"lastname\"</span>&nbsp;&nbsp;<span class=\"attribute\">type</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"text\"</span>&nbsp;<span class=\"attribute\">ng-model</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"lastName\"</span>&nbsp;required<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">span</span>&nbsp;<span class=\"attribute\">style</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"color:red\"</span>&nbsp;<span class=\"attribute\">ng-show</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"studentForm.lastname.$dirty&nbsp;&amp;&amp;&nbsp;studentForm.lastname.$invalid\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">span</span>&nbsp;<span class=\"attribute\">ng-show</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"studentForm.lastname.$error.required\"</span><span class=\"tag\">&gt;</span>Last&nbsp;Name&nbsp;is&nbsp;required.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">span</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">span</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>Email:&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">name</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"email\"</span>&nbsp;<span class=\"attribute\">type</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"email\"</span>&nbsp;<span class=\"attribute\">ng-model</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"email\"</span>&nbsp;<span class=\"attribute\">length</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"100\"</span>&nbsp;required<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">span</span>&nbsp;<span class=\"attribute\">style</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"color:red\"</span>&nbsp;<span class=\"attribute\">ng-show</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"studentForm.email.$dirty&nbsp;&amp;&amp;&nbsp;studentForm.email.$invalid\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">span</span>&nbsp;<span class=\"attribute\">ng-show</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"studentForm.email.$error.required\"</span><span class=\"tag\">&gt;</span>Email&nbsp;is&nbsp;required.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">span</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">span</span>&nbsp;<span class=\"attribute\">ng-show</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"studentForm.email.$error.email\"</span><span class=\"tag\">&gt;</span>Invalid&nbsp;email&nbsp;address.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">span</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">span</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">button</span>&nbsp;<span class=\"attribute\">ng-click</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"reset()\"</span><span class=\"tag\">&gt;</span>Reset<span class=\"tag\">&lt;/</span><span class=\"tag-name\">button</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">button</span>&nbsp;<span class=\"attribute\">ng-disabled</span>&nbsp;=&nbsp;\"studentForm.firstname.$dirty&nbsp;&amp;&amp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;studentForm.firstname.$invalid&nbsp;||&nbsp;studentForm.lastname.$dirty&nbsp;&amp;&amp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;studentForm.lastname.$invalid&nbsp;||&nbsp;studentForm.email.$dirty&nbsp;&amp;&amp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;studentForm.email.$invalid\"&nbsp;<span class=\"attribute\">ng-click</span>=<span class=\"attribute-value\">\"submit()\"</span><span class=\"tag\">&gt;</span>Submit<span class=\"tag\">&lt;/</span><span class=\"tag-name\">button</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">table</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">form</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;var&nbsp;<span class=\"attribute\">mainApp</span>&nbsp;=&nbsp;<span class=\"attribute-value\">angular</span>.module(\"mainApp\",&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mainApp.controller('studentController',&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.reset</span>&nbsp;=&nbsp;<span class=\"attribute-value\">function</span>(){&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.firstName</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"Nitin\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.lastName</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"Goyal\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.email</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"abc@gmail.com\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$scope.reset();&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;});&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>";
    public static final String Angular18="<h1 class=\"h1\">AngularJS Form Validation</h1>\n" +
            "<p>AngularJS provides client-side form validation. It checks the state of the form and input fields (input, textarea, select), and lets you notify the user about the current state.</p>\n" +
            "<p>It also holds the information about whether the input fields have been touched, or modified, or not.</p>\n" +
            "<p>Following directives are generally used to track errors in an AngularJS form:</p>\n" +
            "<ul class=\"points\">\n" +
            "<li><strong>$dirty&nbsp;</strong>- states that value has been changed.</li>\n" +
            "<li><strong>$invalid&nbsp;</strong>- states that value entered is invalid.</li>\n" +
            "<li><strong>$error</strong>&nbsp;- states the exact error.</li>\n" +
            "</ul>\n" +
            "<hr />\n" +
            "<h2 class=\"h2\">AngularJS Form Validation Example</h2>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">head</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">title</span><span class=\"tag\">&gt;</span>Angular&nbsp;JS&nbsp;Forms<span class=\"tag\">&lt;/</span><span class=\"tag-name\">title</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">style</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;table,&nbsp;th&nbsp;,&nbsp;td&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;border:&nbsp;1px&nbsp;solid&nbsp;grey;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;border-collapse:&nbsp;collapse;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;padding:&nbsp;5px;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;table&nbsp;tr:nth-child(odd)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;background-color:&nbsp;lightpink;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;table&nbsp;tr:nth-child(even)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;background-color:&nbsp;lightyellow;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">style</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">head</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>AngularJS&nbsp;Sample&nbsp;Application<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"mainApp\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"studentController\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">form</span>&nbsp;<span class=\"attribute\">name</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"studentForm\"</span>&nbsp;novalidate<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">table</span>&nbsp;<span class=\"attribute\">border</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"0\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>Enter&nbsp;first&nbsp;name:<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">name</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"firstname\"</span>&nbsp;<span class=\"attribute\">type</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"text\"</span>&nbsp;<span class=\"attribute\">ng-model</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"firstName\"</span>&nbsp;required<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">span</span>&nbsp;<span class=\"attribute\">style</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"color:red\"</span>&nbsp;<span class=\"attribute\">ng-show</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"studentForm.firstname.$dirty&nbsp;&amp;&amp;&nbsp;studentForm.firstname.$invalid\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">span</span>&nbsp;<span class=\"attribute\">ng-show</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"studentForm.firstname.$error.required\"</span><span class=\"tag\">&gt;</span>First&nbsp;Name&nbsp;is&nbsp;required.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">span</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">span</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>Enter&nbsp;last&nbsp;name:&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">name</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"lastname\"</span>&nbsp;&nbsp;<span class=\"attribute\">type</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"text\"</span>&nbsp;<span class=\"attribute\">ng-model</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"lastName\"</span>&nbsp;required<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">span</span>&nbsp;<span class=\"attribute\">style</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"color:red\"</span>&nbsp;<span class=\"attribute\">ng-show</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"studentForm.lastname.$dirty&nbsp;&amp;&amp;&nbsp;studentForm.lastname.$invalid\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">span</span>&nbsp;<span class=\"attribute\">ng-show</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"studentForm.lastname.$error.required\"</span><span class=\"tag\">&gt;</span>Last&nbsp;Name&nbsp;is&nbsp;required.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">span</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">span</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>Email:&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">name</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"email\"</span>&nbsp;<span class=\"attribute\">type</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"email\"</span>&nbsp;<span class=\"attribute\">ng-model</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"email\"</span>&nbsp;<span class=\"attribute\">length</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"100\"</span>&nbsp;required<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">span</span>&nbsp;<span class=\"attribute\">style</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"color:red\"</span>&nbsp;<span class=\"attribute\">ng-show</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"studentForm.email.$dirty&nbsp;&amp;&amp;&nbsp;studentForm.email.$invalid\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">span</span>&nbsp;<span class=\"attribute\">ng-show</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"studentForm.email.$error.required\"</span><span class=\"tag\">&gt;</span>Email&nbsp;is&nbsp;required.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">span</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">span</span>&nbsp;<span class=\"attribute\">ng-show</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"studentForm.email.$error.email\"</span><span class=\"tag\">&gt;</span>Invalid&nbsp;email&nbsp;address.<span class=\"tag\">&lt;/</span><span class=\"tag-name\">span</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">span</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">button</span>&nbsp;<span class=\"attribute\">ng-click</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"reset()\"</span><span class=\"tag\">&gt;</span>Reset<span class=\"tag\">&lt;/</span><span class=\"tag-name\">button</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">button</span>&nbsp;<span class=\"attribute\">ng-disabled</span>&nbsp;=&nbsp;\"studentForm.firstname.$dirty&nbsp;&amp;&amp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;studentForm.firstname.$invalid&nbsp;||&nbsp;studentForm.lastname.$dirty&nbsp;&amp;&amp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;studentForm.lastname.$invalid&nbsp;||&nbsp;studentForm.email.$dirty&nbsp;&amp;&amp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;studentForm.email.$invalid\"&nbsp;<span class=\"attribute\">ng-click</span>=<span class=\"attribute-value\">\"submit()\"</span><span class=\"tag\">&gt;</span>Submit<span class=\"tag\">&lt;/</span><span class=\"tag-name\">button</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">table</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">form</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;var&nbsp;<span class=\"attribute\">mainApp</span>&nbsp;=&nbsp;<span class=\"attribute-value\">angular</span>.module(\"mainApp\",&nbsp;[]);&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mainApp.controller('studentController',&nbsp;function($scope)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.reset</span>&nbsp;=&nbsp;<span class=\"attribute-value\">function</span>(){&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.firstName</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"Nitin\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.lastName</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"Goyal\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.email</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"abc@gmail.com\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$scope.reset();&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;});&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>";
    public static final String Angular19="<h1 class=\"h1\">AngularJS AJAX</h1>\n" +
            "<p>AngularJS provides a $http service for reading data and remote servers. It is used to retrieve the desired records from a server.</p>\n" +
            "<p>AngularJS requires data in JSON format. Once the data is ready, $http gets the data form server in the following manner:</p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">function&nbsp;employeeController($scope,$http)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">r&nbsp;<span class=\"attribute\">url</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"data.txt\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;$http.get(url).success(&nbsp;function(response)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.employees</span>&nbsp;=&nbsp;<span class=\"attribute-value\">response</span>;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;});&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<p>Here the file \"data.txt\" is employee's records. $http service makes an AJAX call and sets response to its property employees. This model is used to draw tables in HTML.</p>\n" +
            "<hr />\n" +
            "<h2 class=\"h2\">AngularJS AJAX Example</h2>\n" +
            "<p><strong>testAngularJS.htm</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">head</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">title</span><span class=\"tag\">&gt;</span>Angular&nbsp;JS&nbsp;Includes<span class=\"tag\">&lt;/</span><span class=\"tag-name\">title</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">style</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;table,&nbsp;th&nbsp;,&nbsp;td&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;border:&nbsp;1px&nbsp;solid&nbsp;grey;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;border-collapse:&nbsp;collapse;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;padding:&nbsp;5px;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;table&nbsp;tr:nth-child(odd)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;background-color:&nbsp;#f2f2f2;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;table&nbsp;tr:nth-child(even)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;background-color:&nbsp;#ffffff;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">style</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">head</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>AngularJS&nbsp;Sample&nbsp;Application<span class=\"tag\">&lt;/</span><span class=\"tag-name\">h2</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-app</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"\"</span>&nbsp;<span class=\"attribute\">ng-controller</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"employeeController\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">table</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">th</span><span class=\"tag\">&gt;</span>Name<span class=\"tag\">&lt;/</span><span class=\"tag-name\">th</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">th</span><span class=\"tag\">&gt;</span>Age<span class=\"tag\">&lt;/</span><span class=\"tag-name\">th</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">th</span><span class=\"tag\">&gt;</span>Salary<span class=\"tag\">&lt;/</span><span class=\"tag-name\">th</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">tr</span>&nbsp;<span class=\"attribute\">ng-repeat</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"employee&nbsp;in&nbsp;employees\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>{{&nbsp;employee.Name&nbsp;}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>{{&nbsp;employee.Age&nbsp;}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>{{&nbsp;employee.Salary&nbsp;}}<span class=\"tag\">&lt;/</span><span class=\"tag-name\">td</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">tr</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">table</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;function&nbsp;employeeController($scope,$http)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;var&nbsp;<span class=\"attribute\">url</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"data.txt\"</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$http.get(url).success(&nbsp;function(response)&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$<span class=\"attribute\">scope.employees</span>&nbsp;=&nbsp;<span class=\"attribute-value\">response</span>;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;});&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>&nbsp;=&nbsp;<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.2.15/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;<span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<p>Here the file data.txt contains the employee's record.</p>\n" +
            "<p><strong>\"data.txt\" (employee's data in JSON format)</strong></p>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&nbsp;[&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;\"Name\"&nbsp;:&nbsp;\"Mahesh&nbsp;Sharma\",&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;\"Age\"&nbsp;:&nbsp;25,&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;\"Salary\"&nbsp;:&nbsp;\"20000\"&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;\"Name\"&nbsp;:&nbsp;\"Rohan&nbsp;Malik\",&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;\"Age\"&nbsp;:&nbsp;20,&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;\"Salary\"&nbsp;:&nbsp;\"22000\"&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;\"Name\"&nbsp;:&nbsp;\"Robert&nbsp;Petro\",&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;\"Age\"&nbsp;:&nbsp;45,&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;\"Salary\"&nbsp;:&nbsp;\"67000\"&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">},&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;\"Name\"&nbsp;:&nbsp;\"Jullia&nbsp;Roberts\",&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;&nbsp;\"Age\"&nbsp;:&nbsp;21,&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;&nbsp;\"Salary\"&nbsp;:&nbsp;\"55000\"&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">}&nbsp;&nbsp;</li>\n" +
            "</ol>\n" +
            "</div>\n" +
            "</div>\n" +
            "<p>To execute the above example, you have to deploy testAngularJS.htm and data.txt file to a web server.</p>\n" +
            "<p>Open the file testAngularJS.htm using the URL of your server in a web browser and see the result</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<h2 class=\"h2\">HTTP Service Methods</h2>\n" +
            "<p>There are several shortcut methods of calling the $http service. In the above example, .get method of the $http service is used. Following are several other shortcut methods:</p>\n" +
            "<ul class=\"points\">\n" +
            "<li>.delete()</li>\n" +
            "<li>.get()</li>\n" +
            "<li>.head()</li>\n" +
            "<li>.jsonp()</li>\n" +
            "<li>.patch()</li>\n" +
            "<li>.post()</li>\n" +
            "<li>.put()</li>\n" +
            "</ul>\n" +
            "<h2 class=\"h2\">Properties</h2>\n" +
            "<p>The response from the server is an object with these properties:</p>\n" +
            "<ul class=\"points\">\n" +
            "<li>.config the object used to generate the request.</li>\n" +
            "<li>.data a string, or an object, carrying the response from the server.</li>\n" +
            "<li>.headers a function to use to get header information.</li>\n" +
            "<li>.status a number defining the HTTP status.</li>\n" +
            "<li>.statusText a string defining the HTTP status.</li>\n" +
            "</ul>";
    public static final String Angular20="<h1 class=\"h1\">AngularJS Animations</h1>\n" +
            "<p>In AngularJS, you can build animated transition with the help of CSS. The CSS transforms the HTML elements that give you an illusion of motion.</p>\n" +
            "<hr />\n" +
            "<p>You must include the following things to make your application ready for animations:</p>\n" +
            "<p><strong>AngularJS Animate library:</strong></p>\n" +
            "<ul class=\"points\">\n" +
            "<li>&lt;script src=\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-animate.js\"&gt;&lt;/script&gt;</li>\n" +
            "</ul>\n" +
            "<p><strong>Refer to the ngAnimate module in your application:</strong></p>\n" +
            "<ul class=\"points\">\n" +
            "<li>&lt;body ng-app=\"ngAnimate\"&gt;</li>\n" +
            "</ul>\n" +
            "<hr />\n" +
            "<h2 class=\"h2\">AngularJS Animation Example</h2>\n" +
            "<div class=\"codeblock\">\n" +
            "<div class=\"dp-highlighter\">\n" +
            "<div class=\"bar\">&nbsp;</div>\n" +
            "<ol class=\"dp-xml\" start=\"1\">\n" +
            "<li class=\"alt\">&lt;!DOCTYPE&nbsp;html<span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">style</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">div&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;transition:&nbsp;all&nbsp;linear&nbsp;0.5s;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;background-color: yellow;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;height:&nbsp;100px;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;width:&nbsp;100%;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;position:&nbsp;relative;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;top:&nbsp;0;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;left:&nbsp;0;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">}&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">.ng-hide&nbsp;{&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;height:&nbsp;0;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;width:&nbsp;0;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;background-color:&nbsp;transparent;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">&nbsp;&nbsp;top:-200px;&nbsp;&nbsp;</li>\n" +
            "<li class=\"\">&nbsp;&nbsp;left:&nbsp;200px;&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\">}&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">style</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">script</span>&nbsp;<span class=\"attribute\">src</span>=<span class=\"attribute-value\">\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-animate.js\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">script</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">body</span>&nbsp;<span class=\"attribute\">ng-app</span>=<span class=\"attribute-value\">\"ngAnimate\"</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>Hide&nbsp;the&nbsp;DIV:&nbsp;<span class=\"tag\">&lt;</span><span class=\"tag-name\">input</span>&nbsp;<span class=\"attribute\">type</span>=<span class=\"attribute-value\">\"checkbox\"</span>&nbsp;<span class=\"attribute\">ng-model</span>=<span class=\"attribute-value\">\"myCheck\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">h1</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;</span><span class=\"tag-name\">div</span>&nbsp;<span class=\"attribute\">ng-hide</span>=<span class=\"attribute-value\">\"myCheck\"</span><span class=\"tag\">&gt;</span><span class=\"tag\">&lt;/</span><span class=\"tag-name\">div</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">body</span><span class=\"tag\">&gt;</span>&nbsp;&nbsp;</li>\n" +
            "<li class=\"alt\"><span class=\"tag\">&lt;/</span><span class=\"tag-name\">html</span><span class=\"tag\">&gt;</span></li>\n" +
            "</ol>\n" +
            "<h2 class=\"h2\">What does ngAnimate do?</h2>\n" +
            "<p>The ngAnimate module does not animate HTML elements itself. It only adds and removes some pre-defined classes to make animations when ngAnimate notice certain events, like hide or show of an HTML element.</p>\n" +
            "<p>Following is a list of directives in AngularJS who add/remove classes:</p>\n" +
            "<ul class=\"points\">\n" +
            "<li>ng-show</li>\n" +
            "<li>ng-hide</li>\n" +
            "<li>ng-class</li>\n" +
            "<li>ng-view</li>\n" +
            "<li>ng-include</li>\n" +
            "<li>ng-repeat</li>\n" +
            "<li>ng-if</li>\n" +
            "<li>ng-switch</li>\n" +
            "</ul>\n" +
            "</div>\n" +
            "</div>";



}
