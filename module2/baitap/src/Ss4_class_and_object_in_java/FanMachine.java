package Ss4_class_and_object_in_java;

public class FanMachine {
    private final int FAST = 3;
    private final int MEDIUM = 2;
    private final int SLOW = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";
    long speed = this.SLOW;

    //constructor
    public FanMachine(boolean on, double radius, String color, long speed) {
        this.on = on;
        this.radius = radius;
        this.color = color;
        this.speed = speed;
    }


    
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(long speed) {
        speed = speed;
    }

    @Override
    public String toString() {
        String fanStatus="";
        if (this.isOn()) {
           fanStatus+= ("fan is on "+ "\nSpeed: "+ this.speed);
        } else {
            fanStatus += ("Fan is off");
        }
        fanStatus += ("\nColor: " + this.color+"\nRadius: " + this.radius);
        return fanStatus;
    }

    public static void main(String[] args) {
        FanMachine fanMachine1 = new FanMachine(true, 10, "yellow", 3);
        FanMachine fanMachine2 = new FanMachine(false,5, "blue",1);
        System.out.println(fanMachine1.toString());
        System.out.println(fanMachine2.toString());

    }

}
