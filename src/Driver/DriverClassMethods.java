package Driver;

import TextPads.TextPadImpl;

public class DriverClassMethods {
	
	TextPadImpl txtPad=new TextPadImpl();
	
	public void insertText(int pos,String text)
	{
		txtPad.insertText(pos, text);
	}
	public void deleteLines(int n,int m)
	{
		txtPad.deleteLines(n, m);
	}
	public void copyLines(int n,int m) {
	
		txtPad.copy(n, m);
	}
	
	public void pasteLines(int pos)
	{
		txtPad.paste(pos);
	}
	public void print()
	{
		txtPad.printText();
	}

}
