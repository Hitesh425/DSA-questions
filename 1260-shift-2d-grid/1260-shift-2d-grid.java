class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        Queue<Integer> Q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        for (int[] i : grid){
            for (int j : i){
                Q.add(j);
            }
        }
        k=(n*m)-k%(n*m);
        for (int i=0; i<k; i++){
            Q.add(Q.remove());
        }
        List<List<Integer>> arr = new ArrayList<>();
        for (int i=0; i<n; i++){
            List<Integer> row = new ArrayList<>();
            for (int j=0; j<m; j++){
                row.add(Q.remove());
            }
            arr.add(row);
        }
        return arr;
    }
}