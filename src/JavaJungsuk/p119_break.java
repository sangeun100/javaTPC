package JavaJungsuk;

import java.util.Scanner;

class p119_break {

	public static void main(String[] args) {
		// 숫자를 1부터 계속 더해 나가서 몇까지 더하면 합이 100을 넘는지 알아내는 예제
		int sum=0, i=0;
		
		while(true) {
			if(sum>100)
				break;
			++i;
			sum += i;
		}// end of while
		System.out.println("i="+i);
		System.out.println("sum="+sum);
		
		//1~10사이 수 중 3 배수 제외
		for(int i1=0; i1<=10; i1++) {
			if (i1%3==0)
				continue;//조건식 참이 되어 continue문이 수행되면 블럭의 끝으로 이동(break문과 달리 반복문을 벗어나지 않음)
			System.out.println(i1);
		}
		
		
		int menu=0, num=0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(1) square root");
			System.out.println("(1) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요(종료:0) >");
			
			String st = sc.nextLine(); //화면에서 입력받은 내용을 st에 저장
			menu = Integer.parseInt(st);//입력받은 문자열(st)를 숫자로 변환
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1<=menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는0)");
				continue;
			}
			System.out.println("선택하신 메뉴는"+menu+"번입니다.");
		}
		
		Loop1 : for(int t=2; t<=9; t++) {
			for(int j=1; j<=9; j++) {
				if(j==5)
					break Loop1;
				System.out.println(t+"*"+j+"="+ t*j);
			}
			System.out.println();
		}
	}
}
