public class Count_words_in_a_string
{
    public static void main(String[] args)
    {
        String k="the girl is dangerous";
        int count=1;
        for (int i=0;i<=k.length()-1;i++)
        {
            if (k.charAt(i)==' ' && k.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        System.out.println(count);

    }
}
