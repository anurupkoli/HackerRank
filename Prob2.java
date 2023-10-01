import java.util.*;
public class Prob2 {

    public static void main(String[] args) {
        int lineNo = 1;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(lineNo + " " + line);
            lineNo++;
        }
        sc.close();
    }
}
