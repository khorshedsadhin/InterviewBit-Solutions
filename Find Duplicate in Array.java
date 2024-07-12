public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int repeatedNumber(final List<Integer> A) {
       //hair and tortoise method
       
       int slow=0, fast=0;
       do {
        slow = A.get(slow);
        fast = A.get(A.get(fast));
       } while(slow!=fast);

       slow = 0;
       while (slow!=fast) {
        slow = A.get(slow);
        fast = A.get(fast);
       }

       return slow;
    }
}
