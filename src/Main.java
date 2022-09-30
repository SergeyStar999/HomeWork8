public class Main {

    public static void main(String[] args){
        //Задание 1
        printWhatYear(2022);

        //Задание 2
        printWhichVersionToInstall(1, 2013);

        //Задание 3
        printHowManyDaysFofDelivery(15);
    }

    //Задание 1
    public static void printWhatYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }
    }

    //Задание 2
    public static void printWhichVersionToInstall(int OS, int yearOfIssue){
        if (OS == 0) {
            if (yearOfIssue < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (OS == 1) {
            if (yearOfIssue < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        if (OS != 0 && OS != 1) {
            System.out.println("Устройво не поддерживается");
        }
    }

    //Задание 3
    public static void printHowManyDaysFofDelivery(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день. " + "Срок доставки 24 часа.");
        } else if (deliveryDistance >= 21 && deliveryDistance <= 60 || deliveryDistance <=61 && deliveryDistance <= 100) {
            System.out.println("Потребуется 2 дня. " + "Срок доставки 48 часов.");
        } else {
            System.out.println("Потребуется 3 дня. " + "Срок доставки 72 часа.");
        }
    }
}
