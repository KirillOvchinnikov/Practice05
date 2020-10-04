package ru.mirea.Practice05._6;


public class Recursion2 {
    private int divisior = 2;
    private boolean flag = true;
    private int N;


    public String SetRec(int N)
    {
        if(N > 1) {
            this.N = N;
            return rec(divisior);
        }

        else return "Число должно быть больше единицы";
    }

    public String GetAnswer()
    {
        if (flag)
            return "YES";
        else return "NO";
    }

    public String rec(int Div)
    {
        if ((N % divisior == 0) && (N != divisior))
        {
            flag = false;
        }

        if (!flag)
        {
            return GetAnswer();
        }

        if (divisior < N)
            return rec(++divisior);
        else
            return GetAnswer();
    }
}
