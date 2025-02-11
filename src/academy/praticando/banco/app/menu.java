package academy.praticando.banco.app;

public class menu {
    public static void mostrarLogo() {
        System.out.println("----------------------------------------------------------");
        System.out.println("                    BANCO BRANCHES");
        System.out.println("----------------------------------------------------------");
    }

    private static void mostrarAcoesMenuExterno() {
        System.out.println("[1]Adicionar cliente [2]Entrar [3]Checar Conta [4]Sair");
        System.out.println("----------------------------------------------------------");
    }

    public static void mostrarMenuExterno() {
        mostrarLogo();
        mostrarAcoesMenuExterno();
    }

    private static void mostrarAcoesInternas() {
        System.out.println("[D]Depositar [S]Sacar [M]Mostrar Saldo [E]Sair");
        System.out.println("----------------------------------------------------------");
    }

    public static void mostrarMenuBancoInterno() {
        mostrarLogo();
        mostrarAcoesInternas();
    }
}
