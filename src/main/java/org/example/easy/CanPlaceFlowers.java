package org.example.easy;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowers = n;
        int i = 0;

        while (i < flowerbed.length) {

            if (flowerbed[i] == 0) {

                if (i > 0 && flowerbed[i - 1] == 0 && (i + 1 == flowerbed.length || flowerbed[i + 1] == 0)) {
                    flowerbed[i] = 1;
                    flowers--;
                }

                if (i + 1 == flowerbed.length || flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    flowers--;
                }

            }

            i++;
        }


        return flowers <= 0;
    }

    public static void main(String[] args) {
        CanPlaceFlowers flowers = new CanPlaceFlowers();
        System.out.println(flowers.canPlaceFlowers(new int[]{0, 0, 1, 0, 0}, 1));
    }
}
