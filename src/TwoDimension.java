import java.util.Arrays;

public class TwoDimension {

	//1차원 배열(1X25)에 1~25 숫자 저장 임의로 섞는다.
	//2차원배열(5X5)에 옮겨담아 출력하기.
	
	public static void main(String[] args) {
		//1. 1차원배열 생성
		int[] arr1 = new int[25];
		for(int i = 1 ; i < 26; i++) {
			arr1[i-1] = i;
		}
		System.out.println(Arrays.toString(arr1));
		
		//2. 1차원배열 숫자 섞기
		for(int i = 0; i < arr1.length; i++) {
			int n = (int)(Math.random()*9);
			int tmp = arr1[i];
			arr1[i] = arr1[n];
			arr1[n] = tmp;
		}
		System.out.println(Arrays.toString(arr1));
		
		//3. 2차원 배열 생성
		int[][] arr2 = new int[5][5];
		
		//4. 2차원 배열에 옮겨담기
		int index = 0; //arr1의 인덱스
		for(int level = 0; level < arr2.length; level++) { //층수
			for(int count = 0; count < arr2[level].length; count++) { //2차원배열인덱스
				arr2[level][count] = arr1[index];
				index++;
			}
		}
		
		//2차원 배열 출력
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.printf("%2d ",arr2[i][j]);
			}
			System.out.println();
		}
	}

}
