package vttp.batch5.sdf.task02;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException{
        if(args.length == 0){
            System.out.println("Error: No TTT configuration filename provided");
            System.exit(1);
        }

        String filename = args[0];
        File file = new File(filename);
        if(!file.exists()){
            System.out.println("TTT configuration file does not exist");
        }
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
		
		Socket sock = null;
		InputStream is = sock.getInputStream();
      	DataInputStream dis = new DataInputStream(is);

	    String fileName = dis.readUTF();
	
    	FileOutputStream fos = new FileOutputStream(fileName);
      	BufferedOutputStream bos = new BufferedOutputStream(fos);

		Console cons = System.console();
		System.out.println("Processing: " + filename);
		System.out.println("");
		System.out.println("Board: ");
		System.out.println();

	}


}