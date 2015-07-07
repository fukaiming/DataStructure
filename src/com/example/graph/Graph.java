package com.example.graph;

/**
 * DFS 顶点和顶点之间的连接情况----邻接矩阵 存放访问过的顶点下标--------栈 存放所有顶点---------------数组
 */
public class Graph {
	private final int MAX_VERTS = 20;
	private Vertex[] vertexList;// 保存所有顶点
	private int[][] adjMat;
	private int nVerts;
	private StackX theStack;

	public Graph() {
		vertexList = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS]; 
		nVerts = 0;
		for (int i = 0; i < MAX_VERTS; i++) {
			for (int j = 0; j < MAX_VERTS; j++) {
				adjMat[i][j] = 0;
			}
		}
		theStack = new StackX();
	}

	// 添加一个顶点，保存到数组中
	public void addVertex(char label) {
		Vertex newVertex = new Vertex(label);
		vertexList[nVerts++] = newVertex;
	}

	// 添加边
	public void addEdge(int row, int column) {
		adjMat[row][column] = 1;
		adjMat[column][row] = 1;
	}

	// 打印顶点信息
	public void displayVertex(int vertexIndex) {
		System.out.print(vertexList[vertexIndex].label + "  ");
	}

	// 深度遍历
	public void dfs() {
		vertexList[0].isVisited = true;
		displayVertex(0);
		theStack.push(0);
		while (!theStack.isEmpty()) {
			int vertexIndex = getAdjUnVisitedVertex(theStack.peek());
			if (vertexIndex != -1) {
				vertexList[vertexIndex].isVisited = true;
				displayVertex(vertexIndex);
				theStack.push(vertexIndex);
			} else {
				theStack.pop();
			}
		}

	}

	// 得到铃接未访问的结点
	private int getAdjUnVisitedVertex(int vertexIndex) {
		for (int j = 0; j < nVerts; j++) {
			if(adjMat[vertexIndex][j] == 1 && vertexList[j].isVisited == false){
				return j;
			}
		}
		return -1;
	}

}
