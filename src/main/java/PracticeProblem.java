import java.io.*;
import java.util.*;

public class PracticeProblem {

	public static void main(String args[]) {
		
	}
	    public static String getName(int l, String f) {
		BufferedReader r = null;
		Scanner s = null;
		String output = "";
		try {
			r = new BufferedReader(new FileReader(f));
			String currentLine = r.readLine();;
            int currentLineNumber = 0;
            while (currentLine != null) {
                currentLineNumber++;
                if (currentLineNumber == l) {
                    String[] parts = currentLine.split(" ");
                    return parts[0] + " " + parts[1];
                }
				currentLine = r.readLine();
            }
		}
		catch (IOException e) {
			System.out.println(e);
		}
		return output;
    }

    public static int getAge(int l, String f) {
    
		BufferedReader r = null;
		Scanner s = null;
		int output = -1;
		try {
			r = new BufferedReader(new FileReader(f));
			String currentLine;
            int currentLineNumber = 0;
			currentLine = r.readLine();
            while (currentLine != null) {
                currentLineNumber++;
                if (currentLineNumber == l) {
                    String[] parts = currentLine.split(" ");
                    return Integer.parseInt(parts[2]);
                }
				currentLine = r.readLine();
            }
		}
		catch (IOException e) {
			System.out.println(e);
		}
		return output;
    }

    public static int getNumber(int l, String f) {
    
		BufferedReader r = null;
		Scanner s = null;
		int output = -1;
		try {
			r = new BufferedReader(new FileReader(f));
			String currentLine;
            int currentLineNumber = 0;
			currentLine = r.readLine();
            while (currentLine != null) {
                currentLineNumber++;
                if (currentLineNumber == l) {
                    String[] parts = currentLine.split(" ");
                    return Integer.parseInt(parts[3]);
                }
				currentLine = r.readLine();
            }
		}
		catch (IOException e) {
			System.out.println(e);
		}
		return output;
    }

    public static void fileAppend(String output, String fname) {
		BufferedWriter w = null;
        try 
		{
			w = new BufferedWriter(new FileWriter(fname, true));
            w.write(output);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
			try {
				if (w != null);
				w.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
    }

}
