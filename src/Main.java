import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = input.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = input.nextInt();

        int result = 0;

        boolean isNegative = (num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0);   // Определение знака результата

        num1 = Math.abs(num1);                 // Преобразование чисел в положительные для упрощения умножения
        num2 = Math.abs(num2);

        for (int i = 0; i < num2; i++) {
            result += num1;
        }

        if (isNegative) {                   // Если одно из чисел было отрицательным, меняем знак результата
            result = -result;
        }

        System.out.println("Результат умножения: " + result);

        input.close();
    }
}

