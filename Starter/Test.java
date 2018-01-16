import java.util.*;
import java.io.*;



public class Test {
	
	void change(int b[],int s)
	{
		b[2]=5;
		
		s=89;
		
	}


public static void main(String args[])
{

    int s=10;
	int[] a={1,2,3,4};
	
	Test t=new Test();
	System.out.println(a[2]);
	
	t.change(a,s);
	
	System.out.println(a[2]);
	System.out.println(s);


}
}
