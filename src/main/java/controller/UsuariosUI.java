/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import java.util.Map;

public interface UsuariosUI {

    public String login(String phone, String contrasena);

    public String register(double cedula, String name, String surname, String phone, String email, String contrasena, String company, String direccion, String municipio);

    public String pedir(String cedula);

    public String modificar(double cedula, String nuevoName, String nuevoSurname, String nuevoPhone, String nuevoEmail, String nuevaContrasena, String nuevaCompany, String nuevaDireccion,String nuevoMunicipio);

    public String eliminar(double cedula);

}
