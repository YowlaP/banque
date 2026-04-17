package structures;

public class IntegerContainer {
	private int val;
	public IntegerContainer(int val) {
		this.val = val;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val=val;
	}
	public String toString() {
		return String.valueOf(val);
	}
}
