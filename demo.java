import  java.util.Scanner;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.DataOutputStream;
import java.io.File;
class demo{
	public static void main(String[] args)throws Exception{
		File f1=new File("abc.txt");
		FileOutputStream f=new FileOutputStream(f1);
		DataOutputStream d=new DataOutputStream(f);
		d.writeUTF("Bikash Ghimire");

		FileInputStream fi=new FileInputStream(f1);
		DataInputStream di=new DataInputStream(fi);
		String str=di.readUTF();
		System.out.println(str);
		System .out. println("Path=" +f1. getPath() );
        System.out.println("Absolute Path="+f1.getAbsolutePath());


	}
}