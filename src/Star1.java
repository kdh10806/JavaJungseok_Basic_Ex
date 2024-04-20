//별찍기 문제는 집합을 써서 해결하자
public class Star1 {
	public static void main(String[] args) {
		int num = 5;
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				System.out.print('*');
			}
			System.out.println();			
		}
	}
}
