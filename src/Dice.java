import java.util.Random;

public class Dice {
	int sides;
	public Dice(int i) {
		this.sides = i;
	}

	public int rolls() {
		// TODO Auto-generated method stub
		Random random = new Random();
		int ret = random.nextInt((sides) + 1);
		return ret;
	}

}
