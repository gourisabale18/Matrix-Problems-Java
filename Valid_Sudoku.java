Leet code Problem : 36
class Valid_Sudoku {
    public boolean isValidSudoku(char[][] board) {

        Set<String> hset=new HashSet<>();
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                //chk if position is filled
                if(board[i][j]!='.')

                {
                if(!hset.add("row"+i+board[i][j]) || !hset.add("col"+j+board[i][j]))
                {
                    //it means that element has duplicated in either row or col
                    return false;
                }
                if(!hset.add("box"+((i/3)*3+(j/3))+board[i][j]))
                {
                    //element is duplicated in box as well
                    return false;
                }
                }
            }

        }
        return true;
        
    }
}