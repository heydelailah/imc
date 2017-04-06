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




//pegando dados
for(int i=0;i<=p1.getQuant_pessoa()-1;i++){

System.out.println("peso da "+(i+1)+"ª pessoa");
p1.setPeso(sc.nextFloat());

System.out.println("altura?");
p1.setAltura(sc.nextFloat());

p1.Icm(p1.getPeso(),p1.getAltura());

if(p1.getImc()<18.5){
System.out.println("seu icm é "+p1.getImc()+" você está muito magro!\n");
    
}
else if(p1.getImc()>25){
    System.out.println("seu icm é "+p1.getImc()+" você está muito pesado!\n");
    
}
else{
    System.out.println("seu icm é "+p1.getImc()+" você está ideal!\n");
}
}
}
}//finalizado
