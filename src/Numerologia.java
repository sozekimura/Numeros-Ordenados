import java.util.Arrays;
import java.util.Scanner;

public class Numerologia
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Ingrese 5 números enteros:");

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Números ordenados:");

        for (int number : numbers)
        {
            System.out.println(number);
        }
    }
}

