package com.filehandling;

import java.io.*;

public class FileOSExample {

	public static void main(String[] args) throws IOException {

//		Serialization in Java is the process of converting an object's state into a byte stream.

		Person p = new Person(111, "sri", 21);
		Person p2 = new Person(222, "sujee", 57);

		FileOutputStream fo = new FileOutputStream("person.txt");

		ObjectOutputStream obj = new ObjectOutputStream(fo);

		obj.writeObject(p);
		obj.writeObject(p2);

		obj.close();

		fo.close();

		// Deserialization - byte stream is converted back into an

			FileInputStream fi=new FileInputStream("person.txt");
			ObjectInputStream obj2=new ObjectInputStream(fi);

			while (true)

			try {

			Person person1 = (Person) obj2.readObject();
			System.out.println(person1.toString());

			} catch (Exception e) {

				break;
			}


			obj2.close();
			fi.close();

	}
}