# Count-lines
import java.io.*;
import java.util.*;
public class Count lines
{
public static void main(String args[])throws IOException
{
int i,count=0;
BufferedReader br=BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the paragraph:");
String s=br.readLine();
for(i=0;i<s.length();i++)
{
if(s.charAt(i)=='.')
{
count++;
}
}
System.out.println("count number of lines is : "+count);
}
}
