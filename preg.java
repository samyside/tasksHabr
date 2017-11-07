// ���������� ����������� ���������� ���������, ������� 
// �� ����������� ����� ��������� ���������� ���������� 
// �� ���� � �� ������ ���������� ���� �� �������, ������� 
// �������� ����� ������������ ��������� �� ���� � �������� ���������.

// �������� ����������:
// 1. ��������� �� ������ ��������� �������
// 2. � ���������� ����� ���� �������� �� ���� �����, � ���������
// 3. � �������� ��������� ����� ���� ������ �� ���������� �����, � ���������� �����.

import java.io.*;

class preg
{
	public static String lineForCompare = "";
	public static void main (String[] args)
	{
		// lineForCompare - ���������� ��� ��������� � ����������
		try {
			BufferedReader readFromInput = new BufferedReader(new FileReader("input.txt"));
			
			// ������ ���� ���� ���������
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
	
	// ����� ��� ��������� args � lineForCompare
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



























