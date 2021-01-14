package TextPads;

import MemoryCacher.MemoryCacher;

public class TextPadImpl implements TextPad{

	@Override
	public void insertText(int n, String text) {
		// TODO Auto-generated method stub\
		n=n-1;
		if(MemoryCacher.getText().size()-1<=n) {
			MemoryCacher.getText().addLast(new StringBuffer(text));
		}
		else {
			MemoryCacher.getText().get(n).append(text);		
		}
	
		
	}

	@Override
	public void deleteLines(int n, int m) {
		// TODO Auto-generated method stub
		
		int k;
		if(Math.max(n, m)>MemoryCacher.getText().size())
		{
			System.out.println("Invalid n and m");
		}
		else
		{

			k=n-1;
			for(int i=n-1;i<m;i++)
			{
				MemoryCacher.getText().remove(k);
			}
			System.out.println("Sucesfully deleted..");
		}
		
		
	}

	@Override
	public void copy(int n, int m) {
		// TODO Auto-generated method stub
		
		
		if(Math.max(n, m)>MemoryCacher.getText().size())
		{
			System.out.println("Invalid n and m");
			return;
		}
		for(int i=n-1;i<m;i++)
		{
			MemoryCacher.getCopiedString().append(MemoryCacher.getText().get(i));
			MemoryCacher.getCopiedString().append("\n");
		}
		System.out.println("Sucesfully Copied..");
		
	}

	@Override
	public void paste(int pos) {
		// TODO Auto-generated method stub
		
		 String[]splitArr=MemoryCacher.getCopiedString().toString().split("\n");
		 int count=0;
		 if(MemoryCacher.getText().size()<=pos) {
			
			 for(int i=pos-1;i<pos+splitArr.length-1;i++)
				{
					insertText(i+1,splitArr[count++]);
				}
		}
		
		else {
			
		
			for(int i=pos-1;i<pos+splitArr.length-1;i++)
			{
				MemoryCacher.getText().add(i,new StringBuffer(splitArr[count++]));	
			}
					
		}
		 MemoryCacher.getCopiedString().setLength(0);
		 System.out.println("Sucesfully pasted..");
		
		
	}

	@Override
	public void printText() {
		// TODO Auto-generated method stub
		System.out.println("Content-----------");
		for(int i=0;i<MemoryCacher.getText().size();i++)
		{
			System.out.println(MemoryCacher.getText().get(i)+"\n");
		}
	}

}
