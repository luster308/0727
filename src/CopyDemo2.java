
public class CopyDemo2 {

	public static void main(String[] args) {
		Product mouse = new Product();
		mouse.price = 20000;
		Product keyboard = mouse;     //주소 복사(price가 복사된 것이 아니라, Product가 복사됨.)
		
		System.out.println("Before Change");
		System.out.println("Mouse's price = "+mouse.price);
		System.out.println("Keyboard's price = "+keyboard.price);
		
		System.out.println("After Change");
		mouse.price = 100000;
		System.out.println("Mouse's price = "+mouse.price);
		System.out.println("Keyboard's price = "+keyboard.price);
	}

}
class Product{
	int price;
	
}