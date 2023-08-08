package Command;

public class SonrakiKanal implements ICommand {

	private  Televizyon tv;
	public SonrakiKanal(Televizyon t) {
		tv=t;
	}
	@Override
	public void Execute() {
		tv.sonrakikanal();
		System.out.println("gecerli kanal"+ tv.gecerlikanal());
		
	}
	@Override
	public String toString() {
		return "Sonraki kanal";
		
	}
}