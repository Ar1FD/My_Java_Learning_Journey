public class Bicycle extends Vehicle 
{
    public Bicycle()
    {
        super.speed = 10;
        super.color = "Kuning";
    }

    public void ringBell()
    {
        System.out.println("kring..kring..");
    }

    void ganti_model()
    {
        System.out.println("kecepatannya Jadi " + speed);
        System.out.println("Warnanya Jadi " + color);
        
    }
}
