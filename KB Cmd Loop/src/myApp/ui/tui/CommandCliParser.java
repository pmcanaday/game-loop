package myApp.ui.tui;

import java.util.Arrays;
import java.util.List;
import java.util.Arrays.*;

import joptsimple.OptionParser;
import joptsimple.OptionSet;

/**
 * Now we move on to a slightly more formal approach to handling
 * commands. We simply use an existing command line interpreter
 * with command definitions for all commands. This is only possible
 * if the command set can be compliant with the usual shell command 
 * standards.
 * 
 * Any of the open source CLIs out there could be used. Here we use 
 * jopt-simple from https://pholser.github.io/jopt-simple/ (4.8).
 * 
 * The basic idea is for the controller to get command strings from the 
 * console then give them to the interpreter, which checks for errors and,
 * if valid, passes back some command object that contains all of the
 * validated information; otherwise an error message is returned.
 * 
 * Don't be fooled. This is not the classic command design pattern in
 * which command objects know to execute themselves. Nor is it a 
 * chain of command pattern in which missing data can be prompted and
 * used to build up the full command. We just want to play with looping
 * over an existing CLI.
 * 
 * In this example, we'll only do a few commands.
 * 
 * A particularly goofy result of this approach is non-option arguments must
 * be used for the command strings. That's ok, but non-posixly allows the
 * non-option args to be anywhere in the command string. So "warp 4" is 
 * equivalent to "4 warp". I hope we're beginning to see the utility of a 
 * parser generator for our domain specific language. Anyway, here we go.
 * 
 * Nice try, but this is a total bust. The Unix command line is just not
 * suitable as an embedded DSL.
 * 
 * @author Mike Canaday
 *
 */
public class CommandCliParser {
    
    
    /**
     * Initialize all option parsers; one for each command
     */
    public CommandCliParser() {
        
    }

    public void parseCommand(String cmdStr) {
        OptionParser parser = new OptionParser();
        parser.accepts("flag");
        parser.accepts("verbose");
        
        OptionSet opts = parser.parse("--flag");
        System.out.println("opts: " + opts.has("flag"));
        
        OptionSet cmdStrOpts = parser.parse(cmdStr);
        System.out.println("opts: " + cmdStrOpts.has("verbose"));
        
        List<String> l = Arrays.asList("a", "b", "c");
        for (String aChar : l) {
            System.out.println(aChar);
        }
    }
}
