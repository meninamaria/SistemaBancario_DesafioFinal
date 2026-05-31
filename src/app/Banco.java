package app;

import java.util.Scanner;

public class Banco {
    public static void main() {
        Scanner resposta = new Scanner(System.in);

        int opcaoMenu1 = 0;
        int opcaoMenu2 = 0;
        double saldoCliente, sacar, depositar;
        int numConta;
        String nomeTitular;
        int alguemCadastrado = 0;

        System.out.println("------------------\nBanco Lalua\n------------------");

        while (true) {
            System.out.println("      Menu\n[1] Criar conta\n[2] Sair\n------------------");
            System.out.print("Opção: ");
            opcaoMenu1 = resposta.nextInt();

            if ((opcaoMenu1 != 1 ) && (opcaoMenu1 != 2)) {
                System.out.println("Opção inválida! Tente novamente.");
            } else {
                if (opcaoMenu1 == 1) {
                    System.out.println("Criar Conta\n------------------");
                    System.out.print("Digite o número da conta: ");
                    numConta = resposta.nextInt();

                    System.out.print("Digite seu nome: ");
                    nomeTitular = resposta.next();

                    System.out.print("Informe seu saldo atual: R$ ");
                    resposta.nextLine();
                    saldoCliente = resposta.nextDouble();

                    Cadastro cadastroPessoa = new Cadastro(numConta, nomeTitular, saldoCliente);

                    System.out.println("Seja bem-vindo(a) ao Banco Lalua!");
                    ++alguemCadastrado;
                    GerenciamentoBanco gerenciar = new GerenciamentoBanco();

                    System.out.println("--------Menu--------\n[1] Consultar Saldo\n[2] Sacar\n[3] Depositar\n[4] Sair\n--------------------");
                    System.out.print("Opção: ");
                    opcaoMenu2 = resposta.nextInt();

                    while (true) {

                        if (opcaoMenu2 == 1) {
                            System.out.println("O seu saldo é R$ " + cadastroPessoa.getSaldo());

                        } else if (opcaoMenu2 == 2) {
                            System.out.print("Deseja sacar quanto? R$ ");
                            sacar = resposta.nextDouble();

                            if (sacar > cadastroPessoa.getSaldo()) {
                                System.out.println("Saldo insuficiente!");

                            } else {
                                cadastroPessoa.setSaldo(gerenciar.sacarDinheiro(cadastroPessoa.getSaldo(), sacar));
                            }

                        } else if (opcaoMenu2 == 3) {
                            System.out.print("Deseja depositar quanto? R$ ");
                            depositar = resposta.nextDouble();

                            cadastroPessoa.setSaldo(gerenciar.depositarDinheiro(cadastroPessoa.getSaldo(), depositar));

                        } else if (opcaoMenu2 == 4) {
                            System.out.println("Saindo da conta...");
                            break;

                        } else {
                            System.out.println("Opção inválida!");
                        }

                        System.out.println("--------Menu--------\n[1] Consultar Saldo\n[2] Sacar\n[3] Depositar\n[4] Sair\n--------------------");
                        System.out.print("Opção: ");
                        opcaoMenu2 = resposta.nextInt();

                    }

                }  else if (opcaoMenu1 == 2) {
                    System.out.println("Saindo do Banco Lalua...");
                    System.exit(0);

                } else {
                    if (opcaoMenu2 != 4) {
                        System.out.println("Opção inválida! Tente novamente.");
                    }

                }
            }


        }

    }
}