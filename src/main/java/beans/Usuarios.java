
package beans;


public class Usuarios {
    private double cedula;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private String contrasena;
    private String company;
    private String direccion;
    private String municipio;

    public Usuarios(double cedula, String name, String surname, String phone, String email, String contrasena, String company, String direccion, String municipio) {
        this.cedula = cedula;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.contrasena = contrasena;
        this.company = company;
        this.direccion = direccion;
        this.municipio = municipio;
    }

    public double getCedula() {
        return cedula;
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

    public String getEmail() {
        return email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getCompany() {
        return company;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setCedula(double cedula) {
        this.cedula = cedula;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    @Override
    public String toString() {
        return "Usuarios{" + "cedula=" + cedula + ", name=" + name + ", surname=" + surname + ", phone=" + phone + ", email=" + email + ", contrasena=" + contrasena + ", company=" + company + ", direccion=" + direccion + ", municipio=" + municipio +'}';
}
}

