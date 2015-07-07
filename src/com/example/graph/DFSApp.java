package com.example.graph;

public class DFSApp {
	public static void main(String[] args) {
		Graph theGraph = new Graph();
		theGraph.addVertex('A'); //0
		theGraph.addVertex('B'); //1
		theGraph.addVertex('C'); //2
		theGraph.addVertex('D'); //3
		theGraph.addVertex('E'); //4
		theGraph.addEdge(0, 1);
		theGraph.addEdge(1, 2);
		theGraph.addEdge(0, 3);
		theGraph.addEdge(3, 4);
		System.out.println("Visits");
		theGraph.dfs();
		System.out.println(" ");
		
	}
}
