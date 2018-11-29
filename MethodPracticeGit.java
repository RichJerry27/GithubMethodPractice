import java.util.ArrayList;
public class MethodPracticeGit{
	public static void main (String[]args){

		System.out.println(ConvertToArrayList(8950));
	}

	public static ArrayList <Integer> ConvertToArrayList(int value){

		ArrayList <Integer> list = new ArrayList <> ();

		while(value/10!=0){

			list.add(value%10);
			value/=10;


			}

			list.add(value);

		for (int i = list.size()- 2; i > -1; i--)
			list.add(list.remove(i));

		return list;

	}






	}