public class BingoEx {
	
	//2차원 배열(5X5) - (0과 1로 이루어짐)를 입력받아서 빙고의 갯수를 반환하는 bingoCount()를 작성
	public static void main(String[] args) {
		//1. 2차원 배열 생성하고 그 안에 숫자 넣기
		int[][] arr1 = {
				{1,1,1,1,1},
				{1,1,0,1,0},
				{1,0,1,0,0},
				{1,1,0,1,0},
				{1,0,0,0,1}
		};
		
		int[][] arr2 = {
				{1,0,0,0,1},
				{0,1,0,1,0},
				{1,0,1,0,0},
				{0,1,0,1,0},
				{1,0,0,0,1}
		};
		
		int[][] arr3 = {
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1}
		};
		
		int[][] arr4 = {
				{1,1,1,1,1},
				{0,0,0,0,0},
				{1,1,1,1,1},
				{0,0,0,0,0},
				{1,1,1,1,1}
		};
		
		int[][] arr5 = {
				{1,0,1,0,1},
				{1,0,1,0,1},
				{1,0,1,0,1},
				{1,0,1,0,1},
				{1,0,1,0,1}
		};
		
		
	
		//2. bingo 객체 생성
		Bingo bingo1 = new Bingo();
		
		//3. bingo인스턴스의 bingoCount 메서드호출
//		bingo1.bingoCount(arr1);
//		System.out.println("**************************");
//		bingo1.bingoCount(arr2);
//		System.out.println("**************************");
//		bingo1.bingoCount(arr3);
//		System.out.println("**************************");
//		bingo1.bingoCount(arr4);
//		System.out.println("**************************");
//		bingo1.bingoCount(arr5);
		System.out.println("**************************");
		
		System.out.println(bingo1.bingoCount(arr1));
		System.out.println("**************************");
		System.out.println(bingo1.bingoCount(arr2));
		System.out.println("**************************");
		System.out.println(bingo1.bingoCount(arr3));
		System.out.println("**************************");
		System.out.println(bingo1.bingoCount(arr4));
		System.out.println("**************************");
		System.out.println(bingo1.bingoCount(arr5));
		System.out.println("**************************");
		
	}
}

class Bingo {
	//bingo를 세는 메서드
	int bingoCount(int[][] arr) {
		int allCount = 0; //총 빙고 갯수
		
		//(1)가로로 같은 숫자인 경우
		for(int i = 0; i < arr.length; i++) {
			int count = 0; //1 세는 카운터
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == 1) count++; //1이면 카운터++
				if(count == 5) { //i열에서 1이 5개 나오면 
					allCount++; //빙고갯수 +1
//					System.out.printf("가로BINGO! %d번째 빙고%n",allCount);
				}
			}
		}
		
		//(2)세로로 같은 숫자인 경우
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[j][i] == 1) count++; //1이면 카운터++
				if(count == 5) { //i행에서 1이 5개 나오면 
					allCount++; //빙고갯수+1
//					System.out.printf("세로BINGO! %d번째 빙고%n",allCount);
				}
			}
		}	
		
		//(3)하향대각선 같은 숫자인 경우
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if( (arr[i][j]==1 && i==j)) { 
					count++;
				}
			}
		}
		if(count == 5) {
			allCount++;
//			System.out.printf("하향대각선BINGO! %d번째 빙고%n",allCount);
		}
		
		//(4)상향대각선 같은 숫자인 경우
		count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if( (arr[i][j]==1 && i+j==4)) {
					count++;
				}
			}
		}
		if(count == 5) {
			allCount++;
//			System.out.printf("상향대각선BINGO! %d번째 빙고%n",allCount);
		}
		
//		System.out.println("**************************");
//		System.out.println("총 BINGO 갯수는 : " + allCount);
		
		return(allCount);
	}
}
