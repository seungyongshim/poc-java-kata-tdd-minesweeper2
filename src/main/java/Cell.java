public class Cell {

    private boolean isBomb;
    private int number;
    private boolean isCovered = true;

    public void setBomb() {
        isBomb = true;
    }

    @Override
    public String toString()
    {
        return isCovered ? "." :
               isBomb ? "*" :
               String.valueOf(number);
    }

	public void setNumber(int i) {
        number = i;
	}

    public void click() {
        isCovered = false;
    }

    public boolean isBomb() {
        return isBomb;
    }
}
