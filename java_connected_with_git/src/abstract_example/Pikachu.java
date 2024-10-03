package abstract_example;

public class Pikachu extends Pokemon {
	//피카츄 클래스
	Pikachu() { //이름을 지정하는 생성자
		this.name = "피카츄";
	}

	@Override
	void attack() { //구체적으로 구현
		System.out.println("전기 공격");
	}

	@Override
	void sound() { //구체적으로 구현
		System.out.println("피카 피카!");
		
	}
	
	

}
