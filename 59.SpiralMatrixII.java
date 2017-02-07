public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        generateMatrix(0, result, 1);
        return result;
    }
    
    private void generateMatrix(int x, int[][] mat, int min) {
        if (x >= (mat.length+1)/2) {
            return;
        }
        
        for (int i=x; i<mat[0].length-x; i++) {
            mat[x][i] = min++;
        }
        for (int i=x+1; i<mat.length-x; i++) {
            mat[i][mat[0].length-1-x] = min++;
        }
        for (int i=mat[0].length-2-x; i>=x; i--) {
            mat[mat.length-1-x][i] = min++;
        }
        for (int i=mat.length-2-x; i>=x+1; i--) {
            mat[i][x] = min++;
        }
        generateMatrix(x+1, mat, min);
    }
}
