package ex_ans;

public class CCode extends Code{
	public CCode(Text text) {
		super(text);
	}

	@Override
	public int getRows() {
			return text.getRows()+4;
	}
	@Override
	public String getRowText(int row) {
		if(row==0){
			return "#include<stdio.h>";
		}else if(row==1){
			return "int main(){";
		}else if(row==this.getRows()-2){
			return "return 0;";
		}else if(row==this.getRows()-1){
			return "}";
		}else{
			return "printf(\""+text.getRowText(row-2)+"\\n\");";
		}	
		

	}
}
