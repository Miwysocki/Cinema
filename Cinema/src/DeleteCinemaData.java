/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class DeleteCinemaData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = CinemaPersistentManager.instance().getSession().beginTransaction();
		try {
			Password_reset password_reset= (Password_reset)CinemaPersistentManager.instance().getSession().createQuery("From Password_reset").setMaxResults(1).uniqueResult();
			CinemaPersistentManager.instance().getSession().delete(password_reset);
			
			News news= (News)CinemaPersistentManager.instance().getSession().createQuery("From News").setMaxResults(1).uniqueResult();
			CinemaPersistentManager.instance().getSession().delete(news);
			
			Users users= (Users)CinemaPersistentManager.instance().getSession().createQuery("From Users").setMaxResults(1).uniqueResult();
			CinemaPersistentManager.instance().getSession().delete(users);
			
			Feedback feedback= (Feedback)CinemaPersistentManager.instance().getSession().createQuery("From Feedback").setMaxResults(1).uniqueResult();
			CinemaPersistentManager.instance().getSession().delete(feedback);
			
			Films films= (Films)CinemaPersistentManager.instance().getSession().createQuery("From Films").setMaxResults(1).uniqueResult();
			CinemaPersistentManager.instance().getSession().delete(films);
			
			Category category= (Category)CinemaPersistentManager.instance().getSession().createQuery("From Category").setMaxResults(1).uniqueResult();
			CinemaPersistentManager.instance().getSession().delete(category);
			
			Seans seans= (Seans)CinemaPersistentManager.instance().getSession().createQuery("From Seans").setMaxResults(1).uniqueResult();
			CinemaPersistentManager.instance().getSession().delete(seans);
			
			Hall hall= (Hall)CinemaPersistentManager.instance().getSession().createQuery("From Hall").setMaxResults(1).uniqueResult();
			CinemaPersistentManager.instance().getSession().delete(hall);
			
			Cinema cinema= (Cinema)CinemaPersistentManager.instance().getSession().createQuery("From Cinema").setMaxResults(1).uniqueResult();
			CinemaPersistentManager.instance().getSession().delete(cinema);
			
			Reservations reservations= (Reservations)CinemaPersistentManager.instance().getSession().createQuery("From Reservations").setMaxResults(1).uniqueResult();
			CinemaPersistentManager.instance().getSession().delete(reservations);
			
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
	}
	
	public static void main(String[] args) {
		try {
			DeleteCinemaData deleteCinemaData = new DeleteCinemaData();
			try {
				deleteCinemaData.deleteTestData();
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
