package test;

public class Test {

		public static int som(int a){
			if (a==0) {
				return 0;
			}
			else {
				return a + som(a-1);
			}
		}
		
		public static void main(String args[]){
			int i = 0;
			for (int a = 0; a <= 153; a++){
				i = i + a;
			}
			System.out.println(i);
		}
	}


hi
