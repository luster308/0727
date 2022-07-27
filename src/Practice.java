import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee jimin = new Employee();

		System.out.print("사원번호: ");
		jimin.empno = sc.nextInt();
		System.out.print("사원이름: ");
		sc.nextLine();
		jimin.ename = sc.nextLine();
		System.out.print("사원출생년도: ");
		jimin.birthYear = sc.nextInt();
		System.out.print("사원월급: ");
		jimin.salary = sc.nextInt();
		System.out.print("사원이메일: ");
		sc.nextLine();
		jimin.email = sc.nextLine();
		System.out.print("사원전화번호: ");
		jimin.tel = sc.nextLine();
		System.out.print("정규직여부: ");
		jimin.flag = sc.nextBoolean();

		System.out.printf("사원번호: %d\n", jimin.empno);
		System.out.printf("사원이름: %s\n", jimin.ename);
		System.out.printf("사원나이: %d\n", 2022 - jimin.birthYear);
		System.out.printf("사원월급: %d만원\n", jimin.salary);
		System.out.printf("사원이메일: %s\n", jimin.email);
		System.out.printf("사원전화번호: %s\n", jimin.tel);
		System.out.printf("정규직: %s\n", jimin.flag);
	}

}
