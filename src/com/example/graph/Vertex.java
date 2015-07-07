package com.example.graph;

//定义顶点元素
public class Vertex {
	public char label;
	public boolean isVisited;

	public Vertex(char label) {
		this.label = label;
		isVisited = false;
	}
}
