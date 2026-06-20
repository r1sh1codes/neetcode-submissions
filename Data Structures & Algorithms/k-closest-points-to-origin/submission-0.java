class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> dist(b) - dist(a));
        for(int[] x:points)
        {
            maxHeap.add(x);
            if(maxHeap.size() > k)
            maxHeap.poll();
        }
        int[][] res = new int[k][2];
        for(int i = 0;i<k;i++)
        {
            int[] temp = maxHeap.poll();
            res[i] = temp;
         }
         return res;
 
    }
    public int dist(int[] x)
    {
        return (x[0] * x[0] + x[1] * x[1]);
    }
}
