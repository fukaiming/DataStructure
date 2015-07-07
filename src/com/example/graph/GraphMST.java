package com.example.graph;

public class GraphMST {
	private final int MAX_VERTS = 20;
	private Vertex[] vertexList;
	private int nVerts;// ��ǰ����Ԫ�صĸ��� ���������Ԫ��
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

	// ��Ӷ���Ԫ��
	public void addVertex(char label) {
		Vertex newVertex = new Vertex(label);
		vertexList[nVerts++] = newVertex;
	}

	// ��Ӷ���Ͷ���֮����ڽӱ�
	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}

	// ��ʾ����Ԫ����Ϣ
	public void displayVertex(int vertexIndex) {
		System.out.print(vertexList[vertexIndex].label);
	}

	// MST��С������
	public void mst() {
		vertexList[0].isVisited = true;
		theStack.push(0);
		while (!theStack.isEmpty()) {
			int currentVertexIndex = theStack.peek();
			//ͨ���ڽӾ����ҵ����ڽӽڵ�Ԫ��
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
	
	//���ڽӾ����в��ң���ǰ������ڽӶ���
	private int getAdjUnvistedVertex(int currentVertexIndex) {
		for(int j=0;j<nVerts;j++){
			if(adjMatrix[currentVertexIndex][j] == 1 && vertexList[j].isVisited == false){
				return j;
			}
		}
		return -1;
	}

}
