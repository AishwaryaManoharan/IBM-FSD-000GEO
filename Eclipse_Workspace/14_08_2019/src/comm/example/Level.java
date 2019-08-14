package comm.example;

public enum Level {


	HIGH(3),
	MEDIUM(2),
	LOW(1);
	
	private int levelcode;
	
	public int getLevelcode() {
		return levelcode;
	}
	
	public void setLevelcode(int levelcode) {
		this.levelcode = levelcode;
	}
	
	
	
	private Level(int levelcode)
	{
		this.levelcode=levelcode;
	}
	
	
}

