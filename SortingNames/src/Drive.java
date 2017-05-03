public class Drive {
	public static void main(String[] args) {
		
		printRange('e','g');
		printRange('n','s');
		printRange('z','a');
		printRange('q','r');
		
		
		
		}

	private static void printRange(char start, char end) {
		// TODO Auto-generated method stub
		for(char letter = start; letter <= end; letter++){
			System.out.print(letter);
		}
		System.out.println();
	}

	
	}
