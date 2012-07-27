import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Write {
	public void printFileContentsToConsole(final String aFileName) {
		// Make a new file.
		File file = new File(aFileName);

		// Declare the reader outside the scope so we can use it
		// in the finally block.
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(file));
			String line;

			// Read one line at a time, printing it.
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Try to close it, this might throw an exception anyway.
				reader.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

}
