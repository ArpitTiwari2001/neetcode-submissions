class Solution {
    public boolean isValidSudoku(char[][] board) {
       HashMap<Integer, HashSet> row=new HashMap<>();
        HashMap<Integer, HashSet> column=new HashMap<>();
        HashMap<String, HashSet> square=new HashMap<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                int srow=i/3;
                int scol=j/3;
                String skey=""+srow+""+scol;
                row.putIfAbsent(i, new HashSet<>());
                column.putIfAbsent(j, new HashSet<>());
                square.putIfAbsent(skey, new HashSet<>());
                if(row.get(i).contains(board[i][j]) || column.get(j).contains(board[i][j]) || square.get(skey).contains(board[i][j])){
                    return false;
                }
                row.get(i).add(board[i][j]);
                column.get(j).add(board[i][j]);
                square.get(skey).add(board[i][j]);
            }
        }
        return true; 
    }
}
