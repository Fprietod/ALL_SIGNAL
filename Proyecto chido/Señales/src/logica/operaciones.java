/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Felipe,Daniel,Esau
 */
public class operaciones {

    public double[] reflejo(double[] muestras, int origen) {
        double[] reflejadas = new double[1 + muestras.length];
        double or = 0;
        for (int i = 0; i < muestras.length; i++) {
            reflejadas[i] = muestras[(muestras.length) - 1 - i];
            if (i == origen) {
                or = (muestras.length) - 1 - i;
            }
        }
        reflejadas[muestras.length] = or;
        return reflejadas;
    }

    public int desplazamiento(double[] muestras, int origen, int desplazamiento) {
        return origen + desplazamiento;
    }

    public double[] interpolacionLineal(double[] muestras, int origen, int interpolacion) {
        double[] interpoladas = new double[interpolacion * muestras.length];
        for (int i = 0; i < muestras.length; i++) {
            if (i < muestras.length - 1) {
                interpoladas[interpolacion * i] = muestras[i];
                for (int j = 0; j < interpolacion - 1; j++) {
                    interpoladas[interpolacion * i + j + 1] = muestras[i] - (j + 1) * (muestras[i] - muestras[i + 1]) / interpolacion;
                }
            } else {
                interpoladas[interpolacion * i] = muestras[i];
                for (int j = 0; j < interpolacion - 1; j++) {
                    interpoladas[interpolacion * i + j + 1] = muestras[i] - (j + 1) * (muestras[i] - 0) / interpolacion;
                }
            }
        }
        return interpoladas;
    }

    public double[] interpolacionCero(double[] muestras, int origen, int interpolacion) {
        double[] interpoladas = new double[interpolacion * muestras.length];
        for (int i = 0; i < muestras.length; i++) {
            if (i < muestras.length - 1) {
                interpoladas[interpolacion * i] = muestras[i];
                for (int j = 0; j < interpolacion - 1; j++) {
                    interpoladas[interpolacion * i + j + 1] = 0;
                }
            } else {
                interpoladas[interpolacion * i] = muestras[i];
                for (int j = 0; j < interpolacion - 1; j++) {
                    interpoladas[interpolacion * i + j + 1] = 0;
                }
            }
        }
        return interpoladas;
    }

    public double[] interpolacionEscalar(double[] muestras, int origen, int interpolacion) {
        double[] interpoladas = new double[interpolacion * muestras.length];
        for (int i = 0; i < muestras.length; i++) {
            if (i < muestras.length - 1) {
                interpoladas[interpolacion * i] = muestras[i];
                for (int j = 0; j < interpolacion - 1; j++) {
                    interpoladas[interpolacion * i + j + 1] = muestras[i];
                }
            } else {
                interpoladas[interpolacion * i] = muestras[i];
                for (int j = 0; j < interpolacion - 1; j++) {
                    interpoladas[interpolacion * i + j + 1] = muestras[i];
                }
            }
        }
        return interpoladas;
    }

    public double[] diezmacion(double[] muestras, int origen, int diezmacion) {
        int extra = 1;
        if ((origen) % diezmacion == 0) {
            extra = 2;
        }
        double[] diezmadas;
        if (diezmacion <= muestras.length) {
            diezmadas = new double[extra + ((muestras.length) / diezmacion)];
        } else {
            diezmadas = new double[2];
        }
        int k = 0;
        System.out.println(diezmadas.length);
        for (int i = 0; i < muestras.length; i++) {
            if ((i - origen) % diezmacion == 0) {
                System.out.println(muestras[i] + " " + i);
                if (i - origen == 0) {
                    diezmadas[diezmadas.length - 1] = k;
                }
                diezmadas[k] = muestras[i];
                k++;
            }
        }
        return diezmadas;
    }

    public double[] amplificacion(double[] muestras, double amplificacion) {
        double[] amplificada = new double[muestras.length];
        for (int i = 0; i < muestras.length; i++) {
            amplificada[i] = muestras[i] * amplificacion;
        }
        return amplificada;
    }

    public double[] atenuacion(double[] muestras, double atenuacion) {
        double[] atenuada = new double[muestras.length];
        for (int i = 0; i < muestras.length; i++) {
            if (atenuacion > -1 && atenuacion < 1) {
                atenuada[i] = muestras[i] * atenuacion;
            } else {
                atenuada[i] = muestras[i] / atenuacion;
            }
        }
        return atenuada;
    }

    public double[] suma(double[] muestras, int origen1, double[] muestras2, int origen2) {
        double[] sumada;

        int k1, k2, max, ex;
        k1 = 0 + origen1;
        k2 = 0 + origen2;
        if (k1 >= k2) {
            max = k1 - k2;
            ex = 1;
            // sumada=muestras;
        } else {
            max = k2 - k1;
            ex = 2;
            //sumada=muestras2;
        }
        if (muestras.length >= muestras2.length) {
            sumada = new double[muestras.length + max + 1];
        } else {
            sumada = new double[muestras2.length + max + 1];
        }
        if (k1 >= k2) {
            for (int i = 0; i < muestras.length; i++) {
                sumada[i] = muestras[i];
            }
        } else {
            for (int i = 0; i < muestras2.length; i++) {
                sumada[i] = muestras2[i];
            }
        }
        if (ex == 1) {
            for (int i = max; i < muestras.length; i++) {
                if (i - origen1 == 0) {
                    sumada[sumada.length - 1] = i;
                }
                sumada[i] = sumada[i] + muestras2[i - max];

            }
            if (muestras.length - muestras2.length < 0) {
                for (int i = muestras.length; i < sumada.length - 1; i++) {
                    sumada[i] = muestras2[i - max];
                }
            }
        } else if (ex == 2) {
            for (int i = max; i < muestras2.length; i++) {
                if (i - origen2 == 0) {
                    sumada[sumada.length - 1] = i;
                }
                sumada[i] = sumada[i] + muestras[i - max];
            }
            if (muestras2.length - muestras.length < 0) {
                for (int i = muestras2.length; i < sumada.length - 1; i++) {
                    sumada[i] = muestras[i - max];
                }
            }
        }
        return sumada;
    }

    public double[] resta(double[] muestras, int origen1, double[] muestras2, int origen2) {
        double[] sumada;

        int k1, k2, max, ex;
        k1 = 0 + origen1;
        k2 = 0 + origen2;
        if (k1 >= k2) {
            max = k1 - k2;
            ex = 1;
            // sumada=muestras;
        } else {
            max = k2 - k1;
            ex = 2;
            //sumada=muestras2;
        }
        if (muestras.length >= muestras2.length) {
            sumada = new double[muestras.length + max + 1];
        } else {
            sumada = new double[muestras2.length + max + 1];
        }
        if (k1 >= k2) {
            for (int i = 0; i < muestras.length; i++) {
                sumada[i] = muestras[i];
            }
        } else {
            for (int i = 0; i < muestras2.length; i++) {
                sumada[i] = 0 - muestras2[i];
            }
        }
        if (ex == 1) {
            for (int i = max; i < muestras.length; i++) {
                if (i - origen1 == 0) {
                    sumada[sumada.length - 1] = i;
                }
                sumada[i] = sumada[i] - muestras2[i - max];

            }
            if (muestras.length - muestras2.length < 0) {
                for (int i = muestras.length; i < sumada.length - 1; i++) {
                    sumada[i] = 0 - muestras2[i - max];
                }
            }
        } else if (ex == 2) {
            for (int i = max; i < muestras2.length; i++) {
                if (i - origen2 == 0) {
                    sumada[sumada.length - 1] = i;
                }
                sumada[i] = sumada[i] + muestras[i - max];
            }
            if (muestras2.length - muestras.length < 0) {
                for (int i = muestras2.length; i < sumada.length - 1; i++) {
                    sumada[i] = muestras[i - max];
                }
            }
        }
        return sumada;
    }
}
