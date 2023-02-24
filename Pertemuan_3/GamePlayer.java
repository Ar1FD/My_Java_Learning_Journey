public class GamePlayer {
    private double width;
    private double height;
    private int positionX;
    private int positionY;

    public GamePlayer()
    {
        width = 0;
        height = 0;
        positionX = 0;
        positionY = 0;
    }
    public GamePlayer(double newWidth, double newHeight)
    {
        width = newWidth;
        height = newHeight;
    }
    public GamePlayer(double newWidth, double newHeight, int newPositionX, int newPositionY)
    {
        width = newWidth;
        height = newHeight;
        positionX = newPositionX;
        positionY = newPositionY;
    }
    public void setDimension(double newWidth, double newHeight)
    {
        width = newWidth;
        height = newHeight;
    }
    public void setPosition(int newPositionX, int newPositionY)
    {
        positionX = newPositionX;
        positionY = newPositionY;
    }
    public double getWidth()
    {
        return width;
    }
    public double getHeight()
    {
        return height;
    }
    public int getX()
    {
        return positionX;
    }
    public int getY()
    {
        return positionY;
    }
    public void Run()
    {
        System.out.println("Player is running...");
    }
    public void Run(int incrementPositionX)
    {
        positionX = positionX + incrementPositionX;
        System.out.println("Player still running...  Current X Position is " + positionX);
    }
}   

