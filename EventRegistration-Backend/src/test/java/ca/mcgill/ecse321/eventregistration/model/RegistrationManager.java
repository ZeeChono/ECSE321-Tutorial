package ca.mcgill.ecse321.eventregistration.model;

import java.util.*;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.Entity;

@Entity 
public class RegistrationManager
{

  private List<Person> participants;
  
  @OneToMany(cascade = {CascadeType.ALL})
  public List<Person> getParticipants()
  {
    return this.participants;
  }
  
  public void setParticipant(List<Person> persons) {
	  this.participants = persons;
  }
  
  
  private List<Registration> registrations;
  
  @OneToMany(cascade = {CascadeType.ALL})
  public List<Registration> getRegistrations()
  {
    return this.registrations;
  }
  
  public void setRegistrations(List<Registration> registrations) {
	  this.registrations = registrations;
  }
  
  
  private List<Event> events;
  
  @OneToMany(cascade = {CascadeType.ALL})
  public List<Event> getEvents()
  {
    return this.events;
  }

  public void setEvents(List<Event> events) {
	  this.events = events;
  }

 

  public Person getParticipant(int index)
  {
    Person aParticipant = participants.get(index);
    return aParticipant;
  }
}