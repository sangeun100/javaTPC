public class TPC04 {

	public static void main(String[] args) {
		// 데이처를 이동하라 (변수 vs 배열) 배열은 바구니다!
		int a, b, c;
		a=10;
		b=20;
		c=30;
		//a+b+c=? 매서드 처리 ->hap()
		//어떤 데이터를 다른 매서드 이동을 시키려면 배열을 만들어서 이동시키는게 
		hap(a, b, c);
		
		int[] arr = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		hap1(arr);
	}
	public static void hap(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println(sum);
	}
	public static void hap1(int[] x) {
		// 반복문 활용, for, while
		int sum=0;
		for(int i=0; i<x.length; i++) {
			sum+=x[i];
		}
		System.out.println(sum);
	}
}
