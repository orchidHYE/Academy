package chap05;

//다차원배열 (p190) : 행과 열로 구성된 배열을 2차원 배열이라고 한다.
//행 : 줄 row
//열 : 칸 column
public class ArrayEx04_p190 {

	public static void main(String[] args) {
		int[][] scores = {
				          {10, 20, 30, 40, 50},
			              {20, 30, 40, 50, 60},
		                  {30, 40, 50, 60, 70}
					      };
		
		/*int[][] scores = {{[0,0], [0,1],[0,2],[0,3],[0,4],
						     [1,0], [1,1],[1,2],[1,3],[1,4],           
						     [2,0], [2,1],[2,2],[2,3],[2,4]}};
	    */
		
		System.out.println("scores = " + scores); //[[I@15db9742
		System.out.println("scores = " + scores.length); // 3
		
		for (int i = 0; i<scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
			System.out.println("scores[" + i + "].length = " + scores[i].length);
			for (int j=0; j<scores[i].length; j++) 
				System.out.println("scores[" + i + "," + j + "] = " + scores[i][j]);
			}
		
		//가변 배열
		//int[][] scores1 = {{10, 20, 30},
				//{20, 30, 40, 50
		//}
		
		/*
		System.out.println("scores[0] = " + scores[0]); //[I@6d06d69c
		System.out.println("scores[1] = " + scores[1]); //[I@7852e922
		System.out.println("scores[2] = " + scores[2]); //[I@4e25154f
		
		System.out.println("scores[0].length = " + scores[0].length);
		System.out.println("scores[1].length = " + scores[1].length);
		System.out.println("scores[2].length = " + scores[2].length);
		
		System.out.println("scores[0][1] = " + scores[0][1]); 
		System.out.println("scores[1][4] = " + scores[1][4]); 
		System.out.println("scores[2][2] = " + scores[2][2]);
		*/
		
		/*
		int[] KorScores = {20, 30, 40, 50, 60};
		System.out.println("KorScores = " + KorScores); // [I@6d06d69c
		System.out.println("KorScores = " + KorScores.length); // 5
		*/
		
	}

}
