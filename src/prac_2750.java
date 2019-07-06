import java.util.*;

public class prac_2750 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int arr[] = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = s.nextInt();
		} //input
		
		for(int x=1;x<=N;x++) {
			for(int y=0;y<N-x;y++) {
				if(arr[y] > arr[y+1]) {
					int tmp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = tmp;
				}
			}
		}
		
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}
}
