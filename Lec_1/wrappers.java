
// Обертки
// int          Integer
// short        Short
// long         Long
// byte         Byte
// float        Float
// double       Double
// char         Character
// boolean      Boolean

// class Program
// {
//  public static void main(String[] args) {
//  System.out.println(Integer.MAX_VALUE); // 2147483647
//  System.out.println(Integer.MIN_VALUE); // -2147483648
//  }
// }

// Операции Java

// Присваивание: =
// ● Арифметические: *, /, +, -, %, ++, --
// ● Операции сравнения: <, >, ==, !=, >=, <=
// ● Логические операции: ||, &&, ^, !
// ● Побитовые операции <<, >>, &, |, ^

// Массивы

// Одномерные
// public class Program {
//  public static void main(String[] args) {
//  int[] arr = new int[10];
//  System.out.println(arr.length); // 10
//  arr = new int[] { 1, 2, 3, 4, 5 };
//  System.out.println(arr.length); // 5
//  }
// }

// public class Program {
//     public static void main(String[] args) {
//     int[] arr[] = new int[3][5];
//     for (int[] line : arr) {
//     for (int item : line) {
//     System.out.printf("%d ", item);
//     }
//     System.out.println();
//     }
//     }
//    }

// public class Program {
//     public static void main(String[] args) {
//     int[][] arr = new int[3][5];
   
//     for (int i = 0; i < arr.length; i++) {
//     for (int j = 0; j < arr[i].length; j++) {
//     System.out.printf("%d ", arr[i][j]);
//     }
//     System.out.println();
//     }
//     }
//    }
   
// Преобразования

// Можно

// public class Program {
//     public static void main(String[] args) {
//     int i = 123; double d = i;
//     System.out.println(i); // 123
//     System.out.println(d); // 123.0
//     d = 3.1415; i = (int)d;
//     System.out.println(d); // 3.1415
//     System.out.println(i); // 3
//     d = 3.9415; i = (int)d;
//     System.out.println(d); // 3.9415
//     System.out.println(i); // 3
//     byte b = Byte.parseByte("123");
//     System.out.println(b); // 123
//     b = Byte.parseByte("1234");
//     System.out.println(b); // NumberFormatException: Value out of range
//     }
//    }

// НО

// class Program
// {
//  public static void main(String[] args) {
//  int[] a = new int[10];
//  double[] d = a; // ИЗУЧАЕМ ковариантность и контравариантность
//  }
// }
