package State;

public class Program {
	private State s;
	
	public Program() {
		s= new Tanimsiz(this);
	}
	public void calis() {
		s.Handle();
	}
	public void SingIn() {
		s= new Kullanici(this);
		calis();
	}
	public void Yonetici() {
		s= new Yonetici(this);
		calis();
	}
	public void exit() {
		s = new Tanimsiz(this);
	}
}
