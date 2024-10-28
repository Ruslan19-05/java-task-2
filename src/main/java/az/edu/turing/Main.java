package az.edu.turing;

import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter is name :");
        int number = scanner.nextInt();
        System.out.println("Number is :" +number);
        System.out.print("Answer:");
        System.out.print( number%2==0 && true || false);
    }
}