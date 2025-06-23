
import calculator.CalculatorServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
//public static void tackTwoNumbers(){
//    Scanner input=new Scanner(System.in);
//    System.out.println();
//
//}
    public static void main(String[] args) {

        CalculatorServiceImpl calculate=new CalculatorServiceImpl();
        System.out.println("*****  Welcome to Calculator  *****");
Scanner input=new Scanner(System.in);
boolean running=true;
while(running){
    System.out.println("Press 1 for Addion ");
    System.out.println("Press 2 for subtraction");
    System.out.println("Press 3 for multiplication");
    System.out.println("Press 4 for division");
    System.out.println("Press 5 for exit");
    System.out.print("Enter You'r choice ->");
    int choice=input.nextInt();
    int a,b;
    switch(choice){
        case 1->{
            System.out.println("Enter how many number of sum");
            int size=0;
           size= input.nextInt();
            double arr[] =new double[size];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter " + i + "value");
                arr[i]=input.nextDouble();
            }
            System.out.println(calculate.addition(arr));
            break;
        }
        case 2->{
            System.out.print("Enter first number: ");
             a = input.nextInt();
            System.out.print("Enter second number: ");
             b = input.nextInt();
            System.out.println("Result: " + calculate.subtraction(a, b));
            break;
        }
        case 3->{
            System.out.print("Enter first number: ");
             a = input.nextInt();
            System.out.print("Enter second number: ");
             b = input.nextInt();
            System.out.println("Result: " + calculate.multiplication(a,b));
            break;
        }
        case 4->{
            System.out.print("Enter numerator: ");
            a = input.nextInt();
            System.out.print("Enter denominator: ");
            b = input.nextInt();
            System.out.println("Result: " + calculate.division(a, b));
            break;
        }
        case 5->{
            System.out.println(choice);
            running=false;
            System.out.print("Thank you");
            try{
                for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);
                System.out.print(".");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            continue;
        }
        default -> {
            System.out.println("Please Select valid option!");
        }
    }

}
    }
}
