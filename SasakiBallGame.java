import java.util.*;
public class SasakiBallGame{
	public static void main(String[] args){
		final int round = 5;
		int[] balls = new int[100];
		int[] ballA = new int[round];
		int[] ballB = new int[round];
		String winner;
		int winBallA = 0;
		int winBallB = 0;
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
		for(int i=0;i<round;i++){
			//交互にボールを取る
			ballA[i] = balls[i];//先頭から順番に取っていく
			ballB[i] = balls[balls.length -1 -i];//後ろから順番に取っていく
			//AとBを比較して、それぞれの勝利回数カZZZウント
			if(ballA[i] > ballB[i]){
				winner = "A";
				winBallA++;
			}else{
				winner = "B";
				winBallB++;
			}
			//各対戦の結果表示
			System.out.printf("%d回戦%n",i+1);
			System.out.printf("A:%3d,B:%3d...%sの勝ち%n",ballA[i],ballB[i],winner);
		}
		//最終結果表示
		System.out.printf("%d対%dで%sの勝ち",winBallA,winBallB,winBallA>winBallB?"A":"B");
	}
}
