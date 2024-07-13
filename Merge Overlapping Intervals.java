import java.util.Collections;
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> output = new ArrayList<>();

        Collections.sort(intervals,(a,b) -> Integer.compare(a.start,b.start));
        output.add(intervals.get(0));

        for(int i=1; i<intervals.size(); i++) {
            int lastIndex = output.getLast().end;
            if(intervals.get(i).start <= lastIndex) {
                output.getLast().end = Math.max(lastIndex, intervals.get(i).end);
            }

            else {
                output.add(intervals.get(i));
            }
        }

        return output;
    }
}
