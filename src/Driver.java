import java.util.Scanner;

/*
 1) Multiplayer game of n players..
 2) Customizable board size n*n
 3) Start and Endpoint of Snakes and Ladder should not collide.
 4) A customizable dice(from 1 to n ) should produce random number..
5) Should be a runnable code..
 */

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Entity snake1 = new Snake(10,5);
		Entity snake2 = new Snake(20,15);
		Entity snake3 = new Snake(21,16);
		Entity snake4 = new Snake(80,27);
		
		Entity ladder1 = new Ladder(12,30);
		Entity ladder2 = new Ladder(35,95);
		Entity ladder3 = new Ladder(40,81);
		Entity ladder4 = new Ladder(45,65);
		
		Board board = new Board(10);
		
		board.addEntity(snake1);
		board.addEntity(snake2);
		board.addEntity(snake3);
		board.addEntity(snake4);
		
		board.addEntity(ladder1);
		board.addEntity(ladder2);
		board.addEntity(ladder3);
		board.addEntity(ladder4);
		
		Dice dice = new Dice(6);
		
		Scanner sc = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter no of players: ");
	    int noofplayers = sc.nextInt();
	    
	    GameStatus status = GameStatus.notstarted;
	    
		Game game = new Game(board,dice);
		game.play(noofplayers);
		System.out.println("The winner of the game is: " + game.winner);
	}

}
