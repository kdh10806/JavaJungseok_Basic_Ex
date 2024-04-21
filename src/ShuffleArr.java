import java.util.Arrays;

public class ShuffleArr {

	public static void main(String[] args) {
		int[] arr1 = {1,1,2,3,3,4,5,5,5,7};
		int[] arrCnt = {0,0,0,0,0,0,0,0,0,0};
		
		System.out.println(Arrays.toString(arr1));
		
		for(int i = 0; i < arr1.length; i++) {
			int count = arr1[i];
			arrCnt[count-1]++;
		}
		
		System.out.println(Arrays.toString(arrCnt));
	}

}
