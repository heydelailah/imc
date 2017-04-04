class pessoa{
    
  int quant_pessoa;  
    float peso;   
    float altura;
    float imc;


public void setAltura(float x){
    altura=x;
    
}


public float getAltura(){
    return altura;
    
    
}








public void setPeso(float x){
    peso=x;
    
}


public float getPeso(){
    return peso;
    
    
}

public void setQuant_pessoa(int x){
    quant_pessoa=x;
    
}

public int getQuant_pessoa(){
    
    
 return quant_pessoa;
}


public void setImc(float x){
    imc=x;
    
}

public float getImc(){
    return imc;
    
}
/*
public void addPessoa(pessoa x){
 peso ps1= new peso();
 for(int i=0;i<=quant_pessoa-1;i++)  
  if(ps1.px[i].equals(null)){
      ps1.px[i]=x;
      break;
  //px[0]=x;
  }  
}
*/


/*
void imp(){
    //for(int i=0;i<=px.length-1;i++)  
    System.out.println(px[0].getAltura());
}
*/


}