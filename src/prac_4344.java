import java.util.*;

public class prac_4344 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int C = 0; //�׽�Ʈ ���̽� ����
		C = s.nextInt();
		int N = 0; //�л��Ǽ�
		int[][] arr = new int[C][];
		int tmp = 0;
		int total[] = new int[C]; //N���� ���� �ջ�
		float average[] = new float[C]; //��� (���� �ջ� /C)
		int count[] = new int[C]; //��� �Ѵ� �л� �� ����
		float percent[] = new float[C]; //����
		
		for(int i=0;i<C;i++) {
			N = s.nextInt();
			arr[i] = new int[N];
			for (int j=0;j<N;j++) {
				tmp = s.nextInt();
				arr[i][j] = tmp;
				total[i] += arr[i][j];
			}
			average[i] = (float)(total[i]/(float)N);
			
			for(int k=0;k<N;k++) {
				if((float)arr[i][k] > average[i]) {
					count[i]++;
				}
			}
			
			for(int l=0;l<N;l++) {
				percent[i] = ((count[i]/(float)N)*100);
			}
			
			
			System.out.println(String.format("%.3f", percent[i])+"%");
		}
	}
}
