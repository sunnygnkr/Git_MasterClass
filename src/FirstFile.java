import java.io.FileNotFoundException;
import java.io.FileReader;

public class FirstFile {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Adding first file to the local git repo");

		System.out.println("This line was added from Github");

		int i = 0;
		while (i < 5) {
			System.out.println(Math.round(Math.random() * 10));
			i++;
		}
		
		FileReader fReader = new FileReader("C:\\Users\\QQ864CK\\OneDrive - EY\\Desktop\\EY_Docs2");
	}
}
