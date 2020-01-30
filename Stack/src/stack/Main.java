package stack;

import java.util.*;

public class Main {
		public static void main(String args[]) {
			Stack<Thing> myStack = new Stack<>();
			
			int numOfThings = 10;
			
			for (int i = 0; i < numOfThings; i ++) {
				Thing aThing = new Thing(i);
				myStack.push(aThing);
				System.out.println("Push: Thing" + aThing.myId + " " + myStack);
			}
			
			for (int i = 0; i < numOfThings; i ++ ) {				
				myStack.pop();
				System.out.println("Pop: " + myStack);
			}
		}
}
