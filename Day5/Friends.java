package day5;

public class Friends {

	String name;
	int age;

	Friends(String n, int a) {
		this.name = n;
		this.age = a;
	}

	void show() {
		System.out.println(name + " " + age);
	}

	class Main {
		public static void main(String[] args) {
			Friends f = new Friends("Sonu", 20);
			f.show();
		}
	}
}