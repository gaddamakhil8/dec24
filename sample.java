package dec24;

public class sample {

	public static void main(String[] args) {
	 {
			int[][] data = new int[3][3];// 6
			
			data[0][0]=1;
			data[0][1]=2;
			data[0][2]=3;
			
			data[1][0]=4;
			data[1][1]=5;
			data[1][2]=6;
			
			data[2][2]=1;
			data[2][1]=2;
			data[2][0]=3;
			
			
			for(int r=0;r<=3;r++) {
				for(int c=0;c<=3;c++) {
					System.out.print(data[r][c]+" "); 
				}
				System.out.println();
			}
			}

		}
	

}
