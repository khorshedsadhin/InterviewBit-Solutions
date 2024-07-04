public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> getRow(int A) {
        ArrayList<Integer> a = new ArrayList<>();

        int n = A + 1;
        int ans = 1;
        a.add(ans);

        for(int i = 1; i < n; i++) {
            ans = ans * (n-i); // (row - column)
            ans = ans / i;
            a.add(ans);
        }

        return a;
    }
}
