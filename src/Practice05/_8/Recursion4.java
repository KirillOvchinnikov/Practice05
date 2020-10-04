package ru.mirea.Practice05._8;

public class Recursion4 {
    private int pos1 = 1;
    private int pos2;
    private boolean flag = true;


    public String setRec(String word)
    {
        pos2 = word.length();
        return rec(word);
    }

    public String getAnswer()
    {
        if (flag)
        {
            return "YES";
        }
        else return "NO";
    }

    public String rec(String word)
    {
        if ((word.charAt(word.length()-pos2)) == (word.charAt(word.length()-pos1)))
        {
            if (((word.length()-pos2) != (word.length()-pos1)) && ((word.length()-pos2) != (word.length()-pos1+1)))
            {
                pos1++;
                pos2--;
                return rec(word);
            }
            else return getAnswer();
        }
        else flag = false;

        if (!flag)
        {
            return getAnswer();
        }
        else
            return rec(word);
    }
}