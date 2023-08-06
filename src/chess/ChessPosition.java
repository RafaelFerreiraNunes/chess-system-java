package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiatign ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	protected Position toPosition() {
		int c = this.column - 'a';
		int r = 8 - this.row;
		return new Position(r, c);
	}

	protected static ChessPosition fromPosition(Position position) {
		char c = (char) (position.getColumn() + 'a');
		int r = 8 - position.getRow();
		return new ChessPosition(c, r);
	}
	
	@Override
	public String toString() {
		return "" + this.column + this.row;
	}
}
