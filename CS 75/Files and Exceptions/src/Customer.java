import java.util.*;
import java.io.*;

public class Customer extends Account {
    public static void main(String[] args) throws Exception{

        ArrayList <Account> accountList = new ArrayList<Account>();

        try {
            File file = new File("/Users/dans/Downloads/accounts.dat.txt");
            Scanner stdin = new Scanner(file);
            BufferedReader br = new BufferedReader(new FileReader(file));
            //stdin.useDelimiter(":");

            String str;
            int count = 0;
            int tokenCount = 0;

            while (stdin.hasNext()){
                tokenCount++;
            }
            String[] classTokens = new String[tokenCount];

            while ((str = br.readLine()) != null){
              String[] tokens = str.split(":");
                count++;
            }
            String[] tokens = str.split(":");




            for (int i = 0; i < tokens.length ; i++){

            }





        }
        catch(FileNotFoundException e){
            System.out.print("No eligible account!");
            System.out.print(e.getMessage());

        }


    }
}
