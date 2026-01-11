package file.read.write;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main_File 
{
	public static void main(String[] args) 
	{
        // 1. Writing to file
		try 
		{
			FileWriter writer = new FileWriter("data.txt");
			writer.write("Zainab Sabra\n");
			writer.write("Computer Science\n");
			writer.write("AAUP\n");
			writer.write("202216374\n");
			writer.close();
			
			System.out.println("Data written to file successfully.");
		}
		
		catch (IOException e)
		{
			System.out.println("Error writing to file.");
		}
		
		// 2. Reading from file
        try {
            FileReader fileReader = new FileReader("data.txt");
            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            System.out.println("\nReading from file:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading from file.");
        }
	}
}
