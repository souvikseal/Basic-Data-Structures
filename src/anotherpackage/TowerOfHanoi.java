package anotherpackage;

public class TowerOfHanoi {

	   public void solve(int n, String start, String auxiliary, String end) {
	       if (n == 1) {
	           System.out.println(start + " -> " + end);
	       } else {
	           solve(n - 1, start, end, auxiliary);
	           System.out.println(start + " -> " + end);
	           solve(n - 1, auxiliary, start, end);
	       }
	   }

	   public static void main(String[] args) {
	       TowerOfHanoi towersOfHanoi = new TowerOfHanoi();
	       towersOfHanoi.solve(3, "A", "B", "C");
	   }
	}
