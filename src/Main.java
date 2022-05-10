import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    int year = 1601;
    int currentYear = LocalDate.now().getYear();
    int clientDeviceYear = 2023;
    int clientOS = 0;
    int deliveryDistance = 50;
    int deliveryDays1;

    // Tasks:
        checkYear(year);
        checkUpdate(currentYear,clientOS,clientDeviceYear);
        deliveryDays1 = calculateDeliveryTime(deliveryDistance);
    }
    public static void checkYear(int year) {
        if (year % 4 != 0 || (year % 100 == 0) && (year % 400 != 0)) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println(year + " год является високосным");
        }
    }
    public static void checkUpdate(int currentYear, int clientOS, int clientDeviceYear) {

        switch (clientOS) {
            case 0:
                break;
            case 1:
                break;
        }

        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else {
            System.out.println("Что-то пошло не так, попробуйте еще раз");

        }
    }
    public static int calculateDeliveryTime(int deliveryDistance) {
        int deliveryDays = 1;

        if (deliveryDistance < 20) {
            deliveryDays = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays = deliveryDays + 1;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDays = deliveryDays + 2;
        }
        return deliveryDays;
    }
}