package ru.job4j.array;

/**
 * Дан массив призов и положительное число, которое сгенерировано случайно. Ваша задача получить приз
 * Например,
 * {"автомобиль", "квартира", "билет"} и число = 1 => "автомобиль"
 * {"автомобиль", "квартира", "билет"} и число = 2 => "квартира"
 * {"автомобиль", "квартира", "билет"} и число = 4 => "автомобиль"
 * {"автомобиль", "квартира", "билет"} и число = 99 => "билет"
 */

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            if (num == i + 1) {
                result = prizes[num - i - 1];
                break;
            }
        }
        return result;
    }
}
