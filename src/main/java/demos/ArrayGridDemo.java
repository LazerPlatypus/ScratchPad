package demos;

public class ArrayGridDemo {

	public static void run() {
		demoMultiDArrays();
	}
	
	private static void demoMultiDArrays() {
//		int[][][][] nums; //a four dimensional array
		/* 2D array
		 * [ ]  [ ]  [ ]
		 *  |    |    |
		 *  |    |    V
		 *  |    |   [ ] [ ] [ ]
		 *  |    V
		 *  |   [ ] [ ] [ ]
		 *  V
		 * [ ] [ ] [ ]
		 * 
		 * 3D array
		 * [ ] [ ] [ ]
		 *  |   |   |
		 *  |   |   |
		 *  |   |   V
		 *  |   |  [ ] [ ] [ ]
		 *  |   |   |   |   |
		 *  |   |   |   |   V
		 *  |   |   |   |  [ ] [ ] [ ]
		 *  |   |   |   V
		 *  |   |   |  [ ] [ ] [ ]
		 *  |   |   V
		 *  |   |  [ ] [ ] [ ]
		 *  |   |
		 *  |   V
		 *  |  [ ] [ ] [ ]
		 *  |   |   |   |
		 *  |   |   |   V
		 *  |   |   |  [ ] [ ] [ ]
		 *  |   |   V
		 *  |   |  [ ] [ ] [ ]
		 *  |   V
		 *  |  [ ] [ ] [ ]
		 *  |
		 *  V
		 * [ ] [ ] [ ]
		 *  |   |   |
		 *  |   |   V
		 *  |   |  [ ] [ ] [ ]
		 *  |   V
		 *  |  [ ] [ ] [ ]
		 *  V
		 * [ ] [ ] [ ]
		 * 
		 */
		int[][] nums = new int[3][5];
		nums[0][2] = 10;
//		compact, hard to read version: **note: slower. its worse in every way.**
//		nums[nums.length-1][nums[nums.length-1].length-1] = 14;
		int lastRow = nums.length-1;
		int lastCol = nums[lastRow].length-1;
		nums[lastRow][lastCol] = 14;
//		compact, hard to read version: **note: slower. its worse in every way.**
//		nums[0][0] = nums[0][2] + nums[nums.length-1][nums[nums.length-1].length-1];
		nums[0][0] = nums[0][2]+nums[lastRow][lastCol];
		
		//return length of the cols in nums
		//return the length of the rows in nums
		for (int[] rowData : nums) {
			System.out.print("[");
			for (int colData : rowData) {
				System.out.print(colData);
				System.out.print(",\t");
			}
			System.out.println("], ");
		}
		
	}
}
