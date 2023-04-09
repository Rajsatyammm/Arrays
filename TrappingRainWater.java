public class TrappingRainWater {

    public static int rainWater(int[] height) {
        int n = height.length;

        // maximum left boundary
        int[] leftBound = new int[n];
        leftBound[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftBound[i] = Math.max(leftBound[i - 1], height[i]);
        }

        // maximum right boundary/
        int[] rightBound = new int[n];
        rightBound[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightBound[i] = Math.max(height[i], rightBound[i + 1]);
        }

        // calculating the trapped water
        // TrappedWater = (WaterLevel - HeightofBar) * Width
        int trapWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftBound[i], rightBound[i]);
            trapWater += waterLevel - height[i];
        }
        return trapWater;
    }

    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(rainWater(height));
    }
}
