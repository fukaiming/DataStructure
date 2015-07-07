package com.example.graph;

/**
 * ͼ�Ĺ�ȱ���BFS ���飺������еĶ���Ԫ�أ�����+������������+��ǰ������Ԫ�صĸ����� �ڽ׾��󣺴�Ŷ���Ͷ���֮��߹�ϵ
 * ���У���������ѷ��ʹ��Ķ����±�
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

	// ��ͼ����Ӷ���
	public void addVertex(char label) {
		Vertex newVertex = new Vertex(label);
		vertexList[nVerts++] = newVertex;
	}

	// �ڽӾ����ж��嶥��Ͷ���֮��ı߹�ϵ
	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}

	// ��ʾ����Ԫ����Ϣ
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
