package java_class_demo;

public class Main {
    public static void exchange(Comparable []a,int i,int j)
    {
        Object x = a[i];
        a[i]=a[j];
        a[j]= (Comparable) x;
    }
    public static void main(String[] args) {

    Integer []a= {11,32,12,87,90,87,65,43,999,111};
    String []str = {"S","A","B","C","D","F","1","a","ab","aa"};
    Sort x = new Sort(str);
        for(int i=0;i<str.length;i++)
            System.out.print(str[i]+",");
    x.SelectSort(str);
        System.out.println();
        for(int i=0;i<str.length;i++)
            System.out.print(str[i]+",");
    }


}

