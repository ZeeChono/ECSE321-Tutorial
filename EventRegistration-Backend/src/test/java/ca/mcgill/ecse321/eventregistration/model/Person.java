package ca.mcgill.ecse321.eventregistration.model;

import java.util.*;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person
{

  private String name;
  
  // save the name as primary key and you put on getter methods
  @Id
  public String getName()
  {
    return name;
  }
  
  
  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }
}