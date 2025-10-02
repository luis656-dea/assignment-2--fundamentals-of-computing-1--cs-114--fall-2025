public class TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
      printLyrics();
  }

  public static void printLyrics() {
      String[] days = {
          "first", "second", "third", "fourth", "fifth", "sixth",
          "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
      };
      String[] gifts = {
          "a Partridge in a Pear Tree.",
          "two Turtle Doves, and ",
          "three French Hens, ",
          "four Calling Birds, ",
          "five Golden Rings, ",
          "six Geese a Laying, ",
          "seven Swans a Swimming, ",
          "eight Maids a Milking, ",
          "nine Ladies Dancing, ",
          "ten Lords a Leaping, ",
          "eleven Pipers Piping, ",
          "twelve Drummers Drumming, "
      };
      
      for (int i = 0; i < 12; i++) {
          System.out.println("On the " + days[i] + " day of Christmas my true love sent to me:");
          for (int j = i; j >= 0; j--) {
              System.out.print(gifts[j]);
          }
          System.out.println("\n");
      }
  }
}
