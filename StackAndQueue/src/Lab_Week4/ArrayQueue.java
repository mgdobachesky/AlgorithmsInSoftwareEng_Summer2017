package Lab_Week4;

import java.util.Arrays;

public class ArrayQueue {
	private int[] data;
	private int head;
	private int tail;
	
	public ArrayQueue(int size) {
		data = new int[size];
		clear();
		head = -1;
		tail = -1;
	}
	
	public void clear() {
		Arrays.fill(data, -1);
		head = -1;
		tail = -1;
	}
	
	public void enqueue(int element) {
		// incase the array is not big enough to push another element
		if(tail >= data.length) {
			int temp[] = new int[data.length * 2];
			for(int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}
			data = temp;
		}
		// push the element
		int dataSize = 0;
		if(tail != -1 && head != -1)
			dataSize = this.size();
		data[dataSize] = element;
		tail++;
		// handle the situation where first head is enqueued
		if(head == -1) {
			head = 0;
		}
	}
	
	public int dequeue() {
		int result = -1;
		if(tail >= -1) {
			int dataSize = this.size();
			result = data[head++];
			data[head] = -1;
		}
		return result;
	}
	
	public int size() {
		return (tail - head) + 1;
	}
	
	public boolean find(int element) {
		for(int i = 0; i < data.length; i++) {
			if(data[i] == element) {
				return true;
			}
		}
		return false;
	}
	
	public int indexOf(int element) {
		for(int i = 0; i < data.length; i++) {
			if(data[i] == element) {
				return i;
			}
		}
		return -1;
	}
}
