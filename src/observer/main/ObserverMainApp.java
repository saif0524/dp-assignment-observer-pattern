package observer.main;

public class ObserverMainApp {

	public static void main(String[] args) {
		
		Subject subject = new Subject();
		
		
		
		AbstractPerson saif0002 = new InterstedPerson("Saif0002");
		
		subject.registerPeople(saif0002);
		subject.setTicketAvailability(true);
		subject.sendNotification(saif0002);
		
		
		AbstractPerson saif0001 = new InterstedPerson("Saif001");
		
		subject.registerPeople(saif0001);
		subject.setTicketAvailability(true);
		subject.sendNotification(saif0001);
	
		
		subject.unRegisterPeople(saif0001);
		
		
		
	}

}
