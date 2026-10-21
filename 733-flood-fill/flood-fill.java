
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];

        
        if (originalColor == color) {
            return image;
        }

        dfs(image, sr, sc, originalColor, color);

        return image;
    }

    private void dfs(int[][] image, int r, int c,
                     int originalColor, int color) {

        // Check boundaries..................................................
        if (r < 0 || r >= image.length ||
            c < 0 || c >= image[0].length) {
            return;
        }

       
        if (image[r][c] != originalColor) {
            return;
        }

        // Fill this pixel
        image[r][c] = color;

        // Visit four neighboring pixels
        dfs(image, r - 1, c, originalColor, color); // Up
        dfs(image, r + 1, c, originalColor, color); // Down
        dfs(image, r, c - 1, originalColor, color); // Left
        dfs(image, r, c + 1, originalColor, color); // Right
    }
}
