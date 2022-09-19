public class TPC08 {

	public static void main(String[] args) {
		int a = 30;
		int b = 50;
		int v =add (a,b); // static method call
		
		System.out.println(v);
	}
	public static int add(int a, int b) {
		// 스테틱 지우면 에러나요 : main이 호출할 때 같은 스테틱 호출해야하기 때문이죠
		//즉 같은 스테틱을 호출해야 하기 때문에 스테틱 키워드는 중요함
		// 스테틱은 프로그램 실행 전에 메소드에 기계어 코드를 자동으로 메모리에 로드시키기 위해 필요함
		// 스테틱 존 이라는 고정된 위치에 자동으로 로딩 되게 만드는 키워드는 스테틱
		int sum = a+b;
		return sum;
	}
}
