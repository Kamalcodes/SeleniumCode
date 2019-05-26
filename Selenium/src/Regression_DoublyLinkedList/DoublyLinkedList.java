package Regression_DoublyLinkedList;

public class DoublyLinkedList 
{
	protected Node start;
	protected Node end;
	public int size;
	
	/*Constructor*/
	public DoublyLinkedList()
	{
		start=null;
		end=null;
		size=0;
	}
	/*Function to check if list is empty*/
	public boolean isEmpty()
	{
		return start==null;
	}
	/*Function to get size of list*/
	public int getSize()
	{
		return size;
	}
	/*Function to insert element at begining*/
	public void insertAtStart(int val)
	{
		Node nptr=new Node(val,null,null);
		if(start==null)
		{
			start=nptr;
			end=start;
		}
		else
		{
			start.setLinkPrev(nptr);
			nptr.setLinkNext(start);
			start=nptr;
		}
		size++;
	}
	/*Function to insert element at end*/
	public void insertAtEnd(int val)
	{
		Node nptr=new Node(val,null,null);
		if(start==null)
		{
			start=nptr;
			end=start;
		}
		else
		{
			nptr.setLinkPrev(end);
			end.setLinkNext(nptr);
			end=nptr;
		}
		size++;
	}
	/*Function to insert element at position*/
	public void insertAtPos(int val,int pos)
	{
		Node nptr=new Node(val,null,null);
				if(pos==1)
				{
					insertAtStart(val);
					return;
				}
		Node ptr=start;
		for(int i=2;i<=size;i++)
		{
			if(i==pos)
			{
				Node tmp=ptr.getLinkNext();
				ptr.setLinkNext(nptr);
				nptr.setLinkPrev(ptr);
				nptr.setLinkNext(tmp);
				tmp.setLinkPrev(nptr);
			}
			ptr=ptr.getLinkNext();
		}
		size++;
	}
	
	/*Funtion to delete note at position*/
	
	public void deleteAtPos(int pos)
	{
		if(pos<1 || pos>size)
		{
			throw new IllegalArgumentException("out of range");
		}
		
		if(pos ==1)
		{
			if(size==1)
			{
				start=null;
				end=null;
				size=0;
				return;
			}
			start=start.getLinkNext();
			start.setLinkPrev(null);
			size--;
			return;
		}
		if(pos==size)
		{
			end=end.getLinkPrev();
			end.setLinkNext(null);
			size--;
		}
		Node ptr=start.getLinkNext();
		for(int i=2;i<=size;i++)
		{
			if(i == pos)
			{
				Node p=ptr.getLinkPrev();
				Node n=ptr.getLinkNext();
				
				p.setLinkNext(n);
				n.setLinkPrev(p);
				size--;
				return;
			}
			ptr=ptr.getLinkNext();
		}
	}
	
	/*Function to display status of list*/
	public String display()
	{
		String str="";
		System.out.print("\nDoubly Linked List=");
		str+="Doubly Linked List=";
		if(size==0)
		{
			System.out.print("empty\n");
			str+="empty";
			return str;
		}
		if(start.getLinkNext()==null)
		{
			System.out.println(start.getData());
			str+=start.getData();
			return str;
		}
		Node ptr=start;
		System.out.print(start.getData()+"<->");
		str+=start.getData()+"<->";
		ptr=start.getLinkNext();
		while(ptr.getLinkNext()!=null)
		{
			System.out.print(ptr.getData()+"<->");
			str+=ptr.getData()+"<->";
			ptr=ptr.getLinkNext();
		}
		System.out.print(ptr.getData()+"\n");
		str+=ptr.getData();
		return str;
	}
}

class Node
{
	protected int data;
	protected Node next,prev;
	
	/*Constructor*/
	public Node()
	{
		next = null;
		prev=null;
		data=0;
	}
	public Node(int d,Node n,Node p)
	{
		data=d;
		next=n;
		prev=p;
	}
	/*Function to set link to next node*/
	
	public void setLinkNext(Node n)
	{
		next =n;
		
	}
	/*function to set to previous node*/
	public void setLinkPrev(Node p)
	{
		prev= p;
	}
	/*Function to get link to next node*/
	public Node getLinkNext()
	{
		return next;
	}
	/*Function to get link to previous node*/
	
	public Node getLinkPrev()
	{
		return prev;
	}
	
	/*Function to set data to node*/
	public void setData(int d)
	{
		data=d;
	}
	/*function to get data from node*/
	
	public int getData()
	{
		return data;
	}
	
}
