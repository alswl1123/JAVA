package abstract_example;

public class Squirtle extends Pokemon {
	//꼬부기 클래스
	Squirtle() {
		this.name = "꼬부기";
	}

	@Override
	void attack() {
		System.out.println("물 공격");
		
	}

	@Override
	void sound() {
		System.out.println("꼬북 꼬북!");
		
	}
	
	

}
