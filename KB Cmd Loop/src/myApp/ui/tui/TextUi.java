package myApp.ui.tui;

import java.util.Scanner;

/**
 * At the moment, the doCommands() methods is the whole game. In most turn-based games
 * it is the primary driver. Soon, we will look at a design pattern that can
 * separate the game logic from the user interface.
 * 
 * @author Mike Canaday
 *
 */
public class TextUi {
    
    public void doCommands() {
        
        Scanner keyboard = new Scanner(System.in); // Scanner is powerful, we use it simply
        
        boolean processing = true;
        do {
            System.out.print("> ");
            String cmdLine = keyboard.nextLine().toUpperCase();
            
            // Parse the command and interpret the line - get all the goodies
            // Lots of elegant ways to do this. Here we go with simplicity
            // (and a little regular expression magic).
            String[] cmdArgs = cmdLine.split("\\s+");
            String cmd = cmdArgs[0];
            
            switch (cmd) {
            case "WARP":
                System.out.println("Sulu: alright already");
                
                break;
                
            case "FIRE":
                System.out.println("Chekov: we like killing Klingons");
                
                break;
                
            case "LRSCAN":
                System.out.println("Sir, we are blind");
                
                break;
                
            case "QUIT":
                processing = false;
                
                break;
                
            default:
                System.out.println("huh?");
                
                break;
            }
            
        } while (processing);
        
        System.out.println("May the Great Bird of the Galaxy roost upon your home planet.");
        keyboard.close();
    }

}
