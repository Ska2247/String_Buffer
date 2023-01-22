package com.string.function;

public class String_Buffer_Class {

	public static void main(String[] args) {

		StringBuffer a = new StringBuffer("My Own Method");

		StringBuffer insert = a.insert(6, " Buffer");
		System.out.println("Value of Insert = " + insert);

		StringBuffer replace = a.replace(13, 14, " Creation ");
		System.out.println("Value of Replace = " + replace);

		StringBuffer delete = a.delete(7, 13);
		System.out.println("Value of Delete = " + delete);

		StringBuffer reverse = a.reverse();
		System.out.println("Value of Reverse = " + reverse);

	}

}
