package ex_ans;

public class ShellCode extends Code {

	public ShellCode(Text text) {
		super(text);
	}

	public int getRows() {
		return text.getRows();
	}

	@Override
	public String getRowText(int row) {
		return "echo " + text.getRowText(row) ;
	}

}
