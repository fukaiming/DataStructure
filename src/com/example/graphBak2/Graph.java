package com.example.graphBak2;

/*
 * DFS:深度搜索遍历
 * 
 */
public class Graph {
	private final int MAX_SIZE = 10;
	private Vertex[] vertexList;
	private int nVerts;// 表示当前数组中元素的个数
	private int[][] adjMatrix;
	private Stack stack;// 保存已访问顶点的下标

	public Graph() {
		vertexList = new Vertex[MAX_SIZE];
		nVerts = 0;
		adjMatrix = new int[MAX_SIZE][MAX_SIZE];
		for (int i = 0; i < MAX_SIZE; i++) {
			for (int j = 0; j < MAX_SIZE; j++) {
				adjMatrix[i][j] = 0;
			}
		}
		stack = new Stack();
	}

	// 添加顶点
	public void addVertex(char label) {
		Vertex vertex = new Vertex(label);
		vertexList[nVerts++] = vertex;
	}

	// 添加顶点和顶点之间的边
	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}

	// 显示顶点元素信息
	public void displayVertex(int vertexIndex) {
		System.out.print(vertexList[vertexIndex].label + " ");
	}

	// DFS
	public void dfs() {
		vertexList[0].isVisited = true;
		displayVertex(0);
		stack.push(0);
		while (!stack.isEmpty()) {
			int vertexIndex = stack.peek();
			int adjVertex = getUnVisitedAdjVertex(vertexIndex);
			if (adjVertex != -1) {
				vertexList[adjVertex].isVisited = true;
				displayVertex(adjVertex);
				stack.push(adjVertex);
			} else {
				stack.pop();
			}

		}

	}

	private int getUnVisitedAdjVertex(int vertexIndex) {
		for (int j = 0; j < nVerts; j++) {
			if (adjMatrix[vertexIndex][j] == 1
					&& vertexList[j].isVisited == false) {
				return j;
			}
		}
		return -1;
	}

	// MST:最小生成树
	public void mst() {
		vertexList[0].isVisited = true;
		stack.push(0);
		while (!stack.isEmpty()) {
			int vertexIndex = stack.peek();
			int adjVertex = getUnVisitedAdjVertex(vertexIndex);
			if (adjVertex != -1) {
				vertexList[adjVertex].isVisited = true;
				stack.push(adjVertex);
				displayVertex(vertexIndex);
				displayVertex(adjVertex);
				System.out.printf(" ");
			} else {
				stack.pop();
			}
			
		}
	}
	
	
}
