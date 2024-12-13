package model;

import exceptions.InvalidAgeException;

import java.util.Scanner;

public class Student {

    public void enterAge(){
        try (Scanner input = new Scanner(System.in)){
            System.out.println("Enter student age: ");
            int age = input.nextInt();
            checkAge(age);
        }catch (InvalidAgeException e){
           System.out.println("Exception caught:  " + e.getMessage());
        }

    }

    public void checkAge(int age)throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age must be 18 or older."); //// Throw the custom exception and pass custom message InvalidAgeException constructor

        }
        System.out.println("Age is valid");
    }

}
