
public class HelloWorld4 {

	public static void main(String[] args) {
		System.out.println("msg = "+Demo.msg);
	}

}

class Demo{
	static String msg = "Hello, World";  //static은 주소로 접근하지 않는다.
}