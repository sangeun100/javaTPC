import kr.bit.Book;
import kr.bit.Person;

public class TPC03 {

	public static void main(String[] args) {
		// 관계를 이해하라. PDT VS UDDT
		// 정수 1개를 저장하기 위한 변수를 선언하시오.
		int a;
		a=10;
		
		// 책 1권을 저장하기 위한 변수 선언
		Book b;
		b=new Book(); //객체를 생성하는 부분
		b.title="자바";
		b.price=15000;
		b.company="한빛미디어";
		b.page=700;
		
		System.out.println(b.title);
		System.out.println(b.price);
		System.out.println(b.company);
		System.out.println(b.page);
		
		System.out.print(b.title+"\t");
		System.out.print(b.price+"\t");
		System.out.print(b.company+"\t");
		System.out.println(b.page+"\t");
		
		Person p;
		p=new Person();
		p.name="박메일";
		p.age=40;
		p.weight=68.4f;
		p.height=175.68f;
		
		System.out.print(p.name+"\t");
		System.out.print(p.age+"\t");
		System.out.print(p.weight+"\t");
		System.out.print(p.height+"\t");
		
		
	}
}
