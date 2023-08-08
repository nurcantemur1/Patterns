package Command;

public class OncekiKanal implements ICommand {

	private  Televizyon tv;
	public OncekiKanal(Televizyon t) {
		tv=t;
	}
	@Override
	public void Execute() {
		tv.oncekikanal();
		System.out.println("gecerli kanal"+ tv.gecerlikanal());
		
	}
	@Override
	public String toString() {
		return "onceki kanal";
		
	}
}
