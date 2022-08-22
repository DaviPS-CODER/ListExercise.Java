// Exercício 1:
import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 
    float a,b,c;
    float media;
    Scanner entrada = new Scanner(System.in);

    System.out.println("informe a primeira nota: ");
    a = entrada.nextFloat();
    
    System.out.println(" Informe a segunda nota");
    b = entrada.nextFloat();
    
    System.out.println("digite a terceira nota");
    c = entrada.nextFloat();
    
    media = (((a*2) + (b*3) + (c*5)) / 10);
     System.out.println("sua media foi: " + media);
  } 
}

// Exercício 2:

import java.util.Scanner;
class Main {  
  public static void main(String args[]) { 
  int distancia_ini,distancia_final,litros_Gasolina,distancia,media;
  
  Scanner entrada = new Scanner(System.in);

  System.out.print("digite aqui a quilometragem inicial: ");
  distancia_ini = entrada.nextInt();

  System.out.print("digite aqui a quilometragem final: ");
  distancia_final = entrada.nextInt();

  System.out.print("digite aqui quantos litros gastou: ");
  litros_Gasolina = entrada.nextInt();

  distancia = distancia_final - distancia_ini;

  media = distancia / litros_Gasolina;

  System.out.println(" Eis a média de quilometros que vocÊ faz por litro: " + media);

  }
}

//Exercício 3

import java.util.Scanner;
class Main {  
  public static void main(String args[]) { 
  String nome;
  int distancia,tempo,km_hr;
  Scanner entrada = new Scanner(System.in);
  
  System.out.println("digite aqui seu nome: ");
  nome = entrada.next();

  System.out.println("digite a distancia percorrida: ");
  distancia = entrada.nextInt();

  System.out.println("digite aqui o tempo que demorou: ");
  tempo = entrada.nextInt();

  km_hr = distancia / tempo;

  System.out.print("A velocidade média de "+ nome +" foi " + km_hr + " km/h, onde "+ nome +" é o nome do piloto, e "+ km_hr +" é a velocidade média.");
 }
}

//Exercício 4:
import java.util.Scanner;
class Main {  
  public static void main(String args[]) { 
  double tulipa = 1.80;
  double cobertura = 3.5;
  double pizza = 25.00;
  double quant_tulipa;
  double quant_cobertura;
  double quant_pizza;
  double quant_pessoas;
  
  Scanner entrada = new Scanner(System.in);
  
  System.out.println("quantas tulipas foram pedidas? ");
  quant_tulipa = entrada.nextInt();

  System.out.println("quantas coberturas foram pedidas? ");
  quant_cobertura = entrada.nextInt();

  System.out.println("quantas pizzas foram pedidas? ");
  quant_pizza = entrada.nextInt();

  System.out.println("quantas pessoas estão presentes: ");
  quant_pessoas = entrada.nextInt();

  double valor_comida = ( ( tulipa*quant_tulipa) + (cobertura*quant_cobertura) + (pizza*quant_pizza));
  double valor_total = ((valor_comida * 0.1) + valor_comida); 
  double valor_pessoa = valor_total / quant_pessoas;
  
  System.out.println(" o valor total da conta foi de: R$ " + valor_total);
  System.out.println("cada pessoa terá que pagar: " + valor_pessoa);
  
  }
}


//Exercicio 5: 
import java.util.Scanner;
class Main {  
  public static void main(String args[]) { 
  int graus;
  int fahr;
  Scanner entrada = new Scanner(System.in);

  System.out.println("digite a temperatura em graus: ");
  graus = entrada.nextInt();
  
  fahr = ((graus * 9/5) + 32);

  System.out.println("o temperatura em Fahrenheit é de: "+ fahr + " graus");
 }
}

//Exercício 6:

import java.util.Scanner;
import java.lang.Math;
class Main {  
  public static void main(String args[]){
    Scanner entrada = new Scanner(System.in);

    int n1;
    
    System.out.println("digite um numero inteiro: ");
    n1 = entrada.nextInt();
    
    double triplo = n1*3; 
    double metade = n1 / 2;
    double cubica = Math.cbrt(n1);
    double potencia = Math.pow(n1,(2/3)); // está dando uma incosistencia nessa parte
    
    System.out.println("o triplo do número é: "+ triplo);
    System.out.println("a metade do número é: "+ metade);
    System.out.println("a raiz cúbica do número é: "+ cubica);
    System.out.println(" o número elevado a potencia 2/3 é igual a: "+ potencia);
  }
}


// Exercicio 7:
import java.util.Scanner;
import java.lang.Math;
class Main {  
  public static void main(String args[]){
    double x1;
    double y1;
    double x2;
    double y2;
    double x2_x1;
    double y2_y1;
    double distancia;

  Scanner entrada = new Scanner(System.in);

  System.out.println("digite o valor de x1: ");
  x1 = entrada.nextInt();

  System.out.println("digite o valor de y1: ");
  y1 = entrada.nextInt();

  System.out.println("digite o valor de x2: ");
  x2 = entrada.nextInt();

  System.out.println("digite o valor de y2: ");
  y2 = entrada.nextInt();

  x2_x1 = x2 - x1;
  y2_y1 = y2 - y1;

  distancia = Math.sqrt((Math.pow(x2_x1,2)) + (Math.pow(y2_y1,2)));

  System.out.println("o valor da distancia é de: " + distancia);

  }
}

//Exercicio 8:
import java.util.Scanner;

class Main {  
  public static void main(String args[]){

    Scanner entrada = new Scanner(System.in);

    int num;

    System.out.println("digite um numero: ");
    num = entrada.nextInt();

    System.out.println("o antecessor do numero é o: " + (num - 1)+ " e o sucessor é o: " + (num + 1));
  }
}

//Exercicio 9:
import java.util.Scanner;
import java.lang.Math;
class Main {  
  public static void main(String args[]){

    int porcen_ipi;
    int codigo_Pc1;
    int valor_Pc1;
    int quant_Pc1;
    int codigo_Pc2;
    int valor_Pc2;
    int quant_Pc2;

    Scanner entrada = new Scanner(System.in);

    System.out.println("digite o valor da porcentagem do IPI: ");
    porcen_ipi = entrada.nextInt();

    System.out.println("digite o codigo da peça 1: ");
    codigo_Pc1 = entrada.nextInt();

    System.out.println("digite o valor da peça 1: ");
    valor_Pc1 = entrada.nextInt();

    System.out.println("digite a quantidade da peça 1: ");
    quant_Pc1 = entrada.nextInt();

    System.out.println("digite o codigo da peça 2: ");
    codigo_Pc2 = entrada.nextInt();

    System.out.println("digite o valor da peça 2: ");
    valor_Pc2 = entrada.nextInt();

    System.out.println("digite a quantidade da peça 2: ");
    quant_Pc2 = entrada.nextInt();

    double calc;

    calc  = ((valor_Pc1*quant_Pc1) + (valor_Pc2*quant_Pc2) * (porcen_ipi/100 +1));


  System.out.println("segue  o valor total a ser pago: R$ " + calc);

  }
}

