package Command;

public class Lamba {
	private int lamba;
	public Lamba() {
		lamba=0;
	}
	public void lambaAc() {
		System.out.println("lamba ac�ld�");
		lamba =1;
	}
	public void lambaKapat() {
		System.out.println("lamba kapand�");
		lamba =0;
	}
	public int lambaValue() {return lamba;}

}
