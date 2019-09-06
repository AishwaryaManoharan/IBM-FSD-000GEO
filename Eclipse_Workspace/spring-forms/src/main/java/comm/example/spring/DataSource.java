package comm.example.spring;


import javax.annotation.PostConstruct;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.stereotype.Component;

@Component
public class DataSource extends BasicDataSource {
	
	@PostConstruct
	public void DataSourceCreate() {
		setUrl("jdbc:mysql://localhost:3306/aish");
		setUsername("root");
		setPassword("Aishwarya*17");
		setDriverClassName("com.mysql.jdbc.Driver");
	}
	
	public DataSource() {
		super();
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
}