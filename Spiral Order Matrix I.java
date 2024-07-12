public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> mat = new ArrayList<>();

        int row = A.size();
        int col = A.get(0).size();

        int top = 0, left = 0, down = row-1, right = col-1, dir = 0;

        while(top<=down && left<=right) {
            if(dir == 0) {
                for(int i=left; i<=right; i++) {
                    mat.add(A.get(top).get(i));
                }
                top++;
            }

            else if(dir == 1) {
                for(int i=top; i<=down; i++) {
                    mat.add(A.get(i).get(right)); 
                }
                right--;
            }

            else if(dir == 2) {
                for(int i=right; i>=left; i--) {
                    mat.add(A.get(down).get(i));
                }
                down--;
            }

            else if(dir == 3) {
                for(int i=down; i>=top; i--) {
                    mat.add(A.get(i).get(left));
                }
                left++;
            }

            dir = (dir+1) % 4;
        }

        return mat;
    }
}
