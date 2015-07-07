package com.example.recursion;

import java.util.EmptyStackException;
import java.util.Stack;

class Position{
    public int row;
    public int col;
    public Position(int row,int col){
        this.row=row;
        this.col=col;
    }
}
public class Maze2 {
    public Stack<Position> stack=new Stack<Position>(); //保存迷宫路径
    public int array[][] ={
                            {1,1,1,1,1,1,1,1},
                            {1,0,0,0,1,0,0,1},
                            {1,0,1,1,1,0,0,1},
                            {0,0,1,0,1,0,0,0},
                            {1,1,1,0,1,0,0,1},
                            {1,1,0,1,1,1,1,1},
                            {0,0,0,1,0,0,0,0},
                            {0,0,1,1,1,1,1,1},
                                             };
    //定义的方格数组需在迷宫内
    private boolean value(int hang,int lie){
        if(hang >= 0 && hang < array.length &&
                lie >=0 && lie< array.length && 
                        array[hang][lie] == 1){
            return true;
        }else{
            return false;
        }
    }
    
    private boolean discovery(int row, int col){
        boolean pass =false;
        if(value(row,col)){
            //将走过的位置标记为2
            array[row][col] = 2;
            Position pos=new Position(row,col);
            this.stack.push(pos);
            //判断是否到达终点.
            if(row == array.length -1 && col == array.length - 1){
                pass = true;
            }else{//往右走
                 pass = discovery(row,col + 1);
                  //往下走
                 if(pass==false) 
                 pass = discovery(row + 1, col);
                  //往左走
                 if(pass==false)
                 pass = discovery(row , col-1);
                  //往上走
                 if(pass==false)
                 pass = discovery(row - 1, col);
            }
            if(pass==true) {
                array[row][col] = 3;
            }else{
                this.stack.pop();
            }
        }
        return pass;
    }
    public static void main(String[] args) {
        Maze2 mi = new Maze2();
        int[][] c = mi.array;
        //输出走之前的迷宫
        for(int i = 0;i<c.length;i++){
            for(int j = 0; j<c.length;j++){
//                System.out.print(mi.array[i][j]+" ");
                if(mi.array[i][j] == 1)
                    System.out.print("□"+" ");
                if(mi.array[i][j] == 0)
                    System.out.print("■"+" ");
            }
            System.out.println();
        }
        System.out.println(mi.discovery(0,0));
        //输出走过之后的迷宫
        for(int i = 0 ;i<= c.length-1;i++){
            for(int j = 0; j<= c.length-1;j++){
                
//                System.out.print(c[i][j]+" ");
                if(c[i][j] == 1)
                    System.out.print("□"+" ");
                if(c[i][j] == 0)
                    System.out.print("■"+" ");
                if(c[i][j] == 3)
                    System.out.print("○"+" ");
                if(c[i][j] == 2)
                    System.out.print("●"+" ");
            }
            System.out.println();
        }
        System.out.println();
        //输出路径
        Stack<Position> stack=new Stack<Position>();
        Position pos=mi.stack.pop();
        while(pos!=null){
            stack.push(pos);
            try{
                pos=mi.stack.pop();
            }catch(EmptyStackException e){
                break;
            }
            
        }
        pos=stack.pop();
        int length=stack.size();
        while(pos!=null){
            if(1==length){
                System.out.print("("+pos.row+","+pos.col+")");
            }else{
                System.out.print("("+pos.row+","+pos.col+")→");
                length=stack.size();
            }
            try{
                pos=stack.pop();
            }catch(EmptyStackException e){
                break;
            }
        }
    }
}