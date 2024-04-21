
public class Star11 {

//	public static void main(String[] args) {
//		for(int i = 3; i > 0; i--) {
//			for(int j = 0; j < 3-i; j++) {
//				System.out.print(' ');
//			}
//			for(int j = 0; j < 2*i-1; j++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		} //위쪽 공백, 별 3줄 역방향
//		for(int i = 1; i < 3; i++) {
//			for(int j = 0; j < 3-i-1; j++) {
//				System.out.print(' ');
//			}
//			for(int j=0; j<2*i+1; j++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		} //아랫쪽 공백, 별 2줄 정방향
//	}
	
//	public static void main(String[] args) {
//		for(int i = 1 ; i <= 5 ; i++) {
//			for(int j = 1 ; j <= 5 ; j++) {
//				if(((i+j<=6)&&(i<=j))||((i>=j)&&(i+j>=6))) System.out.print('*');
//				else System.out.print(' ');
//			}
//			System.out.println();
//		}
//	}
	public static void main(String[] args) {
		for(int i = 0; i <= 4 ; i++) {
			for(int j = 0 ; j <= 4 ; j++) {
				if(((i+j<=4)&&(i<=j))||((i>=j)&&(i+j>=4))) System.out.print('*');
				else System.out.print(' ');
			}
			System.out.println();
		}
	}

}

//(i+j<=6)&&(i<=j) 윗삼각형
//(i>=j)&&(i+j>=6) 아랫삼각형