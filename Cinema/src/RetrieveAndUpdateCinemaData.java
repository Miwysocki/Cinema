/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class RetrieveAndUpdateCinemaData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = CinemaPersistentManager.instance().getSession().beginTransaction();
		try {
			Password_reset password_reset= (Password_reset)CinemaPersistentManager.instance().getSession().createQuery("From Password_reset").setMaxResults(1).uniqueResult();
			// Update the properties of the persistent object
			CinemaPersistentManager.instance().getSession().update(password_reset);
			
			News news= (News)CinemaPersistentManager.instance().getSession().createQuery("From News").setMaxResults(1).uniqueResult();
			// Update the properties of the persistent object
			CinemaPersistentManager.instance().getSession().update(news);
			
			Users users= (Users)CinemaPersistentManager.instance().getSession().createQuery("From Users").setMaxResults(1).uniqueResult();
			// Update the properties of the persistent object
			CinemaPersistentManager.instance().getSession().update(users);
			
			Feedback feedback= (Feedback)CinemaPersistentManager.instance().getSession().createQuery("From Feedback").setMaxResults(1).uniqueResult();
			// Update the properties of the persistent object
			CinemaPersistentManager.instance().getSession().update(feedback);
			
			Films films= (Films)CinemaPersistentManager.instance().getSession().createQuery("From Films").setMaxResults(1).uniqueResult();
			// Update the properties of the persistent object
			CinemaPersistentManager.instance().getSession().update(films);
			
			Category category= (Category)CinemaPersistentManager.instance().getSession().createQuery("From Category").setMaxResults(1).uniqueResult();
			// Update the properties of the persistent object
			CinemaPersistentManager.instance().getSession().update(category);
			
			Seans seans= (Seans)CinemaPersistentManager.instance().getSession().createQuery("From Seans").setMaxResults(1).uniqueResult();
			// Update the properties of the persistent object
			CinemaPersistentManager.instance().getSession().update(seans);
			
			Hall hall= (Hall)CinemaPersistentManager.instance().getSession().createQuery("From Hall").setMaxResults(1).uniqueResult();
			// Update the properties of the persistent object
			CinemaPersistentManager.instance().getSession().update(hall);
			
			Cinema cinema= (Cinema)CinemaPersistentManager.instance().getSession().createQuery("From Cinema").setMaxResults(1).uniqueResult();
			// Update the properties of the persistent object
			CinemaPersistentManager.instance().getSession().update(cinema);
			
			Reservations reservations= (Reservations)CinemaPersistentManager.instance().getSession().createQuery("From Reservations").setMaxResults(1).uniqueResult();
			// Update the properties of the persistent object
			CinemaPersistentManager.instance().getSession().update(reservations);
			
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
	}
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateCinemaData retrieveAndUpdateCinemaData = new RetrieveAndUpdateCinemaData();
			try {
				retrieveAndUpdateCinemaData.retrieveAndUpdateTestData();
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
