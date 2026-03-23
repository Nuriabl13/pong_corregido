package hlanz.programacion.pong.clases;

import java.awt.*;

public abstract class ObjetoGrafico {
    private int x;
    private int y;
    private int altura;
    private int anchura;
    private Color color;
    private final int RESOLUCIONX = 1920;
    private final int RESOLUCIONY = 1080;

    public ObjetoGrafico(int x, int y, int anchura, int altura, Color color){
        this.x = x;
        this.y = y;
        this.anchura = anchura;
        this.altura = altura;
        this.color = color;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getAltura() {
        return this.altura;
    }

    public int getAnchura() {
        return this.anchura;
    }

    public Color getColor() {
        return this.color;
    }

    public abstract void dibujar(Graphics g);

    public boolean colisionaCon(ObjetoGrafico o){
        boolean colisiona = true;
        if (this.getY()+this.getAltura() < o.getY()+o.getAltura()){
            colisiona = false;
        } else if (this.getY() > o.getY()+o.getAltura()) {
            colisiona = false;
        } else if ( o.getX()+o.getAnchura() < this.getX()) {
            colisiona = false;
        } else if (this.getX()+this.getAnchura() < o.getX()) {
            colisiona = false;
        }
        return colisiona;
    }

    protected void incrementarX(int x){
        if (this.getX()+x >= 0 || this.getX()+x<=this.RESOLUCIONX-this.getAnchura()){
            this.x +=x;
        }
    }

    protected void incrementarY(int y){
        if (this.getY()+y >= 0 || this.getY()+y<=this.RESOLUCIONY-this.getAltura()){
            this.y +=y;
        }
    }
}
