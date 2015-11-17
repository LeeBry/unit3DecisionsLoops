import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;

    // the game board will have 10 rows and 10 columns
    private final int ROWS = 10;
    private final int COLS = 10;
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the three cells initially alive
        /* expected pattern for initial state
         *  (X: alive; -: dead) 
         *    1 2 3 4 5 6 7 8 9 10 
         *  1 - - - - - - - - - - 
         *  2 - - - - - - - - - - 
         *  3 - - - - - - - - - - 
         *  4 - - - - - - - - - -  
         *  5 - - - - - - - - - - 
         *  6 - - X X X X X - - - 
         *  7 - - - - - - - - - - 
         *  8 - - - - - - - - - - 
         *  9 - - - - - - - - - -  
         *  10- - - - - - - - - - 
         */
        final int X1 = 3, Y1 = 6;
        final int X2 = 4, Y2 = 6;
        final int X3 = 5, Y3 = 6;
        final int X4 = 6, Y4 = 6;
        final int X5 = 7, Y5 = 6;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add actors to the five initial locations given.
        Actor act1 = new Actor();
        Location loc1 = new Location(Y1, X1);
        grid.put(loc1, act1);
        
        Actor act2 = new Actor();
        Location loc2 = new Location(Y2, X2);
        grid.put(loc2, act2);
        
        Actor act3 = new Actor();
        Location loc3 = new Location(Y3, X3);
        grid.put(loc3, act3);
        
        Actor act4 = new Actor();
        Location loc4 = new Location(Y4, X4);
        grid.put(loc4, act4);
        
        Actor act5 = new Actor();
        Location loc5 = new Location(Y5, X5);
        grid.put(loc5, act5);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    private void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        // RULES:
        /*
         * 1. Cell with fewer tjam 2 neighbours will die
         * 2. Cell with 3+ neighbours will die.
         * 3. Cell with 2-3 neighbours will will till next gen.
         * 4. Dead cells with exactly 3 live cells becomes alive.
         */
        // insert magic here...
        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                
            }
        }
        
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    {
        GameOfLife game = new GameOfLife();
    }

}
