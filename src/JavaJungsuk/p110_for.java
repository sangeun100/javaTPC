package JavaJungsuk;

class p110_for {

	public static void main(String[] args) {
		for (int i = 1; i<=3; i++) { // {}안의 문장을 3번 반복
			System.out.println("hello");
		}
		
		int sum = 0; //합계를 저장하기 위한 변수
		
		for(int i=1; i <=5; i++) { //sum for
			sum += i; // sum = sum+i;
			System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
		}//sum for의 끝
		
		//중첩for 문
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} //중첩 for 끝
		
	}

}
