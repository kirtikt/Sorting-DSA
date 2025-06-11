public class Quicksort {
    static void Quick_Sort(int a[],int start,int end)
    {
        int i=start;
        int j=end;
        int pivot=start;
        while(i<j)
        {
            while(a[i]<a[pivot])//inactive i=pivot
                i++;
            while(a[j]>a[pivot])
                j--;
            if(i<j)
            {
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        if(i<end)//skip to first
            Quick_Sort(a,start+1,a.length-1);
        if(start<j)//skip to first
            Quick_Sort(a,start,end-1);
    }
}
