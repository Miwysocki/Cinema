/**
 * Licensee: 
 * License Type: Evaluation
 */
import org.orm.*;
public class CreateCinemaDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(CinemaPersistentManager.instance());
			CinemaPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
