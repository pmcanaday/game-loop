package myApp;

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
        
        TextUi ui = new TextUi();
        ui.doCommands();
    }
}
