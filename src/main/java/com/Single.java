public class Single{
    Node node;
    
    class Node{ 
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
        node = new Node();
    }
    
    Single(int val){
        node = new Node(val);
    }
    
    void add(int val){
        insert(this.node,val);
    }
    void insert(Node node,int val){
        
        if(node == null){
            node=new Node(val);
        }
        insert(node.next,val);
    }
    
    void print(Node node1){
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
            Single node = new Single(i);
            s.add(node.node.val);
        }
        
        
        
     }
}
