import java.util.ArrayList;
import java.util.List;

public class Minefield {

    private List<Cell> cells;

    public Minefield(int width, int height) {
        cells = new ArrayList<Cell>();

        for(int i = 0 ; i < width * height ; i++)
        {
             cells.add(new Cell());
        }
    }

    public List<Cell> getCells() {
        return cells;
    }
    
}
