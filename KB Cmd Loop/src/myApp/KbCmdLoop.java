package myApp;

import myApp.ui.tui.CommandCliParser;
import myApp.ui.tui.TextUi;

/**
 * This is just an exercise. Transmogrification into a game will come later.
 * For now, focus on moving the kb loop into a method and then into a new class.
 * Also pay attention to the packaging as it portends game design.
 * 
 * @author Mike Canaday
 *
 */
public class KbCmdLoop {

    public static void main(String[] args) {
        
        // Lesson 1 - most simple
        //TextUi ui = new TextUi();
        //ui.doCommands();
        
        // Lesson 2 - the annoyingly crude CLI
        CommandCliParser cliParser = new CommandCliParser();
        cliParser.parseCommand("--verbose");
    }
}
