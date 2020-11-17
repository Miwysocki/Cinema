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
@Table(name="Reservations")
public class Reservations implements Serializable {
	public Reservations() {
	}
	
	@Column(name="Seat", nullable=true, length=10)	
	private Integer seat;
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="RESERVATIONS_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="RESERVATIONS_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=Users.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsersId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKReservatio992949"))	
	private Users users;
	
	@OneToMany(mappedBy="reservations", targetEntity=Seans.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set seans = new java.util.HashSet();
	
	public void setSeat(int value) {
		setSeat(new Integer(value));
	}
	
	public void setSeat(Integer value) {
		this.seat = value;
	}
	
	public Integer getSeat() {
		return seat;
	}
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setUsers(Users value) {
		this.users = value;
	}
	
	public Users getUsers() {
		return users;
	}
	
	public void setSeans(java.util.Set value) {
		this.seans = value;
	}
	
	public java.util.Set getSeans() {
		return seans;
	}
	
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
