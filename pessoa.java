class pessoa{
    
  int quant_pessoa;  
    float peso;   
    float altura;
    float imc;
//pessoa px[] = new pessoa[getQuant_pessoa()];


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

/*
public void addPessoa(pessoa x){
 for(int i=0;i<=px.length-1;i++)  
  if(px[i].equals(null)){
      px[i]=x;
      break;
  px[0]=x;
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