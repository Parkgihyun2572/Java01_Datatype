/*
# 콘솔창에서 사용자로부터 입력받기
	"Scanner" + ctrl + space
	=> import java.util.Scanner;

	Scanner 객체이름 = new Scanner(System.in);
	타입 변수명 = 객체이름.입력받을타입();
	
*/
package content;

import java.util.Scanner; //Scanner 클래스 호출

public class C03_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//문자열 입력 받기(한줄): enter 전까지 입력받음
//		System.out.print("문자열 입력: ");
//		String str = sc.nextLine();
//		System.out.println("str: " + str);
		
		//문자열 입력 받기(한단어): 공백 전까지 입력받음
		System.out.print("단어 입력: ");
		String word = sc.next();
		System.out.println("word: " + word);
		
		//정수 입력 받기
//		System.out.print("정수 입력: ");
//		int numI = sc.nextInt();
//		System.out.println("numI: " + numI);
		
		//실수 입력 받기
//		System.out.print("실수 입력: ");
//		double numD = sc.nextDouble();
//		System.out.println("numD: " + numD);
	}
}
