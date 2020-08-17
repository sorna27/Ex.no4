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
public class euro {
    public void eu()
    {
        int e;
        double i=88.69;
        Scanner obj=new Scanner(System.in);
        System.out.println("euro to indian....");
        System.out.println("enter the value...");
        e=obj.nextInt();
        System.out.println("Rs."+(e*i));
    }
}
