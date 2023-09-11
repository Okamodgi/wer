import java.util.Scanner;

public class rtt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = input.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = input.nextInt();

        int result = multiplyWithoutMultiplyOperator(num1, num2);

        System.out.println("Результат умножения: " + result);

        input.close();
    }

    public static int multiplyWithoutMultiplyOperator(int num1, int num2) {
        int result = 0;

        for (int i = 0; i < Math.abs(num2); i++) {
            result += Math.abs(num1);
        }

        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
            result = -result;
        }

        return result;
    }
}
