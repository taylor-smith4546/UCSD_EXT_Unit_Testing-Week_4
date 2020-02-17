LineCount.java

package File;
import java.io.*;
import java.util.*;
public class LineCount
{
    public static int countLines(File f) throws IOException{
        int count=0;
        FileReader fr=new FileReader(f);
        BufferedReader b= new BufferedReader(fr);
        String str;
        while((str=b.readLine())!=null)
        {
            count++;
        }
        fr.close();
        return count;
    }
    public static void main(String[] args) throws IOException
    {
        String str=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter file name: ");
        str=sc.nextLine();
        File f=new File(str);
        System.out.println(countLines(f));

    }

}