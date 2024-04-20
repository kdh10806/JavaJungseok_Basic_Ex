
public class ArrayComp {

	public static void main(String[] args) {
		//배열 2개를 비교해서 같으면 "같습니다", 틀리면 "다릅니다"
		//주소값이 아니라 원소를 비교해서 같은지 판단해야한다.
		//동일한 타입, 동일한 원소, 동일한 순서
		int[] arr1= {1,2,3};
		int[] arr2 = {3,2,1};
		boolean flag = false;
		
		for(int i = 0; i < arr1.length; i++) {
			//두 배열 길이 비교
			if(arr1.length != arr2.length) {
				flag = false;
				break;
			}
//			System.out.println(arr1[i]);
//			System.out.println(arr2[i]);
			
			//순서, 원소 비교
			if(arr1[i] != arr2[i]) {
				flag = false;
				break;
			}
			else flag = true;
		}
		
		//결과 출력
		if(flag == true) System.out.println("같습니다.");
		else System.out.println("다릅니다.");
	}

}
