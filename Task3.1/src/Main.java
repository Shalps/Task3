import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру <Угадай количество дней в году>");
        Scanner scanner = new Scanner(System.in);


        int counter = 0;
        while (true) {

            System.out.print("Введи год:");
            int year = scanner.nextInt();
            System.out.print("Введи количество дней:");
            int days = scanner.nextInt();


            if (year % 400 == 0 && year % 4 == 0 && year % 100 != 0) {
                if (days == 366) {
                    counter++;
                }
            } else if (days == 365) counter++;

            else {
                System.out.println("Неправильно!");
                break;
            }
        }
        System.out.println("Вы набрали:"+counter);
    }
}


//    public static void daysCounter(int year, int days) {
//        int counter = 0;
//        if (year % 400 == 0 && year % 4 == 0 && year % 100 != 0) {
//            if (days == 366) {
//                counter++;
//
//            }
//        } else if (days == 365) counter++;
//        else {
//            System.out.println("Не правильно!");
//        }
//    }
//}
