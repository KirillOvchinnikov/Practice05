package ru.mirea.Practice05._9;

import java.util.Arrays;

public class Recursion5 {
    private int count = 0, ind = 0, cnt = 0;
    private int arr[], arr2[];
    int tmp;

    public int SetRec(int a, int b)
    {
        arr = new int[a+b];
        arr2 = new int[a+b];
        for (int i = 0; i < a; i++)
        {
            arr[i] = 0;
            arr2[i] = 0;
        }

        for (int i = a+1; i < b; i++)
        {
            arr[i] = 1;
            arr2[i] = 1;
        }

        if (a < 0 || b < 0)
        {
            System.out.println("Некорректный ввод чисел");
            return 0;
        }
        else return rec(a,b);
    }

    private int GetAnswer(int count)
    {
        return count;
    }

    private int rec(int a, int b)
    {
        tmp = arr[ind];
        arr[ind] = arr[ind+1];
        arr[ind+1] = tmp;
        if(ind != a+b-2)
        {
            ind++;
        }


        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == arr2[i]);
            cnt++;
        }

        if (cnt == arr.length)
            return GetAnswer(count);


        for(int i = 0; i < a+b-1; i++)
        {
            if (arr[i] == arr[i+1] && arr[i] == 0)
                return rec(a, b);
            else {
                count++;
            }
        }
        return rec(a,b);
    }
}