package mazeGenerator;
import java.util.Random;
import maze.Maze;
import static maze.Maze.*;
public class RecursiveBacktrackerGenerator implements MazeGenerator {

	@Override
	public void generateMaze(Maze maze) {               
            // Select a random starting location that is less than or equal
            //to the current size of the maze.
                Random rand = new Random();
                int startX = rand.nextInt(maze.sizeR)+1;
                int startY = rand.nextInt(maze.sizeC)+1;
                
                if(startX == maze.sizeR && startY == maze.sizeC){
                    maze.map[startX][startY].neigh[WEST].wall[EAST].present=false;
                }
                
                
                
                
        
        
	} // end of generateMaze()

} // end of class RecursiveBacktrackerGenerator
