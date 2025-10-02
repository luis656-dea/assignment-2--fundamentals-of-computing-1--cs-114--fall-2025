import java.sql.Time;
        import java.util.Timer;
    import java.util.TimerTask;
    
    public class OneHundredBottlesOfBeer {
        public static void main(String[] args) {
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    printLyrics();
                    timer.cancel(); // Stop the timer after one execution
                }
            };
            timer.schedule(task, 3); // Run immediately
        }
    
        public static void printLyrics() {
            for (int i = 100; i > 0; i--) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                
                int remaining = i - 1;
                String nextLine = remaining > 1 
                    ? remaining + " bottles of beer on the wall."
                    : "no more bottles of beer on the wall.";
                    
                System.out.println("Take one down and pass it around, " + nextLine);
                System.out.println();
            }
        }
    }
