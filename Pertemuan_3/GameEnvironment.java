import java.util.ArrayList;

public class GameEnvironment {
    //Properties
    private double width;
    private double height;
    private ArrayList <GamePlayer> arrPlayer = new ArrayList<GamePlayer>();
    private ArrayList <GameEnemy> arrEnemy = new ArrayList<GameEnemy>();
    
    
    public GameEnvironment()
    {
        width = 0;
        height = 0;

    }
    public GameEnvironment(double newwidth, double newheight)
    {
        newwidth = width;
        newheight = height;

    }

    public void addPlayer (GamePlayer nama) 
    {
        arrPlayer.add(nama);
    }

    public void removePlayer(GamePlayer nama)
    {
        arrPlayer.remove(nama);
    }

    public void getAllPlayers()
    {
        System.out.println("List of Players: " );
        for (int i = 0; i < arrPlayer.size(); i++)
        {
            System.out.println(i +". " + arrPlayer.get(i));
        }
    }

    public void addEnemy(GameEnemy musuh) //Isi
    {
        arrEnemy.add(musuh);

    }

    public void removeEnemy(GameEnemy musuh)
    {
        arrEnemy.remove(musuh);
    }

    public void getAllEnemies()
    {
        System.out.print("List of Enemies");
        for (int i = 0; i < arrEnemy.size(); i++)
        {
            System.out.print(i +". " + arrEnemy.get(i));
        }
        System.out.println(" ");
    }

    public int EuclideanDistance(int x1,int y1,int x2,int y2) // GET VALUE PLAYER -> GET VALUE ENEMY -> CALCULATE???
    {
    int dx = x2 - x1;
    int dy = y2 - y1;

    return (int)Math.sqrt((dx*dx) + (dy*dy));

    }

    public void Interaction()
    {
        if(arrPlayer == null || arrEnemy == null)
        {
            System.out.println("Player or Enemy hasn't been set yet!");
        }

        for(int i=0; i<arrPlayer.size(); i++)
        {
            for(int j=0; i<arrPlayer.size(); i++)
            {
                if(arrPlayer.get(i).getY() != arrEnemy.get(j).getY())
                {
                    System.out.println("Player: " + arrPlayer.get(i) + " and Enemy: " + arrEnemy.get(j) +
                    " not in the same Y position");
                }

                if (EuclideanDistance(arrPlayer.get(i).getX(),arrPlayer.get(i).getY(),arrEnemy.get(j).getX(),arrEnemy.get(j).getY()) < 2)
                {
                    System.out.println("Player: " + arrPlayer.get(i) + " Attacked");
                    System.out.println("Enemy: " + arrEnemy.get(j) + " loses");
                    removeEnemy(arrEnemy.get(j));
                }
                else
                {
                    System.out.println("==> Player "+arrPlayer.get(i));
                    arrPlayer.get(i).Run((int)Math.ceil(Math.random()*10));
                    System.out.println("current x position = " + arrPlayer.get(i).getX() +" <==");
                }
            }
        }
    }

    
}