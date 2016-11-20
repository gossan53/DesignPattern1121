package ex;

public abstract class Text {
		public abstract int getRows();                  	
	 	public abstract String getRowText(int row); 
	 	public void print() {
	        for (int i = 0; i < getRows(); i++) {
	            System.out.println(getRowText(i));
	        }
	    }
}
