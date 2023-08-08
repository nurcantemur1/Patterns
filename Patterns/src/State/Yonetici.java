package State;

public class Yonetici implements State {

	private Program program;
	public Yonetici(Program m) {
		program =m;
	}
	@Override
	public void Handle() {
		System.out.println("1-kullan�c� ekle");		
		System.out.println("2-kullan�c� guncelle");		
		System.out.println("3-kullan�c� sil");		
		System.out.println("4-��k��");		
		
		program.exit();
	}
}
