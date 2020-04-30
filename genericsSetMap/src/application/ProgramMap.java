package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the file full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			//As I don't need any order, I can use hashMap
			Map<String,Integer> election = new HashMap<>();
			
			String line = br.readLine();
			while(line!=null) {
				String[] fields = line.split(",");
				String candidate = fields[0];
				Integer votes = Integer.parseInt(fields[1]);
				
				if(election.containsKey(candidate)) {
					election.put(candidate,votes+election.get(candidate));
				}else {
					election.put(candidate,votes);
				}
			
				line = br.readLine();
			}
			
			System.out.println("Election Results");
			for(String key : election.keySet()) {
				System.out.println(key + ": " + election.get(key));
			}
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
