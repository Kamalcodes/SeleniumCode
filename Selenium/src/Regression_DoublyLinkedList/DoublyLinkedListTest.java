package Regression_DoublyLinkedList;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DoublyLinkedListTest
{
	DoublyLinkedList list;
	
	@Before
	public void setUp()throws Exception
	{
		list=new DoublyLinkedList();
	}
	@Test
	public final void testIsEmpty()
	{
		assertTrue(list.isEmpty());
	}
	@Test
	public final void testGetSize()
	{
		assertEquals(0, list.getSize());
	}
	@Test
	public final void testInsertAtStart()
	{
		list.insertAtStart(3);
		list.insertAtStart(5);
		assertEquals(2, list.getSize());
		assertEquals("Doubly Linked List=5<->3", list.display());
	}
	
	@Test
	public final void testInsertAtEnd()
	{
		list.insertAtStart(3);
		list.insertAtEnd(5);
		assertEquals("Doubly Linked List=3<->5",list.display());
	}
	
	@Test
	public final void testInsertAtPos()
	{
		list.insertAtStart(3);
		list.insertAtEnd(5);
		list.insertAtStart(8);
		list.insertAtEnd(9);
		
		list.insertAtPos(10,2);
		assertEquals("Doubly Linked List = 8 <-> 10 <-> 3 <-> 5 <-> 9", list.display());
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public final void testDeleteAtPosException()
	{
		list.deleteAtPos(0);
	}
	
	@Test
	public final void testDisplayEmpty()
	{
		assertEquals("Doubly Linked List=empty",list.display());
	}
	
}
