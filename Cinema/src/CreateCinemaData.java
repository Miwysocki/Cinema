/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class CreateCinemaData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = CinemaPersistentManager.instance().getSession().beginTransaction();
		try {
			Password_reset password_reset = new Password_reset();			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : users
			CinemaPersistentManager.instance().getSession().save(password_reset);
			
			News news = new News();			// Initialize the properties of the persistent object here
			CinemaPersistentManager.instance().getSession().save(news);
			
			Users users = new Users();			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reservations, feedback, email
			CinemaPersistentManager.instance().getSession().save(users);
			
			Feedback feedback = new Feedback();			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : users, films
			CinemaPersistentManager.instance().getSession().save(feedback);
			
			Films films = new Films();			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : feedback, seans, category
			CinemaPersistentManager.instance().getSession().save(films);
			
			Category category = new Category();			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : films
			CinemaPersistentManager.instance().getSession().save(category);
			
			Seans seans = new Seans();			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reservations, films, hall
			CinemaPersistentManager.instance().getSession().save(seans);
			
			Hall hall = new Hall();			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : seans, cinema
			CinemaPersistentManager.instance().getSession().save(hall);
			
			Cinema cinema = new Cinema();			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : hall
			CinemaPersistentManager.instance().getSession().save(cinema);
			
			Reservations reservations = new Reservations();			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : seans, users
			CinemaPersistentManager.instance().getSession().save(reservations);
			
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateCinemaData createCinemaData = new CreateCinemaData();
			try {
				createCinemaData.createTestData();
			}
			finally {
				CinemaPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
