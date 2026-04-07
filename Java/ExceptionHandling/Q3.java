package ExceptionHandling;

import java.util.Scanner;

public class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            int result = a/b;
            System.out.println("Result : " + result);
        }catch(ArithmeticException e){
            System.out.println("Can divide with zero");
        }
    }
}