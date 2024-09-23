package edu.pruebainicial.es.dtos;

/*
 * Clase que contiene toda la informacion necesaria de los alumnos
 * 19/09/2024
 * @author irodhan
 */
public class AlumnoDto {
	//Variables
	private long idAlumno;
	private String dniAlumno="aaaaa";
	private String nombreAlumno="aaaaa";
	private String apellidosAlumno="aaaaa";
	private String emailAlumno="aaaaa";
	private int telefonoAlumno=0;
	private String fchNacimientoAlumno="aaaaa";
	
	//Constructores
	public AlumnoDto(long idAlumno, String dniAlumno, String nombreAlumno, String apellidosAlumno, String emailAlumno,
			int telefonoAlumno, String fchNacimientoAlumno) {
		super();
		this.idAlumno = idAlumno;
		this.dniAlumno = dniAlumno;
		this.nombreAlumno = nombreAlumno;
		this.apellidosAlumno = apellidosAlumno;
		this.emailAlumno = emailAlumno;
		this.telefonoAlumno = telefonoAlumno;
		this.fchNacimientoAlumno = fchNacimientoAlumno;
	}
	public AlumnoDto() {}
	
	//Getters & Setters
	public long getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(long idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getDniAlumno() {
		return dniAlumno;
	}
	public void setDniAlumno(String dniAlumno) {
		this.dniAlumno = dniAlumno;
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public String getApellidosAlumno() {
		return apellidosAlumno;
	}
	public void setApellidosAlumno(String apellidosAlumno) {
		this.apellidosAlumno = apellidosAlumno;
	}
	public String getEmailAlumno() {
		return emailAlumno;
	}
	public void setEmailAlumno(String emailAlumno) {
		this.emailAlumno = emailAlumno;
	}
	public int getTelefonoAlumno() {
		return telefonoAlumno;
	}
	public void setTelefonoAlumno(int telefonoAlumno) {
		this.telefonoAlumno = telefonoAlumno;
	}
	public String getFchNacimientoAlumno() {
		return fchNacimientoAlumno;
	}
	public void setFchNacimientoAlumno(String fchNacimientoAlumno) {
		this.fchNacimientoAlumno = fchNacimientoAlumno;
	}

	//ToString
	@Override
	public String toString() {
		return "AlumnoDto [Dni= " + dniAlumno + ", Nombre= " + nombreAlumno + ", Apellidos= "
				+ apellidosAlumno + ", Email= " + emailAlumno + ", Telefono= " + telefonoAlumno
				+ ", Fecha de Nacimiento= " + fchNacimientoAlumno + "]";
	}
}