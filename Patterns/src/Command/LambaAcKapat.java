package Command;

public class LambaAcKapat implements ICommand{
	Lamba lamba;
	public LambaAcKapat(Lamba l){
		lamba=l;
	}
	@Override
	public void Execute() {
		if (lamba.lambaValue()==1) {
			lamba.lambaKapat();
		}
		else {
			lamba.lambaAc();
		}
		
	}
	@Override
	public String toString() {
		if (lamba.lambaValue()==1) {
			return "lambayi kapat";
		}
		else {
			return "lambayi ac";
		}
		
	}

}
