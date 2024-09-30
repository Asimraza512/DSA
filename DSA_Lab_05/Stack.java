
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack;

/**
 *
 * @author Asim Raza
 */
public class Stack {
   public class Node{
   int data;
   Node next;
  public  Node(int data){
    this.data=data;
  }
   }
   private Node top;
   private int length;
   public Stack(){
   this.top=null;
   this.length=0;
   }
   public int length(){
   return length;
   }
   //When Stack is 0 which return the True
   public boolean isEmpty(){
   return length==0;
   }
   
   //Push Method
   public void push(int data){
     Node temp=new Node(data);
       temp.next=top;
       top=temp;
       length++;
   }
   
   //Pop Method
   public int pop(){
   if(isEmpty()){
       System.out.println("Stack is Empty:)");
   }
   int result=top.data;
   top=top.next;
   length--;
   return result;
   }
   
   //Peek Method
   public int peek(){
   if(isEmpty()){
       System.out.println("Stack is Empty:)");
   }
   return top.data;
   }
   
   //Display All
   public void PrintAll(){
   if(top==null){
       System.out.println("Stack Is Empty");
   }
   else{
   Node current=top;
   while(current!=null){
       System.out.println(current.data);
    current=current.next;
   }
       System.out.println();
   }
   }
   
   public static void main(String[] args) {
   Stack stack=new Stack();
  stack.push(1);
   stack.push(2);
   stack.push(3);
   stack.push(4);
   stack.push(5);
 System.out.println(stack.peek());
     stack.pop();
System.out.println(+stack.peek());
 stack.pop();
System.out.println("Remove Value is: "+stack.peek());
System.out.println("Peek Value is "+stack.peek());
   }}
