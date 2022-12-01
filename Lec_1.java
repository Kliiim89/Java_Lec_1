
//1.1. Вычислить n-ое треугольного число(сумма чисел от 1 до n)

// public class Lec_1 {
//         public static void main(String[] args) {
    
//             int n = 4;
//             int m = n;
    
//             for (int i = 1; i <= n; i++,m--) {
//                 for (int j = 1; j <= m; j++) {
//                     System.out.print(i);
//                 }
//                 System.out.println();
//             }
    
//         }
//     }

// 1.2. Вычислить n! (произведение чисел от 1 до n)

// import java.util.Scanner;
// public class Lec_1 {
//         public static void main(String[] args) {
//             Scanner in = new Scanner(System.in);
        
//             int end = in.nextInt();
//             double result = 1;
            
//             for ( int i = 1; i <= end; i++ ) {
//                 result *= i;
//             }
//             System.out.println("n!" + " = " + result );
//         }
//     }

// 2. Вывести все простые числа от 1 до 1000

// public class Lec_1 {
//     public static void main(String[] args) {
//         final int N = 1000;
//         int i, a[] = new int[N];
//         for (i = 2; i < N; i++) a[i] = 1;
//         for (i = 2; i < N; i++) 
//             if (a[i]==1)
//                 for(int j = i; j*i < N; j++) a[i*j] = 0;
//         for (i = 2; i < N; i++)
//             if (a[i]==1) System.out.println(" "+i);
//     }
// }

// 3. Реализовать простой калькулятор
import java.util.Scanner;
public class Lec_1 {
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      num1 = reader.nextDouble();
      num2 = reader.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      op = reader.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
         default:  System.out.printf("Error! Enter correct operator");
            return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
}
