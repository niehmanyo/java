package java_class_demo;
import java.lang.Integer;
import java.util.concurrent.ConcurrentMap;
//用comparable 接口来实现可对比的类，从而进行排序


public class Sort {
    Object []a1;
    public Sort(Comparable []a)
    {
        this.a1=a;
    }
    public void exchange(Comparable []a1,int i,int j)
    {
        Object x = a1[i];
        a1[i]=a1[j];
        a1[j]= (Comparable) x;
    }
    public boolean less(Comparable []a,int i,int j)
    {
        if(a[i].compareTo(a[j])==-1)
            return true;
        else
            return false;
    }
    public void SelectSort(Comparable []a)
    {
        for(int i =0;i<a.length-1;i++)
        {
            int min_index=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j].compareTo(a[min_index])==-1)
                    min_index=j;
            }
            exchange(a,i,min_index);
        }
    }
    public void InsertSost(Comparable []a)
    {
        for(int i=1;i<a.length;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(less(a,j-1,j))
                    exchange(a,j,j-1);
            }
        }
    }
}
