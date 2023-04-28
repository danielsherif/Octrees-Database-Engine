package dbmain;

import java.io.IOException;
import java.util.Hashtable;

public class MainMethod {

	public MainMethod() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) throws DBAppException, IOException, ClassNotFoundException {
		String strTableName = "Student";
		DBApp dbApp = new DBApp( );
		
		//table htbl names and type and max/min
		Hashtable<String,String> htblColNameType = new Hashtable<String, String>( );
		Hashtable<String,String> htblColNameMin = new Hashtable<String, String>( );
		Hashtable<String,String> htblColNameMax = new Hashtable<String, String>( );
		htblColNameType.put("id", "java.lang.Integer");
		htblColNameType.put("name", "java.lang.String");
		htblColNameType.put("gpa", "java.lang.Double");
		htblColNameMin.put("id", "0");
		htblColNameMax.put("id", "999999999");
		htblColNameMin.put("name", "a");
		htblColNameMax.put("name", "ZZZZZZZZ");
		htblColNameMin.put("gpa", "0");
		htblColNameMax.put("gpa", "4");
		
		//create the table, done, working
		//dbApp.createTable( strTableName, "id", htblColNameType, htblColNameMin, htblColNameMax );
		
		//inserting some records in the database
		Hashtable<String, Object> htblColNameValue = new Hashtable( );
		htblColNameValue.put("id", new Integer( 2343432 ));
		htblColNameValue.put("name", new String("Ahmed Noor" ) );
		htblColNameValue.put("gpa", new Double( 0.95 ) );
		//dbApp.insertIntoTable( strTableName , htblColNameValue );
		
		htblColNameValue.clear( );
		htblColNameValue.put("id", new Integer( 453455 ));
		htblColNameValue.put("name", new String("Ahmed Noor" ) );
		htblColNameValue.put("gpa", new Double( 0.95 ) );
		//dbApp.insertIntoTable( strTableName , htblColNameValue );
		
		htblColNameValue.clear( );
		htblColNameValue.put("id", new Integer( 5674567 ));
		htblColNameValue.put("name", new String("Dalia Noor" ) );
		htblColNameValue.put("gpa", new Double( 1.25 ) );
		//dbApp.insertIntoTable( strTableName , htblColNameValue );
		
		htblColNameValue.clear( );
		htblColNameValue.put("id", new Integer( 23498 ));
		htblColNameValue.put("name", new String("John Noor" ) );
		htblColNameValue.put("gpa", new Double( 1.5 ) );
		//dbApp.insertIntoTable( strTableName , htblColNameValue );
		
		htblColNameValue.clear( );
		htblColNameValue.put("id", new Integer( 78452 ));
		htblColNameValue.put("name", new String("Zaky Noor" ) );
		htblColNameValue.put("gpa", new Double( 0.88 ) );
		//dbApp.insertIntoTable( strTableName , htblColNameValue );
		
		
		//print the table
		dbApp.printTable(strTableName);
		

		//System.out.println(htblColNameType);
		
		String manga = "manga";
		
	}
	

}