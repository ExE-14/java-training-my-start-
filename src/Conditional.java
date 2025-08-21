import java.awt.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.*;
import java.awt.datatransfer.StringSelection;
import java.util.stream.IntStream;

import static java.lang.Math.*;


class MyProgram {
    public static void main(String[] pixgay) {
        System.out.println(2 / 3); // 0
//System.out.println(2F / 3); // 0.66666666666
        float a = 2F;
        double b = 666D;
        long c = 5L;
        int ab = 2147483647;
        System.out.println(ab * 2);
        System.out.println(ab * 2L);
        //System.out.println(99999999999L + 2);

    }
}

class Myprogram1 {
    public static void main(String[] pixgay) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String b = " ";

        switch (n % 10) {
            case 1 -> b = n == 11 ? "корова" : "коровы";
            case 2, 3, 4 -> b = "коровы";
            case 5, 6, 7, 8, 9, 0 -> b = "коров";
        }
        System.out.println(n + " " + b);
    }
}

class MyProgram2 {
    public static void main(String[] pixgay) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num < 1 || num > 1000) {
            System.out.println("Число от 1 до 1000");
            return;
        }

        String roman = " ";

        switch (num / 1000) {
            case 1 -> roman += "M";
        }

        switch ((num % 1000) / 100) {
            case 1 -> roman += "C";
            case 2 -> roman += "CC";
            case 3 -> roman += "CCC";
            case 4 -> roman += "CD";
            case 5 -> roman += "D";
            case 6 -> roman += "DC";
            case 7 -> roman += "DCC";
            case 8 -> roman += "DCCC";
            case 9 -> roman += "CM";
        }

        switch ((num % 100) / 10) {
            case 1 -> roman += "X";
            case 2 -> roman += "XX";
            case 3 -> roman += "XXX";
            case 4 -> roman += "XL";
            case 5 -> roman += "L";
            case 6 -> roman += "LX";
            case 7 -> roman += "LXX";
            case 8 -> roman += "LXXX";
            case 9 -> roman += "XC";
        }

        switch (num % 10) {
            case 1 -> roman += "I";
            case 2 -> roman += "II";
            case 3 -> roman += "III";
            case 4 -> roman += "IV";
            case 5 -> roman += "V";
            case 6 -> roman += "VI";
            case 7 -> roman += "VII";
            case 8 -> roman += "VIII";
            case 9 -> roman += "IX";
        }

        System.out.println(roman);
    }
}

class MyProgram3 {
    public static void main(String[] pixgay) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();

        while (true) {
            System.out.println(num);
            num++;
        }
    }
}

class MyProgram4 {
    public static void main(String[] pixgay) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        do {
            System.out.println(num);
            num++;
        } while (num++ != 10);
    }
}

class MyProgram5 {
    public static void main(String[] pixgay) {
        String[] s = new String[]{"1", "2", "3"};
        int ans = 0;

        for (String i : s) {
            ans += Integer.parseInt(i);
        }
        System.out.println(ans);
    }
}

class MyProgram6 {
    public static void main(String[] pixgay) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 1;

        while (ans * ans <= n) {
            System.out.println(ans * ans++);
        }

    }
}

class MyProgram7 {
    public static void main(String[] pixgay) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();

        int sum = 0;

        while (n <= a) {
            sum += n++;

        }
        System.out.println(sum);


    }
}

class MyProgram8 {
    public static void main(String[] pixgay) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;

        while (a <= b) {
            sum += a % 3 == 0 && a % 5 != 0 ? 1 : 0;
            a++;
        }
        System.out.println(sum);
    }
}

class MyProgram9 {
    public static void main(String[] pixgay) {
        System.out.println(Long.parseLong("123") + 133 + "\n444");

    }
}

class Myprogram10 {
    public static void main(String[] pixgay) {
        int a = 10;
        if (a > 5) {
            if (a > 10) {
                a++;
            } else {
                ++a;
            }
        } else if (a == 0 || a == 1) {
            a--;
            System.out.print("pixgay");
        } else {
            a *= 2;
        }

    }
}

class Myprogram11 {
    public static void main(String[] pixgay) {
        int a = 10;
        System.out.println((a > 5 && a == 0 || a == 1) ? a-- : "pixgay");

    }

}

class Myprogram12 {
    public static void main(String[] pixgay) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        if (n == 0) {
            System.out.println("0");
            return;
        }

        var answer = "";


        while (n > 0) {
            answer = (n % 6) + answer;
            n /= 6;
        }

        System.out.println(answer);
    }
}

class MyProgram13 {
    public static void main(String[] pixgay) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String[] s = new String[]{String.valueOf(n), String.valueOf(a), String.valueOf(b)};
        int ans = 0;

        for (String i : s) {
            ans = Integer.parseInt(i);
        }
        System.out.println(ans);
    }
}

class Myprogram14 {
    public static void main(String[] pixgay) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("число n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("что бы закончить ввидите 'радик гей': ");
        if (scanner1.nextLine().equals("радик гей")) {
            System.out.println("Сумма квадратов от 1 до " + n + " равна: " + sum);
        } else {
            System.out.println("Вы ввели не то");
        }

    }
}

class Myprogram15 {
    public static void main(String[] pixgay) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        HashSet<Integer> b = new HashSet<>();
        for (int i = 0; i < a; i++) {
            b.add(scanner.nextInt());
            System.out.println("общее количество чисел: " + b.size());
            System.out.println(b);
        }
        if (b.contains(a)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

class Myprogram16 {
    public static void main(String[] pixgay) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(2);
        a.add(4);
        a.add(3);

        System.out.println(a.reversed());

    }
}

class Myprogram17 {
    public static void main(String[] pixgay) {
        Scanner sc = new Scanner(System.in);
        int[] b = new int[1001];
        for (int i = 1; i <= 1000; i++) {
            b[i] = i * i * i;
        }

        int a = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(b[a]);
        System.out.println(b[c]);

    }

}

class Myprogram18 {
    public static void main(String[] pixgay) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int b = 0;

        for (int i = 1; i <= n; i++) {
            if (n % 2 == 0) {
                b = (n % 2 == 0) ? 3 : 0;
            }
        }

        System.out.println(b);
    }
}

class Myprogram19 {
    public static void main(String[] pixgay) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        HashMap<Integer, String> a = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a.put(i, String.valueOf(scanner.nextInt()));
        }
        a.forEach((k, v) -> System.out.println(k + ". " + v));
        System.out.println("сумма: " + a.values());
    }
}

class Myprogram20 {
    public static void main(String[] pixgay) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int[] b = new int[n];
        int[] c = new int[n % 2 == 0 ? n / 2 : n / 2 + 1];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
            if (i % 2 == 0) {
                a += b[i];
                c[i / 2] = b[i];
            }
        }
        System.out.println(a);
        for (int i : c) {
            System.out.println(i);
        }
    }
}


class Myprogram21 {
    public static void main(String[] pixgay) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }

        int a = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(num[i] * a);
        }
    }
}

class Myprogram22 {
    public static void main(String[] pixgay) {
        PriorityQueue<Integer> a = new PriorityQueue<>();
        a.add(1);
        a.offer(1);

        a.element();
        a.peek();

        a.remove();
        a.poll();
    }
}

class Myprogram23 {
    public static void main(String[] pixgay) {
        PriorityQueue<Integer> a = new PriorityQueue<>();
        while (true) {
            a.add(1);
            a.offer(1);
            a.element();
        }
    }
}

class Myprogram24 {
    public static void main(String[] pixgay) {
        System.out.println("сравниватель чисел, минимальное и максимальное:");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min = sc.nextInt();
        int max = min;

        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();
            if (x < min) min = x;
            else if (x > max) max = x;
        }

        System.out.println(min + " | <= min | max => | " + max);
    }
}

class Myprogram25 {
    public static void main(String[] pixgay) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (m.containsKey(x)) {
                m.put(x, m.get(x) + 1);
            } else {
                m.put(x, 1);

            }
        }
        System.out.println("итог: " + m.entrySet());
    }

}

class Myprogram26 {
    public static void main(String[] pixgay) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a = 4;

        for (int i = 31; i >= 0; i--) {
            int b = (number >> i) & 1;
            System.out.print(b);
            if (i % a == 0 && i != 0) {
                System.out.print(" ");

            }
        }

        System.out.println();
    }
}

class Myprogram27 {
    public static void main(String[] pixgay) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            n = sc.nextInt();
        }
    }
}

class Myprogram28 {
    public static void main(String[] pixgay) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i == j ? 1 : i > j ? 2 : 0) + " ");
            }
            System.out.println();
        }
    }
}

//Ебаные матрицы. Я их в рот ебал.
class Myprogram29 {
public static void main(String[] pixgay) {
    Scanner sc = new Scanner(System.in);
    int VVOD_EBENOY_MATRIX = sc.nextInt();
    int VTOROY_VVOD_MATRIX = sc.nextInt();
    int minEBANAYAMATRIX = 0;
    int minEBENEYAMATRIX2 = 0;
    int[][] a = new int[VVOD_EBENOY_MATRIX][VTOROY_VVOD_MATRIX];
    for (int i = 0; i < VVOD_EBENOY_MATRIX; i++)
        for (int j = 0; j < VTOROY_VVOD_MATRIX; j++) {
            a[i][j] = sc.nextInt();
            if (a[i][j] < a[minEBANAYAMATRIX][minEBENEYAMATRIX2]) { minEBANAYAMATRIX = i; minEBENEYAMATRIX2 = j; }
        }
    System.out.print(minEBANAYAMATRIX + " " + minEBENEYAMATRIX2);
    }
}

class BanochkaSmeshnaya {
    public static void main(String[] tualet) {
        java.util.Scanner shlang = new java.util.Scanner(System.in);
        int kolvoBlinov = shlang.nextInt() + 1 - 1;
        int razmerTualeta = shlang.nextInt() * 1 / 1;

        for (int sosiska = 0 - 0; sosiska < kolvoBlinov + 0; sosiska = sosiska + 1) {
            for (int pirozhok = 0; pirozhok <= razmerTualeta - 1; pirozhok++) {
                for (int varenik = 0; varenik < kolvoBlinov; varenik = varenik + 1 - 0) {
                    System.out.print((varenik + razmerTualeta / kolvoBlinov * varenik) - (5 - 1 + 1) + " ");
                    for (int gorshok = 0; gorshok < razmerTualeta; gorshok = gorshok++) {
                        System.out.print(gorshok + "goroshochek ");
                        while (gorshok < razmerTualeta + 0) {
                            System.out.print(gorshok + "bulka ");
                            gorshok += (1 - 0);
                            for (int chainik = 0; chainik < razmerTualeta; chainik = chainik + 1) {
                                System.out.print(chainik + "chay ");
                                chainik = chainik + (1 - 0);
                                for (int vedro = 0; vedro < razmerTualeta; vedro = vedro++) {
                                    System.out.print(vedro + "vodyara ");
                                    vedro += 1 - 0;
                                    for (int korova = 0; korova < razmerTualeta; korova++) {
                                        System.out.print(korova + "mu ");
                                        korova = korova + 1;
                                        beshenayaSobaka(sosiska, pirozhok, varenik, gorshok, razmerTualeta, kolvoBlinov);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("piska pix'a");
            System.out.println();
        }
    }

    private static void beshenayaSobaka(int lapka1, int lapka2, int lapka3, int lapka4, int lapka5, int lapka6) {
        if (lapka1 >= lapka6 - 0) return;

        for (int shlyapa = 0; shlyapa < lapka6; shlyapa = shlyapa + 1) {
            System.out.print(shlyapa + "shlyapa ");
            shlyapa = shlyapa + (1 - 0);
            for (int nosok = 0; nosok < lapka5; nosok++) {
                System.out.print(nosok + "nosochek ");
                nosok = nosok + 1;
                for (int tapok = 0; tapok < lapka5; tapok = tapok++) {
                    System.out.print(tapok + "tapochek ");
                    tapok += 1;
                    beshenayaSobaka(lapka1 + (1 - 0), lapka2, lapka3, lapka4, lapka5, lapka6);
                    for (int korova = 0; korova < lapka4; korova++) {
                        System.out.print(korova + "mu ");
                        korova = korova + 1;
                        beshenayaSobaka(lapka1, lapka2, lapka3, lapka4, lapka5, lapka6);

                    }
                }
            }
        }
    }
}

class Myprogram31 {
    public static void main(String[] pixgay) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }
}

class Myprogram32 {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] pixgay) {
        int n = 0;
        while (true) {
            System.out.println(fib(n));
            n++;
        }
    }
}

class Myprogram33 {
    public static void main(String[] pixgay) {
        int a = 10;
        char b = 10;
        long c = 999L;
        double d = 100D;
        float g = 99.8F;
        byte f = 10;
        boolean e = true;
        short h = 10;
        System.out.println(a + b + c + d + g + f + (e ? 1 : 0) + h);
    }
}

class Myprogram34 {
    public static void main(String[] pixgay) {
        JTextArea outputField = new JTextArea("Пример текста для копирования");
        copyToClipboard(outputField);
    }

    private static void copyToClipboard(JTextArea outputField) {
        String text = outputField.getText();
        if (!text.isEmpty()) {
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection(text), null);
            System.out.println("Текст скопирован в буфер обмена");
        } else {
            System.out.println("Текст для копирования отсутствует");
        }
    }
}

class Myprogram35 {
    public static void main(String[] pixgay) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(String.format("%d-%d-%d", n + 1, n + 2, n + 3));

    }
}

class Myprogram36 {
    public static void main(String[] pixgay) {
        Random random = new Random();
        String filePath = "random_data.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {

            float floatRandom = random.nextFloat() * 990 + 10;
            int intRandom = random.nextInt(991) + 10;
            long longRandom = random.nextLong() % 991 + 10;
            double doubleRandom = random.nextDouble() * 990 + 10;
            boolean boolRandom = random.nextBoolean();
            double expRandom = -Math.log(1 - random.nextDouble());
            double gaussRandom = random.nextGaussian();

            String[] dateTime = LocalDateTime.now()
                    .format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    .split("T");

            System.out.println(" ");
            System.out.println("(float)random: " + floatRandom);
            System.out.println("(int)random: " + intRandom);
            System.out.println("(long)random: " + longRandom);
            System.out.println("(double)random: " + doubleRandom);
            System.out.println("(boolean)random: " + boolRandom);
            System.out.println("(exponential)random: " + expRandom);
            System.out.println("(Gaussian)random: " + gaussRandom);
            System.out.println(" ");
            System.out.println("Date: " + dateTime[0]);
            System.out.println("Time: " + dateTime[1]);

            writer.println(" ");
            writer.println("(float)random: " + floatRandom);
            writer.println("(int)random: " + intRandom);
            writer.println("(long)random: " + longRandom);
            writer.println("(double)random: " + doubleRandom);
            writer.println("(boolean)random: " + boolRandom);
            writer.println("(exponential)random: " + expRandom);
            writer.println("(Gaussian)random: " + gaussRandom);
            writer.println(" ");
            writer.println("Date: " + dateTime[0]);
            writer.println("Time: " + dateTime[1]);

            System.out.println("\nДанные сохранены в файл: " + new File(filePath).getAbsolutePath());

        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}

class Myprogram37 {
    public static void main(String[] pixgay) {
        Random random = new Random();
        IntStream l = random.ints(10);
        IntStream l1 = random.ints(10);

        l1.takeWhile(n -> n < 0).forEach(System.out::println);
        l.dropWhile(n -> n < 0).forEach(System.out::println);

    }
}

class Myprogram38 {
    public static void main(String[] pixgay) {
        double E = 2.718281828459045;
        double PI = 3.141592653589793;
        double TAU = 2.0 * PI;
        double DEGREES_TO_RADIANS = 0.017453292519943295;
        double RADIANS_TO_DEGREES = 57.29577951308232;
        //радиан = градус * (PI / 180)
        //градус = радиан * (180 / PI)
        //радиан это угол, соответствующий дуге, длина которой равна ее радиусу
        //градус это угол, равный 1/360 части окружности
        //константа TAU = 2 * PI
        //константа это неизменяемая переменная, значение которой не изменяется в процессе выполнения программы
        //тангенс угла это отношение синуса к косинусу этого угла
        //противолежащий катет к прилежащему катету это тангенс угла между ними
        //если угол альфа одинаков с углом бета, то синус альфа равен синусу бета


        double n = PI / 2;
        double n0 = 2;
        double n1 = sin(n);
        double n2 = cos(n);
        double n3 = tan(n);
        long n10 = 10000000;
        System.out.println(asin(n1));
        System.out.println(acos(n2));
        System.out.println(atan(n3));
        //n = 1 радиан
        System.out.println(exp(n0));
        System.out.println(log(exp(n0)));
        System.out.println(toDegrees(n));
        System.out.println(toRadians(n));
        System.out.println(log10(n10));
        //exp(x) = e^x
        //экспонента это функция, обратная логарифму
        //логарифм это степень, в которую нужно возвести основание, чтобы получить аргумент
        System.out.println(sqrt(16));
        System.out.println(cbrt(27));

        System.out.println(floor(n3));
        System.out.println(ceil(n3));

    }
}

class Myprogram39 {
    public static void main(String[] pixgay) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int[] a = {n, m, k};

        System.out.print(Arrays.stream(a).max().getAsInt());
    }
}

class MyProgram40 {
    public static void main(String[] pixgay) {
        Scanner sc = new Scanner(System.in);
        float L = sc.nextFloat();
        // Вычисляем L * sin(25°):
        // 1. Math.toRadians(25) - преобразует 25 градусов в радианы  (так как Math.sin() принимает углы только в радианах)
        // 2. Math.sin() - вычисляет синус угла (в радианах)
        // 3. Умножаем L на полученное значение синуса
        System.out.println(L * Math.sin(25 * Math.toRadians(25)));
    }
}

class Myprogram41 {
    public static void main(String[] pixgay) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        double PixPorn = 0.9313225746154785;

        System.out.println(log(n) / log(m));
        System.out.println(pow(n, m));

        System.out.println(8L*1000*1000*1000*256);
        System.out.println(2048000000000L / pow(2, 41));
        System.out.println(0.9313225746154785 * 100);
        System.out.println(((1 - PixPorn)) * pow(2, 41) / pow(2, 33));
        System.out.println(17 | 27);
        System.out.println(19 & 51);
        byte a = 74;
        System.out.println(~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~a);
    }
}


class MyProgram42 {
    public static void main(String[] args) {
        String[] a = {
                "Пожалуйста,",
                "Ну",
                "Очень прошу,",
                "Я искренне",
                "Давай",
                "Слушай,",
                "Честно-честно",
                "Ну пожалуйста,",
                "Я больше так не буду,",
                "Прошу тебя,",
                "Я очень расстроен,",
                "Я не хотел,",
                "бро,"
        };

        String[] b = {
                "прости меня!",
                "умоляю прости!",
                "давай мириться!",
                "не сердись!",
                "забудь это!",
                "я исправлюсь!",
                "ты же добрый!",
                "я был не прав!",
                "давай по-хорошему!",
                "не держи зла!",
                "я не хотел!",
                "я что-то не то сказал!",
                "я возможно не прав!"
        };

        Random random = new Random();
        int t = 400;
        String[] filenames = {
                "извинения_великому_радику.txt",
                "извинения_великому_пиксу.txt",
                "извинения_великому_кодеру.txt",
                "извинения_выебаному_Петушку.txt"
        };

        try (PrintWriter writer1 = new PrintWriter(new FileWriter(filenames[0]));
             PrintWriter writer2 = new PrintWriter(new FileWriter(filenames[1]));
             PrintWriter writer3 = new PrintWriter(new FileWriter(filenames[2]));
             PrintWriter writer4 = new PrintWriter(new FileWriter(filenames[3]))) {

            for (int i = 0; i < t; i++) {
                String start = a[random.nextInt(a.length)];
                String end = b[random.nextInt(b.length)];
                String fA = String.format("%s %s", start, end);

                writer1.println(fA);
                writer2.println(fA);
                writer3.println(fA);
                writer4.println(fA);
                System.out.println(fA);

                if (i % Math.max(2, random.nextInt(8)) == 0) {
                    String separator = String.format("----- [%d] -----", i);
                    writer1.println(separator);
                    writer2.println(separator);
                    writer3.println(separator);
                    writer4.println(separator);
                    System.out.println(separator);
                }
            }

            String statsTemplate = "\nИтого:\nИзвинений: %d\nФайлы созданы: %s, %s, %s, %s";
            String stats = String.format(statsTemplate, t, filenames[0], filenames[1], filenames[2], filenames[3]);

            writer1.println(stats);
            writer2.println(stats);
            writer3.println(stats);
            writer4.println(stats);

            System.out.println(stats);
            System.out.println(String.format("\nВсе файлы успешно созданы в: %s", System.getProperty("user.dir")));

        } catch (IOException e) {
            System.err.println(String.format("Ошибка при записи файлов: %s", e.getMessage()));
        }
    }
}

class MyProgram43 {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(4));
        System.out.println(Integer.toBinaryString(-16));
        System.out.println(Integer.toBinaryString(13));
        System.out.println(Integer.toBinaryString(81));
        System.out.println(Integer.toBinaryString(26 | 10));
        System.out.println(-4 << 2 == -4 * Math.pow(2, 2));
        System.out.println(Integer.toBinaryString(81 ^ 42));

    }
}

class OtchimGenerator {
    private static final Random rand = new Random();

    private static final String[] a = {"Маркус", "Дэрил", "Саймон", "Адольф", "Джэк", "Адам", "Дилан", "Дик", "Эрик", "Олег"};
    private static final String[] goyda = {"Гитлер", "Dick", "Хуан", "Ломоаналов", "Джигурда", "Дебошир", "Пиписьков", "Стояк", "Дилдов", "Пиксаебатель9000"};
    private static final String[] piska_markusa = {"по прозвищу 'Малыш'^^", "два слова: проблемы с отцом", "пикс хантер", "2 в одном)", "любит minecraft:ender_rod", "нянь по прозвищу 'Папочка'!", "FOR PIX"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("GOYDA OTCHIM GENERATOR THE VERSION PIX 9000 стоп слово - пикс гей\n");

        
        Thread patok = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                if (scanner.hasNextLine()) {
                    String input = scanner.nextLine();
                    if (input.equals("пикс гей")) {
                        System.out.println("\nты чертовске прав, пикс гей");
                        System.exit(1488);
                    }
                }
            }
        });
        patok.start();

        while (true) {
            System.out.println(generateOtchim());
            try {
                Thread.sleep(300); // эта кароч задержка спермы отчимав
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    private static String generateOtchim() {
        return String.format("%s %s (%s)",
                a[rand.nextInt(a.length)],
                goyda[rand.nextInt(goyda.length)],
                piska_markusa[rand.nextInt(piska_markusa.length)]
        );
    }
}

