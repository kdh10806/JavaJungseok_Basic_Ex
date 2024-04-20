
public class Star10 {

	public static void main(String[] args) {
		for(int i = 0; i < 5 ; i++) { // 총 층수
			for (int j = 5-i-1; j > 0; j--) System.out.print(' '); // 별앞에 4321 빈칸 붙음
			for (int k = 0; k < 2*i+1; k++) System.out.print('*'); // 층수마다 홀수개씩 별이 붙음
			System.out.println();
		}
	}

}
