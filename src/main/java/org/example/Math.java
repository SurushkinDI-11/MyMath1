package org.example;

public class Math {
    public static final double PI=3.1415926535;
    public static final double E=2.7182818284;

    //задание 1
    public static double min(double one, double two){
        double answer;
        if(one == two) {
            System.out.println("Числа равны");
            answer = one;
        }else if(one<two){
            answer = one;
            System.out.println("Первое число меньше " + one);
        }else{
            answer = two;
            System.out.println("Первое число меньше " + two);
        }

        return answer;
    }
    public static double min(int one, int two){
        double answer;
        if(one == two) {
            System.out.println("Числа равны");
            answer = one;
        }else if(one<two){
            answer = one;
            System.out.println("Первое число меньше " + one);
        }else{
            answer = two;
            System.out.println("Первое число меньше " + two);
        }

        return answer;
    }
    public static double min(float one, float two){
        double answer;
        if(one == two) {
            System.out.println("Числа равны");
            answer = one;
        }else if(one<two){
            answer = one;
            System.out.println("Первое число меньше " + one);
        }else{
            answer = two;
            System.out.println("Первое число меньше " + two);
        }

        return answer;
    }
    public static double min(long one, long two){
        double answer;
        if(one == two) {
            System.out.println("Числа равны");
            answer = one;
        }else if(one<two){
            answer = one;
            System.out.println("Первое число меньше " + one);
        }else{
            answer = two;
            System.out.println("Первое число меньше " + two);
        }

        return answer;
    }
    public static double arcSin(double x) {
        if (x < -1.0 || x > 1.0) {
            throw new IllegalArgumentException("Аргумент арксинуса должен быть в интервале [-1, 1]");
        }

        double result = x;
        double term = x;
        double sign = 1.0;

        for (int i = 1; i < 100; i += 2) {
            term *= (x * x) / ((i + 1) * (i + 2));
            sign = -sign;
            result += sign * term;
        }
        return result;
    }
    public static double arcSin(int x) {
        if (x < -1.0 || x > 1.0) {
            throw new IllegalArgumentException("Аргумент арксинуса должен быть в интервале [-1, 1]");
        }

        double result = x;
        int term = x;
        double sign = 1.0;

        for (int i = 1; i < 100; i += 2) {
            term *= (x * x) / ((i + 1) * (i + 2));
            sign = -sign;
            result += sign * term;
        }
        return result;
    }
    public static double arcSin(float x) {
        if (x < -1.0 || x > 1.0) {
            throw new IllegalArgumentException("Аргумент арксинуса должен быть в интервале [-1, 1]");
        }

        double result = x;
        float term = x;
        double sign = 1.0;

        for (int i = 1; i < 100; i += 2) {
            term *= (x * x) / ((i + 1) * (i + 2));
            sign = -sign;
            result += sign * term;
        }
        return result;
    }
    public static double arcSin(long x) {
        if (x < -1.0 || x > 1.0) {
            throw new IllegalArgumentException("Аргумент арксинуса должен быть в интервале [-1, 1]");
        }

        double result = x;
        long term = x;
        double sign = 1.0;

        for (int i = 1; i < 100; i += 2) {
            term *= (x * x) / ((i + 1) * (i + 2));
            sign = -sign;
            result += sign * term;
        }
        return result;
    }
    public static double arcCos(double x) {
        if (x < -1.0 || x > 1.0) {
            throw new IllegalArgumentException("Аргумент аркосинуса должен быть в интервале [-1, 1]");
        }

        double asinResult = arcSin(x);
        double result = PI / 2.0 - asinResult;
        return result;
    }
    public static double arcCos(int x) {
        if (x < -1.0 || x > 1.0) {
            throw new IllegalArgumentException("Аргумент аркосинуса должен быть в интервале [-1, 1]");
        }

        double asinResult = arcSin(x);
        double result = PI / 2.0 - asinResult;
        return result;
    }
    public static double arcTan(float x) {
        double result = 0;
        double term = x;
        double sign = 1.0;

        for (int i = 1; i <= 100; i += 2) {
            result += sign * term / i;
            term *= -x * x;
            sign = -sign;
        }
        return result;
    }
    public static double arcTan(long x) {
        double result = 0;
        double term = x;
        double sign = 1.0;

        for (int i = 1; i <= 100; i += 2) {
            result += sign * term / i;
            term *= -x * x;
            sign = -sign;
        }
        return result;
    }
    public static double pow(double x, double y){
        double answer = x;
        for(int i=1; i < y; i++){
            answer = answer * x;
        }
        return answer;
    }
    public static double pow(int x, int y){
        double answer = x;
        for(int i=1; i < y; i++){
            answer = answer * x;
        }
        return answer;
    }
    public static double pow(float x, float y){
        double answer = x;
        for(int i=1; i < y; i++){
            answer = answer * x;
        }
        return answer;
    }
    public static double pow(long x, long y){
        double answer = x;
        for(int i=1; i < y; i++){
            answer = answer * x;
        }
        return answer;
    }
    public static double sCircle(double radius){
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        }
        double answer = PI * pow(radius, 2);
        return answer;
    }
    public static double sCircle(int radius){
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        }
        double answer = PI * pow(radius, 2);
        return answer;
    }
    public static double sCircle(float radius){
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        }
        double answer = PI * pow(radius, 2);
        return answer;
    }
    public static double sCircle(long radius){
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        }
        double answer = PI * pow(radius, 2);
        return answer;
    }

    public static double pCircle(double radius){
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        }
        double answer = PI * radius * 2;
        return answer;
    }
    public static double pCircle(int radius){
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        }
        double answer = PI * radius * 2;
        return answer;
    }
    public static double pCircle(float radius){
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        }
        double answer = PI * radius * 2;
        return answer;
    }
    public static double pCircle(long radius){
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        }
        double answer = PI * radius * 2;
        return answer;
    }
    public static  String identifyNumberType(String input){
        if (input == null || input.isEmpty()) {
            return "Не удалось определить тип числа: входная строка пуста";
        }

        // Удаляем начальные и конечные пробелы
        input = input.trim();

        // Проверяем, является ли число целым
        if (input.matches("^-?\\d+$")) {
            return "int";
        }

        // Проверяем, является ли число с плавающей точкой (float или double)
        if (input.matches("^-?\\d+\\.\\d+$")) {
            return input.contains("f") || input.contains("F") ? "float" : "double";
        }

        // Проверяем, является ли число long (с суффиксом L или l)
        if (input.matches("^-?\\d+[Ll]$")) {
            return "long";
        }

        return "Не удалось определить тип числа: неверный формат числа";
    }

}