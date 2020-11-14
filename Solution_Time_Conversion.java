import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        /**     By Ahmed CHEMCHIK       */
        
        int h= Integer.parseInt(s.substring(0,2));
        String m= s.substring(3,5);
        String sc= s.substring(6,8);
        String AP= s.substring(8,10);
        if (AP.equals("PM")){
            if (h!=12){
                h=h+12;
            }
        }else if (h==12){
            h=0;
        }
        
        if ((h/10)!=0) {   
        return h + ":" + m + ":" + sc ;}
        else return "0"+ h + ":" + m + ":" + sc ;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
