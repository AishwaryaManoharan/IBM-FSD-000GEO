package comm.example.spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import comm.example.spring.Student;


public class TheRowMapper implements RowMapper<String>
{
@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException 
{
	Student st=new Student();
	st.setFirstName(rs.getString("fname"));
	st.setLastName(rs.getString("lname"));
	st.setCountry(rs.getString("country"));
	st.setFavLang(rs.getString("favLang"));
	st.setOs(rs.getString("os"));
	return st;
}
}
