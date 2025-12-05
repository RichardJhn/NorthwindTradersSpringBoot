package com.Pluralsight.NorthwindTradersSpringBoot;

import com.Pluralsight.NorthwindTradersSpringBoot.Models.Product;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class NorthwindTradersSpringBootApplication {
	private static ProductDao productDao = new SimpleProductDao();

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(NorthwindTradersSpringBootApplication.class, args);
		Scanner s = new Scanner(System.in);
		for(String beanDefinitionName : ac.getBeanDefinitionNames()){
			System.out.println(beanDefinitionName);
		}

		String prompt = """
				Please make a choice:
				1) List products
				2. Add product
				Choose a number""";

		while (true){
			int choice = s.nextInt();
			switch (choice){
				case 1:
					doAddProduct();
				case 2:
				case 0:
				default:
			}
		}
	}

	private static void doAddProduct(){
		String ProductName = ConsoleHelper.promptForString("Enter your choice");
		String ProductCategory = ConsoleHelper.promptForString("Enter your choice");
		double productPrice = ConsoleHelper.promptForInt("Enter your choice");
		Product product = new Product(productPrice,0,ProductName,ProductCategory);

	}


}
