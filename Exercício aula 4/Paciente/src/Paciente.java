
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nunes
 */
public class Paciente {
    String nome;
    String rg;
    String endereço;
    String telefone;
    int anoNascimento;
    String profissao;
    
   
    
    

    public Paciente() {
    }

    public Paciente(String nome) {
        this.nome = nome;
    }
    
    
    
    public void cadastraDados(){
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        rg = JOptionPane.showInputDialog("Digite seu rg: ");
        endereço = JOptionPane.showInputDialog("Digite seu endereço: ");
        telefone = JOptionPane.showInputDialog("Digite seu telefone: ");
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));
        profissao = JOptionPane.showInputDialog("Digite sua profissão: ");
    }
    
    public void imprimeDados(){
        
        JOptionPane.showMessageDialog(null, "Dados do paciente: "
        + "\nNome: " + nome
        + "\nRg: " + rg
        + "\nEndereço: " + endereço
        + "\nTelefone: " + telefone
        + "\nAno de Nascimento: " + anoNascimento
        + "\nProfissão: " + profissao);
 
    }
    
    public int calculoIdade(){       
        int anoatual = 2020;
        return anoatual - anoNascimento;
    }
    
    
    
}
