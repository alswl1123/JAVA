package abstract_example;

public class AbstractClass1 {

	public static void main(String[] args) {
		Pikachu pikachu1 = new Pikachu();
		System.out.println("이 포켓몬은 : " + pikachu1.getName());
		pikachu1.attack();
		pikachu1.sound();
		
		Squirtle squirtle1 = new Squirtle();
		System.out.println("이 포켓몬은 : " + squirtle1.getName());
		squirtle1.attack();
		squirtle1.sound();
	}

}
