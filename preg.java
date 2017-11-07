// ���������� ����������� ���������� ���������, ������� 
// �� ����������� ����� ��������� ���������� ���������� 
// �� ���� � �� ������ ���������� ���� �� �������, ������� 
// �������� ����� ������������ ��������� �� ���� � �������� ���������.

// �������� ����������:
// 1. ��������� �� ������ ��������� �������
// 2. � ���������� ����� ���� �������� �� ���� �����, � ���������
// 3. � �������� ��������� ����� ���� ������ �� ���������� �����, � ���������� �����.

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



























