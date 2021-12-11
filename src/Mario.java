public class Mario {

    int[][] board = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 4, 0, 1},
            {0, 0, 0, 0, 0, 4, 0, 0, 1, 1, 1, 0, 0, 0, 1},
            {1, 0, 2, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1},
            {1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1},
            {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1},
            {1, 4, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 3},
            {1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 4, 0, 0, 0, 1,},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1} };

    int score;
    boolean dead = false;

    int[] currLocation = findMario();

    public Mario(){
        evaluate();
    }

    public void moves(int[] moveSet){


        for (int i = 0; i < moveSet.length; i++){
            if (moveSet[i] == 1)
                System.out.println(""); //place holder Lol
        }

    }

    public void moveUp(){


        if (currLocation[0] != 0) {
            if (board[currLocation[0] - 1][currLocation[1]] == 1) return;
            if (board[currLocation[0] - 1][currLocation[1]] == 4) dead = true;

            board[currLocation[0]][currLocation[1]] = 0;
            board[currLocation[0] - 1][currLocation[1]] = 2;
        }
        currLocation[0]--;
        evaluate();
    }

    public void moveDown(){

        if (currLocation[0] != board.length ) {
            if (board[currLocation[0] + 1][currLocation[1]] == 1) return;
            if (board[currLocation[0] + 1][currLocation[1]] == 4) dead = true;

            board[currLocation[0]][currLocation[1]] = 0;
            board[currLocation[0] + 1][currLocation[1]] = 2;
        }
        currLocation[0]++;
        evaluate();
    }

    public void moveRight(){

        if (currLocation[1] != board[currLocation[0]].length - 1) {
            if (board[currLocation[0]][currLocation[1] + 1] == 1) return;
            if (board[currLocation[0]][currLocation[1] + 1] == 4) dead = true;

            board[currLocation[0]][currLocation[1]] = 0;
            board[currLocation[0]][currLocation[1] + 1] = 2;
        }
        currLocation[1]++;
        evaluate();
    }

    public void moveLeft(){

        if (currLocation[1] != 0 ) {
            if (board[currLocation[0]][currLocation[1] - 1] == 1) return;
            if (board[currLocation[0]][currLocation[1] - 1] == 4) dead = true;

            board[currLocation[0]][currLocation[1]] = 0;
            board[currLocation[0]][currLocation[1] - 1] = 2;
        }
        currLocation[1]--;
        evaluate();
    }


    public void evaluate(){
        int[] goal = findGoal();

        score = 0;
        score += Math.abs(currLocation[0] - goal[0]);
        score += Math.abs(currLocation[1] - goal[1]);
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

    public void printMaze(){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
    }

}
