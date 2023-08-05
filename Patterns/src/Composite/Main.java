package Composite;

public class Main {

	public static void main(String[] args) {
		Bolum kitap = new Bolum("programlamaya giriþ");
		Bolum b1 = new Bolum("giriþ");
		b1.Add(new Metin("hello world"));
		b1.Add(new Metin("diger"));
		
		Bolum b12 = new Bolum("temel programlar");
		b12.Add(new Metin("degiskenler"));
		b12.Add(new Metin("kontrol"));
		b12.Add(new Metin("donguler"));
		b1.Add(b12);
		
		Bolum b2= new Bolum("degiskenler");
		b2.Add(new Resim(""));
		b2.Add(new Metin("int,boolean,float"));
		
		kitap.Add(b1);
		kitap.Add(b2);
		
		yazdir(kitap);
		System.out.println("----");
		yazdir(b12);

	}
	public static void yazdir(Icerik icerik) {
		icerik.Operation();
	}

}
