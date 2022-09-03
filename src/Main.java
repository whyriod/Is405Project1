import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /***
     * Function: Main
     * Summary: The user should put the file that is to be read in the same directory
     * as the main.java file and provide its absolute path as the first command line argument.
     * After that, the file should be read in and list of group members created. From there we
     * can get a count of group members. For our large list, we can go through and add 1 individual
     * to each group, removing them as we go, and then once we are done output the list of each
     * group.
     *
     * @param args - First argument should be the absolute path of the file to be read in.
     *               The group individuals names should be each on a different line.
     *               Second argument should be the number of groups that the user would like
     *               to create.
     */
    public static void main(String[] args) {

        //Check if a file name and group count is provided.
        if(args.length != 2){
            System.out.println("Please provide the file absolute path, and the number of " +
                    "groups you would like to create as command line arguments and try again.");
            return;
        }

        //Check that arg two is an integer and greater than 1.
        /***
         * More code needs to go here.
         */

        //Main body of content
        try{

            //Create an input stream from the file.
            File file = new File(args[0]);
            BufferedReader br = new BufferedReader(new FileReader(file));

            //This will be the list of strings where we hold the groupMembers
            List<String> groupMembers = new ArrayList<String>();

            //Read in the first line.
            String currentLine = br.readLine();

            //While there is a line that is not empty, push it to the groupMembers list
            //and read in the next line.
            while(currentLine != null){
                groupMembers.add(currentLine.trim());
                currentLine = br.readLine();
            }

            //This is more for debugging purposes. Use this to see that you read in everyone.
            for (String member : groupMembers){
                System.out.println(member);
            }

            /***
             * This is where the rest of the code needs to be written.
             * Please provide good comments.
             * If we arent done on Tuesday, no sweat we can do more
             * on monday or Tuesday.
             *
             */

            return;
        }

        //If an exception is thrown, be sure to throw an error to the user. Basically
        //this just makes sure the program does not crash and gives you a nice error message.
        catch(Exception e){
            System.out.println("500 - Internal Server Error: " +  e);
            return;
        }
    }
}