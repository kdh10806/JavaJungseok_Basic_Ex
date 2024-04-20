
public class Star6 {
	//(i<=3) || (j<3) 와 부정의 합집합
	public static void main(String[] args) {
		int num = 5;
		for(int i = 0 ; i < num; i++) {
			for(int j = 0; j < num; j++) {
				if(((i<3)&&(j<3))||((i>=2)&&(j>=2)))
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
}
