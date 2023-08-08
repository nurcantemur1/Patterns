package Command;

public class Lamba {
	private int lamba;
	public Lamba() {
		lamba=0;
	}
	public void lambaAc() {
		System.out.println("lamba acýldý");
		lamba =1;
	}
	public void lambaKapat() {
		System.out.println("lamba kapandý");
		lamba =0;
	}
	public int lambaValue() {return lamba;}

}
