import java.util.*;
public class SasakiBallGame{
	public static void main(String[] args){
		int[] balls = new int[100];
		int[] ballA = new int[5];
		int[] ballB = new int[5];
		int winBallA = 0;
		int winBallB = 0;
		for(int i=0;i<balls.length;i++){
			balls[i] = i+1;
		}
		for(int i=0;i<balls.length-1;i++){
			int index = new Random().nextInt(balls.length-i)+i;
			int temp = balls[index];
			balls[index] = balls[i];
			balls[i] = temp;
		}
		for(int i=0;i<5;i++){
			ballA[i] = balls[i];
			ballB[i] = balls[i+1];
			if(ballA[i] > ballB[i]){
				winBallA++;
			}else{
				winBallB++;
			}
			System.out.printf("%d回戦%n",i);
			System.out.printf("A:%3d,B:%3d...%sの勝ち%n",ballA[i],ballB[i],ballA[i]>ballB[i]?"A":"B");
		}
		System.out.printf("%d対%dで%sの勝ち",winBallA,winBallB,winBallA>winBallB?"A":"B");
	}
}
