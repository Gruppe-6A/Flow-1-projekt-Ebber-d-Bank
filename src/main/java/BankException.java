import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BankException extends Exception {
    public BankException(String message) throws IOException {
        super(message);
        File file = new File("./src/main/resources/BankException.csv");
        FileWriter writer = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write(message);
        bw.newLine();
        bw.close();
        writer.close();
    }
}
