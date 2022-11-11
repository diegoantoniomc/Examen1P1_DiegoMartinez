//Diego Martinez
package examen1p1_diegomartinez;

import java.util.Scanner;
import java.util.Random;

public class Examen1P1_DiegoMartinez {

    static Scanner read= new Scanner (System.in);
    
    public static void main(String[] args) {
        int opcion;
        do{
            System.out.println("Menu");
            System.out.println("1 -> Divisor Primos");
            System.out.println("2 -> Contorno de Piramide");
            System.out.println("3 -> Vecinos");
            System.out.println("4 -> Salida");
            System.out.println("Ingrese la opcion que dessee realizar");
            opcion=read.nextInt();
            
            switch(opcion){
                case 1:{
                    int N;
                    System.out.println("1 -> Divisor Primos");
                    System.out.println("Ingrese un numero: ");
                    N = read.nextInt();
                    while(N<1){
                        System.out.println("Numero no valido, tiene que ser mayor o igual a 1");
                        N=read.nextInt();
                    }//End While
                    System.out.println("Los Numeros primos que dividen el numero "+N+" son: "+divisor(N));
                }break;
                case 2:{
                    int t,ver;
                    System.out.println("2 -> Contorno de Piramide");
                    System.out.println("Ingrese de que tamaño quiere su piramide: ");
                    t=read.nextInt();
                    ver=t%2;
                    while (ver==0){
                        System.out.println("Numero no valido, solo se puede usar numeros impares");
                        t=read.nextInt();
                        ver=t%2;
                    }//End while
                    contorno(t);
                }break;
                case 3:{
                    String cad;
                    System.out.println("3 -> Vecinos");
                    System.out.println("Ingrese una cadena: ");
                    cad=read.next();
                    for (int i = 0; i>=cad.length()-1; i++) {
                        if(cad.charAt(i)<=97&&cad.charAt(i)>=122||cad.charAt(i)<=65&&cad.charAt(i)>=90){
                            System.out.println("Cadena no valida, ingresela otra: ");
                            cad=read.next();
                        }
                    }
                    Random ran = new Random();
                    int n = ran.nextInt(2);
                    System.out.println("Cadena resultante: " + vecinos(cad,n));;
                }break;
            }//End Switch
        }//End Do
        while (opcion!=4);
    }//End Public Static Void
    public static String divisor(int a){
        String cadena = " ";
        int cad=0;
        for (int i = 1; i < a; i++) {
           cad=a%i;
           if(cad==0){
               cadena+=i+", ";
           }//End If
        }//End For
        return cadena;
    }//End Divisor
    public static void contorno(int t){
        for (int i = 2; i <= (t+1)/2; i++) {
            for (int c =((t+1)/2)-(i-2); c >1; c--) {
                System.out.print("*");
            }//End For 2
            for (int r = i; r <=i; r++) {
                System.out.print("+");
            }//End For 3
            for (int j =1; j<i-1; j++) {
                System.out.print(" ");
            }
            for (int j =i-2; j>1; j--) {
                System.out.print(" ");
                      
            }
            if(i==2){
                
            }else{
                for (int r = i; r >=i; r--) {
                    System.out.print("+");
                }
            }
            for (int c =1; c <((t+1)/2)-(i-2); c++) {
                System.out.print("*");
            }//End For 4
            System.out.println("");
        }//End For 1
        for (int i = 0; i < t; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }//End Contorno
    public static String vecinos(String cad,int n){
        String res="";
        char r;
        int x;
        for (int i = 0; i <= cad.length()-1; i++) {
            if(n==1){
                x=cad.charAt(i)+1;
            }//End IF
            else{
                x=cad.charAt(i)-1;
            }//End Else
            r=(char)x;
            res+=""+r;
        }//End For
        return res;
    }//End Vecinos
}//End Public Class
