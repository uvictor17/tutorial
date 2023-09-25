

package com.mycompany.estaciones;

import java.util.Scanner;
public class Estaciones {

    public static void main(String[] args) {
    int mes;
      int dia;  
   int regresar = 1;
   
       while(regresar==1){
     
     System.out.println("En que mes naciste");
     System.out.println("-------------------");
     System.out.println("1)Enero");
     System.out.println("2)Febrero");
     System.out.println("3)Marzo");
     System.out.println("4)Abril");
     System.out.println("5)Mayo");
     System.out.println("6)Junio");
     System.out.println("7)Julio");
     System.out.println("8)Agosto");
     System.out.println("9)Septiembre");
     System.out.println("10)Octubre");
     System.out.println("11)Noviembre");
     System.out.println("12)Diciembre");
     System.out.println("-------------------");
     
        Scanner sc=new Scanner(System.in);
        System.out.println("Selecciona tu mes");
        mes=sc.nextInt();
        if (mes>12){
            System.out.println("El mes no existe papu :v");
             System.out.println("Ingresa de nuevo el mes");
                mes=sc.nextInt();
        }else if(mes<1){
             System.out.println("El mes no existe papu :v");
              System.out.println("Ingresa de nuevo el mes");
                mes=sc.nextInt();
        }
        System.out.println("Que dia naciste");
        dia=sc.nextInt();
       
        switch(mes){
            case 1:
                if(mes==1){
                }if(dia>0 && dia<32){
                   } else if(dia>31){
                System.out.println("El dia "+dia+" no existe");
                System.out.println("Ingresa de nuevo el dia");
                dia=sc.nextInt();
        }if(dia<1){
             System.out.println("El dia "+dia+" no existe");
               System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
             
        }
           System.out.println("Naciste el "+dia+" "+"de Enero eres de invierno");
        break;
            case 2:
        if(mes==2){
             }if(dia>0 && dia<29){
                   } else if(dia>28){
                System.out.println("El dia "+dia+" no existe");  
                   System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
        }if(dia<1){
             System.out.println("El dia "+dia+" no existe");  
                System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
        }
        System.out.println("Naciste el "+dia+" "+"de Febrero eres de invierno");
        break;
            case 3:
        if(mes==3){
             }if(dia>0 && dia<32){
                   } else if(dia>31){
                System.out.println("El dia "+dia+" no existe");
                 System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
        }if(dia<1){
             System.out.println("El dia "+dia+" no existe");  
              System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
        }if (dia>19 && dia<32){
             System.out.println("Naciste el "+dia+" "+"de Marzo eres de primavera");
        }else if(dia>0 && dia<20){
                System.out.println("Naciste el "+dia+" "+"de Marzo eres de invierno");
                 
        }
       
        break;
            case 4:
        if(mes==4){
             }if(dia>0 && dia<31){
                   } else if(dia>30){
                System.out.println("El dia "+dia+" no existe");  
                 System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
        }if(dia<1){
             System.out.println("El dia "+dia+" no existe");
              System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
        }
         System.out.println("Naciste el "+dia+" "+"de Abril eres de Primavera");
        break;
            case 5:
        if(mes==5){
          }if(dia>0 && dia<32){
                   } else if(dia>31){
                System.out.println("El dia "+dia+" no existe");
                System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
        }if(dia<1){
             System.out.println("El dia "+dia+" no existe");
             System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
        }
          System.out.println("Naciste el "+dia+" "+"de Mayo eres de Primavera");
        break;
            case 6:
        if(mes==6){
             }if(dia>0 && dia<31){
                   } else if(dia>30){
                System.out.println("El dia "+dia+" no existe");
                System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
        }if(dia<1){
             System.out.println("El dia "+dia+" no existe");  
             System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
        }if (dia>20 && dia<31){
             System.out.println("Naciste el "+dia+" "+"de Junio eres de Verano");
        }else if(dia>0 && dia<21){
                System.out.println("Naciste el "+dia+" "+"de Junio eres de Primavera");
        }
        break;
            case 7:
        if(mes==7){
            }if(dia>0 && dia<32){
                   } else if(dia>31){
                System.out.println("El dia "+dia+" no existe");  
                System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
        }if(dia<1){
             System.out.println("El dia "+dia+" no existe");  
             System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
        }
         System.out.println("Naciste el "+dia+" "+"de Julio eres de Verano");
        break;
            case 8:
        if(mes==8){
          }if(dia>0 && dia<32){
                   } else if(dia>31){
                System.out.println("El dia "+dia+" no existe");  
                System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
        }if(dia<1){
             System.out.println("El dia "+dia+" no existe");  
             System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
        }
         System.out.println("Naciste el "+dia+" "+"de Agosto eres de Verano");
        break;
            case 9:
        if(mes==9){
           }if(dia>0 && dia<31){
                   } else if(dia>30){
                System.out.println("El dia "+dia+" no existe");  
                 System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
        }if(dia<1){
             System.out.println("El dia "+dia+" no existe");  
              System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
        }if (dia>22 && dia<32){
             System.out.println("Naciste el "+dia+" "+"de Septiembre eres de Otoño");
        }else if(dia>0 && dia<23){
                System.out.println("Naciste el "+dia+" "+"de Septiembre eres de Verano");
        }
    break;
            case 10:
    if(mes==10){
           }if(dia>0 && dia<32){
                   } else if(dia>31){
                System.out.println("El dia "+dia+" no existe");
                 System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
        }if(dia<1){
             System.out.println("El dia "+dia+" no existe");
              System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
        }
         System.out.println("Naciste el "+dia+" "+"de Octubre eres de Otoño");
        break;
            case 11:
        if(mes==11){
         }if(dia>0 && dia<31){
                   } else if(dia>30){
                System.out.println("El dia "+dia+" no existe");  
                   System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
        }if(dia<1){
             System.out.println("El dia "+dia+" no existe");
                System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
        }
        System.out.println("Naciste el "+dia+" "+"de Noviembre eres de Otoño");
        break;
            case 12:
        if(mes==12){
         }if(dia>0 && dia<32){
             } if(dia>31){
                System.out.println("El dia "+dia+" no existe");  
                 System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
        }else if(dia<1){
             System.out.println("El dia "+dia+" no existe");  
              System.out.println("Ingresa de nuevo el dia");
             dia=sc.nextInt();
       
              }if (dia>20 && dia<32){
             System.out.println("Naciste el "+dia+" "+"de Diciembre eres de Invierno");
        }else if(dia>0 && dia<21){
                System.out.println("Naciste el "+dia+" "+"de Diciembre eres de Otoño");
        }
           
       break;
    }
           System.out.println("Deseas regresar?1.si/2.no");
           regresar=sc.nextInt();
}
}
 
}
    

