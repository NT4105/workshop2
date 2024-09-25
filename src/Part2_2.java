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
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Part2_2 {
    public String inputString() throws Exception{
        Scanner sc = new Scanner (System.in);
        String str;
        Pattern patternStr = Pattern.compile("^SE\\d{3}$");
        System.out.print("Enter the string: ");
        str = sc.nextLine();
        Matcher matcher = patternStr.matcher(str);
        sc.close();
        if (!matcher.matches()){
            throw new Exception();
        }
        return str;
    }
    public static void main(String[] args){
        Part2_2 obj = new Part2_2();
        boolean cont = false;
        do {
            try {
                String str = obj.inputString();
                System.out.println("The String is: "+str);
                cont = false;
            } catch (Exception e) {
                System.out.println("The string is invalid");
                cont = true;
            }
        } while (cont);
    }
}
