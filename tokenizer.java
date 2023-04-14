// Working program with FastReader
import java.io.*;
import java.util.*;
import java.lang.*;


class tokenizer
{
	public static void main(String[] args)
	{
    Object name = "Tym";
    Object number = 5;
    Object number2 = 7;
    Object weight = 105.5;
    Object age = 40;

    ArrayList<Object> list = new ArrayList<Object>();
    ArrayList<Object> list2 = new ArrayList<Object>();

    list.add(name);
    list.add(number);
    list.add(weight);
    list.add(age);
    list2.add(number2);
    for (int i = 0; i<list.size(); i++)
    {
      System.out.print(list.get(i) +"\t" + list.get(i).getClass());
      if (list.get(i) instanceof Double)
        System.out.print("\tIt's True!" );
      System.out.println();
    }
	}
}

