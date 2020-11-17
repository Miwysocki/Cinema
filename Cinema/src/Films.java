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
@Table(name="Films")
public class Films implements Serializable {
	public Films() {
	}
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="FILMS_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FILMS_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="Title", nullable=true, length=255)	
	private String title;
	
	@Column(name="Time", nullable=true, length=7)	
	private java.sql.Time time;
	
	@ManyToOne(targetEntity=Category.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="CategoryId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKFilms932724"))	
	private Category category;
	
	@OneToMany(mappedBy="films", targetEntity=Seans.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set seans = new java.util.HashSet();
	
	@OneToMany(mappedBy="films", targetEntity=Feedback.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set feedback = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTime(java.sql.Time value) {
		this.time = value;
	}
	
	public java.sql.Time getTime() {
		return time;
	}
	
	public void setCategory(Category value) {
		this.category = value;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setSeans(java.util.Set value) {
		this.seans = value;
	}
	
	public java.util.Set getSeans() {
		return seans;
	}
	
	
	public void setFeedback(java.util.Set value) {
		this.feedback = value;
	}
	
	public java.util.Set getFeedback() {
		return feedback;
	}
	
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
