package org.example.medium;

public class ProductArray {

    public int[] productExceptSelf(int [] nums){


        return new int[]{1,2,3,4};
    }

    public static void main(String[] args) {

        int[] in = new int[]{1,2,3,4};
        int[] out = (new ProductArray()).productExceptSelf(in);

        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }
    }
}
