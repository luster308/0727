// 다른 클래스에 있는 멤버 변수에 접근하려면? -> 멤버는 속해있는 클래스의 주소로 접근한다.
public class HelloWorld2 {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("str = "+t.str);
	}

}

class Test{
	String str = "Hello, World";
} 