//simple project created by alexsyfk,docent Ana patricia M. fontes
//created on 04/04/17 01:00pm,finished at 7:55pm on 04/05/17
import java.util.Scanner;
class peso{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("informe quantas pessoas na residencia");
pessoa p1 = new pessoa();
p1.setQuant_pessoa(sc.nextInt());
pessoa px[] = new pessoa[p1.getQuant_pessoa()];


//  char esc = 27;   
  String clear = (char)27 + "[2J"; //codigo ansi para limpar a tela 
System.out.print(clear); 
  //pegando dados

int i=0;
  while(i<=p1.getQuant_pessoa()-1){
System.out.println("peso da  pessoa "+(i+1));
p1.setPeso(sc.nextFloat());

System.out.println("altura?");
p1.setAltura(sc.nextFloat());

p1.Icm(p1.getPeso(),p1.getAltura());

if(p1.getImc()<18.5){
System.out.println("seu icm eh "+p1.getImc()+" vc estah muito magro!\n");
    
}
else if(p1.getImc()>25){
    System.out.println("seu icm eh "+p1.getImc()+" vc estah muito pesado!\n");
    
}
else{
    System.out.println("seu icm eh "+p1.getImc()+" vc estah ideal!\n");
}
    ++i;
}
}
}//finalizado 06/04/17
