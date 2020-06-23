import java.util.Arrays;


public class Task3 {
    //Квадратное уравнение ax2 + bx + c = 0 имеет либо 0, либо 1, либо 2 различных
    //решения для действительных значений x.
    //учитывая a, b и c, нужно вернуть число решений в уравнение.

    public static int solutions(int a, int b, int c){
        int D=b*b-4*a*c;
        if (D>0)
            return 2;
        else if (D==0)
            return 1;
        else
            return 0;
    }
    // Написать функцию, которая возвращает позицию 2ого вхождения " zip " в
    //строку, или -1, если оно не происходит по крайней мере дважды.
    //Ваш код должен быть достаточно общим, чтобы передать все возможные случаи, когда "zip" может
    //произойти в строке.

    public static int findZip(String strok){
        int n=-1;
        for (int i=0;i<strok.length()-2;i++){
            if (strok.charAt(i)=='z'&& strok.charAt(i+1)=='i'&& strok.charAt(i+2)=='p'&& n==1)
                n=i-1;
            if (strok.charAt(i)=='z'&& strok.charAt(i+1)=='i'&& strok.charAt(i+2)=='p'&& n==-1)
                n=1;

        }
        if (n==1)
            n=-1;
        return n;
    }
    // Создать функцию, которая проверяет, является ли целое число совершенным числом или нет.
    //Совершенное число - это число, которое можно записать как сумму его множителей, исключая само число.

    public static boolean checkPerfect(int a){
        int sum=0;
        boolean check=false;
        for (int i=1;i<a-1;i++){
            if (a%i==0)
                sum+=i;
        }
        if (a==sum)
            check=true;
        return check;
    }
    //Создать функцию, которая принимает строку и возвращает новую строку с заменой ее первого и последнего символов,
    //за исключением двух условий:
    //– Если длина строки меньше двух, верните "несовместимо".".
    //– Если первый и последний символы совпадают, верните "два-это пара.".

    public static String flipEndChars(String str){
        char [] buf;
        if(str.length()<2)
            str="Two's a pair.";
        else if (str.charAt(0)==str.charAt(str.length()-1)) {
            str="Incompatible.";
        }
        else if(!((str == "Two's a pair.") || (str == "Incompatible."))) {
            buf = str.toCharArray();
            buf[0]=str.charAt(str.length()-1);
            buf[str.length()-1]=str.charAt(0);
            str=new String(buf);
        }
        return str;
    }
    // Создать функцию, которая определяет, является ли строка допустимым шестнадцатеричным кодом.

    public static boolean isValidHexCode(String code) {

        if (code.length() > 7) return false;

        else if (code.matches("#[a-fA-F0-9]+")) return true;

        else return false;
    }
    // Написать функцию, которая возвращает true, если 2 массива имеют одинаковое кол-во уникальных элементов,
    // и false в противном случае.

    public static boolean same(int [] mass, int[] mass1) {
        int count = 0;
        int count1 = 0;
        boolean same = false;
        Arrays.sort(mass);
        Arrays.sort(mass1);
        for (int i=0;i<mass.length-1;i++){
            if (mass[i]!=mass[i+1])
                count++;
        }
        for (int i=0;i<mass1.length-1;i++){
            if (mass1[i]!=mass1[i+1])
                count1++;
        }
        if (count == count1)
            same = true;
        return same;
    }
    // Число Капрекара-это положительное целое число, которое после возведения в
    // квадрат и разбиения на две лексикографические части равно сумме двух полученных новых чисел:
    // – Если количество цифр квадратного числа четное, то левая и правая части будут иметь одинаковую длину.
    // – Если количество цифр квадратного числа нечетно, то правая часть будет самой длинной
    // половиной, а левая-самой маленькой или равной нулю, если количество цифр равно 1.
    // – Учитывая положительное целое число n, реализуйте функцию, которая возвращает true, если это число Капрекара, и false, если это не так.

    public static boolean isKaprekar(int n){
        int c = n*n;
        String nstr=String.valueOf(n);
        if (nstr.length() == 1)
            return n == c;
        else
            return Integer.parseInt(nstr.substring(0, nstr.length()/2))+
                    Integer.parseInt(nstr.substring(nstr.length()/2))==n;
    }
    // Написать функцию, которая возвращает самую длинную последовательность
    // последовательных нулей в двоичной строке.

    public static String longestZero(String n){
        String sum = "";
        String count = "";
        for (int i = 0; i < n.length()-1; i++){
            if(n.charAt(i) == '0')
                sum+="0";
            else {
                    if (count.length()<sum.length())
                    count = sum;
                sum = "";
            }
        }
        if (count.length()<sum.length())count=sum;
        return count;
    }
    // Если задано целое число, создать функцию, которая возвращает следующее простое число.
    // Если число простое, верните само число.

    public static int nextPrime(int num){
        while(true){
            boolean check=true;
            for(int i=2;i<=num/2;i++){
                if (num % i == 0) {
                    num++;
                    check=false;
                }
            }
            if (check) break;
        }
        return num;
    }
    // Учитывая три числа, x, y и z, определить, являются ли они ребрами прямоугольного треугольника.

    public static boolean rigthTriangle( int x, int y, int z){
        if ( x == 0 || y == 0 || z == 0 )
            return false;
        return  ( x*x+y*y==z*z || x*x==y*y+z*z || x*x+z*z == y*y);

    }
}
