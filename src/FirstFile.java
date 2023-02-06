import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("unused")
public class FirstFile {

	public static void main(String[] args) throws IOException {
		System.out.println("Adding first file to the local git repo");

		System.out.println("This line was added from Github");

		int i = 0;
		while (i < 5) {
			System.out.println(Math.round(Math.random() * 10));
			i++;
		}
		
		FileReader fReader = new FileReader("C:\\Users\\QQ864CK\\OneDrive - EY\\Desktop\\EY_Docs2\\data2.txt");
		@SuppressWarnings("resource")
		BufferedReader bReader = new BufferedReader(fReader);
		
		String data = "";
		
		while((data=bReader.readLine())!=null) {
			System.out.println(data);
		}
	}
}
