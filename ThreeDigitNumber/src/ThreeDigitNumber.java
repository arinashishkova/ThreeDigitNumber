import java.util.Scanner;

public class ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод трехзначного числа
        System.out.println("Введите трехзначное число: ");
        int number = scanner.nextInt();

        // Получаем цифры числа
        int hundreds = number / 100; // Количество сотен
        int tens = (number / 10) % 10; // Количество десятков
        int units = number % 10; // Количество единиц

        // Сумма цифр
        int sumOfDigits = hundreds + tens + units;

        // Вывод результатов
        System.out.println("Количество сотен: " + hundreds);
        System.out.println("Количество десятков: " + tens);
        System.out.println("Количество единиц: " + units);
        System.out.println("Сумма цифр: " + sumOfDigits);
    }
}