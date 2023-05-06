import java.util.Scanner;

//instrução1
// Perguntat ao Usuaria(aluno) o tamanho da base do triangulo.
//instrução2
//Guarde o valor da base do triangulo em uma variavel.
//instrução3
//Perguntar ao Usuario(aluno) o tamanho da altura
//instrução4
//Guardar o valor do tamanho da altura do triangulo.
//instrução5
//Fazer a multiplicação da base pela altura.
//instrução6
//Fazer a divisão por 2 para obter a area.
//instrução7
//Guardar o resultado da divisão.
//instrução8
//Printar o resultado
//instrução9
//Apresentar o resultado para o usuario.
//...

class TiposTriangulos {
  
	public static void main(String args[]){  
   
    		Scanner teclado = new Scanner(System.in);
			
			
    		double Z,Y, X, altura, area,perimetro;
			int continuar;
			
			
			
			
			System.out.printf("Insira o tamanho da base X do triangulo \n");
			X = teclado.nextDouble();
			
			System.out.printf("Insira o tamanho da base Y do triangulo \n");
			Y = teclado.nextDouble();
			
			System.out.printf("Insira o tamanho da base Z do triangulo \n");
			Z = teclado.nextDouble();
			
			String tipo = "Isosceles";
			
			//Triangulo Equilatero
			if(X == Y && X == Z){
			tipo = "Equilatero";
			
			
			}
			
			//Triangulo Escaleno
			if(X != Y && X != Z || Y != X && Y != Z || Z != Y && Z != X){
			tipo = "Escaleno";
			}
			
			
			
			//calcular area do triangulo equilatero
			if(tipo == "Equilatero"){
			
			//altura = (Math.sqrt(3) / 2) * X;
			//area   = (altura * X) /2;
		
			
			perimetro = (X + Y + Z) / 2;
			perimetro = perimetro / 2;
			area      = Math.sqrt(perimetro * (perimetro - X) * (perimetro - Y) * (perimetro - Z));
			System.out.printf("A area do triangulo e: \n\n\n"+ area + "\n\n\nE o tipo do triangulo e: "+tipo+"\n\n\n");
			System.out.printf("O triangulo Equilatero nao possui lado maior, pois todos sao iguais \n\n\n");
			}
			
			
			//calcular area do triangulo escaleno
			if(tipo == "Escaleno"){
				
			/*	
			double semiPerimetro;
			semiPerimetro = (X + Y + Z) / 2;
			area  = Math.sqrt(semiPerimetro * (semiPerimetro - X) * (semiPerimetro - Y) * (semiPerimetro - Z));
			*/
			
			perimetro = (X + Y + Z) / 2;
			perimetro = perimetro / 2;
			area      = Math.sqrt(perimetro * (perimetro - X) * (perimetro - Y) * (perimetro - Z));
			
			System.out.printf("A area do triangulo e: \n\n\n"+ area + "\n\n\nE o tipo do triangulo e: "+tipo+"\n\n\n");
			
			}
			
			
			
			//calcular area do triangulo isosceles
			if( tipo == "Isosceles"){
			
			perimetro = (X + Y + Z) / 2;
			perimetro = perimetro / 2;
			area      = Math.sqrt(perimetro * (perimetro - X) * (perimetro - Y) * (perimetro - Z));	
				
			System.out.printf("A area do triangulo e: \n\n\n"+ area + "\n\n\n E o tipo do triangulo e: "+tipo+"\n\n\n");
			
			}
			
			
			
			
			//System.out.printf("triangulo %s\n\n\n\n\n (: \n\n\n", tipo);
			/*
			System.out.printf("\n\n\n\n\n (: \n\n\n");
			System.out.printf("%f", area);
			System.out.printf("\n\n\n\n\n (: \n\n\n");
			System.out.printf("%f", altura);
			System.out.printf("\n\n\n\n\n (: \n\n\n");
			*/	
	System.out.printf("Deseja inserir outro triangulo? ( 1 - Para sim | 2 - para nao)\n");
    
			continuar = teclado.nextInt();
    
			if(continuar == 1){
			main(null);
			}

    		System.exit(0);
			
			
		
	}

}