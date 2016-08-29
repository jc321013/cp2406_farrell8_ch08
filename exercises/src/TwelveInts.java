/**
 * Created by jc321013 on 29/08/16.
 */
public class TwelveInts
{
    public static void main (String args[])
    {
        int[] listOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int x;
        for (x = 0; x < listOfNumbers.length; x++)
            System.out.print(listOfNumbers[x] + "  ");
        System.out.println(x);
        for (x = listOfNumbers.length - 1; x >= 0; x--)
            System.out.print("" + listOfNumbers[x] + "  ");
        System.out.println(x);
    }
}
