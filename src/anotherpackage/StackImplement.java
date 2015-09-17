package anotherpackage;

class queue{
	final int max_queue = 10;
	int front;
	int rear;
	int[] arr_queue = new int[max_queue];
	public void insert(int i){
		if(rear>max_queue)
		{
			System.out.println("Queue overflow");
		}
		else{
			arr_queue[rear] = i;
			rear=rear+1;
		}
		
	}
	public int delete(){
		int item = -1;
		if(front>rear)
		{
			System.out.println("Queue underflow");
		}
		else{
			item = arr_queue[front];
			arr_queue[front] = -1;
			front++;
		}
		return item;
	}
	public void display(){
		for(int i=front;i<rear;i++)
			System.out.print(arr_queue[i]+" ");
		System.out.println("");
	}
	
}
class Stack{
	final int max = 10;
	int top;
	int min = 10000;
	int[] arr = new int[max];
	public int findMin()
	{
		return min;
	}
	public void push(int i){
		if(top==max+1)
		{
			System.out.println("Stack overflow");
		}
		else{
			arr[top] = i;
			top=top+1;
			if(min>i){
				min = i;
			}
		}
		System.out.println(top);
	}
	public int pop(){
		int item = -1;
		if(top<0)
		{
			System.out.println("Stack underflow");
		}
		else{
			item = arr[top-1];
			arr[top-1] = -1;
			top--;
		}
		if(item==min)
			min = 10000;
		for(int i=top-1;i>=0;i--){
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		return item;
	}
	public void display(){
		for(int i=0;i<top;i++)
			System.out.print(arr[i]+" ");
		System.out.println("");
	}
}

public class StackImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(119);
		s.push(200);
		s.push(131);
		s.push(40);
		s.push(5);
		System.out.println("Stack:");
		s.display();
		System.out.println("Min:"+s.findMin());
		System.out.println("\nPopped:"+s.pop());
		s.display();
		System.out.println("Min:"+s.findMin());
		System.out.println("\nPopped:"+s.pop());
		s.display();
		System.out.println("Min:"+s.findMin());
		System.out.println("");
		queue q = new queue();
		q.insert(10);
		q.insert(20);
		q.insert(30);
		System.out.println("Queue:");
		q.display();
		System.out.println("Deleted:" + q.delete());
		q.display();
		
	}

}
