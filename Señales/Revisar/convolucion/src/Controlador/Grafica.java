package Controlador;

import Vista.VerGrafica;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;







public class Grafica
{
  Graphics gc;
  Graphics gx;
  Graphics gh;
  
  public Grafica() {}
  
  public void setEjes()
  {
    gc = VerGrafica.Grafica.getGraphics();
    gx = VerGrafica.GraficaXN.getGraphics();
    gh = VerGrafica.GraficaHN.getGraphics();
    

    gc.drawLine(0, VerGrafica.Grafica.getHeight() / 2, VerGrafica.Grafica.getWidth(), VerGrafica.Grafica.getHeight() / 2);
    gx.drawLine(0, VerGrafica.GraficaXN.getHeight() / 2, VerGrafica.GraficaXN.getWidth(), VerGrafica.GraficaXN.getHeight() / 2);
    gh.drawLine(0, VerGrafica.GraficaHN.getHeight() / 2, VerGrafica.GraficaHN.getWidth(), VerGrafica.GraficaHN.getHeight() / 2);
    
    gc.drawLine(VerGrafica.Grafica.getWidth() / 2, 0, VerGrafica.Grafica.getWidth() / 2, VerGrafica.Grafica.getHeight());
    gx.drawLine(VerGrafica.GraficaXN.getWidth() / 2, 0, VerGrafica.GraficaXN.getWidth() / 2, VerGrafica.GraficaXN.getHeight());
    gh.drawLine(VerGrafica.GraficaHN.getWidth() / 2, 0, VerGrafica.GraficaHN.getWidth() / 2, VerGrafica.GraficaHN.getHeight());
    
    int p = 10;
    for (int i = 0; i < 100; i++)
    {
      gc.drawLine(p, VerGrafica.Grafica.getHeight() / 2 - 2, p, VerGrafica.Grafica.getHeight() / 2 + 2);
      gx.drawLine(p, VerGrafica.GraficaXN.getHeight() / 2 - 2, p, VerGrafica.GraficaXN.getHeight() / 2 + 2);
      gh.drawLine(p, VerGrafica.GraficaHN.getHeight() / 2 - 2, p, VerGrafica.GraficaHN.getHeight() / 2 + 2);
      
      p += 10;
    }
    
    p = 5;
    for (int j = 0; j < 200; j++)
    {
      gc.drawLine(VerGrafica.Grafica.getWidth() / 2 - 2, p, VerGrafica.Grafica.getWidth() / 2 + 2, p);
      gx.drawLine(VerGrafica.GraficaXN.getWidth() / 2 - 2, p, VerGrafica.GraficaXN.getWidth() / 2 + 2, p);
      gh.drawLine(VerGrafica.GraficaHN.getWidth() / 2 - 2, p, VerGrafica.GraficaHN.getWidth() / 2 + 2, p);
      p += 5;
    }
  }
  
  public void graficarSecuencia(Funcion secuencia, Funcion secuenciaXN, Funcion secuenciaHN)
  {
    gc = VerGrafica.Grafica.getGraphics();
    gx = VerGrafica.GraficaXN.getGraphics();
    gh = VerGrafica.GraficaHN.getGraphics();
    
    gc.setColor(Color.YELLOW);
    for (int i = 0; i < secuencia.getFuncion().size(); i++) {
      gc.drawLine((int)coord_xC(((Pulso)secuencia.getFuncion().get(i)).getIndice()), VerGrafica.Grafica.getHeight() / 2, (int)coord_xC(((Pulso)secuencia.getFuncion().get(i)).getIndice()), (int)coord_yC(((Pulso)secuencia.getFuncion().get(i)).getMagnitud()));
    }
    gx.setColor(Color.GREEN);
    for (int i = 0; i < secuenciaXN.getFuncion().size(); i++) {
      gx.drawLine((int)coord_xX(((Pulso)secuenciaXN.getFuncion().get(i)).getIndice()), VerGrafica.GraficaXN.getHeight() / 2, (int)coord_xX(((Pulso)secuenciaXN.getFuncion().get(i)).getIndice()), (int)coord_yX(((Pulso)secuenciaXN.getFuncion().get(i)).getMagnitud()));
    }
    gh.setColor(Color.WHITE);
    for (int i = 0; i < secuenciaHN.getFuncion().size(); i++) {
      gh.drawLine((int)coord_xH(((Pulso)secuenciaHN.getFuncion().get(i)).getIndice()), VerGrafica.GraficaHN.getHeight() / 2, (int)coord_xH(((Pulso)secuenciaHN.getFuncion().get(i)).getIndice()), (int)coord_yH(((Pulso)secuenciaHN.getFuncion().get(i)).getMagnitud()));
    }
  }
  
  public double coord_xC(double x) {
    double real_x = x * 10.0D + VerGrafica.Grafica.getWidth() / 2;
    return real_x;
  }
  
  public double coord_yC(double y) { double real_y = -y * 5.0D + VerGrafica.Grafica.getHeight() / 2;
    
    return real_y;
  }
  
  public double coord_xX(double x) { double real_x = x * 10.0D + VerGrafica.GraficaXN.getWidth() / 2;
    return real_x;
  }
  
  public double coord_yX(double y) { double real_y = -y * 5.0D + VerGrafica.GraficaXN.getHeight() / 2;
    
    return real_y;
  }
  
  public double coord_xH(double x) { double real_x = x * 10.0D + VerGrafica.GraficaHN.getWidth() / 2;
    return real_x;
  }
  
  public double coord_yH(double y) { double real_y = -y * 5.0D + VerGrafica.GraficaHN.getHeight() / 2;
    
    return real_y;
  }
}
