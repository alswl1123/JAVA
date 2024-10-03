package abstract_example;

abstract class Pokemon { //abstract 자리에 public 이라고 쓰지 않도록 조심하자!
	//포켓몬 추상 클래스
	String name;
	
	abstract void attack(); //공격 추상 메서드
	abstract void sound(); //소리 추상 메서드
	
	public String getName() { //포켓몬의 이름을 리턴하는 메서드
		return this.name;
	}
}
