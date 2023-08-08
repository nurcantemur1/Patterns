package Singleton;

public class Main {

	public static void main(String[] args) {

		SingletonClass sc = new SingletonClass();
		sc = SingletonClass.Intance();
		System.out.println(sc.degerAl());
		sc.degerYaz(50);
		SingletonClass a = SingletonClass.Intance();
		System.out.println(a.degerAl());
	}

}
