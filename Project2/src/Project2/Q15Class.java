package Project2;

public class Q15Class implements InterfaceQ15 {
	
    @Override
    public double addition(double one, double two) {
        return one+two;
    }

    @Override
    public double subtraction(double one, double two) {
        return one - two;
    }

    @Override
    public double multiplication(double one, double two) {
        return one*two;
    }

    @Override
    public double division(double one, double two) {
        if(two == 0){
            System.out.println("Cannot Divide by zero");
        }else{
            return one /two;
        }
        return 0;
    }

}
