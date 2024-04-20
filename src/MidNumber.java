public class MidNumber {
	//세 개의 정수를 받아서 중간크기의 값을 반환하는 mid() 메서드를 작성하라
	//입력값 x,y,z -> 출력값 result
	public static void main(String[] args) {
		Calculator1 cal1 = new Calculator1();
	
		System.out.println(cal1.mid(0, 0, 0));
		System.out.println(cal1.mid(1, 2, 3));
		System.out.println(cal1.mid(2, 3, 4));
		System.out.println(cal1.mid(4, 1, 5));
		
	}

}

class Calculator1 {
	
	int mid(int x, int y, int z) {
		//1. 같은수이면 x를리턴
		if(x==y && y==z) return x;
		else {
			//2. max를 사용해서 최댓값
			int max = x;
			if(max < x) max = x;
			if(max < y) max = y;
			if(max < z) max = z;
			
//			System.out.println(max);
			
			//3. min을 사용해서 최솟값
			int min = x;
			if(min > x) min = x;
			if(min > y) min = y;
			if(min > z) min = z;
			
//			System.out.println(min);
			
			//4. 중간값
			int mid = 0;
//			if(min < x && x < max) System.out.println("mid = " + x);
//			if(min < y && y < max) System.out.println("mid = " + y);
//			if(min < z && z < max) System.out.println("mid = " + z);
			if(min < x && x < max) mid = x;
			if(min < y && y < max) mid = y;
			if(min < z && z < max) mid = z;
			
			return mid;
		}
	}
	
}
