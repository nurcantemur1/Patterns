package State;

public class Kullanici  implements State {

	private Program program;
	public Kullanici(Program m) {
		program =m;
	}
	@Override
	public void Handle() {
		System.out.println("1-kullan�c� ayarlar�");		
		System.out.println("2- Hizmet 1");		
		System.out.println("3- hizmet 2");		
		System.out.println("4-��k��");		
		
		program.exit();
	}
}
