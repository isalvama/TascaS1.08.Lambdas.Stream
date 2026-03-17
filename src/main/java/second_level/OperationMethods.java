package second_level;

public class OperationMethods {
    public static final Operation ADD = Integer::sum;
    public static final Operation SUBSTRACT = (i, j) -> i - j;
    public static final Operation DIVIDE = Integer::divideUnsigned;
    public static final Operation MULTIPLY = (i, j) -> i * j;
}
