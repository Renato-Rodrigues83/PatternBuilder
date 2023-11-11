package Patterns.PatternsBuilder;

import Patterns.PatternsBuilder.PatternBuilder.Casa2Quartos;
import Patterns.PatternsBuilder.PatternBuilder.Casa2QuartosBanheiro;
import Patterns.PatternsBuilder.PatternBuilder.IBuilderCasa;
import Patterns.PatternsBuilder.model.Casa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternsBuilderApplication {

	public static void main(String[] args) {

			SpringApplication.run(PatternsBuilderApplication.class, args);
			IBuilderCasa builderCasa1 = new Casa2Quartos();
			builderCasa1.buildQuartos();
			builderCasa1.buildBanheiros();
			builderCasa1.buildChurrasqueira();
			Casa casa1 = builderCasa1.getCasa();

			System.out.println("Casa 1:");
			System.out.println("Quartos: " + casa1.getQuartos());
			System.out.println("Banheiros: " + casa1.getBanheiros());
			System.out.println("Churrasqueira: " + casa1.isChurrasqueira());

			System.out.println("----------------------------");

			// Construindo uma casa com 2 quartos, 2 banheiros e churrasqueira
			IBuilderCasa builderCasa2 = new Casa2QuartosBanheiro();
			builderCasa2.buildQuartos();
			builderCasa2.buildBanheiros();
			builderCasa2.buildChurrasqueira();
			Casa casa2 = builderCasa2.getCasa();

			System.out.println("Casa 2:");
			System.out.println("Quartos: " + casa2.getQuartos());
			System.out.println("Banheiros: " + casa2.getBanheiros());
			System.out.println("Churrasqueira: " + casa2.isChurrasqueira());
		}
	}


