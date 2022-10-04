/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.util.Date;


public class Factura {
    private int ID;
    private String name;
    private String surname;
    private String phone;
    private double cedula;
    private double Idproducto;
    private String nameproduct;
    private float pesofinal;
    private float precio;
    private Date fecha;
    private double preciofinal;

    public Factura(int ID, String name, String surname, String phone, double cedula, double Idproducto, String nameproduct, float pesofinal, float precio, Date fecha, double preciofinal) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.cedula = cedula;
        this.Idproducto = Idproducto;
        this.nameproduct = nameproduct;
        this.pesofinal = pesofinal;
        this.precio = precio;
        this.fecha = fecha;
        this.preciofinal = preciofinal;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public double getCedula() {
        return cedula;
    }

    public double getIdproducto() {
        return Idproducto;
    }

    public String getNameproduct() {
        return nameproduct;
    }

    public float getPesofinal() {
        return pesofinal;
    }

    public float getPrecio() {
        return precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getPreciofinal() {
        return preciofinal;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCedula(double cedula) {
        this.cedula = cedula;
    }

    public void setIdproducto(double Idproducto) {
        this.Idproducto = Idproducto;
    }

    public void setNameproduct(String nameproduct) {
        this.nameproduct = nameproduct;
    }

    public void setPesofinal(float pesofinal) {
        this.pesofinal = pesofinal;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setPreciofinal(double preciofinal) {
        this.preciofinal = preciofinal;
    }

    @Override
    public String toString() {
        return "Factura{" + "ID=" + ID + ", name=" + name + ", surname=" + surname + ", phone=" + phone + ", cedula=" + cedula + ", Idproducto=" + Idproducto + ", nameproduct=" + nameproduct + ", pesofinal=" + pesofinal + ", precio=" + precio + ", fecha=" + fecha + ", preciofinal=" + preciofinal + '}';
    }
    
    
}
