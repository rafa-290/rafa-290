import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class GestaoFuncionarios {
    public static boolean apresentacao (boolean d){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
                Date data = new Date();
        if(d==false){
        System.out.println("Programa iniciado em:"+formatador.format((data)));}
        else {
            System.out.println("\n Programa Finalizado em "+formatador.format(data));
        }
        return d;
         }
         public static String menu(){
             Scanner scan = new Scanner(System.in);
             String opcao = null;
             System.out.println("digite o numero da opacao desejada: 1-registrar, 2-listar,3-atualizar,4-deletar,5-remuneacao");
             System.out.println("->");
             opcao=scan.nextLine();
             return opcao;
    }
         public static void cod(){
        Scanner scan = new Scanner(System.in);
        int fim=0,i=1,calc=0,atu=0,del=0,id;
             ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
             float remunerado=0, horaTra=0,heraExt=0;
             char ctz='n';
             String[]letras = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

             String nome, cargo,remuneracao,horasTrabalhadas,horasExtras;
      while(fim<6){
        switch (menu()){
            case"1":
                Scanner inserirDados = new Scanner(System.in);
                Funcionario novoFuncionario = new Funcionario();
                System.out.println("digite o nome do funcionario");
                novoFuncionario.nome = inserirDados.nextLine();
                System.out.println("digite o cargo do funcionario");
                novoFuncionario.cargo = inserirDados.nextLine();
                System.out.println("digite  a remuneracao do funcionario");
                novoFuncionario.remuneracao = inserirDados.nextLine();
                System.out.println("digite as horas trabalhadas do funcionario");
                novoFuncionario.horasTrabalhadas = inserirDados.nextLine();
                System.out.println("digite as horas extras do funcionario");
                novoFuncionario.horasExtras = inserirDados.nextLine();
                listaFuncionarios.add(novoFuncionario);
                fim=1;
                break;
            case "2":
                for (Funcionario funcionario : listaFuncionarios){
                    System.out.println(funcionario.nome);
                    System.out.println(funcionario.cargo);
                    System.out.println(funcionario.horasExtras);
                    System.out.println(funcionario.horasTrabalhadas);
                }
            case"3":
                System.out.println("Digitar nome do funcionario");
                Scanner alterarDados = new Scanner(System.in);
                id=Integer.parseInt(alterarDados.nextLine());
                for (Funcionario funcionario: listaFuncionarios){
                    if(id==funcionario._id);
                    System.out.println("Digitar nome do funcionario");
                    nome = alterarDados.nextLine();
                    System.out.println("Digitar cargo do funcionario");
                    cargo = alterarDados.nextLine();
                    funcionario.setCargo(cargo);
                    System.out.println("Digitar remuneracao do funcionario");
                    remuneracao = alterarDados.nextLine();
                    funcionario.setCargo(remuneracao);
                    System.out.println("Digitar hora trabalhada do funcionario");
                    horasTrabalhadas = alterarDados.nextLine();
                    funcionario.setCargo(horasTrabalhadas);
                    System.out.println("Digitar hora extra do funcionario");
                    horasExtras = alterarDados.nextLine();
                    funcionario.setCargo(horasExtras);

                }

                fim=6;
                break;
            default:
                break;
        }
    }

}

           public  static void main(String[] args){
        apresentacao(false);
        cod();
        apresentacao(true);    }
}


