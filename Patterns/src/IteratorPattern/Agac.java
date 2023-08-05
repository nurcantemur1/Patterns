package IteratorPattern;

public class Agac extends Aggregate{

	private int deger;
	Agac sol;
	Agac sag;
	Agac(int d) {
		deger =d;
		sol=null;
		sag=null;

	}
	public int degerAl() {
		return deger;
	}
	public void solEkle(Agac a) {
		 sol=a;
	}
	public void sagEkle(Agac a) {
		 sag=a;
	}
	
	
	@Override
	public Iterator createIterator() {
		return new AgacIterator(this);
	}

}
