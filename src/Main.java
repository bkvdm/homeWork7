public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int salary = 15_000;
        int target = 2_935_000;
        int cashSaving = 0;
//        boolean purposeSaving = (cashSaving >= target && (target - cashSaving) < salary);
        while ((target - cashSaving) > 0) {
        cashSaving = cashSaving + salary;
            System.out.println("Месяц " + cashSaving / salary + ", сумма накоплений равна: " + cashSaving);
            if ((target - cashSaving) < 0) {
                System.out.println("потребуется, не менее " + cashSaving / salary / 12 + " лет ");
            }
        }
    }

   public static void task2 () {
       System.out.println("Задача 2");
       int step = 0;
       while (step < 10) {
           step = step + 1;
           System.out.print(step + " ");
       }
       System.out.println();
       for (int i = 10; i > 0; i--) {
           System.out.print(i + " ");
       }
   }

    public static void task3 () {
        System.out.println();
        System.out.println("Задача 3");
        int basePopulation = 12_000_000;
        int child = 12;
        int mortality = 8;
        int calculationBase = 1_000;
        int planningHorizon = 0;
        int populationGrowth = 0;
        while (planningHorizon < 10) {
            planningHorizon = planningHorizon + 1;
            populationGrowth = (basePopulation / calculationBase * child) - (basePopulation / calculationBase * mortality);
            basePopulation = basePopulation + populationGrowth;
            System.out.println("Год " + planningHorizon + ", численность населения " + basePopulation + " Человек");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int salary = 15_000;
        int target = 12_000_000;
        int loanInterest = 7;
        int cashWithoutInterest = 0;
        int cashSavingTotal = 0;
 //       int month = 0;
        for (int month = 0; cashSavingTotal <= target; month++) {
            if (month == 1) {
                // В первый месяц в банк деньги не внесены ещё, поэтому процент по депозиту начислять не с чего
                cashWithoutInterest = cashWithoutInterest + salary;
                cashSavingTotal = cashSavingTotal + cashWithoutInterest;
                System.out.println("Месяц " + month + ", сумма накоплений: " + cashSavingTotal);
            } else if (month > 1) {
                    cashWithoutInterest = cashWithoutInterest + salary;
                    cashSavingTotal = cashSavingTotal + salary + cashWithoutInterest * loanInterest / 100 / 12;
                    System.out.println("Месяц " + month + ", сумма накоплений: " + cashSavingTotal);
            }
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int salary = 15_000;
        int target = 12_000_000;
        int loanInterest = 7;
        int cashWithoutInterest = 0;
        int cashSavingTotal = 0;
        for (int month = 0; cashSavingTotal <= target; month++) {
            if (month == 1) {
                cashWithoutInterest = cashWithoutInterest + salary;
                cashSavingTotal = cashSavingTotal + cashWithoutInterest;
//                System.out.println("Месяц " + month + ", сумма накоплений: " + cashSavingTotal);
            } else if (month > 1) {
                cashWithoutInterest = cashWithoutInterest + salary;
                cashSavingTotal = cashSavingTotal + salary + cashWithoutInterest * loanInterest / 100 / 12;
 //               if (month % 6 == 0) {
 //               System.out.println("Месяц " + month + ", сумма накоплений: " + cashSavingTotal);
 //           }
            } if (month % 6 == 0 && month != 0) {
                System.out.println("Месяц " + month + ", сумма накоплений: " + cashSavingTotal);
            }
        }
    }

    public static void task6 () {
        System.out.println("Задача 6.1");
        int salary = 15000;
        int depositPeriod = 9*12;
        int loanInterest = 7;
        int investmentMonth = 0;
        int cashSavingTotal = 0;
        int cashWithoutInterest = 0;
        System.out.println("Расчёт вложений без капитализации процентов по вкладу (ранее начисленные проценты не участвуют в расчёте процентов):");
        while (investmentMonth <= depositPeriod) {
            investmentMonth = investmentMonth + 1;
            if (investmentMonth == 1) {
                cashWithoutInterest = cashWithoutInterest + salary;
                cashSavingTotal = cashSavingTotal + cashWithoutInterest;
            } else {
                cashWithoutInterest = cashWithoutInterest + salary;
                cashSavingTotal = cashSavingTotal + salary + cashWithoutInterest * loanInterest / 100 / 12;
            }
            if (investmentMonth % 6 == 0) {
                System.out.println("Статус накоплений за " + investmentMonth + " мес. составит: " + cashSavingTotal + " рублей");
            }
        }
    }

    public static void task7 () {
        System.out.println("Задача 6.2");
        int salary = 15000;
        int depositPeriod = 9*12;
        int loanInterest = 7;
        int investmentMonth = 0;
        int cashSavingTotal = 0;
        System.out.println("Расчёт вложений с капитализации процентов по вкладу (ранее начисленные проценты участвуют в расчёте процентов):");
        while (investmentMonth <= depositPeriod) {
            investmentMonth = investmentMonth + 1;
            if (investmentMonth == 1) {
                cashSavingTotal = cashSavingTotal + salary;
            } else {
                cashSavingTotal = cashSavingTotal + salary + (cashSavingTotal + salary) * loanInterest / 100 / 12;
            }

        if (investmentMonth % 6 == 0) {
            System.out.println("Статус накоплений за " + investmentMonth + " мес. составит: " + cashSavingTotal + " рублей");
            }
        }
    }

    public static void task8 () {
        System.out.println("Задача 7");
        int firstFridayNumber = 1;
        int daysMonth = 31;
        for (; firstFridayNumber <= daysMonth; firstFridayNumber = firstFridayNumber + 7) {
            System.out.println("Сегодня пятница " + firstFridayNumber + " число. Необходимо подготовить отчёт");
     }
    }

    public static void task9 () {
        System.out.println("Задача 8");
        short thisYear = 2023;
        short periodBefore = 200;
        short periodAfter = 100;
        int cometDate = 0;
        for (; cometDate <= thisYear + periodAfter; cometDate = cometDate + 79) {
            boolean dataOutputPeriod = cometDate >= (thisYear - periodBefore) || cometDate >= (thisYear + periodAfter);
            if (dataOutputPeriod) {
                System.out.println(cometDate);
            }
        }
    }
}


