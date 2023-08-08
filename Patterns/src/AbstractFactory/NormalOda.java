package AbstractFactory;

public class NormalOda extends SoyutOda{

	SoyutKapi kapi;
	@Override
	public void kapiEkle(SoyutKapi k) {
		kapi =k;
	}

	@Override
	public boolean kapiAc() {
		// TODO Auto-generated method stub
		return kapi.kapiAc();
	}

}
