package mx.com.app.advanteofcode.util;

import java.io.File;
import java.io.IOException;
import static org.apache.commons.io.FileUtils.readFileToString;

public class ReadFilesUtils {
	
	public static File getResource(String path) {
		return new File("src/main/resources/" + path);
	}

	public static String getResourceAsString(String resource) {
		try {
			return readFileToString(getResource(resource));
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}

}
