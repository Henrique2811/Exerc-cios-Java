//3- Faça um programa em Java que obtenha as notas de 10 alunos em 3 provas diferentes e mostre um relatório com o número do aluno (linha + 1) e a sua média; no final exiba a quantidade de alunos aprovados (media>=6). Utilize uma matriz 10 x 3 para armazenar as notas.//

import javax.swing.JOptionPane;
public class Exerc3 {
    public static void main(String[] args) {
        float[][] nota = new float[10][3];
        float[] media = new float[10];
        int i, j, qte=0;
        for(i=0; i<10; i++){
            float soma = 0;
            for(j=0; j<3; j++){
                nota[i][j] = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a "+(j+1)+"ª nota do "+(i+1)+"º aluno"));
                    soma += nota[i][j];
                }
                media[i] = soma/3;
                if(media[i]>6)
                    qte++;
            }
            System.out.println("Nº\tNota1\tNota2\tNota3\tMedia");
            for(i=0; i<10; i++){
                System.out.print((i+1)+"\t");
                for(j=0; j<3; j++){
                    System.out.print(nota[i][j]+"\t");
                }
                System.out.print(media[i]+"\n");
            }
            System.out.println("A quantidade de alunos aprovados é: " + qte);
        }
}