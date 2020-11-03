package day11;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class AcceptingUserInput {

public void accept(){
	try{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter text");
		String str=scan.nextLine();
		FileOutputStream fout=new FileOutputStream("text1.txt",true);
		fout.write(str.getBytes());
		fout.write("\r\n".getBytes());
		fout.close();
	}catch(IOException e){
		e.printStackTrace();
	}
}
void readFile()throws IOException{
	FileInputStream f=null;
	byte b[]=new byte[150];
	try{
		f=new FileInputStream("text1.txt");
		f.read(b);
		String str=new String(b);
		System.out.println(str.trim());
	}catch(IOException e){
		System.out.println(e.getMessage());
	}
	finally{
		f.close();
	}
}
	public static void main(String[] args) throws IOException {
		AcceptingUserInput a1=new AcceptingUserInput();
char ch='Y';
Scanner scan = new Scanner(System.in);
System.out.println("enter the data and read in the file");
do{
	a1.accept();
	a1.readFile();
	System.out.println("do you want to continue");
	ch=scan.next().charAt(0);
}while(ch=='Y');
	}

}
