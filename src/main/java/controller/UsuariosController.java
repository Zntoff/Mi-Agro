
package controller;

import beans.Usuarios;
import java.sql.ResultSet;
import java.sql.Statement;
import connection.DBConnection;
import com.google.gson.Gson;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Map;


public class UsuariosController implements UsuariosUI {

    @Override
    public String login(double cedula, String contrasena) {
        Gson gson = new Gson();
        DBConnection con = new DBConnection();

        String sql = "SELECT * FROM usuarios WHERE cedula = '" + cedula + "' and contrasena = '" + contrasena + "'";

        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String company = rs.getString("company");
                String direccion = rs.getString("direccion");
                String municipio = rs.getString("municipio");
                Usuarios usuario = new Usuarios(cedula, contrasena, name, surname, phone, email, company, direccion, municipio);
                return gson.toJson(usuario);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }

        return "false";
    }

    @Override
    public String register(Double cedula, String contrasena, String name, String surname, String phone, String email, String company, String direccion, String municipio) {
        Gson gson = new Gson();
        DBConnection con = new DBConnection();

        //Configurar formato de decimales para separador decimal con punto
//        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
//        dfs.setGroupingSeparator(',');
//        dfs.setDecimalSeparator('.');
//        DecimalFormat df = new DecimalFormat("###.##");
//        df.setDecimalFormatSymbols(dfs);
//        String sql = String.format("INSERT INTO usuarios VALUES ('%s', '%s', '%s', '%s', '%s', %s, %b)", username, contrasena, nombre, apellido, email, df.format(saldo), premium);
        String sql = "Insert into usuarios values('" + cedula + "', '" + contrasena + "', '" + name
                + "', '" + surname + "','" + phone + "', '" + email + "', '" + company + "', '" + direccion + "', '" + municipio + "')";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
            Usuarios usuario = new Usuarios(cedula, contrasena, name, surname, phone, email, company, direccion, municipio);
            st.close();
            return gson.toJson(usuario);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }

        return "false";

    }

    @Override
    public String pedir(double cedula) {

        Gson gson = new Gson();
        DBConnection con = new DBConnection();

        String sql = "SELECT * FROM usuarios WHERE cedula = '" + cedula + "'";

        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String contrasena = rs.getString("contrasena");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String company = rs.getString("company");
                String direccion = rs.getString("direccion");
                String municipio = rs.getString("municipio");
                Usuarios usuario = new Usuarios(cedula, contrasena, name, surname, phone, email, company, direccion, municipio);
                return gson.toJson(usuario);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }

        return "false";

    }

    @Override
    public String modificar(String username, String nuevaContrasena, String nuevoNombre, String nuevosApellidos, String nuevoEmail, double nuevoSaldo, boolean nuevoPremium) {

        DBConnection con = new DBConnection();

        String sql = "Update usuarios set contrasena = '" + nuevaContrasena
                + "', nombre = '" + nuevoNombre + "', "
                + "apellido = '" + nuevosApellidos + "', email = '"
                + nuevoEmail + "', saldo = " + nuevoSaldo + ", premium = ";

        if (nuevoPremium == true) {
            sql += " 1 ";
        } else {
            sql += " 0 ";
        }

        sql += " where username = '" + username + "'";

        try {

            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            return "true";
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";

    }

    

    @Override
    public String eliminar(String username) {
        DBConnection con = new DBConnection();

        String sql1 = "Delete from alquiler where username = '" + username + "'";
        String sql2 = "Delete from usuarios where username = '" + username + "'";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql1);
            st.executeUpdate(sql2);

            return "true";
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";

    }

    @Override
    public String login(String phone, String contrasena) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String register(double cedula, String name, String surname, String phone, String email, String contrasena, String company, String direccion, String municipio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String modificar(double cedula, String nuevoName, String nuevoSurname, String nuevoPhone, String nuevoEmail, String nuevaContrasena, String nuevaCompany, String nuevaDireccion, String nuevoMunicipio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String eliminar(double cedula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


