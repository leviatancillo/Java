/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Julian
 */
public class Cancion {
        
    private String titulo, artista;
    private int tiempoDuracion;//segundos
    private boolean favorita;//true: favorita false; no favorita
    private char descargada;
    
        //métodos

    //constructores
    //sin parametros
    
        public Cancion() {
    }    
      
    public Cancion(String titulo, String artista, int duracion, boolean favorita, char descargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.tiempoDuracion = duracion;
        this.favorita = favorita;
        this.descargada = descargada;
    }
    //accesadores y mutadores

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getTiempoDuracion() {
        return tiempoDuracion;
    }

    public void setTiempoDuracion(int tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public char getDescargada() {
        return descargada;
    }

    public void setDescargada(char descargada) {
        this.descargada = descargada;
    }

   
    
    
    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + ", duracion=" + tiempoDuracion + ", favorita=" + favorita + ", descargada=" + descargada + '}';
    }
        
        //customer
    //metodo con 2 parametros con return int
    public int adelantarCancion(int segundosAdd,int segundosActuales) {
        segundosActuales= segundosActuales+segundosAdd;
        return segundosActuales;
    }    
     //metodo con ningun parametro y sin return 
        public void imprimirCanciones()
        {
            //variables locales, se deben inicializar de inmediato
            int minutos = 0, segundos=0;
            
            minutos = this.tiempoDuracion/60;
            segundos = this.tiempoDuracion- minutos*60;
            
            System.out.println("Cancion "+ this.getTitulo());
            System.out.println("Artista: "+ this.getArtista());
            System.out.println("duracion: "+minutos +":"+segundos);
    } //metodo con 0 parametros con return string
        public String obtenerTiempoCancion()
        {
            //5 minutos *60 --> 300 segundos
            //if+tab
            //ifesle+tab
            if (this.tiempoDuracion>=300)
            {
                return "larga";
            }
            else 
            {
                return "normal"; 
            }
        }
}


