public class TPC09 {

	public static void main(String[] args) {
		int a = 56;
		int b = 40;
		// a+b?
		TPC09 tpc= new TPC09(); // heap area 객체 생성
		int v = tpc.sum(a,b);
		System.out.println(v);
	}
	public int sum(int a, int b) {
		int v = a + b;
		return v;
		
	}
}
// tpc09라는 객체를 만들어서 객체 타입 다른 매서드를 main에 올릴 수 있게 pointer