/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package convet;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class doller {
    public void d()
    {
        int d;
        double i=74.83;
        Scanner obj=new Scanner(System.in);
        System.out.println("dollar to indian....");
        System.out.println("enter the value...");
        d=obj.nextInt();
        System.out.println("Rs."+(d*i));
    }
}
