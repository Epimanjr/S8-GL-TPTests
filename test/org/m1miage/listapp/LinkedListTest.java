package org.m1miage.listapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe de test
 */
public class LinkedListTest {

    public LinkedListTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test de la méthode insert()
     */
    @Test
    public void testInsert() {
        LinkedList liste = new LinkedList(1, null);
        liste.insert(2);
        assertEquals(new Integer(2), liste.getNext().getElement());
    }

    /**
     * Test de la méthode deleteNext()
     */
    @Test
    public void testDeleteNext() {
        LinkedList liste = new LinkedList(1, new LinkedList(2, new LinkedList(3, null)));
        liste.deleteNext();
        assertEquals(new Integer(3), liste.getNext().getElement());
        liste.deleteNext();
        assertEquals(null, liste.getNext());
    }

    /**
     * Test de la méthode toString()
     */
    @Test
    public void testToString() {
        assertEquals("1 2 3", new LinkedList(1, new LinkedList(2, new LinkedList(3, null))).toString());
    }

    /**
     * Test de la méthode last() Vous devez écrire cette méthode de test.
     * Indication: il y a au moins deux tests à effectuer
     */
    @Test
    public void testLast() {
        assertEquals(3, new LinkedList(1, new LinkedList(2, new LinkedList(3, null))).last());
        assertEquals(1, new LinkedList(1, null).last());
    }

    /**
     * Test de la méthode append()
     */
    @Test
    public void testAppend() {
        assertEquals("1 2", new LinkedList(1, new LinkedList(2, null)).append(null).toString());
        assertEquals("1 2 3 4", new LinkedList(1, new LinkedList(2, null)).append(new LinkedList(3, new LinkedList(4, null))).toString());
        assertEquals("3 4", new LinkedList(3, null).append(new LinkedList(4, null)).toString());
    }

    /**
     * Test de la méthode equals()
     */
    @Test
    public void testEquals() {
        assertEquals(false, new LinkedList(1, null).equals(new Integer(1)));
        assertEquals(true, new LinkedList(1, null).equals(new LinkedList(1, null)));
        assertEquals(true, new LinkedList(1, new LinkedList(2, null)).equals(new LinkedList(1, new LinkedList(2, null))));
        assertEquals(false, new LinkedList(1, null).equals(new LinkedList(1, new LinkedList(2, null))));
        assertEquals(false, new LinkedList(1, new LinkedList(2, null)).equals(new LinkedList(1, null)));
        assertEquals(false, new LinkedList(1, new LinkedList(2, null)).equals(new LinkedList(1, new LinkedList(3, null))));
    }

    /**
     * Test de la méthode reverse() Vous devez écrire cette méthode de test.
     */
    @Test
    public void testReverse() {
        assertEquals("4 3 2 1", new LinkedList(1, new LinkedList(2, new LinkedList(3, new LinkedList(4, null)))).reverse().toString());
        assertEquals("3 2 1", new LinkedList(1, new LinkedList(2, new LinkedList(3, null))).reverse().toString());
        assertEquals("1", new LinkedList(1, null).toString());
    }
}
