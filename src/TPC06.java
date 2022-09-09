public class TPC06 {

	public static void main(String[] args) {
		// 매서드 -> 동작(method) 기능(function)
		int a=67;
		int b=98;
		
		//a+b=?
		int result=sum(a,b);
		System.out.println(result);
		
		int[] arr=makeArr(); //10,20,30
		int hap=0;
		for(int i=0;i<arr.length; i++) {
			hap+=arr[i];
		}
		System.out.println(hap);
	}
	// 정수 2개를 매개변수로 받아서 종합을 구해 리턴하는 매서드를 정의하시오
	// return void(return안한다)
	public static int sum(int a, int b) {
		int v=a+b;
		return v;
	}
	// 10,20 ,30리턴하고 싶어요
	public static int[] makeArr() {
		int x=10;
		int y=20;
		int z=30;
		int[] arr=new int[3];
		arr[0]=x;
		arr[1]=y;
		arr[2]=z;
		
		return arr;
	}
}
// 매서드를 정의하고 호출한 다음 값을 전달, 그 결과 값을 다시 호출한 쪽으로 리턴

