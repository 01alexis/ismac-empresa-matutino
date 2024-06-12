package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "empleado")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	
	@Column(name = "id_Empleado")
private int 	idEmpleado;
	@Column(name = "Nombre")
private String	Nombre;
	@Column(name = "Apellido1")
private String	Apellido1;
	@Column(name = "Apellido2")
private String	Apellido2;
	@Column(name = "Dni")
private String	Dni;
	@Column(name = "Fechanac")
private String	Fechanac;
	@Column(name = "Direccion")
private String	Direccion;
	@Column(name = "Sexo")
private String	Sexo;
	@Column(name = "Sueldo")
private String	Sueldo;
	@Column(name = "SuperDni")
private String	SuperDni; 
	@Column(name = "Dno")
private String	Dno;

public Empleado() {}

public Empleado(int idEmpleado, String nombre, String apellido1, String apellido2, String dni, String fechanac,
		String direccion, String sexo, String sueldo, String superDni, String dno) {
	
	this.idEmpleado = idEmpleado;
	Nombre = nombre;
	Apellido1 = apellido1;
	Apellido2 = apellido2;
	Dni = dni;
	Fechanac = fechanac;
	Direccion = direccion;
	Sexo = sexo;
	Sueldo = sueldo;
	SuperDni = superDni;
	Dno = dno;
}

public int getIdEmpleado() {
	return idEmpleado;
}

public void setIdEmpleado(int idEmpleado) {
	this.idEmpleado = idEmpleado;
}

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}

public String getApellido1() {
	return Apellido1;
}

public void setApellido1(String apellido1) {
	Apellido1 = apellido1;
}

public String getApellido2() {
	return Apellido2;
}

public void setApellido2(String apellido2) {
	Apellido2 = apellido2;
}

public String getDni() {
	return Dni;
}

public void setDni(String dni) {
	Dni = dni;
}

public String getFechanac() {
	return Fechanac;
}

public void setFechanac(String fechanac) {
	Fechanac = fechanac;
}

public String getDireccion() {
	return Direccion;
}

public void setDireccion(String direccion) {
	Direccion = direccion;
}

public String getSexo() {
	return Sexo;
}

public void setSexo(String sexo) {
	Sexo = sexo;
}

public String getSueldo() {
	return Sueldo;
}

public void setSueldo(String sueldo) {
	Sueldo = sueldo;
}

public String getSuperDni() {
	return SuperDni;
}

public void setSuperDni(String superDni) {
	SuperDni = superDni;
}

public String getDno() {
	return Dno;
}

public void setDno(String dno) {
	Dno = dno;
}

@Override
public String toString() {
	return "Empleado [idEmpleado=" + idEmpleado + ", Nombre=" + Nombre + ", Apellido1=" + Apellido1 + ", Apellido2="
			+ Apellido2 + ", Dni=" + Dni + ", Fechanac=" + Fechanac + ", Direccion=" + Direccion + ", Sexo=" + Sexo
			+ ", Sueldo=" + Sueldo + ", SuperDni=" + SuperDni + ", Dno=" + Dno + "]";
}



}