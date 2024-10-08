/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubble_sort;
/**
 *
 * @author Asim Raza
 */
import java .util.Scanner;
public class Bubble_Sort {
    //Task 1
    public void bubble_sort(int[] arr){
    int count=0;
   for(int i=0; i<arr.length-1; i++){
        for(int j=0; j<arr.length-1; j++){
          count++;
          if(arr[j]>arr[j+1]){
               int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }}}
      System.out.println("Steps counting: "+count);
 }

//Task 2
public void earlyStopBubbleSort(int[] arr){
 boolean flag;
 int count=0;
 for(int i=0; i<arr.length-1; i++){
     flag =false;
     for(int j=0; j<arr.length-i-1; j++){
         count++;
         if(arr[j]>arr[j+1]){
             int temp =arr[j];
             arr[j]=arr[j+1];
             arr[j+1]=temp;
             
             flag=true;
             }}
     if(flag == false){
     System.out.println("Count : "+count);
         return;
     }}}

//Task 3
public void Stringsort(String[] arr){
for(int i=0; i<arr.length-1; i++){
    for(int j=0; j<arr.length-1-i; j++){
   if(arr[j].length()>(arr[j+1]).length()){
      String temp=arr[j];
      arr[j]=arr[j+1];
      arr[j+1]=temp;
   }}}}  
  
   public static void main(String[] args) {
    Bubble_Sort b=new Bubble_Sort();
    Scanner src=new Scanner(System.in);

    System.out.print("Enter Size:" );     
   int size =src.nextInt();
      int[] arr=new int[size];
      for(int i=0; i<size; i++){
          arr[i]=src.nextInt();
      }
     System.out.println("Before Sorting;");
    for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
    }
    b.bubble_sort(arr);
      System.out.println("After Sorting;");
    for(int i=0; i<arr.length; i++){
       System.out.println(arr[i]);
    }
    b.earlyStopBubbleSort(arr);
      System.out.println("Reduce early Stop Array");
for(int i=0; i<arr.length; i++){
          System.out.println(arr[i]);
}
 String name[]={"apple","pie","banana","cat"};
b.Stringsort(name);
for(int i=0; i<name.length; i++){
    System.out.println(name[i]);

}}}

 
 














