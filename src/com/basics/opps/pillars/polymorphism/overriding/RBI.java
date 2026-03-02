package com.basics.opps.pillars.polymorphism.overriding;
public class RBI {
    double rateOfInterest(){
        return 6.8;
    }
}
class HDFC extends RBI{
    @Override
    double rateOfInterest(){
        return 7.2;
    }
}
class ICICI extends RBI{
    @Override
    double rateOfInterest(){
        return 7.5;
    }
}
class Canara extends RBI{
    @Override
    double rateOfInterest(){
        return 7.9;
    }
    public static void main(String[] args) {
        // Upcasting ->Parent obj = new child();
        RBI rbi = new RBI();
        HDFC hdfc = new HDFC();
        ICICI icici = new ICICI();
        Canara canara = new Canara();
        System.out.println("The ROI of RBI is: " + rbi.rateOfInterest()+ " is " +"%");
        System.out.println("The ROI of ICICI is: " + icici.rateOfInterest()+ " is " +"%");
        System.out.println("The ROI of HDFC is: " + hdfc.rateOfInterest()+ " is " +"%");
        System.out.println("The ROI of CANARA is: " + canara.rateOfInterest()+ " is " +"%");
    }
}