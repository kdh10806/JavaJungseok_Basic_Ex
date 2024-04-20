import java.util.Arrays;

public class SortEx {

	public static void main(String[] args) {
		//정렬
		//인덱스의 숫자와 나머지 숫자를 순서대로 비교한다.
		
		int[] arr1 = {4,2,3,7,6,2,1,1,2,4,7,3};
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = i+1; j < arr1.length; j++) {
				int tmp = 0;
				
				//비교
				if(arr1[i] > arr1[j]) {
					tmp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
	}
}
