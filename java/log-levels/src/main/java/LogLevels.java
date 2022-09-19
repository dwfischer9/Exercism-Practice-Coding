public class LogLevels {
    
    public static String message(String logLine) {
       String[] logSplit = logLine.split(" ", 2);
       return logSplit[1].strip();
    }

    public static String logLevel(String logLine) {
        String[] logSplit = logLine.split(" ", 2);
        return (logSplit[0].substring(1,(logSplit[0].length()-2))).toLowerCase();
    }
        

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine)+ ")"; 
    }
}
