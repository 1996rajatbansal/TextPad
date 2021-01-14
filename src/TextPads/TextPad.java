package TextPads;

public interface TextPad {
	public void insertText(int n,String text);
	public void deleteLines(int n,int m);
	public void copy(int n,int m);
	public void paste(int pos);
	public void printText();
}
