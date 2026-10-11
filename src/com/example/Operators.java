package com.example;

public class Operators {

	// declare
	int i;
	// declare with initial
	int j = 10;

	// varaiableNameO

	// data types
	// primitive - byte, short, int, long, float, double, char, boolean
	// immutable - cannot be change
	// non- primitive - string, array, object
	// mutable - can be change

	public static void main(String[] args) {
		byte a = 121; // -128 to 127
		System.out.println(a);
		short b = 9743; // -32,768 to 32,767
		System.out.println(b);
		int c = 8328; // -2,147,483,648 to 2,147,483,647

		System.out.println(c); //
		long d = 949305454656565L;
		System.out.println(d);
		float f = 73f;
		System.out.println(f);
		double e = 3432;
		System.out.println(e);
		boolean isAlice = true;
		System.out.println(isAlice);
		char initial = 'M';

		//
		String name = "sujee";
		System.out.println(initial + "." + name);

//	operators 
//	Arithmetic Operators
//	+,-,/,*,%
		System.out.println(10 + 10);
		System.out.println(10 - 10);
		System.out.println(10 * 10);
		System.out.println(10 / 5);
		System.out.println(10 % 5);

//	Unary Operators
		// increment - pre(++i), post(i++)...., i++ (or) i=i+1
		// decrement - pre(--i), post(i--)....,i--(or) i=i-1
		int i = 10;
//	increment
		System.out.println("postIncrement " + (i++)+" oo "+i);
		System.out.println("increment-View " + i); // i=11
		System.out.println("pre-Increment " + (++i) + "\n");

//	now i=12, decrement

		System.out.println("postDecrement " + (i--));
		System.out.println("DecrementView " + i);
		System.out.println("preDecrement " + (--i));
		// i = 10
		System.out.println("example : "+ (i++ - ++i + --i)); //10 - 12 + 11 = 9
//	Assignment Operator
		// =,+=,-=,/=,*=,%=
		// k=7...inital after declar
		int k;
		k = 7;
		int j = k;
		System.out.println(k);
		// +=....k+=10 (or)k=k+10
		System.out.println("+= " + (k += 10));

		// -=....k-=10 (or)k=k-10
		System.out.println("-= " + (k -= 10));

		// *=....k*=10 (or)k=k*10
		System.out.println("*= " + (k *= 10));

		// /=....k/=10 (or)k=k/10
		System.out.println("/= " + (k /= 10));

		// %=....k%=10 (or)k=k%10
		System.out.println("%= " + (k %= 5));
//

//	Relational Operators
		System.out.println("\nBitwise Operator");
		// <,>,==,<=,>=,!=
		int r = 10, rr = 100;
		System.out.println(r < rr); // less than
		System.out.println(r > rr); // greater then
		System.out.println(r == rr); // 2ble equal to
		System.out.println(r <= rr); // less than equal to
		System.out.println(r >= rr); // greater than equal to
		System.out.println(r != rr); // not than equal to

//

//	Logical Operators
		// &&,||,!!

//

//	Ternary Operator
		// for logical checking
		// condition ? true block:flase block;
		System.out.println("\nTernary Operator");
		int c1 =(r != rr) ? 1 : 0;
		int c2 = r == rr ? 1 : 0;
		System.out.println(c1 + " " + c2);
//	

//	Bitwise Operators
		System.out.println("\nBitwise Operator");
//	&,|,!,^
		int s = 5, ss = 1;
		System.out.println(s & ss);
		// 0000 0101
		// 0000 0001
		// 0000 0001=1 *
		// 0000 0101=5 +
		// 0000 0100= 4
		// 1111 1010 -6
		System.out.println(s | ss); // +
		System.out.println(s ^ ss); // Opposite of or(|)
		System.out.println(~s); // Not
		System.out.println(~(~s)); // == s

//

//	Shift Operators
		// left shift "<<" right shift ">>"

		System.out.println(s << 2); ///left shift << n == 2**n;
		System.out.println(s >> 1);

		// 0000 0101
//	 0001 0100- 20
//00000 010=2

	}
}
