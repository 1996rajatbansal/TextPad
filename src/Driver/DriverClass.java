package Driver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
;

public class DriverClass {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Welcome to Text pad...");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	DriverClassMethods driver=new DriverClassMethods();
	String choice;
		while(true)
		{
			System.out.println("1:insert line");
			System.out.println("2:delete lines");
			System.out.println("3:copy lines");
			System.out.println("4:paste lines");
			System.out.println("5:Print content");
			choice=br.readLine();
			int n,m;
			String txt;
			switch (choice) {
			case "1":
				n=Integer.parseInt(br.readLine());
				txt=br.readLine();
				driver.insertText(n,txt);
				
				break;
	case "2":
		n=Integer.parseInt(br.readLine());
		m=Integer.parseInt(br.readLine());
		driver.deleteLines(n, m);
				
				break;
	case "3":
		n=Integer.parseInt(br.readLine());
		m=Integer.parseInt(br.readLine());
		driver.copyLines(n, m);
		
		break;
	case "4":
		n=Integer.parseInt(br.readLine());
		driver.pasteLines(n);
		
		break;
	case "5":
		driver.print();
		
		break;
			default:
				break;
			}
			
			
		}
		
	}

}
