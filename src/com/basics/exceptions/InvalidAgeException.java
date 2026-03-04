package com.basics.Exceptions;

public class InvalidAgeException extends Exception {
    InvalidAgeException(String msg){
        super(msg);
    }

}
class Main{
    static void Vote(int age)throws InvalidAgeException{
        if (age<18){
            throw new InvalidAgeException("age must be above 18.");
        }
        System.out.println("you can vote");
    }

    public static void main(String[] args) {
        try {
            Vote(12);
        }catch(InvalidAgeException e){
            System.out.println(e);//fully Qualiified class name when name of class comes with output
            System.out.println(e.getMessage());
        }
    }
}