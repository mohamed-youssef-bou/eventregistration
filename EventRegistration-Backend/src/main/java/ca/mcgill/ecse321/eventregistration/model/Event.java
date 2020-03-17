package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;
import java.util.Set;
import javax.persistence.OneToMany;

@Entity
public class Event {
	private String name;
	
	public void setName(String value) {
		this.name = value;
	}

	@Id
	public String getName() {
		return this.name;
	}

	private Date date;

	public void setDate(Date value) {
		this.date = value;
	}

	public Date getDate() {
		return this.date;
	}

	private Time startTime;

	public void setStartTime(Time value) {
		this.startTime = value;
	}

	public Time getStartTime() {
		return this.startTime;
	}

	private Time endTime;

	public void setEndTime(Time value) {
		this.endTime = value;
	}

	public Time getEndTime() {
		return this.endTime;
	}

	private Set<Registration> registration;

	@OneToMany(mappedBy = "event")
	public Set<Registration> getRegistration() {
		return this.registration;
	}

	public void setRegistration(Set<Registration> registrations) {
		this.registration = registrations;
	}

}
