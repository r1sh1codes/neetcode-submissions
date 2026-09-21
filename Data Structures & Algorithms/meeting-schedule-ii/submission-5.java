/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int[] diff = new int[1000001];
        for(Interval x:intervals)
        {
            int st = x.start;
            int end = x.end;
            diff[st] += 1;
            // if(end + 1< diff.length)
            diff[end] += -1;
        }
        //prefix
        for(int i = 1; i< diff.length;i++)
        {
            diff[i] = diff[i-1] + diff[i];
        }
        int max = Integer.MIN_VALUE;
        for(int x:diff)
        max = Math.max(x,max);
        return max;
    }
}
