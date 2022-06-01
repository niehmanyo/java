package java_class_demo;

import java.security.Key;

public class ST<Key extends Comparable<Key>,Value> {
    /*这里创建的均是对象
    * Key这个对象是可以对比的，其实value也可以，但是定义的时候没有加上comparable
    * */
    private class Node
    {
        private Key key;
        private Value val;
        private Node next;
        Node(Key key,Value value)
        {
            this.key=key;
            this.val=value;
            this.next=null;
        }
        Node(){

        }
    }
    private Node head;
    public  int size=0;
    public boolean contains(Key key)
    {
        for(Node temp = head;temp!=null;temp=temp.next)
        {
            if(key.equals(temp.key))
                return true;
        }
        return false;
    }
    public void add(Key key,Value val)
    {
        if(contains(key))
            return;
        else if(size==0)
        {
            head=new Node(key,val);
            size++;
        }
        else{
            Node temp = head;
            Node add_node = new Node(key,val);
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=add_node;
            size++;
        }

    }
    public void PrintKey()
    {
        System.out.println("Key\t\tValue");
        for(Node temp = head;temp!=null;temp=temp.next)
        {
            System.out.println(temp.key+"\t"+temp.val);
        }
    }
    public ST()
    {}

}
