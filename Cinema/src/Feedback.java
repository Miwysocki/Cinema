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
@Table(name="Feedback")
public class Feedback implements Serializable {
	public Feedback() {
	}
	
	@Column(name="Content", nullable=true, length=255)	
	private String content;
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="FEEDBACK_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="FEEDBACK_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=Films.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="FilmsId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKFeedback937063"))	
	private Films films;
	
	@ManyToOne(targetEntity=Users.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsersId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKFeedback711083"))	
	private Users users;
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return content;
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
	
	public void setFilms(Films value) {
		this.films = value;
	}
	
	public Films getFilms() {
		return films;
	}
	
	public void setUsers(Users value) {
		this.users = value;
	}
	
	public Users getUsers() {
		return users;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
