package ex_ans;

public class Message extends Text {
	private String string; 

	public Message(String string) {
		this.string = string;
	}

	public int getRows() { 
		return 1;
	}

	public String getRowText(int row) { 
		if (row == 0) {
			return string;
		} else {
			return null;
		}
	}
}
