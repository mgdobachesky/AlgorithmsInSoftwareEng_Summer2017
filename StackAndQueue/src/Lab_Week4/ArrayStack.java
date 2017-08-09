package Lab_Week4;

public class ArrayStack {
	private int[] data;
	public ArrayStack(int size) {
		data = new int[size];
		clear();
	}
	
	public void clear() {
		for(int i = 0; i < data.length; i++) {
			data[i] = -1;
		}
	}
	
	public void push(int element) {
		int dataSize = this.size();
		data[dataSize] = element;
	}
	
	public int pop() {
		int dataSize = this.size();
		int result = 0;
		result = data[dataSize-1];
		data[dataSize-1] = -1;
		return result;
	}
	
	public int size() {
		int dataSize = 0;
		for(int i = 0; i < data.length; i++) {
			if(data[i] != -1) {
				dataSize++;
			}
		}
		return dataSize;
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
