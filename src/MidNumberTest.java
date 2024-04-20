import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MidNumberTest {
	int mid(int x, int y, int z) {
		//1. 세 값이 같을땐 x를 리턴
		if(x==y && y==z) return x;
		else {
			//2. max를 사용해서 최댓값
			int max = x;
			if(max < x) max = x;
			if(max < y) max = y;
			if(max < z) max = z;
			
			//3. min을 사용해서 최솟값
			int min = x;
			if(min > x) min = x;
			if(min > y) min = y;
			if(min > z) min = z;
			
			//4. 중간값
			int mid = 0;
			if(min < x && x < max) mid = x;
			if(min < y && y < max) mid = y;
			if(min < z && z < max) mid = z;
			
			return mid;
		}
	}
	
	//테스트
	@Test
	public void test() {
		//참이면 OK, 거짓이면 실패(에러)
		assertTrue(mid(1,2,3)==2);
	}
	public void test2() {
		//참이면 OK, 거짓이면 실패(에러)
		assertTrue(mid(1,1,1)==1);
	}
	public void test3() {
		//참이면 OK, 거짓이면 실패(에러)
		assertTrue(mid(4,1,5)==4);
	}
	public void test4() {
		//참이면 OK, 거짓이면 실패(에러)
		assertTrue(mid(3,2,1)==2);
	}
	public void test5() {
		//참이면 OK, 거짓이면 실패(에러)
		assertTrue(mid(5,6,7)==6);
	}
	public void test6() {
		//참이면 OK, 거짓이면 실패(에러)
		assertTrue(mid(0,0,0)==0);
	}
	public void test7() {
		//참이면 OK, 거짓이면 실패(에러)
		assertTrue(mid(4,8,10)==8);
	}

}
