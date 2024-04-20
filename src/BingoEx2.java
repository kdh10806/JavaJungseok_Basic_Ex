
public class BingoEx2 {
	public static void main(String[] args) {
		int[][] arr1 = {
				{1,1,1,1,1},
				{1,1,0,1,0},
				{1,0,1,0,0},
				{1,1,0,1,0},
				{1,0,0,0,1}
		};
		
		int[][] arrT = {
				{1,0,0,0,0},
				{0,1,0,0,0},
				{0,0,1,0,0},
				{0,0,0,1,0},
				{0,0,0,0,1}
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
		
		Bingo2 bingo2 = new Bingo2();
		
//		bingo2.bingoCount(arr1);
//		System.out.println("**************************");
//		bingo2.bingoCount(arr2);
//		System.out.println("**************************");
//		bingo2.bingoCount(arr3);
//		System.out.println("**************************");
//		bingo2.bingoCount(arr4);
//		System.out.println("**************************");
//		bingo2.bingoCount(arr5);
//		System.out.println("**************************");
		
		System.out.println(bingo2.bingoCount(arr3));
	}

}

class Bingo2 {
	int bingoCount(int[][] arr) {
		int allCount = 0;
		int oneCount = 0;
		int oneCount2 = 0;
		boolean flag1 = false;
		boolean flag2 = false;
		
		for(int i = 0; i < arr.length; i++) {
			int rowCount = 0;
			int colCount = 0;
			for(int j = 0; j < arr[i].length; j++){
				//가로빙고
				if(arr[i][j] == 1) rowCount++;
				if(rowCount==5) {
					allCount++;
//					System.out.printf("가로BINGO! %d번째 빙고%n",allCount);
				}
				
				//세로빙고
				if(arr[j][i] == 1) colCount++;
				if(colCount==5) {
					allCount++;
//					System.out.printf("세로BINGO! %d번째 빙고%n",allCount);
				}
				
				//하향대각선빙고
				if( arr[i][j] == 1 && i==j ) {
//					System.out.println("i = " + i + " j = " + j);
					oneCount++;
//					System.out.println("oneCount = " + oneCount);
				}
				if(oneCount == 5 && flag1 == false) {
					allCount++;
					flag1 = true;
//					System.out.println(flag1);
//					System.out.printf("하향대각선BINGO! %d번째 빙고%n",allCount);
				}
				
				//상향대각선빙고
				if( arr[i][j]==1 && i+j==4 ) {
//					System.out.println("i = " + i + " j = " + j);
					oneCount2++;
//					System.out.println("oneCount2 = " + oneCount2);
				}
				if(oneCount2 == 5 && flag2 == false) {
					allCount++;
					flag2 = true;
//					System.out.println(flag2);
//					System.out.printf("상향대각선BINGO! %d번째 빙고%n",allCount);
				}
			}
		}
		return allCount;
	}
}
