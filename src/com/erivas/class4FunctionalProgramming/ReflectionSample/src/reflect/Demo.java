package reflect;
public class Demo implements Cloneable {

	public int i1 = 1;

	public String s2;
	
	public Demo(int i1, String s2) {
		this.setI1(i1);
		this.setS2(s2);
	}
	
	public int getI1() {
		return i1;
	}

	public String getS2() throws Throwable {
		return s2;
	}

	public void setI1(int i1) {
		this.i1 = i1;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}

}
