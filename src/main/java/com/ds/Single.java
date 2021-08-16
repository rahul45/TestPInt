package com.ds;

public class Single{
    Node node;
    
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            next=null;
        }
        Node(){
            
        }
        
    }
    
    Single(){
        this.node = null;
    }
    
    Single(int val){
        node = new Node(val);
    }
    
    void add(int val){
        this.node=insert(this.node,val);
    }
    Node insert(Node node,int val){
        if(node == null){
            node=new Node(val);
            return node;
        }
        node.next= insert(node.next,val);
        return node;
    }
    
    void print(){
        Node node1=this.node;
        while(node1 != null){
            System.out.print(node1.val+"->");
            node1=node1.next;
        }
          System.out.println(" \n");
        
    }

     public static void main(String []args){
        System.out.println("Hello World");
        Single s = new Single();
        for(int i=1;i<6;i++){
            //Node node = new Node(i);
            s.add(i);
        }
        
        s.print();
        
     }
}
