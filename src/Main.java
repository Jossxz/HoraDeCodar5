import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* 1 Atividade
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> estudantes = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome do estudante (ou 'PARE' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("PARE")) {
                break;
            }

            estudantes.add(nome);
        }

        int quantidadeEstudantes = estudantes.size();

        System.out.println("\nQuantidade de estudantes cadastrados: " + quantidadeEstudantes);
        System.out.println("Lista de estudantes cadastrados:");

        for (String estudante : estudantes) {
            System.out.println(estudante);
        }

        scanner.close(); */
        /* 2 atividade
        // Criando uma array de planetas
        String[] planetas = {"Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno"};

        // Criando um Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pedindo ao usuário que digite o nome de um planeta
        System.out.print("Digite o nome de um planeta: ");
        String planetaUsuario = scanner.nextLine();

        // Verificando se o planeta informado pelo usuário está na array
        boolean planetaEncontrado = false;
        for (String planeta : planetas) {
            if (planeta.equalsIgnoreCase(planetaUsuario)) {
                planetaEncontrado = true;
                break;
            }
        }

        // Exibindo o resultado para o usuário
        if (planetaEncontrado) {
            System.out.println("O planeta está na lista!");
        } else {
            System.out.println("O planeta não está na lista.");
        }
        // Fechando o Scanner
        scanner.close();
            /* 3 atividade
                // Criando uma array de frutas
                ArrayList<String> frutas = new ArrayList<>();
                frutas.add("Maçã");
                frutas.add("Banana");
                frutas.add("Uva");
                frutas.add("Pêra");
                frutas.add("Melancia");

                // Criando um Scanner para receber a entrada do usuário
                Scanner scanner = new Scanner(System.in);

                // Exibindo a lista de frutas ao usuário
                System.out.println("Lista de frutas disponíveis:");
                for (String fruta : frutas) {
                    System.out.println(fruta);
                }

                // Removendo frutas até que a lista esteja vazia
                while (!frutas.isEmpty()) {
                    // Pedindo ao usuário que digite o nome de uma fruta
                    System.out.print("\nDigite o nome de uma fruta para remoção (ou 'PARE' para finalizar): ");
                    String frutaUsuario = scanner.nextLine();

                    // Verificando se a fruta está na lista
                    if (frutas.contains(frutaUsuario)) {
                        frutas.remove(frutaUsuario);
                        System.out.println("Fruta foi retirada da lista.");
                    } else if (frutaUsuario.equalsIgnoreCase("PARE")) {
                        break; // Finalizando o loop se o usuário digitar 'PARE'
                    } else {
                        System.out.println("Fruta indisponível no nosso mercado.");
                    }

                    // Verificando se a lista está vazia
                    if (frutas.isEmpty()) {
                        System.out.println("Lista de compras finalizada.");
                    }
                }

                // Fechando o Scanner
                scanner.close(); */

            /*
                // 5 Atividade
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite um valor: ");
                double valor = scanner.nextDouble();

                // Verifica se o valor é positivo, negativo ou neutro
                if (valor > 0) {
                    System.out.println("O valor é positivo.");
                } else if (valor < 0) {
                    System.out.println("O valor é negativo.");
                } else {
                    System.out.println("O valor é neutro.");
                }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
            */
        /*
        //Atividade 6
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê os três valores
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        // Encontrar o maior valor usando a função Math.max()
        double maiorValor = Math.max(Math.max(valor1, valor2), valor3);

        // Imprime o maior valor
        System.out.println("O maior valor é: " + maiorValor);

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
            */
        /*
        //atividade 6.1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        System.out.print("Digite o quarto valor: ");
        double valor4 = scanner.nextDouble();

        // Encontrar o maior valor usando a função Math.max()
        double max1 = Math.max(valor1, valor2);
        double max2 = Math.max(valor3, valor4);
        double maiorValor = Math.max(max1, max2);

        // Imprime o maior valor
        System.out.println("O maior valor é: " + maiorValor);

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
            */
        //atividade 7
        /*
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê os três valores
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        // Encontrar os dois maiores valores
        double maior1 = Math.max(valor1, Math.max(valor2, valor3));
        double maior2 = 0;

        if (valor1 != maior1) {
            maior2 = Math.max(valor1, valor2);
        } else {
            maior2 = Math.max(valor2, valor3);
        }

        // Calcular e imprimir a soma dos dois maiores valores
        double somaDosDoisMaiores = maior1 + maior2;
        System.out.println("A soma dos dois maiores valores é: " + somaDosDoisMaiores);

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
            */
        /*
        //atividade 7.1
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê os cinco valores
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        System.out.print("Digite o quarto valor: ");
        double valor4 = scanner.nextDouble();

        System.out.print("Digite o quinto valor: ");
        double valor5 = scanner.nextDouble();

        // Encontrar os dois maiores valores
        double maior1 = Math.max(valor1, Math.max(valor2, Math.max(valor3, Math.max(valor4, valor5))));
        double maior2 = 0;

        if (valor1 != maior1) {
            maior2 = Math.max(valor1, Math.max(valor2, Math.max(valor3, valor4)));
        } else {
            maior2 = Math.max(valor2, Math.max(valor3, Math.max(valor4, valor5)));
        }

        // Calcular e imprimir a soma dos dois maiores valores
        double somaDosDoisMaiores = maior1 + maior2;
        System.out.println("A soma dos dois maiores valores é: " + somaDosDoisMaiores);

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
        */
        /*
        //atividade 8
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o primeiro valor
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        // Solicita e lê o segundo valor
        System.out.print("Digite o segundo valor (não pode ser zero ou negativo): ");
        double valor2 = scanner.nextDouble();

        // Verifica se o segundo valor é neutro (zero ou negativo) e solicita um novo valor
        while (valor2 <= 0) {
            System.out.println("O segundo valor não pode ser neutro. Digite um novo valor: ");
            valor2 = scanner.nextDouble();
        }

        // Realiza a divisão e imprime o resultado
        double resultadoDivisao = valor1 / valor2;
        System.out.println("O resultado da divisão é: " + resultadoDivisao);

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
        */
        /*
        //atividade 9
        Scanner scanner = new Scanner(System.in);

        // Array para armazenar os 10 valores
        double[] valores = new double[10];

        // Loop para ler os 10 valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valores[i] = scanner.nextDouble();
        }

        // Calcula a média aritmética
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        double media = soma / valores.length;

        // Exibe os números informados
        System.out.print("Números informados: ");
        for (double valor : valores) {
            System.out.print(valor + " ");
        }

        // Exibe a média aritmética
        System.out.println("\nMédia aritmética: " + media);

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close()
                */
        /*
        //atividade 10
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê as notas das 4 avaliações
        System.out.print("Digite a nota da 1ª avaliação: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da 2ª avaliação: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota da 3ª avaliação: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a nota da 4ª avaliação: ");
        double nota4 = scanner.nextDouble();

        // Calcula a média do semestre
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Exibe a média
        System.out.println("Média do semestre: " + media);

        // Verifica se o aluno foi aprovado
        if (media >= 6.0) {
            System.out.println("PARABÉNS! Você foi aprovado!");
        } else {
            System.out.println("Infelizmente, você não foi aprovado. Estude mais para a próxima!");
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
        */
        /*
        //atividade 11
        int tempo = 30;

        // Loop para a contagem regressiva
        while (tempo >= 0) {
            System.out.println("Tempo restante: " + tempo + " segundos");
            try {
                // Pausa a execução por 1 segundo (1000 milissegundos)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tempo--;
        }

        // Ao final da repetição
        System.out.println("Explosão");
                */
        /*
        //atividade 12
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        */
        /*
        //atividade 13
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê os dois números inteiros
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro (maior que o primeiro): ");
        int numero2 = scanner.nextInt();

        // Calcula a média aritmética dos dois números
        double media = (numero1 + numero2) / 2.0;
        System.out.println("A média aritmética dos dois números é: " + media);

        // Escreve todos os números inteiros entre os dois números informados
        System.out.println("Números inteiros entre " + numero1 + " e " + numero2 + ":");

        for (int i = numero1 + 1; i < numero2; i++) {
            System.out.println(i);
        }

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
        */
        /*
        //atividade 14
        Scanner scanner = new Scanner(System.in);

        int alunosAprovados = 0;

        do {
            // Lê as 6 notas do aluno
            double somaNotas = 0;
            for (int i = 1; i <= 6; i++) {
                System.out.print("Digite a nota " + i + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }

            // Calcula a média final
            double mediaFinal = somaNotas / 6;

            // Verifica se o aluno foi aprovado
            if (mediaFinal >= 6.5) {
                System.out.println("Aluno aprovado! Média final: " + mediaFinal);
                alunosAprovados++;
            } else {
                System.out.println("Aluno reprovado. Média final: " + mediaFinal);
            }

            // Pergunta se deseja calcular a média de outro aluno
            System.out.print("Calcular a média de outro aluno? (S/N): ");
            String resposta = scanner.next();

            // Verifica se a resposta é "S" para continuar o loop
        } while ("S".equalsIgnoreCase(scanner.next()));

        // Exibe a quantidade total de alunos aprovados
        System.out.println("Total de alunos aprovados: " + alunosAprovados);

        // Fecha o Scanner para evitar vazamentos de recursos
        scanner.close();
        */
        /*
        //atividade 15
                double alturaAnacleto = 1.50;
                double alturaFelisberto = 1.10;

                double crescimentoAnacleto = 0.02; // 2 centímetros por ano
                double crescimentoFelisberto = 0.03; // 3 centímetros por ano

                int anos = 0;

                while (alturaFelisberto <= alturaAnacleto) {
                    alturaAnacleto += crescimentoAnacleto;
                    alturaFelisberto += crescimentoFelisberto;
                    anos++;
                }
                System.out.println("Serão necessários " + anos + " anos para que Felisberto seja maior que Anacleto.");
                */
            }
        }
