import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkYear(int year) {
        if ((year % 100 == 0) && (year % 400 == 0) && (year % 4 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " isn't leap year");
        }
    }


    public static void task1() {
        System.out.println("Задача 1");
        checkYear(2021);
    }

    public static void iosOrAndroid(int client, int clientDeviceYear) {

        int currentYear = LocalDate.now().getYear();

        if (client == 0 && clientDeviceYear == currentYear) {
            System.out.println("Install the iOS app version by following the link");
        } else if (client == 1 && clientDeviceYear == currentYear) {
            System.out.println("Install the Android app version by following the link");
        } else if (client == 0 && clientDeviceYear <= currentYear) {
            System.out.println("Install the updated version of the iOS app by following the link");
        } else if (client == 1 && clientDeviceYear <= currentYear) {
            System.out.println("Install the updated version of the Android app by following the link");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        iosOrAndroid(1, 2023);
    }

    public static int deliveryTime(int deliveryDistance) {
        int day = 1;

        if (deliveryDistance < 20) {
            System.out.println("Delivery within " + deliveryDistance + " km takes " + day + " day");

        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            day++;
            System.out.println("Delivery within " + deliveryDistance + " km takes " + day + " days");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            day += 2;
            System.out.println("Delivery within " + deliveryDistance + " km takes " + day + " days");
        } else if (deliveryDistance > 100) {
            System.out.println("Delivery isn't available");
            return (-1);
        }
        return  day;
    }



    public static void task3() {
            System.out.println("Задача 3");
            deliveryTime(75);
        }
    }


