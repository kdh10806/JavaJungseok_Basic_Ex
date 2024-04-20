import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BingoEx2Test {
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
				}
				
				//세로빙고
				if(arr[j][i] == 1) colCount++;
				if(colCount==5) {
					allCount++;
				}
				
				//하향대각선빙고
				if( arr[i][j] == 1 && i==j ) { //arr[i][i]
					oneCount++;
				}
				if(oneCount == 5 && flag1 == false) {
					allCount++;
					flag1 = true;
				}
				
				//상향대각선빙고
				if( arr[i][j]==1 && i+j==4 ) {
					oneCount2++;
				}
				if(oneCount2 == 5 && flag2 == false) {
					allCount++;
					flag2 = true;
				}
			}
		}
		return allCount;
	}
	
	//1. 가로1줄
		@Test
		public void test1() {
			int[][] arr = {
					{1,1,1,1,1},
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0}
			};		
			assertTrue(bingoCount(arr)==1);
		}
		
		//2. 세로 1줄
		@Test
		public void test2() {
			int[][] arr = {
					{1,0,0,0,0},
					{1,0,0,0,0},
					{1,0,0,0,0},
					{1,0,0,0,0},
					{1,0,0,0,0}
			};
			assertTrue(bingoCount(arr)==1);
		}
		
		//3. 가로 여러줄
		@Test
		public void test3() {
			int[][] arr = {
					{1,1,1,1,1},
					{0,0,0,0,0},
					{1,1,1,1,1},
					{0,0,0,0,0},
					{1,1,1,1,1}
			};
			assertTrue(bingoCount(arr)==3);
		}
		
		//4. 세로 여러줄
		@Test
		public void test4() {
			int[][] arr = {
					{1,0,1,0,1},
					{1,0,1,0,1},
					{1,0,1,0,1},
					{1,0,1,0,1},
					{1,0,1,0,1}
			};
			assertTrue(bingoCount(arr)==3);
		}
		
		//5. 하향대각선 1줄
		@Test
		public void test5() {
			int[][] arr = {
					{1,0,0,0,0},
					{0,1,0,0,0},
					{0,0,1,0,0},
					{0,0,0,1,0},
					{0,0,0,0,1}
			};
			assertTrue(bingoCount(arr)==1);
		}
		
		//6. 상향대각선 1줄
		@Test
		public void test6() {
			int[][] arr = {
					{0,0,0,0,1},
					{0,0,0,1,0},
					{0,0,1,0,0},
					{0,1,0,0,0},
					{1,0,0,0,0}
			};
			assertTrue(bingoCount(arr)==1);
		}
		
		//7. X자
		@Test
		public void test7() {
			int[][] arr = {
					{1,0,0,0,1},
					{0,1,0,1,0},
					{1,0,1,0,0},
					{0,1,0,1,0},
					{1,0,0,0,1}
			};	
			assertTrue(bingoCount(arr)==2);
		}
		
		//8. 가로1줄, 세로1줄, 하향대각선1줄
		@Test
		public void test8() {
			int[][] arr = {
					{1,1,1,1,1},
					{1,1,0,0,0},
					{1,0,1,0,0},
					{1,0,0,1,0},
					{1,0,0,0,1}
			};
			assertTrue(bingoCount(arr)==3);
		}
		
		//9. 가로1줄, 세로1줄, 상향대각선1줄
		@Test
		public void test9() {
			int[][] arr = {
					{1,1,1,1,1},
					{1,0,0,1,0},
					{1,0,1,0,0},
					{1,1,0,0,0},
					{1,0,0,0,0}
			};
			assertTrue(bingoCount(arr)==3);
		}
		
		//10. 가로1줄, 세로1줄, 대각선2줄
		@Test
		public void test10() {
			int[][] arr = {
					{1,1,1,1,1},
					{1,1,0,1,0},
					{1,0,1,0,0},
					{1,1,0,1,0},
					{1,0,0,0,1}
			};
			assertTrue(bingoCount(arr)==4);
		}
		
		//11. 모두0
		@Test
		public void test11() {
			int[][] arr = {
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0},
					{0,0,0,0,0}
			};
			assertTrue(bingoCount(arr)==0);
		}
		
		//12. 모두1
		@Test
		public void test12() {
			int[][] arr = {
					{1,1,1,1,1},
					{1,1,1,1,1},
					{1,1,1,1,1},
					{1,1,1,1,1},
					{1,1,1,1,1}
			};
			assertTrue(bingoCount(arr)==12);
		}
		
		//13. 세로 1줄, 가로 1줄, 대각선 2줄
		@Test
		public void test13() {
			int[][] arr = {
					{1,0,1,0,1},
					{0,1,1,1,0},
					{1,1,1,1,1},
					{0,1,1,1,0},
					{1,0,1,0,1}
			};
			assertTrue(bingoCount(arr)==4);
		}
}
