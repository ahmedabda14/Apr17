/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg17apr;

/**
 *
 * @author ahmed
 */

public class Main {
public int[] bubbleSort(int[]list){
int i,j,temp;
for(i=0;i<list.length-1;i++){
    for(j=0;j<list.length-1;j++){
        if(list[j]>list[i+1]){
            temp=list[j];
            list[j]=list[j+1];
            list[j+1]=temp;
        }
    }
}
return list;
}
public int[]selectionSort(int[]list){
    int i,j,minValue,minIndex,temp=0;
    for(i=0;i<list.length;i++){
        minValue=list[i];
        minIndex=i;
        for(j=i;j<list.length;j++){
            if(list[j]<minValue){
                minValue=list[j];
                minIndex=j;
            }
        }
        if(minValue<list[i]){
            temp=list[i];
            list[i]=list[minIndex];
            list[minIndex]=temp;
        }
    }
    return list;
}
public class insertionSort{
    void sort(int arr){
        
    }
}
public void quickSort(int low, int high){
  
    if(low<high){
          int[] a;
        int temp=0; int pivot=a[low];
        int large_index=low+1;int small_index=high;
        while(large_index<small_index){
            while(a[large_index]<pivot){large_index++;}
            while(a[small_index]>pivot){small_index--;}
            if(large_index<small_index){
                exchangeNumbers(large_index,small_index);}
}
if(a[small_index]<pivot){exchange(small_index,low);}
if(low<small_index)quickSort(low,small_index-1);
if(high>small_index)quickSort(small_index+1,high);

            }
        }
    

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

    }

} 
