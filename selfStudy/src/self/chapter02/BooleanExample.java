package self.chapter02;

import java.util.Random;

public class BooleanExample {

	public static void main(String[] args) {
		Random rand = new Random(); // << random() 자리의 괄호에 뭔가를 넣는게 아니라
		boolean stop = rand.nextBoolean(); // rand. 호출자 이후에 생성하는 메서드의 내용을 확인하고
		if (stop) {
			System.out.println("장비를 정비합니다.");
		} else {
			System.out.println("장비를 시작합니다.");
		}
		int a = rand.nextInt();
		System.out.println(a);
	}

}
