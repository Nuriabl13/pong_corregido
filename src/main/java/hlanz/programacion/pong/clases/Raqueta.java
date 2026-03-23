package hlanz.programacion.pong.clases;

import java.awt.*;
import java.util.Random;

public class Raqueta extends ObjetoGrafico {

    private int velocidad;

    public Raqueta(Color c, int x){
        super(x,1080/2,50,new Random().nextInt(50,201),c);
        this.velocidad = new Random().nextInt(3,16);
    }

    public void moverArriba(){
        this.incrementarY(-this.velocidad);
    }

    public void moverAbajo(){
        this.incrementarY(this.velocidad);
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(this.getColor());
        g.fillRect(this.getX(),this.getY(),this.getAnchura(),this.getAltura());
    }
}