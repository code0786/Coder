public class Count_occurences_of_a_character
{
    public static void main(String[] args)
    {
        String k= "java is a programming language";
        int or=k.length();
        int val=k.replaceAll("a","").length();
        System.out.println(or-val);

    }
}
