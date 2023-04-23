import java.io.*;

class InputFromUser{

	public static void main(String[] args) throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int arr1[] = new int[5];

		for(int i = 0; i<5; i++){

			arr1[i] = Integer.parseInt(br.readLine());
		}

		for(int i=0; i<5; i++){

			System.out.println(arr1[i]);
		}
	}
}

