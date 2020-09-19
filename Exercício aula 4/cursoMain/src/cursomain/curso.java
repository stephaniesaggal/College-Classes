/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursomain;

import javax.swing.JOptionPane;

/**
 *
 * @author sters
 */
public class curso {
    String nome;
    int quantidadeDeAlunos;
    String turma;
    float mensalidade;

public curso() {}

public curso (String nome, int quantidadeDeAlunos, String turma, float mensalidade) {
    this.nome = nome;
    this.quantidadeDeAlunos = quantidadeDeAlunos;
    this.turma = turma;
    this.mensalidade = mensalidade;
}

public void cadastrarDados() {
    nome = JOptionPane.showInputDialog("Digite o nome do curso: ");
    quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de alunos: "));
    turma = JOptionPane.showInputDialog("Informe a turma: ");
    mensalidade = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da mensalidade: "));
}

public void imprimeDados() {
    JOptionPane.showMessageDialog(null, "Dados do Curso: " + 
            "\nNome do curso: " + nome + 
            "\nQuantidade de alunos: " + quantidadeDeAlunos + 
            "\nTurma: " + turma + "\nMensalidade: "  + mensalidade);
}

public float calculaTodaMensalidade () {
    return quantidadeDeAlunos * mensalidade;
}
}