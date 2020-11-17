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
@Table(name="News")
public class News implements Serializable {
	public News() {
	}
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="NEWS_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="NEWS_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="Title", nullable=true, length=255)	
	private String title;
	
	@Column(name="Content", nullable=true, length=255)	
	private String content;
	
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
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return content;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
