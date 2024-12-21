
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int month = 0;
        int salary = 0;
        while (salary <= 2_459_000) {
            salary += 15000;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + salary + " рублей");
        }

        System.out.println("\nЗадание 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\nЗадание 3");
        int total = 12_000_000;
        for (i = 1; i <= 10; i++) {
            total += (total / 1000) * 17 - (total / 1000) * 8;
            System.out.println("Год " + i + ", численность населения составляет " + total);
        }

        System.out.println("\nЗадание 4");
        float deposit = 15000;
        month = 1;

        while (deposit < 12_000_000) {
            if (month != 1) {
                deposit += (deposit * 0.07f);
            }
            System.out.printf("Месяц %d, накоплений: %.2f%n", month, deposit);
            month++;
        }

        System.out.println("\nЗадание 5");
        deposit = 15000;
        month = 1;

        while (deposit <= 12_000_000) {
            if (month != 1) {
                deposit += (deposit * 0.07f);
            }
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, накоплений: %.2f%n", month, deposit);
            }
            month++;
        }

        System.out.println("\nЗадание 6");
        deposit = 15000;
        month = 1;
        while (month / 12f <= 9f) {
            if (month != 1) {
                deposit += (deposit * 0.07f);
            }
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, накоплений: %.2f%n", month, deposit);
            }
            month++;
        }

        System.out.println("\nЗадание 7");
        int friday = 6;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }

        System.out.println("\nЗадание 8");
        int start = 2024 - 200;
        int end = 2024 + 100;

        if (start % 79 != 0) {
            start += (79 - start % 79);
        }

        while (start <= end) {
            System.out.println(start);
            start += 79;
        }
    }
}