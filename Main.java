package com.company;

public class Main {
    public int[] Insert( int arr[])
    {
        int j,temp,key;

        for( int i =1;i<arr.length;i++ )
        {
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key)
            {
                temp =arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                j--;
            }


        }




    return arr;
    }




    public static void main(String[] args) {
	// write your code here

        int arr[]={9,1,7,4};
        Main obj1=new Main();
        obj1.Insert(arr);

        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
