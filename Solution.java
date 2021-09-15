public class Solution {
    public int solution(int[][] A){
        if (A == null || A.length == 0) {
            return 0;
        }
        int numIslands = 0;

        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < A[0].length; col++) {


                if (A[row][col] == 1) {

                    numIslands += checkNeighbors(A, row, col);
                }
            }
        }
        return numIslands;
    }

    public int checkNeighbors(int[][] grid, int row, int col) {

        if (row < 0 || row >= grid.length || col < 0 ||
                col >= grid[row].length || grid[row][col] == 0) {

            return 0;
        }
        grid[row][col] = 0;

        checkNeighbors(grid, row + 1, col);
        checkNeighbors(grid, row - 1, col);
        checkNeighbors(grid, row, col + 1);
        checkNeighbors(grid, row, col - 1);

        return 1;
    }
}

