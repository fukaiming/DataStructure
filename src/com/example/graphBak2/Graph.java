package com.example.graphBak2;

/*
 * DFS:�����������
 * 
 */
public class Graph {
	private final int MAX_SIZE = 10;
	private Vertex[] vertexList;
	private int nVerts;// ��ʾ��ǰ������Ԫ�صĸ���
	private int[][] adjMatrix;
	private Stack stack;// �����ѷ��ʶ�����±�

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

	// ��Ӷ���
	public void addVertex(char label) {
		Vertex vertex = new Vertex(label);
		vertexList[nVerts++] = vertex;
	}

	// ��Ӷ���Ͷ���֮��ı�
	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}

	// ��ʾ����Ԫ����Ϣ
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

	// MST:��С������
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
