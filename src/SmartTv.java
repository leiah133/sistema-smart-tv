public class SmartTv{

    boolean ligada = false ;
    int canal = 1 ;
    int volume = 25 ;


    public void mudarCanal(int novoCanal){
        canal = novoCanal ;
                System.out.println("Canal atual: " + canal);
    };
    
    public void aumentarCanal() {
     canal++;
     System.out.println("Proximo canal: " + canal);
    };

    public void diminuirCanal() {
        canal--;
         System.out.println("Canal anterior : " + canal);
    };




    public void aumentarVolune() {
     volume++;
     System.out.println("Aumentando o volumr para " + volume);
    }
    public void diminuirVolune(){
        volume--;
         System.out.println("Diminuindo o volumr para " + volume);
    }


    public void ligar() {
            ligada = true ;
        }
    public void desligar(){
        ligada = false ;
    }
}