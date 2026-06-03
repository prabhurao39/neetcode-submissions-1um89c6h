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
        PriorityQueue<Interval> pq = new PriorityQueue<>((a,b) -> a.start - b.start);
        int n = intervals.size();
        pq.addAll(intervals);
        PriorityQueue<Interval> q = new PriorityQueue<>((a,b) -> a.end - b.end);
        while (!pq.isEmpty()) {
            Interval in = pq.poll();
            if (q.isEmpty()) {
                q.add(in);
            } else if (q.peek().end > in.start) {
                q.add(in); 
            } else {
                q.poll();
                q.add(in);
            }
        }
        return q.size();
    }
}
