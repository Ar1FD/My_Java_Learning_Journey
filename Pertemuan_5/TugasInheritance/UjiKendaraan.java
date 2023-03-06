public class UjiKendaraan 
{
    public static void main(String[] a){
        Vehicle Rubicon = new Vehicle();
        Rubicon.goStraight();
        Rubicon.turnLeft();
        Rubicon.turnRight();
        System.out.println(Rubicon.color);
        System.out.println(Rubicon.speed);

        System.out.println(" ");

        MotorVehicle KLX = new MotorVehicle();
        KLX.goStraight();
        KLX.turnLeft();
        KLX.turnRight();
        System.out.println(KLX.getSizeofEngine());
        System.out.println(KLX.getlicensePlate());

        System.out.println(" ");

        Bicycle Wimcycle = new Bicycle();
        System.out.println(Wimcycle);
        Wimcycle.goStraight();
        Wimcycle.turnLeft();
        Wimcycle.turnRight();
        Wimcycle.ringBell();

        System.out.println(" ");

        MotorVehicle m1 = new MotorVehicle(5,"Ferrari");
        System.out.println(m1.getSizeofEngine());
        System.out.println(m1.getlicensePlate());

        System.out.println(" ");

        Bicycle Threecycle = new Bicycle();
        System.out.println(Threecycle);
        System.out.println(Threecycle.color);
        System.out.println(Threecycle.speed);
        Threecycle.speed = 200;
        Threecycle.color = "Hijau";
        Threecycle.ganti_model();

        System.out.println(" ");


    }
}