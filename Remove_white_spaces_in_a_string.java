public class Remove_white_spaces_in_a_string
{
    public static void main(String[] args)
    {
        String k=" All is well and i will rule";
        k=k.replaceAll("\\s","");
        System.out.println(k);

    }
}
