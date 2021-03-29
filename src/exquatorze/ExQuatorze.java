/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exquatorze;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ExQuatorze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. 
        Faça um programa que receba o valor do salário mínimo e a quantidade de quilowatts 
        gasta por uma residência. Calcule e imprima:
        a. o valor, em reais, de cada quilowatt;
        b. o valor, em reais, a ser pago por essa residência;
        c. o novo valor a ser pago por essa residência, a partir de um desconto de 15%.*/
        float minimo;//valores que serao pegos pelo teclado
        float kw;//valores que serao pegos pelo teclado
        float custo;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor do salario minimo");
        minimo = Float.parseFloat(leia.nextLine());
        System.out.println("Digite o valor de quilowatt");
        kw = Float.parseFloat(leia.nextLine());
        custo = minimo/5/100;
        System.out.println("1 kw custa R$ "+custo);
        System.out.println("O preço a ser pago é de  "+custo*kw);
        System.out.println("Com o desconto de 15% o preço fica em R$ "+custo*kw/100*85 );
    }
    
}
