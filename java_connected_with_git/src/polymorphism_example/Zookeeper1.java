package polymorphism_example;

public class Zookeeper1 { //사육사 클래스
	void feed(Lion lion) { //사자에게 먹이 주는 메서드
		System.out.println(lion + "에게 먹이 주기");
	}
	
	void feed(Rabbit rabbit) { //토끼에게 먹이 주는 메서드
		System.out.println(rabbit + "에게 먹이 주기");
	}
	
	void feed(Monkey monkey) { //원숭이에게 먹이 주는 메서드
		System.out.println(monkey + "에게 먹이 주기");
	}
}
