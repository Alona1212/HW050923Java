//Реализуйте программу, которая попросит пользователя ввести три целых числа (используйте сканер) и напечатает максимум из трех чисел.

import java.util.Scanner;
public class HW0509_3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();
            System.out.print("Enter the third number: ");
            int c = scanner.nextInt();
            System.out.print("The maximum number is "+ maxNumber(a,b,c));
        }
        public static int maxNumber(int a,int b,int c){
            int max = a;
            if (b>max) max = b;
            if (c>max) max = c;
            return max;
        }
    }