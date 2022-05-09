public class Cell {

    private boolean isBomb;

    public void setBomb() {
        isBomb = true;
    }

    @Override
    public String toString()
    {
        return "*";
    }
    
}
