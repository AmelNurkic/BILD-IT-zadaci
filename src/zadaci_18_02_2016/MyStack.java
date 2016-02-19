/**
 *      (Revise the MyStack class)
 *      Rewrite the MyStack class in Listing 11.10
 *      to perform a deep copy of the list field.
 */
package zadaci_18_02_2016;

import java.util.*;

public class MyStack implements Cloneable {
	// attributes
	public ArrayList<Object> list = new ArrayList<>();

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int getSize() {
		return list.size();
	}

	public Object peek() {
		return list.get(getSize() - 1);
	}

	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public void push(Object o) {
		list.add(o);
	}

	@Override
	public String toString() {
		return "Stack: " + list.toString();
	}

	public Object clone() throws CloneNotSupportedException {
		MyStack MS = null;
		MS = (MyStack) super.clone();
		MS.list = new ArrayList<>(list);
		return MS;

	}
}
