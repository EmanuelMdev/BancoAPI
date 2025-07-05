package Code;

import java.util.Scanner;

public class Back {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int money;
	        System.out.println("Olá! Quanto deseja sacar?");
	        
	        money = scanner.nextInt();
	        
	        
	        while (money == 1 || money == 3) {
	        	System.out.println("Valor invalido, tente novamente");
	        	money = scanner.nextInt();
	        }
	        
	        if (money == 2) {
                System.out.println("Para o valor de " + money + " = Duas notas de 2");
            };
            
            //////////(100)//////////
            int QT100 = money / 100;
            int RQT100 = money % 100;
            
            //////////(50)//////////
            int QT50 = RQT100 / 50;
            int RQT50 = RQT100 % 50;
            
            if (RQT100 < 50) { 
            	RQT50 = RQT100;
            } else {
            	RQT50 = RQT100 % 50;
            }
            
            //////////(20)//////////
            int QT20 = RQT50 / 20;
            int RQT20 = RQT50 % 20;
            if (RQT50 < 20) {
            	RQT20 = RQT50;
            } else {
            	RQT20 = RQT50 % 20;
            }
            
            //////////(10)//////////
            int QT10 = RQT20 / 10;
            int RQT10 = RQT20 % 10;
            if (RQT20 < 10) {
            	RQT10 = RQT20;
            } else {
            	RQT10 = RQT20 % 10;
            }
            
            //////////(5)//////////
            int QT5 = RQT10 / 5;
            int RQT5 = RQT10 % 5;
            if (RQT10 < 5) {
            	RQT5 = RQT10;
            } else {
            	RQT5 = RQT10 % 5;
            }
            
            //////////(2)//////////
            int QT2 = RQT5 / 2;
            int RQT2 = RQT5 % 2;
            if (RQT5 < 2) {
            	RQT2 = RQT5;
            } else {
            	RQT2 = RQT5 % 2;
            }

            
            
            System.out.println(
            	    "Notas de 100 = " + QT100 + "\n" +
            	    "Notas de 50 = " + QT50 + "\n" +
            	    "Notas de 20 = " + QT20 + "\n" +
            	    "Notas de 10 = " + QT10 + "\n" +
            	    "Notas de 5 = " + QT5 + "\n" +
            	    "Notas de 2 = " + QT2
            	);
            
            
	        
	       
	       /*if (money % 100 == 0) {
	    	  int cem = money / 100;
	     } 
	       
	       if (money % 50 == 0){
	    	  int cin = money / 50;
	     } if (money % 20 == 0) {
	    	  int vin = money / 20; 
	     } if (money % 10 == 0) {
	    	  int dez = money / 10;
	     }if (money % 10 == 0) {
	    	  int fiv = money / 10;
	     }if (money % 10 == 0) {
	    	  int doi = money / 10;
	     }*/
	 }
}

