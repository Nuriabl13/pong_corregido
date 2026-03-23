package hlanz.programacion.pong.clases;

import java.awt.*;

public class JugadorOrdenadorTonto extends JugadorOrdenador {
    private boolean subir;

    public JugadorOrdenadorTonto(Color c, int x, Bola b){
        super(c,x,b);
        subir=false;
    }


    @Override
    public void realizarMovimiento() {
        if (subir){
            this.getRaqueta().moverArriba();
            if(this.getRaqueta().getY()<=0){
                this.subir=false;
            }
        }else{
            this.getRaqueta().moverAbajo();
            if (this.getRaqueta().getY()+this.getRaqueta().getAltura()>=Toolkit.getDefaultToolkit().getScreenSize().height){
                this.subir=true;
            }
        }
    }
}
