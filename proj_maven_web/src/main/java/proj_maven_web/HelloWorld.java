package proj_maven_web;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloWorld {

	private String mensaje="Wellcome";

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
// Provocar cambio	
}
