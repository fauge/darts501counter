package fa.darts.data;

public class Player {

	private String name;
	private int score;

	public Player(String name) {
		this.name = name;
		this.score = 501;
	}

	public void updateScore(int result) {
		score -= result;
	}

	public boolean isUpdatePossible(int result) {
		if (score - result >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + "]";
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

}
