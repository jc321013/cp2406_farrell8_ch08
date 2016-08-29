/**
 * Created by jc321013 on 29/08/16.
 */import java.util.Scanner;
public class DistanceFromAverage
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[20];
        double entry;
        double total = 0;
        double average;
        final int STOP = 99999;
        int i = 0, y;

        System.out.print("Enter value or " +
                STOP + " when you want to stop: ");
        entry = input.nextDouble();

        while(entry != STOP && i < numbers.length)
        {
            numbers[i] = entry;
            total += numbers[i];
            ++i;
            if(i < numbers.length)
            {
                System.out.print("Enter next value or " +
                        STOP + " when you want to stop: ");
                entry = input.nextDouble();
            }
        }

            average = total / i;
            System.out.println("You entered " + i +
                    " numbers and their average is " + average);
            for(y = 0; y < i; ++y)
                System.out.println(numbers[y] + " is " +
                        (numbers[y] - average) + " away from the average");
        }
    }

