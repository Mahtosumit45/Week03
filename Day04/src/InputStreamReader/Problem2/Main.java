package InputStreamReader.Problem2;


public class Main {
    public static void main(String[] args) {
        String filePath = "output.txt"; // Specify the output file path

        UserInputHandler userInputHandler = new UserInputHandler(filePath);
        userInputHandler.readAndWriteInput();
    }
}

