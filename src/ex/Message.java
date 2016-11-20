package ex;

public class Message extends Text {
	private String string; 

	@Override
	public int getRows() { 
		throw new UnsupportedOperationException();
	}
	@Override
	public String getRowText(int row) { 
		throw new UnsupportedOperationException();
	}
}
