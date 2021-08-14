/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author laura
 */
public class PlantaPetaCereza extends Planta {

    public PlantaPetaCereza(int coste, int resistencia, float frecuencia, int danio, int ciclo) {
        super(coste, resistencia, frecuencia, danio, ciclo);
    }

    /**
     * Crea objeto PlantaPetaCereza
     *
     * @return PlantaPetaCereza
     */
    public static PlantaPetaCereza crearPlantaPetaCereza() {
        PlantaPetaCereza pPC = new PlantaPetaCereza(50, 2, 0, 10, 0);  //ciclo == 2 --> explosión
        return pPC;
    }
    
    public static Objeto[][] petaLaCereza (Objeto[][] tablero, int filaPPC, int columnaPPC, int numFilas, int numColumnas, CasillaVacia casillaVacia){
        
        if (filaPPC == 0){ //primera fila
            if (columnaPPC == 0) { //primera columna      //(0,0)
                if (tablero[filaPPC][columnaPPC + 1] instanceof Zombie) {
                    tablero[filaPPC][columnaPPC + 1].setResistencia(tablero[filaPPC][columnaPPC + 1].getResistencia() - tablero[filaPPC][columnaPPC].getDanio()); // (0,1)
                    if (tablero[filaPPC][columnaPPC + 1].getResistencia() < 1){
                        tablero[filaPPC][columnaPPC + 1] = casillaVacia;
                    }
                }
                if (tablero[filaPPC + 1][columnaPPC] instanceof Zombie) {
                    tablero[filaPPC + 1][columnaPPC].setResistencia(tablero[filaPPC + 1][columnaPPC].getResistencia() - tablero[filaPPC][columnaPPC].getDanio()); // (1,0)
                    if (tablero[filaPPC + 1][columnaPPC].getResistencia() < 1){
                        tablero[filaPPC + 1][columnaPPC] = casillaVacia;
                    }
                }
            } else { //columnas por el medio  //arriba por el medio   (0, x)
                if (tablero[filaPPC][columnaPPC + 1] instanceof Zombie) {
                    tablero[filaPPC][columnaPPC + 1].setResistencia(tablero[filaPPC][columnaPPC + 1].getResistencia() - tablero[filaPPC][columnaPPC].getDanio()); // (0, x + 1)
                    if (tablero[filaPPC][columnaPPC + 1].getResistencia() < 1) {
                        tablero[filaPPC][columnaPPC + 1] = casillaVacia;
                        if (tablero[filaPPC][columnaPPC + 1].getResistencia() < 1) {
                            tablero[filaPPC][columnaPPC + 1] = casillaVacia;
                        }
                    }
                }
                if (tablero[filaPPC][columnaPPC - 1] instanceof Zombie){
                    tablero[filaPPC][columnaPPC - 1].setResistencia(tablero[filaPPC][columnaPPC - 1].getResistencia() - tablero[filaPPC][columnaPPC].getDanio()); // (0, x - 1)
                    if (tablero[filaPPC][columnaPPC - 1].getResistencia() < 1) {
                        tablero[filaPPC][columnaPPC - 1] = casillaVacia;
                    }
                }
                if (tablero[filaPPC + 1][columnaPPC] instanceof Zombie){
                    tablero[filaPPC + 1][columnaPPC].setResistencia(tablero[filaPPC + 1][columnaPPC].getResistencia() - tablero[filaPPC][columnaPPC].getDanio()); // (1, x)
                    if (tablero[filaPPC + 1][columnaPPC].getResistencia() < 1){
                        tablero[filaPPC + 1][columnaPPC] = casillaVacia;
                    }
                }
            }
        } else if (filaPPC == numFilas - 1) { //última fila
            if (columnaPPC == 0) { //primera columna   //(n , 0)
                if (tablero[filaPPC][columnaPPC + 1] instanceof Zombie){
                    tablero[filaPPC][columnaPPC + 1].setResistencia(tablero[filaPPC][columnaPPC + 1].getResistencia() - tablero[filaPPC][columnaPPC].getDanio()); // (n,1)
                    if (tablero[filaPPC][columnaPPC + 1].getResistencia() < 1) {
                        tablero[filaPPC][columnaPPC + 1] = casillaVacia;
                    }
                }
                if (tablero[filaPPC - 1][columnaPPC] instanceof Zombie){
                    tablero[filaPPC - 1][columnaPPC].setResistencia(tablero[filaPPC - 1][columnaPPC].getResistencia() - tablero[filaPPC][columnaPPC].getDanio()); //arriba (n - 1, 0)
                    if (tablero[filaPPC - 1][columnaPPC].getResistencia() < 1){
                        tablero[filaPPC - 1][columnaPPC] = casillaVacia;
                    }
                }
            } else { //columnas por el medio   //abajo por el medio  //(n - 1, x)
                if (tablero[filaPPC][columnaPPC + 1] instanceof Zombie) {
                    tablero[filaPPC][columnaPPC + 1].setResistencia(tablero[filaPPC][columnaPPC + 1].getResistencia() - tablero[filaPPC][columnaPPC].getDanio()); // (n, x + 1)
                    if (tablero[filaPPC][columnaPPC + 1].getResistencia() < 1) {
                        tablero[filaPPC][columnaPPC + 1] = casillaVacia;
                    }
                }
                if (tablero[filaPPC][columnaPPC - 1] instanceof Zombie){
                    tablero[filaPPC][columnaPPC - 1].setResistencia(tablero[filaPPC][columnaPPC - 1].getResistencia() - tablero[filaPPC][columnaPPC].getDanio()); // (n, x - 1)
                    if (tablero[filaPPC][columnaPPC - 1].getResistencia() < 1) {
                        tablero[filaPPC][columnaPPC - 1] = casillaVacia;
                    }
                }
                if (tablero[filaPPC - 1][columnaPPC] instanceof Zombie){
                    tablero[filaPPC - 1][columnaPPC].setResistencia(tablero[filaPPC - 1][columnaPPC].getResistencia() - tablero[filaPPC][columnaPPC].getDanio()); // (n - 1, x)
                    if (tablero[filaPPC - 1][columnaPPC].getResistencia() < 1){
                        tablero[filaPPC - 1][columnaPPC] = casillaVacia;
                    }
                }
            }
        } else { //filas por el medio
            if (numColumnas == 0){  //primera columna (x, 0)
                if (tablero[filaPPC][columnaPPC + 1] instanceof Zombie) {
                    tablero[filaPPC][columnaPPC + 1].setResistencia(tablero[filaPPC][columnaPPC + 1].getResistencia() - tablero[filaPPC][columnaPPC].getDanio()); // (x,1)
                    if (tablero[filaPPC][columnaPPC + 1].getResistencia() < 1) {
                        tablero[filaPPC][columnaPPC + 1] = casillaVacia;
                    }
                }
                if (tablero[filaPPC + 1][columnaPPC] instanceof Zombie) {
                    tablero[filaPPC + 1][columnaPPC].setResistencia(tablero[filaPPC + 1][columnaPPC].getResistencia() - tablero[filaPPC][columnaPPC].getDanio()); // (x + 1, 0)
                    if (tablero[filaPPC + 1][columnaPPC].getResistencia() < 1){
                        tablero[filaPPC + 1][columnaPPC] = casillaVacia;
                    }
                }
                if (tablero[filaPPC - 1][columnaPPC] instanceof Zombie){
                    tablero[filaPPC - 1][columnaPPC].setResistencia(tablero[filaPPC - 1][columnaPPC].getResistencia() - tablero[filaPPC][columnaPPC].getDanio()); // (x - 1, 0)
                    if (tablero[filaPPC - 1][columnaPPC].getResistencia() < 1){
                        tablero[filaPPC - 1][columnaPPC] = casillaVacia;
                    }
                }
            } else {
                if (tablero[filaPPC][columnaPPC + 1] instanceof Zombie) {
                    tablero[filaPPC][columnaPPC + 1].setResistencia(tablero[filaPPC][columnaPPC + 1].getResistencia() - tablero[filaPPC][columnaPPC].getDanio()); // (x, x + 1)
                    if (tablero[filaPPC][columnaPPC + 1].getResistencia() < 1) {
                        tablero[filaPPC][columnaPPC + 1] = casillaVacia;
                    }
                }
                if (tablero[filaPPC + 1][columnaPPC] instanceof Zombie) {
                    tablero[filaPPC + 1][columnaPPC].setResistencia(tablero[filaPPC + 1][columnaPPC].getResistencia() - tablero[filaPPC][columnaPPC].getDanio()); // (x + 1, x)
                    if (tablero[filaPPC + 1][columnaPPC].getResistencia() < 1){
                        tablero[filaPPC + 1][columnaPPC] = casillaVacia;
                    }
                }
                if (tablero[filaPPC - 1][columnaPPC] instanceof Zombie){
                    tablero[filaPPC - 1][columnaPPC].setResistencia(tablero[filaPPC - 1][columnaPPC].getResistencia() - tablero[filaPPC][columnaPPC].getDanio()); // (x - 1, x)
                    if (tablero[filaPPC - 1][columnaPPC].getResistencia() < 1){
                        tablero[filaPPC - 1][columnaPPC] = casillaVacia;
                    }
                }
                if (tablero[filaPPC][columnaPPC - 1] instanceof Zombie){
                    tablero[filaPPC][columnaPPC - 1].setResistencia(tablero[filaPPC][columnaPPC - 1].getResistencia() - tablero[filaPPC][columnaPPC].getDanio()); // (x, x - 1)
                    if (tablero[filaPPC][columnaPPC - 1].getResistencia() < 1) {
                        tablero[filaPPC][columnaPPC - 1] = casillaVacia;
                    }
                }
            }
            
        }
        
        tablero[filaPPC][columnaPPC] = casillaVacia;
        
        return tablero;
    }

}
