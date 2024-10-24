package edu.usu.polyverse.main.tools;

/**
 * Parse the command line setting various options
 *
 * @author Curtis
 */
//import database.Database;
//import database.berkeleyDB.Database;
public class ParseCmdLine {

    public static String javaFileName = null;
    public static boolean verbose = false;

    public static void parse(String args[]) {
        int i = 0, j;
        String arg;

        while (i < args.length && (args[i].startsWith("-") || args[i].startsWith("--"))) {
            arg = args[i++];

            System.out.println("arg is " + arg);
            // use this type of check for "wordy" arguments
            if (arg.equals("-verbose") || arg.equals("-v") || arg.equals("--verbose")) {
                verbose = true;
            } else if (arg.equals("-parse") || arg.equals("-p") || arg.equals("--parse")) {
                if (i < args.length) {
                    javaFileName = args[i++];
                } else {
                    System.err.println("-parse requires a Java file name");
                }
            } else if (arg.equals("-db")) {
            }



        }

        if (i == args.length) {
            System.err.println("Usage: Java [-verbose] filename");
        } else {
            javaFileName = args[i];
        }
    }
}
