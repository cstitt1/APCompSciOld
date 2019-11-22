package p6_5;

import java.io.*;
import java.util.Scanner;

public class DataSetTester
{
	/**
	 * 
	 * @param args 0 - file to be read
	 * @throws FileNotFoundException 
	 * @throws IOException
	 */
    public static void main(String[] args) throws IOException
    {
        /*
        Scanner scan = new Scanner(new File(args[0]));
        DataSet data = new DataSet();
        
        while(scan.hasNextDouble())
            data.add(scan.nextDouble());
            
        scan.close();
        */
    	
    	DataSet data = new DataSet();
    	
    	for(int i=0; i < 10; i++)
    	{
    		System.out.print(i * i + " ");
    		data.add(i * i);
    	}
    	System.out.println();
    	
    	System.out.println("count: " + data.count());
        System.out.println("mean : " + data.mean());
        System.out.println("sdev : " + data.standardDeviation());
    	
        data = new DataSet();
        
    	for(int i=0; i < 10; i++)
    	{
    		System.out.print(i * (i+1) + " ");
    		data.add(i * (i+1));
    	}
    	System.out.println();
        
        System.out.println("count: " + data.count());
        System.out.println("mean : " + data.mean());
        System.out.println("sdev : " + data.standardDeviation());
    }
}
