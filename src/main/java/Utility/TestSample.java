package Utility;

import java.util.ArrayList;

public class TestSample {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		ExcelUtility eu=new ExcelUtility();
		ArrayList<String>testdata=eu.GetTestData("TC1");
		for(int i=1;i<testdata.size();i++)
		{
			System.out.println(testdata.get(i));
		}
        
	}

}
