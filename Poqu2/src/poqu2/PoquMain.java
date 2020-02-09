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
public class PoquMain {
    
    public static void main(String[] args) {
        
        Grid cool = new Grid();
        int posX = 0;
        int posY = 4;
        String[][] world = new String[5][5]; 
        
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[0].length; j++) {
                world[i][j] = "";
            }
        }
        
         boolean[][] exploredWorld = new boolean[5][5];
         
         for (int i = 0; i < exploredWorld.length; i++) {
            for (int j = 0; j < exploredWorld[0].length; j++) {
                exploredWorld[i][j] = false;
            }
        }
         
         exploredWorld[0][0] = true;
         exploredWorld[0][3] = true;
         
         world = cool.makeWorld(world, posX, posY, exploredWorld);
         cool.printWorld(world);
         
    }
}
