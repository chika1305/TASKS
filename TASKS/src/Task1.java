public class Task1 {
    //Два числа передаются в качестве параметров. Первый параметр,разделенный на второй параметр, будет иметь остаток, возможно, ноль.
    // Верните это значение.
    public static int remainder (int a, int b){
        return a % b ;
    }

//Напишите функцию, которая принимает основание и высоту треугольника и возвращает его площадь.

    public static double triArea (int a, int h){
        return 0.5*a*h ;
    }

//Сколько ног можно сосчитать среди всех его животных.
//Есть 3 вида:
//chickens = 2 legs
//cows = 4 legs
//pigs = 4 legs
//Фермер дает промежуточный итог для каждого вида.
//Нужно реализовать функцию, которая возвращает общее количество ног всех животных.

    public static int animal(int chickens, int cows, int pigs){
        return chickens*2 + cows* 4 + pigs*4 ;
    }

//Создать функцию, которая принимает три аргумента (prob, prize, pay) и
//возвращает true, если prob * prize > pay;
//в противном случае возвращает false.
//Чтобы проиллюстрировать это: profitableGamble (0,2, 50, 9) должен выдать значение true,
//поскольку 1 (0,2 * 50 - 9), а 1> 0.

    public static boolean profitableGamble ( double prob, double prize, double pay){
        return prob * prize > pay;
    }

//Написать функцию, которая принимает 3 числа и возвращает, что нужно сделать с
//a и b: они должны быть +, -, * или /, чтобы получить N.
// Если ни одна из операций не может дать N, верните "none".
// 3 числа –  N, a и b.

    public static String operation(int N, int a, int b) {
        if (a+b == N)
            return "added";
        else if (a-b == N)
            return "subtracted";
        else if (a*b == N)
            return "multiply";
        else if (a/b == N)
            return "davide";
        else return "none";
    }

// Создать функцию, которая возвращает значение ASCII переданного символа.

    public static int ctoa(char a) {
        return (int) a;
    }

//Написать функцию, которая берет последнее число из последовательного списка
//чисел и возвращает сумму всех чисел до него и включая его.

    public static int addUpTo(int n){
        int[] mass = new int[n];
        int sum = 0;
        for(int i = 0; n > i; i++){
            mass[i] = i+1;
            sum = sum + mass[i];
        }
        return sum;
    }

//Создать функцию, которая находит max значение 3 ребра треугольника,
//где длины сторон являются целыми числами.

    public static int nextEdge(int a, int b){
        return a + b -1;
    }

//Создать функцию, которая принимает массив чисел и возвращает сумму его кубов.

    public static int sumOfCubes(int [] mass){
        int sum = 0;
        for (int value : mass) {
            sum += Math.pow(value, 3);
        }
        return sum;
    }

//Создать функцию, которая будет для данного a, b, c выполнять следующие действия:
//– Добавьте A к себе B раз.
//– Проверьте, делится ли результат на C.

    public static boolean abcmath(int a, int b, int c){
        for (int i = 0; i<b ; i++){
            a=a+a;
        }
        return a % c == 0;
    }
}
