class CalculatorProject
  public int add(int a, int b) {
	  int c=a+b;
	  return c;
  }
public int square(int x)
{
	int z=x*x;
	return z;
}
    public static void main (String args[]) {
	    CalculatorProject cal = new Calculator();
	    system.out.println("the sum of two numbers is "+(cal.add(2,3)));
	    system.out.println("the square of the number is "+(cal.square(4));
    }
  }
