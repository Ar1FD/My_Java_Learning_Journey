public class Vehicle {
    protected double speed;
    protected String color;

    public Vehicle()
    {
        speed = 0;
        color = "orange";
    }
    
    public void goStraight()
    {
        System.out.println("Maju..");
    }

    public void turnLeft()
    {
        System.out.println("Belok Kiri");
    }

    public void turnRight()
    {
        System.out.println("Belok Kanan");
    }
}
