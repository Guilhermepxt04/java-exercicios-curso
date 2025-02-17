package edu.gui.study.decision;

import java.util.Scanner;

public class EX09 {

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hora_inicial, hora_final, duracao;

        hora_inicial = sc.nextInt();
        hora_final = sc.nextInt();

        if (hora_inicial < hora_final) {

            duracao = hora_final - hora_inicial;

            System.out.printf("O JOGO DUROU %d HORAS", duracao);

        }
        else {

            duracao = 24 - hora_inicial + hora_final;

            System.out.printf("O JOGO DUROU %d HORAS", duracao);

        }

        sc.close();
        }
}

