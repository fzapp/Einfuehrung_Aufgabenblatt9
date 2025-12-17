package p2;

public class P2_main {
	public static int[][] grid;

	public static void main(String[] args) {
		grid = new int[3][3];
		grid[0][0]=-1;
		grid[1][0] = -1;
		grid[2][2] = -1;
		// TODO Auto-generated method stub

	}
	
	public static int[][] anzahlMinusEinsNachbarn(){
		int[][] output = new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(grid[i][j] == 0) {
					output[i][j] = anzahlMinusEinsNachbarn(i,j);
				}
			}
		}
		return output;
	}
	
	public static int anzahlMinusEinsNachbarn(int a, int b){
		int nachbarn = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(grid[i][j] == -1 && istBenachbart(a,b,i,j)) {
					nachbarn++;
				}
			}
		}
		return nachbarn;
	}
	
	public static boolean istBenachbart(int a, int b, int c, int d) {
		if(a+1 != c && a-1 != c) {
			return false;
		}
		if(b+1 != d && b-1 != d) {
			return false;
		}
		return true;
	}

}
