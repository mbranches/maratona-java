package academy.praticando.banco.app;

import academy.praticando.banco.dominios.Cliente;
import academy.praticando.banco.dominios.Conta;
import academy.praticando.banco.servicos.Ferramentas;
import academy.praticando.banco.servicos.Vizualizers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner input = new Scanner(System.in);

        ArrayList<Conta> contas = new ArrayList<>();
        while (true) {
            Ferramentas.limparTela();
            menu.mostrarMenuExterno();
            System.out.print("Sua opção: ");
            int optionMenu = input.nextInt();
            input.nextLine();

            if (optionMenu == 1) {
                while (true) {
                    Ferramentas.limparTela();
                    menu.mostrarLogo();
                    System.out.println("CADASTRO-");
                    System.out.println("USUÁRIO " + (contas.size() + 1));
                    System.out.println();
                    System.out.print("E-mail: ");
                    String emailCliente = input.nextLine();
                    System.out.print("Senha: ");
                    String senhaCliente = input.nextLine();
                    System.out.print("Nome: ");
                    String nomeCliente = input.nextLine();
                    System.out.print("Cpf: ");
                    String cpfCliente = input.nextLine();

                    Cliente cliente = new Cliente(nomeCliente, cpfCliente, emailCliente, senhaCliente);
                    Conta conta = new Conta(cliente);
                    String resposta;
                    Vizualizers.vizualizarInformacoesCriacaoConta(cliente);
                    while (true) {
                        System.out.print("Confirmar criação de conta [S/N]? ");
                        resposta = input.nextLine().toUpperCase();

                        if (resposta.equals("S") || resposta.equals("N")) {
                            break;
                        }
                    }

                    if (resposta.equals("N")) {
                        while (true) {
                            System.out.print("Tentar Novamente[S/N]? ");
                            resposta = input.nextLine().toUpperCase();

                            if (resposta.equals("S") || resposta.equals("N")) {
                                break;
                            }
                        }

                        if (resposta.equals("S")) continue;
                        else break;

                    }

                    contas.add(conta);
                    System.out.println("Conta criada com sucesso...");
                    Thread.sleep(500);
                    break;
                }

            } else if (optionMenu == 2) {
                while (true) {
                    String option;

                    String resposta = null;
                    Ferramentas.limparTela();
                    menu.mostrarLogo();
                    System.out.println("Login-");
                    Boolean contaEncontrada = false;

                    System.out.print("E-mail: ");
                    String emailLogin = input.nextLine();
                    System.out.print("Senha: ");
                    String senhaLogin = input.nextLine();

                    Conta contaLogada = null;
                    for (Conta conta : contas) {
                        if (conta.getCliente().getEmail().equals(emailLogin) && conta.getCliente().getSenha().equals(senhaLogin)) {
                            contaEncontrada = true;
                            contaLogada = conta;

                            System.out.println("Login realizado com sucesso...");
                            Thread.sleep(500);
                        }
                    }

                    if (!contaEncontrada) {
                        System.out.println("Error! e-mail ou senha incorreta.");
                        while (true) {
                            System.out.print("Tentar Novamente[S/N]? ");
                            resposta = input.nextLine().toUpperCase();

                            if (resposta.equals("S") || resposta.equals("N")) {
                                break;
                            }
                        }

                        if (resposta.equals("N")) {
                            break;
                        } else continue;
                    }

                    //se for encontrado:
                    while (true) {
                        Ferramentas.limparTela();
                        menu.mostrarMenuBancoInterno();
                        System.out.print("Qual ação deseja realizar, " + contaLogada.getCliente().getNome() + ": ");
                        option = input.nextLine().toUpperCase();

                        if (option.equals("D")) {
                            Ferramentas.limparTela();
                            menu.mostrarLogo();
                            System.out.println("Depósito-");

                            System.out.print("Valor do depósito: R$");
                            double valorDeposito = input.nextDouble();
                            input.nextLine();
                            contaLogada.deposito(valorDeposito);

                            System.out.println("R$" + valorDeposito + " depositado.");
                            System.out.println("Saldo atual: R$" + contaLogada.getSaldo());

                        } else if (option.equals("S")) {
                            while (true) {
                                Ferramentas.limparTela();
                                menu.mostrarLogo();
                                System.out.println("Saque-");

                                System.out.print("Valor do saque: ");
                                double valorSaque = input.nextDouble();
                                input.nextLine();

                                if (valorSaque > contaLogada.getSaldo()) {
                                    System.out.println("Error! saldo insuficiente.");

                                    while (true) {
                                        System.out.print("Tentar Novamente[S/N]? ");
                                        resposta = input.nextLine().toUpperCase();

                                        if (resposta.equals("S") || resposta.equals("N")) {
                                            break;
                                        }
                                    }
                                    if (resposta.equals("N")) break;
                                    else continue;
                                }
                                contaLogada.sacar(valorSaque);
                                System.out.println("R$" + valorSaque + " sacado.");
                                System.out.println("Saldo atual: R$" + contaLogada.getSaldo());
                                break;

                            }
                        } else if (option.equals("M")) {
                            Ferramentas.limparTela();
                            menu.mostrarLogo();
                            System.out.println("Olá, " + contaLogada.getCliente().getNome() + ".-");
                            System.out.println("----------------------------------------------------------");
                            System.out.println("Seu saldo atual é: R$" + contaLogada.getSaldo());

                            System.out.println();

                        } else if (option.equals("E")) {
                            System.out.println("Saindo...");
                            Thread.sleep(500);
                            break;
                        }
                        if (option != "E") {
                            while (true) {
                                System.out.print("Digite \"voltar\" para retornar ao banco:  ");
                                String optionVoltar = input.nextLine().toLowerCase();
                                if (optionVoltar.equals("voltar")) {
                                    break;
                                }
                            }
                        }
                    }

                    if (option.equals("E")) {
                        break;
                    }
                }


            } else if (optionMenu == 3) {
                while (true) {
                    Ferramentas.limparTela();
                    menu.mostrarLogo();
                    System.out.println("Checar cliente-");

                    System.out.print("E-mail: ");
                    String emailLogado = input.nextLine();
                    System.out.print("Senha: ");
                    String senhaLogada = input.nextLine();

                    boolean clienteEncontrado = false;
                    Conta clienteLogado = null;
                    for (Conta conta : contas) {
                        if (conta.getCliente().getEmail().equals(emailLogado) && conta.getCliente().getSenha().equals(senhaLogada)) {
                            clienteEncontrado = true;
                            clienteLogado = conta;
                        }
                    }
                    System.out.println(emailLogado);
                    System.out.println(senhaLogada
                    );
                    String resposta;
                    if (!clienteEncontrado) {
                        System.out.println("Error! cliente não encontrado.");
                        while (true) {
                            System.out.print("Tentar Novamente[S/N]? ");
                            resposta = input.nextLine().toUpperCase();

                            if (resposta.equals("S") || resposta.equals("N")) {
                                break;
                            }
                        }
                        if (resposta.equals("N")) break; else continue;

                    }

                    Ferramentas.limparTela();
                    menu.mostrarLogo();
                    System.out.println("Informações da conta-");
                    System.out.println();

                    Vizualizers.vizualizarConta(clienteLogado);
                    System.out.println();

                    String SairInfo;
                    while (true) {
                        System.out.print("Digte \"sair\" para retornar ao menu :");
                        SairInfo = input.nextLine().toLowerCase();
                        if (SairInfo.equals("sair")) {
                            break;
                        }
                    }

                    break;
                }
            } else if (optionMenu == 4) {
                System.out.println("Saindo...");
                break;
            }
            }
    }
}
