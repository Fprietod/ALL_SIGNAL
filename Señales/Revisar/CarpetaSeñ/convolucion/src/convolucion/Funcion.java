package Controlador;

import java.io.PrintStream;
import java.util.ArrayList;


public class Funcion
{
  public Funcion() {}
  
  private final ArrayList<Pulso> secuencia = new ArrayList();
  
  public ArrayList<Pulso> getFuncion() {
    return secuencia;
  }
  
  public void ingresarPulsos(Pulso unPulso) {
    secuencia.add(unPulso);
  }
  
  public void imprimirLista() {
    System.out.println(secuencia.size());
    for (int n = 0; n < secuencia.size(); n++) {
      System.out.println("Magnitud: " + (float)((Pulso)secuencia.get(n)).getMagnitud() + " Indice n: " + ((Pulso)secuencia.get(n)).getIndice());
    }
  }
  
  public void destruir() {
    secuencia.clear();
  }
  
  public ArrayList<Pulso> getSecuencia() {
    return secuencia;
  }
  




  public void creaPeriodos(Funcion periodica)
  {
    int q = periodica.getSecuencia().size();
    int[] yum = new int[q + 1];
    double[] yam = new double[q + 1];
    System.out.println("secuencias");
    for (int j = 0; j < q; j++)
    {

      Pulso jk = (Pulso)periodica.getSecuencia().get(j);
      int tr = jk.getIndice();
      double fr = jk.getMagnitud();
      yum[j] = tr;
      yam[j] = fr;
      System.out.println(yum[j] + " " + yam[j]);
    }
    if (yum[(q - 1)] >= 0)
    {
      for (int i = 1; i < 20; i++) {
        for (int we = 0; we < q; we++) {
          Pulso gy = new Pulso(yam[we], yum[we] + i * q);
          periodica.ingresarPulsos(gy);
          Pulso g = new Pulso(yam[we], yum[we] - i * q);
          periodica.ingresarPulsos(g);
        }
      }
    }
    q = periodica.getSecuencia().size();
    for (int tr = 0; tr < q; tr++)
    {

      Pulso nm = (Pulso)periodica.getSecuencia().get(tr);
      int ind = nm.getIndice();
      double mag = nm.getMagnitud();
      System.out.println(ind + "_" + mag);
    }
  }
  



  public void creaSecuencia(Funcion ingresada)
  {
    int tamaño = ingresada.getSecuencia().size();
    for (int i = 0; i < tamaño; i++)
    {

      Pulso a = (Pulso)ingresada.getSecuencia().get(i);
      double magnitud = a.getMagnitud();
      
      int in = a.getIndice();
      System.out.print("Magnitud: " + magnitud + " indice: " + in);
    }
  }
  



  public void secu(String str, Funcion ingresada)
  {
    int cont = 0;int b = 0;
    
    String[] arreglo = str.split(",");
    for (int i = 0; i < arreglo.length; i++)
    {
      cont++;
      if (arreglo[i].contains("*"))
      {
        b = cont;
        arreglo[i] = arreglo[i].replace("*", "\000");
      }
    }
    b = (b - 1) * -1;
    for (int i = 0; i < cont; i++)
    {
      Pulso a = new Pulso(Double.parseDouble(arreglo[i]), b);
      b++;
      ingresada.ingresarPulsos(a);
    }
  }
  




  public String secu(String str, Funcion secResultado, int indiceConv)
  {
    int cont = 0;int b = 0;
    
    String[] arreglo = str.split(",");
    for (int i = 0; i < arreglo.length; i++)
    {
      cont++;
      if (arreglo[i].contains("*"))
      {
        b = cont;
        arreglo[i] = arreglo[i].replace("*", "\000");
      }
    }
    b = (b - 1) * -1;
    int u = indiceConv;
    for (int i = 0; i < cont; i++)
    {
      Pulso a = new Pulso(Double.parseDouble(arreglo[i]), indiceConv);
      indiceConv++;
      secResultado.ingresarPulsos(a);
    }
    String cadConvolucion = "";
    int q = secResultado.getSecuencia().size();
    int[] yum = new int[q + 1];
    double[] yam = new double[q + 1];
    System.out.println("secuencia");
    for (int j = 0; j < q; j++)
    {


      Pulso jk = (Pulso)secResultado.getSecuencia().get(j);
      int tr = jk.getIndice();
      double fr = jk.getMagnitud();
      yum[j] = tr;
      yam[j] = fr;
      System.out.println(yum[j] + " " + yam[j]);
    }
    
    if (yum[(q - 1)] < 0)
    {
      secResultado.destruir();
      for (int we = 0; we < q; we++)
      {
        Pulso gy = new Pulso(yam[we], yum[we] + q);
        secResultado.ingresarPulsos(gy);
      }
    }
    q = secResultado.getSecuencia().size();
    for (int i = 0; i < q; i++)
    {

      Pulso a = (Pulso)secResultado.getSecuencia().get(i);
      double h = a.getMagnitud();
      int in = a.getIndice();
      if (in == 0) {
        cadConvolucion = cadConvolucion + h + "*,";
      }
      else {
        cadConvolucion = cadConvolucion + h + ",";
      }
    }
    System.out.println(cadConvolucion);
    return cadConvolucion;
  }
  
  public String[] arreglo(String str) { int cont = 0;int b = 0;
    
    String[] arreglo = str.split(",");
    for (int i = 0; i < arreglo.length; i++)
    {
      cont++;
      System.out.print(arreglo[i] + " ");
      if (arreglo[i].contains("*"))
      {
        b = cont;
        arreglo[i] = arreglo[i].replace("*", "\000");
        System.out.print(arreglo[i] + " ");
      }
      System.out.println(cont + "," + b);
    }
    return arreglo;
  }
  


  public int regresaIndice(String a)
  {
    int cont = 0;int b = 0;
    
    String[] arreglo = a.split(",");
    for (int i = 0; i < arreglo.length; i++)
    {
      cont++;
      if (arreglo[i].contains("*"))
      {
        b = cont;
        arreglo[i] = arreglo[i].replace("*", "\000");
      }
    }
    return (b - 1) * -1;
  }
  
  public double[][] creaMatriz(int tam) { double[][] matriz = new double[tam][tam];
    for (int i = 0; i < tam; i++) {
      for (int j = 0; j < tam; j++) {
        matriz[i][j] = 0.0D;
      }
    }
    return matriz;
  }
  
  public double[][] creaMatriz(int tam, String[] mat) { double[][] matriz = new double[tam][1];
    int tamSec = mat.length;
    for (int i = 0; i < tam; i++)
      if (i < tamSec)
        matriz[i][0] = Double.parseDouble(mat[i]);
    return matriz;
  }
  
  public double[][] llenaMatriz(double[][] mat, String[] secuencia, int tam) { double[][] matriz = mat;
    int aux = tam - secuencia.length;
    
    String[] mataux = new String[secuencia.length + aux];
    for (int i = 0; i < mataux.length; i++)
    {
      if (i < secuencia.length) {
        mataux[i] = secuencia[i];
      } else {
        mataux[i] = "0";
      }
    }
    for (int i = 0; i < tam; i++) {
      for (int j = 0; j < tam; j++)
      {
        matriz[j][i] = Double.parseDouble(mataux[j]);
      }
      mataux = rotar(mataux);
      System.out.print("\n");
    }
    

    return matriz;
  }
  
  public String[] rotar(String[] vector) {
    String guardoultimo = vector[(vector.length - 1)];
    for (int i = vector.length - 1; i > 0; i--)
    {
      vector[i] = vector[(i - 1)];
    }
    vector[0] = guardoultimo;
    return vector;
  }
  
  public String multiplicar(double[][] mat1, double[][] mat2, int tam) { double[] mataux = new double[tam];
    int suma = 0;
    for (int i = 0; i < tam; i++) {
      System.out.print(mat2[i][0] + " ");
    }
    System.out.print("\n--------\n");
    for (int i = 0; i < tam; i++) {
      for (int j = 0; j < tam; j++)
        System.out.print(mat1[i][j] + " ");
      System.out.print("\n");
    }
    for (int i = 0; i < tam; i++) {
      mataux[i] = 0.0D;
      for (int j = 0; j < tam; j++) {
        mataux[i] += mat1[i][j] * mat2[j][0];
      }
    }
    String res = "";
    for (int i = 0; i < tam; i++) {
      if (i == tam - 1) {
        res = res + mataux[i];
      }
      else {
        res = res + mataux[i] + ",";
      }
    }
    return res;
  }
  
  public String agrupar(String secuencia, int N) { String[] arr = secuencia.split(",");
    int tam = arr.length;
    int resto = tam % N;
    double[] arraux = new double[N];
    if (resto == 0) {
      int numdiv = tam / N;
      int aux = 0;
      while (aux < N) {
        arraux[aux] = Double.parseDouble(arr[aux]);
        for (int i = 1; i <= numdiv - 1; i++)
          arraux[aux] += Double.parseDouble(arr[(aux + N * i)]);
        aux++;
      }
    }
    else {
      double[][] mat = creaMatriz(arr.length + N - resto, arr);
      int numdiv = mat.length / N;
      int aux = 0;
      
      while (aux < N) {
        arraux[aux] = mat[aux][0];
        for (int i = 1; i <= numdiv - 1; i++)
          arraux[aux] += mat[(aux + N * i)][0];
        aux++;
      }
    }
    String res = "";
    for (int i = 0; i < arraux.length; i++) {
      if (i == arraux.length - 1) {
        res = res + arraux[i];
      } else
        res = res + arraux[i] + ",";
    }
    return res;
  }
}
