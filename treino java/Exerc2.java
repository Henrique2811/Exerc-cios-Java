// 2- Elabore um programa em Java que leia os salários de 10 trabalhadores de uma empresa e os armazene dentro de um vetor. Depois, em ciclos independentes: ▪ Calcule a média desses salários. ▪ Determine o maior dos salários desta empresa. ▪ Conte os salários menores que R$850,00.

import javax.swing.JOptionPane;

public class Exerc2 {
    public static void main(String[] args) {
        float [] salario = new float [10];
        float soma=0, media, maiorSal;
        int i, qte=0;
        for(i = 0; i<10; i++){
            salario[i] = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o salário do "+(i+1)+"º funcionário"));
        }
        for(i=0; i<10; i++){
            soma += salario[i];
        }
        media = soma/10;
        System.out.println("A média dos salários é: " + media);
        maiorSal = salario[0];
        for(i=0; i<10; i++){
            if(salario[i]>maiorSal)
                maiorSal = salario[i];
        }
        System.out.println("O maior salário é: " + maiorSal);
        for(i=0; i<10; i++){
            if(salario[i]<850)
                qte++;
        }
        System.out.println("A quantidade de salários menores que 850 é: " + qte);
    } 
}
