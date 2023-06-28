package pro.sky.hw13_cource2;

import pro.sky.hw13_cource2.utility.SortComparison;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomArr = new int[100_000];

        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = random.nextInt(9) + 1;
        }

        int[] copy1 = Arrays.copyOf(randomArr, 100_000);
        int[] copy2 = Arrays.copyOf(randomArr, 100_000);

    }
}