public class SortAndDup {

	public static void main(String[] args) {
//		int[] arr1 = {4,2,3,7,6,2,1,1,2,4,7,3};
		int[] arr1 = {1,3,2,2};
		int max = 0; //numCnt의 최댓값 찾기
		
		//1. 새 배열 크기 찾기
		for(int i = 0; i < arr1.length; i++) {
			int numCnt = 0; //중복된 횟수
			
			for(int j = i+1; j < arr1.length; j++) {
				//두 수 비교
				if(arr1[i]==arr1[j]) {
					numCnt++;
					if(max < numCnt) max=numCnt;
				}
			}
		}
		
		//2. 새 배열 생성
		int[] arr2 = new int[arr1.length-max];
//		int[] arr2 = new int[10];
		
		int count = 0;

		//3. 중복 찾아서 넣기
		//arr1, arr2, tmp 세개 활용하여 해보기
		//(1) arr1에서 숫자를 하나 뽑아 tmp에 저장
		//(2) tmp의 숫자랑 arr1 인덱스 뒷부분이랑 비교

	}

}
