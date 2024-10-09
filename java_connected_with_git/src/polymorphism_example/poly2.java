package polymorphism_example;

public class poly2 {

	public static void main(String[] args) {
		
		Zookeeper2 james = new Zookeeper2(); //james 라는 이름의 사육사 인스턴스 생성
		
		Animal lion1 = new 	Lion(); // Lion 인스턴스 생성
		james.feed(lion1); //james가 lion1 에게 먹이를 줌
		
		Animal rabbit1 = new Rabbit(); //Rabbit 인스턴스 생성
		james.feed(rabbit1);
		
		Animal monkey1 = new Monkey(); //Monkey 인스턴스 생성
		james.feed(monkey1);

	}

}
