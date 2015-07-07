package com.example.graphBak;

/**
 * ����ͼ vertexList:���ڴ洢���еĶ��� int[][] adjMatrix:���ڴ���ڽӾ��� theStack:�����ѷ��ʹ�Ԫ�ص��±�
 *
 */
public class Graph {
	private final int MAX_VERTS = 20;
	private Vertex[] vertexList;
	private int[][] adjMatrix;
	private StackX theStack;
	private int nVerts;// ��ʾ��ǰ����vertexListԪ�ظ���

	public Graph() {
		vertexList = new Vertex[MAX_VERTS];
		adjMatrix = new int[MAX_VERTS][MAX_VERTS];
		theStack = new StackX();
		nVerts = 0;
	}

	// ��Ӷ���Ԫ��
	public void addVertex(char label) {
		Vertex newVertex = new Vertex(label);
		vertexList[nVerts++] = newVertex;
	}

	/*
	 * ���嶥��Ͷ���֮���ڽӱ� start:��ʼ���� end����ֹ����
	 */
	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}

	// ��ʾ������Ϣ
	public void displayVertex(int vertexIndex) {
		System.out.println(vertexList[vertexIndex].label);
	}

	// dfs��ȱ���
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
		
		//��ջΪ��ʱ���������������ȱ���,������Ƿ����λ����
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
