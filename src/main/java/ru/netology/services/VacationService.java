package ru.netology.services;

public class VacationService {

    public int calculate(int income, int expence, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month <= 12; month++) { //для удобства сравнения с ожидаемым результатом начальное значение 'month' равно "1"
            if (money >= threshold) { // можем ли отдыхать?
                money = money - expence;
                money = money / 3;
                count++; // увеличиваем счётчик месяцев отдыха
            } else {
                money = money + income - expence;
            }
        }
        return count;
    }
}