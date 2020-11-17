/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class ListCinemaData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Password_reset...");
		java.util.List lPassword_resetList = CinemaPersistentManager.instance().getSession().createQuery("From Password_reset").setMaxResults(ROW_COUNT).list();
		Password_reset[] password_resets = (Password_reset[]) lPassword_resetList.toArray(new Password_reset[lPassword_resetList.size()]);
		int length = Math.min(password_resets.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(password_resets[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing News...");
		java.util.List lNewsList = CinemaPersistentManager.instance().getSession().createQuery("From News").setMaxResults(ROW_COUNT).list();
		News[] newss = (News[]) lNewsList.toArray(new News[lNewsList.size()]);
		length = Math.min(newss.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(newss[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Users...");
		java.util.List lUsersList = CinemaPersistentManager.instance().getSession().createQuery("From Users").setMaxResults(ROW_COUNT).list();
		Users[] userss = (Users[]) lUsersList.toArray(new Users[lUsersList.size()]);
		length = Math.min(userss.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(userss[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Feedback...");
		java.util.List lFeedbackList = CinemaPersistentManager.instance().getSession().createQuery("From Feedback").setMaxResults(ROW_COUNT).list();
		Feedback[] feedbacks = (Feedback[]) lFeedbackList.toArray(new Feedback[lFeedbackList.size()]);
		length = Math.min(feedbacks.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(feedbacks[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Films...");
		java.util.List lFilmsList = CinemaPersistentManager.instance().getSession().createQuery("From Films").setMaxResults(ROW_COUNT).list();
		Films[] filmss = (Films[]) lFilmsList.toArray(new Films[lFilmsList.size()]);
		length = Math.min(filmss.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(filmss[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Category...");
		java.util.List lCategoryList = CinemaPersistentManager.instance().getSession().createQuery("From Category").setMaxResults(ROW_COUNT).list();
		Category[] categorys = (Category[]) lCategoryList.toArray(new Category[lCategoryList.size()]);
		length = Math.min(categorys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(categorys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Seans...");
		java.util.List lSeansList = CinemaPersistentManager.instance().getSession().createQuery("From Seans").setMaxResults(ROW_COUNT).list();
		Seans[] seanss = (Seans[]) lSeansList.toArray(new Seans[lSeansList.size()]);
		length = Math.min(seanss.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(seanss[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Hall...");
		java.util.List lHallList = CinemaPersistentManager.instance().getSession().createQuery("From Hall").setMaxResults(ROW_COUNT).list();
		Hall[] halls = (Hall[]) lHallList.toArray(new Hall[lHallList.size()]);
		length = Math.min(halls.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(halls[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cinema...");
		java.util.List lCinemaList = CinemaPersistentManager.instance().getSession().createQuery("From Cinema").setMaxResults(ROW_COUNT).list();
		Cinema[] cinemas = (Cinema[]) lCinemaList.toArray(new Cinema[lCinemaList.size()]);
		length = Math.min(cinemas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(cinemas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Reservations...");
		java.util.List lReservationsList = CinemaPersistentManager.instance().getSession().createQuery("From Reservations").setMaxResults(ROW_COUNT).list();
		Reservations[] reservationss = (Reservations[]) lReservationsList.toArray(new Reservations[lReservationsList.size()]);
		length = Math.min(reservationss.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(reservationss[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public static void main(String[] args) {
		try {
			ListCinemaData listCinemaData = new ListCinemaData();
			try {
				listCinemaData.listTestData();
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
