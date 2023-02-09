public class CanetaClass {

        String modelo;
        String cor;
        float ponta;
        int carga;
        Boolean tampada;
void status(){
    System.out.println("uma caneta " + this.cor);
    System.out.println("está tampada ? " + this.tampada);
    System.out.println("a ponta da caneta é " + this.ponta);
    System.out.println("o modelo é " + this.modelo);
    System.out.println("a carga está em " + this.carga+ "%");
}
void rabiscar(){
    if(this.tampada==true){
        System.out.println("não posso rabiscar");
    } else {
        System.out.println("estou rabiscando");
    }
}
void tampar(){
this.tampada=true;
}
void destampar(){
this.tampada=false;
}
}


