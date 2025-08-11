package bulut.com.week3.findingthetwoclosestnumbers;

public class Numbers {
    private int firstNumber;
    private int nextNumber;
    private int difference;

    public Numbers(int firstNumber, int nextNumber) {
        this.firstNumber = firstNumber;
        this.nextNumber = nextNumber;
        this.difference = firstNumber - nextNumber > 0 ? firstNumber - nextNumber : nextNumber - firstNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getNextNumber() {
        return nextNumber;
    }

    public void setNextNumber(int nextNumber) {
        this.nextNumber = nextNumber;
    }

    public int getDifference() {
        return difference;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "firstNumber=" + firstNumber +
                ", nextNumber=" + nextNumber +
                ", difference=" + difference +
                '}';
    }
}
