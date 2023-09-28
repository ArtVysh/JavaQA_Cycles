package ru.netology.services;

public class Main {

    public static void main(String[] args) {
        VacationService service = new VacationService();

       /* int income = 10_000;
        int expences = 3_000;*/
        int actual = service.calculate(10_000, 3_000, 20_000);
        System.out.println(actual);

    }
}
