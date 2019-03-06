import java.util.Scanner;
import java.util.Arrays;
class QueueArray
{
	int arr[]= new int[5];
	int front=0,rear=0;
	public void enque(int data)
	{
		if(rear>=arr.length)
		
			System.out.println("Queue is full");
		
		else
		
			arr[rear++]=data;
		
	}
	public void deque()
	{
		if(front==rear)
			System.out.println("queue is empty");
		else
			System.out.println("Deleted Element is "+arr[front]);
			arr[front++]=0;
	}
	public void display()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.println("ELements are "+arr[i]);
		}
	}
	public static void main(String args[])
	{
		QueueArray obj = new QueueArray();
		obj.enque(10);
		obj.enque(20);
		obj.enque(30);
		obj.deque();
		obj.display();
	}
}