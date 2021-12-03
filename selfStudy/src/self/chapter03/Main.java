package self.chapter03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result;
		System.out.println("A값을 입력해주세요");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.println("B값을 입력해주세요");
		String s = sc.nextLine();
		System.out.println(a * (s.charAt(0)-'0'));
		
		
		Integer.parseInt(s);

	}

}
