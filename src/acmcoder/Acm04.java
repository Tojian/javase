package acmcoder;
/**
 * 
 * @author taojian
 * @time  2017年3月28日下午5:06:48
 * @ClassName Acm04.java
 * @description
 * 最短最优升级路径（完美世界2017秋招真题）
游戏网站提供若干升级补丁，每个补丁大小不一，玩家要升级到最新版，如何选择下载哪些补丁下载量最小。
输入
第一行输入              第一个数为用户版本  第二个数为最新版本，空格分开
接着输入N行补丁数据        第一个数补丁开始版本 第二个数为补丁结束版本 第三个数为补丁大小，空格分开

样例输入
1000 1050
1000 1020 50
1000 1030 70
1020 1030 15
1020 1040 30
1030 1050 40
1040 1050 20

输出
对于每个测试实例，输出一个升级路径以及最后实际升级的大小
样例输出
1000->1020->1040->1050(100)
 */
public class Acm04 {

	static int MAX=10000;  
    public static void main(String[] args) {  
  
        //邻接矩阵  
        int[][] weight = {  
                {0,3,2000,7,MAX},  
                {3,0,4,2,MAX},  
                {MAX,4,0,5,4},  
                {7,2,5,0,6},  
                {MAX,MAX,4,6,0}  
        };  
  
        int start=0;  
        int[] shortPath = Dijsktra(weight,start);  
        for(int i = 0;i < shortPath.length;i++)  
        {  
            System.out.println("从"+start+"出发到"+i+"的最短距离为："+shortPath[i]);  
        }  
    }  
  
    //接受一个有向图的权重矩阵，和一个起点编号start（从0编号，顶点存在数组中）  
    //返回一个int[] 数组，表示从start到它的最短路径长度  
    public static int[] Dijsktra(int[][] weight,int start){  
  
        int n = weight.length;  
        //存放从start到其他各点的最短路径  
        int[] shortPath = new int[n];  
        //存放从start到其他各点的最短路径的字符串表示  
        String[] path=new String[n];  
        for(int i=0;i<n;i++)  
        {  
            path[i] = start + "-->" + i;  
        }  
        //标记当前该顶点的最短路径是否已经求出,1表示已求出  
        int[] visited = new int[n];  
  
        shortPath[start] = 0;  
        visited[start] = 1;  
        for(int count = 1;count <= n - 1;count++)  
        {  
            //选出一个距离初始顶点start最近的未标记顶点  
            int k = -1;  
            int dmin = Integer.MAX_VALUE;  
            for(int i = 0;i < n;i++)  
            {  
                if(visited[i] == 0 && weight[start][i] < dmin)  
                {  
                    dmin = weight[start][i];  
                    k = i;  
                }  
            }  
            //将新选出的顶点标记为已求出最短路径，且到start的最短路径就是dmin  
            shortPath[k] = dmin;  
            visited[k] = 1;  
            //以k为中间点，修正从start到未访问各点的距离  
            for(int i = 0;i < n;i++)  
            {  
                if(visited[i] == 0 && weight[start][k] + weight[k][i] < weight[start][i])  
                {  
                    weight[start][i] = weight[start][k] + weight[k][i];  
                    path[i]=path[k]+"-->"+i;  
                }  
            }  
        }  
        for(int i=0;i<n;i++)  
        {  
            System.out.println("从"+start+"出发到"+i+"的最短路径为："+path[i]);  
        }  
        System.out.println("=====================================");  
        return shortPath;  
    }  
}
