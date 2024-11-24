package com.example.project;

public class LinkedList<T> implements List<T>{
	private Node<T> head;
	private Node<T> current;

    public LinkedList() {
		head = current = null;
	}
	public boolean empty() {
		return head == null;
	}
	public boolean last() {
		return current.next == null;
	}
    public boolean full() {
        return false;
    }
    public void findFirst() {
        current = head;
    }
    public void findNext() {
        current = current.next;
    }
    public T retrieve() {
        return current.data;
    }
    public void update(T e) {
        current.data = e;
    }
    public void insert(T e) {
        if (empty()) {
            current = head = new Node<T>(e);
        } else {
            Node<T> tmp = current.next;
            current.next = new Node<T>(e);
            current = current.next;
            current.next = tmp;
        }
    }
    public void remove() {
        if (current == head) {
            head = head.next;
        } else {
            Node<T> tmp = head;
            while (tmp.next != current) {
                tmp = tmp.next;
            }
            tmp.next = current.next;
        }
        if (current.next == null) {
            current = head;
        } else {
            current = current.next;
        }
    }
    public T mostFrequentElement() {
    	if(head==null)
    		return null ;
    	current=head;
    	int size=1;
        while(current.next!=null) {
        	current=current.next;
        	size++;
        }
        T[] arr=(T[])new Object[size];
        int[] num= new int[size];
        
        current=head;
        for(int i=0;i<size;i++) {
        	arr[i]=current.data;
        	current=current.next;
        	
        }
        for(int i=0;i<size;i++) {
        	int x=2;
        	for (int j=i+1;j<size;j++)
        		if (arr[i].equals(arr[j]))
        			num[i]=x++;
        }
        int highIndex=0;
        for(int i=0;i<size;i++)
        	if(num[i]>num[highIndex])
        		highIndex=i;
        return arr[highIndex];
    }
}
