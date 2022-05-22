package com.example;

public class Counter {
int startValue;

public Counter ( ) {
	startValue = 0;
	System.out.println(startValue);
}

public void increase( ) {
	startValue++;
	System.out.println(startValue);
}

public void decrease ( ) {
	startValue--;
	System.out.println(startValue);
}

public int value ( ) {
	return startValue;
}


public void increase(int increaseBy ) {
	if(increaseBy < 0) increaseBy = 0;
	startValue +=  increaseBy;
	System.out.println(startValue);
}

public void decrease (int decreaseBy ) {
	if(decreaseBy < 0) decreaseBy = 0;
	startValue-= decreaseBy;
	System.out.println(startValue);
}

public static void main(String args[]) {
	Counter counter = new Counter();
	counter.increase();
	counter.decrease();
	counter.increase(2);
	counter.decrease(1);
}

}