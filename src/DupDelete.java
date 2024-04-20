import java.util.Arrays;

public class DupDelete {

	public static void main(String[] args) {
		//1.중복제거
		//(1) arr1에서 원소 하나를 뽑는다.
		//(2) arr2에서 뽑은 원소와 비교한다.
		//(3) 있는 원소일 경우 flag를 true로 변경하고 탐색을 빠져나온다.
		//(4) 없는 원소일 경우 flag를 false로 변경한다.
		//(5) flag가 false인 arr1의 원소에를 arr[count]에 저장한다.
		//(6) count 1 증가
		//(5) arr2 출력
		
		int[] arr1 = {4,2,3,7,6,2,1,1,2,4,7,3};
		int[] arr2 = new int[arr1.length];
				
		int count = 0; //arr2에 추가할 위치의 인덱스
		boolean flag = false;
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("arr1에서 뽑은 원소 : " + arr1[i]);
			
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j])
				{
					System.out.println("중복O");
					flag = true;
					break;
				} else {
					System.out.println("중복X");
					flag = false;
				}
			}
			
			//arr2에 삽입
			if (flag == false) {
				arr2[count] = arr1[i];
				count++;
				System.out.println(Arrays.toString(arr2));				
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
}

// 중복제거 방법 - counting, 정렬
// 정렬을 해놓고 앞뒤 숫자가 같은지 다른지 판별 -> 중복제거

