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
@Table(name="Cinema")
public class Cinema implements Serializable {
	public Cinema() {
	}
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="CINEMA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="CINEMA_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="Address", nullable=true, length=255)	
	private String address;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="Id_employee", nullable=true, length=10)	
	private Integer id_employee;
	
	@OneToMany(mappedBy="cinema", targetEntity=Hall.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set hall = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId_employee(int value) {
		setId_employee(new Integer(value));
	}
	
	public void setId_employee(Integer value) {
		this.id_employee = value;
	}
	
	public Integer getId_employee() {
		return id_employee;
	}
	
	public void setHall(java.util.Set value) {
		this.hall = value;
	}
	
	public java.util.Set getHall() {
		return hall;
	}
	
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
