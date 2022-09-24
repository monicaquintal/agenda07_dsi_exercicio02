package atividade2_fichario_dsi_agenda07;

import javax.swing.JOptionPane;

public class Atividade2_fichario_dsi_agenda07 {
   
    public static void main(String[] args) {
        // declaração de variáveis
        int numero = 0; // declarando variavel como inteira e iniciando sua contagem no valor zero
        int resultado, tabuada; // variavel para armazenar o resultado do cálculo e o número da tabuada (inserido pelo usuário)
        String auxiliar; // variável para conversão (Integer.parseInt)
        
       JOptionPane.showMessageDialog(null, "Bem vindo à tabuada da Giovanna!");
       
       // conversão do tipo String para inteiro
       auxiliar = JOptionPane.showInputDialog(null, "Qual tabuada você gostaria de saber?");
       
       //conversão do tipo string para inteiro
        tabuada = Integer.parseInt(auxiliar);
        
        for (int i = 0; i <= 10; i++) { // laço de repetição for
        resultado = numero * tabuada; //processamento
        numero += 1;
        
        //mensagem de saída
        JOptionPane.showMessageDialog(null, tabuada + " vezes " + i + " é igual a: " + resultado + "!");    
    } // fim do laço de repetição for
  } // fim do método main
} // fim da classe
