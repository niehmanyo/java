package java_class_demo;
import java.lang.Integer;
import java.util.concurrent.ConcurrentMap;
//用comparable 接口来实现可对比的类，从而进行排序


public class Sort {
    public Sort(Comparable []a)
    {

    }
    public void exchange(Comparable []a,int i,int j)
    {
        Object x = a[i];
        a[i]=a[j];
        a[j]= (Comparable) x;
    }
    public int less(Comparable []a,int i,int j)
    {
        return a[i].compareTo(a[j]);
    }
    public void SelectSort(Comparable []a)
    {
        for(int i =0;i<a.length-1;i++)
        {
            int min_index=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(less(a,min_index,j)>=0)
                    min_index=j;
            }
            exchange(a,i,min_index);
        }
    }
    public void InsertSost(Comparable []a)
    {

    }
}
