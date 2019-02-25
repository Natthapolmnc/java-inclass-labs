
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usci
 */
public class ZellerTest {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter year (e.g., 2012): ");
        int year=input.nextInt();
        System.out.println("Enter month (1-12): ");
        int month=input.nextInt();
        System.out.println("Enter day of the month (1-31):");
        int DoM=input.nextInt();
        Zeller object=new Zeller(DoM,month,year);
        System.out.println("Day of the week is "+object.getDayofweek());
        input.close();
    }
}
