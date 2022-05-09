public class Cell {

    private boolean isBomb;
    private int number;

    public void setBomb() {
        isBomb = true;
    }

    @Override
    public String toString()
    {
        return isBomb ? "*" :
               String.valueOf(number);
    }

	public void setNumber(int i) {
        number = i;
	}
    
}
