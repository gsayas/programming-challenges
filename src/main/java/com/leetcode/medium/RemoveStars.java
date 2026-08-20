package com.leetcode.medium;

public class RemoveStars {
    public String removeStars(String s) {

        StringBuilder right = new StringBuilder(s);
        StringBuilder left;
        int i = right.length() - 1;
//        leet**cod*e
//        bocas*****
//        abb*cdfg*****x*

        while (i > 0) {
            if (right.charAt(i) == '*') {
                if (right.charAt(i - 1) != '*') { // remove star and char to left
                    left = new StringBuilder(right.substring(0, i - 1));
                    left.append(right.substring(i + 1, right.length()));
                    right = left;
                } else {
                    left = new StringBuilder(normaliseLeftSide(right.substring(0, i + 1)));
//                    left.append(right.substring(i, right.length()));
                    right = left;
                }
                i = right.length() - 1;
            } else {
                i--;
            }
        }

        return right.toString();
    }

    private String normaliseLeftSide(String left) {
//        ocas****
//        cas***
//        as**
//        s*
        if (left.length() <= 2) {
            return left.charAt(left.length() - 1) == '*' ? "" : left;

        } else if (left.charAt(left.length() - 2) != '*') {

            return left.charAt(left.length() - 1) == '*' ? left.substring(0, left.length() - 1) : left;

        } else {

            return normaliseLeftSide(left.substring(0, left.length() - 2));
        }
    }


    public static void main(String[] args) {
        RemoveStars rs = new RemoveStars();
        System.out.println(rs.removeStars("leet*cod*e"));
//        System.out.println(rs.removeStars("bocas*****"));

        /*
         * 1. iteramos de derecha a izquierda para evitar el problema de corrimiento de posiciones
         * 2. al encontrar un '*', miramos a su izquierda, si hay un caracter, lo eliminamos
         * 3. si hay otra estrella, hacemos recursion pasando la substring a la izquierda de la posicion actual
         * 4. la recursion va a eliminar las estrellas, de forma que se vuelve al caso base, y seguir con la iteracion
         * */


    }
}
