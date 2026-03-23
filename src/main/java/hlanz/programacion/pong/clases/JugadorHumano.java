package hlanz.programacion.pong.clases;

import bpc.daw.consola.Teclado;

import java.awt.*;

public class JugadorHumano extends Jugador {

    private int teclaArriba;
    private int teclaAbajo;
    private Teclado teclado;

    public JugadorHumano(Teclado t, Color c,int x,int tAr,int tAb){
        super(c,x);
        this.teclaAbajo=tAb;
        this.teclaArriba=tAr;
        this.teclado=t;
    }

    public int getTeclaArriba() {
        return this.teclaArriba;
    }

    public int getTeclaAbajo() {
        return this.teclaAbajo;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    @Override
    public void realizarMovimiento() {
        if(this.teclado.teclaPulsada(this.teclaAbajo)){
            this.getRaqueta().moverAbajo();
        }

        if(this.teclado.teclaPulsada(this.teclaArriba)){
            this.getRaqueta().moverArriba();
        }
    }
}
