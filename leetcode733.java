public class leetcode733 {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] vis = new boolean[image.length][image[0].length];
        int orgColor = image[sr][sc];
        if (orgColor == color) return image;

        helper(image, sr, sc, color, vis, orgColor);
        return image;
    }

    public void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int orgColor){
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length
                || vis[sr][sc] || image[sr][sc] != orgColor) {
            return;
        }

        vis[sr][sc] = true;
        image[sr][sc] = color;
        helper(image, sr, sc - 1, color, vis, orgColor); // left
        helper(image, sr, sc + 1, color, vis, orgColor); // right
        helper(image, sr - 1, sc, color, vis, orgColor); // up
        helper(image, sr + 1, sc, color, vis, orgColor); // down
    }

    public static void main(String[] args) {
        leetcode733 obj = new leetcode733();

        int[][] image = {
            {1,1,1},
            {1,1,0},
            {1,0,1}
        };

        int sr = 1, sc = 1, color = 2;

        int[][] result = obj.floodFill(image, sr, sc, color);

        // Print result
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
