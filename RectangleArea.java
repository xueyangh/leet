public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int lowerX = A;
        int lowerY = B;
        int higherX = C;
        int higherY = D;
        
        if (A < E) {
            lowerX = E;
        }
        if (B < F) {
            lowerY = F;
        }
        if (C > G) {
            higherX = G;
        }
        if (D > H) {
            higherY = H;
        }
        int together = 0;
        if (higherX > lowerX && higherY > lowerY) {
            together = (higherX - lowerX) * (higherY - lowerY);
        }
        int area1 = (C-A)*(D-B);
        int area2 = (G-E)*(H-F);
        return area1 + area2 - together;
    }
}
