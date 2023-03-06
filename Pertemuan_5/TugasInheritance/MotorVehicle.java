public class MotorVehicle extends Vehicle
{
    protected int sizeofEngine;
    protected String licensePlate;

    public MotorVehicle()
    {
        sizeofEngine = 500;
        licensePlate = "4r1 F4rh4nsy4ch D.";
    }

    public MotorVehicle(int sizeEng, String LiPlate)
    {
        sizeofEngine = sizeEng;
        licensePlate = LiPlate;
    }

    public int getSizeofEngine() {
        return sizeofEngine;
    }

    public String getlicensePlate() {
        return licensePlate;
    }
}
