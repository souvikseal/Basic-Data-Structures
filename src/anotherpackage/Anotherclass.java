package anotherpackage;
public class Anotherclass {
	public int subtract(int a, int b){
		return(a-b);
	}
	public static void main(String []args) {
		Anotherclass a = new Anotherclass();
		//a.i +=2;
		//System.out.println(a.i);
		
		//System.out.println(test.getI()*3);
	}
interface TestInterface{
	int multiply(int a, int b);
}
interface Test2 extends TestInterface{
	int multiply(int a, int b);
}
class Test extends Anotherclass implements TestInterface,Test2{
	int i;
	Anotherclass a1 = new Test();
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}
}}