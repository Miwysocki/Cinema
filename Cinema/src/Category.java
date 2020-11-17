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
@Table(name="Category")
public class Category implements Serializable {
	public Category() {
	}
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="CATEGORY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="CATEGORY_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="Content", nullable=true, length=255)	
	private String content;
	
	@OneToMany(mappedBy="category", targetEntity=Films.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set films = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setFilms(java.util.Set value) {
		this.films = value;
	}
	
	public java.util.Set getFilms() {
		return films;
	}
	
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
