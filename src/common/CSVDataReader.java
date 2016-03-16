package common;

import java.util.List;

public class CSVDataReader
{
	String csvFilePath;
	private List<Person> person;

	public CSVDataReader(String csvFilePath)
	{
		this.csvFilePath = csvFilePath;
	}

	public List<Person> getPerson()
	{
		return person;
	}

	public void setPerson(List<Person> person)
	{
		this.person = person;
	}

}
