// Получение
// данных
// из терминала

// Строки

// import java.util.Scanner;
// public class Program {
//  public static void main(String[] args) {
//  Scanner iScanner = new Scanner(System.in);
//  System.out.printf("name: ");
//  String name = iScanner.nextLine();
//  System.out.printf("Привет, %s!", name);
//  iScanner.close();
//  }
// }

// Некоторые примитивы

// import java.util.Scanner;
// public class Program {
//  public static void main(String[] args) {
//  Scanner iScanner = new Scanner(System.in);
//  System.out.printf("int a: ");
//  int x = iScanner.nextInt();
//  System.out.printf("double a: ");
//  double y = iScanner.nextDouble();
//  System.out.printf("%d + %f = %f", x, y, x + y);
//  iScanner.close();
// }}

// Проверка на соответствие получаемого типа

// import java.util.Scanner;
// public class Program {
//  public static void main(String[] args) {
//  Scanner iScanner = new Scanner(System.in);
//  System.out.printf("int a: ");
//  boolean flag = iScanner.hasNextInt();
//  System.out.println(flag);
//  int i = iScanner.nextInt();
//  System.out.println(i);
//  iScanner.close();
//  } }

// Форматированный
// вывод

// public class Program {
//     public static void main(String[] args) {
//     int a = 1, b = 2;
//     int c = a + b;
//     String res = a + " + " + b + " = " + c;
//     System.out.println(res);
//     }
//    }

// public class Program {
//     public static void main(String[] args) {
//     int a = 1, b = 2;
//     int c = a + b;
//     String res = String.format("%d + %d = %d \n", a, b, c);
//     System.out.printf("%d + %d = %d \n", a, b, c);
//     System.out.println(res);
//     }
//    }
   
// Виды спецификаторов

// %d: целочисленных значений
// %x: для вывода шестнадцатеричных чисел
// %f: для вывода чисел с плавающей точкой
// %e: для вывода чисел в экспоненциальной форме,
// например, 3.1415e+01
// %c: для вывода одиночного символа
// %s: для вывода строковых значений

// public class Program {
//     public static void main(String[] args) {
   
//     float pi = 3.1415f;
//     System.out.printf("%f\n", pi); // 3,141500
//     System.out.printf("%.2f\n", pi); // 3,14
//     System.out.printf("%.3f\n", pi); // 3,141
//     System.out.printf("%e\n", pi); // 3,141500e+00
//     System.out.printf("%.2e\n", pi); // 3,14e+00
//     System.out.printf("%.3e\n", pi); // 3,141e+00
//     }
//    }
   
// Область
// видимости
// переменных

// У переменных существует понятие «область видимости».
// Если переменную объявили внутри некоторого блока фигурных скобок { },
// то снаружи этого блока переменная будет недоступна.
// public class Program {
//  public static void main(String[] args) {
//  {
//  int i = 123;
//  System.out.println(i);
//  }
//  System.out.println(i); // error: cannot find symbol
//  }
// }

