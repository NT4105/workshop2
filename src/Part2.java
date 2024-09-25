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
public class Part2 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        boolean cont = false;
        do {
            try {
                String str;
                Pattern patternStr = Pattern.compile("^SE\\d{3}$"); // khởi tạo pattern
                System.out.print("Enter the string 1: ");
                str = sc.nextLine();
                Matcher matcher = patternStr.matcher(str);  //Kiểm tra chuỗi nhập có khớp với pattern không
                if (!matcher.matches()) {
                    throw new  Exception();
                }
                System.out.println("The string is: "+str);
                cont = false;
            } catch (Exception e){
                System.out.println("The string is invalid: ");
                cont = true;
            }
        } while (cont);
        sc.close();
    }
}
