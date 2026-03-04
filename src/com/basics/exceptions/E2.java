package com.basics.Exceptions;
//multi catch block
public class E2 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=10;
        try{
            k=i/j;
            String str="snpsu";
            System.out.println(str.charAt(9));
        }catch(ArithmeticException | StringIndexOutOfBoundsException e){
            System.out.println("ERROR");
        }
        System.out.println("the value of k is:"+k);
    }
}