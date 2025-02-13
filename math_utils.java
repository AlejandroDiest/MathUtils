
public class math_utils {
	
	//con int... aceptamos una cantidad variable de argumentos
	//y con un bucle for each/enchanced for los leemos
	public static int add(int... numeros) {
	    int sum = 0;
	    for (int numero : numeros) {
	        sum = sum + numero;
	    }
	    return sum;
	}

    public static int subtract(int a, int b) {
        return a - b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double divide(int a, int b) {
        return a / b; //Va a dar error si b = 0
    }
}
