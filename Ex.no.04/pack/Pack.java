/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pack;
import newpackage.*;

/**
 *
 * @author asus
 */
public class Pack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("calling package 1:");
        NewClass obj=new NewClass();
        obj.s();
        System.out.println("calling package 2:");
        newpackage1.NewClass1 o3=new newpackage1.NewClass1();
        o3.s3();
        System.out.println("calling the sub-package 1:");
        newpackage.newpackage1.subpack o=new newpackage.newpackage1.subpack();
        o.s2();
        
    }
    
}
