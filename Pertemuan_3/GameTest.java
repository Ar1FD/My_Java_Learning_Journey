public class GameTest {
    public static void main(String[] args)
    {
        GamePlayer GamePlayer1 = new GamePlayer();
        GamePlayer1.setDimension(100, 100);
        GamePlayer1.setPosition(70, 25);
        GamePlayer1.getWidth();
		System.out.println(GamePlayer1.getWidth());
        GamePlayer1.getHeight();
		System.out.println(GamePlayer1.getHeight());
        GamePlayer1.Run(30);
		
		GameEnemy GameEnemy1 = new GameEnemy();
		GameEnemy1.Run();
    }
}
