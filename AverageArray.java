/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averagearray;

import java.util.Scanner;

/**
 *
 * @author sa
 */
public class AverageArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double[] arr = new double[10];
        System.out.println("Enter 10 double values");
        for (int i = 0; i < 10; i++) {
           arr[i]=scan.nextInt();
           
        }
        double m = average(arr);
        
    }
    
    public static int average(int[] array){
        int total=0;
        int average;
        for (int i = 0; i < array.length; i++) {
            total +=array[i];
        }
        System.out.println("the total is "+ total);
        average=total/array.length;
        System.out.println("the average is "+ average);
        
        return average;
    }
    
    public static double average(double[] array){
        
        double total=0;
        double average;
        for (int i = 0; i < array.length; i++) {
            total +=array[i];
        }
        System.out.println("the total is "+ total);
        average=total/array.length;
        System.out.println("the average is "+ average);
        
        return average;
        
    }
    
}
