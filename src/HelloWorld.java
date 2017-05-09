/**
 * Created by Sunny on 16.01.16.
 */
public class HelloWorld {


    public static void main(String[] args) {
        int  values[] = {10, 3, 5, 12, 25, 1, 42, 2};
        int first = values[0];

        for(int i = 1; i < values.length; i++)
        {
            if (values[i] >= first)
                first = values[i];


        }

        System.out.println(first);


    }

}
