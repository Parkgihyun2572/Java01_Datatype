/*
# 산술 연산자(사칙 연산자)
+ : 덧셈 연산자
- : 뺄셈 연산자
* : 곱셈 연산자

/ : 나눗셈 연산자
 	나누고 몫을 구하는 연산자
	정수/정수 = 정수
	실수/실수 = 실수

% : 나머지 연산자
	나누고 나머지를 구하는 연산자

A ÷ B = 몫(/) ~ 나머지(%)
7 ÷ 3 = 2 ~ 1
14 ÷ 3 = 4 ~ 2

# 증감 연산자(++, --)
변수의 값을 1만큼 증가 또는 감소시켜서 다시 저장하는 연산자

*/
package content;

public class C04_OperatorPlus {
	public static void main(String[] args) {
		/* 산술연산자 확인하기 */
		System.out.println(3 + 5);
		System.out.println(3 - 5);
		System.out.println(3 * 5);
		System.out.println(5 / 2);
		System.out.println(5 % 2);
		System.out.println();
		
		/* 연산에서 둘 중 하나라도 실수면 결과도 실수 */
		System.out.println(5.0 / 2.0); //실수 나눗셈 연산
		System.out.println(5 / 2.0); //실수 나눗셈 연산
		System.out.println(5.0 / 2);
		System.out.println(10.0 + 4);
		System.out.println(5 * 4.0);
		
		int kor, eng, math;
		kor = 77;
		eng = 80;
		math = 85;
		
		int total = kor + eng + math;
		System.out.println("총점: " + total);
		
		//실수 결과를 얻기 위해 둘 중 하나를 실수로 타입변환
		System.out.println("평균: " + total/3.0);
		System.out.println("평균: " + (double)total/3);
		
		/* 증감연산자 */
		int a = 10;
		a++; // a = a + 1;
		System.out.println("a = " + a);
		
		int b = 10;
		b--; // b = b - 1;
		System.out.println("b = " + b);
	}
}
