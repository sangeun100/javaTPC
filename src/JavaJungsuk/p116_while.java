package JavaJungsuk;

import java.util.Scanner;

class p116_while {

	public static void main(String[] args) {
		
		// <예제 1>
		int sum = 0;
		int i = 0;
		// i를 1씩 증가시켜서 sum에 계속 더해내간다.
		while (sum <=100) {
			System.out.printf("%d - %d%n", i , sum);
			sum += ++i;
		}//i sum 끝
		
		
		//<예제 2>
		int num1 = 0, sum1 = 0;
		System.out.print("숫자를 입력하세요(예:12345)>");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine(); // 화면을 통해 입력받은 내용을 sc에 저장
		num1 = Integer.parseInt(st); // 입력받은 문자열(sc)을 숫자로 변환
		
		while (num1!=0) {
			// num1을 10으로 나눈 나머지를 sum1에 더함
			sum1 += num1%10; // sum1 = sum1 + num1%10;
			System.out.printf("sum1=%3d num1=%d%n", sum1, num1);
			
			num1 /= 10; // num1 = num1 / 10; num1을 10으로 나눈 값을 다시 num1에 저장
		}
		System.out.println("각 자리수의 합:" +sum1);
		
		
		//<예제 3>
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*100) + 1; // 1~100 사이의 임의의 수를 저장
		Scanner sc1 = new Scanner(System.in);
		
		do {
			System.out.print("1과 100의 사이의 정수를 입력하세요>");
			input = sc1.nextInt();
			
			if(input>answer) {
				System.out.println("더 작은 수로 다시 시도해보세요");			
			} else if(input<answer) {
				System.out.println("더 큰 수로 다시 시도해보세요");
			}
		} while(input != answer);
		System.out.println("정답입니다");
	}

}
