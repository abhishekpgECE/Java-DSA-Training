package com.basics.arrays;
class Equipment {
    String name;
    int Equipment_id;
    String Lab;
    double voltage;
    Boolean working;
    public Equipment(String name, int Equipment_id, String Lab, double voltage, Boolean working){
        this.name=name;
        this.Equipment_id=Equipment_id;
        this.Lab=Lab;
        this.voltage=voltage;
        this.working=working;

    }

}

public class E9 {
    public static void main(String[] args) {
        Equipment[] Equiment = new Equipment[]{
                new Equipment("fshjv", 890, "DSP", 90.0, true),
                new Equipment("dmwd", 789, "dsdv", 89.09, false),
                new Equipment("RTAAA", 89, "electrical", 89.89, false)
        };

        for (Equipment equiments:Equiment){
            System.out.println(equiments.name+""+equiments.Equipment_id+" "+equiments.Lab+" "+equiments.voltage+" "+equiments.working);

        }
        System.out.println();

    }
}