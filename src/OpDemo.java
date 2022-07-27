
public class OpDemo {

	public static void main(String[] args) {
		//단항 연산자
		int age = 26;
		
		// prefix operator(앞에 쓰면) ex) ++age, postfix operator(뒤에 쓰면) ex) age--
//		System.out.println("age = "+age);
////		System.out.println("age = "+ ++age);   //1 증가해서 출력
//		System.out.println("age = "+ age++);   // 출력 먼저하고 나중에 증가
//		System.out.println("age = "+age);
		
//		int su = 345678;
//		String result = Integer.toBinaryString(su);
//		System.out.println("result = "+result);
//		int su1 = ~su;
//		result = Integer.toBinaryString(su1);
//		System.out.println("result = "+result);
//		System.out.println("su1 = "+su1);
		
//		boolean flag = 4 > 6;
//		System.out.println("flag = "+flag);
//		System.out.println("flag = "+!flag);
		
		Student jimin = new Student();
		
		//형변환, Cast, Convert
		//1. Cast Up, Promotion, 자동형변환, Implicit Conversion
		double result = 5 + 3.14;
		
		//2. Cast Down, Demotion, 강제형변환, Explicit Conversion
		int result1 = (int)(5 + 3.14);
	}

}
