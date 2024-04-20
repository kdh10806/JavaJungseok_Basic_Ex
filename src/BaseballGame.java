import java.util.Arrays;
import java.util.Scanner;

public class BaseballGame {

	//게임으로 만들기
	//두 배열을 비교해서 값이 같고 위치가 같으면 strike++
	//값이 같고 위치가 다르면 ball++;
	//숫자 1~9, 중복은 없다.
	//strike가 3이 되면 게임오버
	//결과 -> 1S2B, 총00회 도전하셨습니다.
	
	public static void main(String[] args) {
		int gameCnt = 1; //도전횟수 
		int[] comArr = new int[3]; //컴퓨터 선택
		int[] plyArr = new int[3]; //플레이어 선택
				
		//1. 1~9의 배열을 섞어서 거기서 3개의 숫자를 뽑기
		int[] numArr = {1,2,3,4,5,6,7,8,9};
		for(int i = 0; i < numArr.length; i++) {
			int n = (int)(Math.random()*9);
			int tmp = numArr[i];
			numArr[i] = numArr[n];
			numArr[n] = tmp;
		}
		
		//1-1. 뽑은 숫자 배열에 저장
		for(int i = 0; i < comArr.length; i++) {
			comArr[i] = numArr[i];
		}

		//임시확인용
		System.out.println(Arrays.toString(comArr));
		
		//2. 플레이어에게 질문으로 숫자 3개를 받아온다.
		//입력부 무한 반복
		while(true) {
			Scanner scanner = new Scanner(System.in);
			int count = 0; //질문 순서
			
			while(true) {
				System.out.printf("%d. 1부터 9까지의 정수를 입력하세요 : ",count+1);
				Integer choiceNum = scanner.nextInt();
				
				//2-1. 1~9검사
				if(((choiceNum<1)||(9<choiceNum))) {
					System.out.println("1부터 9까지의 정수만 입력가능합니다.");
					continue;
				}
				
				//2-2. 중복검사(count가 1이상일경우 전에 입력한 숫자(배열)과 비교)
				if((count>=1)&&(plyArr[count-1]==choiceNum)) {
					System.out.println("중복된 숫자는 입력할 수 없습니다.");
					continue;
				}
								
				//2-3. 받아온 숫자를 배열에 저장하고 인덱스 증가				
				plyArr[count] = choiceNum;
				count++;
				
				//2-4.배열에 3개의 숫자가 저장되면 break.(저장 위치 index로 판별)
				if(count==3) break;
			}
			System.out.println("나의 선택 : " + Arrays.toString(plyArr));
			
			//3. 
			//(1) 두 수 비교
			//(2) 같으면 인덱스 비교(인덱스 같으면 s++, 다르면 b++)
			//(3) 다르면 패스
			int s = 0;
			int b = 0;
			for(int i = 0; i < comArr.length; i++) {
				for(int j = 0; j < plyArr.length; j++) {
					if(comArr[i] == plyArr[j]) {
						if(i==j) s++;
						else b++;
					}
				}
			}
			
			//4. 결과값 출력
			System.out.println("**********************************");
			System.out.printf("결과 : %d S %d B\n",s,b);
			System.out.println("**********************************");
			
			//5. 3S면 게임오버, 총 도전횟수, 컴배열 출력
			if(s==3) {
				System.out.println("*************축하합니다!*************");
				System.out.println("세숫자 모두 맞추셨습니다!");
				System.out.println("컴퓨터의 선택 : " + Arrays.toString(comArr));
				System.out.println("도전횟수 : " + gameCnt);
				System.out.println("**********************************");
				break;
			} else {
				//5-1. 3S가 아니면 도전횟수 증가시키고 새 게임 시작
				gameCnt++;
			}
		}
	}

}
