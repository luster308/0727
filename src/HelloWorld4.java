
public class HelloWorld4 {

	public static void main(String[] args) {
		System.out.println("msg = "+Demo.msg);   // 멤버 변수가 아니기 때문에 주소로 접근하지 않는다.
	}

}

class Demo{
	static String msg = "Hello, World";
}