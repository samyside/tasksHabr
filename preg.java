// Необходимо реализовать консольную программу, которая 
// бы фильтровала поток текстовой информации подаваемой 
// на вход и на выходе показывала лишь те строчки, которые 
// содержат слово передаваемое программе на вход в качестве аргумента.

// Варианты усложнения:
// 1. Программа не должна учитывать регистр
// 2. В аргументах может быть передано не одно слово, а несколько
// 3. В качестве аргумента может быть задано не конкретное слово, а регулярное выраж.

import java.io.*;

class Preg
{
	public static void main (String[] args)
	{
		String lineForCompare = "";
		try {
			BufferedReader readFromInput = new BufferedReader(new FileReader("input.txt"));
			
			while ((lineForCompare = readFromInput.readLine()) != null)
			{
				for (String retval : lineForCompare.split(" ", 0))
				{
					if (retval.toLowerCase().equals( args[0].toLowerCase() ) || retval.toLowerCase().equals( args[1] ))
					{
						System.out.printlineForCompare(lineForCompare);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}



























