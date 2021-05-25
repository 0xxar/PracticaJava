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

    public void Bienvenida(){
        System.out.println("");
        System.out.println("Bienvenido a su Sistema de Banco Central");
        System.out.println("Por favor ingrese su nombre:\n");
        setNameUser(sc.nextLine());
        System.out.println("");
        System.out.println("");
        if(!getNameUser().equals("")){
            central();
        }else{

            System.out.println("Por favor ingrese su nombre para poder avanzar!!");
            Bienvenida();
        }


    }

    public void central(){


        bandera=0;

            if(!getNameUser().equals("")){

                do{

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

                    if(response==1){
                        Consultas cs = new Consultas();
                        cs.transacciones();
                    }else if(response==2){
                        Depositos dp = new Depositos();
                        dp.transacciones();
                    }else if(response ==3){
                        Retiros rt = new Retiros();
                        rt.transacciones();


                    }else if(response == 5){

                    }else if(response == 6){
                        System.out.println("Gracias por visitarnos, vuelva pronto!!");
                        bandera=0;


                    }

                   /** switch (response){

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
                    }*/




                }while(bandera !=0);
            }else{

                System.out.println("Por favor ingrese su nombre para poder avanzar!!");
                central();
            }








    }
    public void RealizarOtraAccion(){

        Scanner sc = new Scanner(System.in);
        int response =0;
        System.out.println("Desea realizar otra accion?");
        System.out.println("1.Yes");
        System.out.println("0.No");
        response = sc.nextInt();

        if(response>=0 && response <=1){
            if(response == 1){
                central();

            }
            if(response == 0){
                System.out.println("Gracias por visitarnos,Vuelva pronto!!");

            }


        }else{

            System.out.println("Opcion escojido no disponible, por favor vuelva a intentar!!");
            RealizarOtraAccion();
        }




    }
}
