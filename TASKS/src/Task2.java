import java.util.Arrays;

public class Task2 {
//Создать функцию, которая повторяет каждый символ в строке n раз

    public static String repeat(String word, int n){
        String newWord = " ";
        for (int i = 0; i< word.length() ; i++){
            for (int j = 0; j<n; j++){
                newWord+= word.charAt(i);
            }
        }
        return newWord;
    }

//Создать функцию, которая принимает массив и возвращает разницу между самыми большими и самыми маленькими числами.

    public static int differenceMaxMin(int [] mass){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int value : mass) {
            min = Math.min(min, value);
            max = Math.max(max, value);
        }
        return max - min;
    }

//Создайте функцию, которая принимает массив в качестве аргумента и возвращает true или false
//в зависимости от того, является ли среднее значение всех элементов массива целым числом или нет.

    public static boolean isAvgWhole(int mass[]){
        double sum=0;

        for (int value : mass) {
            sum += value;
        }
        if ((sum%mass.length)%100<1)
            return true;
        else
            return false;

    }

//Создать метод, который берет массив целых чисел и возвращает массив, в
//котором каждое целое число является суммой самого себя и  всех предыдущих чисел в массиве.

    public static int[] cumulativeSum( int [] mass){

        for (int i = 1; i < mass.length; i++){
            mass[i] = mass[i] + mass[i-1];
        }
        return mass;
    }

//Создать функцию, которая возвращает число десятичных знаков,  имеет число.
// Любые нули после десятичной точки отсчитываются в сторону количества десятичных знаков.

    public static int getDecimalPlaces(String number){
        if (number.indexOf('.')!=0){
            return number.length()-number.indexOf('.')-1;
        }
        else
            return 0;
    }

//Создать функцию, которая при заданном числе возвращает соответствующее число Фибоначчи.

    public static int Fibonacci (int n){
        switch (n) {
            case 0:
            case 1:
                return 1;
            default:
                return Fibonacci(n - 2) + Fibonacci(n - 1);
        }
    }

//Почтовые индексы состоят из 5 последовательных цифр. Учитывая строку,
//написать функцию, чтобы определить, является ли вход действительным почтовым индексом.
//Действительный почтовый индекс выглядит следующим образом:
//– Должно содержать только цифры .
//– Не должно содержать никаких пробелов.
//– Длина не больше 5 цифр.

    public static boolean isValid(String index){
        int buf = 0;
        for (int i = 0; i < index.length(); i++) {
            if (!Character.isDigit(index.charAt(i)))
                buf++;
            else if (index.charAt(i) == ' ')
                buf++;
            else if (index.length() != 5)
                buf++;
        }
        return buf == 0;
    }

//Пара строк образует странную пару, если оба из следующих условий истинны:
//– Первая буква 1-й строки равно последняя буква 2-й строки.
//– Последняя буква 1-й строки равно первая буква 2-й строки.
//– Создать функцию, которая возвращает true, если пара строк представляет собой странную пару, и false в другом случае.

    public static boolean isStrangePair (String word1, String word2){
        return word1.charAt(0) == word2.charAt(word2.length() - 1) &&
                word2.charAt(0) == word2.charAt(word1.length() - 1);
    }

//Создать две функции: isPrefix(word, prefix-) и isSuffix (word, -suffix).
//– isPrefix должен возвращать true, если он начинается с префиксного аргумента.
//– isSuffix должен возвращать true, если он заканчивается аргументом суффикса.
//– В противном случае вернуть false.

    public static boolean isPrefix(String word, String pref){
        pref =  pref.substring(0,  pref.length()-1);
        return word.startsWith(pref);
    }

    public static boolean isSuffix(String word, String suf){
        suf = suf.substring(1);
        return word.endsWith(suf);
    }

//Создать функцию, которая принимает число  в качестве аргумента и возвращает количество полей на этом шаге последовательности.
//Шаг 0: начните с 0
//Шаг 1: Добавьте 3
//Шаг 2: Вычтите 1
//Повторите Шаги 1 и 2

    public static int boxSeq(int shag){
        if (shag == 0) return 0;
        int count = 0;
        for (int i = 0; i < shag; i++) {
            if (i % 2 != 0) count--;
            else count += 3;
        }
        return count;
    }
}