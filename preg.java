// Необходимо реализовать консольную программу, которая 
// бы фильтровала поток текстовой информации подаваемой 
// на вход и на выходе показывала лишь те строчки, которые 
// содержат слово передаваемое программе на вход в качестве аргумента.

// Варианты усложнения:
// 1. Программа не должна учитывать регистр
// 2. В аргументах может быть передано не одно слово, а несколько
// 3. В качестве аргумента может быть задано не конкретное слово, а регулярное выраж.

import java.io.*;

class preg
{
	public static String lineForCompare = "";
	public static void main (String[] args)
	{
		// lineForCompare - переменная для сравнения с аргументом
		try {
			BufferedReader readFromInput = new BufferedReader(new FileReader("input.txt"));
			
			// читаем весь файл построчно
			while ((lineForCompare = readFromInput.readLine()) != null)
			{
				findWordInLine( lineForCompare.split(" ", 0), args );
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// метод для сравнения args и lineForCompare
	private static void findWordInLine( String[] lineOfFile, String[] argsOfProgram )
	{
		for ( String wordOfFile : lineOfFile )
		{
			for ( String wordOfArgs : argsOfProgram )
			{
				if ( wordOfFile.toLowerCase().equals(wordOfArgs) )
				{
					System.out.println( lineForCompare );
				}
			}
		}
	}
}



























