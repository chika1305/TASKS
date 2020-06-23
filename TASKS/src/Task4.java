import java.util.*;


public class Task4 {
    /* Эссе содержит N слов (1≤N≤100), разделенных пробелами.
     * Каждое слово имеет длину от 1 до 15 символов включительно и состоит только из прописных или строчных букв.
     * Согласно инструкции к заданию, эссе должно быть отформатировано очень специфическим образом:
     * каждая строка должна содержать не более K (1≤K≤80) символов, не считая пробелов.
     * Это можно сделать  используя следующую стратегию:
     * – Если Бесси набирает Слово, и это слово может поместиться в текущей строке, поместите его в эту строку.
     *      В противном случае поместите слово на следующую строку и продолжайте добавлять к этой строке.
     *      Конечно, последовательные слова в одной строке все равно должны быть разделены одним пробелом.
     *      В конце любой строки не должно быть места.
     */

    public static String Bessy(int n, int k , String txt){
        String[] text = txt.split(" ");
        txt="";
        String finaltxt="";
        for (int i = 0; i < n; i++) {
            if (txt.length() + text[i].length() > k) {
                finaltxt = finaltxt.trim() + "\r\n" + text[i] + " ";
                txt = text[i];
            } else {
                finaltxt += text[i] + " ";
                txt += text[i];
            }
        }
        return finaltxt.trim();
    }
    //Написать функцию, которая группирует строку в кластер скобок. Каждый кластер должен быть сбалансирован.

    public static String[] split(String str) {
        List<String> list = new ArrayList<String>();
        int f = 0;
        int i = 0;
        while (str.length() > 0) {
            if (str.charAt(i) == '(') f++;
            else f--;
            if (f == 0) {
                list.add(str.substring(0, i + 1));
                str = str.substring(i + 1);
                i = 0;
                continue;
            }
            i++;
        }
        return list.toArray(new String[list.size()]);
    }
    //Создайте две функции toCamelCase () и toSnakeCase (), каждая из которых берет одну строку и преобразует ее либо
    //в camelCase, либо в snake_case.

    public static String toCamelCase(String str) {
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == '_')
                str = str.substring(0, i) + str.substring(i + 1, i + 2).toUpperCase() + str.substring(i + 2, str.length());
        }
        return str;
    }


    public static String toSnakeCase(String str) {
        return str.replaceAll("([A-Z])", "_$0").toLowerCase();
    }
    //Написать функцию, которая вычисляет сверхурочную работу и оплату, связанную с сверхурочной работой.
    //Работа с 9 до 5: обычные часы работы После 5 вечера это сверхурочная работа
    // Ваша функция получает массив с 4 значениями:
    //– Начало рабочего дня, в десятичном формате, (24-часовая дневная нотация)
    //– Конец рабочего дня.
    //– Почасовая ставка
    //– Множитель сверхурочных работ
    //Ваша функция должна возвращать: $ + заработанные в тот день (округление до ближайшей сотой)

    public static String overTime(double[] work) {
        double sum = 0;
        if (17 - work[0] >= 0)
            sum += (17 - work[0]) * work[2];
        if (work[1] - 17 >= 0)
            sum += (work[1] - 17) * work[2] * work[3];
        return ('$' + String.valueOf(sum));
    }
    // Индекс массы тела  определяется путем измерения вашего веса в килограммах и деления на квадрат вашего роста в метрах.
    // Категории ИМТ таковы:
    // Недостаточный вес: <18,5
    // Нормальный вес: 18.5-24.9
    // Избыточный вес: 25 и более
    // Создать функцию, которая будет принимать вес и рост (в килограммах, фунтах, метрах или дюймах)
    // и возвращать ИМТ и связанную с ним категорию. (округлить до ближайшей десятой)
    public static String BMI(String[] fat) {
        double ves = Double.parseDouble(fat[0].split(" ")[0]);
        double rost = Double.parseDouble(fat[1].split(" ")[0]);
        String out = " ";
        if (fat[0].contains("pounds"))
            ves = ves * 0.45;
        if (fat[1].contains("inches"))
            rost *= 0.0254;
        double BMI = Math.round((ves / (rost * rost)) * 10.0) / 10.0;
        if (BMI < 18.5)
            out = BMI + " Underweight";
        if (BMI >= 18.5 && BMI <= 24.9)
            out = BMI + " Normal weight";
        if (BMI > 25)
            out = BMI + " Overweight";
        return out;
    }
    // Создать функцию, которая принимает число и возвращает его мультипликативное постоянство, которое представляет собой количество раз,
    // которое вы должны умножать цифры в num, пока не достигнете одной цифры.

    public static int bugger(int num) {
        int count = 0;
        while (num > 9) {
            int chnum = 1;
            while (num > 0) {
                chnum *= num % 10;
                num /= 10;
            }
            num = chnum;
            count++;
        }
        return count;
    }

    // Написать функцию, которая преобразует строку в звездную стенографию.
    // Если символ повторяется n раз, преобразуйте его в символ*n.

    public static String toStarShorthand(String str) {
        int count = 1;
        char let = str.charAt(0);
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != let) {
                if (count != 1)
                    newStr += let + "*" + count;
                else
                    newStr += let;
                let = str.charAt(i);
                count = 1;
            } else
                count++;
        }
        if (count != 1)
            newStr += let + "*" + count;
        else
            newStr += let;
        return newStr;
    }


    // Создать функцию, которая возвращает true, если две строки рифмуются, и false в противном случае.
    // Для целей этого упражнения две строки рифмуются, если последнее слово из каждого предложения содержит одни и те же гласные.

    public static boolean doesRhyme(String str1, String str2) {
        str1 = str1.substring(str1.lastIndexOf(" ") + 1);
        str2 = str2.substring(str2.lastIndexOf(" ") + 1);
        String let = "aeiouyAEIOUY";
        String res1 = "", res2 = "";
        for (int i = 0; i < str1.length(); i++) {
            if (let.indexOf(str1.charAt(i)) != -1)
                res1 += str1.charAt(i);
        }
        for (int i = 0; i < str2.length(); i++) {
            if (let.indexOf(str2.charAt(i)) != -1)
                res2 += str2.charAt(i);
        }
        if (res1.toLowerCase().equals(res2.toLowerCase())) return true;
        else
            return false;
    }
    // Создать функцию, которая принимает 2 целых числа и возвращает true,
    // если число повторяется 3 раза подряд в любом месте в num1 и то же самое
    // число повторяется 2 раза подряд в num2.

    public static boolean trouble ( long a, long b){
        String aa = Long.toString(a);
        String bb = Long.toString(b);
        int num = 0;
        for (int i = 2 ; i < aa.length(); i++) {
            if (aa.charAt(i) == aa.charAt(i -1) && aa.charAt(i) == aa.charAt(i -2))
                num = aa.charAt(i);
        }
        for (int i = 0 ; i < bb.length(); i++){
            if (bb.charAt(i)==num && bb.charAt(i+1) == num)
                return true;
        }
        return false;
    }
    // Предположим, что пара одинаковых символов служит концами книги для всех символов между ними.
    // Написать функцию, которая возвращает общее количество уникальных символов между всеми парами концов книги.

    public static int countUniqueBooks(String str, char c){
        Map<Character, Integer> values = new HashMap<>();
        boolean start = true;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == c && start) {
                i++;
                while (str.charAt(i) != c){
                    Integer n = values.get(str.charAt(i));
                    if (n == null)
                        values.put(str.charAt(i), 1);
                    else
                        values.put(str.charAt(i), ++n);
                    i++;
                }
                start = false;
            }
            if (str.charAt(i) == c)
                start = true;
        }
        return values.size();
    }

}
