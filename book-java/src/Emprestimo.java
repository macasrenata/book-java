import java.util.Date;

public class Emprestimo {
    private Date dataRetirada;
    private Date dataEntregaPrevista;
    private Date dataEntregaRealizada;
    private int tipoFrete;

    public Emprestimo(Date dataRetirada, Date dataEntregaPrevista, int tipoFrete) {
        this.dataRetirada = dataRetirada;
        this.dataEntregaPrevista = dataEntregaPrevista;
        this.tipoFrete = tipoFrete;
    }

    public double calcularFrete(Frete frete) {
        return frete.calcular();
    }

    // Getters e setters
    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataEntregaPrevista() {
        return dataEntregaPrevista;
    }

    public void setDataEntregaPrevista(Date dataEntregaPrevista) {
        this.dataEntregaPrevista = dataEntregaPrevista;
    }

    public Date getDataEntregaRealizada() {
        return dataEntregaRealizada;
    }

    public void setDataEntregaRealizada(Date dataEntregaRealizada) {
        this.dataEntregaRealizada = dataEntregaRealizada;
    }

    public int getTipoFrete() {
        return tipoFrete;
    }

    public void setTipoFrete(int tipoFrete) {
        this.tipoFrete = tipoFrete;
    }
}
