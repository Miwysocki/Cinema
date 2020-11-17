/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Password_reset")
public class Password_reset implements Serializable {
	public Password_reset() {
	}
	
	@Column(name="Email", nullable=false, unique=true, length=255)	
	@Id	
	@GeneratedValue(generator="PASSWORD_RESET_EMAIL_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PASSWORD_RESET_EMAIL_GENERATOR", strategy="native")	
	private String email;
	
	@Column(name="Token", nullable=true, length=255)	
	private String token;
	
	@Column(name="Created_at", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date created_at;
	
	@OneToOne(mappedBy="email", targetEntity=Users.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private Users users;
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getORMID() {
		return getEmail();
	}
	
	public void setToken(String value) {
		this.token = value;
	}
	
	public String getToken() {
		return token;
	}
	
	public void setCreated_at(java.util.Date value) {
		this.created_at = value;
	}
	
	public java.util.Date getCreated_at() {
		return created_at;
	}
	
	public void setUsers(Users value) {
		this.users = value;
	}
	
	public Users getUsers() {
		return users;
	}
	
	public String toString() {
		return String.valueOf(getEmail());
	}
	
	@Transient	
	private boolean _saved = false;
	
	public void onSave() {
		_saved=true;
	}
	
	
	public void onLoad() {
		_saved=true;
	}
	
	
	public boolean isSaved() {
		return _saved;
	}
	
	
}
