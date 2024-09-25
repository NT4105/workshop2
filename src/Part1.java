/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Part1 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        boolean cont = false;
        do {
            try {
                int n;
                System.out.print("Enter the number: ");
                n = sc.nextInt();
                if (n < 1)
                    throw new Exception();
                System.out.println("The number is : "+n);
                cont = false;
            } catch (Exception e){
                System.out.println("The number is invalid");
                cont = true;
            }
        }while (cont);
        sc.close();
    }
}
