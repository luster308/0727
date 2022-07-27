
public class HelloWorld7 {

	public static void main(String[] args) {
		Busan bu = new Busan();   // 디스플레이가 부산 클래스의 멤버 메소드기 때문에 부산이 필요함.
		bu.display();
	}

}

class Busan{
	void display() {   // (부산 클래스의) member method
		System.out.println("Hello, World");
	}
}