package Midterm;


import java.io.IOException;
import java.io.FileWriter;



public class EncryptFileHandlingBongcao1 {


        public static void main(String[] args) throws IOException {
            String encryptedMessage;

            try (FileWriter myfile = new FileWriter("\"C:\\Users\\PC\\Desktop\\Bongcao1Encrypted.txt\"")) {
                int key = 6;
                String message = "I love you!\nGwapa ko!\nBuotan si Ma'am";
                encryptedMessage = encryptMessage(message, key);
                myfile.write(encryptedMessage);
            }
            System.out.println("Encrypted Message:");
            System.out.println(encryptedMessage);
        }
        
        
//                File myFile = new File(""C:\Users\PC\Desktop\Bongcao1Encrypted.txt"");
//                if (myFile.createNewFile()) {
//                    System.out.println("File created: " + myFile.getName());
//                } else {
//                    System.out.println("File already exists.");
        

        public static String encryptMessage(String message, int key) {
            char[] chars = message.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] != '\n') {
                    chars[i] += key;
                }
            }
            return new String(chars);
        }

    }
//                File myFile = new File(""C:\Users\PC\Desktop\Bongcao1Encrypted.txt"");
//                if (myFile.createNewFile()) {
//                    System.out.println("File created: " + myFile.getName());
//                } else {
//                    System.out.println("File already exists.");
//            
//        public static void main(String[] args) {
//            try {
//                FileWriter myText = new FileWriter(""C:\Users\PC\Desktop\Bongcao1Encrypted.txt"");
//                myText.write("I love you!\nGwapa ko!\nBuotan si Ma'am\n");
//                myText.close();
//                System.out.println("Successfully wrote to the file.");
//            } catch (IOException e) {
//                System.out.println("An error occurred.");
//                e.printStackTrace();
//            }
//    
//                myReader.close();
//            } catch (FileNotFoundException e) {
//                System.out.println("An error occured.");
//                e.printStackTrace();
//            }
//        }