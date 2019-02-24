/*
package com.maz.eventCalender.DAO;

import com.maz.eventCalender.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class EventDao {


    JdbcTemplate template;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        template = new JdbcTemplate(dataSource);
    }

    public List<Event> findByEmail(int id) {

      return template.query("select * from student where ID="+id,new ResultSetExtractor<Student>()

    {

        public List<Event> extractData (ResultSet rs) throws SQLException,
                DataAccessException {

        Event e = new Event();
        while (rs.next()) {

            */
/*e.setId(rs.getInt(1));
            e.setFirstName(rs.getString(2));
            e.setLastName(rs.getString(3));
            e.setSex(rs.getString(4));
            e.setDob(rs.getDate(5));
            e.setEmail(rs.getString(6));
            e.setSection(rs.getString(7));
            e.setCountry(rs.getString(8));
            e.setFirstAttempt(rs.getBoolean(9));
            e.setSubjects(convertDelimitedStringToList(rs.getString(10)));*//*
 */
/**//*

        }
        return rs;
    }
    });

}


*/
