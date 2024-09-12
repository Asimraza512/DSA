/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist5;
public class LinkedList5 {
    public class Node{
int data;
Node next;
Node(int data){
    this.data=data;
    this.next=null;
}}
private Node head;
private int size;
LinkedList5(){
this.head=null;
}

//Adding First
public void insertAtStart(int data){
    Node newNode=new Node(data);
    newNode.next=head;
    head=newNode;
       size++;
}

//Add Last
    public void insertAtAddlast(int data){
   Node newnode=new Node(data);
   Node current=head;
   while(current.next!=null){
   current=current.next;
   }
   size++;
   current.next=newnode;
    }
    
    //Add Middle Position
   public void insertSpecificpos(int data,int position){
      Node newnode=new Node(data);
      if(position==0){
          newnode.next=head;
          head=newnode;
         }
      else{
            Node current=head;
            for(int count=1; count<position; count++){
        
                current=current.next;
            }
             newnode.next=current.next;
              current.next=newnode;
      }}
//Delete from start
public void deleteheadnode(){
        if(this.head==null){
        System.out.println("List Is Empty cant delete node:");
        }
 head =head.next;
 size--;
 }

    //Delete from last
    public void deletefromEnd(){
Node secondLast=head;
Node last=head.next;
while(last.next!=null){
    last=last.next;
    secondLast=secondLast.next;
}
size--;
    secondLast.next=null;
    }
    
  //Size
    public int Size(int size){
    return size;
    }
    
   
      //Searching Element
      public int searching(int key){
         Node temp=head;
         int position=1;
         while(temp!=null){
             if(temp.data==key){
             return position;
             }
             temp=temp.next;
             position++;
         }
         return -1;
      }
      
     //Traversing 
      public void traversing(){
          Node temp=head;
          while(temp!=null){
             System.out.print(temp.data+" -->");
          temp=temp.next;
          }
     }
      //Reverse
     public void reverse(){
         if(head==null){
             System.out.println("List is empty");
             return;
           }
     Node prevnode=head;
     Node current=head.next;
     while(current!=null){
      Node nextnode=current.next;
      prevnode=current;
      current.next=prevnode;
      }
     head.next=null;
     head=prevnode; 
     }

//Print Method
      public void print(){
        if(head == null){
            System.out.println("List is empty can;t print");
            return;
        }
        Node currentNode = this.head;
         while(currentNode != null){
         System.out.print(currentNode.data+" -->");  
         currentNode = currentNode.next;
          }
        System.out.println("Null");
    }
      public static void main(String[] args) {
    LinkedList5 list = new LinkedList5();
    list.insertAtStart(1);
    list.insertAtStart(2);
    list.insertAtStart(3);
     list.insertAtAddlast(10);
    list.insertSpecificpos(20,2);
    //System.out.println("Size: "+list.size);
    list.print();

      int position=list.searching(10);
    if(position==-1){
        System.out.println("Element not found in linked list: ");
      }
    else{
        System.out.println("Element Found: at :"+position+" in list");
    }
    
    list.deleteheadnode();
    list.deletefromEnd();
   // System.out.println("Size: "+list.size);
    list.print();
    
    }}
