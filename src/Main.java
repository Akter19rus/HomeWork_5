public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");

        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }

    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {    //Тернарный оператор
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        boolean oneDayDistance = (deliveryDistance <= 20 && deliveryDistance > 0);
        boolean twoDayDistance = (deliveryDistance > 20 && deliveryDistance <= 60);
        boolean threeDayDistance = (deliveryDistance > 60 && deliveryDistance < 100);
        if (oneDayDistance) {
            System.out.println("Для расстояния " + deliveryDistance + " потребуются сутки на доставку карты");
        } else if (twoDayDistance) {
            System.out.println("Для расстояния " + deliveryDistance + " потребуется два дня на доставку карты");
        } else if (threeDayDistance) {
            System.out.println("Для расстояния " + deliveryDistance + " потребуется 3 дня на доставку карты");
        } else {
            System.out.println("Свыше 100 км доставки нет!");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("В этом месяце зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("В этом месяце весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("В этом месяце лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("В этом месяце осень");
                break;
            default:
                System.out.println("Такого месяца не существует!");

        }
    }
}
    