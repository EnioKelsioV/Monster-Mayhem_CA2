package MonsterMayhem.model;

public class Position {
	
	 private int row;
	    private int col;

	    public Position() {
	        // Default constructor
	    }

	    public Position(int row, int col) {
	        this.row = row;
	        this.col = col;
	    }

	    public int getRow() {
	        return row;
	    }

	    public void setRow(int row) {
	        this.row = row;
	    }

	    public int getCol() {
	        return col;
	    }

	    public void setCol(int col) {
	        this.col = col;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;

	        Position position = (Position) o;

	        if (row != position.row) return false;
	        return col == position.col;
	    }

	    @Override
	    public int hashCode() {
	        int result = row;
	        result = 31 * result + col;
	        return result;
	    }

	    @Override
	    public String toString() {
	        return "Position{" +
	                "row=" + row +
	                ", col=" + col +
	                '}';
	    }
	}
	
