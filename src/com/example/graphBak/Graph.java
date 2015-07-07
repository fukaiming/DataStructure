package com.example.graphBak;

/**
 * 定义图 vertexList:用于存储所有的顶点 int[][] adjMatrix:用于存放邻接矩阵 theStack:用于已访问过元素的下标
 *
 */
public class Graph {
	private final int MAX_VERTS = 20;
	private Vertex[] vertexList;
	private int[][] adjMatrix;
	private StackX theStack;
	private int nVerts;// 表示当前数组vertexList元素个数

	public Graph() {
		vertexList = new Vertex[MAX_VERTS];
		adjMatrix = new int[MAX_VERTS][MAX_VERTS];
		theStack = new StackX();
		nVerts = 0;
	}

	// 添加顶点元素
	public void addVertex(char label) {
		Vertex newVertex = new Vertex(label);
		vertexList[nVerts++] = newVertex;
	}

	/*
	 * 定义顶点和顶点之间邻接边 start:起始顶点 end：终止顶点
	 */
	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}

	// 显示顶点信息
	public void displayVertex(int vertexIndex) {
		System.out.println(vertexList[vertexIndex].label);
	}

	// dfs深度遍历
	public void dfs() {
		vertexList[0].isVisited = true;
		displayVertex(0);
		theStack.push(0);

		while (!theStack.isEmpty()) {
			int vertexIndex = getAdjUnVisitedVertex(theStack.peek());
			if(vertexIndex != -1){
				vertexList[vertexIndex].isVisited = true;
				displayVertex(vertexIndex);
				theStack.push(vertexIndex);				
			}else{
				theStack.pop();
			}
		}
		
		//当栈为空时，则完成了深度优先遍历,将结点是否访问位重置
		for(int i=0;i<nVerts;i++){
			vertexList[i].isVisited = false;
		}
	}

	private int getAdjUnVisitedVertex(int vertexIndex) {
		for (int j = 0; j < nVerts; j++) {
			if(adjMatrix[vertexIndex][j] == 1 && vertexList[j].isVisited == false){
				return j;
			}
		}
		return -1;
	}

}
