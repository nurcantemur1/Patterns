package State;

public class Tanimsiz implements State {
	private Program program;
	
	public Tanimsiz(Program m) {
		program=m;
	}
	
	@Override
	public void Handle() {
		System.out.println("1-kayýt ol");		
		System.out.println("2-kullanýcý giriþi");		
		System.out.println("3-yönetici giriþi");	
		
		program.SingIn();
	}

}
