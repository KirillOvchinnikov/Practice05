package ru.mirea.Practice05._5;

public class Recursion {
    private int sum;
    private int temp;

    public int rec(int N)
    {
        temp = N % 10;
        if(temp == 0)
        {
            return sum;
        }
        N /= 10;
        sum += temp;

        return rec(N);
    }
}
