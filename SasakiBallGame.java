import java.util.*;
public class SasakiBallGame{
	public static void main(String[] args){
		int[] balls = new int[100];
		int[] ballA = new int[5];
		int[] ballB = new int[5];
		int winBallA = 0;
		int winBallB = 0;
		int round = 5;
		//ボール番号を割り振る
		for(int i=0;i<balls.length;i++){
			balls[i] = i+1;
		}
		//ボール番号シャッフル
		for(int i=0;i<balls.length-1;i++){
			int index = new Random().nextInt(balls.length-i)+i;
			int temp = balls[index];
			balls[index] = balls[i];
			balls[i] = temp;
		}
		//ゲーム開始
		int num =0;
		for(int i=0;i<round*2;i++){
			ballA[num] = balls[i];
			ballB[num] = balls[i+1];
			i++;
			if(ballA[num] > ballB[num]){
				winBallA++;
			}else{
				winBallB++;
			}
			System.out.printf("%d回戦%n",i);
			System.out.printf("A:%3d,B:%3d...%sの勝ち%n",ballA[num],ballB[num],ballA[num]>ballB[num]?"A":"B");
			num++;
		}
		System.out.printf("%d対%dで%sの勝ち",winBallA,winBallB,winBallA>winBallB?"A":"B");
	}
}
