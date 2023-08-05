package IteratorPattern;

public class Main {

	public static void main(String[] args) {
	//	Listeleme.Listele(new Dizi());
		
		Agac agac = new Agac(15);
		Agac sag = new Agac(50);
		Agac sol = new Agac(6);
		Agac sag2 = new Agac(42);
		Agac sol2 = new Agac(3);
		agac.solEkle(sol);
		agac.sagEkle(sag);
		agac.solEkle(sol2);
		agac.sagEkle(sag2);
		
		
		Listeleme.Listele(agac);
	}

}
