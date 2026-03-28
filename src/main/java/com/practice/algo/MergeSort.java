package com.practice.algo;

public class MergeSort {
    private void mergeSort(int[] a){
        int n=a.length;
        for(int size=0;size<n;size=size*2){
            for(int i=0;i<n-1;i=i+size*2){
                int mid= Math.min(i+size-1, n-1);
                int r= Math.min(i+2*size-1,n-1);
                merge(a, i, mid, r);
            }
        }
    }
    private void merge(int[] a, int l, int mid, int r){
        int n1= mid-l+1;
        int n2= r-mid;

        int[] arr1= new int[n1];
        int[] arr2= new int[n2];

        for(int i=0;i<n1;i++){
            arr1[i]=a[l+i];
        }
        for(int j=0;j<n2;j++){
            arr2[j]=a[mid+j+1];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                a[k++]=arr1[i++];
            }else{
                a[k++]=arr2[j++];
            }
           
        }
        while(i<n1){
            a[k++]=arr1[i++];
        }
        while(j<n2){
            a[k++]=arr2[j++];
        }
        
    }
}

