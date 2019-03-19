package TASK3;

public enum MathOperator {
    ADD,
    SUBSTRACT,
    MULTIPLY,
    DIVIDE;
    public int execute(int a, int b){
        switch (this){
            case ADD:
                return a+b;
            case SUBSTRACT:
                return a-b;
            case MULTIPLY:
                return a*b;
            case DIVIDE:
                return a/b;
            default: return 0;
        }
    }
}
