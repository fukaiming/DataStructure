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

	// traverse方法表示是否可以穿越
	public boolean traverse(int row, int column) {
		boolean done = false;
		if (valid(row, column)) {
			grid[row][column] = TRIED;

			// 循环退出的条件
			if (row == grid.length - 1 && column == grid[0].length - 1) {
				done = true;
			} else {
				// 注：这四个动作是互斥的，即四选一
				// 向下移
				done = traverse(row + 1, column);
				// 向上移
				if (!done) {
					done = traverse(row - 1, column);
				}
				// 向右移
				if (!done) {
					done = traverse(row, column + 1);
				}
				// 向左移
				if (!done) {
					done = traverse(row, column - 1);
				}
			}
		}
		return done;
	}

	// 验证行走的这一步是否有效
	private boolean valid(int row, int column) {
		boolean result = false;
		// 判断是否在迷宫里
		if (row >= 0 && row < grid.length && column>=0 && column<grid[row].length){
			if(grid[row][column]==1){
				result = true;
			}
		}
			return result;
	}
}
