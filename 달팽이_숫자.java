import java.util.Scanner;

public class 달팽이_숫자 {

	static int dy[] = {0,1,0,-1};
	static int dx[] = {1,0,-1,0};
	static int n;
	static int[][]map;
	static boolean[][] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int TC=sc.nextInt();
		
		for(int t=1;t<=TC;++t) {
			
			n = sc.nextInt();
			
			map = new int[n][n];
			visited = new boolean[n][n];
								
			dfs(0,0,1,0);//좌표 지점에서 탐색을 시작하여 map의 숫자를 바꿔준다. 
			
			System.out.println("#"+t);
			
			for(int y=0;y<n;++y) {
				for(int x=0;x<n;++x) {
					System.out.print(map[y][x]+" ");
				}
				System.out.println();				
			}
			
		}
	}
		

		static void dfs(int y, int x, int idx,int dir) {
			//0:우 , 1:하, 2:좌, 3:상
			//쭉쭉 탐색해나가다가 막히면 방향 바꾸기
			map[y][x] = idx;//숫자입력
			visited[y][x]=true;//방문표시
			
			if(idx>=(n*n)) {
				return;
			}
						
			int ny = y+dy[dir];
			int nx = x+dx[dir];//다음 위치 설정
			
			if(ny<0||ny>=n||nx<0||nx>=n||visited[ny][nx]==true) {
				dir =  (dir+1) % 4;
				ny = y+dy[dir];
				nx = x+dx[dir];
			}//범위 벗어났을 때 범위 바꿔주기
				
			dfs(ny,nx,idx+1,dir);
					
		}
		
		

}
