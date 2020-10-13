public class Grid {
    public Cell[] cells;
    public  int width;
    public  int height;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void initialize(String[] args) {
        // cell c3= new cell();
        //System.out.println("That is: " + c3.getY());
        // Cell is lonely and dies


        cells = new Cell[width * height];
        for (int i = 0; i < cells.length; i++) {
            if (Math.random() < 0.5)
                cells[i] = new Cell(4,7,true);



            }
        }
    }