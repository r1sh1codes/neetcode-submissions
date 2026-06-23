class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int cnt =0;
        int p =0,q =0;
        while(p<seats.length)
        {
            if(seats[p]!=students[q])
            {
                cnt+= Math.abs(seats[p] - students[q]);
            }
            p++;
            q++;
        }
        return cnt;
    }
}