/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doublyll;
/**
 *
 * @author Asim Raza
 */
public class DoublyLL {
public class Node{
int data;
Node next;
Node previous;
Node(int data){
this.data=data;
this.next=null;
this.previous=null;
}}
private Node head;
private Node tail;
DoublyLL(){
this.head=null;
this.tail=null;
} 
// Insert At First
public void AddFirst(int data){
    Node newNode=new Node(data);
    if(head ==null){
    head = tail = newNode;
    }
    else{
    newNode.next = head;
    head.previous = newNode;
    head = newNode;
    }}

//Insert At Tail
public void AddTail(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
        }
    else{
        tail.next=newNode;
        newNode.previous=tail;
        tail=newNode;
    }}

//Insert At position:)

public void addAtPosition(int data, int position){
    Node newnode=new Node(data);
Node current=head;
for(int i=0; i<=position; i++){
    current=current.next;
    }
 newnode.previous=current;
 newnode.next=current.next;
 current.next=newnode;
    
}

//Delete First Node: 
public void DelFirst(){
if(head==null){
    System.out.println("List Is Empty:");
}
if(head==tail){
    head=null;
    tail=null;
    }
else{
    head=head.next;
    head.previous=null;
   }}

//Delete From End: 
public void DelEnd(){
if(tail==null){
    System.out.println("List Is Empty:");
}
if(head==tail){
    head=null;
    tail=null;
    }
else{
    tail=tail.previous;
    tail.next=null;
   }}

//Delete By Value:)
public void deleteValue(int position){
    Node current=head;
int count=1;
while(current!=null &&count!=position){
    if(current.data==position){
        if(current==head){
            DelFirst();
        }
        else if(current==tail){
         DelEnd();
        }}
current=current.next;
count++;
}
current.previous.next=current.next;
current.next.previous=current.previous;
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
      
//Reverse
public void reverse(){
Node current=tail;
while(current!=null){
    System.out.print(current.data+"->");
    current=current.previous;
     }}
 
//Count:)
public int count(){
    Node current=head;
    int count=0;
    while(current!=null){
        count++;
        current=current.next;
      }
    return count;
}

    //Print  For All Method: 
    public void print(){
    if(head==null){
        System.out.println("Doubly LL Is Empty: ");
      return;
    }
    Node current=head;
    while(current !=null){
        System.out.print(current.data +"->");
        current=current.next;
    }
        System.out.println("null");
    }
      public static void main(String[] args) {
      DoublyLL list=new DoublyLL();
      list.AddFirst(1);
      list.AddFirst(2);
      list.AddFirst(3);
      list.AddFirst(4);
      list.AddTail(5);
      list.print();
        System.out.println("Total Nodes are: "+list.count());
      list.addAtPosition(5, 2);
     list.deleteValue(4);
      list.print();
         int position=list.searching(3);
    if(position==-1){
        System.out.println("Element not found in linked list: ");
      }
    else{
        System.out.println("Element Found: at :"+position+" in list");
    }
    
     list.DelFirst();
    list.DelEnd();
      list.print();
      list.print();
     list.reverse();
      
    }}
