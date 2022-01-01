package week1and2lock;

import javax.swing.JOptionPane;

public class DriverLock
{
	public static void main (String[] args) {
		Lock myLock1 = new Lock("1235");
		Lock myLock2 =   new Lock("1235");
		Lock myLock3 =   new Lock("1235");

		String s = JOptionPane.showInputDialog ("Enter String");

		myLock1.enterCode(s);
		myLock2.enterCode(s);

//		myLock1.setCorrectCode("234");
//		Lock.setMasterKey("0000");
//
//		myLock1.save("test123456.txt");
//		myLock1.load("test123456.txt");


		if (myLock1.equals("abc"))
			System.out.println("Equals");

		if (myLock1.isUnlock())
			System.out.println ("OPEN Lock 1!");
		else
			System.out.println ("Lock 1 is Locked!!!");

		if (myLock2.isUnlock())
			System.out.println ("OPEN Lock 2!");
		else
			System.out.println ("Lock 2 is Locked!!!");

//		String s1 = "abc";
//		if (s1.equals("abcd"))
//		    System.out.println("eaa");

//		if (myLock1.equals(myLock3))
//			System.out.println ("Equal");
//
//		myLock2 = null;
//		if (myLock1.equals(myLock2))
//			System.out.println ("Equal");

//		if (Lock.equals(myLock1,myLock2))
//			System.out.println ("Equal");


	}        
}

