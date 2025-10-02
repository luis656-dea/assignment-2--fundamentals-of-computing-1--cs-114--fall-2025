public class CountFlips {
  public static void main(String[] args) {
    Coin coin = new Coin();
    int headsCount = 0;
    int tailsCount = 0;

    for (int flip = 1; flip <= 100; flip++) {
      coin.flip();
      System.out.println("Flip " + flip + ": " + coin);

      if (coin.isHeads()) {
        headsCount++;
      } else {
        tailsCount++;
      }
    }

    System.out.println("\nTotal Heads: " + headsCount);
    System.out.println("Total Tails: " + tailsCount);
  }
}

class Coin {
  private boolean heads;

  public void flip() {
    heads = Math.random() < 0.5;
  }

  public boolean isHeads() {
    return heads;
  }

  public String toString() {
    return heads ? "Heads" : "Tails";
  }
}
