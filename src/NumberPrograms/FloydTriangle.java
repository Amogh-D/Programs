package NumberPrograms;

import java.util.Scanner;
public class FloydTriangle
{
    public static void main(String args[])
    {
        int rows, number = 1, counter, j;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter # of Rows:");
        rows = input.nextInt();
        for ( counter = 1 ; counter <= rows ; counter++ )
        {
            for ( j = 1 ; j <= counter ; j++ )
            {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}