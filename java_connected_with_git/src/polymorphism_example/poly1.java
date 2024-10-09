package polymorphism_example;

public class poly1 {

	public static void main(String[] args) {
		Lion lion1 = new Lion(); //LIon 인스턴스 생성
		Zookeeper1 james = new Zookeeper1(); //james 라는 이름의 사육사 인스턴스 생성
		james.feed(lion1); //james가 lion1에게 먹이를 줌
		
		Rabbit rabbit1 = new Rabbit();
		james.feed(rabbit1);
		
		Monkey monkey1 = new Monkey();
		james.feed(monkey1);

	}

}
