package InputStreamReader.Problem1;

public class Main {
    public static void main(String[] args) {
        String filePath = "example.txt";
        String charset = "UTF-8";

        FileReaderUtil fileReaderUtil = new FileReaderUtil(filePath, charset);
        fileReaderUtil.readAndPrintFile();
    }
}
