package InputStreamReader.Problem2;
import java.io.*;
class UserInputHandler {
    private String filePath;

    public UserInputHandler(String filePath) {
        this.filePath = filePath;
    }

    public void readAndWriteInput(){
        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
             FileWriter fileWriter = new FileWriter(filePath, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){

            System.out.println("Enter text to write to the file (type 'exit' to stop):");

            String userInput;
            while (true) {
                userInput = bufferedReader.readLine();
                if ("exit".equalsIgnoreCase(userInput)) {
                    System.out.println("Exiting and saving to file.");
                    break;
                }
                bufferedWriter.write(userInput);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
