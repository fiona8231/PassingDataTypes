package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double d = 2.0;
        changeMe(d);
        System.out.println("d =" + d);

        Car lambor = new Car();
        lambor.setSpeed(65.0);

        changeCarParameters(lambor);
        System.out.println("The speed =" + lambor.getSpeed());

        changeCar(lambor);
        System.out.println("The speed =" + lambor.getSpeed());

    }

    public static void changeMe(double d){
        //this has no effect on d outside of this method!!
        d = 345.0;
    }

    public static void changeCarParameters(Car c){
        //change the speed of the car outside this method!
        c.setSpeed(200.0);


    }

    public static void changeCar(Car c){
        Car ford = new Car();
        ford.setSpeed(75.0);
        // does not affect car outside this method!
        c = ford;

    }


}
