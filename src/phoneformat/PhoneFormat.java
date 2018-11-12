/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phoneformat;

import java.util.Scanner;

public class PhoneFormat
{

    public static void main(String[] args) 
    {
       String num;
       String fNum;
       int loopcount = 1;
       char x = 0;
       
       Scanner input = new Scanner(System.in);
      
       while(loopcount <= 1)
       {
       System.out.print("Please Enter Phone Number > ");
       num = input.nextLine();
       
       if(num.charAt(x) == 999)
       {
           System.out.println("End");
           loopcount--;
       }
       
       fNum = "(" + num.substring(0,3) + ")" + num.substring(3,6) + "-" +
            num.substring(6,10);
       
       System.out.println(fNum);
       }
    }
    
}
