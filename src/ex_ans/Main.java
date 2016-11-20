package ex_ans;

public class Main {

	public static void main(String[] args) {
		Message msg = new Message("Hello world.");
		Code code = new ShellCode(new Python3Code(new CCode(new CCode(msg))));
		code.print();

	}

}
