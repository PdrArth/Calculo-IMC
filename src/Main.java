import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // declaração das constantes


        final double abaixo = 18.5;
        final double normal = 24.9;
        final double sobrepeso = 25.9;
        final double obs1  = 34.9;
        final double obs2 = 39.9;
        final double obs3 = 40;

        String nome =  JOptionPane.showInputDialog("Qual seu nome: ");
        String sobrenome =  JOptionPane.showInputDialog("Qual seu sobrenome: ");
        //nome e sobrenome;

        String sexo = JOptionPane.showInputDialog("Qual seu sexo: ");

        //inserir dados do tipo int para mes dia e ano de nascimento
        int mesnascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu mês de nascimento em numeral: "));
        int dianascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu dia de nascimento em numeral: "));
        int anonascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento em numeral:  "));

        // aqui ele vai imprimir o nome da pessoa com sobrenome

        String mensagem = String.format("Seja bem vindo: %s %s ",nome,sobrenome);
        JOptionPane.showMessageDialog(null,mensagem);

        // aqui ele imprime o ano de nascimento da pessoa
        String data = String.format("Você é de %d/%d/%d ",dianascimento,mesnascimento,anonascimento);
        JOptionPane.showMessageDialog(null,data);


        //começar a calcular o imc
        String msgimc = String.format("Agora vamos fazer o calculo do seu IMC");
        JOptionPane.showMessageDialog(null,msgimc);

        //inserir dados do tipo double para altura e peso
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
        Double imc = peso / (altura*altura);



        String calimc = String.format("Seu IMC é = %.2f ",imc);
        JOptionPane.showMessageDialog(null,calimc);

        //aqui ele mostra os dados coletados do imc do usuario
        if(imc < abaixo){
            String msgabaixo = String.format("Voce está abaixo do peso");
            JOptionPane.showMessageDialog(null,msgabaixo);
        }else if(imc > abaixo && imc <normal){
            String msgnormal = String.format("Voce está com peso normal");
            JOptionPane.showMessageDialog(null,msgnormal);
        } else if(imc >normal && imc < sobrepeso){
            String msgsobre = String.format("Voce está com sobre peso");
            JOptionPane.showMessageDialog(null,msgsobre);
        }else if (imc>sobrepeso && imc <obs1){
            String msgobs1 = String.format("Voce está com obesidade de grau 1");
            JOptionPane.showMessageDialog(null,msgobs1);
        }else if (imc > obs1 && imc < obs2){
            String msgobc2 = String.format("Voce está com obesidade de grau 2");
            JOptionPane.showMessageDialog(null,msgobc2);
        }else if (imc>=obs3){
            String msgobc3 = String.format("Voce com obesidade de grau 3");
            JOptionPane.showMessageDialog(null,msgobc3);
        }







    }}