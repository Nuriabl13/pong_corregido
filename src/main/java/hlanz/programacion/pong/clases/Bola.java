package hlanz.programacion.pong.clases;

import java.awt.*;
import java.util.Random;

public class Bola extends ObjetoGrafico {

    private int velocidadX;
    private int velocidadY;

    public Bola(){
        super(1920/2,1080/2,30,30,Color.WHITE);
        this.velocidadX = -5;
        this.velocidadY = 5;
    }

    public void incrementarVelocidad(){
        this.velocidadY += 3;
        this.velocidadX += 3;
    }

    public void mover(){
        if (this.getY()==0 || this.getY()==1080-30){
            this.velocidadY=this.velocidadY*-1;
        }
        this.incrementarX(this.velocidadX);
        this.incrementarY(this.velocidadY);
    }

    public void rebotarRaqueta(){
        this.incrementarVelocidad();
        this.velocidadX = this.velocidadX*-1;
        this.velocidadY+=new Random().nextInt(-3,4);
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(this.getColor());
        g.fillOval(this.getX(),this.getY(),this.getAnchura(),this.getAltura());
    }
}
