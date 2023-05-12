import java.util.HashMap;

public class Board {
	int success;
	int size;
	HashMap<Integer,Integer> snakes = new HashMap<Integer,Integer>();
	HashMap<Integer,Integer> ladders = new HashMap<Integer,Integer>();
	
	public Board(int s) {
		// TODO Auto-generated constructor stub
		this.success = s*s;
		this.size = s*s;
	}

	public void addEntity(Entity entity) {
		if(entity.start > entity.end) {
			snakes.put(entity.start, entity.end);
		}else {
			ladders.put(entity.start, entity.end);
		}
	}
	

}
