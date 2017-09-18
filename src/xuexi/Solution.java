package xuexi;

import java.util.Scanner;

public class Solution {  
    public  int numIslands(char[][] grid) {  
        int count = 0;  
        for(int i=0; i<grid.length; i++) {  
            for(int j=0; j<grid[0].length; j++) {  
                if(grid[i][j]=='1') {  
                	DFsearch(grid, i, j);  
                    ++count;  
                }  
            }  
        }  
        return count;  
    }  
      
    private  void DFsearch(char[][] grid, int x, int y) {  
        if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || grid[x][y]!='1') return;  
        grid[x][y] = '0';  
        DFsearch(grid, x-1, y);  
        DFsearch(grid, x+1, y);  
        DFsearch(grid, x, y-1);  
        DFsearch(grid, x, y+1);  
    }  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        char[][]grid=new char[m][n];
        for(int i=0;i<m;i++){
        	for(int j=0;j<n;j++){
        		grid[i][j]=(char) sc.nextInt();
        	}
        }
		
		Solution s=new Solution();
		int i=s.numIslands(grid);
		System.out.println(i);
	}
}  