import java.rmi.dgc.Lease;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        printInfoAboutYear(year);
    }

    private static void printInfoAboutYear(int year) {
        boolean LeapYear = isLeapYear(year);
        if (LeapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }


    public static void task2() {
        System.out.println("Задача 2");
        printInfoAboutVersion(1, 2015);
    }

    private static void printInfoAboutVersion(int os, int productionYear) {
        if (os < 0 || os > 1) {
            System.out.println("ОС должна быть равна 0 или 1!");
            return;
        }
        int currentYear = LocalDate.now().getYear();
        StringBuilder result = new StringBuilder("Установите ");
        if (productionYear < currentYear) {
            result.append("Облегченную версию для ");
        } else {
            result.append("Версию для ");
        }
        if (os == 0) {
            result.append("iOS");
        } else {
            result.append("Android");
        }
        System.out.println(result);
    }

    public static void task3() {
        System.out.println("Задача 3");

        int deliveryDistance = 95;
        int days = calculateDeliveryDays(deliveryDistance);
        if (days == -1) {
            System.out.println("Доставка невозможна на расстояние " + deliveryDistance + " км");
        } else {
            System.out.println("Время доставки " + days + " дней");
        }
    }

    private static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}