public class selection {
    static void Selection_Sort(int a[])
    {
        for (int i =0;i<a.length-1;i++)
        {
            int min=a[i];
            int ref=i;
            for (int j = i+1; j <= a.length-1; j++)
            {
                if (a[j] < min)
                {   min=a[j];
                    ref=j;
                }
            }
            a[ref]=a[i];
            a[i]=min;
        }
    }

}
