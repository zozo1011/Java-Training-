
package task_one;

public class Main
{
	public static void main(String[] args) 
	{
		/*String name = "Zainab";
		String version = "java version \"25.0.1\" 2025-10-21 LTS ----> the command is java -version";
		String path = "C:\\Program Files\\Java\\jdk-25 ----> the command is echo %JAVA_HOME%";
		
		System.out.println("The name is: " + name);
		System.out.println("The version is: " + version);
		System.out.println("The path is: " + path);*/
		
		String Name = "Zainab Sabra";
		System.out.println("The name is: " + Name);

		String javaVersion = System.getProperty("java.version");
		System.out.println("Java Version is: " + javaVersion);

		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME is: " + javaHome);

	}
}
