// Функции и методы

// Функции и методы — это технически одно и то же. Функции могут
// не принадлежать классам, а методы принадлежат.
// В java все функции являются методами.
// Описание
// Вызов
// Возвращаемое значение
// Рекурсия

// public class Program {
//     static void sayHi() {
//     System.out.println("hi!");
//     }
//     static int sum(int a, int b) {
//     return a+b;
//     }
//     static double factor(int n) {
//     if(n==1)return 1;
//     return n * factor(n-1);
//     }
//     public static void main(String[] args) {
//     sayHi(); // hi!
//     System.out.println(sum(1, 3)); // 4
//     System.out.println(factor(5)); // 120.0
//     }}


// Управляющие конструкции


// public class Program {
//     public static void main(String[] args) {
//     int a = 1;
//     int b = 2;
//     int c;
//     if (a > b) {
//     c = a;
//     } else {
//     c = b;
//     }
//     System.out.println(c);
//     }
//    }

// public class Program {
//     public static void main(String[] args) {
//     int a = 1;
//     int b = 2;
//     int c = 0;
//     if (a > b) c = a;
//     if (b > a) c = b;
//     System.out.println(c);
//     }
//    }
   
// public class Program {
//     public static void main(String[] args) {
//     int a = 1;
//     int b = 2;
//     int min = a < b ? a : b;
//     System.out.println(min);
//     }
//    }


// Оператор выбора

// import java.util.Scanner;
// public class Program {
//  public static void main(String[] args) {
//     int mounth = value;
//     String text = "";
//     switch (mounth) 
//     {
//         case 1:
//         text = "Autumn";
//         break;
    
//     default:
//         text = "mistake";
//         break;
//     }
//     System.out.println(text);
//     iScanner.close();
//  }
// }


// Циклы

// Цикл — это многократное выполнение одинаковой
// последовательности действий.
// В java доступны следующие циклы:
// ● цикл while;
// ● цикл do while;
// ● цикл for; и его модификация for in

// Цикл while

// public class Program {
//  public static void main(String[] args) {
//  int value = 321;
//  int count = 0;
//  while (value != 0) {
//  value /= 10;
//  count++;
//  }
//  System.out.println(count);
//  }
// }

// Цикл do while

// public class Program {
//  public static void main(String[] args) {
//  int value = 321;
//  int count = 0;
//  do {
//  value /= 10;
//  count++;
//  } while (value != 0);
//  System.out.println(count);
//  }
// }

// continue, break
// Операторы для управления циклами — continue и break.
// Выполнение следующей итерации цикла — continue.
// Прерывание текущей итерации цикла — break.
// * ближайшего к оператору

// Оператор цикла for

// public class Program {
//  public static void main(String[] args) {
//  int s = 0;
//  for (int i = 1; i <= 10; i++) {
//  s += i;
//  }
//  System.out.println(s);
//  }
// }

// Вложенные циклы

// public class Program {
//  public static void main(String[] args) {
//  for (int i = 0; i < 5; i++) {
//  for (int j = 0; j < 5; j++) {
//  System.out.print("* ");
//  }
//  System.out.println();
//  }
//  // * * * * *
//  // * * * * *
//  // * * * * *
//  // * * * * *
//  // * * * * *
//  }
// }

// for :
// public class Program {
//  public static void main(String[] args) {
//         int arr[] = new int[10];
//         for (int item : arr) {
//             System.out.printf("%d ", item);
//     }
//     System.out.println();
//  }
// }
