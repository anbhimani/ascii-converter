//importing the scanner so that user input can be accepted
import java.util.Scanner;

public class BinaryASCIIConverter {

    private static Scanner sc = new Scanner(System.in);

    public static void run(){
        //creates menu
        System.out.println(
                """
                1. Text to binary
                2. Binary to text
                3. Quit  
                Enter choice:\s     
                """
        );
        int choice = sc.nextInt();
        sc.nextLine(); //Buffer

        //based on choice, different function will be called
        if(choice==1){
            textToBinary();

        }
        else if (choice == 2){
            binaryToText();
        }



    }

    private static void binaryToText() {
        //gets input of binary from user
        System.out.println("Enter binary: ");
        String text = sc.nextLine();
        int binaryText = 0;
        int value = 128;
        //loops through the binary, each bit one by one
        for(int i = 0; i < text.length(); i++) {

            //only does this if there is a space, so just loops back up
            if(text.charAt(i) == ' ') continue;

            //checks what the value of the binary bit is, and keeps a running total
            char bit = text.charAt(i);
            if (bit == '1') {
                binaryText += value;
            }

            value = value / 2;

            //once the value is 0, the letter is added to the variable and stored
            if (value == 0){
                value = 128;
                char letter = (char) binaryText;
                System.out.print(letter);
                binaryText = 0;
            }





        }
        System.out.println();

    }

    private static void textToBinary() {
        //gets user input
        System.out.println("Enter text: ");
        String text = sc.nextLine();
        String binaryText = "";
        //loops through the length of the text that is entered
        for(int i = 0; i < text.length(); i++)
        {
            //multiple checks to loop through all of the 8 bits
            int left = 0;
            int ascii = text.charAt(i);
            if(ascii>=128)
            {
                binaryText += "1";
                left = ascii -128;
            }
            else if (ascii<128) {
                binaryText += "0";
                left = ascii;
            }

            if(left>=64)
            {
                binaryText += "1";
                left = ascii - 64;
            }

            else if (left<64) {
                binaryText += "0";
            }

            if(left>=32)
            {
                binaryText+="1";
                left = left-32;
            }

            else{
                binaryText+="0";
            }

            if(left>=16)
            {
                binaryText+="1";
                left = left-16;
            }

            else{
                binaryText+="0";
            }

            if(left>=8)
            {
                binaryText+="1";
                left = left - 8;
            }

            else{
                binaryText+="0";
            }

            if(left>=4)
            {
                binaryText+="1";
                left = left-4;
            }

            else{
                binaryText+="0";
            }

            if(left>=2)
            {
                binaryText+="1";
                left = left-2;
            }

            else{
                binaryText+="0";
            }

            if(left>=1){
                binaryText+="1";
            }
            else{
                binaryText+="0";
            }

            binaryText+= " ";
        }
        System.out.println(binaryText);


        // String.charAt()
        // int ascii = String.charAt(i)

    }

}
