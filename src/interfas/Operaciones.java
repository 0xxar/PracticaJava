package interfas;

import java.util.Scanner;

public abstract class Operaciones {


    Scanner sc = new Scanner(System.in);
    private static double saldo;
    private static String nameUser;
    private double retiro;
    private double deposito;
    int bandera =0;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        Operaciones.saldo = saldo;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        Operaciones.nameUser = nameUser;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public abstract void transacciones();

    public void central(){
        do{
            System.out.println("");
            System.out.println("Bienvenido a su Sistema de Banco Central");
            System.out.println("Por favor ingrese su nombre:\n");
            setNameUser(sc.nextLine());
            System.out.println("");
            System.out.println("");
            if(!getNameUser().equals("")){

                do{
                    bandera=1;
                    int response =0;
                    System.out.println("");
                    System.out.println("Bievenido Sr@ "+getNameUser()+" por favor escoja una de las opciones:");
                    System.out.println("1.Consulta de balance");
                    System.out.println("2.Realizar deposito");
                    System.out.println("3.Realizar retiro");
                    System.out.println("4.Realizar Transferencia");
                    System.out.println("5.Consulta Historial de Transacciones");
                    System.out.println("6.Salir del sistema");

                    response = sc.nextInt();

                    switch (response){

                        case 1:
                            Consultas cs = new Consultas();
                            cs.transacciones();
                            break;
                        case 2:
                            Depositos dp = new Depositos();
                            dp.transacciones();
                            break;
                        case 3:
                            Retiros rt = new Retiros();
                            rt.transacciones();
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            System.out.println("Gracias por visitarnos, vuelva pronto!!");
                            bandera=6;
                            break;
                        default:
                            System.out.println("Opcion escojido de habilitada, por favor vuelva a intentar!!");
                            bandera =1;
                    }




                }while(bandera !=6);
            }


        }while(getNameUser().equals(""));





    }
    public void RealizarOtraAccion(){

        Scanner sc = new Scanner(System.in);
        int response =0;
        System.out.println("Desea realizar otra accion?");
        System.out.println("1.Yes");
        System.out.println("0.No");
        response = sc.nextInt();

        if(response == 1){
            central();
            bandera=1;

        }
        if(response == 0){
            central();
            bandera=0;


        }


    }
}
