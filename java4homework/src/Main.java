import java.util.Scanner;

public class Main {

    // Задание 1: Вывести надпись на разных строках
    public static void printFallMessage() {
        System.out.println("Fall");
        System.out.println("seven");
        System.out.println("times");
        System.out.println("and");
        System.out.println("stand");
        System.out.println("up");
        System.out.println("eight");
    }

    // Задание 2: Вывести цитату на разных строках
    public static void printQuote() {
        System.out.println("\"Your time is limited, so don’t waste it living someone else’s life\"");
        System.out.println("Steve Jobs");
    }

    // Задание 3: Вычислить сумму, разницу и произведение двух чисел
    public static void calculateOperations() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        System.out.println("Сумма: " + sum);
        System.out.println("Разница: " + difference);
        System.out.println("Произведение: " + product);
    }

    // Задание 4: Посчитать процент от значения
    public static void calculatePercentage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение: ");
        double value = scanner.nextDouble();
        System.out.print("Введите процент: ");
        double percent = scanner.nextDouble();

        double result = (value * percent) / 100;
        System.out.println(percent + "% от " + value + " = " + result);
    }

    // Задание 5: Вычислить площадь квадрата
    public static void calculateSquareArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер стороны квадрата: ");
        double side = scanner.nextDouble();

        double area = side * side;
        System.out.println("Площадь квадрата = " + area);
    }

    public static void main(String[] args) {
        // Выполнение всех заданий
        printFallMessage();
        System.out.println(); // Пустая строка между заданиями
        printQuote();
        System.out.println(); // Пустая строка между заданиями
        calculateOperations();
        System.out.println(); // Пустая строка между заданиями
        calculatePercentage();
        System.out.println(); // Пустая строка между заданиями
        calculateSquareArea();
    }
}