//Реализуйте программу, которая попросит пользователя ввести год и напечатать этот год isLeap (високосный) или нет.

public class HW0509_2 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2023));

    }
    public static boolean isLeapYear(int a){
        if ((a%4==0 && a%100!=0) || a%400 == 0)return true;
        else return false;
//Используя тернарный оператор
// return (a % 4 == 0 && a % 100 != 0) || a % 400 == 0;
    }
}
