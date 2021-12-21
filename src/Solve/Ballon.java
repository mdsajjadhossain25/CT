package Solve;

public class Ballon {
    private double radius;
    public Ballon(double radius){
        this.radius = radius;
    }
    public void inflate(double amount){
        radius += amount;
    }
    public double getVolume(){
        double pie = Math.PI;
        double volume = 4/3 * pie * radius * radius * radius;
        return volume;
    }

    public static void main(String[] args) {
        Ballon bl = new Ballon(2.5);
        double result = bl.getVolume();
        System.out.println("The volume of the ballon: "+result);
        bl.inflate(3.5);
        System.out.println("The volume after calling inflate method: "+bl.getVolume());
    }
}
