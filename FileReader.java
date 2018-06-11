
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileReader {

	public String parseToPlainText(File file) throws Exception {

		InputStream fileStream = new FileInputStream(file);
                return fileStream.toString();
	   
	}
}
