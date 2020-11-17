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
@Table(name="Seans")
public class Seans implements Serializable {
	public Seans() {
	}
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="SEANS_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="SEANS_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="Data", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date data;
	
	@Column(name="Price", nullable=true, length=10)	
	private Double price;
	
	@ManyToOne(targetEntity=Hall.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="HallId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKSeans763502"))	
	private Hall hall;
	
	@ManyToOne(targetEntity=Films.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="FilmsId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKSeans552453"))	
	private Films films;
	
	@ManyToOne(targetEntity=Reservations.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ReservationsId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKSeans581038"))	
	private Reservations reservations;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setData(java.util.Date value) {
		this.data = value;
	}
	
	public java.util.Date getData() {
		return data;
	}
	
	public void setPrice(double value) {
		setPrice(new Double(value));
	}
	
	public void setPrice(Double value) {
		this.price = value;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setHall(Hall value) {
		this.hall = value;
	}
	
	public Hall getHall() {
		return hall;
	}
	
	public void setFilms(Films value) {
		this.films = value;
	}
	
	public Films getFilms() {
		return films;
	}
	
	public void setReservations(Reservations value) {
		this.reservations = value;
	}
	
	public Reservations getReservations() {
		return reservations;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
