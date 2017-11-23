import java.util.Scanner;
import static java.lang.Math.*;

public class App {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Integer min = null;
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int temp = sc.nextInt();
            if(min==null) min = temp;
            else{
                int btemp = abs(temp);
                int bmin = abs(min);
                if (bmin>btemp){
                    min = temp;
                }
                if (bmin==btemp){
                    if(temp>0) min=temp;
                }
            }
        }
        System.out.print(min);
    }
}
