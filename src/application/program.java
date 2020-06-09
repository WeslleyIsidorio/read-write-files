package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import entities.Product;

public class program {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader("/home/weslley/Documentos/io.CSV"))){
			String line = br.readLine();
			while(line != null) {
				String vect[] = line.split(",");
				Product product = new Product(vect);
				System.out.println(product);
				line = br.readLine();
			}
		
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
