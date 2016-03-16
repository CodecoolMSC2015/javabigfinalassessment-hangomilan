package common;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVDataReader
{

	////////////////////////////////////////////////////////////////////////

	private String csvFilePath;

	////////////////////////////////////////////////////////////////////////

	public void run()
	{

		String csvFilePath = "c:\\Users\\hango milan\\git\\javabigfinalassessment-hangomilan\\Documentation\\persons.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		try
		{
			br = new BufferedReader(new FileReader(csvFilePath));
			while ((line = br.readLine()) != null)
			{
				String[] csvfile = line.split(cvsSplitBy);
			}

		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		} finally
		{
			if (br != null)
			{
				try
				{
					br.close();
				} catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		System.out.println("Done");
	}

	////////////////////////////////////////////////////////////////////////

}
