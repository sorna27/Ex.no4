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
public class yen {
    public void y()
    {
        int y;
        double i=0.70f;
        Scanner obj=new Scanner(System.in);
        System.out.println("yen to indian....");
        System.out.println("enter the value...");
        y=obj.nextInt();
        System.out.println("Rs."+(y*i));
    }
}
