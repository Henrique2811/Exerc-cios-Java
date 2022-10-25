// 1- Faça um programa que escreva “Parabéns!” nas melhores provas de uma disciplina com 3 alunos. O programa deve: Ler os nomes e as notas de 3 alunos Calcular a média da turma Listar os alunos tiveram nota acima da média

import javax.swing.JOptionPane;
public class Exc1 {
    public static void main(String[] args) {
        float nota[] = new float[3];
        String nome[] = new String[3];
        float media, soma = 0;
        for(int i=0; i<3; i++){
            nome[i] = JOptionPane.showInputDialog(null, "Digite o nome do "+(i+1)+"º aluno:");
            nota[i] = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a nota do aluno " + nome[i]));soma += nota[i];}
            media = soma/3;
    System.out.println("A média da turma foi: " + media);
    for(int i=0; i<3; i++){
        if(nota[i]>media)
            System.out.println("Parabéns " + nome[i]);
        }
    }
}