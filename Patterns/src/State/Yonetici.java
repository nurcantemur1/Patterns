package State;

public class Yonetici implements State {

	private Program program;
	public Yonetici(Program m) {
		program =m;
	}
	@Override
	public void Handle() {
		System.out.println("1-kullanýcý ekle");		
		System.out.println("2-kullanýcý guncelle");		
		System.out.println("3-kullanýcý sil");		
		System.out.println("4-çýkýþ");		
		
		program.exit();
	}
}
