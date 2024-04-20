
public class Star7 {

	public static void main(String[] args) {
		int num = 5; //층
		for (int i = 0 ; i < num ; i++) { //층
			for (int j = 0; j <= i ; j++) { //각 층의 별
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
