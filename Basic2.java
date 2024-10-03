// _____________Previous class Revision__________________
// public class class2 {
//     public static void main(String args[]){
//         System.out.print("komal is here");
//     }
// }

// __________Variables in JAVA_____________

// public class class2 {
//         public static void main(String args[]){
//             int a = 5;
//             int b = 5;
//             System.out.println("a");
//             System.out.println(a);
//            a = 50;
//            System.out.println(a);
//            a=b;
//            System.out.println(a);
//         }
//     }


// ____________Data Types In Java__________
// -----PRIMITIVE AND NON-PRIMITIVE--------

// PRIMITIVE
// -byte
// -short
// -char
// -boolean
// -int
// -long
// -float
// -double

// NON-PRIMITIVE
// String 
// Array
// Class
// Object
// Interface

// public class class2 {
//         public static void main(String args[]){
//             byte b = 8;
//             System.out.println(b);
//             char ch = 'a';
//             System.out.println(ch);
//             boolean var = false;
//             System.out.println( var);
//             float num = 10.5f;
//             System.out.println(num);
//             int number = 25;
//             System.out.println(number);
//             // long => int with long number
//             long no  = 753454675;
//             System.out.println(no);
        
            
//             // short => int with short number;
//             short sht = 28;
//             System.out.println(sht);
//             // double => float with long number;
//         }
//     }


// ____________COMMENTS IN JAVA_____________
// ----single-line------
// HI, I M KOMAL MALKANI

// ----Multi-line------

/*HI,
THERE,
HOW ARE UH?
I am learning java */

// --------SUM OF A & B ---------
// public class class2 {
// public static void main(String args[]){
//     int a = 10;
//     int b = 10;
//     int sum = a+b;
//     System.out.println(sum);
// }
// }

// INPUT IN JAVA
//  next
// nextline
// nextInt
// nextByte
// nextFloat
// nextDouble
// nextBoolean
// nextShort
// nextLong

// import java.util.*;
// public class class1{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         // String firstName = sc.next();
//         // System.out.println(firstName);
//         // String lastName = sc.next();
//         // System.out.println(lastName);
//         // String fullName = sc.nextLine();
//         // System.out.println(fullName);

//         // int num = sc.nextInt();
//         // System.out.println(num);

//         // byte no = sc.nextByte();
//         // System.out.println(no);

//         // float flt = sc.nextFloat();
//         // System.out.println(flt);

//         // double dbl = sc.nextDouble();
//         // System.out.println(dbl);

//         // long lg = sc.nextLong();
//         // System.out.println(lg);

//         // short st = sc.nextShort();
//         // System.out.println(st);

//         // boolean bln = sc.nextBoolean();
//         // System.out.println(bln);
//     }
// }

// ------QUESTION PRACTICE ON THE CONCEPT -> INPUTS IN JAVA------

// import java.util.Scanner;

// public class class1{
//     public static void main(String args[]){
//     // 1.----- sum of a & b----------
//     Scanner scn = new Scanner(System.in);
//     // int a = scn.nextInt();
//     // // System.out.println(a);
//     // int b = scn.nextInt();
//     // // System.out.println(b);
//     // int sum = a+b;
//     // System.out.println(sum);


//     // 2.----- Product of a & b ----------
//     // int a = scn.nextInt();
//     // int b = scn.nextInt();
//     // int product = a * b;
//     // System.out.println(product);

    
//     // 3.----- Area of Circle ----------
//     // float rad = scn.nextFloat();
//     // float area = 3.14f * rad *rad ;
//     // System.out.println(area);

//     // 4.----- Area of Rectangle ----------
//     // float length = scn.nextFloat();
//     // float breadth = scn.nextFloat();
//     // float area = length*breadth;
//     // System.out.println(area);

//     // 4.----- Area of Square ----------
//     // int side = scn.nextInt();
//     // int area = side*side;
//     // System.out.println(area);

//     // 4.----- perimeter of square ----------
//     // int side = scn.nextInt();
//     // int area = 4*side;
//     // System.out.println(area);

//     // 4.----- perimeter of Rectangle ----------
//     // float length = scn.nextFloat();
//     // float breadth = scn.nextFloat();
//     // float perimeter  = 2*(length+breadth);
//     // System.out.println(perimeter);
//     }
// }

// import java.util.*;

// public class class2{
//     public static void main(String args[]){
//           // ___________TYPE-CONVERSION_______________

//         // int a = 25;
//         // long b = a;

//         // long a = 25;
//         // int b = a;
//         // System.out.println(b);

//         // Example

//             // Scanner sc = new Scanner(System.in);
//             // int number = sc.nextFloat();
//             // float number = sc.nextInt();
//             // System.out.println(number);

            
//               // ____________TYPE-CASTING_____________
//             //   1
//             //   Scanner sc = new Scanner(System.in);
//             //   float a = 25.999f;
//             //   int b = (int)a;
//             //   System.out.println(b);

//             //  2
//             // Scanner sc = new Scanner(System.in);
//             // float marks = 90.98f;
//             // int mark= (int)marks;
//             // System.out.println(mark);

//         //   3
//         // Scanner sc = new Scanner(System.in);
//         // char ch = 'a';
//         // char ch1 = 'b';
//         // char ch2 = 'c';
//         // char ch3 = 'A';
//         // char ch4 = 'Z';
//         // char ch5 = 'Y';
//         // int number = ch;
//         // int number1 = ch1;
//         // int number2 = ch2;
//         // int number3 = ch3;
//         // int number4 = ch4;
//         // int number5 = ch5;
//         // System.out.println(number);
//         // System.out.println(number1);
//         // System.out.println(number2);
//         // System.out.println(number3);
//         // System.out.println(number4)  ;
//         // System.out.println(number5);

//          // ____________TYPE-PROMOTION_____________
//         //  1.
//         //  char a = 'a';
//         //  char b = 'b';
//         //  char c = b-a;//this will give err on executing it
//         //  System.out.println((int)(b));
//         //  System.out.println((int)(a));
//         //  System.out.println(a);
//         //  System.out.println(b-a);


//         // 2.
//         // short a = 5;
//         // byte b = 25;
//         // char c = 'c';
//         // byte bt = (byte)(a+b+c);
//         // System.out.println(bt);

//         // 3.
//         // int a = 10;
//         // float b = 2.5f;
//         // long c = 25;
//         // double d = 30;
//         // double ans = a + b + c + d;
//         // System.out.println(ans);

//         // 4.
//         // byte a = 5;
//         // byte b = (byte)(a*2);
//         // System.out.println(b);

//     }
// }


// __________________OPERATORS IN JAVA____________________
// Symbols that tell compiler to perform some operation

// ___TYPES OF OPERATOR____
// -Arithmetic Operator
// -Relational Operator
// -Logical Operator
// -Bitwise Operator
// -Assignment Operator

import java.util.*;

public class Basic2{
    public static void main(String args[]){
        // *-----ARITHMETIC OPERATOR------*
        // int a = 5;
        // int b = 5;
        // System.out.println("Addition of a and b is " + (a+b) );
        // System.out.println("Subtraction of a and b is " + (a-b) );
        // System.out.println("Multiplication of a and b is " + (a*b) );
        // System.out.println("Division of a and b is " + (a/b) );
        // System.out.println("Modulo of a and b is " + (a%b) );

        // *-----UNARY OPERATOR------*
        // _____PRE-INCREMENT_____
        // int a = 10;
        // int b = ++a;
        // System.out.println(a);
        // System.out.println(b);

        // _____POST-INCREMENT_____
        // int c = 10;
        // int d = c++;
        // System.out.println(c);
        // System.out.println(d);

        // _____PRE-DECREMENT_____
        // int e = 10;
        // int f = --e;
        // System.out.println(e);
        // System.out.println(f);

        // _____POST-DECREMENT_____
        // int  g = 10;
        // int  h = g--;
        // System.out.println(g);
        // System.out.println(h);

        // *-----RELATIONAL OPERATOR------*
        // int a = 10;
        // int b = 20;
        // System.out.println((a==b));
        // System.out.println((a!=b));
        // System.out.println((a>b));
        // System.out.println((a>=b));
        // System.out.println((a<b));
        // System.out.println((a<=b));

        // *-----LOGICAL OPERATOR------*
        // ____&&_____
        // int A = 10;
        // int B = 10;
        // System.out.println((A>=B)&&(B<=A));

        // ____||_____
        // int A = 1;
        // int B = 10;
        // int C = 1;
        // System.out.println((A==B)||(C<=A));

        // ____!_____
        // int A = 11;
        // int B = 10;
        // int C = 1;
        // System.out.println(!(A==B)&&(C<=A));

        // *-----ASSIGNMENT OPERATOR------*
        // int a = 5;
        // int b = 4;
        // System.out.println((a=b));
        // System.out.println(a+=1);
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(b*=5);



        // ______________CONDITIONAL STATEMENTS________________
            // if else
            // else if
            // ternary opertator
            // switch

            // -------IF - ELSE ------------------

            // int age = 2;
            // if (age >= 18) {
            //     System.out.println("Adult");
            // }else{
            //     System.out.println("Not Adult");
            // }


            Scanner sc = new Scanner(System.in);

            // int age = sc.nextInt();
            // if ((age <= 12)) {
            //     System.out.println("Preteens");
            // }
            // else if ((age >= 13)&& (age <=18)) {
            //     System.out.println("Teenager");
            // }else {
            //     System.out.print("Adult");
            // }


            // int A = sc.nextInt();
            // int B = sc.nextInt();

            // if(A>B){
            //     System.out.println("A is greater than B");
            // }else{
            //     System.out.println("B is greater than A");
            // }

            
            // if ((A%2==0)) {
            //     System.out.println("A is even number");
            // } else {
            //     System.out.println("B is odd number");
            // }

            // ----INCOME -TAX -CALCULATOR------
            // int income = sc.nextInt();
            // if (income < 500000) {
            //     System.out.println("0% TAX");
            // } else if((income > 500000)&&( income < 10000000)){
            //     System.out.println("TAX will be " +(int)(income*0.2));
            // }
            // else{
            //     System.out.println("TAX will be " + (int)(income*0.3));
            // }

            // ----PRINT THE LARGEST OF 3 ----
            // int a = sc.nextInt();
            // int b = sc.nextInt();
            // int c = sc.nextInt();
            // if ((a>b)&& (a>c)) {
            //     System.out.println("A is greater than b and c");
            // } else if((b>c)&& (b>c)) {
            //     System.out.println("B is greater than a and c");
            // }else{
            //     System.out.println("C is greater than a and b");
            // }
        
            // ----PRINT THE LARGEST AMONG THESE 3 NUMBERS ----
            // int A = 1, B = 2, C = 4;
            // if ((A>=B)&& (A>=B)) {
            //     System.out.println("A is greater");
            // } else if(B>=C) {
            //     System.out.println("B is greater");
            // }else{
            //     System.out.println("C is greater");
            // }

            // ------TERANARY OPERATOR-----
            // Variable =  Condition ? statement1 : statement2;

            // int number = 4;
            // String type = ((number%2==0)?"even":"odd");
            // System.out.print(type);

            // int marks = sc.nextInt();
            // String condition =( (marks>=33)? "PASS" : "FAIL");
            // System.out.println(condition);


            // -------SWITCH STATEMENTS------------
            // int number = 3 ; 
            // switch(number){
            //     case 1 : System.out.println("burger");
            //               break;
            //     case 2 : System.out.println("Sandwich");
            //               break;
            //     case 3 : System.out.println("chocolate");
            //               break;
            //     case 4 : System.out.println("Ram laddu");
            //               break;
            //     case 5 : System.out.println("Momo");
            //               break;



        //    char ch = 'e' ; 
        //     switch(ch){
        //         case 'a' : System.out.println("burger");
        //                   break;
        //         case 'b' : System.out.println("Sandwich");
        //                   break;
        //         case 'c' : System.out.println("chocolate");
        //                   break;
        //         case 'd' : System.out.println("Ram laddu");
        //                   break;
        //         case 'e' : System.out.println("Momo");
        //                   break;
            // }



        // ----------MAKING CALCULATOR USING SWITCH-----------------
        // int a = sc.nextInt();
        // System.out.println(" value of a = "+a);
        // int b = sc.nextInt();
        // System.out.println(" value of b = "+b);

        // char operator = sc.next().charAt(0);
        // System.out.println("operator is " + operator);

        // switch (operator) {
        //     case '+' :
        //         System.out.println(a + b);
        //         break;
        //     case '-' :
        //         System.out.println(a - b);
        //         break;
        //     case '*' :
        //         System.out.println(a * b);
        //         break;
        //     case '/' :
        //         System.out.println(a / b);
        //         break;
        //     case '%' :
        //         System.out.println(a % b);
        //         break;
        
        //     default:
        //         break;
        // }



        // ----------------------LOOPS--------------------------------
        // for loop 
        // while loop
        // Do while loop
    }

}



