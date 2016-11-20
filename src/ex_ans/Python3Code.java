package ex_ans;

public class Python3Code extends Code {

	public Python3Code(Text text) {
		super(text);
	}

	public int getRows() {
		return text.getRows();
	}

	@Override
	public String getRowText(int row) {
		return "print('" + text.getRowText(row) + "')";
	}
}
