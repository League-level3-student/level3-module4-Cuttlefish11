package _04_Maze_Maker;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class MazeMaker {

    private static int rows;
    private static int cols;

    private static Maze maze;

    private static Random randGen = new Random();
    private static Stack<Cell> uncheckedCells = new Stack<Cell>();

    public static Maze generateMaze(int r, int c) {
        rows = r;
        cols = c;
        maze = new Maze(rows, cols);

        // 1. Pick a random cell along the border and remove its exterior wall.
        //    This will be the starting point. Then select a random cell along
        //    the opposite wall and remove its exterior wall. This will be the
        //    finish line.
       
     Cell[][] cells = maze.cells;
     
     Random rando = new Random();
     int rr0=0;
     int rc0=0;
     int q =0;
     while (q==0) {
    	 rr0=rando.nextInt(r);
         rc0=rando.nextInt(c);
    if(rr0==0) {
    	cells[rr0][rc0].setNorthWall(false);
    	q=1;
    }
    else if(rr0==(r-1)) {
    	cells[rr0][rc0].setSouthWall(false);
    	q=1;
    }
    else if(rc0==0) {
    	cells[rr0][rc0].setWestWall(false);
    	q=1;
    }
    else  if(rc0==(c-1)) {
    	cells[rr0][rc0].setEastWall(false);
    	q=1;
    }	
    }
    
        
       //
        
       // removeWalls(c1,c2);
        // 2. select a random cell in the maze to start 
       
        // 3. call the selectNextPath method with the randomly selected cell
selectNextPath(cells[rr0][rc0]);
        return maze;
    }

    // 4. Complete the selectNextPathMethod
    private static void selectNextPath(Cell currentCell) {
        // A. SET currentCell as visited
currentCell.setBeenVisited(true);
        // B. check for unvisited neighbors using the cell
boolean uvn = getUnvisitedNeighbors(currentCell).isEmpty();
        // C. if has unvisited neighbors,
if (uvn==true) {
        // C1. select one at random.
	ArrayList<Cell> ucell=getUnvisitedNeighbors(currentCell);
	Random ran=new Random();
	int q=ran.nextInt(ucell.size());
        // C2. push it to the stack
uncheckedCells.push(ucell.get(q));
        // C3. remove the wall between the two cells
/*
if(ucell.get(q).getCol()>currentCell.getCol()) {
	currentCell.setEastWall(false);
}
else if(ucell.get(q).getCol()<currentCell.getCol()) {
	currentCell.setWestWall(false);
}
else if(ucell.get(q).getRow()>currentCell.getRow()) {
	currentCell.setSouthWall(false);
}
else if(ucell.get(q).getRow()<currentCell.getRow()) {
	currentCell.setNorthWall(false);
} */
removeWalls(currentCell, ucell.get(q)){
        // C4. make the new cell the current cell and SET it as visited
currentCell=ucell.get(q);
currentCell.setBeenVisited(true);
        // C5. call the selectNextPath method with the current cell
selectNextPath(currentCell);
}
        // D. if all neighbors are visited
else if(uvn == false) {
	
        // D1. if the stack is not empty
if(uncheckedCells.isEmpty()==false) {
        // D1a. pop a cell from the stack
	currentCell=uncheckedCells.lastElement();
	uncheckedCells.pop();
        // D1b. make that the current cell

        // D1c. call the selectNextPath method with the current cell
	selectNextPath(currentCell);
}
    }
    }

    // This method will check if c1 and c2 are adjacent.
    // If they are, the walls between them are removed.
    private static void removeWalls(Cell c1, Cell c2) {
        if (c1.getRow() == c2.getRow()) {
            if (c1.getCol() > c2.getCol()) {
                c1.setWestWall(false);
                c2.setEastWall(false);
            } else {
                c1.setEastWall(false);
                c2.setWestWall(false);
            }
        } else {
            if (c1.getRow() > c2.getRow()) {
                c1.setNorthWall(false);
                c2.setSouthWall(false);
            } else {
                c1.setSouthWall(false);
                c2.setNorthWall(false);
            }
        }
    }

    // This method returns a list of all the neighbors around the specified
    // cell that have not been visited. There are up to 4 neighbors per cell.
    //          1
    //       2 cell 3
    //          4
    private static ArrayList<Cell> getUnvisitedNeighbors(Cell c) {
        int row = c.getRow();
        int col = c.getCol();

        ArrayList<Cell> unvisitedNeighbors = new ArrayList<Cell>();

        if (row > 0 && !maze.getCell(row - 1, col).hasBeenVisited()) {
            unvisitedNeighbors.add(maze.getCell(row - 1, col));
        }

        if (col > 0 && !maze.getCell(row, col - 1).hasBeenVisited()) {
            unvisitedNeighbors.add(maze.getCell(row, col - 1));
        }

        if (row < rows - 1 && !maze.getCell(row + 1, col).hasBeenVisited()) {
            unvisitedNeighbors.add(maze.getCell(row + 1, col));
        }

        if (col < cols - 1 && !maze.getCell(row, col + 1).hasBeenVisited()) {
            unvisitedNeighbors.add(maze.getCell(row, col + 1));
        }

        return unvisitedNeighbors;
    }
}
