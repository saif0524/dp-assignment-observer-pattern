package observer.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Subject {
	
	List <AbstractPerson>listOfPeople = new ArrayList<AbstractPerson>();
	
	boolean ticketAvailable = false;
	
//	boolean[] ticketAvailavility;
	
	
	void registerPeople(AbstractPerson interestedPerson){
		listOfPeople.add(interestedPerson);
	}
	
	
	
	void unRegisterPeople(AbstractPerson interestedPerson){
		
		for (Iterator<AbstractPerson> iter = listOfPeople.listIterator(); iter.hasNext(); ) {
		    AbstractPerson a = iter.next();
		    if (a==interestedPerson) {
		        iter.remove();
		    }
		}
		
		setTicketAvailability(false);
		System.out.println(interestedPerson.personName + " unregisterd");
	
	}
	
	
	void setTicketAvailability(boolean ticketAvailablity){
		this.ticketAvailable=ticketAvailablity;
	}
	
	
	void sendNotification(AbstractPerson interestedPerson){
		if(ticketAvailable){
			interestedPerson.getNotification();
		}
		
		else{
			System.out.println("Ticket not available for " + interestedPerson.personName);
		}
	}
}
