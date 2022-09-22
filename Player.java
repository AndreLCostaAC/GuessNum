package GuessGame;

public class Player {
    private int startNumber;
    private int endNumber;

    public int randomNumber(int startNumber, int endNumber) {
        int min = startNumber;
        int max = endNumber;
        int range = (max - min) + 1;
        int randomNumber = (int) (Math.random() * range);
        return randomNumber;
    }

    public int getStartNumber() {
        return this.startNumber;
    }

    public int getEndNumber() {
        return this.endNumber;
    }

}
