import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p28
{

	public static void main(String[] args)throws IOException
	{
		System.out.println("請輸入一個變數");
		
		BufferedReader br1=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1=br1.readLine();
		
		int num=Integer.parseInt(str1);

		System.out.println("變數num的值是:"+num);
		
		System.out.println("請輸入字串");
		
		BufferedReader br2=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str2=br2.readLine();
		
		System.out.println("剛剛輸入的字串是:"+str2);
	}

}