package com.practice.leetcode;

public class LeetCode200 {
    class DSU{
        int[] rank;
        int[] parent;
        int count;
        
        public DSU(char[][] grid){
            int m=grid.length;
            int n=grid[0].length;

            rank= new int[m*n];
            parent= new int[m*n];

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(grid[i][j]=='1'){
                        int id=i*n+j;
                        parent[id]=id;
                        count++;
                    }
                }

            }
        }
        public int find(int x){
            if(parent[x]!=x){
                parent[x]=find(parent[x]); // path compression
            }
            return parent[x];
        }
        public void union(int x, int y){
            int findX=find(x);
            int findY=find(y);
            if(findX!=findY){
                if(rank[findX] < rank[findY]){
                    parent[findX]=findY;
                }else if(rank[findX] > rank[findY]){
                    parent[findY]=findX;
                }else{
                    parent[findY]=findX;
                    rank[findX]++;
                }
                count--; //Two islands merged into one, so decrease count
            }
        }
        public int getCount(){
            return count;
        }

    }

    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0 ){
            return 0;
        }
        int m=grid.length;
        int n=grid[0].length;
        DSU dsu=new DSU(grid);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    int id= i*n+j;
                    if(j+1<n && grid[i][j+1]=='1'){
                        dsu.union(id, i*n+(j+1));
                    }
                    if(i+1<m && grid[i+1][j]=='1'){
                        dsu.union(id, (i+1)*n+j);
                    }
                }
            }
        }
        return dsu.getCount();
    }
}
