package com.example.graph;

/**
 * DFS ����Ͷ���֮����������----�ڽӾ��� ��ŷ��ʹ��Ķ����±�--------ջ ������ж���---------------����
 */
public class Graph {
	private final int MAX_VERTS = 20;
	private Vertex[] vertexList;// �������ж���
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

	// ���һ�����㣬���浽������
	public void addVertex(char label) {
		Vertex newVertex = new Vertex(label);
		vertexList[nVerts++] = newVertex;
	}

	// ��ӱ�
	public void addEdge(int row, int column) {
		adjMat[row][column] = 1;
		adjMat[column][row] = 1;
	}

	// ��ӡ������Ϣ
	public void displayVertex(int vertexIndex) {
		System.out.print(vertexList[vertexIndex].label + "  ");
	}

	// ��ȱ���
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

	// �õ����δ���ʵĽ��
	private int getAdjUnVisitedVertex(int vertexIndex) {
		for (int j = 0; j < nVerts; j++) {
			if(adjMat[vertexIndex][j] == 1 && vertexList[j].isVisited == false){
				return j;
			}
		}
		return -1;
	}

}
