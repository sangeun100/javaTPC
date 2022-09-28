package JavaJungsuk;

import java.util.Arrays;

class p137Array_eg {

	public static void main(String[] args) {
		//<총합과 평균>
		int sum=0;//총합을 저장하기 위한 변수
		float average=0f;//평균을 저장하기 위한 변수
		
		int[] score= {100,88,100,100,90};
		
		for (int i=0; i<score.length; i++) {
			sum+= score[i];//반복문을 이용해서 배열에 저장되어 있는 값들을 모두 더한다
		}
		average=sum / (float)score.length;//계산결과를 float타입으로 얻으려 형변환
		
		System.out.println("총합 : "+ sum);
		System.out.println("평균 : "+ average);
		
		
		//<최댓값최솟값>
		int[] score1= {79, 88, 91, 33, 100, 55, 95};
		
		int max = score1[0]; //배열의 첫 번째 값으로 최대값을 초기화 한다
		int min = score1[0]; //배열의 첫 번째 값으로 최솟값을 초기화
		
		for(int n=0; n < score1.length; n++) {
			if(score1[n] > max) {
				max = score1[n];
			} else if(score1[n] < min) {
				min = score1[n];
			}
		}// end of for
		System.out.println("최댓값 : "+max);
		System.out.println("최솟값 : "+min);
		
		
		//<shuffle>
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for (int t=0; t < 100; t++) { // 배열의 임의의 위치에 있는 값과 배열의 
			//첫번째 요소 'numArr[0]'의 값을 교환하는 일 100 번 반복해서 배열의 요소가 뒤섞이게
			int a = (int)(Math.random() * 10);//0~9중의 한 값을 임의로 얻는다
			int b = numArr[0];//numArr[0]과 numArr[n]의 값을 서로 바꾼다
			numArr[0] = numArr[a];
			numArr[a] = b;
		}
		System.out.println(Arrays.toString(numArr));
	}

}
