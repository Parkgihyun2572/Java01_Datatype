/*
Q)  원의 반지름을 입력받고, 
	원의 넓이를 계산해서 출력해보자.
    (원주율 pi=3.14)

    ↓ Console ↓
	반지름을 입력하시오: 5
	반지름이 5인 원의 넓이는 78.5입니다.

*/
package practices;

import java.util.Scanner;

public class Prac04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double PI = 3.14;
		System.out.print("반지름을 입력하시오 : "); int radius = sc.nextInt();
		
		double width = radius * radius * PI;
		System.out.println("반지름이 " + radius + "인 원의 넓이는 " + width + "입니다.");
	}
}
