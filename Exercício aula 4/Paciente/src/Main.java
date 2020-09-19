
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
public class Main {
    public static void main(String[] args) {
        Paciente p = new Paciente();
        
        p.cadastraDados();
        p.imprimeDados();
        JOptionPane.showMessageDialog(null, "Idade: " + p.calculoIdade());
        
        
        Paciente p1 = new Paciente(){};
        
        p1.nome = "Eu sou você!";
        p1.rg = "00000000";
        p1.endereço = "Minha casa";
        p1.telefone = "40028922";
        p1.anoNascimento = 2001;
        p1.profissao = "bibliotecária";
        
        p1.imprimeDados();
        JOptionPane.showMessageDialog(null, "Idade: " + p1.calculoIdade());
        
    }
}
