package InputStreamReader.Problem1;
import java.io.*;
class FileReaderUtil {
    private String filePath;
    private String charset;

    public FileReaderUtil(String filePath, String charset) {
        this.filePath = filePath;
        this.charset = charset;
    }

    public void readAndPrintFile(){
        try(FileInputStream fileInputStream = new FileInputStream(filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, charset);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)){
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }catch (UnsupportedEncodingException e){
            System.out.println("UnsupportedEncodingException"+ charset);
        }catch (FileNotFoundException e){
            System.out.println("FileNotFoundException"+ filePath);
        }catch (IOException e) {
            System.out.println("IOException"+ e.getMessage());
        }
    }
}
