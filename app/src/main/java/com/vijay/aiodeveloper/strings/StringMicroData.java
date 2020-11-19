package com.vijay.aiodeveloper.strings;

/**
 * Created by Nabeel-PC on 29-06-2017.
 */

public class StringMicroData {
    public static final String theory1="<h3 id=\"mcetoc_1bkrii5kr0\" class=\"post-title entry-title\" style=\"text-align: center;\"><span style=\"font-size: 14pt;\">Introduction&nbsp;</span></h3>\n" +
            "<h3 id=\"mcetoc_1bkrii5kr1\" class=\"post-title entry-title\" style=\"text-align: center;\"><span style=\"font-size: 14pt;\">to</span></h3>\n" +
            "<h3 id=\"mcetoc_1bkrii5kr2\" class=\"post-title entry-title\" style=\"text-align: center;\"><span style=\"font-size: 14pt;\">Microprocessor</span></h3>\n" +
            "<p>&nbsp;</p>\n" +
            "<div><span style=\"color: #333300;\"><strong>8085 Microprocessor Definition: When we hear the word microprocessor then what comes to our mind is a small (i.e-micro) IC that can process data i.e- perform airthmetic and logical operations. Microprocessor reads the instructions from memory and excutes it line by line.</strong></span></div>\n" +
            "<div><span style=\"color: #333300;\"><strong>As we know that all of this operation is performedGenerally all of this operation is done by the ALU unit in Microprocessor.</strong></span></div>\n" +
            "<div><span style=\"color: #333300;\"><strong>&nbsp;by the CPU in a large computer.</strong></span></div>\n" +
            "<div><span style=\"color: #333300;\"><strong>So we can compare the CPU and ALU.</strong></span></div>\n" +
            "<div>&nbsp;</div>\n" +
            "<div>&nbsp;</div>\n" +
            "<div>\n" +
            "<h3 id=\"mcetoc_1bkrii5kr3\" class=\"post-title entry-title\">Applications Of Microprocessor in General Life:--</h3>\n" +
            "<h3 id=\"mcetoc_1bkrijbhq4\" class=\"post-title entry-title\"><strong>There are a lot of applications of Microprocessor in general life.Some of the applications are given below:-</strong><br /><strong><br /></strong><span style=\"color: #333300;\"><strong>Mobile Phones</strong></span><br /><span style=\"color: #333300;\"><strong>Digital Watches</strong></span><br /><span style=\"color: #333300;\"><strong>Washing Machine</strong></span><br /><span style=\"color: #333300;\"><strong>Computer</strong></span><br /><span style=\"color: #333300;\"><strong>Lighting Control</strong></span><br /><span style=\"color: #333300;\"><strong>Traffic Control</strong></span><br /><span style=\"color: #333300;\"><strong>LAPTOP</strong></span><br /><span style=\"color: #333300;\"><strong>Modems</strong></span><br /><span style=\"color: #333300;\"><strong>Power Stations</strong></span><br /><span style=\"color: #333300;\"><strong>Television</strong></span><br /><span style=\"color: #333300;\"><strong>CD Player</strong></span><br /><span style=\"color: #333300;\"><strong>Multimeter</strong></span><br /><span style=\"color: #333300;\"><strong>CRO</strong></span><br /><span style=\"color: #333300;\"><strong>Wave generator</strong></span><br /><span style=\"color: #333300;\"><strong>More applications in medical</strong></span></h3>\n" +
            "</div>";

    public static final String microprogram1="<p>Statement: Exchange the contents of memory locations 2000H and 4000H.</p>\n" +
            "\n" +
            "<p>\n" +
            "Program 1: <br />\n" +
            "LDA 2000H : &quot;Get the contents of memory location 2000H into accumulator&quot;<br />\n" +
            "MOV B, A : &quot;Save the contents into B register&quot;<br />\n" +
            "LDA 4000H : &quot;Get the contents of memory location 4000Hinto accumulator&quot;<br />\n" +
            "STA 2000H : &quot;Store the contents of accumulator at address 2000H&quot;<br />\n" +
            "MOV A, B : &quot;Get the saved contents back into A register&quot;<br />\n" +
            "STA 4000H : &quot;Store the contents of accumulator at address 4000H&quot;</p>\n" +
            "\n" +
            "<p></p>\n" +
            "\n" +
            "<p>\n" +
            "Program 2:<br />\n" +
            "LXI H 2000H : &quot;Initialize HL register pair as a pointer to memory location 2000H.&quot;<br />\n" +
            "LXI D 4000H : &quot;Initialize DE register pair as a pointer to memory location 4000H.&quot;<br />\n" +
            "MOV B, M : &quot;Get the contents of memory location 2000H into B register.&quot;<br />\n" +
            "LDAX D : &quot;Get the contents of memory location 4000H into A register.&quot;<br />\n" +
            "MOV M, A : &quot;Store the contents of A register into memory location 2000H.&quot;<br />\n" +
            "MOV A, B : &quot;Copy the contents of B register into accumulator.&quot;<br />\n" +
            "STAX D : &quot;Store the contents of A register into memory location 4000H.&quot;<br />\n" +
            "HLT : &quot;Terminate program execution.&quot;</p>\n" +
            "\n" +
            "<p>\n" +
            "Note: In Program 1, direct addressing instructions are used, whereas in Program 2, indirect addressing instructions are used.</p>";
    public static final String microprogram2="<p>Statement: Add the contents of memory locations 4000H and 4001H and place the result in memory location 4002H.</p>\n" +
            "\n" +
            "<p>\n" +
            "Sample problem <br />\n" +
            "(4000H) = 14H<br />\n" +
            "(4001H) = 89H<br />\n" +
            "Result = 14H + 89H = 9DH</p>\n" +
            "\n" +
            "<p></p>\n" +
            "\n" +
            "<p>\n" +
            "program:<br />\n" +
            "LXI H 4000H : &quot;HL points 4000H&quot;<br />\n" +
            "MOV A, M : &quot;Get first operand&quot;<br />\n" +
            "INX H : &quot;HL points 4001H&quot;<br />\n" +
            "ADD M : &quot;Add second operand&quot;<br />\n" +
            "INX H : &quot;HL points 4002H&quot;<br />\n" +
            "MOV M, A : &quot;Store result at 4002H&quot;<br />\n" +
            "HLT : &quot;Terminate program execution&quot;<br />\n" +
            "</p>";
    public static final String microprogram3="<p>Statement: Subtract the contents of memory location 4001H from the memory location 2000H and place the result in memory location 4002H.</p>\n" +
            "\n" +
            "<p>Program &ndash;: Subtract two 8-bit numbers </p>\n" +
            "\n" +
            "<p></p>\n" +
            "\n" +
            "<p>Sample problem: <br />\n" +
            "(4000H) = 51H<br />\n" +
            "(4001H) = 19H<br />\n" +
            "Result = 51H &ndash; 19H = 38H </p>\n" +
            "\n" +
            "<p>\n" +
            " <br />\n" +
            "Source program: <br />\n" +
            "LXI H, 4000H : &quot;HL points 4000H&quot;<br />\n" +
            "MOV A, M : &quot;Get first operand&quot;<br />\n" +
            "INX H : &quot;HL points 4001H&quot;<br />\n" +
            "SUB M : &quot;Subtract second operand&quot;<br />\n" +
            "INX H : &quot;HL points 4002H&quot;<br />\n" +
            "MOV M, A : &quot;Store result at 4002H&quot;<br />\n" +
            "HLT : &quot;Terminate program execution&quot;</p>";
    public static final String microprogram4="Statement: Add the 16-bit number in memory locations 4000H and 4001H to the 16-bit number in memory locations 4002H and 4003H. The most significant eight bits of the two numbers to be added are in memory locations 4001H and 4003H. Store the result in memory locations 4004H and 4005H with the most significant byte in memory location 4005H.\n" +
            "Sample problem:\n" +
            "(4000H) = 15H\n" +
            "(4001H) = 1CH\n" +
            "(4002H) = B7H\n" +
            "(4003H) = 5AH\n" +
            "Result = 1C15 + 5AB7H = 76CCH\n" +
            "(4004H) = CCH\n" +
            "(4005H) = 76H\n" +
            " \n" +
            "Source Program 1:\n" +
            "LHLD 4000H  : \"Get first I6-bit number in HL\"\n" +
            "XCHG        : \"Save first I6-bit number in DE\"\n" +
            "LHLD 4002H  : \"Get second I6-bit number in HL\"\n" +
            "MOV A, E    : \"Get lower byte of the first number\"\n" +
            "ADD L       : \"Add lower byte of the second number\"\n" +
            "MOV L, A    : \"Store result in L register\"\n" +
            "MOV A, D    : \"Get higher byte of the first number\"\n" +
            "ADC H       : \"Add higher byte of the second number with CARRY\"\n" +
            "MOV H, A    : \"Store result in H register\"\n" +
            "SHLD 4004H  : \"Store I6-bit result in memory locations 4004H and 4005H\"\n" +
            "HLT         : \"Terminate program execution\"\n" +
            "Source program 2:\n" +
            "LHLD 4000H : Get first I6-bit number\n" +
            "XCHG : Save first I6-bit number in DE\n" +
            "LHLD 4002H : Get second I6-bit number in HL\n" +
            "DAD D : Add DE and HL\n" +
            "SHLD 4004H : Store I6-bit result in memory locations 4004H and 4005H.\n" +
            "HLT : Terminate program execution\n" +
            "NOTE: In program 1, eight bit addition instructions are used (ADD and ADC) and addition is performed in two steps. First lower byte addition using ADD instruction and then higher byte addition using ADC instruction.In program 2, 16-bit addition instruction (DAD) is used. ";
    public static final String microprogram5="<p>Statement: Add the contents of memory locations 40001H and 4001H and place the result in the memory locations 4002Hand 4003H.</p>\n" +
            "\n" +
            "<p>\n" +
            "Sample problem:</p>\n" +
            "\n" +
            "<p>(4000H) = 7FH<br />\n" +
            "(400lH) = 89H<br />\n" +
            " Result = 7FH + 89H = lO8H<br />\n" +
            "(4002H) = 08H<br />\n" +
            "(4003H) = 0lH</p>\n" +
            "\n" +
            "<p></p>\n" +
            "\n" +
            "<p>Source program: </p>\n" +
            "\n" +
            "<p>LXI H, 4000H : &quot;HL Points 4000H&quot;<br />\n" +
            "MOV A, M : &quot;Get first operand&quot;<br />\n" +
            "INX H : &quot;HL Points 4001H&quot;<br />\n" +
            "ADD M : &quot;Add second operand&quot;<br />\n" +
            "INX H : &quot;HL Points 4002H&quot;<br />\n" +
            "MOV M, A : &quot;Store the lower byte of result at 4002H&quot;<br />\n" +
            "MVIA, 00 : &quot;Initialize higher byte result with 00H&quot;<br />\n" +
            "ADC A : &quot;Add carry in the high byte result&quot;<br />\n" +
            "INX H : &quot;HL Points 4003H&quot;<br />\n" +
            "MOV M, A : &quot;Store the higher byte of result at 4003H&quot;<br />\n" +
            "HLT : &quot;Terminate program execution&quot;</p>";
    public static final String microprogram6="<p>Statement: Subtract the 16-bit number in memory locations 4002H and 4003H from the 16-bit number in memory locations 4000H and 4001H. The most significant eight bits of the two numbers are in memory locations 4001H and 4003H. Store the result in memory locations 4004H and 4005H with the most significant byte in memory location 4005H.</p>\n" +
            "\n" +
            "<p>\n" +
            "Sample problem:</p>\n" +
            "\n" +
            "<p>(4000H) = 19H<br />\n" +
            "(400IH) = 6AH<br />\n" +
            "(4004H) = I5H (4003H) = 5CH<br />\n" +
            "Result = 6A19H &ndash; 5C15H = OE04H<br />\n" +
            "(4004H) = 04H<br />\n" +
            "(4005H) = OEH</p>\n" +
            "\n" +
            "<p></p>\n" +
            "\n" +
            "<p>Source program: </p>\n" +
            "\n" +
            "<p>LHLD 4000H : &quot;Get first 16-bit number in HL&quot;<br />\n" +
            "XCHG : &quot;Save first 16-bit number in DE&quot;<br />\n" +
            "LHLD 4002H : &quot;Get second 16-bit number in HL&quot;<br />\n" +
            "MOV A, E : &quot;Get lower byte of the first number&quot;<br />\n" +
            "SUB L : &quot;Subtract lower byte of the second number&quot;<br />\n" +
            "MOV L, A : &quot;Store the result in L register&quot;<br />\n" +
            "MOV A, D : &quot;Get higher byte of the first number&quot;<br />\n" +
            "SBB H : &quot;Subtract higher byte of second number with borrow&quot;<br />\n" +
            "MOV H, A : &quot;Store l6-bit result in memory locations 4004H and 4005H&quot;<br />\n" +
            "SHLD 4004H : &quot;Store l6-bit result in memory locations 4004H and 4005H&quot;<br />\n" +
            "HLT : &quot;Terminate program execution&quot;</p>";
    public static final String microprogram7="<p>Statement: Find the l&rsquo;s complement of the number stored at memory location 4400H and store the complemented number at memory location 4300H.</p>\n" +
            "\n" +
            "<p>\n" +
            "Sample problem:</p>\n" +
            "\n" +
            "<p>(4400H) = 55H<br />\n" +
            "Result = (4300B) = AAB</p>\n" +
            "\n" +
            "<p>\n" +
            "Source program:</p>\n" +
            "\n" +
            "<p>LDA 4400B : &quot;Get the number&quot;<br />\n" +
            "CMA : &quot;Complement number&quot;<br />\n" +
            "STA 4300H : &quot;Store the result&quot;<br />\n" +
            "HLT : &quot;Terminate program execution&quot;</p>";
    public static final String microprogram8="<p>Statement: Find the 2&prime;s complement of the number stored at memory location 4200H and store the complemented number at memory location 4300H.</p>\n" +
            "\n" +
            "<p>\n" +
            "Sample problem:</p>\n" +
            "\n" +
            "<p>(4200H) = 55H<br />\n" +
            "Result = (4300H) = AAH + 1 = ABH</p>\n" +
            "\n" +
            "<p></p>\n" +
            "\n" +
            "<p>Source program:</p>\n" +
            "\n" +
            "<p>LDA 4200H : &quot;Get the number&quot;<br />\n" +
            "CMA : &quot;Complement the number&quot;<br />\n" +
            "ADI, 01 H : &quot;Add one in the number&quot;<br />\n" +
            "STA 4300H : &quot;Store the result&quot;<br />\n" +
            "HLT : &quot;Terminate program execution&quot;</p>";
    public static final String microprogram9="<p>Statement: Pack the two unpacked BCD numbers stored in memory locations 4200H and 4201H and store result in memory location 4300H. Assume the least significant digit is stored at 4200H.</p>\n" +
            "\n" +
            "<p>\n" +
            "Sample problem:</p>\n" +
            "\n" +
            "<p>(4200H) = 04<br />\n" +
            "(4201H) = 09<br />\n" +
            "Result = (4300H) = 94</p>\n" +
            "\n" +
            "<p></p>\n" +
            "\n" +
            "<p>Source program: </p>\n" +
            "\n" +
            "<p>LDA 4201H : &quot;Get the Most significant BCD digit&quot;<br />\n" +
            "RLC<br />\n" +
            "RLC<br />\n" +
            "RLC<br />\n" +
            "RLC : &quot;Adjust the position of the second digit (09 is changed to 90)&quot;<br />\n" +
            "ANI FOH : &quot;Make least significant BCD digit zero&quot;<br />\n" +
            "MOV C, A : &quot;store the partial result&quot;<br />\n" +
            "LDA 4200H : &quot;Get the lower BCD digit&quot;<br />\n" +
            "ADD C : &quot;Add lower BCD digit&quot;<br />\n" +
            "STA 4300H : &quot;Store the result&quot;<br />\n" +
            "HLT : &quot;Terminate program execution&quot;</p>";
    public static final String microprogram10="<p>Statement: Two digit BCD number is stored in memory location 4200H. Unpack the BCD number and store the two digits in memory locations 4300H and 4301H such that memory location 4300H will have lower BCD digit.</p>\n" +
            "\n" +
            "<p>\n" +
            "Sample problem:</p>\n" +
            "\n" +
            "<p>(4200H) = 58<br />\n" +
            "Result = (4300H) = 08 and<br />\n" +
            " (4301H) = 05</p>\n" +
            "\n" +
            "<p></p>\n" +
            "\n" +
            "<p>Source program: </p>\n" +
            "\n" +
            "<p>LDA 4200H : &quot;Get the packed BCD number&quot;<br />\n" +
            "ANI FOH : &quot;Mask lower nibble&quot;<br />\n" +
            "RRC<br />\n" +
            "RRC<br />\n" +
            "RRC<br />\n" +
            "RRC : &quot;Adjust higher BCD digit as a lower digit&quot;<br />\n" +
            "STA 4301H : &quot;Store the partial result&quot;<br />\n" +
            "LDA 4200H : &quot;Get the original BCD number&quot;<br />\n" +
            "ANI OFH : &quot;Mask higher nibble&quot;<br />\n" +
            "STA 4201H : &quot;Store the result&quot;<br />\n" +
            "HLT : &quot;Terminate program execution&quot;</p>";
    public static final String microprogram11="<p>Statement: Read the program given below and state the contents of all registers after the execution of each instruction in sequence.</p>\n" +
            "\n" +
            "<p>\n" +
            "Main program:</p>\n" +
            "\n" +
            "<p>4000H LXI SP, 27FFH<br />\n" +
            "4003H LXI H, 2000H<br />\n" +
            "4006H LXI B, 1020H<br />\n" +
            "4009H CALL SUB<br />\n" +
            "400CH HLT</p>\n" +
            "\n" +
            "<p>Subroutine program: </p>\n" +
            "\n" +
            "<p>4100H SUB: PUSH B<br />\n" +
            "4101H PUSH H<br />\n" +
            "4102H LXI B, 4080H<br />\n" +
            "4105H LXI H, 4090H<br />\n" +
            "4108H SHLD 2200H<br />\n" +
            "4109H DAD B<br />\n" +
            "410CH POP H<br />\n" +
            "410DH POP B<br />\n" +
            "410EH RET</p>";
    public static final String microprogram12="<p>Statement: Write a program to shift an eight bit data four bits right. Assume data is in register C.</p>\n" +
            "\n" +
            "<p>\n" +
            "Sample problem:</p>\n" +
            "\n" +
            "<p>(4200H) = 58<br />\n" +
            "Result = (4300H) = 08 and<br />\n" +
            " (4301H) = 05</p>\n" +
            "\n" +
            "<p>\n" +
            " <br />\n" +
            "Source program 1: </p>\n" +
            "\n" +
            "<p>MOV A, C<br />\n" +
            "RAR<br />\n" +
            "RAR<br />\n" +
            "RAR<br />\n" +
            "RAR<br />\n" +
            "MOV C, A<br />\n" +
            "HLT</p>";
    public static final String microprogram13="<p>Statement: Write a program to shift a 16 bit data, 1 bit right. Assume that data is in BC register pair.</p>\n" +
            "\n" +
            "<p>\n" +
            "Source program :</p>\n" +
            "\n" +
            "<p>MOV A, B<br />\n" +
            "RAR<br />\n" +
            "MOV B, A<br />\n" +
            "MOV A, C<br />\n" +
            "RAR<br />\n" +
            "MOV C, A<br />\n" +
            "HLT</p>";
    public static final String microprogram14="<p>Statement: Write a set of instructions to alter the contents of flag register in 8085.</p>\n" +
            "\n" +
            "<p>program:</p>\n" +
            "\n" +
            "<p>PUSH PSW : &quot;Save flags on stack&quot;<br />\n" +
            "POP H : &quot;Retrieve flags in &lsquo;L&rsquo;&quot;<br />\n" +
            "MOV A, L : &quot;Flags in accumulator&quot;<br />\n" +
            "CMA : &quot;Complement accumulator&quot;<br />\n" +
            "MOV L, A : &quot;Accumulator in &lsquo;L&rsquo;&quot;<br />\n" +
            "PUSH H : &quot;Save on stack&quot;<br />\n" +
            "POP PSW : &quot;Back to flag register&quot;<br />\n" +
            "HLT : &quot;Terminate program execution&quot;<br />\n" +
            "</p>";
    public static final String microprogram15="<p>Statement: Write a program to count number of l&rsquo;s in the contents of D register and store the count in the B register.</p>\n" +
            "\n" +
            "<p>\n" +
            "Sample problem:</p>\n" +
            "\n" +
            "<p>(2200H) = 04<br />\n" +
            "(2201H) = 34H<br />\n" +
            "(2202H) = A9H<br />\n" +
            "(2203H) = 78H<br />\n" +
            "(2204H) = 56H<br />\n" +
            "Result = (2202H) = A9H</p>\n" +
            "\n" +
            "<p></p>\n" +
            "\n" +
            "<p>program:</p>\n" +
            "\n" +
            "<p>MVI B, 00H<br />\n" +
            "MVI C, 08H<br />\n" +
            "MOV A, D<br />\n" +
            "BACK: RAR<br />\n" +
            "JNC SKIP<br />\n" +
            "INR B<br />\n" +
            "SKIP: DCR C<br />\n" +
            "JNZ BACK<br />\n" +
            "HLT</p>";
    public static final String microprogram16="<p>Statement: Write a program to sort given 10 numbers from memory location 2200H in the ascending order.</p>\n" +
            "\n" +
            "<p>program:</p>\n" +
            "\n" +
            "<p>MVI B, 09 :&quot;Initialize counter&quot; <br />\n" +
            "START :&quot;LXI H, 2200H: Initialize memory pointer&quot;<br />\n" +
            "MVI C, 09H :&quot;Initialize counter 2&quot;<br />\n" +
            "BACK: MOV A, M :&quot;Get the number&quot;<br />\n" +
            "INX H :&quot;Increment memory pointer&quot;<br />\n" +
            "CMP M :&quot;Compare number with next number&quot;<br />\n" +
            "JC SKIP :&quot;If less, don&rsquo;t interchange&quot;<br />\n" +
            "JZ SKIP :&quot;If equal, don&rsquo;t interchange&quot;<br />\n" +
            "MOV D, M<br />\n" +
            "MOV M, A<br />\n" +
            "DCX H<br />\n" +
            "MOV M, D<br />\n" +
            "INX H :&quot;Interchange two numbers&quot;<br />\n" +
            "SKIP:DCR C :&quot;Decrement counter 2&quot;<br />\n" +
            "JNZ BACK :&quot;If not zero, repeat&quot;<br />\n" +
            "DCR B :&quot;Decrement counter 1&quot;<br />\n" +
            "JNZ START<br />\n" +
            "HLT :&quot;Terminate program execution&quot;</p>";
    public static final String microprogram17="<p>Statement: Calculate the sum of series of even numbers from the list of numbers. The length of the list is in memory location 2200H and the series itself begins from memory location 2201H. Assume the sum to be 8 bit number so you can ignore carries and store the sum at memory location 2210H.</p>\n" +
            "\n" +
            "<p>\n" +
            "Sample problem:</p>\n" +
            "\n" +
            "<p>2200H= 4H<br />\n" +
            "2201H= 20H<br />\n" +
            "2202H= l5H<br />\n" +
            "2203H= l3H<br />\n" +
            "2204H= 22H<br />\n" +
            "Result 22l0H= 20 + 22 = 42H<br />\n" +
            "= 42H</p>\n" +
            "\n" +
            "<p></p>\n" +
            "\n" +
            "<p>program:</p>\n" +
            "\n" +
            "<p>LDA 2200H<br />\n" +
            "MOV C, A :&quot;Initialize counter&quot;<br />\n" +
            "MVI B, 00H :&quot;sum = 0&quot;<br />\n" +
            "LXI H, 2201H :&quot;Initialize pointer&quot;<br />\n" +
            "BACK: MOV A, M :&quot;Get the number&quot;<br />\n" +
            "ANI 0lH :&quot;Mask Bit l to Bit7&quot;<br />\n" +
            "JNZ SKIP :&quot;Don&rsquo;t add if number is ODD&quot;<br />\n" +
            "MOV A, B :&quot;Get the sum&quot;<br />\n" +
            "ADD M :&quot;SUM = SUM + data&quot;<br />\n" +
            "MOV B, A :&quot;Store result in B register&quot;<br />\n" +
            "SKIP: INX H :&quot;increment pointer&quot;<br />\n" +
            "DCR C :&quot;Decrement counter&quot;<br />\n" +
            "JNZ BACK :&quot;if counter 0 repeat&quot;<br />\n" +
            "STA 2210H :&quot;store sum&quot;<br />\n" +
            "HLT :&quot;Terminate program execution&quot;</p>";
    public static final String microprogram18="<p>Statement: Calculate the sum of series of odd numbers from the list of numbers. The length of the list is in memory location 2200H and the series itself begins from memory location 2201H. Assume the sum to be 16-bit. Store the sum at memory locations 2300H and 2301H.</p>\n" +
            "\n" +
            "<p>\n" +
            "Sample problem:</p>\n" +
            "\n" +
            "<p>2200H = 4H<br />\n" +
            "2201H= 9AH<br />\n" +
            "2202H= 52H<br />\n" +
            "2203H= 89H<br />\n" +
            "2204H= 3FH<br />\n" +
            "Result = 89H + 3FH = C8H<br />\n" +
            "2300H= H Lower byte<br />\n" +
            "2301H = H Higher byte</p>\n" +
            "\n" +
            "<p></p>\n" +
            "\n" +
            "<p>\n" +
            "program :<br />\n" +
            " <br />\n" +
            "LDA 2200H<br />\n" +
            "MOV C, A :&quot;Initialize counter&quot;<br />\n" +
            "LXI H, 2201H :&quot;Initialize pointer&quot;<br />\n" +
            "MVI E, 00 :&quot;Sum low = 0&quot;<br />\n" +
            "MOV D, E :&quot;Sum high = 0&quot;<br />\n" +
            "BACK: MOV A, M :&quot;Get the number&quot;<br />\n" +
            "ANI 0lH :&quot;Mask Bit 1 to Bit7&quot;<br />\n" +
            "JZ SKIP :&quot;Don&rsquo;t add if number is even&quot;<br />\n" +
            "MOV A, E :&quot;Get the lower byte of sum&quot;<br />\n" +
            "ADD M :&quot;Sum = sum + data&quot;<br />\n" +
            "MOV E, A :&quot;Store result in E register&quot;<br />\n" +
            "JNC SKIP<br />\n" +
            "INR D :&quot;Add carry to MSB of SUM&quot;<br />\n" +
            "SKIP: INX H :&quot;Increment pointer&quot;</p>";
    public static final String microprogram19="<p>Statement: Find the square of the given numbers from memory location 6100H and store the result from memory location 7000H.</p>\n" +
            "\n" +
            "<p>\n" +
            "Sample problem:</p>\n" +
            "\n" +
            "<p>2200H = 4H<br />\n" +
            "2201H= 9AH<br />\n" +
            "2202H= 52H<br />\n" +
            "2203H= 89H<br />\n" +
            "2204H= 3FH<br />\n" +
            "Result = 89H + 3FH = C8H<br />\n" +
            "2300H= H Lower byte<br />\n" +
            "2301H = H Higher byte</p>\n" +
            "\n" +
            "<p></p>\n" +
            "\n" +
            "<p>\n" +
            "program:</p>\n" +
            "\n" +
            "<p>LXI H, 6200H :&quot;Initialize lookup table pointer&quot;<br />\n" +
            "LXI D, 6100H :&quot;Initialize source memory pointer&quot;<br />\n" +
            "LXI B, 7000H :&quot;Initialize destination memory pointer&quot;<br />\n" +
            "BACK: LDAX D :&quot;Get the number&quot;<br />\n" +
            "MOV L, A :&quot;A point to the square&quot;<br />\n" +
            "MOV A, M :&quot;Get the square&quot;<br />\n" +
            "STAX B :&quot;Store the result at destination memory location&quot;<br />\n" +
            "INX D :&quot;Increment source memory pointer&quot;<br />\n" +
            "INX B :&quot;Increment destination memory pointer&quot;<br />\n" +
            "MOV A, C<br />\n" +
            "CPI 05H :&quot;Check for last number&quot;<br />\n" +
            "JNZ BACK :&quot;If not repeat&quot;<br />\n" +
            "HLT :&quot;Terminate program execution&quot;</p>";
    public static final String microprogram20="<p>Statement: Search the given byte in the list of 50 numbers stored in the consecutive memory locations and store the address of memory location in the memory locations 2200H and 2201H. Assume byte is in the C register and starting address of the list is 2000H. If byte is not found store 00 at 2200H and 2201H.</p>\n" +
            "\n" +
            "<p>program:</p>\n" +
            "\n" +
            "<p>LX I H, 2000H :&quot;Initialize memory pointer 52H&quot;<br />\n" +
            "MVI B, 52H :&quot;Initialize counter&quot;<br />\n" +
            "BACK: MOV A, M :&quot;Get the number&quot;<br />\n" +
            "CMP C :&quot;Compare with the given byte&quot;<br />\n" +
            "JZ LAST :&quot;Go last if match occurs&quot;<br />\n" +
            "INX H :&quot;Increment memory pointer&quot;<br />\n" +
            "DCR B :&quot;Decrement counter&quot;<br />\n" +
            "JNZ B :&quot;If not zero, repeat&quot;<br />\n" +
            "LXI H, 0000H<br />\n" +
            "SHLD 2200H<br />\n" +
            "JMP END :&quot;Store 00 at 2200H and 2201H&quot;<br />\n" +
            "LAST: SHLD 2200H :&quot;Store memory address&quot;<br />\n" +
            "END: HLT :&quot;Stop&quot;</p>";
    public static final String microprogram21="<p>Statement: Two decimal numbers six digits each, are stored in BCD package form. Each number occupies a sequence of byte in the memory. The starting address of first number is 6000H Write an assembly language program that adds these two numbers and stores the sum in the same format starting from memory location 6200H.</p>\n" +
            "\n" +
            "<p>program:</p>\n" +
            "\n" +
            "<p>LXI H, 6000H :&quot;Initialize pointer l to first number&quot;<br />\n" +
            "LXI D, 6l00H :&quot;Initialize pointer2 to second number&quot;<br />\n" +
            "LXI B, 6200H :&quot;Initialize pointer3 to result&quot;<br />\n" +
            "STC<br />\n" +
            "CMC :&quot;Carry = 0&quot;<br />\n" +
            "BACK: LDAX D :&quot;Get the digit&quot;<br />\n" +
            "ADD M :&quot;Add two digits&quot;<br />\n" +
            "DAA :&quot;Adjust for decimal&quot;<br />\n" +
            "STAX.B :&quot;Store the result&quot;<br />\n" +
            "INX H :&quot;Increment pointer 1&quot;<br />\n" +
            "INX D :&quot;Increment pointer2&quot;<br />\n" +
            "INX B :&quot;Increment result pointer&quot;<br />\n" +
            "MOV A, L<br />\n" +
            "CPI 06H :&quot;Check for last digit&quot;<br />\n" +
            "JNZ BACK :&quot;If not last digit repeat&quot;<br />\n" +
            "HLT :&quot;Terminate program execution&quot;</p>";
    public static final String microprogram22="<p>Statement: Write an assembly language program to separate even numbers from the given list of 50 numbers and store them in the another list starting from 2300H. Assume starting address of 50 number list is 2200H.</p>\n" +
            "\n" +
            "<p>program:</p>\n" +
            "\n" +
            "<p>LXI H, 2200H :&quot;Initialize memory pointer l&quot;<br />\n" +
            "LXI D, 2300H :&quot;Initialize memory pointer2&quot;<br />\n" +
            "MVI C, 32H :&quot;Initialize counter&quot;<br />\n" +
            "BACK:MOV A, M :&quot;Get the number&quot;<br />\n" +
            "ANI 0lH :&quot;Check for even number&quot;<br />\n" +
            "JNZ SKIP :&quot;If ODD, don&rsquo;t store&quot;<br />\n" +
            "MOV A, M :&quot;Get the number&quot;<br />\n" +
            "STAX D :&quot;Store the number in result list&quot;<br />\n" +
            "INX D :&quot;Increment pointer 2&quot;<br />\n" +
            "SKIP: INX H :&quot;Increment pointer l&quot;<br />\n" +
            "DCR C :&quot;Decrement counter&quot;<br />\n" +
            "JNZ BACK :&quot;If not zero, repeat&quot;<br />\n" +
            "HLT :&quot;Stop</p>";
    public static final String microprogram23="<p>Statement: Write assembly language program with proper comments for the following:<br />\n" +
            "A block of data consisting of 256 bytes is stored in memory starting at 3000H. This block is to be shifted (relocated) in memory from 3050H onwards. Do not shift the block or part of the block anywhere else in the memory.</p>\n" +
            "\n" +
            "<p>\n" +
            "&quot;Two blocks (3000 &ndash; 30FF and 3050 &ndash; 314F) are overlapping. Therefore it is necessary to transfer last byte first and first byte last.&quot;</p>\n" +
            "\n" +
            "<p>\n" +
            "program:</p>\n" +
            "\n" +
            "<p>MVI C, FFH :&quot;Initialize counter&quot;<br />\n" +
            "LX I H, 30FFH :&quot;Initialize source memory pointer 3l4FH&quot;<br />\n" +
            "LXI D, 314FH :&quot;Initialize destination memory pointer&quot;<br />\n" +
            "BACK: MOV A, M :&quot;Get byte from source memory block&quot;<br />\n" +
            "STAX D :&quot;Store byte in the destination memory block&quot;<br />\n" +
            "DCX H :&quot;Decrement source memory pointer&quot;<br />\n" +
            "DCX :&quot;Decrement destination memory pointer&quot;<br />\n" +
            "DCR C :&quot;Decrement counter&quot;<br />\n" +
            "JNZ BACK :&quot;If counter 0 repeat&quot;<br />\n" +
            "HLT :&quot;Stop execution&quot;<br />\n" +
            "</p>";
}
