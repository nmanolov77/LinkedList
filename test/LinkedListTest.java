/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nmanolov
 */
public class LinkedListTest {
    
    public LinkedListTest() {
    }

    /**
     * Test of next method, of class LinkedList.
     */
    @Test
    public void testNext() {
        ILinkedList instance = new LinkedList<>();
        ILinkedList expected = null;
        ILinkedList result = instance.next();
        assertEquals(expected, result);
        
    }
        public void testNext2() {
        ILinkedList instance = new LinkedList<>(5);
        ILinkedList instance2 = new LinkedList<>(2);
        ILinkedList expected = null;
        instance.setNext(instance2);
        ILinkedList result = instance.next();
        //checking if next is linked to first node
        assertEquals(expected, result);
        
    }

    /**
     * Test of last method, of class LinkedList.
     */
    @Test
    public void testLast() {
        ILinkedList instance1 = new LinkedList<>();
        ILinkedList instance2 = new LinkedList<>();
        ILinkedList instance3 = new LinkedList<>();
        ILinkedList instance4 = new LinkedList<>();
        instance1.set(5);
        instance2.set(10);
        instance3.set(15);
        instance4.set(20);
        instance1.setNext(instance2);
        instance2.setNext(instance3);
        instance3.setNext(instance4);
        //setting up the linkedList
        
        ILinkedList expected = instance4;
        ILinkedList result = instance1.last();
        //
        assertEquals(expected, result);
    }

    /**
     * Test of after method, of class LinkedList.
     */
    @Test
    public void testAfter() {
        System.out.println("after");
        int n = 3;
        LinkedList instance1 = new LinkedList();
        LinkedList instance2 = new LinkedList();
        LinkedList instance3 = new LinkedList();
        LinkedList instance4 = new LinkedList();
        LinkedList instance5 = new LinkedList();
        instance1.set(3);
        instance2.set(6);
        instance3.set(9);
        instance4.set(12);
        instance5.set(15);
        //setting up the linkedList
        instance1.setNext(instance2);
        instance2.setNext(instance3);
        instance3.setNext(instance4);
        instance4.setNext(instance5);
        //linking the nodes
        Object result = instance1.after(n);
        //inserting a node at index n
        Object expResult = instance2;
        
        assertEquals(expResult, result);
    }

    /**
     * Test of detach method, of class LinkedList.
     */
    @Test
    public void testDetach() {
        System.out.println("detach");
        LinkedList instance1 = new LinkedList();
        LinkedList instance2 = new LinkedList();
        LinkedList instance3 = new LinkedList();
        LinkedList instance4 = new LinkedList();
        LinkedList instance5 = new LinkedList();
        //setting up the linkedList
        instance1.set(6);
        instance2.set(12);
        instance3.set(18);
        instance4.set(24);
        instance5.set(30);
        instance1.setNext(instance2);
        instance2.setNext(instance3);
        instance3.setNext(instance4);
        instance4.setNext(instance5);
        Object expResult =  instance1.get();
        Object result =  instance1.detach().get();//pulling off the head
        assertEquals(expResult, result);

    }

    /**
     * Test of get method, of class LinkedList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        LinkedList instance = new LinkedList();
        instance.set(5);
        //setting up the linkedList
        Object expResult = 5;
        Object result = instance.get();
        //gets the value of node
        assertEquals(expResult, result);
        

    }

    /**
     * Test of set method, of class LinkedList.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        LinkedList instance = new LinkedList();
        instance.set(6);
         //setting up the linkedList
        Object result = instance.get();
        //sets value of node
        Object expResult = 6;
        assertEquals(expResult, result);
    }

    /**
     * Test of setNext method, of class LinkedList.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        LinkedList instance1 = new LinkedList();
        instance1.set(5);
        LinkedList instance2 = new LinkedList();
        instance2.set(10);
         //setting up the linkedList
        
        instance1.setNext(instance2);
        //links instance1 node to instance2
        Object expResult = instance2;
        Object result = instance1.next();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of append method, of class LinkedList.
     */
    @Test
    public void testAppend() {
        System.out.println("append");
        LinkedList instance1 = new LinkedList();
        instance1.set(5);
        LinkedList instance2 = new LinkedList();
        instance2.set(10);
        //setting up linkedList
        
        instance1.append(instance2);
        //linking instance1 to be the head of the list
        Object expResult = instance2;
        Object result = instance1.next();
        assertEquals(expResult, result);

    }

    /**
     * Test of insert method, of class LinkedList.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        LinkedList instance1 = new LinkedList();
        LinkedList instance2 = new LinkedList();
        LinkedList newFront = new LinkedList();
        instance1.set(3);
        instance2.set(6);
        newFront.set(55);
        instance1.setNext(instance2);
        //setting up the linkedList and loading it with values
        instance1.insert(newFront);
        //inserting a node in the beggining of the list
        
        Object expResult = instance1;
        Object result = newFront.next();
        
        assertEquals(expResult, result);
        
    }

    
}
