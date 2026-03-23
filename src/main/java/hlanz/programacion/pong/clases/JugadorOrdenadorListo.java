package hlanz.programacion.pong.clases;

import java.awt.*;

public class JugadorOrdenadorListo extends JugadorOrdenador {

    public JugadorOrdenadorListo(Color c, int x, Bola b){
        super(c,x,b);
    }

    @Override
    public void realizarMovimiento() {
        int bolY=this.getBola().getY();
        int raqY=this.getRaqueta().getY();

        if (bolY>raqY){
            this.getRaqueta().moverAbajo();
        }
        if (bolY<raqY){
            this.getRaqueta().moverArriba();
        }
    }
}
