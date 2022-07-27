
public class StringDemo {

	public static void main(String[] args) {
//		String name;                 // 선언, declaration
//		name = "한지민";             // 할당, assignment
//
//		String name = "한지민";  //초기화, initialization

//		String name = new String("한지민");
//		
//		System.out.printf("이름 = %s\n", name);
		
		Student jimin;               // 선언
		jimin = new Student();// 할당
		jimin.name = "한지민";   // 한지민이 저장된 것이 아니라 한지민의 번지수가 저장.
		jimin.age = 26;
		
		Student chulsu = new Student();
		chulsu.name = "김철수";
		chulsu.age = 36;
		
		Student younghee = new Student();
		younghee.name = "이영희";
		younghee.age = 46;
		
		
		System.out.println("한지민 학생 정보");
		System.out.printf("이름 = %s, 나이 = %d\n", jimin.name, jimin.age);
		
		System.out.println("김철수 학생 정보");
		System.out.printf("이름 = %s, 나이 = %d\n", chulsu.name, chulsu.age);
		
		System.out.println("이영희 학생 정보");
		System.out.printf("이름 = %s, 나이 = %d\n", younghee.name, younghee.age);
	}

}
