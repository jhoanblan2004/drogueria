   int total=0,tmes=0;
   double ganancias,impuestos;   
   int s=Integer.parseInt(JOptionPane.showInputDialog("digite cuantos supermercados"));
  
   for(int i=1;i<=s;i++){
       System.out.println("---------SUPERMERCADO N-"+i+"-----------");   
       String m=JOptionPane.showInputDialog("Digita en que mes estas");
   if(m.equalsIgnoreCase("Enero")){    
   for(int a=1;a<=6;a++){
   for(int b=1;b<=5;b++){   
   int ventas=Integer.parseInt(JOptionPane.showInputDialog("digite las ganancias del dia N-"+b));   
   total=total+ventas;
   }
       System.out.println("la ganancias de la semana N-"+a+" es de $"+total);
       tmes+=total;
       total=0;
   }
   ganancias=(tmes*0.16);
   impuestos=(tmes*0.19);
   System.out.println("el total de las ventas en el mes es de $"+tmes); 
   System.out.println("el total de ganancias es $"+ganancias);
       System.out.println("el total de impuestos a pagar es de $"+impuestos);
       tmes=0;
   
   }
   else if(m.equalsIgnoreCase("Febrero")){    
   for(int a=1;a<=4;a++){
   for(int b=1;b<=7;b++){   
   int ventas=Integer.parseInt(JOptionPane.showInputDialog("digite las ganancias del dia N-"+b));   
   total+=ventas;
   }
       System.out.println("la ganancias de la semana N-"+a+" es de $"+total);
       tmes+=total;
       total=0;
   }
   ganancias=(tmes*0.16);
   impuestos=(tmes*0.19);
   System.out.println("el total de las ventas en el mes es de $"+tmes); 
   System.out.println("el total de ganancias es $"+ganancias);
       System.out.println("el total de impuestos a pagar es de $"+impuestos);
   tmes=0;
   }else if(m.equalsIgnoreCase("marzo")){    
   for(int a=1;a<=6;a++){
   for(int b=1;b<=5;b++){   
   int ventas=Integer.parseInt(JOptionPane.showInputDialog("digite las ganancias del dia N-"+b));   
   total+=ventas;
   }
       System.out.println("la ganancias de la semana N-"+a+" es de $"+total);
       tmes+=total;
       total=0;
   }
   ganancias=(tmes*0.16);
   impuestos=(tmes*0.19);
   System.out.println("el total de las ventas en el mes es de $"+tmes); 
   System.out.println("el total de ganancias es $"+ganancias);
       System.out.println("el total de impuestos a pagar es de $"+impuestos);
   tmes=0;
   
   }else if(m.equalsIgnoreCase("abril")){    
   for(int a=1;a<=6;a++){
   for(int b=1;b<=5;b++){   
   int ventas=Integer.parseInt(JOptionPane.showInputDialog("digite las ganancias del dia N-"+b));   
   total+=ventas;
   }
       System.out.println("la ganancias de la semana N-"+a+" es de $"+total);
       tmes+=total;
       total=0;
   }
   ganancias=(tmes*0.16);
   impuestos=(tmes*0.19);
   System.out.println("el total de las ventas en el mes es de $"+tmes); 
   System.out.println("el total de ganancias es $"+ganancias);
       System.out.println("el total de impuestos a pagar es de $"+impuestos);
   tmes=0;
   }
   else if(m.equalsIgnoreCase("mayo")){    
  for(int a=1;a<=6;a++){
   for(int b=1;b<=5;b++){   
   int ventas=Integer.parseInt(JOptionPane.showInputDialog("digite las ganancias del dia N-"+b));   
   total+=ventas;
   }
       System.out.println("la ganancias de la semana N-"+a+" es de $"+total);
       tmes+=total;
       total=0;
   }
   ganancias=(tmes*0.16);
   impuestos=(tmes*0.19);
   System.out.println("el total de las ventas en el mes es de $"+tmes); 
   System.out.println("el total de ganancias es $"+ganancias);
       System.out.println("el total de impuestos a pagar es de $"+impuestos);
   tmes=0;
   }
   else if(m.equalsIgnoreCase("Junio")){    
   for(int a=1;a<=6;a++){
   for(int b=1;b<=5;b++){   
   int ventas=Integer.parseInt(JOptionPane.showInputDialog("digite las ganancias del dia N-"+b));   
   total+=ventas;
   }
       System.out.println("la ganancias de la semana N-"+a+" es de $"+total);
       tmes+=total;
       total=0;
   }
   ganancias=(tmes*0.16);
   impuestos=(tmes*0.19);
   System.out.println("el total de las ventas en el mes es de $"+tmes); 
   System.out.println("el total de ganancias es $"+ganancias);
       System.out.println("el total de impuestos a pagar es de $"+impuestos);
   tmes=0;
   }else if(m.equalsIgnoreCase("Julio")){    
 for(int a=1;a<=6;a++){
   for(int b=1;b<=5;b++){   
   int ventas=Integer.parseInt(JOptionPane.showInputDialog("digite las ganancias del dia N-"+b));   
   total+=ventas;
   }
       System.out.println("la ganancias de la semana N-"+a+" es de $"+total);
       tmes+=total;
       total=0;
   }
   ganancias=(tmes*0.16);
   impuestos=(tmes*0.19);
   System.out.println("el total de las ventas en el mes es de $"+tmes); 
   System.out.println("el total de ganancias es $"+ganancias);
       System.out.println("el total de impuestos a pagar es de $"+impuestos);
   tmes=0;
   }else if(m.equalsIgnoreCase("Agosto")){    
   for(int a=1;a<=6;a++){
   for(int b=1;b<=5;b++){   
   int ventas=Integer.parseInt(JOptionPane.showInputDialog("digite las ganancias del dia N-"+b));   
   total+=ventas;
   }
       System.out.println("la ganancias de la semana N-"+a+" es de $"+total);
       tmes+=total;
       total=0;
   }
   ganancias=(tmes*0.16);
   impuestos=(tmes*0.19);
   System.out.println("el total de las ventas en el mes es de $"+tmes); 
   System.out.println("el total de ganancias es $"+ganancias);
       System.out.println("el total de impuestos a pagar es de $"+impuestos);
   tmes=0;
   }else if(m.equalsIgnoreCase("Septiembre")){    
   for(int a=1;a<=6;a++){
   for(int b=1;b<=5;b++){   
   int ventas=Integer.parseInt(JOptionPane.showInputDialog("digite las ganancias del dia N-"+b));   
   total+=ventas;
   }
       System.out.println("la ganancias de la semana N-"+a+" es de $"+total);
       tmes+=total;
       total=0;
   }
   ganancias=(tmes*0.16);
   impuestos=(tmes*0.19);
   System.out.println("el total de las ventas en el mes es de $"+tmes); 
   System.out.println("el total de ganancias es $"+ganancias);
       System.out.println("el total de impuestos a pagar es de $"+impuestos);
   tmes=0;
   }else if(m.equalsIgnoreCase("Octubre")){    
 for(int a=1;a<=6;a++){
   for(int b=1;b<=5;b++){   
   int ventas=Integer.parseInt(JOptionPane.showInputDialog("digite las ganancias del dia N-"+b));   
   total+=ventas;
   }
       System.out.println("la ganancias de la semana N-"+a+" es de $"+total);
       tmes+=total;
       total=0;
   }
   ganancias=(tmes*0.16);
   impuestos=(tmes*0.19);
   System.out.println("el total de las ventas en el mes es de $"+tmes); 
   System.out.println("el total de ganancias es $"+ganancias);
       System.out.println("el total de impuestos a pagar es de $"+impuestos);
   tmes=0;
   }else if(m.equalsIgnoreCase("Noviembre")){    
 for(int a=1;a<=6;a++){
   for(int b=1;b<=5;b++){   
   int ventas=Integer.parseInt(JOptionPane.showInputDialog("digite las ganancias del dia N-"+b));   
   total+=ventas;
   }
       System.out.println("la ganancias de la semana N-"+a+" es de $"+total);
       tmes+=total;
       total=0;
   }
   ganancias=(tmes*0.16);
   impuestos=(tmes*0.19);
   System.out.println("el total de las ventas en el mes es de $"+tmes); 
   System.out.println("el total de ganancias es $"+ganancias);
       System.out.println("el total de impuestos a pagar es de $"+impuestos);
   tmes=0;
   }else if (m.equalsIgnoreCase("Diciembre")){    
 for(int a=1;a<=6;a++){
   for(int b=1;b<=5;b++){   
   int ventas=Integer.parseInt(JOptionPane.showInputDialog("digite las ganancias del dia N-"+b));   
   total+=ventas;
   }
       System.out.println("la ganancias de la semana N-"+a+" es de $"+total);
       tmes+=total;
       total=0;
   }
   ganancias=(tmes*0.16);
   impuestos=(tmes*0.19);
   System.out.println("el total de las ventas en el mes es de $"+tmes); 
   System.out.println("el total de ganancias es $"+ganancias);
       System.out.println("el total de impuestos a pagar es de $"+impuestos);
   tmes=0;
   }
   } 
    }
}

               
