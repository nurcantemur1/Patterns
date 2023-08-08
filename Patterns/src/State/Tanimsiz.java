package State;

public class Tanimsiz implements State {
	private Program program;
	
	public Tanimsiz(Program m) {
		program=m;
	}
	
	@Override
	public void Handle() {
		System.out.println("1-kay�t ol");		
		System.out.println("2-kullan�c� giri�i");		
		System.out.println("3-y�netici giri�i");	
		
		program.SingIn();
	}

}
