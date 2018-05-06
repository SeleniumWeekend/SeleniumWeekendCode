package javaPropertiesFile;

public class Run {

	public static void main(String[] args) 
	{

		String data = JProperties.getProData("password");
		System.out.println(data);
	}

}
