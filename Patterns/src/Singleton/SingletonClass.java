package Singleton;

public class SingletonClass {

	private int value;
	public SingletonClass() {
		value =10;
	}
	public int degerAl() {return value;}
	public void degerYaz(int a) {value=a;
	}
	private static SingletonClass uniqueInstance =null;
	public static SingletonClass Intance() {
		if(uniqueInstance==null) {
			uniqueInstance = new SingletonClass();
		}
		return uniqueInstance;
	}
}
