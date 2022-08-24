import java.util.Scanner;

class QueueException extends Exception{
    public void Error()
    {
        System.out.println("Queue is full");
    }
}
class Queue{
    int rear;
    int front;
    int q[];
    Queue(int n)
    {
        q=new int[n];

    }
    void insert(int ele) throws QueueException
    {
        if(rear==q.length){
            throw new QueueException();
        }
        if(front==-1)
        front=0;
        q[rear++]=ele;
    }
    int delete()
    {
        int ele;
        if(front==-1)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        if(front==rear){
            ele=q[front];
            rear=front=-1;

        }
        else

    {
    ele=q[front++];
    }
    return ele;
}

void display()
{
    if(front==-1)
    {
        System.out.println("Queue is Empty");
        return;
    }
    for(int i=front; i<rear; i++)
    System.out.println(q[i]+"\t");
}
}
public class prg7{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a limit");
        int size=sc.nextInt();
        Queue que=new Queue(size);
        try{
            while(true){
                System.out.println("\n 1.insert \n 2.delete \n 3.display \n 4.exit");
                System.out.println("enter your choice");
                int choice=sc.nextInt();
            switch(choice) 
            {
                case 1:System.out.println("enter a number to insert");
                que.insert(sc.nextInt());
                break;
                
                case 2:System.out.println("delete item is:"+que.delete());
                break;

                case 3:que.display();
                break;
                
                default:System.out.println("worng choice");
                return;
            }
        }
    }


         catch (QueueException e){
            e.Error();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Queue is Empty");
        }
    }
}


