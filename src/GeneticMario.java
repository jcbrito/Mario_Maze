public class GeneticMario {

    public static void main(String[] args){

        Mario mario = new Mario();

        System.out.println("Manhattan distance is: " + mario.score);

        System.out.println("Original Board");
        System.out.println("Curr location: (" + mario.currLocation[0] + ", " + mario.currLocation[1]+")");

        mario.printMaze();
        System.out.println();
        System.out.println("Moves");
        System.out.println("Curr location: (" + mario.currLocation[0] + ", " + mario.currLocation[1]+")");

        mario.moveUp();
        System.out.println("Curr location: (" + mario.currLocation[0] + ", " + mario.currLocation[1]+")");

        mario.moveUp();
        System.out.println("Curr location: (" + mario.currLocation[0] + ", " + mario.currLocation[1]+")");

        mario.printMaze();
        System.out.println("Manhattan distance is: " + mario.score);

//        System.out.println();
//        System.out.println("Moved Down");
//        mario.moveDown();
//        mario.printMaze();
//        System.out.println();
//        System.out.println("Move right");
//        mario.moveRight();
//        mario.printMaze();
//        System.out.println();
//        System.out.println("Move Left");
//        mario.moveLeft();
//        mario.printMaze();
    }

}
