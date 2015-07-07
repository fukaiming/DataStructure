package com.example.graph;

/**
 * 图的广度遍历BFS 数组：存放所有的顶点元素（数组+数组最大的容量+当前数组中元素的个数） 邻阶矩阵：存放顶点和顶点之间边关系
 * 队列：存放所有已访问过的顶点下标
 */
public class GraphBFS {
	private final int MAX_SIZE = 10;
	private Vertex[] vertexList;
	private int nVerts;
	private int[][] adjMatrix;
	private Queue queue;

	public GraphBFS() {
		vertexList = new Vertex[MAX_SIZE];
		nVerts = 0;
		adjMatrix = new int[MAX_SIZE][MAX_SIZE];
		for (int i = 0; i < MAX_SIZE; i++) {
			for (int j = 0; j < MAX_SIZE; j++) {
				adjMatrix[i][j] = 0;
			}
		}
		queue = new Queue();
	}

	// 向图中添加顶点
	public void addVertex(char label) {
		Vertex newVertex = new Vertex(label);
		vertexList[nVerts++] = newVertex;
	}

	// 邻接矩阵中定义顶点和顶点之间的边关系
	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}

	// 显示顶点元素信息
	public void displayVertex(int currentVertex) {
		System.out.print(vertexList[currentVertex].label + " ");
	}

	// BFS
	public void bfs() {
		vertexList[0].isVisited = true;
		displayVertex(0);
		queue.enQueue(0);
		int adjVertex;
		while (!queue.isEmpty()) {
			int currentVertex = queue.outQueue();

			while ((adjVertex = getUnVisitedAdjVertex(currentVertex)) != -1) {
				vertexList[adjVertex].isVisited = true;
				displayVertex(adjVertex);
				queue.enQueue(adjVertex);
			}
		}
	}

	private int getUnVisitedAdjVertex(int currentVertex) {
		for(int j=0;j<nVerts;j++){
			if(adjMatrix[currentVertex][j] == 1 && vertexList[j].isVisited == false){
				return j;
			}
		}
		return -1;
	}
}
