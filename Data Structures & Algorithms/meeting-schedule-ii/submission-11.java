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
        if (intervals == null || intervals.isEmpty()) {
            return 0;
        }
        
        // 1. Sort the list directly instead of using a preliminary PriorityQueue
        intervals.sort((a, b) -> a.start - b.start);
        
        // 2. Min-heap to track meeting end times
        PriorityQueue<Interval> q = new PriorityQueue<>((a, b) -> a.end - b.end);
        
        for (Interval in : intervals) {
            // If the room with the earliest end time is free, evict it
            if (!q.isEmpty() && q.peek().end <= in.start) {
                q.poll();
            }
            
            // Always add the current meeting (either occupying a new room or reusing the evicted one)
            q.add(in);
        }
        
        return q.size();
    
    }
}
