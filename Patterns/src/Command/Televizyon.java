package Command;

public class Televizyon {
	private int kanal;
	public Televizyon() {
		kanal=0;
	}
	public void kanaldegistir(int k) {
		kanal =k;
	}
	public void sonrakikanal() {
		kanal++;
	}
	public void oncekikanal() {
		kanal--;
	}
	public int gecerlikanal() {return kanal;}

}