import java.util.Collections;
public class Solution {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();

        //Transpose matrix
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
               int x = a.get(i).get(j);
               int y = a.get(j).get(i);

               a.get(i).set(j, y);
               a.get(j).set(i, x);
            }
        }

        //reverse the row
        for(int i = 0; i < n; i++) {
            Collections.reverse(a.get(i));
        }
    }
}
