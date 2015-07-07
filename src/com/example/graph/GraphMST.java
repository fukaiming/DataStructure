package com.example.graph;

public class GraphMST {
	private final int MAX_VERTS = 20;
	private Vertex[] vertexList;
	private int nVerts;// 当前数组元素的个数 ！用于添加元素
	private int[][] adjMatrix;
	private StackX theStack;

	public GraphMST() {
		vertexList = new Vertex[MAX_VERTS];
		nVerts = 0;
		adjMatrix = new int[MAX_VERTS][MAX_VERTS];
		for (int i = 0; i < MAX_VERTS; i++) {
			for (int j = 0; j < MAX_VERTS; j++) {
				adjMatrix[i][j] = 0;
			}

		}
		theStack = new StackX();

	}

	// 添加顶点元素
	public void addVertex(char label) {
		Vertex newVertex = new Vertex(label);
		vertexList[nVerts++] = newVertex;
	}

	// 添加顶点和顶点之间的邻接边
	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}

	// 显示顶点元素信息
	public void displayVertex(int vertexIndex) {
		System.out.print(vertexList[vertexIndex].label);
	}

	// MST最小生成树
	public void mst() {
		vertexList[0].isVisited = true;
		theStack.push(0);
		while (!theStack.isEmpty()) {
			int currentVertexIndex = theStack.peek();
			//通过邻接矩阵，找到其邻接节点元素
			int adjVertexIndex = getAdjUnvistedVertex(currentVertexIndex);
			if(adjVertexIndex == -1){
				theStack.pop();
			}else{
				vertexList[adjVertexIndex].isVisited = true;
				theStack.push(adjVertexIndex);
				
				displayVertex(currentVertexIndex);
				displayVertex(adjVertexIndex);
				System.out.printf(" ");
			}
		}
	}
	
	//在邻接矩阵中查找，当前顶点的邻接顶点
	private int getAdjUnvistedVertex(int currentVertexIndex) {
		for(int j=0;j<nVerts;j++){
			if(adjMatrix[currentVertexIndex][j] == 1 && vertexList[j].isVisited == false){
				return j;
			}
		}
		return -1;
	}

}
