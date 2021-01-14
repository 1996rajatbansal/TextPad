package MemoryCacher;

import java.util.LinkedList;

public class MemoryCacher {
	
	static LinkedList<StringBuffer>text=new LinkedList<StringBuffer>();
	static StringBuffer copiedString=new StringBuffer();

	

	public static StringBuffer getCopiedString() {
		return copiedString;
	}

	public static void setCopiedString(StringBuffer copiedString) {
		MemoryCacher.copiedString = copiedString;
	}

	public static LinkedList<StringBuffer> getText() {
		return text;
	}

	public static void setText(LinkedList<StringBuffer> text) {
		MemoryCacher.text = text;
	}

}
