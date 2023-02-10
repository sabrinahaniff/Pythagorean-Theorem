/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagoreantheorem;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author sabrinahaniff
 */
public class formula
{

    public static void main(String[] args)
    {
        Scanner src = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        //declaring variables
        double a, b, c;

        int choice;

        //if user picks an invalid choice, the program will loop again until the user picks a valid choice
        boolean tryAgain = true;

        while (tryAgain)
        {
            System.out.println("Pythagorean Theorem Calculation");
            System.out.println("\n");
            System.out.println("Formula: a^2 + b^2 = c^2");
            System.out.println("\n");

            System.out.println("Please pick a choice");
            System.out.println("\n");
            System.out.println("Calculation of: ");
            System.out.println("1. c^2 = a^2 + b^2      2. b^2 = a^2 + c^2      3. a^2 = b^2 + c^2");
            choice = src.nextInt();

            switch (choice)
            {
                case 1:

                    System.out.println("Please enter the value of a: ");
                    a = src.nextDouble();

                    System.out.println("Please enter the value of b:");
                    b = src.nextDouble();
                    
                    double answer = pythagorean(a, b, -1, 1);

                    System.out.println(df.format(a) + "^2" + " + " + df.format(b) + "^2" + " = " + df.format(answer));
                    System.out.println("c = " + df.format(answer));
                    tryAgain = false;

                    break;

                case 2:

                    System.out.println("Please enter the value of a: ");
                    a = src.nextDouble();

                    System.out.println("Please enter the value of c:");
                    c = src.nextDouble();
                    
                    answer = pythagorean(a, -1, c, 2);

                    System.out.println(df.format(a) + "^2" + " + " + df.format(c) + "^2" + " = " + df.format(answer));
                    System.out.println("b = " + df.format(answer));
                    tryAgain = false;

                    break;

                case 3:

                    System.out.println("Please enter the value of b: ");
                    b = src.nextDouble();

                    System.out.println("Please enter the value of c:");
                    c = src.nextDouble();

                    answer = pythagorean(-1, b, c, 3);
                    
                    System.out.println(df.format(b) + "^2" + " + " + df.format(c) + "^2" + " = " + df.format(answer));
                    System.out.println("a = " + df.format(answer));
                    tryAgain = false;

                    break;

                default:
                    System.out.println("Stop trying to break my code, try again!");
                    System.out.println("\n");

                    tryAgain = true;

                    break;
            }
          src.close();
        }

    }

    public static double pythagorean(double a, double b, double c, int choice)
    {
        double answer = -1;
        switch(choice)
        {
            case 1:
                answer = Math.sqrt((a * a) + (b * b));
                break;
                
            case 2:  //find b
                answer = Math.sqrt((a * a) + (c * c));
                break;
                
            case 3: //find a
                answer = Math.sqrt((b * b) + (c * c));
                break;     
        }
        
        return answer;   
    }

   
}
