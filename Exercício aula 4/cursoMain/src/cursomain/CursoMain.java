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
public class CursoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        curso c = new curso();
        
        c.cadastrarDados();
        c.imprimeDados();
        JOptionPane.showMessageDialog(null, "Total: " + c.calculaTodaMensalidade());
        
        curso c1 = new curso("ADS", 30, "A", 400);
        
        c1.imprimeDados();
        JOptionPane.showMessageDialog(null, "Total: " + c1.calculaTodaMensalidade());
    }
    
}
