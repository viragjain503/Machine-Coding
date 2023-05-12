import java.util.Arrays;

public class Game {
	Board board;
	Dice dice; 
	int winner;
	
	public Game(Board board, Dice dice) {
		this.board = board;
		this.dice = dice;
	}

	public void play(int noofplayers) {
		int[] currPosititon = new int[noofplayers];
		Arrays.fill(currPosititon, 0);

		while(true) {
			for(int i=0;i<noofplayers;i++) {

				int diceNumber = dice.rolls();		
				int position  = currPosititon[i] + diceNumber;
				
				System.out.println("Player no: "+ i);
				System.out.println(" CurrPosition: " + currPosititon[i]);
				System.out.println(" DiceNumber: " + diceNumber);
	
				if(position == board.success) {
					this.winner = i;
					return;
				}else if(position > board.success) {
					continue;
				}else {
					if(board.snakes.containsKey(position)) {
						System.out.println("Oh No Snake Bite");
						currPosititon[i] = board.snakes.get(position);
					}else if(board.ladders.containsKey(position)) {
						System.out.println("Oh yes Ladder");
						currPosititon[i] = board.ladders.get(position);						
					}else {
						currPosititon[i] = position;
					}
				}
				System.out.println("Final Position: " + currPosititon[i]);
			}
		}
	}

}
