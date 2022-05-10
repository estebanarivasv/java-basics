
public class Usuario {
	@ValidField(minLength = 1, maxLength = 10)
	String clave;
	
	@ValidField(minLength = 1, maxLength = 5)
	String password;

	public Usuario() {
		this(null, null);
	}
	
	public Usuario(String key, String passw) {
		this.setClave(key);
		this.setPassword(passw);
	}
	
	public String getClave() {
		return clave;
	}

	public String getPassword() {
		return password;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
