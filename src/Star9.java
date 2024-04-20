public class Star9 {

	public static void main(String[] args) {
		for(int i = 0 ; i < 5; i++) {
			for(int j = 0 ; j < 5 + i ; j++) { //각 층마다 0,1,2...추가
				System.out.print('*');				
			}
			System.out.println();
		}
	}

}
