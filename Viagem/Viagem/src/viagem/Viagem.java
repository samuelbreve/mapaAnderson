/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viagem;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HueBr
 */
public class Viagem {
    
    public static void main(String[] args) {
        
        Cidade cidade = new Cidade();
        Rota rota = new Rota();        
        
        //cidade.setNome(JOptionPane.showInputDialog("Qual cidade vc esta?"));
        //rota.setInicio(cidade.nome);
        
        ////rota.setDestino(JOptionPane.showInputDialog("Destino?"));
         //JOptionPane.showMessageDialog(null,"Onde voce esta?");
         
        Scanner input = new Scanner(System.in);
        System.out.println("Onde voce esta? 1 Casa Branca, 2 Vargem Grande, 3 Sao Sebastiao");
        int num = input.nextInt();
        
        switch(num){
            case 1:
                cidade.setNome("Casa Branca");
                break;
            case 2:
                cidade.setNome("Vargem Grande do Sul");
                break;
            case 3:
                cidade.setNome("Sao Sebastiao da Grama");
                break;
            case 4:
                cidade.setNome("Sao Sebastiao da Grama");
                break;
        }
        rota.setInicio(cidade.nome);
        
        System.out.println("Onde deseja ir? 1 Casa Branca, 2 Vargem Grande, 3 Sao Sebastiao");
        
        switch(num){
            case 1:
                rota.setDestino("Casa Branca");
                break;
            case 2:
                rota.setDestino("Vargem Grande do Sul");
                break;
            case 3:
                rota.setDestino("Sao Sebastiao da Grama");
                break;
            case 4:
                rota.setDestino("Sao Sebastiao da Grama");
                break;
        }
    }
    
}
