interface MathSolver{
    void sum(int... value);
    void subtract(int value1, int value2);
    void multiply(int value1, int value2);
}
class MathSolverImp implements MathSolver{
    @Override
    public void sum(int... value) {
        int sum = 0;
        for (int i = 0; i < value.length; i++) {
            sum += value[i];
        }
        System.out.println("Sum: "+sum);
    }
    @Override
    public void subtract(int value1, int value2) {
        int result = value1 - value2;
        System.out.println("Subtract: " + result);
    }
    @Override
    public void multiply(int value1, int value2) {
        int result = value1 * value2;
        System.out.println("Multiply: " + result);
    }
}
public class Main {
    public static void main(String[] args) {
        MathSolver mathSolver = new MathSolverImp();
        mathSolver.sum(1, 2, 3, 4, 5);
        mathSolver.subtract(10, 20);
        mathSolver.multiply(10, 20);
    }
}