import java.util.Arrays;
import java.util.Scanner;

public class ElementsRemoval {
    public static int Removal(int[] Array){
        Arrays.sort(Array);
        int repetation=1,sum=0;
        for(int i=Array.length-1;i>=0;i--)
        {
            sum+=repetation*Array[i];
            repetation++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int [] Array=new int[size];
        for (int i=0;i< Array.length;i++)
        {
            Array[i]=scanner.nextInt();
        }
        System.out.println(Removal(Array));
    }
}
