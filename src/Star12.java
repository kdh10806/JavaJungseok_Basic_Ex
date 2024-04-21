
public class Star12 {

//	public static void main(String[] args) {
//		int num = 5; //5층
//		for(int i = 1; i <= num/2; i++) {
//			for(int j = 0; j < i; j++) System.out.print('*');
//			for(int j = 0; j < num-2*i; j++) System.out.print(' ');
//			for(int j = 0; j < i; j++) System.out.print('*');
//			System.out.println();
//		} //위쪽 공백, 별
//		
//		for(int i = 0; i < num; i++) System.out.print('*'); //중간줄
//		System.out.println();
//		
//		for(int i = 1; i <= num/2; i++) {
//			for(int j = 0; j < num/2-i+1; j++) System.out.print('*');
//			for(int j = 0; j < i*2-1; j++) System.out.print(' ');
//			for(int j = 0; j < num/2-i+1; j++) System.out.print('*');
//			System.out.println();
//		} //아래쪽 공백, 별
//	}
//	public static void main(String[] args) {
//		for(int i = 1 ; i <= 5 ; i++) {
//			for(int j = 1 ; j <= 5 ; j++) {
//				if(!(((i+j<6)&&(i<j))||((i>j)&&(i+j>6)))) System.out.print('*');
//				else System.out.print(' ');
//			}
//			System.out.println();
//		}
//	}
	public static void main(String[] args) {
		for(int i = 0 ; i <= 4 ; i++) {
			for(int j = 0 ; j <= 4 ; j++) {
				if(!(((i+j<4)&&(i<j))||((i>j)&&(i+j>4)))) System.out.print('*');
				else System.out.print(' ');
			}
			System.out.println();
		}
	}

}

//11번 문제에 not 적용, 등호 빼