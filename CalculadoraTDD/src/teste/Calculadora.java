package teste;

public class Calculadora {

	public Object somar(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	public double subtrair(int x, int y) {

		return x - y;
	}

	public double divisao(double i, double j) {
		// TODO Auto-generated method stub

		try {

			return i / j;
		} catch (ArithmeticException e) {
			System.out.println("ocorreu ex");
			return 0.0;
		}

	}

}
