package JavaJungsuk;

import java.util.Arrays; // 배열의 모든 요소를 '[첫번째 요소, 두번째 요소...]'와 같은 문자열로 만들어서 반환

class p136Array {

	public static void main(String[] args) {
		int[] iArr1=new int[10];
		int[] iArr2=new int[10];
//		int[] iArr3=new int[]{100,95,80,70,60};
		int[] iArr3= {100,95,80,70,60};
		char[] chArr= {'a','b','c','d'};
		
		for (int i=0; i<iArr2.length; i++) {
			iArr1[i]=i+1; // 1~10의 숫자를 순서대로 배열에 넣는다
		}
		for (int i=0; i<iArr2.length; i++) {
			iArr2[i]=(int)(Math.random()*10)+1; // 1~10의 값을 배열에 저장
		}
		// 배열에 저장된 값들을 출력
		for (int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
	}

}