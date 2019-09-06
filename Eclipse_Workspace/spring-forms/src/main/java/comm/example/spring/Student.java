package comm.example.spring;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName,lastName,country;
	private LinkedHashMap<String,String> countryOptions=null;
	private String favLang;
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getFavLang() {
		return favLang;
	}

	public void setFavLang(String favLang) {
		this.favLang = favLang;
	}

	public Student() {
		countryOptions=new LinkedHashMap<>();
		countryOptions.put("IN","India");
		countryOptions.put("USA","America");
		countryOptions.put("Au","Australia");
		countryOptions.put("Eu","Europe");
		countryOptions.put("BR","Brazil");
	}

	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

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
	
	
	

}
