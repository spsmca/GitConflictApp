package demo.repo.git.github.app;
import java.io.*;
import java.util.*;

public class GitApp {
    static String path="src\\demo\\repo\\git\\github\\app\\";
	public static void main(String[] args) {
		System.out.println("--------------" );
		dispLines(A.getLines());
		dispLines(B.getLines());
		dispLines(C.getLines());
		dispLines(D.getLines());
		dispProps("TL");
		dispProps("TR");
		dispProps("NR");
		dispProps("NL");
	
	}
	
	
	static void dispLines(String lines) {
		System.out.println("" + lines);
		System.out.println("--------------" );
	}
	
    public static void dispProps(String fileName) {
		Properties pro = new Properties();
        int i=0;
        String str="";
		try{
		   FileInputStream in = new FileInputStream(path + fileName + ".properties");
		   //FileInputStream in = new FileInputStream("src\\" + fileName + ".properties");
		   pro.load(in);
		   while( i<3){
			  str= "line" + (++i);
		      //System.out.println(str + ": " + pro.get(str));
			  System.out.println(" " + pro.get(str));
		   }
		}
		catch(IOException e){
		   System.out.println(e.getMessage());
		}
		System.out.println("--------------" );
	}
}
