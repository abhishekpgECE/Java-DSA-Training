package com.basics.arrays;

public class E2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(arr[1]);
        arr[1]=400;
        System.out.println(arr[1]);//400
        //we can do this in constant time because of index
        //so - the time complexity is big 0(1)
        //accessing & updating elements in array ->TC 0(1)
        //this is because of index based access or
        //direct index mapping
        //[idx = pos - 1] ; [pos = idx + 1]
        //it is a property if arrays
        for (int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //for each loop
        for (int x: arr){
            System.out.print(x +" ");
        }
        System.out.println();
    }
}