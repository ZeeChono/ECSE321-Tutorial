package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;
import java.util.*;
import javax.persistence.ManyToOne;
import javax.persistence.Id;

public class Registration
{
  private Person participant;
  
  @ManyToOne
  private Person getPersons(){
	  return this.participant;
  }
  
  public void setParticipants(Person person) {
	  this.participant = person;
  }
  
  private Event event;
  
  @ManyToOne
  private Event getEvents(){
	  return this.event;
  }
  
  public void setEvents(Event event) {
	  this.event = event;
  }
  
  private Integer id;
  
  public void setId(Integer value) {
	  this.id = value;
  }
  
  @Id
  public Integer getId() {
	  return this.id;
  }
}