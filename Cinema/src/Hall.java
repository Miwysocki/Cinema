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
@Table(name="Hall")
public class Hall implements Serializable {
	public Hall() {
	}
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="HALL_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="HALL_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="Capacity", nullable=true, length=10)	
	private Integer capacity;
	
	@ManyToOne(targetEntity=Cinema.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="CinemaId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKHall384011"))	
	private Cinema cinema;
	
	@OneToMany(mappedBy="hall", targetEntity=Seans.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set seans = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setCapacity(int value) {
		setCapacity(new Integer(value));
	}
	
	public void setCapacity(Integer value) {
		this.capacity = value;
	}
	
	public Integer getCapacity() {
		return capacity;
	}
	
	public void setCinema(Cinema value) {
		this.cinema = value;
	}
	
	public Cinema getCinema() {
		return cinema;
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
