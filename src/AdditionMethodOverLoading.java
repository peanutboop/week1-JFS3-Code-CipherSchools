public class AdditionMethodOverLoading {

    void add(int a, int b) {
        System.out.println(a+b);

    }
    void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }
    void add(int a, float b) {

        System.out.println(a+b);
    }

    public static void main(String[] args) {
        AdditionMethodOverLoading a = new AdditionMethodOverLoading();
        a.add(21,45,10);
        a.add(12,45);

    }




    }
