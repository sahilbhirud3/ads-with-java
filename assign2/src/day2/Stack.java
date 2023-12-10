package day2;

import java.util.EmptyStackException;

public class Stack {
	private int[] stack;
	private int top;

	public Stack() {
		this.stack = new int[10];
		this.top = -1;
	}

	public Stack(int capacity) {
		this.stack = new int[capacity];
		this.top = -1;
	}

	public boolean isEmpty() {
		return this.top == -1;
	}

	public boolean isFull() {
		return this.top == stack.length - 1;
	}

	public int count()
	{
		return top+1;
	}
	public void push(int element) {
		if (isFull()) {
			throw new StackOverflowError();
		} else {
			stack[++top] = element;
		}
	}

	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		} else {
			return stack[top--];
		}
	}

	public int peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		} else {
			return stack[top];
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
		} else {
			System.out.print("Stack content : ");
			for (int i = 0; i <= top; i++) {
				System.out.print(stack[i] + " ");
			}
			System.out.println();
		}
	}

}
