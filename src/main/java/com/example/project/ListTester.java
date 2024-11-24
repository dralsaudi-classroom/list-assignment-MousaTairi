package com.example.project;

public class ListTester {
    public static <T> void circularLeftShift(List <T> list, int n)
    {
    	int size=1;
    	list.findFirst();
    	while(!list.last()) {
    		list.findNext();
    		size++;
    	}
    	list.findFirst();
        T[] arr=(T[])new Object[size];
        for(int i=0;i<size;i++) {
        	arr[i]=list.retrieve();
        	list.findNext();
        }
        list.findFirst();
    	for(int i=0;i<size;i++) {
    		list.update(arr[(i+n)%size]);
    		list.findNext();
    	}
    		
    	
        
    }
    public static <T> void reverseCopy(DLL<T> l1, DLL<T> l2)
    {
    	l1.findFirst();
    	while (!l1.last())
    		l1.findNext();
    	while(!l1.first()) {
    		l2.insert(l1.retrieve());
    		l1.findPrevious();
    	}
		l2.insert(l1.retrieve());
        
    }
}
