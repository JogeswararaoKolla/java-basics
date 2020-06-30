package com.training.accessmodifiers;

// By default visible to package level
// private visible to class only (private)
// public visible to world (public)
// visible to package  and sub classes.(protected)

// Top level classes
// cannot be protected or private
// only public or default
class Base{

}

interface I1 {

}

interface I2 {

}
public class Bicycle extends Base implements  I1,I2 {
    //Field Declarations
    private int cadence;
    private int gear;
    private int speed;

    //Constructors
    public Bicycle(int startCadence, int startGear, int startSpeed) {
        this.cadence = startCadence;
        this.gear = startGear;
        this.speed = startSpeed;
    }

    //Methods
    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public int getCadence() {
        return this.cadence;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getGear() {
        return this.gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }
}
