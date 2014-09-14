package mk.ukim.finki.ki.pf.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import mk.ukim.finki.ki.pf.util.CustomLocalDateSerializer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name = "physicians")
public class Physician extends BaseEntity{
	
	private String firstName;
	
	private String lastName;
	
	private boolean gender;
	
	private String location;
	
	@JsonSerialize(using = CustomLocalDateSerializer.class)
	private Date date;
	
	@OneToMany(mappedBy="physician", fetch=FetchType.EAGER)
	@JsonIgnore
	private List<PhysicianUniversity> universities;
	
	@OneToMany(mappedBy="physician", fetch=FetchType.EAGER)
	@JsonIgnore
	private List<PhysicianSpecialty> specialties;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	@JsonProperty
	public List<String> getUniversities() {
		List<String> result = new ArrayList<String>();
		for(PhysicianUniversity pu : universities) {
			result.add(pu.getUniversity().getName());
		}
		return result;
	}
	
	@JsonProperty
	public List<String> getSpecialties() {
		List<String> result = new ArrayList<String>();
		for(PhysicianSpecialty ps : specialties) {
			result.add(ps.getSpecialty().getName());
		}
		return result;
	}
	
}
