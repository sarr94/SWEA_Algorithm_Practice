import java.util.Scanner;

public class 파스칼의_삼각형 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int TC = sc.nextInt();
		
		for(int t=1; t<=TC; ++t) {
			
			int n = sc.nextInt();
			int[][] map = new int[n][n];
			
			map[0][0]=1;
			for(int y=1;y<n;++y) {
				for(int x=0;x<=y;++x) {
					if(x==0)
						map[y][x]=1;
					else if(x==y)
						map[y][x]=1;
					else {						
						map[y][x]=map[y-1][x-1]+map[y-1][x];
					}
				}
			}
			
			System.out.println("#"+t+" ");
			for(int y=0;y<n;++y) {
				for(int x=0;x<=y;++x) {
					System.out.print(map[y][x]+" ");
				}
				System.out.println();
			}
			
			
		}
	}

}
