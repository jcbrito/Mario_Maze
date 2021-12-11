public class Mario {

    int[][] board = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 4, 0, 1},
            {2, 0, 0, 0, 0, 4, 0, 0, 1, 1, 1, 0, 0, 0, 1},
            {1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1},
            {1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1},
            {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1},
            {1, 4, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 3},
            {1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 4, 0, 0, 0, 1,},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1} };

    int score;
    boolean dead = false;

    public Mario(){
        evaluate();
    }

    public void evaluate(){
        int[] mario = findMario();
        int[] goal = findGoal();

        score = 0;
        score += Math.abs(mario[0] - goal[0]);
        score += Math.abs(mario[1] - goal[1]);
    }

    private int[] findMario(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 2)
                    return new int[] {i,j};
            }
        }
        return new int[] {0,0};
    }

    private int[] findGoal(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 3)
                    return new int[] {i,j};
            }
        }
        return new int[] {0,0};
    }


}
