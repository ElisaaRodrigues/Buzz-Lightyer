package poo;

import java.util.Random;

public class BuzzLightyer {

    private boolean asasFechadas;
    private boolean capaceteFechado;
    private String frases[] = new String[6];


    public BuzzLightyer() {

        asasFechadas = true;
        capaceteFechado = true;

        frases[0] = "Isto não é voar. Isto é cair, com estilo!";
        frases[1] = "Ao infinito e além!";
        frases[2] = "Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!";
        frases[3] = "Embora você tenha tentado acabar comigo, a vingança não é um ideal que promovemos no meu planeta.";
        frases[4] = "Alvo de aproximando!";
        frases[5] = "Buzz Lightyer ao seu dispor.";
    }

    public String pressFrases(){
        Random r = new Random();
        int aux = r.nextInt(6);
        return frases[aux];
    }

    public void pressCapacete(){
        if(capaceteFechado){
            capaceteFechado = false;
        }
        else{
            capaceteFechado = true;
        }
    }

    public String pressLaser(){
        return "Disparando Laser!\n";
    }

    public String pressBraço(){
        return "Golpes com o braço!\n";
    }

    public void pressAsas(){
        if(asasFechadas){
            asasFechadas = false;
        }
        else{
            asasFechadas = true;
        }
    }

    public String asas(){
        if (asasFechadas){
            return "Asas fechadas.\n";
        }
        else{
            return "Asas abertas.\n";
        }
    }

    public String capacete(){
        if (capaceteFechado){
            return "Capacete fechado.\n";
        }else{
            return "Capacete aberto.\n";
        }
    }


}
