// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
            String word = args[0].toUpperCase();
            int numOfCheers = Integer.parseInt(args[1]);
            
            // Goes over each letter of the word and outputs the cheers about said letters
            for (int i = 0; i < word.length(); i++) {
                String output = "Give me a";
                char currentChar = word.charAt(i);
                // Checks if the letter needs the word "an" before it, and adds it if it does
                switch (currentChar) {
                        case 'A':
                                output += "n ";
                                break;
                        case 'E':
                                output += "n ";
                                break;
                        case 'F':
                                output += "n ";
                                break;
                        case 'H':
                                output += "n ";
                                break;
                        case 'I':
                                output += "n ";
                                break;
                        case 'L':
                                output += "n ";
                                break;
                        case 'M':
                                output += "n ";
                                break;
                        case 'N':
                                output += "n ";
                                break;
                        case 'O':
                                output += "n ";
                                break;
                        case 'R':
                                output += "n ";
                                break;
                        case 'S':
                                output += "n ";
                                break;
                        case 'X':
                                output += "n ";
                                break;
                        
                        default:
                                output += "  ";
                                break;
                }
                output += currentChar + ": " + currentChar + "!";
                System.out.println(output);
            }

            System.out.println("What does that spell?");
            
            // Prints the word a number of times equals to the inputed number
            for (int i = 0; i < numOfCheers; i++) {
                System.out.println(word + "!!!");
            }
        }
}
