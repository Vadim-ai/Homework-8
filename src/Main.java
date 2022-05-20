import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    int year = 1601;
    int currentYear = LocalDate.now().getYear();
    int clientDeviceYear = 2023;
    int clientOS = 0;
    int deliveryDistance = 50;
    int deliveryDays1;
    char[] fullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    String sort = "aabccddefgghiijjkk";
    double[] salary = new double[30];
    double min = 100_000;
    double max = 200_000;


    // Tasks:
        checkYear(year);
        checkUpdate(currentYear,clientOS,clientDeviceYear);
        deliveryDays1 = calculateDeliveryTime(deliveryDistance);
        reverseArr(fullName);
        System.out.println(new String(fullName));
        sortString(sort);
        ArrayFullfill(salary,min,max);
        System.out.println(getRandomDouble(100000, 200000));
        System.out.println(CalculateAverage(salary));
        System.out.println(CalculateSum(salary));

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

    public static void reverseArr (char[] fullName){
        for (int i = 0; i < (fullName.length)/2; i++) {
            char corrector = fullName[i];
            fullName[i] = fullName[fullName.length - i - 1];
            fullName[fullName.length -i - 1] = corrector;
        }
    }

    public static void sortString(String sort){
        char [] c = sort.toCharArray();
        for (int i = 0; i < c.length + 1; i++) {
            if (c[i] == c[i + 1] && c[i] != c[i + 1 + 1]) {
                System.out.println("Найден дубль в символе - " + c[i]);
                break;
            }
        }
    }

    public static double getRandomDouble (double min, double max){
        Random random = new Random();
        double result = Math.random()*((max - min) + min);
        return result;
        }

    public static void ArrayFullfill (double[]salary, double min, double max){
        for (int i = 0; i < salary.length; i++) {
            salary[i] = getRandomDouble(min,max);
        }
    }

    public static double CalculateAverage(double[] salary) {
        double average = CalculateSum(salary)/salary.length;
        return average;
    }

    public static double CalculateSum(double[] salary){
        double sum = 0;
        for (double value:salary) {
            sum += value;
        }
        return sum;
    }

    }
