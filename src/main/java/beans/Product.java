
package beans;

import java.util.Date;

public class Product {
   private double Idproducto;
   private String nameproduct;
   private float peso;
   private float precio;
   private Date fecha;
   private float pesofinal;

    public Product(double Idproducto, String nameproduct, float peso, float precio, Date fecha, float pesofinal) {
        this.Idproducto = Idproducto;
        this.nameproduct = nameproduct;
        this.peso = peso;
        this.precio = precio;
        this.fecha = fecha;
        this.pesofinal = pesofinal;
    }

    public double getIdproducto() {
        return Idproducto;
    }

    public String getNameproduct() {
        return nameproduct;
    }

    public float getPeso() {
        return peso;
    }

    public float getPrecio() {
        return precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public float getPesofinal() {
        return pesofinal;
    }

    public void setIdproducto(double Idproducto) {
        this.Idproducto = Idproducto;
    }

    public void setNameproduct(String nameproduct) {
        this.nameproduct = nameproduct;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setPesofinal(float pesofinal) {
        this.pesofinal = pesofinal;
    }

    @Override
    public String toString() {
        return "Product{" + "Idproducto=" + Idproducto + ", nameproduct=" + nameproduct + ", peso=" + peso + ", precio=" + precio + ", fecha=" + fecha + ", pesofinal=" + pesofinal + '}';
    }
   
   
}
