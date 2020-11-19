package com.vijay.aiodeveloper.strings;

/**
 * Created by RJ1_PC on 03-07-2017.
 */

public class StringDSList {
    public static final String program1 = "<p>/* Program of single linked list*/<br />\n" +
            "# include <stdio.h><br />\n" +
            "# include <malloc.h></p>\n" +
            "\n" +
            "<p>struct node<br />\n" +
            "{<br />\n" +
            " int info;<br />\n" +
            " struct node *link;<br />\n" +
            "}*start;</p>\n" +
            "\n" +
            "<p>main()<br />\n" +
            "{<br />\n" +
            " int choice,n,m,position,i;<br />\n" +
            " start=NULL;<br />\n" +
            " while(1)<br />\n" +
            " {<br />\n" +
            " printf(&quot;1.Create List\\n&quot;);<br />\n" +
            " printf(&quot;2.Add at begining\\n&quot;);<br />\n" +
            " printf(&quot;3.Add after \\n&quot;);<br />\n" +
            " printf(&quot;4.Delete\\n&quot;);<br />\n" +
            " printf(&quot;5.Display\\n&quot;);<br />\n" +
            " printf(&quot;6.Count\\n&quot;);<br />\n" +
            " printf(&quot;7.Reverse\\n&quot;);<br />\n" +
            " printf(&quot;8.Search\\n&quot;);<br />\n" +
            " printf(&quot;9.Quit\\n&quot;);<br />\n" +
            " printf(&quot;Enter your choice : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;choice);<br />\n" +
            " switch(choice)<br />\n" +
            " {<br />\n" +
            " case 1:<br />\n" +
            " printf(&quot;How many nodes you want : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;n);<br />\n" +
            " for(i=0;i<n;i++)<br />\n" +
            " {<br />\n" +
            " printf(&quot;Enter the element : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;m);<br />\n" +
            " create_list(m);<br />\n" +
            " }<br />\n" +
            " break;<br />\n" +
            " case 2:<br />\n" +
            " printf(&quot;Enter the element : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;m);<br />\n" +
            " addatbeg(m);<br />\n" +
            " break;<br />\n" +
            " case 3:<br />\n" +
            " printf(&quot;Enter the element : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;m);<br />\n" +
            " printf(&quot;Enter the position after which this element is inserted : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;position);<br />\n" +
            " addafter(m,position);<br />\n" +
            " break;<br />\n" +
            " case 4:<br />\n" +
            " if(start==NULL)<br />\n" +
            " {<br />\n" +
            " printf(&quot;List is empty\\n&quot;);<br />\n" +
            " continue;<br />\n" +
            " }<br />\n" +
            " printf(&quot;Enter the element for deletion : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;m);<br />\n" +
            " del(m);<br />\n" +
            " break;<br />\n" +
            " case 5:<br />\n" +
            " display();<br />\n" +
            " break;<br />\n" +
            " case 6:<br />\n" +
            " count();<br />\n" +
            " break;<br />\n" +
            " case 7:<br />\n" +
            " rev();<br />\n" +
            " break;<br />\n" +
            " case 8:<br />\n" +
            " printf(&quot;Enter the element to be searched : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;m);<br />\n" +
            " search(m);<br />\n" +
            " break;<br />\n" +
            " case 9:<br />\n" +
            " exit(1);<br />\n" +
            " default:<br />\n" +
            " printf(&quot;Wrong choice\\n&quot;);<br />\n" +
            " }/*End of switch */<br />\n" +
            " }/*End of while */<br />\n" +
            "}/*End of main()*/</p>\n" +
            "\n" +
            "<p>create_list(int data)<br />\n" +
            "{<br />\n" +
            " struct node *q,*tmp;<br />\n" +
            " tmp= malloc(sizeof(struct node));<br />\n" +
            " tmp->info=data;<br />\n" +
            " tmp->link=NULL;</p>\n" +
            "\n" +
            "<p> if(start==NULL) /*If list is empty */<br />\n" +
            " start=tmp;<br />\n" +
            " else<br />\n" +
            " { /*Element inserted at the end */<br />\n" +
            " q=start;<br />\n" +
            " while(q->link!=NULL)<br />\n" +
            " q=q->link;<br />\n" +
            " q->link=tmp;<br />\n" +
            " }<br />\n" +
            "}/*End of create_list()*/</p>\n" +
            "\n" +
            "<p>addatbeg(int data)<br />\n" +
            "{<br />\n" +
            " struct node *tmp;<br />\n" +
            " tmp=malloc(sizeof(struct node));<br />\n" +
            " tmp->info=data;<br />\n" +
            " tmp->link=start;<br />\n" +
            " start=tmp;<br />\n" +
            "}/*End of addatbeg()*/</p>\n" +
            "\n" +
            "<p>addafter(int data,int pos)<br />\n" +
            "{<br />\n" +
            " struct node *tmp,*q;<br />\n" +
            " int i;<br />\n" +
            " q=start;<br />\n" +
            " for(i=0;i<pos-1;i++)<br />\n" +
            " {<br />\n" +
            " q=q->link;<br />\n" +
            " if(q==NULL)<br />\n" +
            " {<br />\n" +
            " printf(&quot;There are less than %d elements&quot;,pos);<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " }/*End of for*/</p>\n" +
            "\n" +
            "<p> tmp=malloc(sizeof(struct node) );<br />\n" +
            " tmp->link=q->link;<br />\n" +
            " tmp->info=data;<br />\n" +
            " q->link=tmp;<br />\n" +
            "}/*End of addafter()*/</p>\n" +
            "\n" +
            "<p>del(int data)<br />\n" +
            "{<br />\n" +
            " struct node *tmp,*q;<br />\n" +
            " if(start->info == data)<br />\n" +
            " {<br />\n" +
            " tmp=start;<br />\n" +
            " start=start->link; /*First element deleted*/<br />\n" +
            " free(tmp);<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " q=start;<br />\n" +
            " while(q->link->link != NULL)<br />\n" +
            " {<br />\n" +
            " if(q->link->info==data) /*Element deleted in between*/<br />\n" +
            " {<br />\n" +
            " tmp=q->link;<br />\n" +
            " q->link=tmp->link;<br />\n" +
            " free(tmp);<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " q=q->link;<br />\n" +
            " }/*End of while */<br />\n" +
            " if(q->link->info==data) /*Last element deleted*/<br />\n" +
            " {<br />\n" +
            " tmp=q->link;<br />\n" +
            " free(tmp);<br />\n" +
            " q->link=NULL;<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " printf(&quot;Element %d not found\\n&quot;,data);<br />\n" +
            "}/*End of del()*/</p>\n" +
            "\n" +
            "<p>display()<br />\n" +
            "{<br />\n" +
            " struct node *q;<br />\n" +
            " if(start == NULL)<br />\n" +
            " {<br />\n" +
            " printf(&quot;List is empty\\n&quot;);<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " q=start;<br />\n" +
            " printf(&quot;List is :\\n&quot;);<br />\n" +
            " while(q!=NULL)<br />\n" +
            " {<br />\n" +
            " printf(&quot;%d &quot;, q->info);<br />\n" +
            " q=q->link;<br />\n" +
            " }<br />\n" +
            " printf(&quot;\\n&quot;);<br />\n" +
            "}/*End of display() */</p>\n" +
            "\n" +
            "<p>count()<br />\n" +
            "{<br />\n" +
            " struct node *q=start;<br />\n" +
            " int cnt=0;<br />\n" +
            " while(q!=NULL)<br />\n" +
            " {<br />\n" +
            " q=q->link;<br />\n" +
            " cnt++;<br />\n" +
            " }<br />\n" +
            " printf(&quot;Number of elements are %d\\n&quot;,cnt);<br />\n" +
            "}/*End of count() */</p>\n" +
            "\n" +
            "<p>rev()<br />\n" +
            "{<br />\n" +
            " struct node *p1,*p2,*p3;<br />\n" +
            " if(start->link==NULL) /*only one element*/<br />\n" +
            " return;<br />\n" +
            " p1=start;<br />\n" +
            " p2=p1->link;<br />\n" +
            " p3=p2->link;<br />\n" +
            " p1->link=NULL;<br />\n" +
            " p2->link=p1;<br />\n" +
            " while(p3!=NULL)<br />\n" +
            " {<br />\n" +
            " p1=p2;<br />\n" +
            " p2=p3;<br />\n" +
            " p3=p3->link;<br />\n" +
            " p2->link=p1;<br />\n" +
            " }<br />\n" +
            " start=p2;<br />\n" +
            "}/*End of rev()*/</p>\n" +
            "\n" +
            "<p>search(int data)<br />\n" +
            "{<br />\n" +
            " struct node *ptr = start;<br />\n" +
            " int pos = 1;<br />\n" +
            " while(ptr!=NULL)<br />\n" +
            " {<br />\n" +
            " if(ptr->info==data)<br />\n" +
            " {<br />\n" +
            " printf(&quot;Item %d found at position %d\\n&quot;,data,pos);<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " ptr = ptr->link;<br />\n" +
            " pos++;<br />\n" +
            " }<br />\n" +
            " if(ptr == NULL)<br />\n" +
            " printf(&quot;Item %d not found in list\\n&quot;,data);<br />\n" +
            "}/*End of search()*/</p>\n" +
            "\n" +
            "<p>OUTPUT:=<br />\n" +
            "1.Create List<br />\n" +
            "2.Add at begining<br />\n" +
            "3.Add after<br />\n" +
            "4.Delete<br />\n" +
            "5.Display<br />\n" +
            "6.Count<br />\n" +
            "7.Reverse<br />\n" +
            "8.Search<br />\n" +
            "9.Quit<br />\n" +
            "Enter your choice : 1<br />\n" +
            "How many nodes you want : 4<br />\n" +
            "Enter the element : 2<br />\n" +
            "Enter the element : 2<br />\n" +
            "Enter the element : 5<br />\n" +
            "Enter the element : 6<br />\n" +
            "1.Create List<br />\n" +
            "2.Add at begining<br />\n" +
            "3.Add after<br />\n" +
            "4.Delete<br />\n" +
            "5.Display<br />\n" +
            "6.Count<br />\n" +
            "7.Reverse<br />\n" +
            "8.Search<br />\n" +
            "9.Quit<br />\n" +
            "Enter your choice : 4<br />\n" +
            "Enter the element for deletion : 5<br />\n" +
            "1.Create List<br />\n" +
            "2.Add at begining<br />\n" +
            "3.Add after<br />\n" +
            "4.Delete<br />\n" +
            "5.Display<br />\n" +
            "6.Count<br />\n" +
            "7.Reverse<br />\n" +
            "8.Search<br />\n" +
            "9.Quit<br />\n" +
            "Enter your choice : 5<br />\n" +
            "List is :<br />\n" +
            "2 2 6<br />\n" +
            "1.Create List<br />\n" +
            "2.Add at begining<br />\n" +
            "3.Add after<br />\n" +
            "4.Delete<br />\n" +
            "5.Display<br />\n" +
            "6.Count<br />\n" +
            "7.Reverse<br />\n" +
            "8.Search<br />\n" +
            "9.Quit<br />\n" +
            "Enter your choice :</p>\n" +
            "\n" +
            "<p>\n" +
            "</p>";


    public static final String program2 = "<p>#include<stdio.h><br />\n" +
            "#include<conio.h><br />\n" +
            "#include<stdlib.h> <br />\n" +
            "struct node<br />\n" +
            "{<br />\n" +
            " struct node *previous;<br />\n" +
            " int data;<br />\n" +
            " struct node *next;<br />\n" +
            "}*head, *last; </p>\n" +
            "\n" +
            "<p>void insert_begning(int value)<br />\n" +
            "{<br />\n" +
            " struct node *var,*temp;<br />\n" +
            " var=(struct node *)malloc(sizeof(struct node));<br />\n" +
            " var->data=value;<br />\n" +
            " if(head==NULL)<br />\n" +
            " {<br />\n" +
            " head=var;<br />\n" +
            " head->previous=NULL;<br />\n" +
            " head->next=NULL;<br />\n" +
            " last=head;<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " temp=var;<br />\n" +
            " temp->previous=NULL;<br />\n" +
            " temp->next=head;<br />\n" +
            " head->previous=temp;<br />\n" +
            " head=temp;<br />\n" +
            " }<br />\n" +
            "} </p>\n" +
            "\n" +
            "<p>void insert_end(int value)<br />\n" +
            "{<br />\n" +
            " struct node *var,*temp;<br />\n" +
            " var=(struct node *)malloc(sizeof(struct node));<br />\n" +
            " var->data=value;<br />\n" +
            " if(head==NULL)<br />\n" +
            " {<br />\n" +
            " head=var;<br />\n" +
            " head->previous=NULL;<br />\n" +
            " head->next=NULL;<br />\n" +
            " last=head;<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " last=head;<br />\n" +
            " while(last!=NULL)<br />\n" +
            " {<br />\n" +
            " temp=last;<br />\n" +
            " last=last->next;<br />\n" +
            " }<br />\n" +
            " last=var;<br />\n" +
            " temp->next=last;<br />\n" +
            " last->previous=temp;<br />\n" +
            " last->next=NULL;<br />\n" +
            " }<br />\n" +
            "} </p>\n" +
            "\n" +
            "<p>int insert_after(int value, int loc)<br />\n" +
            "{<br />\n" +
            " struct node *temp,*var,*temp1;<br />\n" +
            " var=(struct node *)malloc(sizeof(struct node));<br />\n" +
            " var->data=value;<br />\n" +
            " if(head==NULL)<br />\n" +
            " {<br />\n" +
            " head=var;<br />\n" +
            " head->previous=NULL;<br />\n" +
            " head->next=NULL;<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " temp=head;<br />\n" +
            " while(temp!=NULL &amp;&amp; temp->data!=loc)<br />\n" +
            " {<br />\n" +
            " temp=temp->next;<br />\n" +
            " }<br />\n" +
            " if(temp==NULL)<br />\n" +
            " {<br />\n" +
            " printf(&quot;\\n%d is not present in list &quot;,loc);<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " temp1=temp->next;<br />\n" +
            " temp->next=var;<br />\n" +
            " var->previous=temp; <br />\n" +
            " var->next=temp1;<br />\n" +
            " temp1->previous=var;<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " last=head;<br />\n" +
            " while(last->next!=NULL)<br />\n" +
            " {<br />\n" +
            " last=last->next;<br />\n" +
            " }<br />\n" +
            "} <br />\n" +
            "int delete_from_end()<br />\n" +
            "{<br />\n" +
            " struct node *temp;<br />\n" +
            " temp=last;<br />\n" +
            " if(temp->previous==NULL)<br />\n" +
            " {<br />\n" +
            " free(temp);<br />\n" +
            " head=NULL;<br />\n" +
            " last=NULL;<br />\n" +
            " return 0;<br />\n" +
            " }<br />\n" +
            " printf(&quot;\\nData deleted from list is %d \\n&quot;,last->data);<br />\n" +
            " last=temp->previous;<br />\n" +
            " last->next=NULL;<br />\n" +
            " free(temp);<br />\n" +
            " return 0;<br />\n" +
            "} </p>\n" +
            "\n" +
            "<p>int delete_from_middle(int value)<br />\n" +
            "{<br />\n" +
            " struct node *temp,*var,*t, *temp1;<br />\n" +
            " temp=head;<br />\n" +
            " while(temp!=NULL)<br />\n" +
            " {<br />\n" +
            " if(temp->data == value)<br />\n" +
            " {<br />\n" +
            " if(temp->previous==NULL)<br />\n" +
            " {<br />\n" +
            " free(temp);<br />\n" +
            " head=NULL;<br />\n" +
            " last=NULL;<br />\n" +
            " return 0;<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " var->next=temp1;<br />\n" +
            " temp1->previous=var;<br />\n" +
            " free(temp);<br />\n" +
            " return 0;<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " var=temp;<br />\n" +
            " temp=temp->next;<br />\n" +
            " temp1=temp->next;<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " printf(&quot;data deleted from list is %d&quot;,value);<br />\n" +
            "} </p>\n" +
            "\n" +
            "<p>void display()<br />\n" +
            "{<br />\n" +
            " struct node *temp;<br />\n" +
            " temp=head;<br />\n" +
            " if(temp==NULL)<br />\n" +
            " {<br />\n" +
            " printf(&quot;List is Empty&quot;);<br />\n" +
            " }<br />\n" +
            " while(temp!=NULL)<br />\n" +
            " {<br />\n" +
            " printf(&quot;-> %d &quot;,temp->data);<br />\n" +
            " temp=temp->next;<br />\n" +
            " }<br />\n" +
            "} </p>\n" +
            "\n" +
            "<p>int main()<br />\n" +
            "{<br />\n" +
            " int value, i, loc;<br />\n" +
            " head=NULL;<br />\n" +
            " printf(&quot;Select the choice of operation on link list&quot;);<br />\n" +
            " printf(&quot;\\n1.) insert at begning\\n2.) insert at end\\n3.) insert at middle&quot;);<br />\n" +
            " printf(&quot;\\n4.) delete from end\\n5.) reverse the link list\\n6.) display list\\n7.)exit&quot;);<br />\n" +
            " while(1)<br />\n" +
            " {<br />\n" +
            " printf(&quot;\\n\\nenter the choice of operation you want to do &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;i);<br />\n" +
            " switch(i)<br />\n" +
            " {<br />\n" +
            " case 1:<br />\n" +
            " {<br />\n" +
            " printf(&quot;enter the value you want to insert in node &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;value);<br />\n" +
            " insert_begning(value);<br />\n" +
            " display();<br />\n" +
            " break;<br />\n" +
            " }<br />\n" +
            " case 2:<br />\n" +
            " {<br />\n" +
            " printf(&quot;enter the value you want to insert in node at last&quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;value);<br />\n" +
            " insert_end(value);<br />\n" +
            " display();<br />\n" +
            " break;<br />\n" +
            " }<br />\n" +
            " case 3:<br />\n" +
            " {<br />\n" +
            " printf(&quot;after which data you want to insert data &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;loc);<br />\n" +
            " printf(&quot;enter the data you want to insert in list &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;value);<br />\n" +
            " insert_after(value,loc);<br />\n" +
            " display();<br />\n" +
            " break;<br />\n" +
            " }<br />\n" +
            " case 4:<br />\n" +
            " {<br />\n" +
            " delete_from_end();<br />\n" +
            " display();<br />\n" +
            " break;<br />\n" +
            " }<br />\n" +
            " case 5:<br />\n" +
            " {<br />\n" +
            " printf(&quot;enter the value you want to delete&quot;);<br />\n" +
            " scanf(&quot;%d&quot;,value);<br />\n" +
            " delete_from_middle(value);<br />\n" +
            " display();<br />\n" +
            " break;<br />\n" +
            " }<br />\n" +
            " case 6 :<br />\n" +
            " {<br />\n" +
            " display();<br />\n" +
            " break;<br />\n" +
            " }<br />\n" +
            " case 7 :<br />\n" +
            " {<br />\n" +
            " exit(0);<br />\n" +
            " break;<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " printf(&quot;\\n\\n%d&quot;,last->data);<br />\n" +
            " display();<br />\n" +
            " getch();<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>OUTPUT:--</p>\n" +
            "\n" +
            "<p>Select the choice of operation on link list<br />\n" +
            "1.) insert at begning<br />\n" +
            "2.) insert at end<br />\n" +
            "3.) insert at middle<br />\n" +
            "4.) delete from end<br />\n" +
            "5.) reverse the link list<br />\n" +
            "6.) display list<br />\n" +
            "7.)exit</p>\n" +
            "\n" +
            "<p>enter the choice of operation you want to do 1<br />\n" +
            "enter the value you want to insert in node 20<br />\n" +
            "-> 20</p>\n" +
            "\n" +
            "<p>enter the choice of operation you want to do 2<br />\n" +
            "enter the value you want to insert in node at last50<br />\n" +
            "-> 20 -> 50</p>\n" +
            "\n" +
            "<p>enter the choice of operation you want to do 3<br />\n" +
            "after which data you want to insert data 20<br />\n" +
            "enter the data you want to insert in list 40<br />\n" +
            "-> 20 -> 40 -> 50</p>\n" +
            "\n" +
            "<p>enter the choice of operation you want to do 6<br />\n" +
            "-> 20 -> 40 -> 50</p>\n" +
            "\n" +
            "<p>enter the choice of operation you want to do</p>";

    public static final String program3 = "<p>/* Program of circular linked list*/<br />\n" +
            "# include <stdio.h><br />\n" +
            "# include <malloc.h></p>\n" +
            "\n" +
            "<p>struct node<br />\n" +
            "{<br />\n" +
            " int info;<br />\n" +
            " struct node *link;<br />\n" +
            "}*last;</p>\n" +
            "\n" +
            "<p>main()<br />\n" +
            "{<br />\n" +
            " int choice,n,m,po,i;<br />\n" +
            " last=NULL;<br />\n" +
            " while(1)<br />\n" +
            " {<br />\n" +
            " printf(&quot;1.Create List\\n&quot;);<br />\n" +
            " printf(&quot;2.Add at begining\\n&quot;);<br />\n" +
            " printf(&quot;3.Add after \\n&quot;);<br />\n" +
            " printf(&quot;4.Delete\\n&quot;);<br />\n" +
            " printf(&quot;5.Display\\n&quot;);<br />\n" +
            " printf(&quot;6.Quit\\n&quot;);<br />\n" +
            " printf(&quot;Enter your choice : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;choice);</p>\n" +
            "\n" +
            "<p> switch(choice)<br />\n" +
            " {<br />\n" +
            " case 1:<br />\n" +
            " printf(&quot;How many nodes you want : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;n);<br />\n" +
            " for(i=0; i < n;i++)<br />\n" +
            " {<br />\n" +
            " printf(&quot;Enter the element : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;m);<br />\n" +
            " create_list(m);<br />\n" +
            " }<br />\n" +
            " break;<br />\n" +
            " case 2:<br />\n" +
            " printf(&quot;Enter the element : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;m);<br />\n" +
            " addatbeg(m);<br />\n" +
            " break;<br />\n" +
            " case 3:<br />\n" +
            " printf(&quot;Enter the element : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;m);<br />\n" +
            " printf(&quot;Enter the position after which this element is inserted : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;po);<br />\n" +
            " addafter(m,po);<br />\n" +
            " break;<br />\n" +
            " case 4:<br />\n" +
            " if(last == NULL)<br />\n" +
            " {<br />\n" +
            " printf(&quot;List underflow\\n&quot;);<br />\n" +
            " continue;<br />\n" +
            " }<br />\n" +
            " printf(&quot;Enter the number for deletion : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;m);<br />\n" +
            " del(m);<br />\n" +
            " break;<br />\n" +
            " case 5:<br />\n" +
            " display();<br />\n" +
            " break;<br />\n" +
            " case 6:<br />\n" +
            " exit(0);<br />\n" +
            " default:<br />\n" +
            " printf(&quot;Wrong choice\\n&quot;);<br />\n" +
            " }/*End of switch*/<br />\n" +
            " }/*End of while*/<br />\n" +
            "}/*End of main()*/</p>\n" +
            "\n" +
            "<p>create_list(int num)<br />\n" +
            "{<br />\n" +
            " struct node *q,*tmp;<br />\n" +
            " tmp= malloc(sizeof(struct node));<br />\n" +
            " tmp->info = num;</p>\n" +
            "\n" +
            "<p> if(last == NULL)<br />\n" +
            " {<br />\n" +
            " last = tmp;<br />\n" +
            " tmp->link = last;<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " tmp->link = last->link; /*added at the end of list*/<br />\n" +
            " last->link = tmp;<br />\n" +
            " last = tmp;<br />\n" +
            " }<br />\n" +
            "}/*End of create_list()*/</p>\n" +
            "\n" +
            "<p>addatbeg(int num)<br />\n" +
            "{<br />\n" +
            " struct node *tmp;<br />\n" +
            " tmp = malloc(sizeof(struct node));<br />\n" +
            " tmp->info = num;<br />\n" +
            " tmp->link = last->link;<br />\n" +
            " last->link = tmp;<br />\n" +
            "}/*End of addatbeg()*/</p>\n" +
            "\n" +
            "<p>addafter(int num,int pos)<br />\n" +
            "{</p>\n" +
            "\n" +
            "<p> struct node *tmp,*q;<br />\n" +
            " int i;<br />\n" +
            " q = last->link;<br />\n" +
            " for(i=0; i < pos-1; i++)<br />\n" +
            " {<br />\n" +
            " q = q->link;<br />\n" +
            " if(q == last->link)<br />\n" +
            " {<br />\n" +
            " printf(&quot;There are less than %d elements\\n&quot;,pos);<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " }/*End of for*/<br />\n" +
            " tmp = malloc(sizeof(struct node) );<br />\n" +
            " tmp->link = q->link;<br />\n" +
            " tmp->info = num;<br />\n" +
            " q->link = tmp;<br />\n" +
            " if(q==last) /*Element inserted at the end*/<br />\n" +
            " last=tmp;<br />\n" +
            "}/*End of addafter()*/</p>\n" +
            "\n" +
            "<p>del(int num)<br />\n" +
            "{<br />\n" +
            " struct node *tmp,*q;<br />\n" +
            " if( last->link == last &amp;&amp; last->info == num) /*Only one element*/<br />\n" +
            " {<br />\n" +
            " tmp = last;<br />\n" +
            " last = NULL;<br />\n" +
            " free(tmp);<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " q = last->link;<br />\n" +
            " if(q->info == num)<br />\n" +
            " {<br />\n" +
            " tmp = q;<br />\n" +
            " last->link = q->link;<br />\n" +
            " free(tmp);<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " while(q->link != last)<br />\n" +
            " {<br />\n" +
            " if(q->link->info == num) /*Element deleted in between*/<br />\n" +
            " {<br />\n" +
            " tmp = q->link;<br />\n" +
            " q->link = tmp->link;<br />\n" +
            " free(tmp);<br />\n" +
            " printf(&quot;%d deleted\\n&quot;,num);<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " q = q->link;<br />\n" +
            " }/*End of while*/<br />\n" +
            " if(q->link->info == num) /*Last element deleted q->link=last*/<br />\n" +
            " {<br />\n" +
            " tmp = q->link;<br />\n" +
            " q->link = last->link;<br />\n" +
            " free(tmp);<br />\n" +
            " last = q;<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " printf(&quot;Element %d not found\\n&quot;,num);<br />\n" +
            "}/*End of del()*/</p>\n" +
            "\n" +
            "<p>display()<br />\n" +
            "{<br />\n" +
            " struct node *q;<br />\n" +
            " if(last == NULL)<br />\n" +
            " {<br />\n" +
            " printf(&quot;List is empty\\n&quot;);<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " q = last->link;<br />\n" +
            " printf(&quot;List is :\\n&quot;);<br />\n" +
            " while(q != last)<br />\n" +
            " {<br />\n" +
            " printf(&quot;%d &quot;, q->info);<br />\n" +
            " q = q->link;<br />\n" +
            " }<br />\n" +
            " printf(&quot;%d\\n&quot;,last->info);<br />\n" +
            "}/*End of display()*/</p>\n" +
            "\n" +
            "<p>\n" +
            "OUTPUT:--</p>\n" +
            "\n" +
            "<p>1.Create List<br />\n" +
            "2.Add at begining<br />\n" +
            "3.Add after<br />\n" +
            "4.Delete<br />\n" +
            "5.Display<br />\n" +
            "6.Quit<br />\n" +
            "Enter your choice : 1<br />\n" +
            "How many nodes you want : 3<br />\n" +
            "Enter the element : 2<br />\n" +
            "Enter the element : 3<br />\n" +
            "Enter the element : 6<br />\n" +
            "1.Create List<br />\n" +
            "2.Add at begining<br />\n" +
            "3.Add after<br />\n" +
            "4.Delete<br />\n" +
            "5.Display<br />\n" +
            "6.Quit<br />\n" +
            "Enter your choice : 3<br />\n" +
            "Enter the element : 5<br />\n" +
            "Enter the position after which this element is inserted : 3<br />\n" +
            "1.Create List<br />\n" +
            "2.Add at begining<br />\n" +
            "3.Add after<br />\n" +
            "4.Delete<br />\n" +
            "5.Display<br />\n" +
            "6.Quit<br />\n" +
            "Enter your choice : 5<br />\n" +
            "List is :<br />\n" +
            "2 3 6 5<br />\n" +
            "1.Create List<br />\n" +
            "2.Add at begining<br />\n" +
            "3.Add after<br />\n" +
            "4.Delete<br />\n" +
            "5.Display<br />\n" +
            "6.Quit<br />\n" +
            "Enter your choice : 4<br />\n" +
            "Enter the number for deletion : 6<br />\n" +
            "6 deleted<br />\n" +
            "1.Create List<br />\n" +
            "2.Add at begining<br />\n" +
            "3.Add after<br />\n" +
            "4.Delete<br />\n" +
            "5.Display<br />\n" +
            "6.Quit<br />\n" +
            "Enter your choice : 5<br />\n" +
            "List is :<br />\n" +
            "2 3 5<br />\n" +
            "1.Create List<br />\n" +
            "2.Add at begining<br />\n" +
            "3.Add after<br />\n" +
            "4.Delete<br />\n" +
            "5.Display<br />\n" +
            "6.Quit<br />\n" +
            "Enter your choice :</p>";

    public static final String program4 = "<p>/* Program of list using array */<br />\n" +
            "# include<stdio.h><br />\n" +
            "# define MAX 20</p>\n" +
            "\n" +
            "<p>int arr[MAX];<br />\n" +
            "int n; /*Total number of elements in the list */</p>\n" +
            "\n" +
            "<p>main()<br />\n" +
            "{<br />\n" +
            " int choice,item,pos;<br />\n" +
            " while(1)<br />\n" +
            " {<br />\n" +
            " printf(&quot;1.Input list\\n&quot;);<br />\n" +
            " printf(&quot;2.Insert\\n&quot;);<br />\n" +
            " printf(&quot;3.Search\\n&quot;);<br />\n" +
            " printf(&quot;4.Delete\\n&quot;);<br />\n" +
            " printf(&quot;5.Display\\n&quot;);<br />\n" +
            " printf(&quot;6.Quit\\n&quot;);<br />\n" +
            " printf(&quot;Enter your choice : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;choice);</p>\n" +
            "\n" +
            "<p> switch(choice)<br />\n" +
            " {<br />\n" +
            " case 1:<br />\n" +
            " printf(&quot;Enter the number of elements to be entered : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;n);<br />\n" +
            " input(n);<br />\n" +
            " break;<br />\n" +
            " case 2:<br />\n" +
            " insert();<br />\n" +
            " break;<br />\n" +
            " case 3:<br />\n" +
            " printf(&quot;Enter the element to be searched : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;, &amp;item);<br />\n" +
            " pos = search(item);<br />\n" +
            " if(pos >= 1)<br />\n" +
            " printf(&quot;%d found at position %d\\n&quot;,item,pos);<br />\n" +
            " else<br />\n" +
            " printf(&quot;Element not found\\n&quot;);<br />\n" +
            " break;<br />\n" +
            " case 4:<br />\n" +
            " del();<br />\n" +
            " break;<br />\n" +
            " case 5:<br />\n" +
            " display();<br />\n" +
            " break;<br />\n" +
            " case 6:<br />\n" +
            " exit(0);<br />\n" +
            " break;<br />\n" +
            " default:<br />\n" +
            " printf(&quot;Wrong choice\\n&quot;);<br />\n" +
            " } /*End of switch */<br />\n" +
            " }/*End of while */<br />\n" +
            "}/*End of main() */</p>\n" +
            "\n" +
            "<p>input()<br />\n" +
            "{<br />\n" +
            " int i;<br />\n" +
            " for(i = 0; i< n ; i++)<br />\n" +
            " {<br />\n" +
            " printf(&quot;Input value for element %d : &quot;, i+1);<br />\n" +
            " scanf(&quot;%d&quot;, &amp;arr[i]);<br />\n" +
            " }<br />\n" +
            "}/*End of input()*/</p>\n" +
            "\n" +
            "<p>int search(int item)<br />\n" +
            "{<br />\n" +
            " int i;<br />\n" +
            " for(i=0; i < n; i++)<br />\n" +
            " {<br />\n" +
            " if(item == arr[i])<br />\n" +
            " return(i+1);<br />\n" +
            " }<br />\n" +
            " return(0); /* If element not found */<br />\n" +
            "}/*End of search()*/</p>\n" +
            "\n" +
            "<p>insert()<br />\n" +
            "{<br />\n" +
            " int temp,item,position;<br />\n" +
            " if(n == MAX)<br />\n" +
            " {<br />\n" +
            " printf(&quot;List overflow\\n&quot;);<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " printf(&quot;Enter position for insertion : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;, &amp;position);<br />\n" +
            " printf(&quot;Enter the value : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;item);<br />\n" +
            " if(position > n+1 )<br />\n" +
            " {<br />\n" +
            " printf(&quot;Enter position less than or equal to %d\\n&quot;,n+1);<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " if( position == n+1 ) /*Insertion at the end */<br />\n" +
            " {<br />\n" +
            " arr[n] = item;<br />\n" +
            " n = n+1;<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " /* Insertion in between */<br />\n" +
            " temp=n-1;<br />\n" +
            " while( temp >= position-1)<br />\n" +
            " {<br />\n" +
            " arr[temp+1] = arr[temp]; /* shifting right */<br />\n" +
            " temp --;<br />\n" +
            " }<br />\n" +
            " arr[position-1] = item;<br />\n" +
            " n = n +1 ;<br />\n" +
            "}/*End of insert()*/</p>\n" +
            "\n" +
            "<p>del()<br />\n" +
            "{<br />\n" +
            " int temp,position,item;<br />\n" +
            " if(n == 0)<br />\n" +
            " {<br />\n" +
            " printf(&quot;List underflow\\n&quot;);<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " printf(&quot;Enter the element to be deleted : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;item);<br />\n" +
            " if(item==arr[n-1]) /*Deletion at the end*/<br />\n" +
            " {<br />\n" +
            " n = n-1;<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " position=search(item);<br />\n" +
            " if(position==0)<br />\n" +
            " {<br />\n" +
            " printf(&quot;Element not present in array\\n&quot;);<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " /*Deletion in between */<br />\n" +
            " temp=position-1;<br />\n" +
            " while(temp <= n-1)<br />\n" +
            " {<br />\n" +
            " arr[temp] = arr[temp+1]; /* Shifting left */<br />\n" +
            " temp ++;<br />\n" +
            " }<br />\n" +
            " n = n - 1 ;<br />\n" +
            "}/*End of del()*/</p>\n" +
            "\n" +
            "<p>display()<br />\n" +
            "{<br />\n" +
            " int i;<br />\n" +
            " if(n==0)<br />\n" +
            " {<br />\n" +
            " printf(&quot;List is empty\\n&quot;);<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " for(i = 0; i< n; i++)<br />\n" +
            " printf(&quot;Value at position %d : %d\\n&quot;, i+1, arr[i]);<br />\n" +
            "}/*End of display()*/</p>\n" +
            "\n" +
            "<p>\n" +
            "OUTPUT:---</p>\n" +
            "\n" +
            "<p>1.Input list<br />\n" +
            "2.Insert<br />\n" +
            "3.Search<br />\n" +
            "4.Delete<br />\n" +
            "5.Display<br />\n" +
            "6.Quit<br />\n" +
            "Enter your choice : 1<br />\n" +
            "Enter the number of elements to be entered : 3<br />\n" +
            "Input value for element 1 : 20<br />\n" +
            "Input value for element 2 : 30<br />\n" +
            "Input value for element 3 : 50<br />\n" +
            "1.Input list<br />\n" +
            "2.Insert<br />\n" +
            "3.Search<br />\n" +
            "4.Delete<br />\n" +
            "5.Display<br />\n" +
            "6.Quit<br />\n" +
            "Enter your choice : 3<br />\n" +
            "Enter the element to be searched : 30<br />\n" +
            "30 found at position 2<br />\n" +
            "1.Input list<br />\n" +
            "2.Insert<br />\n" +
            "3.Search<br />\n" +
            "4.Delete<br />\n" +
            "5.Display<br />\n" +
            "6.Quit<br />\n" +
            "Enter your choice : 4<br />\n" +
            "Enter the element to be deleted : 30<br />\n" +
            "1.Input list<br />\n" +
            "2.Insert<br />\n" +
            "3.Search<br />\n" +
            "4.Delete<br />\n" +
            "5.Display<br />\n" +
            "6.Quit<br />\n" +
            "Enter your choice : 5<br />\n" +
            "Value at position 1 : 20<br />\n" +
            "Value at position 2 : 50<br />\n" +
            "1.Input list<br />\n" +
            "2.Insert<br />\n" +
            "3.Search<br />\n" +
            "4.Delete<br />\n" +
            "5.Display<br />\n" +
            "6.Quit<br />\n" +
            "Enter your choice : 6</p>\n" +
            "\n" +
            "<p>--------------------------------<br />\n" +
            "Process exited after 40.89 seconds with return value 0<br />\n" +
            "Press any key to continue . . .</p>";

    public static final String program5 = "<p>/* Program of sorted linked list*/</p>\n" +
            "\n" +
            "<p># include <stdio.h><br />\n" +
            "# include <malloc.h></p>\n" +
            "\n" +
            "<p>struct node<br />\n" +
            "{<br />\n" +
            " int info;<br />\n" +
            " struct node *link;<br />\n" +
            "}*start;</p>\n" +
            "\n" +
            "<p>main()<br />\n" +
            "{<br />\n" +
            " int choice,n,m,i;<br />\n" +
            " start=NULL;<br />\n" +
            " while(1)<br />\n" +
            " {<br />\n" +
            " printf(&quot;1.Insert\\n&quot;);<br />\n" +
            " printf(&quot;2.Delete\\n&quot;);<br />\n" +
            " printf(&quot;3.Display \\n&quot;);<br />\n" +
            " printf(&quot;4.Exit\\n&quot;);<br />\n" +
            " printf(&quot;Enter your choice : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;choice);<br />\n" +
            " switch(choice)<br />\n" +
            " {<br />\n" +
            " case 1:<br />\n" +
            " printf(&quot;Enter the element to be inserted : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;m);<br />\n" +
            " insert(m);<br />\n" +
            " break;<br />\n" +
            " case 2:<br />\n" +
            " printf(&quot;Enter the element to be deleted : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;m);<br />\n" +
            " del(m);<br />\n" +
            " break;<br />\n" +
            " case 3:<br />\n" +
            " display();<br />\n" +
            " break;<br />\n" +
            " case 4:<br />\n" +
            " exit(0);<br />\n" +
            " default:<br />\n" +
            " printf(&quot;Wrong choice\\n&quot;);<br />\n" +
            " }/*End of switch*/<br />\n" +
            " }/*End of while*/<br />\n" +
            "} /*end of main */</p>\n" +
            "\n" +
            "<p>insert(int num)<br />\n" +
            "{<br />\n" +
            " struct node *q,*tmp;<br />\n" +
            " tmp= malloc(sizeof(struct node));<br />\n" +
            " tmp->info=num;</p>\n" +
            "\n" +
            "<p> /*list empty or item to be added in begining */<br />\n" +
            " if(start == NULL || num < start->info)<br />\n" +
            " {<br />\n" +
            " tmp->link=start;<br />\n" +
            " start=tmp;<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " q=start;<br />\n" +
            " while(q->link != NULL &amp;&amp; q->link->info < num)<br />\n" +
            " q=q->link;<br />\n" +
            " tmp->link=q->link;<br />\n" +
            " q->link=tmp;<br />\n" +
            " }<br />\n" +
            "}/*End of insert()*/</p>\n" +
            "\n" +
            "<p>del(int num)<br />\n" +
            "{<br />\n" +
            " struct node *tmp,*q;<br />\n" +
            " if(start->info==num)<br />\n" +
            " {<br />\n" +
            " tmp=start;<br />\n" +
            " start=start->link; /*first element deleted*/<br />\n" +
            " free(tmp);<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " q=start;<br />\n" +
            " while(q->link->link!=NULL)<br />\n" +
            " {<br />\n" +
            " if(q->link->info==num) /*element deleted in between*/<br />\n" +
            " {<br />\n" +
            " tmp=q->link;<br />\n" +
            " q->link=tmp->link;<br />\n" +
            " free(tmp);<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " q=q->link;<br />\n" +
            " }/*End of while */<br />\n" +
            " if(q->link->info==num) /*last element deleted*/<br />\n" +
            " {<br />\n" +
            " tmp=q->link;<br />\n" +
            " free(tmp);<br />\n" +
            " q->link=NULL;<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " printf(&quot;Element %d not found\\n&quot;,num);<br />\n" +
            "}/*End of del()*/</p>\n" +
            "\n" +
            "<p>display()<br />\n" +
            "{<br />\n" +
            " struct node *q;<br />\n" +
            " if(start == NULL)<br />\n" +
            " {<br />\n" +
            " printf(&quot;List is empty\\n&quot;);<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " q=start;<br />\n" +
            " printf(&quot;List is :\\n&quot;);<br />\n" +
            " while(q != NULL)<br />\n" +
            " {<br />\n" +
            " printf(&quot;%d &quot;, q->info);<br />\n" +
            " q=q->link;<br />\n" +
            " }<br />\n" +
            " printf(&quot;\\n&quot;);<br />\n" +
            "}/*End of display() */</p>\n" +
            "\n" +
            "<p>\n" +
            "OUTPUT:--</p>\n" +
            "\n" +
            "<p>1.Insert<br />\n" +
            "2.Delete<br />\n" +
            "3.Display<br />\n" +
            "4.Exit<br />\n" +
            "Enter your choice : 1<br />\n" +
            "Enter the element to be inserted : 3<br />\n" +
            "1.Insert<br />\n" +
            "2.Delete<br />\n" +
            "3.Display<br />\n" +
            "4.Exit<br />\n" +
            "Enter your choice : 1<br />\n" +
            "Enter the element to be inserted : 20<br />\n" +
            "1.Insert<br />\n" +
            "2.Delete<br />\n" +
            "3.Display<br />\n" +
            "4.Exit<br />\n" +
            "Enter your choice : 1<br />\n" +
            "Enter the element to be inserted : 50<br />\n" +
            "1.Insert<br />\n" +
            "2.Delete<br />\n" +
            "3.Display<br />\n" +
            "4.Exit<br />\n" +
            "Enter your choice : 3<br />\n" +
            "List is :<br />\n" +
            "3 20 50<br />\n" +
            "1.Insert<br />\n" +
            "2.Delete<br />\n" +
            "3.Display<br />\n" +
            "4.Exit<br />\n" +
            "Enter your choice : 2<br />\n" +
            "Enter the element to be deleted : 20<br />\n" +
            "1.Insert<br />\n" +
            "2.Delete<br />\n" +
            "3.Display<br />\n" +
            "4.Exit<br />\n" +
            "Enter your choice : 4</p>\n" +
            "\n" +
            "<p>--------------------------------<br />\n" +
            "Process exited after 31.57 seconds with return value 0<br />\n" +
            "Press any key to continue . . .</p>";

    public static final String program6 = "<p>/* Program of reverse linked list*/<br />\n" +
            "# include <stdio.h><br />\n" +
            "# include <malloc.h></p>\n" +
            "\n" +
            "<p>struct node<br />\n" +
            "{<br />\n" +
            " int info;<br />\n" +
            " struct node *link;<br />\n" +
            "}*start;</p>\n" +
            "\n" +
            "<p>main()<br />\n" +
            "{<br />\n" +
            " int i,n,item;<br />\n" +
            " start=NULL;</p>\n" +
            "\n" +
            "<p> printf(&quot;How many nodes you want : &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;n);<br />\n" +
            " for(i=0;i<n;i++)<br />\n" +
            " {<br />\n" +
            " printf(&quot;Enter the item %d : &quot;,i+1);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;item);<br />\n" +
            " create_list(item);<br />\n" +
            " }<br />\n" +
            " printf(&quot;Initially the linked list is :\\n&quot;);<br />\n" +
            " display();<br />\n" +
            " reverse();<br />\n" +
            " printf(&quot;Linked list after reversing is :\\n&quot;);<br />\n" +
            " display();<br />\n" +
            "}/*End of main()*/</p>\n" +
            "\n" +
            "<p>create_list(int num)<br />\n" +
            "{<br />\n" +
            " struct node *q,*tmp;<br />\n" +
            " tmp= malloc(sizeof(struct node));<br />\n" +
            " tmp->info=num;<br />\n" +
            " tmp->link=NULL;</p>\n" +
            "\n" +
            "<p> if(start==NULL)<br />\n" +
            " start=tmp;<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " q=start;<br />\n" +
            " while(q->link!=NULL)<br />\n" +
            " q=q->link;<br />\n" +
            " q->link=tmp;<br />\n" +
            " }<br />\n" +
            "}/*End of create_list() */</p>\n" +
            "\n" +
            "<p>display()<br />\n" +
            "{<br />\n" +
            " struct node *q;<br />\n" +
            " if(start == NULL)<br />\n" +
            " {<br />\n" +
            " printf(&quot;List is empty\\n&quot;);<br />\n" +
            " return;<br />\n" +
            " }<br />\n" +
            " q=start;<br />\n" +
            " while(q!=NULL)<br />\n" +
            " {<br />\n" +
            " printf(&quot;%d &quot;, q->info);<br />\n" +
            " q=q->link;<br />\n" +
            " }<br />\n" +
            " printf(&quot;\\n&quot;);<br />\n" +
            "}/*End of display()*/</p>\n" +
            "\n" +
            "<p>reverse()<br />\n" +
            "{<br />\n" +
            " struct node *p1,*p2,*p3;<br />\n" +
            " if(start->link==NULL) /*only one element*/<br />\n" +
            " return;<br />\n" +
            " p1=start;<br />\n" +
            " p2=p1->link;<br />\n" +
            " p3=p2->link;</p>\n" +
            "\n" +
            "<p> p1->link=NULL;<br />\n" +
            " p2->link=p1;</p>\n" +
            "\n" +
            "<p> while(p3!=NULL)<br />\n" +
            " {<br />\n" +
            " p1=p2;<br />\n" +
            " p2=p3;<br />\n" +
            " p3=p3->link;<br />\n" +
            " p2->link=p1;<br />\n" +
            " }<br />\n" +
            " start=p2;<br />\n" +
            "}/*End of reverse() */</p>\n" +
            "\n" +
            "<p>\n" +
            "OUTPUT:--</p>\n" +
            "\n" +
            "<p>How many nodes you want : 3<br />\n" +
            "Enter the item 1 : 1<br />\n" +
            "Enter the item 2 : 20<br />\n" +
            "Enter the item 3 : 50<br />\n" +
            "Initially the linked list is :<br />\n" +
            "1 20 50<br />\n" +
            "Linked list after reversing is :<br />\n" +
            "50 20 1</p>\n" +
            "\n" +
            "<p>--------------------------------<br />\n" +
            "</p>";

    public static final String program7 = "<p>#include<stdio.h><br />\n" +
            "#include<string.h><br />\n" +
            "#include<ctype.h><br />\n" +
            "#define size 100<br />\n" +
            "int top=-1;<br />\n" +
            "int flag=0;<br />\n" +
            "int stack[size];<br />\n" +
            "void push(int *,int);<br />\n" +
            "int pop(int *);<br />\n" +
            "void display(int *);<br />\n" +
            "void push(int s[],int d)<br />\n" +
            "{<br />\n" +
            " if(top==(size-1))<br />\n" +
            " flag=0;<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " flag=1;<br />\n" +
            " ++top;<br />\n" +
            " s[top]=d;<br />\n" +
            " }}<br />\n" +
            "int pop(int s[])<br />\n" +
            "{<br />\n" +
            " int popped_element;<br />\n" +
            " if(top==-1)<br />\n" +
            " {<br />\n" +
            " popped_element=0;<br />\n" +
            " flag=0;<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " flag=1;<br />\n" +
            " popped_element=s[top];<br />\n" +
            " --top;<br />\n" +
            " }<br />\n" +
            " return(popped_element);<br />\n" +
            "}<br />\n" +
            "void display(int s[])<br />\n" +
            "{<br />\n" +
            " int i;<br />\n" +
            " if(top==-1)<br />\n" +
            " {<br />\n" +
            " printf(&quot;\\n stack is empty&quot;);<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " for(i=top;i>=0;--i)<br />\n" +
            " printf(&quot;\\n %d&quot;,s[i]);<br />\n" +
            " }}<br />\n" +
            "/* this is the main function */<br />\n" +
            "int main()<br />\n" +
            "{<br />\n" +
            " int data;<br />\n" +
            " char choice;<br />\n" +
            " int q=0;<br />\n" +
            " int top=-1;<br />\n" +
            " <br />\n" +
            " do<br />\n" +
            " {<br />\n" +
            " printf(&quot;\\n push->i pop->p quit->q:&quot;);<br />\n" +
            " printf(&quot;enter your choice&quot;);<br />\n" +
            " do<br />\n" +
            " {<br />\n" +
            " choice=getchar();<br />\n" +
            " choice=tolower(choice);<br />\n" +
            " }<br />\n" +
            " while(strchr(&quot;ipq&quot;,choice)==NULL);<br />\n" +
            " printf(&quot;your choice is %c&quot;,choice);<br />\n" +
            " switch(choice)<br />\n" +
            " {<br />\n" +
            " case'i':printf(&quot;\\n input element to push&quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;data);<br />\n" +
            " push(stack,data);<br />\n" +
            " if(flag)<br />\n" +
            " {<br />\n" +
            " printf(&quot;\\n after inserting &quot;);<br />\n" +
            " display(stack);<br />\n" +
            " if(top==(size-1))<br />\n" +
            " printf(&quot;\\n stack is full&quot;);<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " printf(&quot;\\n stack is overflown after pushing&quot;);<br />\n" +
            " break;<br />\n" +
            " case 'p':data=pop(stack);<br />\n" +
            " if(flag)<br />\n" +
            " {<br />\n" +
            " printf(&quot;\\n data is popped:%d&quot;,data);<br />\n" +
            " printf(&quot;\\n now the stack is as follows :\\n&quot;);<br />\n" +
            " display(stack);<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " printf(&quot;\\n stack is underflown&quot;);<br />\n" +
            " break;<br />\n" +
            " case'q':q=1;<br />\n" +
            " } }<br />\n" +
            " while(!q);<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>\n" +
            "OUTPUT:--</p>\n" +
            "\n" +
            "<p>\n" +
            " push->i pop->p quit->q:enter your choicei<br />\n" +
            "your choice is i<br />\n" +
            " input element to push20</p>\n" +
            "\n" +
            "<p> after inserting<br />\n" +
            " 20<br />\n" +
            " push->i pop->p quit->q:enter your choicei<br />\n" +
            "your choice is i<br />\n" +
            " input element to push30</p>\n" +
            "\n" +
            "<p> after inserting<br />\n" +
            " 30<br />\n" +
            " 20<br />\n" +
            " push->i pop->p quit->q:enter your choicei<br />\n" +
            "your choice is i<br />\n" +
            " input element to push50</p>\n" +
            "\n" +
            "<p> after inserting<br />\n" +
            " 50<br />\n" +
            " 30<br />\n" +
            " 20<br />\n" +
            " push->i pop->p quit->q:enter your choicep<br />\n" +
            "your choice is p<br />\n" +
            " data is popped:50<br />\n" +
            " now the stack is as follows :</p>\n" +
            "\n" +
            "<p> 30<br />\n" +
            " 20<br />\n" +
            " push->i pop->p quit->q:enter your choiceq<br />\n" +
            "your choice is q<br />\n" +
            "--------------------------------<br />\n" +
            "</p>";

    public static final String program8 = "<p>#include<stdio.h><br />\n" +
            "#include<string.h><br />\n" +
            "#include<ctype.h><br />\n" +
            "#define size 100<br />\n" +
            "int top=-1;<br />\n" +
            "int flag=0;<br />\n" +
            "int stack[size];<br />\n" +
            "void push(int *,int);<br />\n" +
            "int pop(int *);<br />\n" +
            "void display(int *);<br />\n" +
            "void push(int s[],int d)<br />\n" +
            "{<br />\n" +
            " if(top==(size-1))<br />\n" +
            " flag=0;<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " flag=1;<br />\n" +
            " ++top;<br />\n" +
            " s[top]=d;<br />\n" +
            " }}<br />\n" +
            "int pop(int s[])<br />\n" +
            "{<br />\n" +
            " int popped_element;<br />\n" +
            " if(top==-1)<br />\n" +
            " {<br />\n" +
            " popped_element=0;<br />\n" +
            " flag=0;<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " flag=1;<br />\n" +
            " popped_element=s[top];<br />\n" +
            " --top;<br />\n" +
            " }<br />\n" +
            " return(popped_element);<br />\n" +
            "}<br />\n" +
            "void display(int s[])<br />\n" +
            "{<br />\n" +
            " int i;<br />\n" +
            " if(top==-1)<br />\n" +
            " {<br />\n" +
            " printf(&quot;\\n stack is empty&quot;);<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " for(i=top;i>=0;--i)<br />\n" +
            " printf(&quot;\\n %d&quot;,s[i]);<br />\n" +
            " }}<br />\n" +
            "/* this is the main function */<br />\n" +
            "void main()<br />\n" +
            "{<br />\n" +
            " int data;<br />\n" +
            " char choice;<br />\n" +
            " int q=0;<br />\n" +
            " int top=-1;<br />\n" +
            " <br />\n" +
            " do<br />\n" +
            " {<br />\n" +
            " printf(&quot;\\n push->i pop->p quit->q:&quot;);<br />\n" +
            " printf(&quot;enter your choice&quot;);<br />\n" +
            " do<br />\n" +
            " {<br />\n" +
            " choice=getchar();<br />\n" +
            " choice=tolower(choice);<br />\n" +
            " }<br />\n" +
            " while(strchr(&quot;ipq&quot;,choice)==NULL);<br />\n" +
            " printf(&quot;your choice is %c&quot;,choice);<br />\n" +
            " switch(choice)<br />\n" +
            " {<br />\n" +
            " case'i':printf(&quot;\\n input element to push&quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;data);<br />\n" +
            " push(stack,data);<br />\n" +
            " if(flag)<br />\n" +
            " {<br />\n" +
            " printf(&quot;\\n after inserting &quot;);<br />\n" +
            " display(stack);<br />\n" +
            " if(top==(size-1))<br />\n" +
            " printf(&quot;\\n stack is full&quot;);<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " printf(&quot;\\n stack is overflown after pushing&quot;);<br />\n" +
            " break;<br />\n" +
            " case 'p':data=pop(stack);<br />\n" +
            " if(flag)<br />\n" +
            " {<br />\n" +
            " printf(&quot;\\n data is popped:%d&quot;,data);<br />\n" +
            " printf(&quot;\\n now the stack is as follows :\\n&quot;);<br />\n" +
            " display(stack);<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " printf(&quot;\\n stack is underflown&quot;);<br />\n" +
            " break;<br />\n" +
            " case'q':q=1;<br />\n" +
            " } }<br />\n" +
            " while(!q);<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>\n" +
            "OUTPUT:--</p>\n" +
            "\n" +
            "<p>\n" +
            " push->i pop->p quit->q:enter your choicei<br />\n" +
            "your choice is i<br />\n" +
            " input element to push20</p>\n" +
            "\n" +
            "<p> after inserting<br />\n" +
            " 20<br />\n" +
            " push->i pop->p quit->q:enter your choicei<br />\n" +
            "your choice is i<br />\n" +
            " input element to push30</p>\n" +
            "\n" +
            "<p> after inserting<br />\n" +
            " 30<br />\n" +
            " 20<br />\n" +
            " push->i pop->p quit->q:enter your choicep<br />\n" +
            "your choice is p<br />\n" +
            " data is popped:30<br />\n" +
            " now the stack is as follows :</p>\n" +
            "\n" +
            "<p> 20<br />\n" +
            " push->i pop->p quit->q:enter your choiceq<br />\n" +
            "your choice is q<br />\n" +
            "--------------------------------<br />\n" +
            "</p>";

    public static final String program9 = "<p>#define SIZE 50 /* Size of Stack */<br />\n" +
            "#include <ctype.h><br />\n" +
            "char s[SIZE];<br />\n" +
            "int top = -1; /* Global declarations */<br />\n" +
            " push(char elem) { /* Function for PUSH operation */<br />\n" +
            " s[++top] = elem;<br />\n" +
            "}<br />\n" +
            " char pop() { /* Function for POP operation */<br />\n" +
            " return (s[top--]);<br />\n" +
            "}<br />\n" +
            " int pr(char elem) { /* Function for precedence */<br />\n" +
            " switch (elem) {<br />\n" +
            " case '#':<br />\n" +
            " return 0;<br />\n" +
            " case '(':<br />\n" +
            " return 1;<br />\n" +
            " case '+':<br />\n" +
            " case '-':<br />\n" +
            " return 2;<br />\n" +
            " case '*':<br />\n" +
            " case '/':<br />\n" +
            " return 3;<br />\n" +
            " }<br />\n" +
            "}<br />\n" +
            " main() { /* Main Program */<br />\n" +
            " char infx[50], pofx[50], ch, elem;<br />\n" +
            " int i = 0, k = 0;<br />\n" +
            " printf(&quot;\\n\\nRead the Infix Expression ? &quot;);<br />\n" +
            " scanf(&quot;%s&quot;, infx);<br />\n" +
            " push('#');<br />\n" +
            " while ((ch = infx[i++]) != '\\0') {<br />\n" +
            " if (ch == '(')<br />\n" +
            " push(ch);<br />\n" +
            " else if (isalnum(ch))<br />\n" +
            " pofx[k++] = ch;<br />\n" +
            " else if (ch == ')') {<br />\n" +
            " while (s[top] != '(')<br />\n" +
            " pofx[k++] = pop();<br />\n" +
            " elem = pop(); /* Remove ( */<br />\n" +
            " } else { /* Operator */<br />\n" +
            " while (pr(s[top]) >= pr(ch))<br />\n" +
            " pofx[k++] = pop();<br />\n" +
            " push(ch);<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " while (s[top] != '#') /* Pop from stack till empty */<br />\n" +
            " pofx[k++] = pop();<br />\n" +
            " pofx[k] = '\\0'; /* Make pofx as valid string */<br />\n" +
            " printf(&quot;\\n\\nGiven Infix Expn: %s Postfix Expn: %s\\n&quot;, infx, pofx);<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>OUTPUT:--</p>\n" +
            "\n" +
            "<p>Read the Infix Expression ? (a+b)-c%(d+h)+e</p>\n" +
            "\n" +
            "<p>\n" +
            "Given Infix Expn: (a+b)-c%(d+h)+e Postfix Expn: ab+cdh+%-e+</p>\n" +
            "\n" +
            "<p>--------------------------------<br />\n" +
            "</p>";

    public static final String program10 = "<p>#include<stdio.h><br />\n" +
            "#include<conio.h><br />\n" +
            "#include<string.h><br />\n" +
            "#define MAX 50<br />\n" +
            "int stack[MAX];<br />\n" +
            "char post[MAX];<br />\n" +
            "int top=-1;<br />\n" +
            "void pushstack(int tmp);<br />\n" +
            "void calculator(char c);<br />\n" +
            "void main()<br />\n" +
            "{<br />\n" +
            " int i;<br />\n" +
            " <br />\n" +
            " printf(&quot;Insert a postfix notation :: &quot;);<br />\n" +
            " gets(post);<br />\n" +
            " for(i=0;i<strlen(post);i++)<br />\n" +
            " {<br />\n" +
            " if(post[i]>='0' &amp;&amp; post[i]<='9')<br />\n" +
            " {<br />\n" +
            " pushstack(i);<br />\n" +
            " }<br />\n" +
            " if(post[i]=='+' || post[i]=='-' || post[i]=='*' || <br />\n" +
            " post[i]=='/' || post[i]=='^')<br />\n" +
            " {<br />\n" +
            " calculator(post[i]);<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " printf(&quot;\\n\\nResult :: %d&quot;,stack[top]);<br />\n" +
            " getch();<br />\n" +
            "}<br />\n" +
            "void pushstack(int tmp)<br />\n" +
            "{<br />\n" +
            " top++;<br />\n" +
            " stack[top]=(int)(post[tmp]-48);<br />\n" +
            "}<br />\n" +
            "void calculator(char c)<br />\n" +
            "{<br />\n" +
            " int a,b,ans;<br />\n" +
            " a=stack[top];<br />\n" +
            " stack[top]='\\0';<br />\n" +
            " top--;<br />\n" +
            " b=stack[top];<br />\n" +
            " stack[top]='\\0';<br />\n" +
            " top--;<br />\n" +
            " switch(c)<br />\n" +
            " {<br />\n" +
            " case '+':<br />\n" +
            " ans=b+a;<br />\n" +
            " break;<br />\n" +
            " case '-':<br />\n" +
            " ans=b-a;<br />\n" +
            " break;<br />\n" +
            " case '*':<br />\n" +
            " ans=b*a;<br />\n" +
            " break;<br />\n" +
            " case '/':<br />\n" +
            " ans=b/a;<br />\n" +
            " break;<br />\n" +
            " case '^':<br />\n" +
            " ans=b^a;<br />\n" +
            " break;<br />\n" +
            " default:<br />\n" +
            " ans=0;<br />\n" +
            " }<br />\n" +
            " top++;<br />\n" +
            " stack[top]=ans;<br /><p>#include <stdio.h><br />\n" +
            "#include <conio.h><br />\n" +
            "#include <malloc.h><br />\n" +
            "#include <process.h><br />\n" +
            "#include <ctype.h><br />\n" +
            "#define SIZE 5<br />\n" +
            "void menu();<br />\n" +
            "void display();<br />\n" +
            "int underflow();<br />\n" +
            "int overflow();<br />\n" +
            "void enqueue(int);<br />\n" +
            "void dequeue();<br />\n" +
            "int queue[SIZE];<br />\n" +
            "int front=-1;<br />\n" +
            "int rear=-1;<br />\n" +
            "void main()<br />\n" +
            "{<br />\n" +
            " <br />\n" +
            " menu();<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>void menu()<br />\n" +
            "{<br />\n" +
            " int choice,item;<br />\n" +
            " printf(&quot;MENU&quot;);<br />\n" +
            " printf(&quot;\\n1. Insert into the queue&quot;);<br />\n" +
            " printf(&quot;\\n2. Delete from queue&quot;);<br />\n" +
            " printf(&quot;\\n3. Display&quot;);<br />\n" +
            " printf(&quot;\\n4. Exit&quot;);<br />\n" +
            " printf(&quot;\\nEnter your choice: &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;choice);<br />\n" +
            " switch(choice)<br />\n" +
            " {<br />\n" +
            " case 1:<br />\n" +
            " <br />\n" +
            " if(overflow()==0)<br />\n" +
            " {<br />\n" +
            " printf(&quot;\\nEnter the item tobe inserted: &quot;);<br />\n" +
            " scanf(&quot;%d&quot;,&amp;item);<br />\n" +
            " enqueue(item);<br />\n" +
            " <br />\n" +
            " printf(&quot;\\nAfter inserting queue is:\\n&quot;);<br />\n" +
            " }<br />\n" +
            " display();<br />\n" +
            " getch();<br />\n" +
            " <br />\n" +
            " menu();<br />\n" +
            " break;<br />\n" +
            " <br />\n" +
            "case 2:<br />\n" +
            " <br />\n" +
            " if(underflow()==1)<br />\n" +
            " {<br />\n" +
            " dequeue();<br />\n" +
            " if(underflow()==1)<br />\n" +
            " {<br />\n" +
            " printf(&quot;\\nAfter deletion queue is:\\n&quot;);<br />\n" +
            " display();<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " getch();<br />\n" +
            " <br />\n" +
            " menu();<br />\n" +
            " break;<br />\n" +
            " case 3:<br />\n" +
            " <br />\n" +
            " if(underflow()==1)<br />\n" +
            " {<br />\n" +
            " printf(&quot;The queue is:\\n&quot;);<br />\n" +
            " display();<br />\n" +
            " }<br />\n" +
            " getch();<br />\n" +
            " <br />\n" +
            " menu();<br />\n" +
            " break;<br />\n" +
            " case 4:<br />\n" +
            " exit(1);<br />\n" +
            " default:<br />\n" +
            " <br />\n" +
            " printf(&quot;Your choice is wrong\\n\\n&quot;);<br />\n" +
            " menu();<br />\n" +
            " }<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>int underflow()<br />\n" +
            "{<br />\n" +
            " if((front==-1)&amp;&amp;(rear==-1))<br />\n" +
            " {<br />\n" +
            " printf(&quot;\\nQueue is empty&quot;);<br />\n" +
            " return(0);<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " return(1);<br />\n" +
            " }<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>int overflow()<br />\n" +
            "{<br />\n" +
            " if(rear==SIZE-1)<br />\n" +
            " {<br />\n" +
            " printf(&quot;\\nQueue is full\\n&quot;);<br />\n" +
            " return(1);<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " return(0);<br />\n" +
            " }<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>void enqueue(int item)<br />\n" +
            "{<br />\n" +
            " if((front==-1)&amp;&amp;(rear==-1))<br />\n" +
            " {<br />\n" +
            " front=0;<br />\n" +
            " rear=0;<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " rear=rear+1;<br />\n" +
            " }<br />\n" +
            " queue[rear]=item;<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>void dequeue()<br />\n" +
            "{<br />\n" +
            " if(front==rear)<br />\n" +
            " {<br />\n" +
            " front=-1;<br />\n" +
            " rear=-1;<br />\n" +
            " }<br />\n" +
            " else<br />\n" +
            " {<br />\n" +
            " front=front+1;<br />\n" +
            " }<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>void display()<br />\n" +
            "{<br />\n" +
            " int i;<br />\n" +
            " for(i=front;i<=rear;i++)<br />\n" +
            " {<br />\n" +
            " printf(&quot;\\nElement %d : %d&quot;,i+1,queue[i]);<br />\n" +
            " }<br />\n" +
            "}</p>\n" +
            "\n" +
            "<p>\n" +
            "OUTPUT:--</p>\n" +
            "\n" +
            "<p>MENU<br />\n" +
            "1. Insert into the queue<br />\n" +
            "2. Delete from queue<br />\n" +
            "3. Display<br />\n" +
            "4. Exit<br />\n" +
            "Enter your choice: 1</p>\n" +
            "\n" +
            "<p>Enter the item tobe inserted: 20</p>\n" +
            "\n" +
            "<p>After inserting queue is:</p>\n" +
            "\n" +
            "<p>Element 1 : 20MENU<br />\n" +
            "1. Insert into the queue<br />\n" +
            "2. Delete from queue<br />\n" +
            "3. Display<br />\n" +
            "4. Exit<br />\n" +
            "Enter your choice: 1</p>\n" +
            "\n" +
            "<p>Enter the item tobe inserted: 40</p>\n" +
            "\n" +
            "<p>After inserting queue is:</p>\n" +
            "\n" +
            "<p>Element 1 : 20<br />\n" +
            "Element 2 : 40MENU<br />\n" +
            "1. Insert into the queue<br />\n" +
            "2. Delete from queue<br />\n" +
            "3. Display<br />\n" +
            "4. Exit<br />\n" +
            "Enter your choice: 2</p>\n" +
            "\n" +
            "<p>After deletion queue is:</p>\n" +
            "\n" +
            "<p>Element 2 : 40MENU<br />\n" +
            "1. Insert into the queue<br />\n" +
            "2. Delete from queue<br />\n" +
            "3. Display<br />\n" +
            "4. Exit<br />\n" +
            "Enter your choice: 3<br />\n" +
            "The queue is:</p>\n" +
            "\n" +
            "<p>Element 2 : 40MENU<br />\n" +
            "1. Insert into the queue<br />\n" +
            "2. Delete from queue<br />\n" +
            "3. Display<br />\n" +
            "4. Exit<br />\n" +
            "Enter your choice: 4</p>\n" +
            "\n" +
            "<p>--------------------------------<br />\n" +
            "</p>\n" +
            "}</p>\n" +
            "\n" +
            "<p>\n" +
            "OUTPUT:--</p>\n" +
            "\n" +
            "<p>Insert a postfix notation :: 123*+4-</p>\n" +
            "\n" +
            "<p>\n" +
            "Result :: 3</p>";

    public static final String program11 = "<p>#include <stdio.h><br />\n" +
            " #include <stdlib.h></p>\n" +
            "\n" +
            "<p> struct tnode {<br />\n" +
            " int data;<br />\n" +
            " struct tnode *left, *right;<br />\n" +
            " };</p>\n" +
            "\n" +
            "<p> struct tnode *root = NULL;</p>\n" +
            "\n" +
            "<p> /* creating node of the tree and fill the given data */<br />\n" +
            " struct tnode * createNode(int data) {<br />\n" +
            " struct tnode *newNode;<br />\n" +
            " newNode = (struct tnode *) malloc(sizeof(struct tnode));<br />\n" +
            " newNode->data = data;<br />\n" +
            " newNode->left = NULL;<br />\n" +
            " newNode->right = NULL;<br />\n" +
            " return (newNode);<br />\n" +
            " }</p>\n" +
            "\n" +
            "<p> /* inserting a new node into the tree */<br />\n" +
            " void insertion(struct tnode **node, int data) {<br />\n" +
            " if (!*node) {<br />\n" +
            " *node = createNode(data);<br />\n" +
            " } else if (data < (*node)->data) {<br />\n" +
            " insertion(&amp;(*node)->left, data);<br />\n" +
            " } else if (data > (*node)->data) {<br />\n" +
            " insertion(&amp;(*node)->right, data);<br />\n" +
            " }<br />\n" +
            " }</p>\n" +
            "\n" +
            "<p> /* post order tree traversal */<br />\n" +
            " void postOrder(struct tnode *node) {<br />\n" +
            " if (node) {<br />\n" +
            " postOrder(node->left);<br />\n" +
            " postOrder(node->right);<br />\n" +
            " printf(&quot;%d &quot;, node->data);<br />\n" +
            " }<br />\n" +
            " return;<br />\n" +
            " }</p>\n" +
            "\n" +
            "<p> /* pre order tree traversal */<br />\n" +
            " void preOrder(struct tnode *node) {<br />\n" +
            " if (node) {<br />\n" +
            " printf(&quot;%d &quot;, node->data);<br />\n" +
            " preOrder(node->left);<br />\n" +
            " preOrder(node->right);<br />\n" +
            " }<br />\n" +
            " return;<br />\n" +
            " }</p>\n" +
            "\n" +
            "<p> /* inorder tree traversal */<br />\n" +
            " void inOrder(struct tnode *node) {<br />\n" +
            " if (node) {<br />\n" +
            " inOrder(node->left);<br />\n" +
            " printf(&quot;%d &quot;, node->data);<br />\n" +
            " inOrder(node->right);<br />\n" +
            " }<br />\n" +
            " return;<br />\n" +
            " }</p>\n" +
            "\n" +
            "<p> int main() {<br />\n" +
            " int data, ch;<br />\n" +
            " while (1) {<br />\n" +
            " printf(&quot;\\n1. Insertion\\n2. Pre-order\\n&quot;);<br />\n" +
            " printf(&quot;3. Post-order\\n4. In-order\\n&quot;);<br />\n" +
            " printf(&quot;5. Exit\\nEnter your choice:&quot;);<br />\n" +
            " scanf(&quot;%d&quot;, &amp;ch);<br />\n" +
            " switch (ch) {<br />\n" +
            " case 1:<br />\n" +
            " printf(&quot;Enter ur data:&quot;);<br />\n" +
            " scanf(&quot;%d&quot;, &amp;data);<br />\n" +
            " insertion(&amp;root, data);<br />\n" +
            " break;<br />\n" +
            " case 2:<br />\n" +
            " preOrder(root);<br />\n" +
            " break;<br />\n" +
            " case 3:<br />\n" +
            " postOrder(root);<br />\n" +
            " break;<br />\n" +
            " case 4:<br />\n" +
            " inOrder(root);<br />\n" +
            " break;<br />\n" +
            " case 5:<br />\n" +
            " exit(0);<br />\n" +
            " default:<br />\n" +
            " printf(&quot;U've entered wrong opetion\\n&quot;);<br />\n" +
            " break;<br />\n" +
            " }<br />\n" +
            " }<br />\n" +
            " return 0;<br />\n" +
            " }</p>\n" +
            "\n" +
            "<p>\n" +
            " OUTPUT: (Binary Tree Traversal - Inorder, Postorder &amp; Preorder)</p>\n" +
            "\n" +
            "<p> 1. Insertion<br />\n" +
            " 2. Pre-order<br />\n" +
            " 3. Post-order<br />\n" +
            " 4. In-order<br />\n" +
            " 5. Exit<br />\n" +
            " Enter your choice:1<br />\n" +
            " Enter ur data:20<br />\n" +
            " 1. Insertion<br />\n" +
            " 2. Pre-order<br />\n" +
            " 3. Post-order<br />\n" +
            " 4. In-order<br />\n" +
            " 5. Exit<br />\n" +
            " Enter your choice:1<br />\n" +
            " Enter ur data:15<br />\n" +
            " 1. Insertion<br />\n" +
            " 2. Pre-order<br />\n" +
            " 3. Post-order<br />\n" +
            " 4. In-order<br />\n" +
            " 5. Exit<br />\n" +
            " Enter your choice:1<br />\n" +
            " Enter ur data:8<br />\n" +
            " 1. Insertion<br />\n" +
            " 2. Pre-order<br />\n" +
            " 3. Post-order<br />\n" +
            " 4. In-order<br />\n" +
            " 5. Exit<br />\n" +
            " Enter your choice:1<br />\n" +
            " Enter ur data:10<br />\n" +
            " 1. Insertion<br />\n" +
            " 2. Pre-order<br />\n" +
            " 3. Post-order<br />\n" +
            " 4. In-order<br />\n" +
            " 5. Exit<br />\n" +
            " Enter your choice:1<br />\n" +
            " Enter ur data:30<br />\n" +
            " 1. Insertion<br />\n" +
            " 2. Pre-order<br />\n" +
            " 3. Post-order<br />\n" +
            " 4. In-order<br />\n" +
            " 5. Exit<br />\n" +
            " Enter your choice:1<br />\n" +
            " Enter ur data:25<br />\n" +
            " 1. Insertion<br />\n" +
            " 2. Pre-order<br />\n" +
            " 3. Post-order<br />\n" +
            " 4. In-order<br />\n" +
            " 5. Exit<br />\n" +
            " Enter your choice:1<br />\n" +
            " Enter ur data:40<br />\n" +
            " 1. Insertion<br />\n" +
            " 2. Pre-order<br />\n" +
            " 3. Post-order<br />\n" +
            " 4. In-order<br />\n" +
            " 5. Exit<br />\n" +
            " Enter your choice:2<br />\n" +
            " 20 15 8 10 30 25 40 <br />\n" +
            " 1. Insertion<br />\n" +
            " 2. Pre-order<br />\n" +
            " 3. Post-order<br />\n" +
            " 4. In-order<br />\n" +
            " 5. Exit<br />\n" +
            " Enter your choice:3<br />\n" +
            " 10 8 15 25 40 30 20 <br />\n" +
            " 1. Insertion<br />\n" +
            " 2. Pre-order<br />\n" +
            " 3. Post-order<br />\n" +
            " 4. In-order<br />\n" +
            " 5. Exit<br />\n" +
            " Enter your choice:4<br />\n" +
            " 8 10 15 20 25 30 40 <br />\n" +
            " 1. Insertion<br />\n" +
            " 2. Pre-order<br />\n" +
            " 3. Post-order<br />\n" +
            " 4. In-order<br />\n" +
            " 5. Exit<br />\n" +
            " Enter your choice:5</p>";

    public static final String program12 = "<ol class=\"linenums\">\n" +
            "<li class=\"L0\">\n" +
            "<p># include &lt;stdio.h&gt;<br /># include &lt;conio.h&gt;<br /># include &lt;stdlib.h&gt;<br /> <br />typedef struct BST {<br /> int data;<br /> struct BST *lchild, *rchild;<br />} node;<br /> <br />void insert(node *, node *);<br />void inorder(node *);<br />void preorder(node *);<br />void postorder(node *);<br />node *search(node *, int, node **);<br /> <br />void main() {<br /> int choice;<br /> char ans = 'N';<br /> int key;<br /> node *new_node, *root, *tmp, *parent;<br /> node *get_node();<br /> root = NULL;<br /> <br /> printf(\"\\nProgram For Binary Search Tree \");<br /> do {<br /> printf(\"\\n1.Create\");<br /> printf(\"\\n2.Search\");<br /> printf(\"\\n3.Recursive Traversals\");<br /> printf(\"\\n4.Exit\");<br /> printf(\"\\nEnter your choice :\");<br /> scanf(\"%d\", &amp;choice);<br /> <br /> switch (choice) {<br /> case 1:<br /> do {<br /> new_node = get_node();<br /> printf(\"\\nEnter The Element \");<br /> scanf(\"%d\", &amp;new_node-&gt;data);<br /> <br /> if (root == NULL) /* Tree is not Created */<br /> root = new_node;<br /> else<br /> insert(root, new_node);<br /> <br /> printf(\"\\nWant To enter More Elements?(y/n)\");<br /> ans = getch();<br /> } while (ans == 'y');<br /> break;<br /> <br /> case 2:<br /> printf(\"\\nEnter Element to be searched :\");<br /> scanf(\"%d\", &amp;key);<br /> <br /> tmp = search(root, key, &amp;parent);<br /> printf(\"\\nParent of node %d is %d\", tmp-&gt;data, parent-&gt;data);<br /> break;<br /> <br /> case 3:<br /> if (root == NULL)<br /> printf(\"Tree Is Not Created\");<br /> else {<br /> printf(\"\\nThe Inorder display : \");<br /> inorder(root);<br /> printf(\"\\nThe Preorder display : \");<br /> preorder(root);<br /> printf(\"\\nThe Postorder display : \");<br /> postorder(root);<br /> }<br /> break;<br /> }<br /> } while (choice != 4);<br />}<br />/*<br /> Get new Node<br /> */<br />node *get_node() {<br /> node *temp;<br /> temp = (node *) malloc(sizeof(node));<br /> temp-&gt;lchild = NULL;<br /> temp-&gt;rchild = NULL;<br /> return temp;<br />}<br />/*<br /> This function is for creating a binary search tree<br /> */<br />void insert(node *root, node *new_node) {<br /> if (new_node-&gt;data &lt; root-&gt;data) {<br /> if (root-&gt;lchild == NULL)<br /> root-&gt;lchild = new_node;<br /> else<br /> insert(root-&gt;lchild, new_node);<br /> }<br /> <br /> if (new_node-&gt;data &gt; root-&gt;data) {<br /> if (root-&gt;rchild == NULL)<br /> root-&gt;rchild = new_node;<br /> else<br /> insert(root-&gt;rchild, new_node);<br /> }<br />}<br />/*<br /> This function is for searching the node from<br /> binary Search Tree<br /> */<br />node *search(node *root, int key, node **parent) {<br /> node *temp;<br /> temp = root;<br /> while (temp != NULL) {<br /> if (temp-&gt;data == key) {<br /> printf(\"\\nThe %d Element is Present\", temp-&gt;data);<br /> return temp;<br /> }<br /> *parent = temp;<br /> <br /> if (temp-&gt;data &gt; key)<br /> temp = temp-&gt;lchild;<br /> else<br /> temp = temp-&gt;rchild;<br /> }<br /> return NULL;<br />}<br />/*<br /> This function displays the tree in inorder fashion<br /> */<br />void inorder(node *temp) {<br /> if (temp != NULL) {<br /> inorder(temp-&gt;lchild);<br /> printf(\"%d\", temp-&gt;data);<br /> inorder(temp-&gt;rchild);<br /> }<br />}<br />/*<br /> This function displays the tree in preorder fashion<br /> */<br />void preorder(node *temp) {<br /> if (temp != NULL) {<br /> printf(\"%d\", temp-&gt;data);<br /> preorder(temp-&gt;lchild);<br /> preorder(temp-&gt;rchild);<br /> }<br />}<br /> <br />/*<br /> This function displays the tree in postorder fashion<br /> */<br />void postorder(node *temp) {<br /> if (temp != NULL) {<br /> postorder(temp-&gt;lchild);<br /> postorder(temp-&gt;rchild);<br /> printf(\"%d\", temp-&gt;data);<br /> }<br /> <br />}</p>\n" +
            "<p><br />OUTPUT:--</p>\n" +
            "<p><br />Program For Binary Search Tree<br />1.Create<br />2.Search<br />3.Recursive Traversals<br />4.Exit<br />Enter your choice :1</p>\n" +
            "<p>Enter The Element 20</p>\n" +
            "<p>Want To enter More Elements?(y/n)<br />Enter The Element<br />30</p>\n" +
            "<p>Want To enter More Elements?(y/n)<br />Enter The Element<br />40</p>\n" +
            "<p>Want To enter More Elements?(y/n)<br />1.Create<br />2.Search<br />3.Recursive Traversals<br />4.Exit<br />Enter your choice :2</p>\n" +
            "<p>Enter Element to be searched :30</p>\n" +
            "<p>The 30 Element is Present<br />Parent of node 30 is 20</p>\n" +
            "<p>1.Create<br />2.Search<br />3.Recursive Traversals<br />4.Exit<br />Enter your choice :3</p>\n" +
            "<p>The Inorder display : 203040<br />The Preorder display : 203040<br />The Postorder display : 403020</p>\n" +
            "<p>1.Create<br />2.Search<br />3.Recursive Traversals<br />4.Exit<br />Enter your choice :4</p>\n" +
            "<p>--------------------------------</p>\n" +
            "</li>\n" +
            "</ol>";

    public static final String program13 = "gkgk";

    public static final String program14 = "<p><strong>/* Selection Sort*/</strong></p>\n" +
            "<p><br />#include&lt;stdio.h&gt;<br />int main(){</p>\n" +
            "<p>int s,i,j,temp,a[20];</p>\n" +
            "<p>printf(\"Enter total elements: \");<br /> scanf(\"%d\",&amp;s);</p>\n" +
            "<p>printf(\"Enter %d elements: \",s);<br /> for(i=0;i&lt;s;i++)<br /> scanf(\"%d\",&amp;a[i]);</p>\n" +
            "<p>for(i=0;i&lt;s;i++){<br /> for(j=i+1;j&lt;s;j++){<br /> if(a[i]&gt;a[j]){<br /> temp=a[i];<br /> a[i]=a[j];<br /> a[j]=temp;<br /> }<br /> }<br /> }</p>\n" +
            "<p>printf(\"After sorting is: \");<br /> for(i=0;i&lt;s;i++)<br /> printf(\" %d\",a[i]);</p>\n" +
            "<p>return 0;<br />}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:--</strong></p>\n" +
            "<p><strong>Enter total elements: 5<br />Enter 5 elements: 01<br />50<br />41<br />100<br />31<br />After sorting is: 1 31 41 50 100<br />--------------------------------<br /><br /></strong></p>";


    public static final String program15 = "<p><strong>/* Selection Sort*/</strong></p>\n" +
            "<p><br />#include&lt;stdio.h&gt;<br />int main(){</p>\n" +
            "<p>int s,i,j,temp,a[20];</p>\n" +
            "<p>printf(\"Enter total elements: \");<br /> scanf(\"%d\",&amp;s);</p>\n" +
            "<p>printf(\"Enter %d elements: \",s);<br /> for(i=0;i&lt;s;i++)<br /> scanf(\"%d\",&amp;a[i]);</p>\n" +
            "<p>for(i=0;i&lt;s;i++){<br /> for(j=i+1;j&lt;s;j++){<br /> if(a[i]&gt;a[j]){<br /> temp=a[i];<br /> a[i]=a[j];<br /> a[j]=temp;<br /> }<br /> }<br /> }</p>\n" +
            "<p>printf(\"After sorting is: \");<br /> for(i=0;i&lt;s;i++)<br /> printf(\" %d\",a[i]);</p>\n" +
            "<p>return 0;<br />}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:--</strong></p>\n" +
            "<p><strong>Enter total elements: 5<br />Enter 5 elements: 01<br />50<br />41<br />100<br />31<br />After sorting is: 1 31 41 50 100<br />--------------------------------<br /><br /></strong></p>";

    public static final String program16 = "<p>#include &lt;stdio.h&gt;<br /> <br />int main()<br />{<br /> int array[100], n, c, d, swap;<br /> <br /> printf(\"Enter number of elements\\n\");<br /> scanf(\"%d\", &amp;n);<br /> <br /> printf(\"Enter %d integers\\n\", n);<br /> <br /> for (c = 0; c &lt; n; c++)<br /> scanf(\"%d\", &amp;array[c]);<br /> <br /> for (c = 0 ; c &lt; ( n - 1 ); c++)<br /> {<br /> for (d = 0 ; d &lt; n - c - 1; d++)<br /> {<br /> if (array[d] &gt; array[d+1]) /* For decreasing order use &lt; */<br /> {<br /> swap = array[d];<br /> array[d] = array[d+1];<br /> array[d+1] = swap;<br /> }<br /> }<br /> }<br /> <br /> printf(\"Sorted list in ascending order:\\n\");<br /> <br /> for ( c = 0 ; c &lt; n ; c++ )<br /> printf(\"%d\\n\", array[c]);<br /> <br /> return 0;<br />}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:-</strong></p>\n" +
            "<p>Enter number of elements<br />5<br />Enter 5 integers<br />12<br />50<br />01<br />31<br />28<br />Sorted list in ascending order:<br />1<br />12<br />28<br />31<br />50</p>\n" +
            "<p>--------------------------------<br /><br /></p>";

    public static final String program17 = "<p><strong><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">/* insertion sort */</span></strong></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp;</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">#include &lt;stdio.h&gt;</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp;</span><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">int main()</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">{</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp; int n, array[1000], c, d, t;</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp;&nbsp;</span><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">printf(\"Enter number of elements\\n\");</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp; scanf(\"%d\", &amp;n);</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp; printf(\"Enter %d integers\\n\", n);</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp;</span><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp;for (c = 0; c &lt; n; c++) {</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp; &nbsp; scanf(\"%d\", &amp;array[c]);</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp; }</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp;</span><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp; for (c = 1 ; c &lt;= n - 1; c++) {</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp;&nbsp;&nbsp; d = c;</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp;</span><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp;while ( d &gt; 0 &amp;&amp; array[d] &lt; array[d-1]) {</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; t = array[d];</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; array[d] = array[d-1];</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; array[d-1] = t;</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp;</span><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp; &nbsp; &nbsp;d--;</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp; &nbsp; }</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp; }</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp;</span><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">printf(\"Sorted list in ascending order:\\n\");</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp;</span><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp; for (c = 0; c &lt;= n - 1; c++) {</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp;&nbsp;&nbsp; printf(\"%d\\n\", array[c]);</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp; }</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp;</span><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">&nbsp; return 0;</span></p>\n" +
            "<p><span style=\"font-size: 10.0pt; font-family: 'Courier New';\">}</span></p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><span style=\"font-size: 13.3333px;\"><strong><span style=\"font-family: 'Courier New';\">OUTPUT:--</span></strong></span></p>\n" +
            "<p>Enter number of elements<br />5<br />Enter 5 integers<br />28<br />31<br />01<br />50<br />11<br />Sorted list in ascending order:<br />1<br />11<br />28<br />31<br />50</p>\n" +
            "<p>--------------------------------<br />Process exited after 31.97 seconds with return value 0<br />Press any key to continue . . .</p>";

    public static final String program18 = "<p><strong>/* Heap Sort */</strong></p>\n" +
            "<p><br />#include &lt;stdio.h&gt;<br />void main()<br />{<br /> int heap[10], no, i, j, c, root, temp;<br /> printf(\"\\n Enter no of elements :\");<br /> scanf(\"%d\", &amp;no);<br /> printf(\"\\n Enter the nos : \");<br /> for (i = 0; i &lt; no; i++)<br /> scanf(\"%d\", &amp;heap[i]);<br /> for (i = 1; i &lt; no; i++)<br /> {<br /> c = i;<br /> do<br /> {<br /> root = (c - 1) / 2; <br /> if (heap[root] &lt; heap[c]) <br /> {<br /> temp = heap[root];<br /> heap[root] = heap[c];<br /> heap[c] = temp;<br /> }<br /> c = root;<br /> } while (c != 0);<br /> }<br /> printf(\"Heap array : \");<br /> for (i = 0; i &lt; no; i++)<br /> printf(\"%d\\t \", heap[i]);<br /> for (j = no - 1; j &gt;= 0; j--)<br /> {<br /> temp = heap[0];<br /> heap[0] = heap[j]; /* swap max element with rightmost leaf element */<br /> heap[j] = temp;<br /> root = 0;<br /> do <br /> {<br /> c = 2 * root + 1; /* left node of root element */<br /> if ((heap[c] &lt; heap[c + 1]) &amp;&amp; c &lt; j-1)<br /> c++;<br /> if (heap[root]&lt;heap[c] &amp;&amp; c&lt;j){<br /> temp = heap[root];<br /> heap[root] = heap[c];<br /> heap[c] = temp;<br /> }<br /> root = c;<br /> } while (c &lt; j);<br /> } <br /> printf(\"\\n The sorted array is : \");<br /> for (i = 0; i &lt; no; i++)<br /> printf(\"\\t %d\", heap[i]);<br /> printf(\"\\n Complexity : \\n Best case = Avg case = Worst case = O(n logn) \\n\");<br />}</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:--</strong></p>\n" +
            "<p><br /><strong> Enter no of elements :5</strong></p>\n" +
            "<p><strong>Enter the nos : 20</strong><br /><strong>31</strong><br /><strong>28</strong><br /><strong>45</strong><br /><strong>12</strong><br /><strong>Heap array : 45 31 28 20 12</strong><br /><strong> The sorted array is : 12 20 28 31 45</strong><br /><strong> Complexity :</strong><br /><strong> Best case = Avg case = Worst case = O(n logn)</strong></p>\n" +
            "<p><strong>--------------------------------</strong><br /><br /></p>";

    public static final String program19 = "<p><strong>/* Quick Sort */</strong></p>\n" +
            "<p>#include&lt;stdio.h&gt;<br />void swap (int a[], int left, int right)<br />{<br /> int temp;<br /> temp=a[left];<br /> a[left]=a[right];<br /> a[right]=temp; <br />}//end swap</p>\n" +
            "<p>void quicksort( int a[], int low, int high )<br />{<br /> int pivot;<br /> // Termination condition! <br /> if ( high &gt; low )<br /> {<br /> pivot = partition( a, low, high );<br /> quicksort( a, low, pivot-1 );<br /> quicksort( a, pivot+1, high );<br /> }<br />} //end quicksort</p>\n" +
            "<p>int partition( int a[], int low, int high )<br />{<br /> int left, right;<br /> int pivot_item;<br /> int pivot = left = low; <br /> pivot_item = a[low]; <br /> right = high;<br /> while ( left &lt; right ) <br /> {<br /> // Move left while item &lt; pivot <br /> while( a[left] &lt;= pivot_item ) <br /> left++;<br /> // Move right while item &gt; pivot <br /> while( a[right] &gt; pivot_item ) <br /> right--;<br /> if ( left &lt; right ) <br /> swap(a,left,right);<br /> }<br /> // right is final position for the pivot <br /> a[low] = a[right];<br /> a[right] = pivot_item;<br /> return right;<br />}//end partition</p>\n" +
            "<p>// void quicksort(int a[], int, int);<br />void printarray(int a[], int);</p>\n" +
            "<p>int main()<br />{<br /> int a[50], i, n;<br /> printf(\"\\nEnter no. of elements: \"); <br /> scanf(\"%d\", &amp;n);<br /> printf(\"\\nEnter the elements: \\n\");<br /> for (i=0; i&lt;n; i++)<br /> scanf (\"%d\", &amp;a[i]);<br /> printf(\"\\nUnsorted elements: \\n\");<br /> printarray(a,n);<br /> quicksort(a,0,n-1);<br /> printf(\"\\nSorted elements: \\n\");<br /> printarray(a,n);</p>\n" +
            "<p>}//end main</p>\n" +
            "<p><br />void printarray(int a[], int n)<br />{<br /> int i;<br /> for (i=0; i&lt;n; i++)<br /> printf(\" %d \", a[i]);<br /> printf(\"\\n\");<br />}//end printarray</p>\n" +
            "<p>&nbsp;</p>\n" +
            "<p><strong>OUTPUT:--</strong></p>\n" +
            "<p><br /><strong>Enter no. of elements: 5</strong></p>\n" +
            "<p><strong>Enter the elements:</strong><br /><strong>48</strong><br /><strong>98</strong><br /><strong>31</strong><br /><strong>28</strong><br /><strong>15</strong></p>\n" +
            "<p><strong>Unsorted elements:</strong><br /><strong> 48 98 31 28 15</strong></p>\n" +
            "<p><strong>Sorted elements:</strong><br /><strong> 15 28 31 48 98</strong></p>\n" +
            "<p><strong>--------------------------------</strong><br /><br /></p>";

    public static final String program20 = "<pre class=\"prettyprint notranslate tryit prettyprinted\"><span class=\"com\">#include</span> <span class=\"str\">&lt;stdio.h&gt;</span>\n" +
            "<span class=\"com\">#define</span><span class=\"pln\"> max </span><span class=\"lit\">10</span>\n" +
            "\n" +
            "<span class=\"kwd\">int</span><span class=\"pln\"> a</span><span class=\"pun\">[</span><span class=\"lit\">11</span><span class=\"pun\">]</span> <span class=\"pun\">=</span> <span class=\"pun\">{</span> <span class=\"lit\">10</span><span class=\"pun\">,</span> <span class=\"lit\">14</span><span class=\"pun\">,</span> <span class=\"lit\">19</span><span class=\"pun\">,</span> <span class=\"lit\">26</span><span class=\"pun\">,</span> <span class=\"lit\">27</span><span class=\"pun\">,</span> <span class=\"lit\">31</span><span class=\"pun\">,</span> <span class=\"lit\">33</span><span class=\"pun\">,</span> <span class=\"lit\">35</span><span class=\"pun\">,</span> <span class=\"lit\">42</span><span class=\"pun\">,</span> <span class=\"lit\">44</span><span class=\"pun\">,</span> <span class=\"lit\">0</span> <span class=\"pun\">};</span>\n" +
            "<span class=\"kwd\">int</span><span class=\"pln\"> b</span><span class=\"pun\">[</span><span class=\"lit\">10</span><span class=\"pun\">];</span>\n" +
            "\n" +
            "<span class=\"kwd\">void</span><span class=\"pln\"> merging</span><span class=\"pun\">(</span><span class=\"kwd\">int</span><span class=\"pln\"> low</span><span class=\"pun\">,</span> <span class=\"kwd\">int</span><span class=\"pln\"> mid</span><span class=\"pun\">,</span> <span class=\"kwd\">int</span><span class=\"pln\"> high</span><span class=\"pun\">)</span> <span class=\"pun\">{</span>\n" +
            "   <span class=\"kwd\">int</span><span class=\"pln\"> l1</span><span class=\"pun\">,</span><span class=\"pln\"> l2</span><span class=\"pun\">,</span><span class=\"pln\"> i</span><span class=\"pun\">;</span>\n" +
            "\n" +
            "   <span class=\"kwd\">for</span><span class=\"pun\">(</span><span class=\"pln\">l1 </span><span class=\"pun\">=</span><span class=\"pln\"> low</span><span class=\"pun\">,</span><span class=\"pln\"> l2 </span><span class=\"pun\">=</span><span class=\"pln\"> mid </span><span class=\"pun\">+</span> <span class=\"lit\">1</span><span class=\"pun\">,</span><span class=\"pln\"> i </span><span class=\"pun\">=</span><span class=\"pln\"> low</span><span class=\"pun\">;</span><span class=\"pln\"> l1 </span><span class=\"pun\">&lt;=</span><span class=\"pln\"> mid </span><span class=\"pun\">&amp;&amp;</span><span class=\"pln\"> l2 </span><span class=\"pun\">&lt;=</span><span class=\"pln\"> high</span><span class=\"pun\">;</span><span class=\"pln\"> i</span><span class=\"pun\">++)</span> <span class=\"pun\">{</span>\n" +
            "      <span class=\"kwd\">if</span><span class=\"pun\">(</span><span class=\"pln\">a</span><span class=\"pun\">[</span><span class=\"pln\">l1</span><span class=\"pun\">]</span> <span class=\"pun\">&lt;=</span><span class=\"pln\"> a</span><span class=\"pun\">[</span><span class=\"pln\">l2</span><span class=\"pun\">])</span><span class=\"pln\">\n" +
            "         b</span><span class=\"pun\">[</span><span class=\"pln\">i</span><span class=\"pun\">]</span> <span class=\"pun\">=</span><span class=\"pln\"> a</span><span class=\"pun\">[</span><span class=\"pln\">l1</span><span class=\"pun\">++];</span>\n" +
            "      <span class=\"kwd\">else</span><span class=\"pln\">\n" +
            "         b</span><span class=\"pun\">[</span><span class=\"pln\">i</span><span class=\"pun\">]</span> <span class=\"pun\">=</span><span class=\"pln\"> a</span><span class=\"pun\">[</span><span class=\"pln\">l2</span><span class=\"pun\">++];</span>\n" +
            "   <span class=\"pun\">}</span>\n" +
            "   \n" +
            "   <span class=\"kwd\">while</span><span class=\"pun\">(</span><span class=\"pln\">l1 </span><span class=\"pun\">&lt;=</span><span class=\"pln\"> mid</span><span class=\"pun\">)</span><span class=\"pln\">    \n" +
            "      b</span><span class=\"pun\">[</span><span class=\"pln\">i</span><span class=\"pun\">++]</span> <span class=\"pun\">=</span><span class=\"pln\"> a</span><span class=\"pun\">[</span><span class=\"pln\">l1</span><span class=\"pun\">++];</span>\n" +
            "\n" +
            "   <span class=\"kwd\">while</span><span class=\"pun\">(</span><span class=\"pln\">l2 </span><span class=\"pun\">&lt;=</span><span class=\"pln\"> high</span><span class=\"pun\">)</span><span class=\"pln\">   \n" +
            "      b</span><span class=\"pun\">[</span><span class=\"pln\">i</span><span class=\"pun\">++]</span> <span class=\"pun\">=</span><span class=\"pln\"> a</span><span class=\"pun\">[</span><span class=\"pln\">l2</span><span class=\"pun\">++];</span>\n" +
            "\n" +
            "   <span class=\"kwd\">for</span><span class=\"pun\">(</span><span class=\"pln\">i </span><span class=\"pun\">=</span><span class=\"pln\"> low</span><span class=\"pun\">;</span><span class=\"pln\"> i </span><span class=\"pun\">&lt;=</span><span class=\"pln\"> high</span><span class=\"pun\">;</span><span class=\"pln\"> i</span><span class=\"pun\">++)</span><span class=\"pln\">\n" +
            "      a</span><span class=\"pun\">[</span><span class=\"pln\">i</span><span class=\"pun\">]</span> <span class=\"pun\">=</span><span class=\"pln\"> b</span><span class=\"pun\">[</span><span class=\"pln\">i</span><span class=\"pun\">];</span>\n" +
            "<span class=\"pun\">}</span>\n" +
            "\n" +
            "<span class=\"kwd\">void</span><span class=\"pln\"> sort</span><span class=\"pun\">(</span><span class=\"kwd\">int</span><span class=\"pln\"> low</span><span class=\"pun\">,</span> <span class=\"kwd\">int</span><span class=\"pln\"> high</span><span class=\"pun\">)</span> <span class=\"pun\">{</span>\n" +
            "   <span class=\"kwd\">int</span><span class=\"pln\"> mid</span><span class=\"pun\">;</span>\n" +
            "   \n" +
            "   <span class=\"kwd\">if</span><span class=\"pun\">(</span><span class=\"pln\">low </span><span class=\"pun\">&lt;</span><span class=\"pln\"> high</span><span class=\"pun\">)</span> <span class=\"pun\">{</span><span class=\"pln\">\n" +
            "      mid </span><span class=\"pun\">=</span> <span class=\"pun\">(</span><span class=\"pln\">low </span><span class=\"pun\">+</span><span class=\"pln\"> high</span><span class=\"pun\">)</span> <span class=\"pun\">/</span> <span class=\"lit\">2</span><span class=\"pun\">;</span><span class=\"pln\">\n" +
            "      sort</span><span class=\"pun\">(</span><span class=\"pln\">low</span><span class=\"pun\">,</span><span class=\"pln\"> mid</span><span class=\"pun\">);</span><span class=\"pln\">\n" +
            "      sort</span><span class=\"pun\">(</span><span class=\"pln\">mid</span><span class=\"pun\">+</span><span class=\"lit\">1</span><span class=\"pun\">,</span><span class=\"pln\"> high</span><span class=\"pun\">);</span><span class=\"pln\">\n" +
            "      merging</span><span class=\"pun\">(</span><span class=\"pln\">low</span><span class=\"pun\">,</span><span class=\"pln\"> mid</span><span class=\"pun\">,</span><span class=\"pln\"> high</span><span class=\"pun\">);</span>\n" +
            "   <span class=\"pun\">}</span> <span class=\"kwd\">else</span> <span class=\"pun\">{</span> \n" +
            "      <span class=\"kwd\">return</span><span class=\"pun\">;</span>\n" +
            "   <span class=\"pun\">}</span>   \n" +
            "<span class=\"pun\">}</span>\n" +
            "\n" +
            "<span class=\"kwd\">int</span><span class=\"pln\"> main</span><span class=\"pun\">()</span> <span class=\"pun\">{</span> \n" +
            "   <span class=\"kwd\">int</span><span class=\"pln\"> i</span><span class=\"pun\">;</span><span class=\"pln\">\n" +
            "\n" +
            "   printf</span><span class=\"pun\">(</span><span class=\"str\">\"List before sorting\\n\"</span><span class=\"pun\">);</span>\n" +
            "   \n" +
            "   <span class=\"kwd\">for</span><span class=\"pun\">(</span><span class=\"pln\">i </span><span class=\"pun\">=</span> <span class=\"lit\">0</span><span class=\"pun\">;</span><span class=\"pln\"> i </span><span class=\"pun\">&lt;=</span><span class=\"pln\"> max</span><span class=\"pun\">;</span><span class=\"pln\"> i</span><span class=\"pun\">++)</span><span class=\"pln\">\n" +
            "      printf</span><span class=\"pun\">(</span><span class=\"str\">\"%d \"</span><span class=\"pun\">,</span><span class=\"pln\"> a</span><span class=\"pun\">[</span><span class=\"pln\">i</span><span class=\"pun\">]);</span><span class=\"pln\">\n" +
            "\n" +
            "   sort</span><span class=\"pun\">(</span><span class=\"lit\">0</span><span class=\"pun\">,</span><span class=\"pln\"> max</span><span class=\"pun\">);</span><span class=\"pln\">\n" +
            "\n" +
            "   printf</span><span class=\"pun\">(</span><span class=\"str\">\"\\nList after sorting\\n\"</span><span class=\"pun\">);</span>\n" +
            "   \n" +
            "   <span class=\"kwd\">for</span><span class=\"pun\">(</span><span class=\"pln\">i </span><span class=\"pun\">=</span> <span class=\"lit\">0</span><span class=\"pun\">;</span><span class=\"pln\"> i </span><span class=\"pun\">&lt;=</span><span class=\"pln\"> max</span><span class=\"pun\">;</span><span class=\"pln\"> i</span><span class=\"pun\">++)</span><span class=\"pln\">\n" +
            "      printf</span><span class=\"pun\">(</span><span class=\"str\">\"%d \"</span><span class=\"pun\">,</span><span class=\"pln\"> a</span><span class=\"pun\">[</span><span class=\"pln\">i</span><span class=\"pun\">]);</span>\n" +
            "<span class=\"pun\">}<br /><br /><br /></span></pre>\n" +
            "<h2>Output</h2>\n" +
            "<pre class=\"result notranslate\">List before sorting\n" +
            "10 14 19 26 27 31 33 35 42 44 0\n" +
            "List after sorting\n" +
            "0 10 14 19 26 27 31 33 35 42 44</pre>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\">&nbsp;</pre>";

    public static final String program21="<pre class=\"prettyprint notranslate tryit prettyprinted\">#include &lt;stdio.h&gt;<br />void towers(int, char, char, char);<br />int main()<br />{<br /> int num;<br /> printf(\"Enter the number of disks : \");<br /> scanf(\"%d\", &amp;num);<br /> printf(\"The sequence of moves involved in the Tower of Hanoi are :\\n\");<br /> towers(num, 'A', 'C', 'B');<br /> return 0;<br />}<br />void towers(int num, char frompeg, char topeg, char auxpeg)<br />{<br /> if (num == 1)<br /> {<br /> printf(\"\\n Move disk 1 from peg %c to peg %c\", frompeg, topeg);<br /> return;<br /> }<br /> towers(num - 1, frompeg, auxpeg, topeg);<br /> printf(\"\\n Move disk %d from peg %c to peg %c\", num, frompeg, topeg);<br /> towers(num - 1, auxpeg, topeg, frompeg);<br />}<br /><br /><br /><strong>OUTPUT:--</strong><br /><br /></pre>\n"+
            "<p><strong>Enter the number of disks : 3</strong><br /><strong>The sequence of moves involved in the Tower of Hanoi are :</strong></p>\n"+
            "<p><strong>Move disk 1 from peg A to peg C</strong><br /><strong> Move disk 2 from peg A to peg B</strong><br /><strong> Move disk 1 from peg C to peg B</strong><br /><strong> Move disk 3 from peg A to peg C</strong><br /><strong> Move disk 1 from peg B to peg A</strong><br /><strong> Move disk 2 from peg B to peg C</strong><br /><strong> Move disk 1 from peg A to peg C</strong><br /><strong>--------------------------------</strong><br /><br /></p>";

    public static final String program22="<div>#include &lt;stdio.h&gt;<br />&nbsp; #include &lt;stdlib.h&gt;<br /><br />&nbsp; struct AVLTree_Node {<br />&nbsp; &nbsp; &nbsp; &nbsp; int data, bfactor;<br />&nbsp; &nbsp; &nbsp; &nbsp; struct AVLTree_Node *link[2];<br />&nbsp; };<br /><br />&nbsp; struct AVLTree_Node *root = NULL;<br /><br />&nbsp; struct AVLTree_Node * createNode(int data) {<br />&nbsp; &nbsp; &nbsp; &nbsp; struct AVLTree_Node *newnode;<br />&nbsp; &nbsp; &nbsp; &nbsp; newnode = (struct AVLTree_Node *)malloc(sizeof (struct AVLTree_Node));<br />&nbsp; &nbsp; &nbsp; &nbsp; newnode-&gt;data &nbsp; &nbsp;= data;<br />&nbsp; &nbsp; &nbsp; &nbsp; newnode-&gt;bfactor = 0;<br />&nbsp; &nbsp; &nbsp; &nbsp; newnode-&gt;link[0] = newnode-&gt;link[1] = NULL;<br />&nbsp; &nbsp; &nbsp; &nbsp; return newnode;<br />&nbsp; }<br />\n" +
            "<div>&nbsp;</div>\n" +
            "<br />&nbsp; void insertion (int data) {<br />&nbsp; &nbsp; &nbsp; &nbsp; struct AVLTree_Node *bf, *parent_bf, *subtree, *temp;<br />&nbsp; &nbsp; &nbsp; &nbsp; struct AVLTree_Node *current, *parent, *newnode, *ptr;<br />&nbsp; &nbsp; &nbsp; &nbsp; int res = 0, link_dir[32], i = 0;<br /><br />&nbsp; &nbsp; &nbsp; &nbsp; if (!root) {<br />&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; root = createNode(data);<br />&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; return;<br />&nbsp; &nbsp; &nbsp; &nbsp; }<br /><br />&nbsp; &nbsp; &nbsp; &nbsp; bf = parent_bf = root;<br />&nbsp; &nbsp; &nbsp; &nbsp; /* find the location for inserting the new node*/<br />&nbsp; &nbsp; &nbsp; &nbsp; for (current = root; current != NULL; ptr = current, current = current-&gt;link[res]) {<br />&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (data == current-&gt;data) {<br />&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; printf(\"Cannot insert duplicates!!\\n\");<br />&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; return;<br />&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }<br />&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; res = (data &gt; current-&gt;data) ? 1 : 0;<br />&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; parent = current;<br /><br />&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (current-&gt;bfactor != 0) {<br />&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; bf = current;<br />&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; parent_bf = ptr;<br />&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; i = 0;<br />&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }<br />&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; link_dir[i++] = res;<br />&nbsp; &nbsp; &nbsp; &nbsp; }<br />&nbsp; &nbsp; &nbsp; &nbsp; /* create the new node */<br />&nbsp; &nbsp; &nbsp; &nbsp; newnode = createNode(data);<br />&nbsp; &nbsp; &nbsp; &nbsp; parent-&gt;link[res] = newnode;<br />&nbsp; &nbsp; &nbsp; &nbsp; res = link_dir[i = 0];<br />\n" +
            "<div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; /* updating the height balance after insertion */</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; for (current = bf; current != newnode; res = link_dir[++i]) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (res == 0)</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; current-&gt;bfactor--;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; else</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; current-&gt;bfactor++;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; current = current-&gt;link[res];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; /* right sub-tree */</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; if (bf-&gt;bfactor == 2) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; printf(\"bfactor = 2\\n\");</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; temp = bf-&gt;link[1];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (temp-&gt;bfactor == 1) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; /*&nbsp;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* single rotation(SR) left</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* &nbsp; &nbsp; &nbsp; &nbsp; x &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;y</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\\ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; / &nbsp; \\</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; y &nbsp; &nbsp;=&gt; &nbsp; x &nbsp; &nbsp; z</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\\</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; z</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;*/</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; subtree = temp;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; bf-&gt;link[1] = temp-&gt;link[0];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; temp-&gt;link[0] = bf;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; temp-&gt;bfactor = bf-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; /*</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* double rotation (SR right + SR left)</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* &nbsp; &nbsp; &nbsp; x &nbsp; &nbsp; &nbsp; &nbsp;x &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; z</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* &nbsp; &nbsp; &nbsp; &nbsp;\\ &nbsp; &nbsp; &nbsp; &nbsp;\\ &nbsp; &nbsp; &nbsp; &nbsp;/ &nbsp; \\</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* &nbsp; &nbsp; &nbsp; &nbsp; y &nbsp; =&gt; &nbsp; z &nbsp;=&gt; &nbsp;x &nbsp; &nbsp; y</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* &nbsp; &nbsp; &nbsp; &nbsp;/ &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\\ &nbsp; &nbsp; &nbsp; ///</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* &nbsp; &nbsp; &nbsp; z &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;y</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;*/</div>\n" +
            "<div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; subtree = temp-&gt;link[0];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; temp-&gt;link[0] = subtree-&gt;link[1];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; subtree-&gt;link[1] = temp;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; bf-&gt;link[1] = subtree-&gt;link[0];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; subtree-&gt;link[0] = bf;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; /* update balance factors */</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (subtree-&gt;bfactor == -1) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; bf-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; temp-&gt;bfactor = 1;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else if (subtree-&gt;bfactor == 0) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; bf-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; temp-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else if (subtree-&gt;bfactor == 1) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; bf-&gt;bfactor = -1;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; temp-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; subtree-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; /* left sub-tree */</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; } else if (bf-&gt;bfactor == -2) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; temp = bf-&gt;link[0];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (temp-&gt;bfactor == -1) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; /*</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* single rotation(SR) right</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;x &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;y</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* &nbsp; &nbsp; &nbsp; &nbsp; / &nbsp; &nbsp; &nbsp; &nbsp; / &nbsp; \\</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* &nbsp; &nbsp; &nbsp; &nbsp;y &nbsp; &nbsp; =&gt; &nbsp;z &nbsp; &nbsp; x</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* &nbsp; &nbsp; &nbsp; /</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* &nbsp; &nbsp; &nbsp;z</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;*/</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; subtree = temp;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; bf-&gt;link[0] = temp-&gt;link[1];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; temp-&gt;link[1] = bf;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; temp-&gt;bfactor = bf-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else {</div>\n" +
            "<div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; /*</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* double rotation - (SR left + SR right)</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* &nbsp; &nbsp; &nbsp; &nbsp; x &nbsp; &nbsp; &nbsp; &nbsp; x &nbsp; &nbsp; &nbsp; &nbsp; z</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* &nbsp; &nbsp; &nbsp; &nbsp;/ &nbsp; &nbsp; &nbsp; &nbsp; / &nbsp; &nbsp; &nbsp; &nbsp;/ &nbsp; \\</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* &nbsp; &nbsp; &nbsp; y &nbsp; &nbsp;=&gt; &nbsp; z &nbsp; &nbsp;=&gt; &nbsp;y &nbsp; &nbsp; x</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* &nbsp; &nbsp; &nbsp; &nbsp;\\ &nbsp; &nbsp; &nbsp; /</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;* &nbsp; &nbsp; &nbsp; &nbsp; z &nbsp; &nbsp; y</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;*/</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; subtree = temp-&gt;link[1];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; temp-&gt;link[1] = subtree-&gt;link[0];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; subtree-&gt;link[0] = temp;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; bf-&gt;link[0] = subtree-&gt;link[1];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; subtree-&gt;link[1] = bf;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; /* update balance factors */</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (subtree-&gt;bfactor == -1) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; bf-&gt;bfactor = 1;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; temp-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else if (subtree-&gt;bfactor == 0) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; bf-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; temp-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else if (subtree-&gt;bfactor == 1) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; bf-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; temp-&gt;bfactor = -1;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; subtree-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; } else {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; return;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; if (bf == root) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; root = subtree;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; return;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; if (bf != parent_bf-&gt;link[0]) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; parent_bf-&gt;link[1] = subtree;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; } else {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; parent_bf-&gt;link[0] = subtree;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; return;</div>\n" +
            "<div>&nbsp; }</div>\n" +
            "<div>&nbsp;</div>\n" +
            "<div>&nbsp; void deletion(int data) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; int link_dir[32], res = 0, i = 0, j = 0, index = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; struct AVLTree_Node *ptr[32], *current, *temp, *x, *y, *z;</div>\n" +
            "<div>&nbsp;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; current = root;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; if (!root) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; printf(\"Tree not present\\n\");</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; return;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; if ((root-&gt;data == data) &amp;&amp; (root-&gt;link[0] == NULL)</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&amp;&amp; (root-&gt;link[1] == NULL)) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; free(root);</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; root = NULL;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; return;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; /* search the node to delete */</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; while (current != NULL) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (current-&gt;data == data)</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; break;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; res = data &gt; current-&gt;data ? 1 : 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; link_dir[i] = res;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ptr[i++] = current;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; current = current-&gt;link[res];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; if (!current) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; printf(\"Given data is not present!!\\n\");</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; return;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; index = link_dir[i - 1];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; temp = current-&gt;link[1];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; /* delete the node from the AVL tree - similar to BST deletion */</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; if (current-&gt;link[1] == NULL) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (i == 0) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; temp = current-&gt;link[0];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; free(current);</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; root = temp;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; return;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ptr[i - 1]-&gt;link[index] = current-&gt;link[0];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; } else if (temp-&gt;link[0] == NULL) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; temp-&gt;link[0] = current-&gt;link[0];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; temp-&gt;bfactor = current-&gt;bfactor;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (i &gt; 0) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ptr[i-1]-&gt;link[index] = temp;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; root = temp;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; link_dir[i] = 1;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ptr[i++] = temp;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; } else {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; /* delete node with two children */</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; j = i++;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; while (1) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; link_dir[i] = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ptr[i++] = temp;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; x = temp-&gt;link[0];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (x-&gt;link[0] == NULL)</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; break;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; temp = x;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; x-&gt;link[0] = current-&gt;link[0];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; temp-&gt;link[0] = x-&gt;link[1];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; x-&gt;link[1] = current-&gt;link[1];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; x-&gt;bfactor = current-&gt;bfactor;</div>\n" +
            "<div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (j &gt; 0) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ptr[j - 1]-&gt;link[index] = x;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; root = x;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; link_dir[j] = 1;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ptr[j] = x;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; free(current);</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; for (i = i - 1; i &gt;= 0; i = i--) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; x = ptr[i];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (link_dir[i] == 0) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; x-&gt;bfactor++;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (x-&gt;bfactor == 1) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; break;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else if (x-&gt;bfactor == 2) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; y = x-&gt;link[1];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (y-&gt;bfactor == -1) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; /* double rotation - (SR right + SR left) */</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; z = y-&gt;link[0];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; y-&gt;link[0] = z-&gt;link[1];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; z-&gt;link[1] = y;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; x-&gt;link[1] = z-&gt;link[0];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; z-&gt;link[0] = x;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; /* update balance factors */</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (z-&gt;bfactor == -1) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; x-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; y-&gt;bfactor = 1;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else if (z-&gt;bfactor == 0) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; x-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; y-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else if (z-&gt;bfactor == 1) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; x-&gt;bfactor = -1;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; y-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; z-&gt;bfactor = 0;</div>\n" +
            "<div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (i &gt; 0) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; index = link_dir[i - 1];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ptr[i - 1]-&gt;link[index] = z;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; root = z;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; /* single rotation left */</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; x-&gt;link[1] = y-&gt;link[0];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; y-&gt;link[0] = x;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (i &gt; 0) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; index = link_dir[i - 1];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ptr[i - 1]-&gt;link[index] = y;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else &nbsp;{</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; root = y;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; /* update balance factors */</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (y-&gt;bfactor == 0) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; x-&gt;bfactor = 1;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; y-&gt;bfactor = -1;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; break;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; x-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; y-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; x-&gt;bfactor--;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (x-&gt;bfactor == -1) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; break;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else if (x-&gt;bfactor == -2) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; y = x-&gt;link[0];</div>\n" +
            "<div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if &nbsp;(y-&gt;bfactor == 1) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; /* double rotation - (SR right + SR left) */</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; z = y-&gt;link[1];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; y-&gt;link[1] = z-&gt;link[0];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; z-&gt;link[0] = y;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; x-&gt;link[0] = z-&gt;link[1];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; z-&gt;link[1] = x;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; /* update balance factors */</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (z-&gt;bfactor == -1) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; x-&gt;bfactor = 1;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; y-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else if (z-&gt;bfactor == 0) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; x-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; y-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else if (z-&gt;bfactor == 1) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; x-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; y-&gt;bfactor = -1;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; z-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (i &gt; 0) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; index = link_dir[i - 1];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ptr[i - 1]-&gt;link[index] = z;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; root = z;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; /* single rotation right */</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; x-&gt;link[0] = y-&gt;link[1];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; y-&gt;link[1] = x;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (i &lt;= 0) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; root = y;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; index = link_dir[i - 1];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ptr[i - 1]-&gt;link[index] = y;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; /* update balance factors */</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (y-&gt;bfactor == 0) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; x-&gt;bfactor = -1;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; y-&gt;bfactor = 1;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; break;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; } else {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; x-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; y-&gt;bfactor = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; }</div>\n" +
            "<div>&nbsp;</div>\n" +
            "<div>&nbsp; void searchElement(int data) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; int flag = 0, res = 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; struct AVLTree_Node *node = root;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; if (!node) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; printf(\"AVL tree unavailable!!\\n\");</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; return;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; while (node != NULL) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if (data == node-&gt;data) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; printf(\"%d is present in AVL Tree\\n\", data);</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; flag = 1;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; break;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; res = data &gt; node-&gt;data ? 1 : 0;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; node = node-&gt;link[res];</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; if (!flag)</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; printf(\"Search Element not found in AVL tree\\n\");</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; return;</div>\n" +
            "<div>&nbsp; }</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div><br />\n" +
            "<div>&nbsp;</div>\n" +
            "<br />\n" +
            "<div>&nbsp; void inorderTraversal(struct AVLTree_Node *myNode) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; if (myNode) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; inorderTraversal(myNode-&gt;link[0]);</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; printf(\"%d &nbsp;\", myNode-&gt;data);</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; inorderTraversal(myNode-&gt;link[1]);</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; return;</div>\n" +
            "<div>&nbsp; }</div>\n" +
            "<div>&nbsp;</div>\n" +
            "<div>&nbsp; int main() {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; int key, ch;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; while (1) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; printf(\"1. Insertion\\t2. Deletion\\n\");</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; printf(\"3. Searching\\t4. Traversal\\n\");</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; printf(\"5. Exit\\nEnter your choice:\");</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; scanf(\"%d\", &amp;ch);</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; switch (ch) {</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; case 1:</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; printf(\"Enter the key value:\");</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; scanf(\"%d\", &amp;key);</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; insertion(key);</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; break;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; case 2:</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; printf(\"Enter the key value to delete:\");</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; scanf(\"%d\", &amp;key);</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; deletion(key);</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; break;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; case 3:</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; printf(\"Enter the search key:\");</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; scanf(\"%d\", &amp;key);</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; searchElement(key);</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; break;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; case 4:</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; inorderTraversal(root);</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; printf(\"\\n\");</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; break;</div>\n" +
            "<div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; case 5:</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; exit(0);</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; default:</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; printf(\"Wrong Option!!\\n\");</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; break;</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; printf(\"\\n\");</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; return 0;</div>\n" +
            "<div>&nbsp; }</div>\n" +
            "<div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<pre class=\"prettyprint notranslate tryit prettyprinted\"><br /><br /></pre>\n" +
            "<div><strong>&nbsp; Output(AVL Tree - insertion, deletion, traversal &amp; search - C Program):</strong></div>\n" +
            "<div>&nbsp;&nbsp;<br />&nbsp; 1. Insertion 2. Deletion<br />&nbsp; 3. Searching 4. Traversal<br />&nbsp; 5. Exit<br />&nbsp; Enter your choice:1<br />&nbsp; Enter the key value:30<br /><br />&nbsp; 1. Insertion 2. Deletion<br />&nbsp; 3. Searching 4. Traversal<br />&nbsp; 5. Exit<br />&nbsp; Enter your choice:1<br />&nbsp; Enter the key value:15<br />&nbsp;&nbsp;<br />&nbsp; 1. Insertion 2. Deletion<br />&nbsp; 3. Searching 4. Traversal<br />&nbsp; 5. Exit<br />&nbsp; Enter your choice:1<br />&nbsp; Enter the key value:40<br /><br />&nbsp; 1. Insertion 2. Deletion<br />&nbsp; 3. Searching 4. Traversal<br />&nbsp; 5. Exit<br />&nbsp; Enter your choice:1<br />&nbsp; Enter the key value:10<br /><br />&nbsp; 1. Insertion 2. Deletion<br />&nbsp; 3. Searching 4. Traversal<br />&nbsp; 5. Exit<br />&nbsp; Enter your choice:1<br />&nbsp; Enter the key value:25<br /><br />&nbsp; 1. Insertion 2. Deletion<br />&nbsp; 3. Searching 4. Traversal<br />&nbsp; 5. Exit<br />&nbsp; Enter your choice:1<br />&nbsp; Enter the key value:50<br />&nbsp;&nbsp;<br />&nbsp; 1. Insertion 2. Deletion<br />&nbsp; 3. Searching 4. Traversal<br />&nbsp; 5. Exit<br />&nbsp; Enter your choice:4<br />&nbsp; 10 &nbsp;15 &nbsp;25 &nbsp;30 &nbsp;40 &nbsp;50 &nbsp;<br /><br />&nbsp; 1. Insertion 2. Deletion<br />&nbsp; 3. Searching 4. Traversal<br />&nbsp; 5. Exit<br />&nbsp; Enter your choice:3<br />&nbsp; Enter the search key:30<br />&nbsp; 30 is present in AVL Tree<br /><br />&nbsp; 1. Insertion 2. Deletion<br />&nbsp; 3. Searching 4. Traversal<br />&nbsp; 5. Exit<br />&nbsp; Enter your choice:2<br />&nbsp; Enter the key value to delete:40<br /><br />&nbsp; 1. Insertion 2. Deletion<br />&nbsp; 3. Searching 4. Traversal<br />&nbsp; 5. Exit<br />&nbsp; Enter your choice:2&nbsp;<br />&nbsp; Enter the key value to delete:50<br /><br />&nbsp; 1. Insertion 2. Deletion<br />&nbsp; 3. Searching 4. Traversal<br />&nbsp; 5. Exit<br />&nbsp; Enter your choice:2<br />&nbsp; Enter the key value to delete:15<br /><br />&nbsp; 1. Insertion 2. Deletion<br />&nbsp; 3. Searching 4. Traversal<br />&nbsp; 5. Exit<br />&nbsp; Enter your choice:4<br />&nbsp; 10 &nbsp;25 &nbsp;30 &nbsp;<br /><br />&nbsp; 1. Insertion 2. Deletion<br />&nbsp; 3. Searching 4. Traversal<br />&nbsp; 5. Exit<br />&nbsp; Enter your choice:5</div>";


}
