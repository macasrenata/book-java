import java.util.Date;

public class TesteFrete {
    public static void main(String[] args) {
        // Simulação de criação de um empréstimo
        Date dataRetirada = new Date();
        Date dataEntregaPrevista = new Date(System.currentTimeMillis() + 7L * 24 * 60 * 60 * 1000); // +7 dias

        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataEntregaPrevista, 1);

        // Testando as diferentes empresas de frete
        Frete empresaA = new FreteEmpresaA();
        Frete empresaB = new FreteEmpresaB();
        Frete empresaC = new FreteEmpresaC();
        Frete empresaD = new FreteEmpresaD();

        System.out.println("Frete Empresa A: R$" + emprestimo.calcularFrete(empresaA));
        System.out.println("Frete Empresa B: R$" + emprestimo.calcularFrete(empresaB));
        System.out.println("Frete Empresa C: R$" + emprestimo.calcularFrete(empresaC));
        System.out.println("Frete Empresa D: R$" + emprestimo.calcularFrete(empresaD));
    }
}
