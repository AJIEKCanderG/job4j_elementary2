package ru.job4j.collections;

import java.util.ArrayList;
import java.util.List;

/** Геометри́ческая прогрессия — последовательность чисел  (называемых членами прогрессии), в которой каждое последующее число,
 начиная со второго, получается из предыдущего умножением его на определённое число q (называемое знаменателем прогрессии).
 Т.е. любой член геометрической прогрессии можно высчитать по формуле:
 b(n) = b(1) * q ^ (n - 1) - где значения в скобках означат номер члена геометрической прогрессии.
 Например, для b(1) = 1, q = 2 и n = 4 => b(n) будет равно 8.
 Необходимо реализовать метод, который генерирует геометрическую прогрессию и при этом принимает 3 значения:
 1. Первый элемент геометрической прогрессии;
 2. Знаменатель прогрессии;
 3. Количество элементов, которое должно содержаться в сгенерированной последовательности.
 При этом метод должен вернуть сумму элементов сгенерированной последовательности. */

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        List<Integer> data = new ArrayList<>(count);
        int sum = first;
        for (int j = 1; j < count; j++) {
            if (data.get(j) != data.get(first) * denominator) {
                return 0;
            }
        }
        for (Integer data1 : data) {
                    sum += data1;
                }
            return sum;
        }
    }