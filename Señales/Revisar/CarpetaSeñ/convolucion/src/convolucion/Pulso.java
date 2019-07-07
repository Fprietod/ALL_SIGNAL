package Controlador;




public class Pulso
{
  private double magnitud;
  


  private int indice;
  


  public Pulso() {}
  


  public Pulso(double magnitud, int indice)
  {
    this.magnitud = magnitud;
    this.indice = indice;
  }
  
  public Pulso(double magnitud) {
    this.magnitud = magnitud;
  }
  
  public int getIndice() {
    return indice;
  }
  
  public double getMagnitud() {
    return magnitud;
  }
  
  public void setIndice(int indice) {
    this.indice = indice;
  }
  
  public void setMagnitud(double magnitud) {
    this.magnitud = magnitud;
  }
  
  public void destruir()
  {
    magnitud = 0.0D;
    indice = 0;
  }
}
