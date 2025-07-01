public class Program {

    public static void main(String[] args) {

        //применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        System.out.println(2+6);
        System.out.println(7-6);
        System.out.println(2*2);
        System.out.println(2 / 2);

        //1) применить несколько арифметических операций над int и double в одном выражении
        System.out.println(2.0+6);
        System.out.println(7.0-6);
        System.out.println(7.0*2);
        System.out.println(8.0 / 6);

        //2) применить несколько логических операций ( < , >, >=, <= )
        System.out.println(2>6);
        System.out.println(2<6);
        System.out.println(2==2);
        System.out.println(2!=2);

    //4) получить переполнение при арифметической операции
        
        byte max = Byte.MAX_VALUE;
        byte overflow = ++max;
        System.out.println(overflow);

        }
    }
