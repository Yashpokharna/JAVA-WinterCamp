import java.util.Arrays;
public class SortingString {
        public static void main(String[] args) {
            String[] str = {"Mani","Aadi","Pari","Aari","Dari","Zara","Tara","Gara"};
            bubble(str);
            System.out.println(Arrays.toString(str));
        }
        static void bubble(String[] str){
            for (int j = 0; j < str.length - 1; j++)
            {
                for (int i = j + 1; i < str.length; i++)
                {
                    if (str[j].compareTo(str[i]) > 0)
                    {
                        String temp = str[j];
                        str[j] = str[i];
                        str[i] = temp;
                    }
                }
            }
        }
}

