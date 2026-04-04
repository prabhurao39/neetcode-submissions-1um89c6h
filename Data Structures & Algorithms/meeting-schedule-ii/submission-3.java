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
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    
    public int minMeetingRooms(List<Interval> intervals) {
        if (intervals == null || intervals.isEmpty()) return 0;
        int count = 1;
        // Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        Collections.sort(intervals, (a,b) -> a.start - b.start);

        pq.add(intervals.get(0).end);
        System.out.println(pq);
        for (int i =1; i< intervals.size(); i++ ) {
            Interval second = intervals.get(i);
            System.out.println(pq);
            
            if (pq.peek() > second.start) {
                System.out.println(pq.peek()  + " --- " + second.start);
                count++; 
                pq.add(second.end);
            }  else  {
                pq.poll();
                pq.add(second.end);
            }
        }
        
        return pq.size();
    }
}

