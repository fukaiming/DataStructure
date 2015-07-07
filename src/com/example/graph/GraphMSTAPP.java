package com.example.graph;

public class GraphMSTAPP {
	public static void main(String[] args) {
		GraphMST graph = new GraphMST();
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(0, 3);
		graph.addEdge(3, 4);
		System.out.println("MST visit");
		graph.mst();
		System.out.println(" ");
	}
}
