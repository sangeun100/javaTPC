import kr.tpc.BookVO;

public class TPC10 {

	public static void main(String[] args) {
		// int, float, char, boolean 기본 자료형 ->PDT
		int a;
		a=10;
		// 책이라는 자료형을 만들자 --> class로! 책은 객체에용
		// 책이라는 객체는 기억공간 여러개를 하나의 구조로 만들고 거기에 제목 가격.....
		// 그 구조 이름을 BookVO
		//객체 생성
		BookVO b = new BookVO();
		b.title = "java";
		b.price = 10000;
		b.company = "goodcom";
		b.page= 323;
		
		System.out.print(b.title+"\t");
		System.out.print(b.price+"\t");
		System.out.print(b.company+"\t");
		System.out.print(b.page+"\t");
	}

}
