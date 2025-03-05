package TasksLab01;

public class Tasks {

    protected String Task001(){
        return "Jan, 23";
    }
    /*
    * param value1: double  - wartośc pierwszego argumentu
    * param value2: double   - wartośc drugiego argumentu
    * */
    protected void Task002(double value1, double value2){
        System.out.println("Suma "+ value1 + " + " + value2 + " = "+ (value1+value2));
        System.out.println("Różnica "+ value1 + " - " + value2 + " = "+ (value1-value2));
        System.out.println("Iloczyn "+ value1 + " * " + value2 + " = "+ (value1*value2));
        if (value2 != 0 )
            System.out.println("Iloraz "+ value1 + " / " + value2 + " = "+ (value1/value2));
        else System.out.println("Nie można dzielić przez zero");
    }
    protected boolean Task003(int value) {
        return value % 2 == 0;
    }
    protected boolean Task004(int value) {
        return value % 3 == 0 && value % 5 == 0;
    }
    protected int Task005(int value) {
        return (int) Math.pow(value, 3);
    }
    protected double Task006(int value) {
        return Math.sqrt(value);
    }
    protected boolean Task007(int a, int b, int c) {
        int[] sides = { a, b, c };
        java.util.Arrays.sort(sides);
        return (Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2));
    }
}

