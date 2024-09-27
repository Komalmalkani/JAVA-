// public class index{
//     public static void main(String[] args){
//         System.out.print("HELLO KOMAL\n");
//         System.out.print("HELLO KOMAL\n");
//         System.out.print("HELLO KOMAL\n");
//     }
// }

// public class index{
//     public static void main(String[] args){
//         System.out.println("*****");
//         System.out.println("****");
//         System.out.println("***");
//         System.out.println("**");
//         System.out.println("*");
//     }

// }

// public class {
//     public static void main(String [] args){
//         int a = 2;
//         int b = 3;
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(a+b);
//         String name = "komal";
//         System.out.println(name);
//     }
// }

// // public class index{
// //     public static void main(String[] args){
// //         int a= 1;
// //         int b= 2;
// //         int sum = a + b ;
// //         System.out.println(sum);
// //     }
// // }
// // import java.util.*;
// // public class index{
// //     public static void main(String[] args){
// //         scanner sc = new Scanner(System.in);
// //     }
// // }
// public class index{
//     public static void main(String args[]){
//         System.out.print("**");
//     }
// }

// public class index{
//     public static void main(String arg[]){
//         int counter = 0;
//         while(counter<100){
//             System.out.println("Hello World");
//             counter++;
//         }
//         System.out.print("printed hello world 100x");
//     }
// }



// public class index{
//     public static void main(String arg[]){
//      int i = 0;
//      while(i<=10){
//         System.out.println(i);
//         i++;
//      }

//     }
// }
// import java.util.Scanner;
// 

// public class index{
//     public static void main (String args[]){
//         System.out.print("Enter the value of n:");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int i = 1;
//         int Sum = 0;
//         while(i<= n){
//             // System.out.println(i);
//             Sum += i ;
//             i++;
//             System.out.println(Sum);
//         }
//     }
// }

// import java.util.*;
// public class index{
//     public static void main(String args[]){
//         for(int i = 1; i<= 10 ; i++){
//             System.out.println("Hello World");
//         }
//     }
// }
// public class index{
//     public static void main(String args[]){
//         for(int i = 1; i<= 4 ; i++){
//             System.out.println("****");
//         }
//     }
// }
//  public class index{
//     public static void main(String arg[]){
//         int n =  10899;
//         while (n>0) {
//          int lastDigit = n%10;
//          System.out.println(lastDigit);
//          n = n/10;
//         }
//     }
//  }
//  public class index{
//     public static void main(String arg[]){
//         int n =  10899;
//         int rev = 0 ;
//         while (n>0){
//             int lastDigit = n%10;
//             rev = (rev *10 )+ lastDigit;
//             n= n/10;

//         }
//         System.out.println(rev);
//     }
//  }

// public class index{
//     public static void main(String arg[]){
//         int counter = 1;
//         do{
//             System.out.println("Hello World!");
//             counter++;
//         }while(counter <=10);
//     }
// }
// *********************************PATTERNS***************************************

// *********INTRO TO NESTED LOOPS {STAR PATTERN}**********
// public class index{
//     public static void main(String args[]){
//         for(int i = 1; i <=4; i++){
//             for(int j = 1;j<=i;j++){
//                 System.out.print("*");
//             }
//            System.out.println();
//         }
//     }
// }

// ***********INVERTED STAR PATTERN*****************
// public class index{
//     public static void main(String args[]){
//         int n = 4;
//         for(int line = 1; line <=n; line++){
//             for(int star = 1;star<=n-line+1;star++){
//                 System.out.print("*");
//             }
//            System.out.println();
//         }
//     }
// }

// **********************PRINT HALF PYRAMID PATTERN***********
public class index{
    public static void main(String args[]){
        int n = 4;
        for(int line=1;line <= n; line++){
            for(int number =1;number<=line;number++){
                System.out.print(number);
            }
           System.out.println();
        }
    }
}

// *****************PRINT CHARACRTER PATTERN*****************
public class index{
  public static void main(String args[]){
    int n = 4;
    char ch = 'A';
    for (int i=1; i<=n;i++){
        for (int j=1;j<=i;j++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
  }
}


******************FUNCTIONS********************