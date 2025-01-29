package model;

public class Cliente {

    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;


    public Cliente() {
    }

    public Cliente(Integer numero, Double saldo, String nomeCliente, String agencia) {
        this.numero = numero;
        this.saldo = saldo;
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}

