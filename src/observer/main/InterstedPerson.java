package observer.main;



// Observer Class
public class InterstedPerson extends AbstractPerson{
	
	public InterstedPerson(String personName) {
		this.personName=personName;
	}
	
	@Override
	void getNotification() {
		System.out.println(personName + " got Notification via email....");
	}

}
