package comm.example;

public class Line extends Model {
	
	private int start;
	private int end;

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
	
	public int calculateLength()
	{
		return getEnd()-getStart();
	}

	public Line(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public boolean isGreater(Object obj1, Object obj2) {
		Line l1=(Line)obj1;
		Line l2=(Line)obj2;
		return l1.calculateLength()>l2.calculateLength();
	}

}
