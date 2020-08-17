/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package convet1;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class dollar {
    public void d2()
    {
    int i1;
    double d1=0.013;
    Scanner obj=new Scanner(System.in);
    System.out.println("indian rupees to dollar...");
    System.out.println("enter the value...");
    i1=obj.nextInt();
    System.out.println("$"+(i1*d1));
    }
    
}
