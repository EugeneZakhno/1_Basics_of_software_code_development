package by.learn;

public class CheckLiterals {

    public static void main(String[] args) {

    // УРОК  Arithmetics и привдение типов
        int x = 8;
        int y = 5;
        int z = x / y; //1  если выходит дробная то обрезается до дробной
        z = x % y; //3   остаток от деления тоже целочисленный

     // С константами не нужно привдение типов
       final byte a = 1;
       final byte b = 2;
        byte c = (a+b);

      // Без констант нужно явное приведение типов
        byte a1 = 1;
        byte b1 =2;
        byte c1 =(byte) (a1+b1);
//******************************************************************
        // Унарные операторы или арифметические/ Постфиксный и префиксный инкремент
//*******************************************************************
        int x1 = 1;
        x1++;  //2  Постфиксный инкремент
        ++x1;  //   Префиксный  инкремент
        x = x + 1; //3

        //  Деление на 0

        double b2 = 0.;  // Да так можно, просто точку после 0
        double a2 = 1/b2; //
        System.out.println(a2);  // Infinity

        // Не число
        double z1 = Math.sqrt(-1);  // извлечем квадратный корень из -1
        System.out.println(z1);     // NaN


















    }
}




