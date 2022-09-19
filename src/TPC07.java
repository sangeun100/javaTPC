public class TPC07 {

	public static void main(String[] args) {
		
		int a = 20;
		float b = 56.7f;
		//a+b?
		// 함수 호출문 필요
		float v = sum(a,b); // call by value(값)
		System.out.println(v);
		
		int [] arr = {1,2,3,4,5};
		// 배열의 총합=?
		int vv = arrSum(arr); // call by reference(번지)
		System.out.println(vv);
	}
	//지금은 하나의 클래스 안에서 호출하기때문에 private는 상관이 없어용
	//외부 클래스에선 접근 못함
	private static int arrSum(int[] x) {
		int hap=0;
		for (int i=0; i<x.length; i++) {
			hap+=x[i];
		}
		return hap;
	}

	public static float sum(int a, float b) {
		float v = a+b;
		return v;
	}
}
