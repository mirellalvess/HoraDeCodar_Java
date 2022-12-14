import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
    
    /*
    Exercício 1
    String planeta = "Plutão";
    System.out.println(planeta);
    */

    /*
    Exercício 2
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe seu nome: ");
    
    String nome = ler.nextLine();
    System.out.println("Olá, " + nome);
    */

    /*
    Exercício 3
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe seu nome: ");
    
    String nome = ler.nextLine();
    
    Scanner numero = new Scanner(System.in);
    System.out.println("Informe sua idade: ");
    
    String idade = numero.nextLine();
    
    System.out.println("Olá, " + nome + ". Sua idade é " + idade + ".");
    */

    /* Exercício 4 - Retângulo
    Scanner base = new Scanner(System.in);
    System.out.println("Informe o valor da base: ");

    int valor = base.nextInt();

    Scanner altura = new Scanner(System.in);
    System.out.println("Informe o valor da altura: ");

    int valor2 = altura.nextInt();

    System.out.println("O valor da área " + valor * valor2);
    */
    
    /* Exercício 4 - Quadrado
    Scanner lado = new Scanner(System.in);
    System.out.println("Informe o valor do lado: ");

    int valor = lado.nextInt();

    System.out.println("O valor da área " + valor * valor);
    */

    /* Exercício 4 - Losango
    Scanner maior = new Scanner(System.in);
    System.out.println("Informe o valor da diagonal maior: ");

    int valor = maior.nextInt();

    Scanner menor = new Scanner(System.in);
    System.out.println("Informe o valor do diagonal menor: ");

    int valor2 = menor.nextInt();

    System.out.println("O valor da área " + valor * valor2/2);
    */

    /* Exercício 4 - Trapézio
    Scanner maior = new Scanner(System.in);
    System.out.println("Informe o valor da diagonal maior: ");

    int valor = maior.nextInt();

    Scanner menor = new Scanner(System.in);
    System.out.println("Informe o valor do diagonal menor: ");

    int valor2 = menor.nextInt();

    Scanner altura = new Scanner(System.in);
    System.out.println("Informe o valor da altura: ");

    int h = altura.nextInt();

    System.out.println("O valor da área " + (valor + valor2) * h/2);
    */

    /* Exercício 4 - Paralelogramo
    Scanner base = new Scanner(System.in);
    System.out.println("Informe o valor da base: ");

    int valor = base.nextInt();

    Scanner altura = new Scanner(System.in);
    System.out.println("Informe o valor da altura: ");

    int valor2 = altura.nextInt();

    System.out.println("O valor da área " + valor * valor2);
    */

    /* Exercício 4 - Triângulo
    Scanner base = new Scanner(System.in);
    System.out.println("Informe o valor da base: ");

    int valor = base.nextInt();

    Scanner altura = new Scanner(System.in);
    System.out.println("Informe o valor da altura: ");

    int valor2 = altura.nextInt();

    System.out.println("O valor da área " + valor * valor2/2);
    */

    /* Exercício 4 - Círculo
    Scanner valor = new Scanner(System.in);
    System.out.println("Informe o valor: ");
    int numero = valor.nextInt(); 
    int raio = numero/2;
    double pi = 3.14;
    System.out.println("O valor da área " + pi * (raio * raio));
    */

    /* Exercício 5
    System.out.println("Escreva um valor:");
    Scanner valor = new Scanner(System.in);
    int numero_usuario = valor.nextInt();

    if (numero_usuario < 0) {
    System.out.println("O valor é negativo");
    }
    else if (numero_usuario > 0) {
    System.out.println("O valor é positivo");
    }
    else {
    System.out.println("O valor é 0");
    }
    */

    /* Exercício 6
    int a, b, c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor, informe três números");

    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    if (a > b && a > c) {
      System.out.println("O número maior é " + a);
    }
    else if (b > c && b > a) {
      System.out.println("O número maior é " + b);
    }
    else if (c > a && c > b) {
      System.out.println("O número maior é " + c);
    }
    */

    /* Exercício 6.1
    int a, b, c, d;
    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor, informe quatro números");

    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();

    if (a > b && a > c && a > d) {
      System.out.println("O número maior é " + a);
    }
    else if (b > c && b > d && b > a) {
      System.out.println("O número maior é " + b);
    }
    else if (c > d && c > a && c > b) {
      System.out.println("O número maior é " + c);
    }
    else {
      System.out.println("O número maior é " + d);
    }
    */

    /* Exercício 7
    int a, b, c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor, informe três números");

    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    double resultado = Math.min(a, Math.min(b, c));
    System.out.println(" A soma será de " + (a + b + c - resultado));
    */

    /* Exercício 7.1
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int maior1 = 0;
        int maior2 = 0;

        for(int i = 0; i < 5; i++){
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();

            if(numero > 0){
                if(numero > maior1){
                    if(i >= 1){
                        maior2 = maior1;
                    }
                    maior1 = numero;
                }else if(numero > maior2){
                    maior2 = numero;
                }
            }

        }
        int result = maior1 + maior2;
        System.out.println("A soma dos maiores é: " + result);
    */

     /* Exercício 8
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int numero = sc.nextInt();
        System.out.print("Digite um valor: ");
        int numero2 = sc.nextInt();

        if (numero2 <= 0) {
            System.out.print("O numero não pode ser menor ou igual a 0. Por favor, digite outro numero: ");
            numero2 = sc.nextInt();
        }
        System.out.println("O resultado da divisao é: " + (numero / numero2));
      */

      /* Exercício 9
        Scanner sc = new Scanner(System.in);
        
        int numero = 0, i, resultado;
        for( i = 1; i < 11; i++) {
            System.out.println("Informe o " + i + "número");
            numero = sc.nextInt();
            numero = numero + i;
        }
        resultado = numero / 10;
        System.out.println("A média é " + resultado);
      */

      /* Exercício 10
        Double a, b, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, informe quatro notas: ");

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
    
        Double soma = a + b + c + d;
        Double media = soma/4;

        if(media > 6) {
          System.out.println("PARABÉNS! Você foi aprovado! :D");
        }

        else {
          System.out.println("Infelizmente, você reprovou. :(");
        }
        */
      
      /* Exercício 11
          for (int i = 30; i >= 0; i--) {
              System.out.println(i);
          }
          System.out.println("CABOOOOOM");
      */

      /* Exercício 12
          for(int i = 10; i > 0; i--) {
          System.out.println(i);
          }
      */
      
      /* Exercício 13
        int valor1;
        int valor2;
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Insira um valor: ");
            valor1 = sc.nextInt();
            System.out.print("Insira outro valor: ");
            valor2 = sc.nextInt();
        }
        int numero = 0;
        int menor = valor2 - valor1;
        int media = 0;

        while(valor1 <= valor2){
            numero = numero + valor1;
            System.out.println(numero);
            valor1++;
        }

        media = numero/menor;
        System.out.println("A media aritmetica é: " + media);
      */

      /* Exercício 14
         Scanner resultado = new Scanner(System.in);
         double numero1, numero2, media = 0;
         int cont = 0;
         String conf;

        do {
            System.out.println("Informe a primeira nota:");
            numero1 = resultado.nextDouble();
            System.out.println("Informe a segunda nota:");
            numero2 = resultado.nextDouble();

            media = (numero1 + numero2)/2;

            if(media >= 6.5){
                System.out.println("Aluno aprovado, media: " + media);
                cont+=1;
            }

            else{
                System.out.println("Aluno reprovado: " + media);
            }

            System.out.println("Calcular a média de outro aluno Sim ou Nao ?");
            conf = resultado.next();
        }
        while(conf.equals("Sim"));
      */
  }
}