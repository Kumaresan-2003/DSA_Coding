package PS09_Hands_0n;

public class SearchMatrix {
	public static boolean searchMatrix(int[][] mat, int target) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == target) {
					return true;
				}
			}
		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 3;
		System.out.print(searchMatrix(mat,target));

	}

}
