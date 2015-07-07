package com.example.algorithm;

import java.io.IOException;

public class LinkDrive {
	public static void main(String[] args) throws IOException {
		Link myLink = new Link();
		myLink.getInput();
		System.out.println("结点个数："+ myLink.getNodeCount());
	}
}
