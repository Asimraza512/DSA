/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackwitharray;

/**
 *
 * @author Asim Raza
 */
public class StackWithArray {
int size;
int top;
int []array;
public StackWithArray(int size){
    this.size=size;
    array=new int[this.size];
    top=-1;
    }

  //Push Method
public void Push(int data){
    if(top>=size-1){
        System.out.print("Stack Is Full:) ");
   return;
     }
  
         array[++top]=data;  
        // System.out.print("Element: "+data);
    }
    
   //Pop Method
   public int  pop(){
    if(top<0){
        System.out.println("Stack Is UnderFlow :) ");
    return-1;
     }
     return array[top--];
   
   }
   
   //Is Empty Method
   public boolean isEmpty(){
       return top==-1;
            } 
   
   // Stack Is Full
   
   public boolean Full(){
   return top==size-1;
   }
   
      //Peek Method
   public int peek(){
       
   if(top<0){
       System.out.println("Stack is Empty:)");
       return-1;   
   }
   return array[top];
   } 
    
   //PrintAll Method
   public void PrintAll(){
   if(top<=0){
        System.out.println("Stack Is UnderFlow :) ");
    return;
     }
   else{
   for(int i=top; i>=0; i--){
       System.out.print(array[i]+" ");
   }
       System.out.println();
   }}
   
   
    public static void main(String[] args) {
    StackWithArray stack=new StackWithArray(5);
    stack.Push(5);
    stack.Push(4);
    stack.Push(3);
    stack.Push(2);
    stack.Push(1);
        System.out.println("Peek Element is: "+stack.peek());
    stack.pop();
       
    stack.PrintAll();
    }}