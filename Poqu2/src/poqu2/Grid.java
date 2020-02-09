/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poqu2;

/**
 *
 * @author User
 */
public class Grid {
    // IMPORTANT: Y AND X FLIPPED
    private String[][] world = new String[5][5];
    private boolean[][] exploredWorld = new boolean[5][5];
    private String[] observedPoqu = new String[10]; // change size l8tr sk8r // DAIJI DA!!!
    private String[][] poquLocations = new String[5][5];
    
    public String[][] getWorld() {
        return world;
    }
    
    public boolean[][] getExploredWorld() {
        return exploredWorld;
    }
    
    public String[] getObservedPoqu() {
        return observedPoqu;
    }
    
    public String[][] getPoquLocations() {
        return poquLocations;
    }
    
    public static String[][] makeWorld(String[][] world, int posX, int posY, boolean[][] exploredWorld) {
        
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[0].length; j++) {
                if (posY == j && posX == i) {
                    world[i][j] = "P"; // cool user symbol; user iru!
                } else if (isExplored(exploredWorld, i, j)){
                    world[i][j] = "O"; // user inai, space was explored
                } else {
                    world[i][j] = "*";
                }
            }
        }
        
        return world;
    }
    
    // inserts random # of poqu accross the grid in various random coords, updates poquLocations[][]
    public static void insertPoqu(String[][] poquLocations) { // amount of poqu is less than half of the grid's total size (columns * rows)
    }
    
    public static boolean isExplored(boolean[][] exploredWorld, int posX, int posY) {
    
        return exploredWorld[posY][posX];
    
    }
    
    public static void printWorld(String[][] world) {
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[0].length; j++) {
                System.out.print(world[i][j] + " ");
            }
            System.out.println();
        }
    }
    

    
    
}
