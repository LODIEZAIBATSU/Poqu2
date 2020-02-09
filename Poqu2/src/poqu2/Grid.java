/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poqu2;
import java.util.Random;
/**
 *
 * @author User
 */
public class Grid {
    // IMPORTANT: Y AND X FLIPPED WHEN PRINTING
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
    
    // 100% working
    public static String[][] makeWorld(String[][] world, int posX, int posY, boolean[][] exploredWorld) {
        
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[0].length; j++) {
                if (posX == j && posY == i) {
                    world[i][j] = "P"; // cool user symbol; user iru!
                } else if (isExplored(exploredWorld, i, j)){
                    world[i][j] = "O"; // user inai, space was explored
                } else {
                    world[i][j] = "*"; // user inai && space was not explored
                }
            }
        }
        
        return world;
    }
    
    // inserts random # of poqu accross the grid in various random coords, updates poquLocations[][]
    public static String[][] insertPoqu(String[][] poquLocations) { // amount of poqu is less than half of the grid's total size (columns * rows)
        Random rand = new Random();
        int numberOfPoqu = rand.nextInt((poquLocations.length * poquLocations[0].length) / 2);
        numberOfPoqu += 2; // we gotta have at least two poqu
        for (int i = 0; i < numberOfPoqu; i++) {
            int rand1 = rand.nextInt(poquLocations.length);
            int rand2 = rand.nextInt(poquLocations.length);
            poquLocations[rand1][rand2] = "1";
        }
        
        return poquLocations;
    }
    
    public static boolean isExplored(boolean[][] exploredWorld, int posX, int posY) {
    
        return exploredWorld[posX][posY];
    
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
