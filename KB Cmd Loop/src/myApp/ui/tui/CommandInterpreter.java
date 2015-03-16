package myApp.ui.tui;

/**
 * Now we move on to a slightly more formal approach to handling
 * commands. We simply use an existing command line interpreter
 * with command definitions for all commands. This is only possible
 * if the command set can be compliant with the usual shell command 
 * standards.
 * 
 * Any of the open source CLIs out there could be used. Here we use 
 * jopt-simple from https://pholser.github.io/jopt-simple/.
 * 
 * The basic idea is for the controller to get command strings from the 
 * console then give them to the interpreter, which checks for errors and,
 * if valid, passes back some command object that contains all of the
 * validate information; otherwise an error message is returned.
 * 
 * Don't be fooled. This is not the classic command design pattern in
 * which command objects know to execute themselves. Nor is it a 
 * chain of command pattern in which missing data can be prompted and
 * used to build up the full command. We just want to play with looping
 * over an existing CLI.
 * 
 * In this example
 * 
 * @author Mike Canaday
 *
 */
public class CommandInterpreter {

}
