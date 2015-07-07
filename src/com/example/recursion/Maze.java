package com.example.recursion;

public class Maze {
	private final int TRIED = 3;
	private final int PATH = 7;

	private int[][] grid = { { 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 },
			{ 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1 },
			{ 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0 },
			{ 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1 },
			{ 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1 },
			{ 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };

	// traverse������ʾ�Ƿ���Դ�Խ
	public boolean traverse(int row, int column) {
		boolean done = false;
		if (valid(row, column)) {
			grid[row][column] = TRIED;

			// ѭ���˳�������
			if (row == grid.length - 1 && column == grid[0].length - 1) {
				done = true;
			} else {
				// ע�����ĸ������ǻ���ģ�����ѡһ
				// ������
				done = traverse(row + 1, column);
				// ������
				if (!done) {
					done = traverse(row - 1, column);
				}
				// ������
				if (!done) {
					done = traverse(row, column + 1);
				}
				// ������
				if (!done) {
					done = traverse(row, column - 1);
				}
			}
		}
		return done;
	}

	// ��֤���ߵ���һ���Ƿ���Ч
	private boolean valid(int row, int column) {
		boolean result = false;
		// �ж��Ƿ����Թ���
		if (row >= 0 && row < grid.length && column>=0 && column<grid[row].length){
			if(grid[row][column]==1){
				result = true;
			}
		}
			return result;
	}
}
