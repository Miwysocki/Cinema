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
@Table(name="Users")
public class Users implements Serializable {
	public Users() {
	}
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="USERS_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="USERS_ID_GENERATOR", strategy="native")	
	private int id;
	
	@OneToOne(optional=false, targetEntity=Password_reset.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Email", referencedColumnName="Email", nullable=false) }, foreignKey=@ForeignKey(name="FKUsers621282"))	
	private Password_reset email;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@Column(name="IsAdmin", nullable=true, length=255)	
	private String isAdmin;
	
	@OneToMany(mappedBy="users", targetEntity=Feedback.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set feedback = new java.util.HashSet();
	
	@OneToMany(mappedBy="users", targetEntity=Reservations.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set reservations = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setIsAdmin(String value) {
		this.isAdmin = value;
	}
	
	public String getIsAdmin() {
		return isAdmin;
	}
	
	public void setEmail(Password_reset value) {
		this.email = value;
	}
	
	public Password_reset getEmail() {
		return email;
	}
	
	public void setFeedback(java.util.Set value) {
		this.feedback = value;
	}
	
	public java.util.Set getFeedback() {
		return feedback;
	}
	
	
	public void setReservations(java.util.Set value) {
		this.reservations = value;
	}
	
	public java.util.Set getReservations() {
		return reservations;
	}
	
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
