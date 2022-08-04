public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2000;
        printingTheLeapYearResult(year);

        System.out.println("Задание 2");
        String osName = "iOS";
        int clientDeviceYear = 2021;
        printingTheSelectedOs(osName,clientDeviceYear);

        System.out.println("Задание 3");
        int deliveryDistance = 95;
        calculationOfDeliveryDays (deliveryDistance);

    }
    //### Задание 1
//Реализуйте метод, который получает в качестве параметра год, а затем проверяет, является ли он високосным, и выводит результат в консоль. 
//*Эту проверку вы уже реализовывали в задании по условным операторам.*
//Теперь проверку нужно обернуть в метод и использовать год, который приходит в виде параметра.
//Результат программы выведите в консоль. Если год високосный, то должно быть выведено “*номер года —* високосный год”.
// Если год не високосный, то, соответственно: “*номер года —* не **високосный год”.
    public static boolean checkingTheYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0);
    }

    public static void printingTheLeapYearResult(int year) {
        boolean theResultOfComparingYears = checkingTheYear(year);
        if (theResultOfComparingYears) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год ");
        }
    }
//### Задание 2
//Вспомним задание 2 по условным операторам, где нам необходимо было предложить пользователю облегченную версию приложения.
//Напишите метод, куда подаются два параметра: тип операционной системы (ОС) ( 0 — iOS или 1 — Android ) и год выпуска устройства.
//Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию).
//В результате программа должна выводить в консоль в зависимости от исходных данных,

// какую версию приложения (обычную или lite) и для какой ОС (Android или iOS) нужно установить пользователю.

    public static int getClientOs(String osName) {                                // узнать клиентскую OS
        if (osName.equalsIgnoreCase("ios")) {
            return 0;                                    // iOS
        } else if (osName.equalsIgnoreCase("android")) {
            return 1;                                   //Android
        } else return 2;
    }
    public static boolean compareReleaseDate(int clientDeviceYear) {                //сравнить дату выпуска с текущей
        int currentYear = 2022;
        if (clientDeviceYear >= currentYear) {
            return true;
        } else
            return false;
    }
    public static void printingTheSelectedOs(String osName, int clientDeviceYear) {
        int getClientOs = getClientOs(osName);
        boolean compareReleaseDate = compareReleaseDate(clientDeviceYear);
        if ((getClientOs == 0) && (compareReleaseDate == true)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if ((getClientOs == 0) && (compareReleaseDate == false)) {
            System.out.println("Установите версию приложения для iOS облегченной версии по ссылке");
        } else if ((getClientOs == 1) && (compareReleaseDate == true)) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if ((getClientOs == 1) && (compareReleaseDate == false)) {
            System.out.println("Установите версию приложения для Android облегченной версии по ссылке");
        } else if (getClientOs == 2) {
            System.out.println("Данная версия ОС не поддерживается");
        }
    }
/*
    Задание 3
    Возвращаемся к любимой многими задаче на расчет дней доставки банковской карты от банка.
    Наша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.
*/
    public static int distanceComparison(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        } else return 4;

    }
    public static  void calculationOfDeliveryDays (int deliveryDistance) {
        int  distanceComparison = distanceComparison(deliveryDistance);
        if (distanceComparison == 1) {
            System.out.println("Потребуется дней " + 1);
        } else if (distanceComparison == 2) {
            System.out.println("Потребуется дней " + 2);
        } else if (distanceComparison == 3) {
            System.out.println("Потребуется дней " + 3);
        } else if (distanceComparison == 4) {
            System.out.println("Срок поставки составит более 3 дней");
        }
    }

}

























